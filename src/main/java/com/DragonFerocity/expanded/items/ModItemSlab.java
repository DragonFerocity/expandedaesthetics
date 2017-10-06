package com.DragonFerocity.expanded.items;

import com.DragonFerocity.expanded.Ref;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSlab;

public class ModItemSlab extends ItemSlab {
  public ModItemSlab(Block block, BlockSlab singleSlab, BlockSlab doubleSlab, String name)
  {
      super(block, singleSlab, doubleSlab);
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
      setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
      setMaxStackSize(64);
  }
}
