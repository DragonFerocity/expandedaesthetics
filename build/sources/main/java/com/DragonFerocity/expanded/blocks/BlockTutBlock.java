package com.DragonFerocity.expanded.blocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class BlockTutBlock extends ModBlock {
  public BlockTutBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
    super(mat, name, tab, hardness, resistance, harvest, tool);
  }

  /*public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    return ItemHandler.tutItem;
  }

  public int quantityDropped(IBlockState state, int fortune, Random random) {
    return 1;
  }*/
}