package com.DragonFerocity.expanded.handlers;

//import com.DragonFerocity.expanded.blocks.CobblestoneChest;
//import com.DragonFerocity.expanded.blocks.ModChest;
import com.DragonFerocity.expanded.blocks.*;
import com.DragonFerocity.expanded.entities.ModTileEntityAlloyFurnace;
import com.DragonFerocity.expanded.entities.ModTileEntityCampfire;
import com.DragonFerocity.expanded.entities.ModTileEntityChest;
import com.DragonFerocity.expanded.items.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

import java.util.ArrayList;

public class BlockHandler {
  // public static Block tutBlock;
  // public static ItemBlock ibTutBlock;
  // public static Item iTutItem;
  // Advanced Workbench
  public static ModAdvancedWorkbench advancedWorkbench;
  // public static ItemBlock ibAdvancedWorkbench;

  // Acacia Wood
  public static ModLamp acaciaWoodLamp;
  public static ItemBlock ibAcaciaWoodLamp;
  public static ModStairs acaciaWoodStairsAlt;
  public static ItemBlock ibAcaciaWoodStairsAlt;
  public static ModCraftingTable acaciaWoodCraftingTable;
  public static ItemBlock ibAcaciaWoodCraftingTable;

  // Andesite Items
  public static ModBlockDoor andesitePolishedDoor;
  public static Item iAndesitePolishedDoor;
  public static ModStairs andesitePolishedStairs;
  public static ItemBlock ibAndesitePolishedStairs;
  public static ModStairs andesitePolishedStairsAlt;
  public static ItemBlock ibAndesitePolishedStairsAlt;

  // Birch Items
  public static ModBlockDoor birchStableDoor;
  public static Item iBirchStableDoor;
  public static ModLamp birchLamp;
  public static ItemBlock ibBirchLamp;
  public static ModLantern birchLantern;
  public static ItemBlock ibBirchLantern;
  public static ModStairs birchStairsAlt;
  public static ItemBlock ibBirchStairsAlt;
  public static ModCraftingTable birchCraftingTable;
  public static ItemBlock ibBirchCraftingTable;

  // Brick Items
  public static ModBlockDoor brickDoor;
  public static Item iBrickDoor;
  public static ModStairs brickStairsAlt;
  public static ItemBlock ibBrickStairsAlt;

  // Bricks
  // Gold
  public static ModBlock goldBrick;
  public static ItemBlock ibGoldBrick;
  public static ModStairs goldBrickStairs;
  public static ItemBlock ibGoldBrickStairs;
  public static ModStairs goldBrickStairsAlt;
  public static ItemBlock ibGoldBrickStairsAlt;
  // Copper
  public static ModBlock copperBrick;
  public static ItemBlock ibCopperBrick;
  public static ModStairs copperBrickStairs;
  public static ItemBlock ibCopperBrickStairs;
  public static ModStairs copperBrickStairsAlt;
  public static ItemBlock ibCopperBrickStairsAlt;
  // Silver
  public static ModBlock silverBrick;
  public static ItemBlock ibSilverBrick;
  public static ModStairs silverBrickStairs;
  public static ItemBlock ibSilverBrickStairs;
  public static ModStairs silverBrickStairsAlt;
  public static ItemBlock ibSilverBrickStairsAlt;
  // Obsidian
  public static ModBlock polishedObsidianBrick;
  public static ItemBlock ibPolishedObsidianBrick;
  public static ModStairs polishedObsidianBrickStairs;
  public static ItemBlock ibPolishedObsidianBrickStairs;
  public static ModStairs polishedObsidianBrickStairsAlt;
  public static ItemBlock ibPolishedObsidianBrickStairsAlt;

  // Cactus
  public static ModBlock cutCactusBlock;
  public static ItemBlock ibCutCactusBlock;
  public static ModStairs cutCactusStairs;
  public static ItemBlock ibCutCactusStairs;
  public static ModStairs cutCactusStairsAlt;
  public static ItemBlock ibCutCactusStairsAlt;
  public static ModLamp cutCactusLamp;
  public static ItemBlock ibCutCactusLamp;
  public static ModLantern cutCactusLantern;
  public static ItemBlock ibCutCactusLantern;

  // Cobblestone Items
  public static ModBlockDoor cobblestoneDoor;
  public static Item iCobblestoneDoor;
  public static ModChest cobblestoneChest;
  public static ItemBlock ibCobblestoneChest;
  public static ModStairs cobblestoneStairsAlt;
  public static ItemBlock ibCobblestoneStairsAlt;

  // Dark Oak
  public static ModLamp darkOakLamp;
  public static ItemBlock ibDarkOakLamp;
  public static ModLantern darkOakLantern;
  public static ItemBlock ibDarkOakLantern;
  public static ModBlockBed darkOakBed;
  public static ModItemBed iDarkOakBed;
  public static ModStairs darkOakStairsAlt;
  public static ItemBlock ibDarkOakStairsAlt;
  public static ModCraftingTable darkOakCraftingTable;
  public static ItemBlock ibDarkOakCraftingTable;

  // Diorite Items
  public static ModBlockDoor dioritePolishedDoor;
  public static Item iDioritePolishedDoor;
  public static ModStairs dioritePolishedStairs;
  public static ItemBlock ibDioritePolishedStairs;
  public static ModStairs dioritePolishedStairsAlt;
  public static ItemBlock ibDioritePolishedStairsAlt;
  public static ModLantern dioritePolishedLantern;
  public static ItemBlock ibDioritePolishedLantern;
  public static ModLamp dioritePolishedLamp;
  public static ItemBlock ibDioritePolishedLamp;
  public static ModBlockBed dioritePolishedBed;
  public static Item iDioritePolishedBed;
  public static ModChest dioritePolishedChest;
  public static ItemBlock ibDioritePolishedChest;

  // Glass Items
  // Regular Glass
  public static ModBlockDoor glassDoor;
  public static Item iGlassDoor;
  public static ModStairs glassStairs;
  public static ItemBlock ibGlassStairs;
  public static ModStairs glassStairsAlt;
  public static ItemBlock ibGlassStairsAlt;

  // White
  public static ModStairs whiteGlassStairs;
  public static ItemBlock ibWhiteGlassStairs;
  public static ModStairs whiteGlassStairsAlt;
  public static ItemBlock ibWhiteGlassStairsAlt;

  // Orange
  public static ModStairs orangeGlassStairs;
  public static ItemBlock ibOrangeGlassStairs;
  public static ModStairs orangeGlassStairsAlt;
  public static ItemBlock ibOrangeGlassStairsAlt;

  // Magenta
  public static ModStairs magentaGlassStairs;
  public static ItemBlock ibMagentaGlassStairs;
  public static ModStairs magentaGlassStairsAlt;
  public static ItemBlock ibMagentaGlassStairsAlt;

  // Light Blue
  public static ModStairs lightBlueGlassStairs;
  public static ItemBlock ibLightBlueGlassStairs;
  public static ModStairs lightBlueGlassStairsAlt;
  public static ItemBlock ibLightBlueGlassStairsAlt;

  // Yellow
  public static ModStairs yellowGlassStairs;
  public static ItemBlock ibYellowGlassStairs;
  public static ModStairs yellowGlassStairsAlt;
  public static ItemBlock ibYellowGlassStairsAlt;

  // Lime
  public static ModStairs limeGlassStairs;
  public static ItemBlock ibLimeGlassStairs;
  public static ModStairs limeGlassStairsAlt;
  public static ItemBlock ibLimeGlassStairsAlt;

  // Pink
  public static ModStairs pinkGlassStairs;
  public static ItemBlock ibPinkGlassStairs;
  public static ModStairs pinkGlassStairsAlt;
  public static ItemBlock ibPinkGlassStairsAlt;

  // Gray
  public static ModStairs grayGlassStairs;
  public static ItemBlock ibGrayGlassStairs;
  public static ModStairs grayGlassStairsAlt;
  public static ItemBlock ibGrayGlassStairsAlt;

  // Silver
  public static ModStairs silverGlassStairs;
  public static ItemBlock ibSilverGlassStairs;
  public static ModStairs silverGlassStairsAlt;
  public static ItemBlock ibSilverGlassStairsAlt;

  // Cyan
  public static ModStairs cyanGlassStairs;
  public static ItemBlock ibCyanGlassStairs;
  public static ModStairs cyanGlassStairsAlt;
  public static ItemBlock ibCyanGlassStairsAlt;

