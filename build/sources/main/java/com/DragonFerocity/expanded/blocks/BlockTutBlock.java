package com.DragonFerocity.expanded.blocks;

import java.util.Random;

import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

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