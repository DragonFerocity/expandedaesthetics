package com.DragonFerocity.expanded.blocks;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class ModBlock extends Block {
  public ModBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
    super(mat);
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
    setHarvestLevel(tool, harvest);
  }
 
  public ModBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance) {
    super(mat);
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
  }
}