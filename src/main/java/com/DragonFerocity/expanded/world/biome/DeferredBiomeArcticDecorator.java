package com.DragonFerocity.expanded.world.biome;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class DeferredBiomeArcticDecorator extends BiomeArcticDecorator {
  private BiomeArcticDecorator wrapped;

  public DeferredBiomeArcticDecorator(BiomeArcticDecorator wrappedOriginal)
  {
      this.wrapped = wrappedOriginal;
  }

  @Override
  public void decorate(World par1World, Random par2Random, BiomeArctic biome, BlockPos pos)
  {
      fireCreateEventAndReplace(biome);
      // On first call to decorate, we fire and substitute ourselves, if we haven't already done so
      biome.decorator.decorate(par1World, par2Random, biome, pos);
  }
  public void fireCreateEventAndReplace(BiomeArctic biome)
  {
      // Copy any configuration from us to the real instance.
      wrapped.generateFalls = generateFalls;
      wrapped.treesPerChunk = treesPerChunk;

      BiomeArcticEvent.CreateDecorator event = new BiomeArcticEvent.CreateDecorator(biome, wrapped);
      MinecraftForge.TERRAIN_GEN_BUS.post(event);
      biome.decorator = event.getNewBiomeDecorator();
  }
}