  // Purple
  public static ModStairs purpleGlassStairs;
  public static ItemBlock ibPurpleGlassStairs;
  public static ModStairs purpleGlassStairsAlt;
  public static ItemBlock ibPurpleGlassStairsAlt;

  // Blue
  public static ModStairs blueGlassStairs;
  public static ItemBlock ibBlueGlassStairs;
  public static ModStairs blueGlassStairsAlt;
  public static ItemBlock ibBlueGlassStairsAlt;

  // Brown
  public static ModStairs brownGlassStairs;
  public static ItemBlock ibBrownGlassStairs;
  public static ModStairs brownGlassStairsAlt;
  public static ItemBlock ibBrownGlassStairsAlt;

  // Green
  public static ModStairs greenGlassStairs;
  public static ItemBlock ibGreenGlassStairs;
  public static ModStairs greenGlassStairsAlt;
  public static ItemBlock ibGreenGlassStairsAlt;

  // Red
  public static ModStairs redGlassStairs;
  public static ItemBlock ibRedGlassStairs;
  public static ModStairs redGlassStairsAlt;
  public static ItemBlock ibRedGlassStairsAlt;

  // Black
  public static ModStairs blackGlassStairs;
  public static ItemBlock ibBlackGlassStairs;
  public static ModStairs blackGlassStairsAlt;
  public static ItemBlock ibBlackGlassStairsAlt;

  // Lighted Glass
  public static ModBlock blackLightedGlassBlock;
  public static ItemBlock ibBlackLightedGlassBlock;
  public static ModBlock blueLightedGlassBlock;
  public static ItemBlock ibBlueLightedGlassBlock;
  public static ModBlock brownLightedGlassBlock;
  public static ItemBlock ibBrownLightedGlassBlock;
  public static ModBlock cyanLightedGlassBlock;
  public static ItemBlock ibCyanLightedGlassBlock;
  public static ModBlock grayLightedGlassBlock;
  public static ItemBlock ibGrayLightedGlassBlock;
  public static ModBlock greenLightedGlassBlock;
  public static ItemBlock ibGreenLightedGlassBlock;
  public static ModBlock lightBlueLightedGlassBlock;
  public static ItemBlock ibLightBlueLightedGlassBlock;
  public static ModBlock limeLightedGlassBlock;
  public static ItemBlock ibLimeLightedGlassBlock;
  public static ModBlock magentaLightedGlassBlock;
  public static ItemBlock ibMagentaLightedGlassBlock;
  public static ModBlock orangeLightedGlassBlock;
  public static ItemBlock ibOrangeLightedGlassBlock;
  public static ModBlock pinkLightedGlassBlock;
  public static ItemBlock ibPinkLightedGlassBlock;
  public static ModBlock purpleLightedGlassBlock;
  public static ItemBlock ibPurpleLightedGlassBlock;
  public static ModBlock redLightedGlassBlock;
  public static ItemBlock ibRedLightedGlassBlock;
  public static ModBlock silverLightedGlassBlock;
  public static ItemBlock ibSilverLightedGlassBlock;
  public static ModBlock whiteLightedGlassBlock;
  public static ItemBlock ibWhiteLightedGlassBlock;
  public static ModBlock yellowLightedGlassBlock;
  public static ItemBlock ibYellowLightedGlassBlock;

  // Granite Items
  public static ModBlockDoor granitePolishedDoor;
  public static Item iGranitePolishedDoor;
  public static ModLamp granitePolishedLamp;
  public static ItemBlock ibGranitePolishedLamp;
  public static ModLantern granitePolishedLantern;
  public static ItemBlock ibGranitePolishedLantern;
  public static ModStairs granitePolishedStairs;
  public static ItemBlock ibGranitePolishedStairs;
  public static ModStairs granitePolishedStairsAlt;
  public static ItemBlock ibGranitePolishedStairsAlt;

  // Jungle Wood Item
  public static ModStairs jungleWoodStairsAlt;
  public static ItemBlock ibJungleWoodStairsAlt;
  public static ModCraftingTable jungleWoodCraftingTable;
  public static ItemBlock ibJungleWoodCraftingTable;

  // Hardened Clay Items
  // Regualr Clay
  public static ModBlockDoor hardenedClayDoor;
  public static Item iHardenedClayDoor;
  public static ModStairs terracottaStairs;
  public static ItemBlock ibTerracottaStairs;
  public static ModStairs terracottaStairsAlt;
  public static ItemBlock ibTerracottaStairsAlt;

  // Oak Items
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
  public static ModBlockDoor oakStableDoor;
  public static Item iOakStableDoor;
  public static ModCraftingTable oakCraftingTable;
  public static ItemBlock ibOakCraftingTable;

  // Obsidian Items
  public static ModBlock polishedObsidianBlock;
  public static ItemBlock ibPolishedObsidianBlock;
  public static ModBlockDoor polishedObsidianDoor;
  public static Item iPolishedObsidianDoor;
  public static ModStairs polishedObsidianStairs;
  public static ItemBlock ibPolishedObsidianStairs;
  public static ModStairs polishedObsidianStairsAlt;
  public static ItemBlock ibPolishedObsidianStairsAlt;

  // Spruce Wood Items
  public static ModStairs spruceWoodStairsAlt;
  public static ItemBlock ibSpruceWoodStairsAlt;
  public static ModCraftingTable spruceWoodCraftingTable;
  public static ItemBlock ibSpruceWoodCraftingTable;

  // Ores
  // Progression: Copper < Tin < Gold < Platinum < Cold Iron < Silver < Iron <
  // Titanium < Steel < Mithril < Celestial Bronze/Imperial Gold < Diamond <
  // Obsidian
  // Titanium will be used to reinforce items increasing their durability
  public static ModOre copperOre;
  public static ItemBlock ibCopperOre;
  public static Item iCopperIngot;
  public static Item iCopperNuggets;
  public static ModOre tinOre;
  public static ItemBlock ibTinOre;
  public static Item iTinIngot;
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

  // Special Ores
  public static Item iSteelIngot;
  public static Item iBronzeNuggets;
  public static Item iBronzeIngot;
  public static Item iCelestialBronzeNuggets;
  public static Item iCelestialBronzeIngot;
  public static Item iImperialGoldNuggets;
  public static Item iImperialGoldIngot;
  public static Item iColdIronNuggets;

  // Ore Blocks
  public static ModBlock copperBlock;
  public static ItemBlock ibCopperBlock;
  public static ModBlock tinBlock;
  public static ItemBlock ibTinBlock;
  public static ModBlock bronzeBlock;
  public static ItemBlock ibBronzeBlock;
  public static ModBlock platinumBlock;
  public static ItemBlock ibPlatinumBlock;
  public static ModBlock silverBlock;
  public static ItemBlock ibSilverBlock;
  public static ModBlock mithrilBlock;
  public static ItemBlock ibMithrilBlock;
  public static ModBlock titaniumBlock;
  public static ItemBlock ibTitaniumBlock;
  public static ModBlock steelBlock;
  public static ItemBlock ibSteelBlock;
  public static ModBlock celestialBronzeBlock;
  public static ItemBlock ibCelestialBronzeBlock;
  public static ModBlock imperialGoldBlock;
  public static ItemBlock ibImperialGoldBlock;
  public static ModBlock coldIronBlock;
  public static ItemBlock ibColdIronBlock;

  // Pickaxes
  public static ModPickaxe iBronzePickaxe;
  public static ModPickaxe iSteelPickaxe;
  public static ModPickaxe iMithrilPickaxe;
  public static ModPickaxe iCelestialBronzePickaxe;
  public static ModPickaxe iImperialGoldPickaxe;
  public static ModPickaxe iObsidianPickaxe;

  // Axe
  public static ModAxe iBronzeAxe;
  public static ModAxe iSteelAxe;
  public static ModAxe iMithrilAxe;
  public static ModAxe iCelestialBronzeAxe;
  public static ModAxe iImperialGoldAxe;
  public static ModAxe iObsidianAxe;

  // Shovel
  public static ModSpade iBronzeShovel;
  public static ModSpade iSteelShovel;
  public static ModSpade iMithrilShovel;
  public static ModSpade iCelestialBronzeShovel;
  public static ModSpade iImperialGoldShovel;
  public static ModSpade iObsidianShovel;

  // Hoe
  public static ModHoe iBronzeHoe;
  public static ModHoe iSteelHoe;
  public static ModHoe iMithrilHoe;
  public static ModHoe iCelestialBronzeHoe;
  public static ModHoe iImperialGoldHoe;
  public static ModHoe iObsidianHoe;

