package com.DragonFerocity.expanded.blocks;

import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class BlockTutBlock extends ModBlock {
  public BlockTutBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
    super(mat, name, tab, hardness, resistance, harvest, tool);
  }
}