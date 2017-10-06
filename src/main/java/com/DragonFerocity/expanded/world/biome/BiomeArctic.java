package com.DragonFerocity.expanded.world.biome;

import java.util.List;
import java.util.Random;

import com.DragonFerocity.expanded.handlers.BlockHandler;
import com.google.common.collect.Lists;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.util.ObjectIntIdentityMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeEnd;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.biome.BiomeOcean;
import net.minecraft.world.biome.BiomeRiver;
import net.minecraft.world.biome.BiomeSnow;
import net.minecraft.world.biome.BiomeTaiga;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenDoublePlant;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeArctic extends Biome {
  protected static final IBlockState STONE = BlockHandler.snowStone.getDefaultState();
  protected static final IBlockState AIR = Blocks.AIR.getDefaultState();
  protected static final IBlockState BEDROCK = Blocks.BEDROCK.getDefaultState();
  protected static final IBlockState GRAVEL = BlockHandler.snowStoneBrick.getDefaultState();
  protected static final IBlockState RED_SANDSTONE = Blocks.ICE.getDefaultState();
  protected static final IBlockState SANDSTONE = Blocks.SNOW.getDefaultState();
  protected static final IBlockState ICE = Blocks.ICE.getDefaultState();
  protected static final IBlockState WATER = Blocks.ICE.getDefaultState();
  public static final ObjectIntIdentityMap<Biome> MUTATION_TO_BASE_ID_MAP = new ObjectIntIdentityMap<Biome>();
  protected static final NoiseGeneratorPerlin TEMPERATURE_NOISE = new NoiseGeneratorPerlin(new Random(1234L), 1);
  protected static final NoiseGeneratorPerlin GRASS_COLOR_NOISE = new NoiseGeneratorPerlin(new Random(2345L), 1);
  protected static final WorldGenDoublePlant DOUBLE_PLANT_GENERATOR = new WorldGenDoublePlant();
  /** The block expected to be on the top of this biome */
  public IBlockState topBlock = Blocks.SNOW.getDefaultState();
  /** The block to fill spots in when not on the top */
  public IBlockState fillerBlock = Blocks.SNOW.getDefaultState();
  /** The biome decorator. */
  public BiomeDecorator decorator;
  /** Holds the classes of IMobs (hostile mobs) that can be spawned in the biome. */
  protected List<Biome.SpawnListEntry> spawnableMonsterList = Lists.<Biome.SpawnListEntry>newArrayList();
  /** Holds the classes of any creature that can be spawned in the biome as friendly creature. */
  protected List<Biome.SpawnListEntry> spawnableCreatureList = Lists.<Biome.SpawnListEntry>newArrayList();
  /** Holds the classes of any aquatic creature that can be spawned in the water of the biome. */
  protected List<Biome.SpawnListEntry> spawnableWaterCreatureList = Lists.<Biome.SpawnListEntry>newArrayList();
  protected List<Biome.SpawnListEntry> spawnableCaveCreatureList = Lists.<Biome.SpawnListEntry>newArrayList();
  // Forge: Stores the spawnable lists for non-vanilla EnumCreatureTypes. Can't be an EnumMap as that doesn't handle new enum values being added after it's created.
  protected java.util.Map<EnumCreatureType, List<Biome.SpawnListEntry>> modSpawnableLists = com.google.common.collect.Maps.newHashMap();

  public BiomeArctic(Biome.BiomeProperties properties)
  {
      super(properties);
      this.decorator = this.createBiomeDecorator();
      this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySpider.class, 100, 4, 4));
      this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombie.class, 95, 4, 4));
      this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySkeleton.class, 100, 4, 4));
      this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityCreeper.class, 100, 4, 4));
      this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySlime.class, 100, 4, 4));
      this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEnderman.class, 10, 1, 4));
      this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityWitch.class, 5, 1, 1));
  }

  /**
   * Allocate a new BiomeDecorator for this BiomeGenBase
   */
  @Override
  public BiomeDecorator createBiomeDecorator()
  {
      return getModdedBiomeDecorator(new BiomeArcticDecorator());
  }
  @Override
  public WorldGenAbstractTree getRandomTreeFeature(Random rand)
  {
      return (WorldGenAbstractTree)(rand.nextInt(10) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE);
  }

  /**
   * Gets a WorldGen appropriate for this biome.
   */
  @Override
  public WorldGenerator getRandomWorldGenForGrass(Random rand)
  {
      return null; //new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
  }
  @Override
  public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
  {
      return null; //rand.nextInt(3) > 0 ? BlockFlower.EnumFlowerType.DANDELION : BlockFlower.EnumFlowerType.POPPY;
  }

  /**
   * takes temperature, returns color
   */
  @SideOnly(Side.CLIENT)
  @Override
  public int getSkyColorByTemp(float currentTemperature)
  {
      currentTemperature = currentTemperature / 3.0F;
      currentTemperature = MathHelper.clamp(currentTemperature, -1.0F, 1.0F);
      return MathHelper.hsvToRGB(0.62222224F - currentTemperature * 0.05F, 0.5F + currentTemperature * 0.1F, 1.0F);
  }

  /**
   * Returns the correspondent list of the EnumCreatureType informed.
   */
  @Override
  public List<Biome.SpawnListEntry> getSpawnableList(EnumCreatureType creatureType)
  {
      switch (creatureType)
      {
          case MONSTER:
              return this.spawnableMonsterList;
          case CREATURE:
              return this.spawnableCreatureList;
          case WATER_CREATURE:
              return this.spawnableWaterCreatureList;
          case AMBIENT:
              return this.spawnableCaveCreatureList;
          default:
              // Forge: Return a non-empty list for non-vanilla EnumCreatureTypes
              if (!this.modSpawnableLists.containsKey(creatureType)) this.modSpawnableLists.put(creatureType, Lists.<Biome.SpawnListEntry>newArrayList());
              return this.modSpawnableLists.get(creatureType);
      }
  }

  /**
   * Returns true if the biome have snowfall instead a normal rain.
   */
  @Override
  public boolean getEnableSnow()
  {
      return true;
  }

  /**
   * Check if rain can occur in biome
   */
  @Override
  public boolean canRain()
  {
      return false;
  }

  /**
   * returns the chance a creature has to spawn.
   */
  @Override
  public float getSpawningChance()
  {
      return 0.3F;
  }
  @Override
  public void decorate(World worldIn, Random rand, BlockPos pos)
  {
      this.decorator.decorate(worldIn, rand, this, pos);
  }
  @Override
  public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
  {
      this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
  }

  /*@SideOnly(Side.CLIENT)
  @Override
  public int getGrassColorAtPos(BlockPos pos)
  {
      double d0 = (double)MathHelper.clamp(this.getFloatTemperature(pos), 0.0F, 1.0F);
      double d1 = (double)MathHelper.clamp(this.getRainfall(), 0.0F, 1.0F);
      return getModdedBiomeGrassColor(ColorizerGrass.getGrassColor(d0, d1));
  }*/
  @Override
  public Class <? extends Biome > getBiomeClass()
  {
      return this.getClass();
  }
  /*@Override
  public Biome.TempCategory getTempCategory()
  {
      if ((double)this.getTemperature() < 0.4D)
      {
          return Biome.TempCategory.COLD;
      }
      else
      {
          return (double)this.getTemperature() < 1.0D ? Biome.TempCategory.MEDIUM : Biome.TempCategory.WARM;
      }
  }*/
  /**
   * Registers all of the vanilla biomes.
   */
  public static void registerBiomes()
  {
      registerBiome(0, "ocean", new BiomeOcean((new Biome.BiomeProperties("Ocean")).setBaseHeight(-1.0F).setHeightVariation(0.1F)));
      registerBiome(5, "taiga", new BiomeTaiga(BiomeTaiga.Type.NORMAL, (new Biome.BiomeProperties("Taiga")).setBaseHeight(0.2F).setHeightVariation(0.2F).setTemperature(0.25F).setRainfall(0.8F)));
      registerBiome(7, "river", new BiomeRiver((new Biome.BiomeProperties("River")).setBaseHeight(-0.5F).setHeightVariation(0.0F)));
      registerBiome(9, "sky", new BiomeEnd((new Biome.BiomeProperties("The End")).setRainDisabled()));
      registerBiome(10, "frozen_ocean", new BiomeOcean((new Biome.BiomeProperties("FrozenOcean")).setBaseHeight(-1.0F).setHeightVariation(0.1F).setTemperature(0.0F).setRainfall(0.5F).setSnowEnabled()));
      registerBiome(11, "frozen_river", new BiomeRiver((new Biome.BiomeProperties("FrozenRiver")).setBaseHeight(-0.5F).setHeightVariation(0.0F).setTemperature(0.0F).setRainfall(0.5F).setSnowEnabled()));
      registerBiome(12, "ice_flats", new BiomeSnow(false, (new Biome.BiomeProperties("Ice Plains")).setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.0F).setRainfall(0.5F).setSnowEnabled()));
      registerBiome(13, "ice_mountains", new BiomeSnow(false, (new Biome.BiomeProperties("Ice Mountains")).setBaseHeight(0.45F).setHeightVariation(0.3F).setTemperature(0.0F).setRainfall(0.5F).setSnowEnabled()));
      registerBiome(19, "taiga_hills", new BiomeTaiga(BiomeTaiga.Type.NORMAL, (new Biome.BiomeProperties("TaigaHills")).setTemperature(0.25F).setRainfall(0.8F).setBaseHeight(0.45F).setHeightVariation(0.3F)));
      registerBiome(30, "taiga_cold", new BiomeTaiga(BiomeTaiga.Type.NORMAL, (new Biome.BiomeProperties("Cold Taiga")).setBaseHeight(0.2F).setHeightVariation(0.2F).setTemperature(-0.5F).setRainfall(0.4F).setSnowEnabled()));
      registerBiome(31, "taiga_cold_hills", new BiomeTaiga(BiomeTaiga.Type.NORMAL, (new Biome.BiomeProperties("Cold Taiga Hills")).setBaseHeight(0.45F).setHeightVariation(0.3F).setTemperature(-0.5F).setRainfall(0.4F).setSnowEnabled()));
      registerBiome(32, "redwood_taiga", new BiomeTaiga(BiomeTaiga.Type.MEGA, (new Biome.BiomeProperties("Mega Taiga")).setTemperature(0.3F).setRainfall(0.8F).setBaseHeight(0.2F).setHeightVariation(0.2F)));
      registerBiome(33, "redwood_taiga_hills", new BiomeTaiga(BiomeTaiga.Type.MEGA, (new Biome.BiomeProperties("Mega Taiga Hills")).setBaseHeight(0.45F).setHeightVariation(0.3F).setTemperature(0.3F).setRainfall(0.8F)));
      registerBiome(34, "extreme_hills_with_trees", new BiomeHills(BiomeHills.Type.EXTRA_TREES, (new Biome.BiomeProperties("Extreme Hills+")).setBaseHeight(1.0F).setHeightVariation(0.5F).setTemperature(0.2F).setRainfall(0.3F)));
  }
}
