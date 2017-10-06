package com.DragonFerocity.expanded.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.DragonFerocity.expanded.Ref;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;

public class ModItem extends Item {
  private float smeltingXp = -1;
  
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
  
  @Override
  public float getSmeltingExperience(ItemStack item)
  {
      return smeltingXp; //-1 will default to the old lookups.
  }
  @Override
  public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
    return false;
  }
}