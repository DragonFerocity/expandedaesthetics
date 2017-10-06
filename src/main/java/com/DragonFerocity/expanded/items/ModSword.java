package com.DragonFerocity.expanded.items;

import com.DragonFerocity.expanded.Ref;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;

public class ModSword extends ItemSword {

  public ModSword(String name, ItemTool.ToolMaterial material)
  {
      super(material);
      this.maxStackSize = 1;
      this.setMaxDamage(material.getMaxUses());
      this.setCreativeTab(CreativeTabs.COMBAT);
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
  }
}
