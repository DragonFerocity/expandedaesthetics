package com.DragonFerocity.expanded.world.biome;

import net.minecraft.block.state.IBlockState;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DeferredBiomeDecorator;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.Event.HasResult;

public class BiomeArcticEvent extends Event {
  private final BiomeArctic biome;

  public BiomeArcticEvent(BiomeArctic biome)
  {
      this.biome = biome;
  }

  public BiomeArctic getBiome()
  {
      return biome;
  }

  /**
   * CreateDecorator is fired when a BiomeDecorator is created.<br>
   * This event is fired whenever a BiomeDecorator is created in
   * {@link DeferredBiomeDecorator#fireCreateEventAndReplace(Biome)}.<br>
   * <br>
   * {@link #originalBiomeDecorator} contains the original BiomeDecorator that would be used in vanilla.
   * {@link #newBiomeDecorator} contains the new BiomeDecoration to be used by Minecraft.
   * <br>
   * This event is not {@link Cancelable}.
   * <br>
   * This event does not have a result. {@link HasResult}
   * <br>
   * This event is fired on the {@link MinecraftForge#TERRAIN_GEN_BUS}.
   **/
  public static class CreateDecorator extends BiomeArcticEvent
  {
      private final BiomeArcticDecorator originalBiomeDecorator;
      private BiomeArcticDecorator newBiomeDecorator;

      public CreateDecorator(BiomeArctic biome, BiomeArcticDecorator original)
      {
          super(biome);
          originalBiomeDecorator = original;
          setNewBiomeDecorator(original);
      }

      public BiomeArcticDecorator getOriginalBiomeDecorator()
      {
          return originalBiomeDecorator;
      }

      public BiomeArcticDecorator getNewBiomeDecorator()
      {
          return newBiomeDecorator;
      }

      public void setNewBiomeDecorator(BiomeArcticDecorator newBiomeDecorator)
      {
          this.newBiomeDecorator = newBiomeDecorator;
      }
  }

  /**
   * BiomeColor is fired whenever an event involving biome colors occurs. <br>
   * If a method utilizes this {@link Event} as its parameter, the method will
   * receive every child event of this class.<br>
   * <br>
   * All children of this event are fired on the {@link MinecraftForge#EVENT_BUS}.
   **/
  public static class BiomeColor extends BiomeArcticEvent
  {
      private final int originalColor;
      private int newColor;

      public BiomeColor(BiomeArctic biome, int original)
      {
          super(biome);
          originalColor = original;
          setNewColor(original);
      }

      public int getOriginalColor()
      {
          return originalColor;
      }

      public int getNewColor()
      {
          return newColor;
      }

      public void setNewColor(int newColor)
      {
          this.newColor = newColor;
      }
  }

  /**
   * This event is fired when the village generator attempts to choose a block ID
   * based on the village's biome.
   *
   * You can cancel the event to override default values
   */
  @HasResult
  public static class GetVillageBlockID extends BiomeArcticEvent
  {
      private final IBlockState original;
      private IBlockState replacement;

      public GetVillageBlockID(BiomeArctic biome, IBlockState original)
      {
          super(biome);
          this.original = original;
      }

      public IBlockState getOriginal()
      {
          return original;
      }

      public IBlockState getReplacement()
      {
          return replacement;
      }

      public void setReplacement(IBlockState replacement)
      {
          this.replacement = replacement;
      }
  }

  /**
   * This event is fired when a biome is queried for its grass color.
   */
  public static class GetGrassColor extends BiomeColor
  {
      public GetGrassColor(BiomeArctic biome, int original)
      {
          super(biome, original);
      }
  }

  /**
   * This event is fired when a biome is queried for its grass color.
   */
  public static class GetFoliageColor extends BiomeColor
  {
      public GetFoliageColor(BiomeArctic biome, int original)
      {
          super(biome, original);
      }
  }

  /**
   * This event is fired when a biome is queried for its water color.
   */
  public static class GetWaterColor extends BiomeColor
  {
      public GetWaterColor(BiomeArctic biome, int original)
      {
          super(biome, original);
      }
  }
}
