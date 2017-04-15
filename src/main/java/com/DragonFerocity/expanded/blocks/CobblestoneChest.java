package com.DragonFerocity.expanded.blocks;

import net.minecraft.block.material.Material;

public class CobblestoneChest extends ModChest {
  public CobblestoneChest(Material mat, String name, float hardness, float resistance, int harvest, String tool) {
    super(ModChest.Type.COBBLESTONE, Material.ROCK, "cobblestone_chest", 2.5F, 12.5F, 1, "pickaxe");
  }

  /*public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    return ItemHandler.tutItem;
  }

  public int quantityDropped(IBlockState state, int fortune, Random random) {
    return 1;
  }*/
}