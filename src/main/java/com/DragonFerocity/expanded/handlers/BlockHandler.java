package com.DragonFerocity.expanded.handlers;

import com.DragonFerocity.expanded.items.ItemTutItem;
import com.DragonFerocity.expanded.blocks.BlockTutBlock;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockHandler {
  public static Block tutBlock;
  public static ItemBlock ibTutBlock;

  public static void init() {
    tutBlock = new BlockTutBlock(Material.ROCK, "tut_block", CreativeTabs.BUILDING_BLOCKS, 5F, 15F, 3, "pickaxe");
    ibTutBlock = (ItemBlock) new ItemBlock(tutBlock);
  }

  public static void register() {
    GameRegistry.register(tutBlock);
    GameRegistry.register(ibTutBlock, tutBlock.getRegistryName());
  }

  public static void registerRenders() {
    registerRender(tutBlock);
  }

  public static void registerRender(Block block) {
    Item item = Item.getItemFromBlock(block);
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
  }
}