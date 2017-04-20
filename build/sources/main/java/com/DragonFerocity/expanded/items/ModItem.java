package com.DragonFerocity.expanded.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ModItem extends Item{
  public ModItem(String name, CreativeTabs tab) {
    this(name, tab, 64);
  }

  public ModItem(String name, CreativeTabs tab, int stacksize) {
    //setUnlocalizedName(name);
    //setRegistryName(name);
	//super();
    setCreativeTab(tab);
    setMaxStackSize(stacksize);
  }
}