package com.DragonFerocity.expanded.handlers;

import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.items.ItemTutItem;
import com.DragonFerocity.expanded.blocks.BlockTutBlock;
//import com.DragonFerocity.expanded.blocks.CobblestoneChest;
//import com.DragonFerocity.expanded.blocks.ModChest;
import com.DragonFerocity.expanded.blocks.ModBlockDoor;
import com.DragonFerocity.expanded.items.ModItemDoor;

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
  public static Block glassDoor;
  //public static Block cobblestoneChest;

  public static ItemBlock ibTutBlock;
  public static ItemBlock ibGlassDoor;
  //public static ItemBlock ibCobblestoneChest;

  public static Item iTutItem;
  //public static Item iGlassDoor;

  public static void init() {
    initBlocks();
    initItemBlocks();
    initItems();

    registerBlocks();
    registerItems();
  }


  private static void initBlocks() {
    tutBlock = new BlockTutBlock(Material.ROCK, "tut_block", CreativeTabs.BUILDING_BLOCKS, 5F, 15F, 3, "pickaxe");
    glassDoor = new ModBlockDoor(Material.GLASS, "glass_door", 0.3F, 1.5F);
    //cobblestoneChest = new CobblestoneChest(Material.ROCK, "cobblestone_chest", 2.5F, 12.5F, 1, "pickaxe");
  }

  private static void initItemBlocks() {
    ibTutBlock = (ItemBlock) new ItemBlock(tutBlock);
    ibGlassDoor = (ItemBlock) new ItemBlock(glassDoor);
    //ibCobblestoneChest = (ItemBlock) new ItemBlock(cobblestoneChest);
  }

  private static void initItems() {
    iTutItem = new ItemTutItem("tut_item", CreativeTabs.MATERIALS);
    //iGlassDoor = new ModItemDoor(glassDoor);
  }


  private static void registerBlocks() {
    register(tutBlock, ibTutBlock, "tut_block");
    register(glassDoor, ibGlassDoor, "glass_door");
  }

  private static void registerItems() {
    register(iTutItem, "tut_item");
  }


  private static void register(Block block, ItemBlock iBlock, String name) {
    register(block, iBlock, name, name);
  }

  private static void register(Item item, String name) {
    register(item, name, name);
  }


  public static void register(Block block, ItemBlock iBlock, String name, String unlocal) {
    block.setUnlocalizedName(unlocal).setRegistryName(name);
    iBlock.setUnlocalizedName(unlocal).setRegistryName(name);

    GameRegistry.register(block);
    GameRegistry.register(iBlock);
  }

  public static void register(Item item, String name, String unlocal) {
    item.setUnlocalizedName(unlocal).setRegistryName(name);

    GameRegistry.register(item);
  }

}