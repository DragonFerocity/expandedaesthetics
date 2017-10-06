package com.DragonFerocity.expanded.world.biome;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeArcticDecorator extends BiomeDecorator {
  public boolean decorating;
  public BlockPos chunkPos;
  public ChunkGeneratorSettings chunkProviderSettings;
  /** The dirt generator. */
  public WorldGenerator dirtGen;
  /** Field that holds gold WorldGenMinable */
  public WorldGenerator goldGen;
  /** Field that holds Lapis WorldGenMinable */
  public WorldGenerator lapisGen;
  /** The number of trees to attempt to generate per chunk. Up to 10 in forests, none in deserts. */
  public int treesPerChunk;
  public float extraTreeChance = 0.1F;
  /** True if decorator should generate surface lava & water */
  public boolean generateFalls = true;

  public void decorate(World worldIn, Random random, BiomeArctic biome, BlockPos pos)
  {
      if (this.decorating)
      {
          throw new RuntimeException("Already decorating");
      }
      else
      {
          this.chunkProviderSettings = ChunkGeneratorSettings.Factory.jsonToFactory(worldIn.getWorldInfo().getGeneratorOptions()).build();
          this.chunkPos = pos;
          this.dirtGen = new WorldGenMinable(Blocks.DIRT.getDefaultState(), this.chunkProviderSettings.dirtSize);
          this.goldGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), this.chunkProviderSettings.goldSize);
          this.lapisGen = new WorldGenMinable(Blocks.LAPIS_ORE.getDefaultState(), this.chunkProviderSettings.lapisSize);
          this.genDecorations(biome, worldIn, random);
          this.decorating = false;
      }
  }

  protected void genDecorations(BiomeArctic biomeIn, World worldIn, Random random)
  {
      net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new net.minecraftforge.event.terraingen.DecorateBiomeEvent.Pre(worldIn, random, chunkPos));
      this.generateOres(worldIn, random);

      int k1 = this.treesPerChunk;

      if (random.nextFloat() < this.extraTreeChance)
      {
          ++k1;
      }

      if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, chunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE))
      for (int j2 = 0; j2 < k1; ++j2)
      {
          int k6 = random.nextInt(16) + 8;
          int l = random.nextInt(16) + 8;
          WorldGenAbstractTree worldgenabstracttree = biomeIn.getRandomTreeFeature(random);
          worldgenabstracttree.setDecorationDefaults();
          BlockPos blockpos = worldIn.getHeight(this.chunkPos.add(k6, 0, l));

          if (worldgenabstracttree.generate(worldIn, random, blockpos))
          {
              worldgenabstracttree.generateSaplings(worldIn, random, blockpos);
          }
      }

      if (this.generateFalls)
      {
          if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, chunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LAKE_WATER))
          for (int k5 = 0; k5 < 50; ++k5)
          {
              int i10 = random.nextInt(16) + 8;
              int l13 = random.nextInt(16) + 8;
              int i17 = random.nextInt(248) + 8;

              if (i17 > 0)
              {
                  int k19 = random.nextInt(i17);
                  BlockPos blockpos6 = this.chunkPos.add(i10, k19, l13);
                  (new WorldGenLiquids(Blocks.ICE)).generate(worldIn, random, blockpos6);
              }
          }
      }
      net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new net.minecraftforge.event.terraingen.DecorateBiomeEvent.Post(worldIn, random, chunkPos));
  }

  /**
   * Generates ores in the current chunk
   */
  protected void generateOres(World worldIn, Random random)
  {
      net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, random, chunkPos));
      if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, random, dirtGen, chunkPos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIRT))
      this.genStandardOre1(worldIn, random, this.chunkProviderSettings.dirtCount, this.dirtGen, this.chunkProviderSettings.dirtMinHeight, this.chunkProviderSettings.dirtMaxHeight);
      if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, random, goldGen, chunkPos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GOLD))
      this.genStandardOre1(worldIn, random, this.chunkProviderSettings.goldCount, this.goldGen, this.chunkProviderSettings.goldMinHeight, this.chunkProviderSettings.goldMaxHeight);
      if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, random, lapisGen, chunkPos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.LAPIS))
      this.genStandardOre2(worldIn, random, this.chunkProviderSettings.lapisCount, this.lapisGen, this.chunkProviderSettings.lapisCenterHeight, this.chunkProviderSettings.lapisSpread);
      net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, random, chunkPos));
  }

  /**
   * Standard ore generation helper. Vanilla uses this to generate most ores.
   * The main difference between this and {@link #genStandardOre2} is that this takes min and max heights, while
   * genStandardOre2 takes center and spread.
   */
  protected void genStandardOre1(World worldIn, Random random, int blockCount, WorldGenerator generator, int minHeight, int maxHeight)
  {
      if (maxHeight < minHeight)
      {
          int i = minHeight;
          minHeight = maxHeight;
          maxHeight = i;
      }
      else if (maxHeight == minHeight)
      {
          if (minHeight < 255)
          {
              ++maxHeight;
          }
          else
          {
              --minHeight;
          }
      }

      for (int j = 0; j < blockCount; ++j)
      {
          BlockPos blockpos = this.chunkPos.add(random.nextInt(16), random.nextInt(maxHeight - minHeight) + minHeight, random.nextInt(16));
          generator.generate(worldIn, random, blockpos);
      }
  }

  /**
   * Standard ore generation helper. Vanilla uses this to generate Lapis Lazuli.
   * The main difference between this and {@link #genStandardOre1} is that this takes takes center and spread, while
   * genStandardOre1 takes min and max heights.
   */
  protected void genStandardOre2(World worldIn, Random random, int blockCount, WorldGenerator generator, int centerHeight, int spread)
  {
      for (int i = 0; i < blockCount; ++i)
      {
          BlockPos blockpos = this.chunkPos.add(random.nextInt(16), random.nextInt(spread) + random.nextInt(spread) + centerHeight - spread, random.nextInt(16));
          generator.generate(worldIn, random, blockpos);
      }
  }
}
