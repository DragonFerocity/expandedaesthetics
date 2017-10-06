package com.DragonFerocity.expanded.items;

import com.DragonFerocity.expanded.Ref;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.IPlantable;

public class ModItemSeeds extends ItemSeeds implements IPlantable {
  public ModItemSeeds(Block crops, Block soil, String name)
  {
      super(crops, soil);
      this.setCreativeTab(CreativeTabs.MISC);
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
  }
}