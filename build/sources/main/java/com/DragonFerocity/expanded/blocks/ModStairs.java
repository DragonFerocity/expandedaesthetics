package com.DragonFerocity.expanded.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.block.state.IBlockState;

public class ModStairs extends BlockStairs {
  
  public ModStairs(Block block, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
    super(block.getDefaultState());
    //setUnlocalizedName(name);
    //setRegistryName(name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
    setHarvestLevel(tool, harvest);
  }

  @Override
  public BlockRenderLayer getBlockLayer()
  {
      return BlockRenderLayer.CUTOUT;
  }
  
  /**
   * Checks if an IBlockState represents a block that is opaque and a full cube.
   */
  @Override
  public boolean isFullyOpaque(IBlockState state)
  {
      return false;
  }
  
  @Override
  public boolean isOpaqueCube(IBlockState state)
  {
      return false;
  }
}
