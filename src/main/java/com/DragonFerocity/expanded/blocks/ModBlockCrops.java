package com.DragonFerocity.expanded.blocks;

import java.util.Random;

import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.handlers.BlockHandler;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModBlockCrops extends BlockCrops {
  
  public ModBlockCrops(String name)
  {
      super();
      this.setDefaultState(this.blockState.getBaseState().withProperty(this.getAgeProperty(), Integer.valueOf(0)));
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
  }
  
  protected Item getSeed()
  {
    Item seed = null;
    if (this == BlockHandler.strawberry)
      seed = BlockHandler.iStrawberrySeed;
    else if (this == BlockHandler.blueberry)
      seed = BlockHandler.iBlueberrySeed;
    else if (this == BlockHandler.bellPepper)
      seed = BlockHandler.iBellPepperSeed;
    
    return seed;
  }

  protected Item getCrop()
  {
    Item crop = null;
    if (this == BlockHandler.strawberry)
      crop = BlockHandler.iStrawberry;
    else if (this == BlockHandler.blueberry)
      crop = BlockHandler.iBlueberry;
    else if (this == BlockHandler.bellPepper) {
      int num = RANDOM.nextInt(3);
      if (num == 0)
        crop = BlockHandler.iBellPepperGreen;
      else if (num == 1)
        crop = BlockHandler.iBellPepperYellow;
      else if (num == 2)
        crop = BlockHandler.iBellPepperOrange;
      else
        crop = BlockHandler.iBellPepperRed;
    }
    
    return crop;
  }
  
  @Override
  public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
  {
      super.getDrops(drops, world, pos, state, 0);
      int age = getAge(state);
      Random rand = world instanceof World ? ((World)world).rand : new Random();
      
      if (age >= getMaxAge())
      {
          int k = 0;
          
          if (this == BlockHandler.strawberry) {
            k = 3;
            if (RANDOM.nextInt(30) == 0)
              drops.add(new ItemStack(BlockHandler.iBlueStrawberry));
          }
          else if (this == BlockHandler.blueberry) {
            k = 2;
            if (RANDOM.nextInt(50) == 0)
              drops.add(new ItemStack(BlockHandler.iGreenBlueberry));
          }
          else if (this == BlockHandler.bellPepper) {
            k = 0;
            int y = RANDOM.nextInt(2) + 1;
            for (int j = 0; j < y; j++) {
              int num = RANDOM.nextInt(3);
              if (num == 0)
                drops.add(new ItemStack(BlockHandler.iBellPepperGreen));
              else if (num == 1)
                drops.add(new ItemStack(BlockHandler.iBellPepperYellow));
              else if (num == 2)
                drops.add(new ItemStack(BlockHandler.iBellPepperOrange));
              else
                drops.add(new ItemStack(BlockHandler.iBellPepperRed));
            }
            if (RANDOM.nextInt(15) == 0)
              drops.add(new ItemStack(BlockHandler.iCayennePepper));
            if (RANDOM.nextInt(40) == 0)
              drops.add(new ItemStack(BlockHandler.iJalapenoPepper));
            if (RANDOM.nextInt(80) == 0)
              drops.add(new ItemStack(BlockHandler.iGhostPepper));
          }

          for (int i = 0; i < k; ++i)
          {
              if (rand.nextInt(2 * getMaxAge()) <= age)
              {
                  drops.add(new ItemStack(this.getCrop(), 1, 0));
              }
          }
      }
  }
}
