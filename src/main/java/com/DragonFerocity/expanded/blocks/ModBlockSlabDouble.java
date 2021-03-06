package com.DragonFerocity.expanded.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlockSlabDouble extends ModBlockSlab {

  public ModBlockSlabDouble(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
    super(mat, name, tab, hardness, resistance, harvest, tool);
  }

  @Override
  public boolean isDouble() {
    return true;
  }

}
