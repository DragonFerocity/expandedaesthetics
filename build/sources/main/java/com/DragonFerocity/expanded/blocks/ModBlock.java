package com.DragonFerocity.expanded.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockFire;

public class ModBlock extends Block {
  public ModBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
    super(mat);
    //setUnlocalizedName(name);
    //setRegistryName(name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
    setHarvestLevel(tool, harvest);
  }

  public ModBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool, int encouragement, int flamability) {
    super(mat);
    //setUnlocalizedName(name);
    //setRegistryName(name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
    setHarvestLevel(tool, harvest);
    //BlockFire.setFireInfo(this, encouragement, flamability);
  }

  public ModBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool, float light) {
    super(mat);
    //setUnlocalizedName(name);
    //setRegistryName(name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
    setHarvestLevel(tool, harvest);
    setLightLevel(light);
  }

  public ModBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool, float light, int encouragement, int flamability) {
    super(mat);
    //setUnlocalizedName(name);
    //setRegistryName(name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
    setHarvestLevel(tool, harvest);
    setLightLevel(light);
    //BlockFire.setFireInfo(this, encouragement, flamability);
  }
 
  public ModBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance) {
    super(mat);
    //setUnlocalizedName(name);
    //setRegistryName(name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
  }
}