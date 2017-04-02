package com.DragonFerocity.expanded.items;

import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class ModItem extends Item{
  public ModItem(String name, CreativeTabs tab) {
    //setUnlocalizedName(name);
    //setRegistryName(name);
    setCreativeTab(tab);
  }

  public ModItem(String name, CreativeTabs tab, int stacksize) {
    //setUnlocalizedName(name);
    //setRegistryName(name);
    setCreativeTab(tab);
    setMaxStackSize(stacksize);
  }
}