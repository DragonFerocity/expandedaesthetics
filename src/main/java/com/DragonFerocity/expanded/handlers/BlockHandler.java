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
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.Instance;
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

  // Other Vars
  public static ArrayList<ItemBlock> itemBlockList = new ArrayList<>();

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
    alloyFurnace = createBlock(
        new ModAlloyFurnace(false, "alloy_furnace", CreativeTabs.BUILDING_BLOCKS, 3F, 40F, "pickaxe", 1), event);
    ibAlloyFurnace = createItemBlock(new ItemBlock(alloyFurnace), alloyFurnace);

    litAlloyFurnace = createBlock(
        new ModAlloyFurnace(true, "lit_alloy_furnace", CreativeTabs.BUILDING_BLOCKS, 3F, 40F, "pickaxe", 1), event);
    ibLitAlloyFurnace = createItemBlock(new ItemBlock(litAlloyFurnace), litAlloyFurnace);

    GameRegistry.registerTileEntity(ModTileEntityAlloyFurnace.class, "alloy_furnace_tile_entity");

    // Campfire
    // Oak
    campfire = createBlock(new ModCampfire(false, "campfire", CreativeTabs.DECORATIONS, 1F, 1F, "pickaxe", 0), event);
    ibCampfire = createItemBlockWithoutAddingToList(new ItemBlock(campfire), campfire);

    litCampfire = createBlock(new ModCampfire(true, "lit_campfire", CreativeTabs.DECORATIONS, 1F, 1F, "pickaxe", 0), event);
    ibLitCampfire = createItemBlockWithoutAddingToList(new ItemBlock(litCampfire), litCampfire);

    // Acacia Wood
    acaciaWoodStairsAlt = createBlock(
        new ModStairs(Blocks.PLANKS, "acacia_wood_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.5F, 3F, 0, "axe"),
        event);
    ibAcaciaWoodStairsAlt = createItemBlock(new ItemBlock(acaciaWoodStairsAlt), acaciaWoodStairsAlt);

    acaciaWoodCraftingTable = createBlock(
        new ModCraftingTable("acacia_wood_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"), event);
    ibAcaciaWoodCraftingTable = createItemBlock(new ItemBlock(acaciaWoodCraftingTable), acaciaWoodCraftingTable);

    // Andesite
    andesitePolishedDoor = createBlock(
        new ModBlockDoor(Material.ROCK, "andesite_polished_door", 2.5F, 35F, 1, "pickaxe"), event);

    andesitePolishedStairs = createBlock(
        new ModStairs(Blocks.STONE, "andesite_polished_stairs", CreativeTabs.BUILDING_BLOCKS, 3.0F, 38F, 1, "pickaxe"),
        event);
    ibAndesitePolishedStairs = createItemBlock(new ItemBlock(andesitePolishedStairs), andesitePolishedStairs);

    andesitePolishedStairsAlt = createBlock(new ModStairs(Blocks.STONE, "andesite_polished_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 2.0F, 30F, 1, "pickaxe"), event);
    ibAndesitePolishedStairsAlt = createItemBlock(new ItemBlock(andesitePolishedStairsAlt), andesitePolishedStairsAlt);

    // Birch
    birchStableDoor = createBlock(new ModBlockDoor(Material.WOOD, "birch_stable_door", 1.9F, 5F, 0, "pickaxe"), event);

    birchLamp = createBlock(
        new ModLamp(Material.WOOD, "birch_lamp", CreativeTabs.DECORATIONS, 1.2F, 4F, 0, "axe", 14 / 15F, 1.8D), event);
    ibBirchLamp = createItemBlock(new ItemBlock(birchLamp), birchLamp);

    birchStairsAlt = createBlock(
        new ModStairs(Blocks.PLANKS, "birch_wood_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.5F, 3F, 0, "axe"), event);
    ibBirchStairsAlt = createItemBlock(new ItemBlock(birchStairsAlt), birchStairsAlt);

    birchLantern = createBlock(new ModLantern(Material.WOOD, "birch_lantern", CreativeTabs.DECORATIONS, 1.0F, 3.5F, 1,
        "axe", 13 / 15F, 5, 20, 0.75D), event);
    ibBirchLantern = createItemBlock(new ItemBlock(birchLantern), birchLantern);

    birchCraftingTable = createBlock(
        new ModCraftingTable("birch_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"), event);
    ibBirchCraftingTable = createItemBlock(new ItemBlock(birchCraftingTable), birchCraftingTable);

    // Brick
    brickDoor = createBlock(new ModBlockDoor(Material.ROCK, "brick_door", 2.5F, 35F, 1, "pickaxe"), event);

    brickStairsAlt = createBlock(
        new ModStairs(Blocks.STONE, "brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 30F, 1, "pickaxe"), event);
    ibBrickStairsAlt = createItemBlock(new ItemBlock(brickStairsAlt), brickStairsAlt);

    // Cactus
    cutCactusBlock = createBlock(
        new ModBlock(Material.WOOD, "cut_cactus_block", CreativeTabs.BUILDING_BLOCKS, 0.4F, 2F, 0, "axe"), event);
    ibCutCactusBlock = createItemBlock(new ItemBlock(cutCactusBlock), cutCactusBlock);

    cutCactusStairs = createBlock(
        new ModStairs(Blocks.DIRT, "cut_cactus_stairs", CreativeTabs.BUILDING_BLOCKS, 0.3F, 1.7F, 0, "axe"), event);
    ibCutCactusStairs = createItemBlock(new ItemBlock(cutCactusStairs), cutCactusStairs);

    cutCactusStairsAlt = createBlock(
        new ModStairs(Blocks.DIRT, "cut_cactus_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1.3F, 0, "axe"), event);
    ibCutCactusStairsAlt = createItemBlock(new ItemBlock(cutCactusStairsAlt), cutCactusStairsAlt);

    cutCactusLamp = createBlock(
        new ModLamp(Material.WOOD, "cut_cactus_lamp", CreativeTabs.DECORATIONS, 0.5F, 2.1F, 1, "axe", 14 / 15F, 1.6D),
        event);
    ibCutCactusLamp = createItemBlock(new ItemBlock(cutCactusLamp), cutCactusLamp);

    cutCactusLantern = createBlock(new ModLantern(Material.WOOD, "cut_cactus_lantern", CreativeTabs.DECORATIONS, 0.25F,
        1.5F, 1, "axe", 13 / 15F, 5, 20, 0.75D), event);
    ibCutCactusLantern = createItemBlock(new ItemBlock(cutCactusLantern), cutCactusLantern);

    // Cobblestone
    cobblestoneDoor = createBlock(new ModBlockDoor(Material.ROCK, "cobblestone_door", 2F, 30F, 1, "pickaxe"), event);

    //cobblestoneChest = createBlock(
    //    new ModChest(ModChest.Type.COBBLESTONE, Material.ROCK, "cobblestone_chest", 2.5F, 12.5F, 1, "pickaxe"), event);
    //ibCobblestoneChest = createItemBlock(new ItemBlock(cobblestoneChest), cobblestoneChest);

    cobblestoneStairsAlt = createBlock(
        new ModStairs(Blocks.STONE, "cobblestone_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 30F, 1, "pickaxe"),
        event);
    ibCobblestoneStairsAlt = createItemBlock(new ItemBlock(cobblestoneStairsAlt), cobblestoneStairsAlt);

    // Dark Oak
    darkOakLamp = createBlock(
        new ModLamp(Material.WOOD, "dark_oak_lamp", CreativeTabs.DECORATIONS, 1.2F, 4F, 0, "axe", 14 / 15F, 1.8D),
        event);
    ibDarkOakLamp = createItemBlock(new ItemBlock(darkOakLamp), darkOakLamp);

    darkOakLantern = createBlock(new ModLantern(Material.WOOD, "dark_oak_lantern", CreativeTabs.DECORATIONS, 1F, 4F, 0,
        "axe", 13 / 15F, 5, 20, 0.7D), event);
    ibDarkOakLantern = createItemBlock(new ItemBlock(darkOakLantern), darkOakLantern);

    darkOakBed = createBlock(new ModBlockBed("dark_oak_bed", 2F, 8F, 0, "axe"), event);

    darkOakStairsAlt = createBlock(
        new ModStairs(Blocks.PLANKS, "dark_oak_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.7F, 3F, 0, "axe"), event);
    ibDarkOakStairsAlt = createItemBlock(new ItemBlock(darkOakStairsAlt), darkOakStairsAlt);

    darkOakCraftingTable = createBlock(
        new ModCraftingTable("dark_oak_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"), event);
    ibDarkOakCraftingTable = createItemBlock(new ItemBlock(darkOakCraftingTable), darkOakCraftingTable);

    // Diorite
    dioritePolishedDoor = createBlock(new ModBlockDoor(Material.ROCK, "diorite_polished_door", 2.5F, 35F, 1, "pickaxe"),
        event);

    dioritePolishedStairs = createBlock(
        new ModStairs(Blocks.STONE, "diorite_polished_stairs", CreativeTabs.BUILDING_BLOCKS, 2.5F, 35F, 1, "pickaxe"),
        event);
    ibDioritePolishedStairs = createItemBlock(new ItemBlock(dioritePolishedStairs), dioritePolishedStairs);

    dioritePolishedStairsAlt = createBlock(
        new ModStairs(Blocks.STONE, "diorite_polished_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2F, 25F, 1, "pickaxe"),
        event);
    ibDioritePolishedStairsAlt = createItemBlock(new ItemBlock(dioritePolishedStairsAlt), dioritePolishedStairsAlt);

    dioritePolishedLantern = createBlock(new ModLantern(Material.ROCK, "diorite_polished_lantern",
        CreativeTabs.DECORATIONS, 2F, 18F, 1, "pickaxe", 13 / 15F, 5, 20, 0.6D), event);
    ibDioritePolishedLantern = createItemBlock(new ItemBlock(dioritePolishedLantern), dioritePolishedLantern);

    dioritePolishedLamp = createBlock(new ModLamp(Material.ROCK, "diorite_polished_lamp", CreativeTabs.DECORATIONS, 2F,
        30F, 1, "pickaxe", 14 / 15F, 1.9D), event);
    ibDioritePolishedLamp = createItemBlock(new ItemBlock(dioritePolishedLamp), dioritePolishedLamp);

    dioritePolishedBed = createBlock(new ModBlockBed("diorite_polished_bed", 3F, 40F, 1, "pickaxe"), event);

    //dioritePolishedChest = createBlock(
    //    new ModChest(ModChest.Type.POLISHED_DIORITE, Material.ROCK, "diorite_polished_chest", 4F, 40F, 1, "pickaxe"),
    //    event);
    //ibDioritePolishedChest = createItemBlock(new ItemBlock(dioritePolishedChest), dioritePolishedChest);

    // Glass
    // Regular
    glassDoor = createBlock(new ModBlockDoor(Material.GLASS, "glass_door", 0.3F, 1.5F, 0, "pickaxe"), event);

    glassStairs = createBlock(
        new ModStairs(Blocks.GLASS, "glass_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"), event);
    ibGlassStairs = createItemBlock(new ItemBlock(glassStairs), glassStairs);

    glassStairsAlt = createBlock(
        new ModStairs(Blocks.GLASS, "glass_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibGlassStairsAlt = createItemBlock(new ItemBlock(glassStairsAlt), glassStairsAlt);

    // White
    whiteGlassStairs = createBlock(
        new ModStairs(Blocks.GLASS, "glass_white_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"), event);
    ibWhiteGlassStairs = createItemBlock(new ItemBlock(whiteGlassStairs), whiteGlassStairs);

    whiteGlassStairsAlt = createBlock(
        new ModStairs(Blocks.GLASS, "glass_white_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"),
        event);
    ibWhiteGlassStairsAlt = createItemBlock(new ItemBlock(whiteGlassStairsAlt), whiteGlassStairsAlt);

    // Orange
    orangeGlassStairs = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_orange_stairs",
        CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"), event);
    ibOrangeGlassStairs = createItemBlock(new ItemBlock(orangeGlassStairs), orangeGlassStairs);

    orangeGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_orange_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibOrangeGlassStairsAlt = createItemBlock(new ItemBlock(orangeGlassStairsAlt), orangeGlassStairsAlt);

    // Magenta
    magentaGlassStairs = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_magenta_stairs",
        CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"), event);
    ibMagentaGlassStairs = createItemBlock(new ItemBlock(magentaGlassStairs), magentaGlassStairs);

    magentaGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_magenta_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibMagentaGlassStairsAlt = createItemBlock(new ItemBlock(magentaGlassStairsAlt), magentaGlassStairsAlt);

    // Light Blue
    lightBlueGlassStairs = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_light_blue_stairs",
        CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"), event);
    ibLightBlueGlassStairs = createItemBlock(new ItemBlock(lightBlueGlassStairs), lightBlueGlassStairs);

    lightBlueGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_light_blue_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibLightBlueGlassStairsAlt = createItemBlock(new ItemBlock(lightBlueGlassStairsAlt), lightBlueGlassStairsAlt);

    // Yellow
    yellowGlassStairs = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_yellow_stairs",
        CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"), event);
    ibYellowGlassStairs = createItemBlock(new ItemBlock(yellowGlassStairs), yellowGlassStairs);

    yellowGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_yellow_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibYellowGlassStairsAlt = createItemBlock(new ItemBlock(yellowGlassStairsAlt), yellowGlassStairsAlt);

    // Lime
    limeGlassStairs = createBlock(
        new ModStairs(Blocks.STAINED_GLASS, "glass_lime_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"),
        event);
    ibLimeGlassStairs = createItemBlock(new ItemBlock(limeGlassStairs), limeGlassStairs);

    limeGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_lime_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibLimeGlassStairsAlt = createItemBlock(new ItemBlock(limeGlassStairsAlt), limeGlassStairsAlt);

    // Pink
    pinkGlassStairs = createBlock(
        new ModStairs(Blocks.STAINED_GLASS, "glass_pink_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"),
        event);
    ibPinkGlassStairs = createItemBlock(new ItemBlock(pinkGlassStairs), pinkGlassStairs);

    pinkGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_pink_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibPinkGlassStairsAlt = createItemBlock(new ItemBlock(pinkGlassStairsAlt), pinkGlassStairsAlt);

    // Gray
    grayGlassStairs = createBlock(
        new ModStairs(Blocks.STAINED_GLASS, "glass_gray_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"),
        event);
    ibGrayGlassStairs = createItemBlock(new ItemBlock(grayGlassStairs), grayGlassStairs);

    grayGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_gray_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibGrayGlassStairsAlt = createItemBlock(new ItemBlock(grayGlassStairsAlt), grayGlassStairsAlt);

    // Silver
    silverGlassStairs = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_silver_stairs",
        CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"), event);
    ibSilverGlassStairs = createItemBlock(new ItemBlock(silverGlassStairs), silverGlassStairs);

    silverGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_silver_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibSilverGlassStairsAlt = createItemBlock(new ItemBlock(silverGlassStairsAlt), silverGlassStairsAlt);

    // Cyan
    cyanGlassStairs = createBlock(
        new ModStairs(Blocks.STAINED_GLASS, "glass_cyan_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"),
        event);
    ibCyanGlassStairs = createItemBlock(new ItemBlock(cyanGlassStairs), cyanGlassStairs);

    cyanGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_cyan_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibCyanGlassStairsAlt = createItemBlock(new ItemBlock(cyanGlassStairsAlt), cyanGlassStairsAlt);

    // Purple
    purpleGlassStairs = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_purple_stairs",
        CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"), event);
    ibPurpleGlassStairs = createItemBlock(new ItemBlock(purpleGlassStairs), purpleGlassStairs);

    purpleGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_purple_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibPurpleGlassStairsAlt = createItemBlock(new ItemBlock(purpleGlassStairsAlt), purpleGlassStairsAlt);

    // Blue
    blueGlassStairs = createBlock(
        new ModStairs(Blocks.STAINED_GLASS, "glass_blue_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"),
        event);
    ibBlueGlassStairs = createItemBlock(new ItemBlock(blueGlassStairs), blueGlassStairs);

    blueGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_blue_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibBlueGlassStairsAlt = createItemBlock(new ItemBlock(blueGlassStairsAlt), blueGlassStairsAlt);

    // Brown
    brownGlassStairs = createBlock(
        new ModStairs(Blocks.STAINED_GLASS, "glass_brown_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"),
        event);
    ibBrownGlassStairs = createItemBlock(new ItemBlock(brownGlassStairs), brownGlassStairs);

    brownGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_brown_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibBrownGlassStairsAlt = createItemBlock(new ItemBlock(brownGlassStairsAlt), brownGlassStairsAlt);

    // Green
    greenGlassStairs = createBlock(
        new ModStairs(Blocks.STAINED_GLASS, "glass_green_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"),
        event);
    ibGreenGlassStairs = createItemBlock(new ItemBlock(greenGlassStairs), greenGlassStairs);

    greenGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_green_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibGreenGlassStairsAlt = createItemBlock(new ItemBlock(greenGlassStairsAlt), greenGlassStairsAlt);

    // Red
    redGlassStairs = createBlock(
        new ModStairs(Blocks.STAINED_GLASS, "glass_red_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"),
        event);
    ibRedGlassStairs = createItemBlock(new ItemBlock(redGlassStairs), redGlassStairs);

    redGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_red_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibRedGlassStairsAlt = createItemBlock(new ItemBlock(redGlassStairsAlt), redGlassStairsAlt);

    // Black
    blackGlassStairs = createBlock(
        new ModStairs(Blocks.STAINED_GLASS, "glass_black_stairs", CreativeTabs.BUILDING_BLOCKS, 0.6F, 2F, 0, "pickaxe"),
        event);
    ibBlackGlassStairs = createItemBlock(new ItemBlock(blackGlassStairs), blackGlassStairs);

    blackGlassStairsAlt = createBlock(new ModStairs(Blocks.STAINED_GLASS, "glass_black_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"), event);
    ibBlackGlassStairsAlt = createItemBlock(new ItemBlock(blackGlassStairsAlt), blackGlassStairsAlt);

    // Lighted
    blackLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "black_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibBlackLightedGlassBlock = createItemBlock(new ItemBlock(blackLightedGlassBlock), blackLightedGlassBlock);

    blueLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "blue_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibBlueLightedGlassBlock = createItemBlock(new ItemBlock(blueLightedGlassBlock), blueLightedGlassBlock);

    brownLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "brown_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibBrownLightedGlassBlock = createItemBlock(new ItemBlock(brownLightedGlassBlock), brownLightedGlassBlock);

    cyanLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "cyan_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibCyanLightedGlassBlock = createItemBlock(new ItemBlock(cyanLightedGlassBlock), cyanLightedGlassBlock);

    grayLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "gray_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibGrayLightedGlassBlock = createItemBlock(new ItemBlock(grayLightedGlassBlock), grayLightedGlassBlock);

    greenLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "green_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibGreenLightedGlassBlock = createItemBlock(new ItemBlock(greenLightedGlassBlock), greenLightedGlassBlock);

    lightBlueLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "light_blue_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibLightBlueLightedGlassBlock = createItemBlock(new ItemBlock(lightBlueLightedGlassBlock),
        lightBlueLightedGlassBlock);

    limeLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "lime_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibLimeLightedGlassBlock = createItemBlock(new ItemBlock(limeLightedGlassBlock), limeLightedGlassBlock);

    magentaLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "magenta_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibMagentaLightedGlassBlock = createItemBlock(new ItemBlock(magentaLightedGlassBlock), magentaLightedGlassBlock);

    orangeLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "orange_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibOrangeLightedGlassBlock = createItemBlock(new ItemBlock(orangeLightedGlassBlock), orangeLightedGlassBlock);

    pinkLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "pink_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibPinkLightedGlassBlock = createItemBlock(new ItemBlock(pinkLightedGlassBlock), pinkLightedGlassBlock);

    purpleLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "purple_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibPurpleLightedGlassBlock = createItemBlock(new ItemBlock(purpleLightedGlassBlock), purpleLightedGlassBlock);

    redLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "red_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibRedLightedGlassBlock = createItemBlock(new ItemBlock(redLightedGlassBlock), redLightedGlassBlock);

    silverLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "silver_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibSilverLightedGlassBlock = createItemBlock(new ItemBlock(silverLightedGlassBlock), silverLightedGlassBlock);

    whiteLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "white_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibWhiteLightedGlassBlock = createItemBlock(new ItemBlock(whiteLightedGlassBlock), whiteLightedGlassBlock);

    yellowLightedGlassBlock = createBlock(new ModBlock(Material.GLASS, "yellow_lighted_glass_block",
        CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe", 14 / 15F), event);
    ibYellowLightedGlassBlock = createItemBlock(new ItemBlock(yellowLightedGlassBlock), yellowLightedGlassBlock);

    // Granite
    granitePolishedDoor = createBlock(new ModBlockDoor(Material.ROCK, "granite_polished_door", 2.5F, 35F, 1, "pickaxe"),
        event);

    granitePolishedLamp = createBlock(new ModLamp(Material.ROCK, "granite_polished_lamp", CreativeTabs.DECORATIONS, 2F,
        30F, 1, "pickaxe", 14 / 15F, 1.82D), event);
    ibGranitePolishedLamp = createItemBlock(new ItemBlock(granitePolishedLamp), granitePolishedLamp);

    granitePolishedLantern = createBlock(new ModLantern(Material.ROCK, "granite_polished_lantern",
        CreativeTabs.DECORATIONS, 2F, 18F, 1, "pickaxe", 13 / 15F, 5, 20, 0.5D), event);
    ibGranitePolishedLantern = createItemBlock(new ItemBlock(granitePolishedLantern), granitePolishedLantern);

    granitePolishedStairs = createBlock(
        new ModStairs(Blocks.STONE, "granite_polished_stairs", CreativeTabs.BUILDING_BLOCKS, 2.5F, 32F, 1, "pickaxe"),
        event);
    ibGranitePolishedStairs = createItemBlock(new ItemBlock(granitePolishedStairs), granitePolishedStairs);

    granitePolishedStairsAlt = createBlock(new ModStairs(Blocks.STONE, "granite_polished_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 1.7F, 26F, 1, "pickaxe"), event);
    ibGranitePolishedStairsAlt = createItemBlock(new ItemBlock(granitePolishedStairsAlt), granitePolishedStairsAlt);

    // Hardened Clay
    // Regular
    hardenedClayDoor = createBlock(new ModBlockDoor(Material.CLAY, "hardened_clay_door", 2F, 21F, 0, "pickaxe"), event);

    terracottaStairs = createBlock(
        new ModStairs(Blocks.HARDENED_CLAY, "terracotta_stairs", CreativeTabs.BUILDING_BLOCKS, 2.2F, 21F, 0, "pickaxe"),
        event);
    ibTerracottaStairs = createItemBlock(new ItemBlock(terracottaStairs), terracottaStairs);

    terracottaStairsAlt = createBlock(new ModStairs(Blocks.HARDENED_CLAY, "terracotta_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 1.5F, 16F, 0, "pickaxe"), event);
    ibTerracottaStairsAlt = createItemBlock(new ItemBlock(terracottaStairsAlt), terracottaStairsAlt);

    // Jungle Wood
    jungleWoodStairsAlt = createBlock(
        new ModStairs(Blocks.PLANKS, "jungle_wood_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.5F, 3F, 0, "axe"),
        event);
    ibJungleWoodStairsAlt = createItemBlock(new ItemBlock(jungleWoodStairsAlt), jungleWoodStairsAlt);

    jungleWoodCraftingTable = createBlock(
        new ModCraftingTable("jungle_wood_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"), event);
    ibJungleWoodCraftingTable = createItemBlock(new ItemBlock(jungleWoodCraftingTable), jungleWoodCraftingTable);

    // Oak
    oakStableDoor = createBlock(new ModBlockDoor(Material.WOOD, "oak_stable_door", 1.9F, 5F, 0, "axe"), event);

    oakLightBox = createBlock(
        new ModBlock(Material.WOOD, "oak_light_box", CreativeTabs.DECORATIONS, 2F, 6F, 0, "axe", 12 / 15F, 5, 20),
        event);
    ibOakLightBox = createItemBlock(new ItemBlock(oakLightBox), oakLightBox);

    oakLantern = createBlock(
        new ModLantern(Material.WOOD, "oak_lantern", CreativeTabs.DECORATIONS, 1F, 4F, 0, "axe", 13 / 15F, 5, 20, 0.4D),
        event);
    ibOakLantern = createItemBlock(new ItemBlock(oakLantern), oakLantern);

    oakLamp = createBlock(
        new ModLamp(Material.WOOD, "oak_lamp", CreativeTabs.DECORATIONS, 1.2F, 4F, 0, "axe", 14 / 15F, 5, 20, 1.9D),
        event);
    ibOakLamp = createItemBlock(new ItemBlock(oakLamp), oakLamp);

    oakStairsAlt = createBlock(
        new ModStairs(Blocks.PLANKS, "oak_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.4F, 2F, 0, "axe"), event);
    ibOakStairsAlt = createItemBlock(new ItemBlock(oakStairsAlt), oakStairsAlt);

    oakCraftingTable = createBlock(
        new ModCraftingTable("oak_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"), event);
    ibOakCraftingTable = createItemBlock(new ItemBlock(oakCraftingTable), oakCraftingTable);

    // Obsidian
    polishedObsidianBlock = createBlock(
        new ModBlock(Material.ROCK, "polished_obsidian", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"),
        event);
    ibPolishedObsidianBlock = createItemBlock(new ItemBlock(polishedObsidianBlock), polishedObsidianBlock);

    polishedObsidianDoor = createBlock(
        new ModBlockDoor(Material.ROCK, "polished_obsidian_door", 45F, 5300F, 3, "pickaxe"), event);

    polishedObsidianStairs = createBlock(new ModStairs(Blocks.OBSIDIAN, "polished_obsidian_stairs",
        CreativeTabs.BUILDING_BLOCKS, 48F, 5500F, 3, "pickaxe"), event);
    ibPolishedObsidianStairs = createItemBlock(new ItemBlock(polishedObsidianStairs), polishedObsidianStairs);

    polishedObsidianStairsAlt = createBlock(new ModStairs(Blocks.OBSIDIAN, "polished_obsidian_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 40F, 5000F, 3, "pickaxe"), event);
    ibPolishedObsidianStairsAlt = createItemBlock(new ItemBlock(polishedObsidianStairsAlt), polishedObsidianStairsAlt);

    // Spruce Wood
    spruceWoodStairsAlt = createBlock(
        new ModStairs(Blocks.PLANKS, "spruce_wood_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.5F, 3F, 0, "axe"),
        event);
    ibSpruceWoodStairsAlt = createItemBlock(new ItemBlock(spruceWoodStairsAlt), spruceWoodStairsAlt);

    spruceWoodCraftingTable = createBlock(
        new ModCraftingTable("spruce_wood_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"), event);
    ibSpruceWoodCraftingTable = createItemBlock(new ItemBlock(spruceWoodCraftingTable), spruceWoodCraftingTable);

    // Advanced Workbench
    // advancedWorkbench = new ModAdvancedWorkbench(Material.WOOD);

    // Ores
    copperOre = createBlock(new ModOre("copper_ore", 2F, 12F, 0), event);
    ibCopperOre = createItemBlock(new ItemBlock(copperOre), copperOre);

    tinOre = createBlock(new ModOre("tin_ore", 2.1F, 13F, 1), event);
    ibTinOre = createItemBlock(new ItemBlock(tinOre), tinOre);

    platinumOre = createBlock(new ModOre("platinum_ore", 2.5F, 14F, 1), event);
    ibPlatinumOre = createItemBlock(new ItemBlock(platinumOre), platinumOre);

    silverOre = createBlock(new ModOre("silver_ore", 3F, 15F, 1), event);
    ibSilverOre = createItemBlock(new ItemBlock(silverOre), silverOre);

    mithrilOre = createBlock(new ModOre("mithril_ore", 4F, 16F, 2), event);
    ibMithrilOre = createItemBlock(new ItemBlock(mithrilOre), mithrilOre);

    titaniumOre = createBlock(new ModOre("titanium_ore", 5F, 20F, 2), event);
    ibTitaniumOre = createItemBlock(new ItemBlock(titaniumOre), titaniumOre);

    // Ore Blocks
    copperBlock = createBlock(
        new ModBlock(Material.IRON, "copper_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"), event);
    ibCopperBlock = createItemBlock(new ItemBlock(copperBlock), copperBlock);

    tinBlock = createBlock(
        new ModBlock(Material.IRON, "tin_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"), event);
    ibTinBlock = createItemBlock(new ItemBlock(tinBlock), tinBlock);

    bronzeBlock = createBlock(
        new ModBlock(Material.IRON, "bronze_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"), event);
    ibBronzeBlock = createItemBlock(new ItemBlock(bronzeBlock), bronzeBlock);

    platinumBlock = createBlock(
        new ModBlock(Material.IRON, "platinum_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"), event);
    ibPlatinumBlock = createItemBlock(new ItemBlock(platinumBlock), platinumBlock);

    silverBlock = createBlock(
        new ModBlock(Material.IRON, "silver_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"), event);
    ibSilverBlock = createItemBlock(new ItemBlock(silverBlock), silverBlock);

    mithrilBlock = createBlock(
        new ModBlock(Material.IRON, "mithril_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"), event);
    ibMithrilBlock = createItemBlock(new ItemBlock(mithrilBlock), mithrilBlock);

    titaniumBlock = createBlock(
        new ModBlock(Material.IRON, "titanium_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"), event);
    ibTitaniumBlock = createItemBlock(new ItemBlock(titaniumBlock), titaniumBlock);

    celestialBronzeBlock = createBlock(new ModBlock(Material.IRON, "celestial_bronze_block",
        CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe", 5 / 15F), event);
    ibCelestialBronzeBlock = createItemBlock(new ItemBlock(celestialBronzeBlock), celestialBronzeBlock);

    imperialGoldBlock = createBlock(new ModBlock(Material.IRON, "imperial_gold_block", CreativeTabs.BUILDING_BLOCKS, 2F,
        12F, 1, "pickaxe", 7 / 15F), event);
    ibImperialGoldBlock = createItemBlock(new ItemBlock(imperialGoldBlock), imperialGoldBlock);

    steelBlock = createBlock(
        new ModBlock(Material.IRON, "steel_block", CreativeTabs.BUILDING_BLOCKS, 2F, 12F, 1, "pickaxe"), event);
    ibSteelBlock = createItemBlock(new ItemBlock(steelBlock), steelBlock);

    // Metal Bricks
    // Gold
    goldBrick = createBlock(
        new ModBlock(Material.ROCK, "gold_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"), event);
    ibGoldBrick = createItemBlock(new ItemBlock(goldBrick), goldBrick);

    goldBrickStairs = createBlock(
        new ModStairs(Blocks.GOLD_BLOCK, "gold_brick_stairs", CreativeTabs.BUILDING_BLOCKS, 2.8F, 27F, 1, "pickaxe"),
        event);
    ibGoldBrickStairs = createItemBlock(new ItemBlock(goldBrickStairs), goldBrickStairs);

    goldBrickStairsAlt = createBlock(new ModStairs(Blocks.GOLD_BLOCK, "gold_brick_stairs_alt",
        CreativeTabs.BUILDING_BLOCKS, 2.0F, 20F, 1, "pickaxe"), event);
    ibGoldBrickStairsAlt = createItemBlock(new ItemBlock(goldBrickStairsAlt), goldBrickStairsAlt);
    // Copper
    copperBrick = createBlock(
        new ModBlock(Material.ROCK, "copper_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"), event);
    ibCopperBrick = createItemBlock(new ItemBlock(copperBrick), copperBrick);

    copperBrickStairs = createBlock(
        new ModStairs(copperBlock, "copper_brick_stairs", CreativeTabs.BUILDING_BLOCKS, 2.8F, 27F, 1, "pickaxe"),
        event);
    ibCopperBrickStairs = createItemBlock(new ItemBlock(copperBrickStairs), copperBrickStairs);

    copperBrickStairsAlt = createBlock(
        new ModStairs(copperBlock, "copper_brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 20F, 1, "pickaxe"),
        event);
    ibCopperBrickStairsAlt = createItemBlock(new ItemBlock(copperBrickStairsAlt), copperBrickStairsAlt);
    // Silver
    silverBrick = createBlock(
        new ModBlock(Material.ROCK, "silver_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"), event);
    ibSilverBrick = createItemBlock(new ItemBlock(silverBrick), silverBrick);

    silverBrickStairs = createBlock(
        new ModStairs(silverBlock, "silver_brick_stairs", CreativeTabs.BUILDING_BLOCKS, 2.8F, 27F, 1, "pickaxe"),
        event);
    ibSilverBrickStairs = createItemBlock(new ItemBlock(silverBrickStairs), silverBrickStairs);

    silverBrickStairsAlt = createBlock(
        new ModStairs(silverBlock, "silver_brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 20F, 1, "pickaxe"),
        event);
    ibSilverBrickStairsAlt = createItemBlock(new ItemBlock(silverBrickStairsAlt), silverBrickStairsAlt);
    // Obsidian
    polishedObsidianBrick = createBlock(
        new ModBlock(Material.ROCK, "polished_obsidian_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"),
        event);
    ibPolishedObsidianBrick = createItemBlock(new ItemBlock(polishedObsidianBrick), polishedObsidianBrick);

    polishedObsidianBrickStairs = createBlock(new ModStairs(polishedObsidianBlock, "polished_obsidian_brick_stairs",
        CreativeTabs.BUILDING_BLOCKS, 2.8F, 27F, 1, "pickaxe"), event);
    ibPolishedObsidianBrickStairs = createItemBlock(new ItemBlock(polishedObsidianBrickStairs),
        polishedObsidianBrickStairs);

    polishedObsidianBrickStairsAlt = createBlock(new ModStairs(polishedObsidianBlock,
        "polished_obsidian_brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 20F, 1, "pickaxe"), event);
    ibPolishedObsidianBrickStairsAlt = createItemBlock(new ItemBlock(polishedObsidianBrickStairsAlt),
        polishedObsidianBrickStairsAlt);
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

  private static ModBlock createBlock(ModBlock block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

  private static ModOre createBlock(ModOre block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

  private static ModBlockDoor createBlock(ModBlockDoor block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

  private static ModStairs createBlock(ModStairs block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

  private static ModLamp createBlock(ModLamp block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

  private static ModLantern createBlock(ModLantern block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

  private static ModChest createBlock(ModChest block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

  private static ModBlockBed createBlock(ModBlockBed block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

  private static ModAlloyFurnace createBlock(ModAlloyFurnace block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

  private static ModCraftingTable createBlock(ModCraftingTable block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

  private static ModCampfire createBlock(ModCampfire block, RegistryEvent.Register<Block> event) {
    event.getRegistry().register(block);

    return block;
  }

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
    register(ibCampfire, 0, "oak");
    register(ibLitCampfire, 0, "oak");
    register(ibCampfire, 1, "spruce");
    register(ibLitCampfire, 1, "spruce");
    register(ibCampfire, 2, "birch");
    register(ibLitCampfire, 2, "birch");
    register(ibCampfire, 3, "jungle");
    register(ibLitCampfire, 3, "jungle");
    register(ibCampfire, 4, "acacia");
    register(ibLitCampfire, 4, "acacia");
    register(ibCampfire, 5, "dark_oak");
    register(ibLitCampfire, 5, "dark_oak");

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
    register(item, meta, "normal");
  }
  private static void register(Item item, int meta, String metaName) {
    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), metaName));
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