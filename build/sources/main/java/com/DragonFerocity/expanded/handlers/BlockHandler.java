package com.DragonFerocity.expanded.handlers;

//import com.DragonFerocity.expanded.blocks.CobblestoneChest;
//import com.DragonFerocity.expanded.blocks.ModChest;
import com.DragonFerocity.expanded.blocks.ModBlock;
import com.DragonFerocity.expanded.blocks.ModBlockDoor;
import com.DragonFerocity.expanded.blocks.ModLantern;
import com.DragonFerocity.expanded.blocks.ModLamp;
import com.DragonFerocity.expanded.items.ModItemDoor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockHandler {
  //public static Block tutBlock;
  public static ModBlockDoor glassDoor;
  public static ModBlockDoor cobblestoneDoor;
  public static ModBlockDoor andesitePolishedDoor;
  public static ModBlockDoor granitePolishedDoor;
  public static ModBlockDoor dioritePolishedDoor;
  public static ModBlockDoor brickDoor;
  public static ModBlockDoor obsidianDoor;
  public static ModBlockDoor hardenedClayDoor;
  
  //OAK ITEMS
  public static ModBlock oakLightBox;
  public static ItemBlock ibOakLightBox;
  public static ModLantern oakLantern;
  public static ItemBlock ibOakLantern;
  public static ModLamp oakLamp;
  public static ItemBlock ibOakLamp;
  //public static Block cobblestoneChest;

  //public static ItemBlock ibTutBlock;

  //public static ItemBlock ibGlassDoor;
  //public static ItemBlock ibCobblestoneChest;

  //public static Item iTutItem;
  public static Item iGlassDoor;
  public static Item iCobblestoneDoor;
  public static Item iAndesitePolishedDoor;
  public static Item iGranitePolishedDoor;
  public static Item iDioritePolishedDoor;
  public static Item iBrickDoor;
  public static Item iObsidianDoor;
  public static Item iHardenedClayDoor;

  public static void init() {
    initBlocks();
    initItemBlocks();
    initItems();

    registerBlocks();

    CraftingHandler.init();
  }


  private static void initBlocks() {
    //tutBlock = new BlockTutBlock(Material.ROCK, "tut_block", CreativeTabs.BUILDING_BLOCKS, 5F, 15F, 3, "pickaxe");
    glassDoor = new ModBlockDoor(Material.GLASS, "glass_door", 0.3F, 1.5F, 0);
    cobblestoneDoor = new ModBlockDoor(Material.ROCK, "cobblestone_door", 2F, 30F, 1);
    andesitePolishedDoor = new ModBlockDoor(Material.ROCK, "andesite_polished_door", 2.5F, 35F, 1);
    granitePolishedDoor = new ModBlockDoor(Material.ROCK, "granite_polished_door", 2.5F, 35F, 1);
    dioritePolishedDoor = new ModBlockDoor(Material.ROCK, "diorite_polished_door", 2.5F, 35F, 1);
    brickDoor = new ModBlockDoor(Material.ROCK, "brick_door", 2.5F, 35F, 1);
    obsidianDoor = new ModBlockDoor(Material.ROCK, "obsidian_door", 60F, 6500F, 3);
    hardenedClayDoor = new ModBlockDoor(Material.CLAY, "hardened_clay_door", 2F, 21F, 0);
    oakLightBox = new ModBlock(Material.WOOD, "oak_light_box", CreativeTabs.DECORATIONS, 2F, 6F, 0, "pickaxe", 12/15F, 5, 20);
    oakLantern = new ModLantern(Material.WOOD, "oak_lantern", CreativeTabs.DECORATIONS, 1F, 4F, 0, "pickaxe", 13/15F, 5, 20);
    oakLamp = new ModLamp(Material.WOOD, "oak_lamp", CreativeTabs.DECORATIONS, 1.2F, 4F, 0, "pickaxe", 14/15F, 5, 20);
    //cobblestoneChest = new CobblestoneChest(Material.ROCK, "cobblestone_chest", 2.5F, 12.5F, 1, "pickaxe");
  }

  private static void initItemBlocks() {
    //ibTutBlock = (ItemBlock) new ItemBlock(tutBlock);
    //ibCobblestoneChest = (ItemBlock) new ItemBlock(cobblestoneChest);
    ibOakLightBox = (ItemBlock) new ItemBlock(oakLightBox);
    ibOakLantern = (ItemBlock) new ItemBlock(oakLantern);
    ibOakLamp = (ItemBlock) new ItemBlock(oakLamp);
  }

  private static void initItems() {
    //iTutItem = new ItemTutItem("tut_item", CreativeTabs.MATERIALS);
    iGlassDoor = new ModItemDoor(glassDoor, "glass_door", 64);
    iCobblestoneDoor = new ModItemDoor(cobblestoneDoor, "cobblestone_door", 64);
    iAndesitePolishedDoor = new ModItemDoor(andesitePolishedDoor, "andesite_polished_door", 64);
    iGranitePolishedDoor = new ModItemDoor(granitePolishedDoor, "granite_polished_door", 64);
    iDioritePolishedDoor = new ModItemDoor(dioritePolishedDoor, "diorite_polished_door", 64);
    iBrickDoor = new ModItemDoor(brickDoor, "brick_door", 64);
    iObsidianDoor = new ModItemDoor(obsidianDoor, "obsidian_door", 64);
    iHardenedClayDoor = new ModItemDoor(hardenedClayDoor, "hardened_clay_door", 64);
  }
  
  public static void registerRenders() {
    //Register Items
    //register(iTutItem);

    //Register Blocks
    //register(ibTutBlock);
    register(iGlassDoor);
    register(iCobblestoneDoor);
    register(iAndesitePolishedDoor);
    register(iGranitePolishedDoor);
    register(iDioritePolishedDoor);
    register(iBrickDoor);
    register(iObsidianDoor);
    register(iHardenedClayDoor);
    register(ibOakLightBox);
    register(ibOakLantern);
    register(ibOakLamp);
  }

  private static void registerBlocks() {
    register(glassDoor, iGlassDoor, "glass_door");
    register(cobblestoneDoor, iCobblestoneDoor, "cobblestone_door");
    register(andesitePolishedDoor, iAndesitePolishedDoor, "andesite_polished_door");
    register(granitePolishedDoor, iGranitePolishedDoor, "granite_polished_door");
    register(dioritePolishedDoor, iDioritePolishedDoor, "diorite_polished_door");
    register(brickDoor, iBrickDoor, "brick_door");
    register(obsidianDoor, iObsidianDoor, "obsidian_door");
    register(hardenedClayDoor, iHardenedClayDoor, "hardened_clay_door");
    register(oakLightBox, ibOakLightBox, "oak_light_box");
    register(oakLantern, ibOakLantern, "oak_lantern");
    register(oakLamp, ibOakLamp, "oak_lamp");
  }

  //REGISTER FUNCTIONS
  private static void register(Block block, ItemBlock iBlock, String name) {
    register(block, iBlock, name, name);
  }

  private static void register(Block block, Item item, String name) {
    register(block, name, name);
    register(item, name, name);
  }

  private static void register(Block block, String name) {
    register(block, name, name);
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

  public static void register(Block block, String name, String unlocal) {
    block.setUnlocalizedName(unlocal).setRegistryName(name);

    GameRegistry.register(block);
  }

  public static void register(Item item, String name, String unlocal) {
    item.setUnlocalizedName(unlocal).setRegistryName(name);

    GameRegistry.register(item);
  }

  private static void register(Item item) {
    register(item, 0);
  }

  private static void register(Item item, int meta) {
    register(item, meta, item.getRegistryName().toString());
  }

  private static void register(Item item, int meta, String name) {
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(name, "inventory"));
  }

}