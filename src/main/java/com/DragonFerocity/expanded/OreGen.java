package com.DragonFerocity.expanded;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.DragonFerocity.expanded.handlers.BlockHandler;

public class OreGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0: //Overworld
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case -1: //Nether
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1: //End
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
	}
	
	private void generateSurface(World world, Random random, int x, int z) {
	  generateOre(BlockHandler.copperOre,    world, random, x, z, 5, 15, 60, 1, 120, Blocks.STONE);
	  generateOre(BlockHandler.tinOre,       world, random, x, z, 3,  7, 56, 1, 120, Blocks.STONE);
		generateOre(BlockHandler.platinumOre,  world, random, x, z, 2,  5,  8, 1, 30, Blocks.STONE);
		generateOre(BlockHandler.silverOre,    world, random, x, z, 3,  7, 30, 1, 50, Blocks.STONE);
		generateOre(BlockHandler.mithrilOre,   world, random, x, z, 2,  9, 12, 1, 35, Blocks.STONE);
		generateOre(BlockHandler.titaniumOre,  world, random, x, z, 3,  5, 20, 1, 18, Blocks.STONE);
	}
	
	private void generateNether(World world, Random random, int x, int z) {
		
	}
	
	private void generateEnd(World world, Random random, int x, int z) {
		
	}
	
	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chancesToSpawn, 
			int minY, int maxY, Block generateIn) {
		
		int heightRange = maxY - minY;
		int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
		for (int k = 0; k < chancesToSpawn; k++) {
			int xrand = random.nextInt(16);
			int yrand = random.nextInt(heightRange) + minY;
			int zrand = random.nextInt(16);
			new WorldGenMinable(block.getDefaultState(), veinSize).generate(world, random, new BlockPos(chunkX + xrand, yrand, chunkZ + zrand));
		}
	}

}