  // Sword
  public static ModSword iBronzeSword;
  public static ModSword iSilverSword;
  public static ModSword iSteelSword;
  public static ModSword iMithrilSword;
  public static ModSword iCelestialBronzeSword;
  public static ModSword iImperialGoldSword;
  public static ModSword iObsidianSword;

  // Alloy Furnace
  public static ModAlloyFurnace alloyFurnace;
  public static ItemBlock ibAlloyFurnace;
  public static ModAlloyFurnace litAlloyFurnace;
  public static ItemBlock ibLitAlloyFurnace;

  // Campfire
  public static ModCampfire campfire;
  public static ItemBlock ibCampfire;
  public static ModCampfire litCampfire;
  public static ItemBlock ibLitCampfire;
  
  /*public static ModCampfire oakCampfire;
  public static ItemBlock ibOakCampfire;
  public static ModCampfire litOakCampfire;
  public static ItemBlock ibOakLitCampfire;
  
  public static ModCampfire acaciaCampfire;
  public static ItemBlock ibAcaciaCampfire;
  public static ModCampfire litAcaciaCampfire;
  public static ItemBlock ibAcaciaLitCampfire;*/
  
  // Other Vars
  public static ArrayList<ItemBlock> itemBlockList = new ArrayList<>();
  public static ArrayList<Block> blockList = new ArrayList<>();

  // public static void init(RegistryEvent.Register event) {
  // initBlocks(event);
  // initItemBlocks();
  // initItems();

  // registerBlocks(event);
  // registerItems(event);

  // CraftingHandler.init();
  // }

