package com.DragonFerocity.expanded.items;

import net.minecraft.item.Item;

import com.DragonFerocity.expanded.Ref;

import net.minecraft.creativetab.CreativeTabs;

public class ModItem extends Item {
  public ModItem(String name, CreativeTabs tab) {
    this(name, tab, 64);
  }

  public ModItem(String name, CreativeTabs tab, int stacksize) {
    setUnlocalizedName(Ref.MODID + ":" + name);
    setRegistryName(Ref.MODID + ":" + name);
    //super();
    setCreativeTab(tab);
    setMaxStackSize(stacksize);
  }
}