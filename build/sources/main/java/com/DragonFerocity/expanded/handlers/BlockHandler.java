package com.DragonFerocity.expanded.handlers;

//import com.DragonFerocity.expanded.blocks.CobblestoneChest;
//import com.DragonFerocity.expanded.blocks.ModChest;
import com.DragonFerocity.expanded.blocks.*;
import com.DragonFerocity.expanded.items.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockHandler {
  //public static Block tutBlock;
  //public static ItemBlock ibTutBlock;
  //public static Item iTutItem;
  //Advanced Workbench
  public static ModAdvancedWorkbench advancedWorkbench;
  //public static ItemBlock ibAdvancedWorkbench;
  
  //Andesite Items
  public static ModBlockDoor andesitePolishedDoor;
  public static Item iAndesitePolishedDoor;
  
  //Brick Items
  public static ModBlockDoor brickDoor;
  public static Item iBrickDoor;
  
  //Cobblestone Items
  public static ModBlockDoor cobblestoneDoor;
  public static Item iCobblestoneDoor;
  //public static Block cobblestoneChest;
  //public static ItemBlock ibCobblestoneChest;
  
  //Diorite Items
  public static ModBlockDoor dioritePolishedDoor;
  public static Item iDioritePolishedDoor;
  public static ModStairs dioritePolishedStairs;
  public static ItemBlock ibDioritePolishedStairs;
  public static ModStairs dioritePolishedStairsAlt;
  public static ItemBlock ibDioritePolishedStairsAlt;
  public static ModLamp dioritePolishedLamp;
  public static ItemBlock ibDioritePolishedLamp;
  public static ModBlockBed dioritePolishedBed;
  public static Item iDioritePolishedBed;
  
  //Glass Items
  //Regular Glass
  public static ModBlockDoor glassDoor;
  public static Item iGlassDoor;
  
  //Granite Items
  public static ModBlockDoor granitePolishedDoor;
  public static Item iGranitePolishedDoor;
  
  //Hardened Clay Items
  //Regualr Clay
  public static ModBlockDoor hardenedClayDoor;
  public static Item iHardenedClayDoor;
  
  //Oak Items
  public static ModBlock oakLightBox;
  public static ItemBlock ibOakLightBox;
  public static ModLantern oakLantern;
  public static ItemBlock ibOakLantern;
  public static ModLamp oakLamp;
  public static ItemBlock ibOakLamp;
  public static ModBlockGrandfatherClock oakGrandfatherClock;
  public static Item iOakGrandfatherClock;
  public static ModStairs oakStairsAlt;
  public static ItemBlock ibOakStairsAlt;
  
  //Obsidian Items
  public static ModBlockDoor obsidianDoor;
  public static Item iObsidianDoor;
  
  
  //Ores
  //Progression: Copper < Gold < Platinum < Silver < Iron < Mithril < Titanium < Obsidian < Diamond
  public static ModOre copperOre;
  public static ItemBlock ibCopperOre;
  public static Item iCopperIngot;
  public static ModOre platinumOre;
  public static ItemBlock ibPlatinumOre;
  public static Item iPlatinumIngot;
  public static ModOre silverOre;
  public static ItemBlock ibSilverOre;
  public static Item iSilverIngot;
  public static ModOre mithrilOre;
  public static ItemBlock ibMithrilOre;
  public static Item iMithrilIngot;
  public static ModOre titaniumOre;
  public static ItemBlock ibTitaniumOre;
  public static Item iTitaniumIngot;
  
  //Ore BLocks
  public static ModBlock copperBlock;
  public static ItemBlock ibCopperBlock;
  

  public static void init() {
    initBlocks();
    initItemBlocks();
    initItems();

    registerBlocks();
    registerItems();

    CraftingHandler.init();
  }

//Harvest Level: 0: Wood, 1: Gold/Stone, 2: Iron, 3: Diamond
  private static void initBlocks() {
    //tutBlock = new BlockTutBlock(Material.ROCK, "tut_block", CreativeTabs.BUILDING_BLOCKS, 5F, 15F, 3, "pickaxe");
    //Andesite
    andesitePolishedDoor = new ModBlockDoor(Material.ROCK, "andesite_polished_door", 2.5F, 35F, 1);
    
    //Brick
    brickDoor = new ModBlockDoor(Material.ROCK, "brick_door", 2.5F, 35F, 1);
    
    //Cobblestone
    cobblestoneDoor = new ModBlockDoor(Material.ROCK, "cobblestone_door", 2F, 30F, 1);
    //cobblestoneChest = new CobblestoneChest(Material.ROCK, "cobblestone_chest", 2.5F, 12.5F, 1, "pickaxe");
    
    //Diorite
    dioritePolishedDoor = new ModBlockDoor(Material.ROCK, "diorite_polished_door", 2.5F, 35F, 1);
    dioritePolishedStairs = new ModStairs(Blocks.STONE, "diorite_polished_stairs", CreativeTabs.BUILDING_BLOCKS, 2.5F, 35F, 1, "pickaxe");
    dioritePolishedStairsAlt = new ModStairs(Blocks.STONE, "diorite_polished_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2F, 25F, 1, "pickaxe");
    dioritePolishedLamp = new ModLamp(Material.ROCK, "diorite_smooth_lamp", CreativeTabs.DECORATIONS, 2F, 30F, 1, "pickaxe", 14/15F);
    dioritePolishedBed = new ModBlockBed(3F, 40F, 1);
    
    //Glass
    //Regular
    glassDoor = new ModBlockDoor(Material.GLASS, "glass_door", 0.3F, 1.5F, 0);
    
    //Granite
    granitePolishedDoor = new ModBlockDoor(Material.ROCK, "granite_polished_door", 2.5F, 35F, 1);
    
    //Hardened Clay
    //Regular
    hardenedClayDoor = new ModBlockDoor(Material.CLAY, "hardened_clay_door", 2F, 21F, 0);
    
    //Oak
    oakLightBox = new ModBlock(Material.WOOD, "oak_light_box", CreativeTabs.DECORATIONS, 2F, 6F, 0, "pickaxe", 12/15F, 5, 20);
    oakLantern = new ModLantern(Material.WOOD, "oak_lantern", CreativeTabs.DECORATIONS, 1F, 4F, 0, "pickaxe", 13/15F, 5, 20);
    oakLamp = new ModLamp(Material.WOOD, "oak_lamp", CreativeTabs.DECORATIONS, 1.2F, 4F, 0, "pickaxe", 14/15F, 5, 20);
    oakStairsAlt = new ModStairs(Blocks.PLANKS, "oak_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.4F, 2F, 0, "pickaxe");
    
    //Obsidian
    obsidianDoor = new ModBlockDoor(Material.ROCK, "obsidian_door", 60F, 6500F, 3);
    
    //Advanced Workbench
    //advancedWorkbench = new ModAdvancedWorkbench(Material.WOOD);
    
    //Ores
    copperOre = new ModOre(2F, 12F, 1);
    platinumOre = new ModOre(2.5F, 14F, 1);
    silverOre = new ModOre(3F, 15F, 1);
    mithrilOre = new ModOre(4F, 16F, 2);
    titaniumOre = new ModOre(5F, 20F, 2);
    
    //Ore Blocks
    copperBlock = new ModBlock(Material.IRON, "copper_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe");
  }

  private static void initItemBlocks() {
    //ibTutBlock = (ItemBlock) new ItemBlock(tutBlock);
    //ibCobblestoneChest = (ItemBlock) new ItemBlock(cobblestoneChest);
    
    //Diorite
    ibDioritePolishedStairs = new ItemBlock(dioritePolishedStairs);
    ibDioritePolishedStairsAlt = new ItemBlock(dioritePolishedStairsAlt);
    ibDioritePolishedLamp = new ItemBlock(dioritePolishedLamp);
    
    //Oak
    ibOakLightBox = new ItemBlock(oakLightBox);
    ibOakLantern = new ItemBlock(oakLantern);
    ibOakLamp = new ItemBlock(oakLamp);
    ibOakStairsAlt = new ItemBlock(oakStairsAlt);
    //ibAdvancedWorkbench = (ItemBlock) new ItemBlock(advancedWorkbench);
    
    //Ores
    ibCopperOre = new ItemBlock(copperOre);
    ibPlatinumOre = new ItemBlock(platinumOre);
    ibSilverOre = new ItemBlock(silverOre);
    ibMithrilOre = new ItemBlock(mithrilOre);
    ibTitaniumOre = new ItemBlock(titaniumOre);
    
    //Ore Blocks
    ibCopperBlock = new ItemBlock(copperBlock);
  }

  private static void initItems() {
    //iTutItem = new ItemTutItem("tut_item", CreativeTabs.MATERIALS);
    //Andesite
    iAndesitePolishedDoor = new ModItemDoor(andesitePolishedDoor, "andesite_polished_door", 64);
    
    //Brick
    iBrickDoor = new ModItemDoor(brickDoor, "brick_door", 64);
    
    //Cobblestone
    iCobblestoneDoor = new ModItemDoor(cobblestoneDoor, "cobblestone_door", 64);
    
    //Diorite
    iDioritePolishedDoor = new ModItemDoor(dioritePolishedDoor, "diorite_polished_door", 64);
    iDioritePolishedBed = new ModItemBed(dioritePolishedBed, 64);
    
    //Glass
    //Regular
    iGlassDoor = new ModItemDoor(glassDoor, "glass_door", 64);
    
    //Granite
    iGranitePolishedDoor = new ModItemDoor(granitePolishedDoor, "granite_polished_door", 64);
    
    //Hardened Clay
    //Regular
    iHardenedClayDoor = new ModItemDoor(hardenedClayDoor, "hardened_clay_door", 64);
    
    //Obsidian
    iObsidianDoor = new ModItemDoor(obsidianDoor, "obsidian_door", 64);
    
    //Ingots
    iCopperIngot = new ModItem("copper_ingot", CreativeTabs.MATERIALS);
    iPlatinumIngot = new ModItem("platinum_ingot", CreativeTabs.MATERIALS);
    iSilverIngot = new ModItem("silver_ingot", CreativeTabs.MATERIALS);
    iMithrilIngot = new ModItem("mithril_ingot", CreativeTabs.MATERIALS);
    iTitaniumIngot = new ModItem("titanium_ingot", CreativeTabs.MATERIALS);
  }
  
  public static void registerRenders() {
    //Register Items
    //register(iTutItem, "tut_item");

    //Register Blocks
    //register(ibTutBlock);
    
    //Andesite
    register(iAndesitePolishedDoor);
    
    //Brick
    register(iBrickDoor);
    
    //Cobblestone
    register(iCobblestoneDoor);
    
    //Diorite
    register(iDioritePolishedDoor);
    register(ibDioritePolishedStairs);
    register(ibDioritePolishedStairsAlt);
    register(ibDioritePolishedLamp);
    register(iDioritePolishedBed);
    
    //Glass
    //Regular
    register(iGlassDoor);
    
    //Granite
    register(iGranitePolishedDoor);
    
    //Hardened Clay
    //Regular
    register(iHardenedClayDoor);
    
    //Oak
    register(ibOakLightBox);
    register(ibOakLantern);
    register(ibOakLamp);
    register(ibOakStairsAlt);
    
    //Obsidian
    register(iObsidianDoor);
    
    //Ores
    register(ibCopperOre);
    register(ibPlatinumOre);
    register(ibSilverOre);
    register(ibMithrilOre);
    register(ibTitaniumOre);
    
    //Ingots
    register(iCopperIngot);
    register(iPlatinumIngot);
    register(iSilverIngot);
    register(iMithrilIngot);
    register(iTitaniumIngot);
    //register(ibAdvancedWorkbench);
    
    //Ore Blocks
    register(ibCopperBlock);
  }

  private static void registerBlocks() {
    //Andesite
    register(andesitePolishedDoor, iAndesitePolishedDoor, "andesite_polished_door");
    
    //Brick
    register(brickDoor, iBrickDoor, "brick_door");
    
    //Cobblestone
    register(cobblestoneDoor, iCobblestoneDoor, "cobblestone_door");
    
    //Diorite
    register(dioritePolishedDoor, iDioritePolishedDoor, "diorite_polished_door");
    register(dioritePolishedStairs, ibDioritePolishedStairs, "diorite_polished_stairs");
    register(dioritePolishedStairsAlt, ibDioritePolishedStairsAlt, "diorite_polished_stairs_alt");
    register(dioritePolishedLamp, ibDioritePolishedLamp, "diorite_polished_lamp");
    register(dioritePolishedBed, iDioritePolishedBed, "diorite_polished_bed");
    
    //Glass
    register(glassDoor, iGlassDoor, "glass_door");
    
    //Granite
    register(granitePolishedDoor, iGranitePolishedDoor, "granite_polished_door");
    
    //Hardened Clay
    register(hardenedClayDoor, iHardenedClayDoor, "hardened_clay_door");
    
    //Oak
    register(oakLightBox, ibOakLightBox, "oak_light_box");
    register(oakLantern, ibOakLantern, "oak_lantern");
    register(oakLamp, ibOakLamp, "oak_lamp");
    register(oakStairsAlt, ibOakStairsAlt, "oak_stairs_alt");
    
    //Obsidian
    register(obsidianDoor, iObsidianDoor, "obsidian_door");
    
    //Ores
    register(copperOre, ibCopperOre, "copper_ore");
    register(platinumOre, ibPlatinumOre, "platinum_ore");
    register(silverOre, ibSilverOre, "silver_ore");
    register(mithrilOre, ibMithrilOre, "mithril_ore");
    register(titaniumOre, ibTitaniumOre, "titanium_ore");
    //register(advancedWorkbench, ibAdvancedWorkbench, "advanced_crafting_table");
    
    //Ore Blocks
    register(copperBlock, ibCopperBlock, "copper_block");
  }
  
  private static void registerItems() {
	  register(iCopperIngot, "copper_ingot");
	  register(iPlatinumIngot, "platinum_ingot");
	  register(iSilverIngot, "silver_ingot");
	  register(iMithrilIngot, "mithril_ingot");
	  register(iTitaniumIngot, "titanium_ingot");
  }

  //REGISTER FUNCTIONS
  private static void register(Block block, ItemBlock iBlock, String name) {
    register(block, iBlock, name, name);
  }

  private static void register(Block block, Item item, String name) {
    register(block, name, name);
    register(item, name, name);
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