  // Harvest Level: 0: Wood, 1: Gold/Stone, 2: Iron, 3: Diamond
  public static void initBlocks(RegistryEvent.Register<Block> event) {
    // tutBlock = new BlockTutBlock(Material.ROCK, "tut_block",
    // CreativeTabs.BUILDING_BLOCKS, 5F, 15F, 3, "pickaxe");

    // Alloy Furnace
    blockList.add(alloyFurnace = new ModAlloyFurnace(false, "alloy_furnace", CreativeTabs.BUILDING_BLOCKS, 3F, 40F, "pickaxe", 1));
    ibAlloyFurnace = createItemBlock(new ItemBlock(alloyFurnace), alloyFurnace);

    blockList.add(litAlloyFurnace = new ModAlloyFurnace(true, "lit_alloy_furnace", CreativeTabs.BUILDING_BLOCKS, 3F, 40F, "pickaxe", 1));
    ibLitAlloyFurnace = createItemBlock(new ItemBlock(litAlloyFurnace), litAlloyFurnace);

    GameRegistry.registerTileEntity(ModTileEntityAlloyFurnace.class, "alloy_furnace_tile_entity");

    // Campfire
    // Oak
    blockList.add(campfire = new ModCampfire(false, "campfire", CreativeTabs.DECORATIONS, 1F, 1F, "pickaxe", 0));
    ibCampfire = createItemBlockWithoutAddingToList(new ItemBlock(campfire), campfire);
    blockList.add(litCampfire = new ModCampfire(true, "lit_campfire", CreativeTabs.DECORATIONS, 1F, 1F, "pickaxe", 0));
    ibLitCampfire = createItemBlockWithoutAddingToList(new ItemBlock(litCampfire), litCampfire);
    
    GameRegistry.registerTileEntity(ModTileEntityCampfire.class, "campfire_tile_entity");
    
    /*acaciaCampfire = createBlock(new ModCampfire(false, "acacia_campfire", CreativeTabs.DECORATIONS, 1F, 1F, "pickaxe", 0, 4), event);
    litAcaciaCampfire = createBlock(new ModCampfire(true, "lit_acacia_campfire", CreativeTabs.DECORATIONS, 1F, 1F, "pickaxe", 0, 4), event);
    ibAcaciaCampfire = createItemBlockWithoutAddingToList(new ItemBlock(acaciaCampfire), acaciaCampfire);
    ibAcaciaLitCampfire = createItemBlockWithoutAddingToList(new ItemBlock(litAcaciaCampfire), litAcaciaCampfire);*/

 // Acacia Wood
    blockList.add(acaciaWoodStairsAlt = new ModStairs(Blocks.PLANKS, "acacia_wood_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.5F, 3F, 0, "axe"));
    ibAcaciaWoodStairsAlt = createItemBlock(new ItemBlock(acaciaWoodStairsAlt), acaciaWoodStairsAlt);

    blockList.add(acaciaWoodCraftingTable = new ModCraftingTable("acacia_wood_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"));
    ibAcaciaWoodCraftingTable = createItemBlock(new ItemBlock(acaciaWoodCraftingTable), acaciaWoodCraftingTable);

    // Andesite
    blockList.add(andesitePolishedDoor = new ModBlockDoor(Material.ROCK, "andesite_polished_door", 2.5F, 35F, 1, "pickaxe"));

    blockList.add(andesitePolishedStairs = new ModStairs(Blocks.STONE, "andesite_polished_stairs", CreativeTabs.BUILDING_BLOCKS, 3.0F, 38F, 1, "pickaxe"));
    ibAndesitePolishedStairs = createItemBlock(new ItemBlock(andesitePolishedStairs), andesitePolishedStairs);

    blockList.add(andesitePolishedStairsAlt = new ModStairs(Blocks.STONE, "andesite_polished_stairs_alt",CreativeTabs.BUILDING_BLOCKS, 2.0F, 30F, 1, "pickaxe"));
    ibAndesitePolishedStairsAlt = createItemBlock(new ItemBlock(andesitePolishedStairsAlt), andesitePolishedStairsAlt);

    // Birch
    blockList.add(birchStableDoor = new ModBlockDoor(Material.WOOD, "birch_stable_door", 1.9F, 5F, 0, "pickaxe"));

    blockList.add(birchLamp = new ModLamp(Material.WOOD, "birch_lamp", CreativeTabs.DECORATIONS, 1.2F, 4F, 0, "axe", 14 / 15F, 1.8D));
    ibBirchLamp = createItemBlock(new ItemBlock(birchLamp), birchLamp);

    blockList.add(birchStairsAlt = new ModStairs(Blocks.PLANKS, "birch_wood_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.5F, 3F, 0, "axe"));
    ibBirchStairsAlt = createItemBlock(new ItemBlock(birchStairsAlt), birchStairsAlt);

    blockList.add(birchLantern = new ModLantern(Material.WOOD, "birch_lantern", CreativeTabs.DECORATIONS, 1.0F, 3.5F, 1,"axe", 13 / 15F, 5, 20, 0.75D));
    ibBirchLantern = createItemBlock(new ItemBlock(birchLantern), birchLantern);

    blockList.add(birchCraftingTable = new ModCraftingTable("birch_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"));
    ibBirchCraftingTable = createItemBlock(new ItemBlock(birchCraftingTable), birchCraftingTable);

    // Brick
    blockList.add(brickDoor = new ModBlockDoor(Material.ROCK, "brick_door", 2.5F, 35F, 1, "pickaxe"));
    blockList.add(brickStairsAlt = new ModStairs(Blocks.STONE, "brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 30F, 1, "pickaxe"));
    ibBrickStairsAlt = createItemBlock(new ItemBlock(brickStairsAlt), brickStairsAlt);
    // Cactus
    blockList.add(cutCactusBlock = new ModBlock(Material.WOOD, "cut_cactus_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 2F, 0, "axe"));
    ibCutCactusBlock = createItemBlock(new ItemBlock(cutCactusBlock), cutCactusBlock);

    blockList.add(cutCactusStairs = new ModStairs(Blocks.DIRT, "cut_cactus_stairs", CreativeTabs.BUILDING_BLOCKS, 0.3F, 1.7F, 0, "axe"));
    ibCutCactusStairs = createItemBlock(new ItemBlock(cutCactusStairs), cutCactusStairs);

    blockList.add(cutCactusStairsAlt = new ModStairs(Blocks.DIRT, "cut_cactus_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1.3F, 0, "axe"));
    ibCutCactusStairsAlt = createItemBlock(new ItemBlock(cutCactusStairsAlt), cutCactusStairsAlt);

    blockList.add(cutCactusLamp = new ModLamp(Material.WOOD, "cut_cactus_lamp", CreativeTabs.DECORATIONS, 0.5F, 2.1F, 1, "axe", 14 / 15F, 1.6D));
    ibCutCactusLamp = createItemBlock(new ItemBlock(cutCactusLamp), cutCactusLamp);

    blockList.add(cutCactusLantern = new ModLantern(Material.WOOD, "cut_cactus_lantern", CreativeTabs.DECORATIONS, 0.25F, 1.5F, 1, "axe", 13 / 15F, 5, 20, 0.75D));
    ibCutCactusLantern = createItemBlock(new ItemBlock(cutCactusLantern), cutCactusLantern);

    // Cobblestone
    blockList.add(cobblestoneDoor = new ModBlockDoor(Material.ROCK, "cobblestone_door", 2F, 30F, 1, "pickaxe"));

    //blockList.add(cobblestoneChest = new ModChest(ModChest.Type.COBBLESTONE, Material.ROCK, "cobblestone_chest", 2.5F, 12.5F, 1, "pickaxe"));
    //ibCobblestoneChest = createItemBlock(new ItemBlock(cobblestoneChest), cobblestoneChest);

    blockList.add(cobblestoneStairsAlt = new ModStairs(Blocks.STONE, "cobblestone_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 30F, 1, "pickaxe"));
    ibCobblestoneStairsAlt = createItemBlock(new ItemBlock(cobblestoneStairsAlt), cobblestoneStairsAlt);

    // Dark Oak
    blockList.add(darkOakLamp = new ModLamp(Material.WOOD, "dark_oak_lamp", CreativeTabs.DECORATIONS, 1.2F, 4F, 0, "axe", 14 / 15F, 1.8D));
    ibDarkOakLamp = createItemBlock(new ItemBlock(darkOakLamp), darkOakLamp);

    blockList.add(darkOakLantern = new ModLantern(Material.WOOD, "dark_oak_lantern", CreativeTabs.DECORATIONS, 1F, 4F, 0, "axe", 13 / 15F, 5, 20, 0.7D));
    ibDarkOakLantern = createItemBlock(new ItemBlock(darkOakLantern), darkOakLantern);

    blockList.add(darkOakBed = new ModBlockBed("dark_oak_bed", 2F, 8F, 0, "axe"));

    blockList.add(darkOakStairsAlt = new ModStairs(Blocks.PLANKS, "dark_oak_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.7F, 3F, 0, "axe"));
    ibDarkOakStairsAlt = createItemBlock(new ItemBlock(darkOakStairsAlt), darkOakStairsAlt);

    blockList.add(darkOakCraftingTable = new ModCraftingTable("dark_oak_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"));
    ibDarkOakCraftingTable = createItemBlock(new ItemBlock(darkOakCraftingTable), darkOakCraftingTable);

    // Diorite
    blockList.add(dioritePolishedDoor = new ModBlockDoor(Material.ROCK, "diorite_polished_door", 2.5F, 35F, 1, "pickaxe"));

    blockList.add(dioritePolishedStairs = new ModStairs(Blocks.STONE, "diorite_polished_stairs", CreativeTabs.BUILDING_BLOCKS, 2.5F, 35F, 1, "pickaxe"));
    ibDioritePolishedStairs = createItemBlock(new ItemBlock(dioritePolishedStairs), dioritePolishedStairs);

    blockList.add(dioritePolishedStairsAlt = new ModStairs(Blocks.STONE, "diorite_polished_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2F, 25F, 1, "pickaxe"));
    ibDioritePolishedStairsAlt = createItemBlock(new ItemBlock(dioritePolishedStairsAlt), dioritePolishedStairsAlt);

    blockList.add(dioritePolishedLantern = new ModLantern(Material.ROCK, "diorite_polished_lantern", CreativeTabs.DECORATIONS, 2F, 18F, 1, "pickaxe", 13 / 15F, 5, 20, 0.6D));
    ibDioritePolishedLantern = createItemBlock(new ItemBlock(dioritePolishedLantern), dioritePolishedLantern);

    blockList.add(dioritePolishedLamp = new ModLamp(Material.ROCK, "diorite_polished_lamp", CreativeTabs.DECORATIONS, 2F, 30F, 1, "pickaxe", 14 / 15F, 1.9D));
    ibDioritePolishedLamp = createItemBlock(new ItemBlock(dioritePolishedLamp), dioritePolishedLamp);

    blockList.add(dioritePolishedBed = new ModBlockBed("diorite_polished_bed", 3F, 40F, 1, "pickaxe"));

    //blockList.add(dioritePolishedChest = new ModChest(ModChest.Type.POLISHED_DIORITE, Material.ROCK, "diorite_polished_chest", 4F, 40F, 1, "pickaxe"));
    //ibDioritePolishedChest = createItemBlock(new ItemBlock(dioritePolishedChest), dioritePolishedChest);

    // Glass
    // Regular
    blockList.add(glassDoor = new ModBlockDoor(Material.GLASS, "glass_door", 0.3F, 1.5F, 0, "pickaxe"));

    blockList.add(glassStairs = new ModStairs(Blocks.GLASS, "glass_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibGlassStairs = createItemBlock(new ItemBlock(glassStairs), glassStairs);

    blockList.add(glassStairsAlt = new ModStairs(Blocks.GLASS, "glass_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibGlassStairsAlt = createItemBlock(new ItemBlock(glassStairsAlt), glassStairsAlt);

    // White
    blockList.add(whiteGlassStairs = new ModStairs(Blocks.GLASS, "glass_white_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibWhiteGlassStairs = createItemBlock(new ItemBlock(whiteGlassStairs), whiteGlassStairs);

    blockList.add(whiteGlassStairsAlt = new ModStairs(Blocks.GLASS, "glass_white_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibWhiteGlassStairsAlt = createItemBlock(new ItemBlock(whiteGlassStairsAlt), whiteGlassStairsAlt);

    // Orange
    blockList.add(orangeGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_orange_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibOrangeGlassStairs = createItemBlock(new ItemBlock(orangeGlassStairs), orangeGlassStairs);

    blockList.add(orangeGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_orange_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibOrangeGlassStairsAlt = createItemBlock(new ItemBlock(orangeGlassStairsAlt), orangeGlassStairsAlt);

    // Magenta
    blockList.add(magentaGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_magenta_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibMagentaGlassStairs = createItemBlock(new ItemBlock(magentaGlassStairs), magentaGlassStairs);

    blockList.add(magentaGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_magenta_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibMagentaGlassStairsAlt = createItemBlock(new ItemBlock(magentaGlassStairsAlt), magentaGlassStairsAlt);

    // Light Blue
    blockList.add(lightBlueGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_light_blue_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibLightBlueGlassStairs = createItemBlock(new ItemBlock(lightBlueGlassStairs), lightBlueGlassStairs);

    blockList.add(lightBlueGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_light_blue_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibLightBlueGlassStairsAlt = createItemBlock(new ItemBlock(lightBlueGlassStairsAlt), lightBlueGlassStairsAlt);

    // Yellow
    blockList.add(yellowGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_yellow_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibYellowGlassStairs = createItemBlock(new ItemBlock(yellowGlassStairs), yellowGlassStairs);

    blockList.add(yellowGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_yellow_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibYellowGlassStairsAlt = createItemBlock(new ItemBlock(yellowGlassStairsAlt), yellowGlassStairsAlt);

    // Lime
    blockList.add(limeGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_lime_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibLimeGlassStairs = createItemBlock(new ItemBlock(limeGlassStairs), limeGlassStairs);

    blockList.add(limeGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_lime_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibLimeGlassStairsAlt = createItemBlock(new ItemBlock(limeGlassStairsAlt), limeGlassStairsAlt);

    // Pink
    blockList.add(pinkGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_pink_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibPinkGlassStairs = createItemBlock(new ItemBlock(pinkGlassStairs), pinkGlassStairs);

    blockList.add(pinkGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_pink_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibPinkGlassStairsAlt = createItemBlock(new ItemBlock(pinkGlassStairsAlt), pinkGlassStairsAlt);

    // Gray
    blockList.add(grayGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_gray_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibGrayGlassStairs = createItemBlock(new ItemBlock(grayGlassStairs), grayGlassStairs);

    blockList.add(grayGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_gray_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibGrayGlassStairsAlt = createItemBlock(new ItemBlock(grayGlassStairsAlt), grayGlassStairsAlt);

    // Silver
    blockList.add(silverGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_silver_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibSilverGlassStairs = createItemBlock(new ItemBlock(silverGlassStairs), silverGlassStairs);

    blockList.add(silverGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_silver_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibSilverGlassStairsAlt = createItemBlock(new ItemBlock(silverGlassStairsAlt), silverGlassStairsAlt);

    // Cyan
    blockList.add(cyanGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_cyan_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibCyanGlassStairs = createItemBlock(new ItemBlock(cyanGlassStairs), cyanGlassStairs);

    blockList.add(cyanGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_cyan_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibCyanGlassStairsAlt = createItemBlock(new ItemBlock(cyanGlassStairsAlt), cyanGlassStairsAlt);

    // Purple
    blockList.add(purpleGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_purple_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibPurpleGlassStairs = createItemBlock(new ItemBlock(purpleGlassStairs), purpleGlassStairs);

    blockList.add(purpleGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_purple_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibPurpleGlassStairsAlt = createItemBlock(new ItemBlock(purpleGlassStairsAlt), purpleGlassStairsAlt);

    // Blue
    blockList.add(blueGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_blue_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibBlueGlassStairs = createItemBlock(new ItemBlock(blueGlassStairs), blueGlassStairs);

    blockList.add(blueGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_blue_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibBlueGlassStairsAlt = createItemBlock(new ItemBlock(blueGlassStairsAlt), blueGlassStairsAlt);

    // Brown
    blockList.add(brownGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_brown_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibBrownGlassStairs = createItemBlock(new ItemBlock(brownGlassStairs), brownGlassStairs);

    blockList.add(brownGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_brown_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibBrownGlassStairsAlt = createItemBlock(new ItemBlock(brownGlassStairsAlt), brownGlassStairsAlt);

    // Green
    blockList.add(greenGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_green_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibGreenGlassStairs = createItemBlock(new ItemBlock(greenGlassStairs), greenGlassStairs);

    blockList.add(greenGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_green_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibGreenGlassStairsAlt = createItemBlock(new ItemBlock(greenGlassStairsAlt), greenGlassStairsAlt);

    // Red
    blockList.add(redGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_red_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibRedGlassStairs = createItemBlock(new ItemBlock(redGlassStairs), redGlassStairs);

    blockList.add(redGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_red_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibRedGlassStairsAlt = createItemBlock(new ItemBlock(redGlassStairsAlt), redGlassStairsAlt);

    // Black
    blockList.add(blackGlassStairs = new ModStairs(Blocks.STAINED_GLASS, "glass_black_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"));
    ibBlackGlassStairs = createItemBlock(new ItemBlock(blackGlassStairs), blackGlassStairs);

    blockList.add(blackGlassStairsAlt = new ModStairs(Blocks.STAINED_GLASS, "glass_black_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibBlackGlassStairsAlt = createItemBlock(new ItemBlock(blackGlassStairsAlt), blackGlassStairsAlt);

    // Lighted
    blockList.add(blackLightedGlassBlock = new ModBlock(Material.GLASS, "black_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibBlackLightedGlassBlock = createItemBlock(new ItemBlock(blackLightedGlassBlock), blackLightedGlassBlock);

    blockList.add(blueLightedGlassBlock = new ModBlock(Material.GLASS, "blue_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibBlueLightedGlassBlock = createItemBlock(new ItemBlock(blueLightedGlassBlock), blueLightedGlassBlock);

    blockList.add(brownLightedGlassBlock = new ModBlock(Material.GLASS, "brown_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibBrownLightedGlassBlock = createItemBlock(new ItemBlock(brownLightedGlassBlock), brownLightedGlassBlock);

    blockList.add(cyanLightedGlassBlock = new ModBlock(Material.GLASS, "cyan_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibCyanLightedGlassBlock = createItemBlock(new ItemBlock(cyanLightedGlassBlock), cyanLightedGlassBlock);

    blockList.add(grayLightedGlassBlock = new ModBlock(Material.GLASS, "gray_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibGrayLightedGlassBlock = createItemBlock(new ItemBlock(grayLightedGlassBlock), grayLightedGlassBlock);

    blockList.add(greenLightedGlassBlock = new ModBlock(Material.GLASS, "green_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibGreenLightedGlassBlock = createItemBlock(new ItemBlock(greenLightedGlassBlock), greenLightedGlassBlock);

    blockList.add(lightBlueLightedGlassBlock = new ModBlock(Material.GLASS, "light_blue_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibLightBlueLightedGlassBlock = createItemBlock(new ItemBlock(lightBlueLightedGlassBlock), lightBlueLightedGlassBlock);

    blockList.add(limeLightedGlassBlock = new ModBlock(Material.GLASS, "lime_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibLimeLightedGlassBlock = createItemBlock(new ItemBlock(limeLightedGlassBlock), limeLightedGlassBlock);

    blockList.add(magentaLightedGlassBlock = new ModBlock(Material.GLASS, "magenta_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibMagentaLightedGlassBlock = createItemBlock(new ItemBlock(magentaLightedGlassBlock), magentaLightedGlassBlock);

    blockList.add(orangeLightedGlassBlock = new ModBlock(Material.GLASS, "orange_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibOrangeLightedGlassBlock = createItemBlock(new ItemBlock(orangeLightedGlassBlock), orangeLightedGlassBlock);

    blockList.add(pinkLightedGlassBlock = new ModBlock(Material.GLASS, "pink_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibPinkLightedGlassBlock = createItemBlock(new ItemBlock(pinkLightedGlassBlock), pinkLightedGlassBlock);

    blockList.add(purpleLightedGlassBlock = new ModBlock(Material.GLASS, "purple_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibPurpleLightedGlassBlock = createItemBlock(new ItemBlock(purpleLightedGlassBlock), purpleLightedGlassBlock);

    blockList.add(redLightedGlassBlock = new ModBlock(Material.GLASS, "red_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibRedLightedGlassBlock = createItemBlock(new ItemBlock(redLightedGlassBlock), redLightedGlassBlock);

    blockList.add(silverLightedGlassBlock = new ModBlock(Material.GLASS, "silver_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibSilverLightedGlassBlock = createItemBlock(new ItemBlock(silverLightedGlassBlock), silverLightedGlassBlock);

    blockList.add(whiteLightedGlassBlock = new ModBlock(Material.GLASS, "white_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibWhiteLightedGlassBlock = createItemBlock(new ItemBlock(whiteLightedGlassBlock), whiteLightedGlassBlock);

    blockList.add(yellowLightedGlassBlock = new ModBlock(Material.GLASS, "yellow_lighted_glass_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F));
    ibYellowLightedGlassBlock = createItemBlock(new ItemBlock(yellowLightedGlassBlock), yellowLightedGlassBlock);

    // Granite
    blockList.add(granitePolishedDoor = new ModBlockDoor(Material.ROCK, "granite_polished_door", 2.5F, 35F, 1, "pickaxe"));

    blockList.add(granitePolishedLamp = new ModLamp(Material.ROCK, "granite_polished_lamp", CreativeTabs.DECORATIONS, 2F, 30F, 1, "pickaxe", 14 / 15F, 1.82D));
    ibGranitePolishedLamp = createItemBlock(new ItemBlock(granitePolishedLamp), granitePolishedLamp);

    blockList.add(granitePolishedLantern = new ModLantern(Material.ROCK, "granite_polished_lantern", CreativeTabs.DECORATIONS, 2F, 18F, 1, "pickaxe", 13 / 15F, 5, 20, 0.5D));
    ibGranitePolishedLantern = createItemBlock(new ItemBlock(granitePolishedLantern), granitePolishedLantern);

    blockList.add(granitePolishedStairs = new ModStairs(Blocks.STONE, "granite_polished_stairs", CreativeTabs.BUILDING_BLOCKS, 2.5F, 32F, 1, "pickaxe"));
    ibGranitePolishedStairs = createItemBlock(new ItemBlock(granitePolishedStairs), granitePolishedStairs);

    blockList.add(granitePolishedStairsAlt = new ModStairs(Blocks.STONE, "granite_polished_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.7F, 26F, 1, "pickaxe"));
    ibGranitePolishedStairsAlt = createItemBlock(new ItemBlock(granitePolishedStairsAlt), granitePolishedStairsAlt);

    // Hardened Clay
    // Regular
    blockList.add(hardenedClayDoor = new ModBlockDoor(Material.CLAY, "hardened_clay_door", 2F, 21F, 0, "pickaxe"));

    blockList.add(terracottaStairs = new ModStairs(Blocks.HARDENED_CLAY, "terracotta_stairs", CreativeTabs.BUILDING_BLOCKS, 2.2F, 21F, 0, "pickaxe"));
    ibTerracottaStairs = createItemBlock(new ItemBlock(terracottaStairs), terracottaStairs);

    blockList.add(terracottaStairsAlt = new ModStairs(Blocks.HARDENED_CLAY, "terracotta_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.5F, 16F, 0, "pickaxe"));
    ibTerracottaStairsAlt = createItemBlock(new ItemBlock(terracottaStairsAlt), terracottaStairsAlt);

    // Jungle Wood
    blockList.add(jungleWoodStairsAlt = new ModStairs(Blocks.PLANKS, "jungle_wood_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.5F, 3F, 0, "axe"));
    ibJungleWoodStairsAlt = createItemBlock(new ItemBlock(jungleWoodStairsAlt), jungleWoodStairsAlt);

    blockList.add(jungleWoodCraftingTable = new ModCraftingTable("jungle_wood_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"));
    ibJungleWoodCraftingTable = createItemBlock(new ItemBlock(jungleWoodCraftingTable), jungleWoodCraftingTable);

    // Oak
    blockList.add(oakStableDoor = new ModBlockDoor(Material.WOOD, "oak_stable_door", 1.9F, 5F, 0, "axe"));

    blockList.add(oakLightBox = new ModBlock(Material.WOOD, "oak_light_box", CreativeTabs.DECORATIONS, 2F, 6F, 0, "axe", 12 / 15F, 5, 20));
    ibOakLightBox = createItemBlock(new ItemBlock(oakLightBox), oakLightBox);

    blockList.add(oakLantern = new ModLantern(Material.WOOD, "oak_lantern", CreativeTabs.DECORATIONS, 1F, 4F, 0, "axe", 13 / 15F, 5, 20, 0.4D));
    ibOakLantern = createItemBlock(new ItemBlock(oakLantern), oakLantern);

    blockList.add(oakLamp = new ModLamp(Material.WOOD, "oak_lamp", CreativeTabs.DECORATIONS, 1.2F, 4F, 0, "axe", 14 / 15F, 5, 20, 1.9D));
    ibOakLamp = createItemBlock(new ItemBlock(oakLamp), oakLamp);

    blockList.add(oakStairsAlt = new ModStairs(Blocks.PLANKS, "oak_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.4F, 2F, 0, "axe"));
    ibOakStairsAlt = createItemBlock(new ItemBlock(oakStairsAlt), oakStairsAlt);

    blockList.add(oakCraftingTable = new ModCraftingTable("oak_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"));
    ibOakCraftingTable = createItemBlock(new ItemBlock(oakCraftingTable), oakCraftingTable);

    // Obsidian
    blockList.add(polishedObsidianBlock = new ModBlock(Material.ROCK, "polished_obsidian", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    ibPolishedObsidianBlock = createItemBlock(new ItemBlock(polishedObsidianBlock), polishedObsidianBlock);

    blockList.add(polishedObsidianDoor = new ModBlockDoor(Material.ROCK, "polished_obsidian_door", 45F, 5300F, 3, "pickaxe"));

    blockList.add(polishedObsidianStairs = new ModStairs(Blocks.OBSIDIAN, "polished_obsidian_stairs", CreativeTabs.BUILDING_BLOCKS, 48F, 5500F, 3, "pickaxe"));
    ibPolishedObsidianStairs = createItemBlock(new ItemBlock(polishedObsidianStairs), polishedObsidianStairs);

    blockList.add(polishedObsidianStairsAlt = new ModStairs(Blocks.OBSIDIAN, "polished_obsidian_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 40F, 5000F, 3, "pickaxe"));
    ibPolishedObsidianStairsAlt = createItemBlock(new ItemBlock(polishedObsidianStairsAlt), polishedObsidianStairsAlt);

    // Spruce Wood
    blockList.add(spruceWoodStairsAlt = new ModStairs(Blocks.PLANKS, "spruce_wood_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.5F, 3F, 0, "axe"));
    ibSpruceWoodStairsAlt = createItemBlock(new ItemBlock(spruceWoodStairsAlt), spruceWoodStairsAlt);

    blockList.add(spruceWoodCraftingTable = new ModCraftingTable("spruce_wood_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"));
    ibSpruceWoodCraftingTable = createItemBlock(new ItemBlock(spruceWoodCraftingTable), spruceWoodCraftingTable);

    // Advanced Workbench
    // advancedWorkbench = new ModAdvancedWorkbench(Material.WOOD);

    // Ores
    blockList.add(copperOre = new ModOre("copper_ore", 2F, 12F, 0));
    ibCopperOre = createItemBlock(new ItemBlock(copperOre), copperOre);

    blockList.add(tinOre = new ModOre("tin_ore", 2.1F, 13F, 1));
    ibTinOre = createItemBlock(new ItemBlock(tinOre), tinOre);

    blockList.add(platinumOre = new ModOre("platinum_ore", 2.5F, 14F, 1));
    ibPlatinumOre = createItemBlock(new ItemBlock(platinumOre), platinumOre);

    blockList.add(silverOre = new ModOre("silver_ore", 3F, 15F, 1));
    ibSilverOre = createItemBlock(new ItemBlock(silverOre), silverOre);

    blockList.add(mithrilOre = new ModOre("mithril_ore", 4F, 16F, 2));
    ibMithrilOre = createItemBlock(new ItemBlock(mithrilOre), mithrilOre);

    blockList.add(titaniumOre = new ModOre("titanium_ore", 5F, 20F, 2));
    ibTitaniumOre = createItemBlock(new ItemBlock(titaniumOre), titaniumOre);

    // Ore Blocks
    blockList.add(copperBlock = new ModBlock(Material.IRON, "copper_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"));
    ibCopperBlock = createItemBlock(new ItemBlock(copperBlock), copperBlock);

    blockList.add(tinBlock = new ModBlock(Material.IRON, "tin_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"));
    ibTinBlock = createItemBlock(new ItemBlock(tinBlock), tinBlock);

    blockList.add(bronzeBlock = new ModBlock(Material.IRON, "bronze_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"));
    ibBronzeBlock = createItemBlock(new ItemBlock(bronzeBlock), bronzeBlock);

    blockList.add(platinumBlock = new ModBlock(Material.IRON, "platinum_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"));
    ibPlatinumBlock = createItemBlock(new ItemBlock(platinumBlock), platinumBlock);

    blockList.add(silverBlock = new ModBlock(Material.IRON, "silver_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"));
    ibSilverBlock = createItemBlock(new ItemBlock(silverBlock), silverBlock);

    blockList.add(mithrilBlock = new ModBlock(Material.IRON, "mithril_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"));
    ibMithrilBlock = createItemBlock(new ItemBlock(mithrilBlock), mithrilBlock);

    blockList.add(titaniumBlock = new ModBlock(Material.IRON, "titanium_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"));
    ibTitaniumBlock = createItemBlock(new ItemBlock(titaniumBlock), titaniumBlock);

    blockList.add(celestialBronzeBlock = new ModBlock(Material.IRON, "celestial_bronze_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe", 5 / 15F));
    ibCelestialBronzeBlock = createItemBlock(new ItemBlock(celestialBronzeBlock), celestialBronzeBlock);

    blockList.add(imperialGoldBlock = new ModBlock(Material.IRON, "imperial_gold_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe", 7 / 15F));
    ibImperialGoldBlock = createItemBlock(new ItemBlock(imperialGoldBlock), imperialGoldBlock);

    blockList.add(steelBlock = new ModBlock(Material.IRON, "steel_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"));
    ibSteelBlock = createItemBlock(new ItemBlock(steelBlock), steelBlock);

    // Metal Bricks
    // Gold
    blockList.add(goldBrick = new ModBlock(Material.ROCK, "gold_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    ibGoldBrick = createItemBlock(new ItemBlock(goldBrick), goldBrick);

    blockList.add(goldBrickStairs = new ModStairs(Blocks.GOLD_BLOCK, "gold_brick_stairs", CreativeTabs.BUILDING_BLOCKS, 2.8F, 27F, 1, "pickaxe"));
    ibGoldBrickStairs = createItemBlock(new ItemBlock(goldBrickStairs), goldBrickStairs);

    blockList.add(goldBrickStairsAlt = new ModStairs(Blocks.GOLD_BLOCK, "gold_brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 20F, 1, "pickaxe"));
    ibGoldBrickStairsAlt = createItemBlock(new ItemBlock(goldBrickStairsAlt), goldBrickStairsAlt);
    // Copper
    blockList.add(copperBrick = new ModBlock(Material.ROCK, "copper_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    ibCopperBrick = createItemBlock(new ItemBlock(copperBrick), copperBrick);

    blockList.add(copperBrickStairs = new ModStairs(copperBlock, "copper_brick_stairs", CreativeTabs.BUILDING_BLOCKS, 2.8F, 27F, 1, "pickaxe"));
    ibCopperBrickStairs = createItemBlock(new ItemBlock(copperBrickStairs), copperBrickStairs);

    blockList.add(copperBrickStairsAlt = new ModStairs(copperBlock, "copper_brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 20F, 1, "pickaxe"));
    ibCopperBrickStairsAlt = createItemBlock(new ItemBlock(copperBrickStairsAlt), copperBrickStairsAlt);
    // Silver
    blockList.add(silverBrick = new ModBlock(Material.ROCK, "silver_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    ibSilverBrick = createItemBlock(new ItemBlock(silverBrick), silverBrick);

    blockList.add(silverBrickStairs = new ModStairs(silverBlock, "silver_brick_stairs", CreativeTabs.BUILDING_BLOCKS, 2.8F, 27F, 1, "pickaxe"));
    ibSilverBrickStairs = createItemBlock(new ItemBlock(silverBrickStairs), silverBrickStairs);

    blockList.add(silverBrickStairsAlt = new ModStairs(silverBlock, "silver_brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 20F, 1, "pickaxe"));
    ibSilverBrickStairsAlt = createItemBlock(new ItemBlock(silverBrickStairsAlt), silverBrickStairsAlt);
    // Obsidian
    blockList.add(polishedObsidianBrick = new ModBlock(Material.ROCK, "polished_obsidian_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    ibPolishedObsidianBrick = createItemBlock(new ItemBlock(polishedObsidianBrick), polishedObsidianBrick);

    blockList.add(polishedObsidianBrickStairs = new ModStairs(polishedObsidianBlock, "polished_obsidian_brick_stairs", CreativeTabs.BUILDING_BLOCKS, 2.8F, 27F, 1, "pickaxe"));
    ibPolishedObsidianBrickStairs = createItemBlock(new ItemBlock(polishedObsidianBrickStairs), polishedObsidianBrickStairs);

    blockList.add(polishedObsidianBrickStairsAlt = new ModStairs(polishedObsidianBlock, "polished_obsidian_brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 20F, 1, "pickaxe"));
    ibPolishedObsidianBrickStairsAlt = createItemBlock(new ItemBlock(polishedObsidianBrickStairsAlt), polishedObsidianBrickStairsAlt);
    
    ///////////////////////////////////////////
    //Register Blocks
    for(Block block : blockList) {
      event.getRegistry().register(block);
    }
  }
  
  private static ItemBlock createItemBlock(ItemBlock iBlock, Block block) {
    iBlock.setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getUnlocalizedName());
    itemBlockList.add(iBlock);

    return iBlock;
  }

  private static ItemBlock createItemBlockWithoutAddingToList(ItemBlock iBlock, Block block) {
    iBlock.setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getUnlocalizedName());
    itemBlockList.add(iBlock);

    return iBlock;
  }
  /////////////////////////////////////////////////////////////////////////////////////////////

  public static void initItems(RegistryEvent.Register<Item> event) {
    // iTutItem = new ItemTutItem("tut_item", CreativeTabs.MATERIALS);
    // Andesite
    iAndesitePolishedDoor = createItem(new ModItemDoor(andesitePolishedDoor, "andesite_polished_door", 64), event);

    // Birch
    iBirchStableDoor = createItem(new ModItemDoor(birchStableDoor, "birch_stable_door", 64), event);

    // Brick
    iBrickDoor = createItem(new ModItemDoor(brickDoor, "brick_door", 64), event);

    // Cobblestone
    iCobblestoneDoor = createItem(new ModItemDoor(cobblestoneDoor, "cobblestone_door", 64), event);

    // Dark Oak
    iDarkOakBed = createItem(new ModItemBed(darkOakBed, "dark_oak_bed", 64), event);

    // Diorite
    iDioritePolishedDoor = createItem(new ModItemDoor(dioritePolishedDoor, "diorite_polished_door", 64), event);
    iDioritePolishedBed = createItem(new ModItemBed(dioritePolishedBed, "diorite_polished_bed", 64), event);

    // Glass
    // Regular
    iGlassDoor = createItem(new ModItemDoor(glassDoor, "glass_door", 64), event);

    // Granite
    iGranitePolishedDoor = createItem(new ModItemDoor(granitePolishedDoor, "granite_polished_door", 64), event);

    // Hardened Clay
    // Regular
    iHardenedClayDoor = createItem(new ModItemDoor(hardenedClayDoor, "hardened_clay_door", 64), event);

    // Oak
    iOakStableDoor = createItem(new ModItemDoor(oakStableDoor, "oak_stable_door", 64), event);

    // Obsidian
    iPolishedObsidianDoor = createItem(new ModItemDoor(polishedObsidianDoor, "polished_obsidian_door", 64), event);

    // Ingots
    iCopperIngot = createItem(new ModItem("copper_ingot", CreativeTabs.MATERIALS), event);
    iTinIngot = createItem(new ModItem("tin_ingot", CreativeTabs.MATERIALS), event);
    iBronzeIngot = createItem(new ModItem("bronze_ingot", CreativeTabs.MATERIALS), event);
    iPlatinumIngot = createItem(new ModItem("platinum_ingot", CreativeTabs.MATERIALS), event);
    iSilverIngot = createItem(new ModItem("silver_ingot", CreativeTabs.MATERIALS), event);
    iTitaniumIngot = createItem(new ModItem("titanium_ingot", CreativeTabs.MATERIALS), event);
    iSteelIngot = createItem(new ModItem("steel_ingot", CreativeTabs.MATERIALS), event);
    iMithrilIngot = createItem(new ModItem("mithril_ingot", CreativeTabs.MATERIALS), event);
    iCelestialBronzeIngot = createItem(new ModItem("celestial_bronze_ingot", CreativeTabs.MATERIALS), event);
    iImperialGoldIngot = createItem(new ModItem("imperial_gold_ingot", CreativeTabs.MATERIALS), event);

    // Ore Nuggets
    iBronzeNuggets = createItem(new ModItem("bronze_nuggets", CreativeTabs.MATERIALS), event);
    iCelestialBronzeNuggets = createItem(new ModItem("celestial_bronze_nuggets", CreativeTabs.MATERIALS), event);
    iImperialGoldNuggets = createItem(new ModItem("imperial_gold_nuggets", CreativeTabs.MATERIALS), event);

    // Pickaxes
    iBronzePickaxe = createItem(new ModPickaxe("bronze_pickaxe", ModTool.ToolMaterial.BRONZE, 1.0F, -2.4F), event);
    iSteelPickaxe = createItem(new ModPickaxe("steel_pickaxe", ModTool.ToolMaterial.STEEL, 1.0F, -2.4F), event);
    iMithrilPickaxe = createItem(new ModPickaxe("mithril_pickaxe", ModTool.ToolMaterial.MITHRIL, 0.7F, -2.6F), event);
    iCelestialBronzePickaxe = createItem(
        new ModPickaxe("celestial_bronze_pickaxe", ModTool.ToolMaterial.CELESTIAL_BRONZE, 1.0F, -2.4F), event);
    iImperialGoldPickaxe = createItem(
        new ModPickaxe("imperial_gold_pickaxe", ModTool.ToolMaterial.IMPERIAL_GOLD, 1.0F, -2.4F), event);
    iObsidianPickaxe = createItem(new ModPickaxe("obsidian_pickaxe", ModTool.ToolMaterial.OBSIDIAN, 2.0F, -1.0F),
        event);

    // Axes
    iBronzeAxe = createItem(new ModAxe("bronze_axe", ModTool.ToolMaterial.BRONZE, 7.0F, -3.15F), event);
    iSteelAxe = createItem(new ModAxe("steel_axe", ModTool.ToolMaterial.STEEL, 8.3F, -3.0F), event);
    iMithrilAxe = createItem(new ModAxe("mithril_axe", ModTool.ToolMaterial.MITHRIL, 7.0F, -2.5F), event);
    iCelestialBronzeAxe = createItem(
        new ModAxe("celestial_bronze_axe", ModTool.ToolMaterial.CELESTIAL_BRONZE, 11F, -3.8F), event);
    iImperialGoldAxe = createItem(new ModAxe("imperial_gold_axe", ModTool.ToolMaterial.IMPERIAL_GOLD, 8.0F, -2.6F),
        event);
    iObsidianAxe = createItem(new ModAxe("obsidian_axe", ModTool.ToolMaterial.OBSIDIAN, 16F, -1.5F), event);

    // Shovels
    iBronzeShovel = createItem(new ModSpade("bronze_shovel", ModTool.ToolMaterial.BRONZE), event);
    iSteelShovel = createItem(new ModSpade("steel_shovel", ModTool.ToolMaterial.STEEL), event);
    iMithrilShovel = createItem(new ModSpade("mithril_shovel", ModTool.ToolMaterial.MITHRIL), event);
    iCelestialBronzeShovel = createItem(new ModSpade("celestial_bronze_shovel", ModTool.ToolMaterial.CELESTIAL_BRONZE),
        event);
    iImperialGoldShovel = createItem(new ModSpade("imperial_gold_shovel", ModTool.ToolMaterial.IMPERIAL_GOLD), event);
    iObsidianShovel = createItem(new ModSpade("obsidian_shovel", ModTool.ToolMaterial.OBSIDIAN), event);

    // Hoes
    iBronzeHoe = createItem(new ModHoe("bronze_hoe", ModTool.ToolMaterial.BRONZE), event);
    iSteelHoe = createItem(new ModHoe("steel_hoe", ModTool.ToolMaterial.STEEL), event);
    iMithrilHoe = createItem(new ModHoe("mithril_hoe", ModTool.ToolMaterial.MITHRIL), event);
    iCelestialBronzeHoe = createItem(new ModHoe("celestial_bronze_hoe", ModTool.ToolMaterial.CELESTIAL_BRONZE), event);
    iImperialGoldHoe = createItem(new ModHoe("imperial_gold_hoe", ModTool.ToolMaterial.IMPERIAL_GOLD), event);
    iObsidianHoe = createItem(new ModHoe("obsidian_hoe", ModTool.ToolMaterial.OBSIDIAN), event);

    // Swords
    iBronzeSword = createItem(new ModSword("bronze_sword", ModTool.ToolMaterial.BRONZE), event);
    iSilverSword = createItem(new ModSword("silver_sword", ModTool.ToolMaterial.SILVER), event);
    iSteelSword = createItem(new ModSword("steel_sword", ModTool.ToolMaterial.STEEL), event);
    iMithrilSword = createItem(new ModSword("mithril_sword", ModTool.ToolMaterial.MITHRIL), event);
    iCelestialBronzeSword = createItem(new ModSword("celestial_bronze_sword", ModTool.ToolMaterial.CELESTIAL_BRONZE),
        event);
    iImperialGoldSword = createItem(new ModSword("imperial_gold_sword", ModTool.ToolMaterial.IMPERIAL_GOLD), event);
    iObsidianSword = createItem(new ModSword("obsidian_sword", ModTool.ToolMaterial.OBSIDIAN), event);

    for (ItemBlock iBlock : itemBlockList) {
      createItemBlock(iBlock, event);
    }
  }

  private static ModItemDoor createItem(ModItemDoor item, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(item);

    return item;
  }

  private static ModItemBed createItem(ModItemBed item, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(item);

    return item;
  }

  private static ModItem createItem(ModItem item, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(item);

    return item;
  }

  private static ModPickaxe createItem(ModPickaxe item, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(item);

    return item;
  }

  private static ModAxe createItem(ModAxe item, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(item);

    return item;
  }

  private static ModSpade createItem(ModSpade item, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(item);

    return item;
  }

  private static ModSword createItem(ModSword item, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(item);

    return item;
  }

  private static ModHoe createItem(ModHoe item, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(item);

    return item;
  }

  private static ItemBlock createItemBlock(ItemBlock block, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(block);

    return block;
  }

  public static void registerModels() {
    // Andesite
    register(iAndesitePolishedDoor);
    // Birch
    register(iBirchStableDoor);
    // Brick
    register(iBrickDoor);
    // Cobblestone
    register(iCobblestoneDoor);
    // Dark Oak
    register(iDarkOakBed);
    // Diorite
    register(iDioritePolishedDoor);
    register(iDioritePolishedBed);
    // Glass
    // Regular
    register(iGlassDoor);

    // Granite
    register(iGranitePolishedDoor);

    // Hardened Clay
    // Regular
    register(iHardenedClayDoor);
    // Oak
    register(iOakStableDoor);
    // Obsidian
    register(iPolishedObsidianDoor);

    ////////////////// Item Block Registration
    for (ItemBlock iBlock : itemBlockList) {
      register(iBlock);
    }
    //////////////////
    
    //Campfire
    registerVariant(ibCampfire, 0, "oak");
    registerVariant(ibLitCampfire, 0, "oak");
    registerVariant(ibCampfire, 4, "acacia");
    registerVariant(ibLitCampfire, 4, "acacia");
    registerVariant(ibCampfire, 1, "spruce");
    registerVariant(ibLitCampfire, 1, "spruce");
    registerVariant(ibCampfire, 2, "birch");
    registerVariant(ibLitCampfire, 2, "birch");
    registerVariant(ibCampfire, 3, "jungle");
    registerVariant(ibLitCampfire, 3, "jungle");
    registerVariant(ibCampfire, 5, "dark_oak");
    registerVariant(ibLitCampfire, 5, "dark_oak");

    // Ingots
    register(iCopperIngot);
    register(iTinIngot);
    register(iBronzeIngot);
    register(iPlatinumIngot);
    register(iSilverIngot);
    register(iMithrilIngot);
    register(iTitaniumIngot);
    register(iSteelIngot);
    register(iCelestialBronzeIngot);
    register(iImperialGoldIngot);

    // Ore Nuggets
    register(iBronzeNuggets);
    register(iCelestialBronzeNuggets);
    register(iImperialGoldNuggets);

    // Pickaxe
    register(iBronzePickaxe);
    register(iSteelPickaxe);
    register(iMithrilPickaxe);
    register(iCelestialBronzePickaxe);
    register(iImperialGoldPickaxe);
    register(iObsidianPickaxe);

    // Axe
    register(iBronzeAxe);
    register(iSteelAxe);
    register(iMithrilAxe);
    register(iCelestialBronzeAxe);
    register(iImperialGoldAxe);
    register(iObsidianAxe);

    // Shovel
    register(iBronzeShovel);
    register(iSteelShovel);
    register(iMithrilShovel);
    register(iCelestialBronzeShovel);
    register(iImperialGoldShovel);
    register(iObsidianShovel);

    // Shovel
    register(iBronzeHoe);
    register(iSteelHoe);
    register(iMithrilHoe);
    register(iCelestialBronzeHoe);
    register(iImperialGoldHoe);
    register(iObsidianHoe);

    // Sword
    register(iBronzeSword);
    register(iSilverSword);
    register(iSteelSword);
    register(iMithrilSword);
    register(iCelestialBronzeSword);
    register(iImperialGoldSword);
    register(iObsidianSword);
  }

  private static void register(Item item) {
    register(item, 0);
  }

  private static void register(Item item, int meta) {
    registerVariant(item, meta, "normal");
  }
  private static void registerVariant(Item item, int meta, String metaName) {
    register(item, meta, metaName, item.getRegistryName().toString());
  }
  private static void register(Item item, int meta, String metaName, String resourceLocation) {
    ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(resourceLocation, metaName));
  }
  private static void register(Item item, int meta, String resourceLocation) {
    ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(resourceLocation));
  }

  public static void registerTileEntities() {
    GameRegistry.registerTileEntity(ModTileEntityChest.class, "mod_chests");
  }
  /////////////////////////////////////////////////////////////////////////////////////////////////////
  public static void removeRegisteredItems(RegistryEvent.Register<IRecipe> event) {
    ResourceLocation craftingTable = new ResourceLocation("minecraft:crafting_table");
    
    IForgeRegistryModifiable<IRecipe> modRegistry = (IForgeRegistryModifiable<IRecipe>) event.getRegistry();
    modRegistry.remove(craftingTable);
  }
  /////////////////////////////////////////////////////////////////////////////////////////////////////
  public enum GUI_ENUM {
    ALLOY_FURNACE, CRAFTING_TABLE, CAMPFIRE;
  }

}