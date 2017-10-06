package com.DragonFerocity.expanded.handlers;

import java.util.ArrayList;

import com.DragonFerocity.expanded.ExpandedAesthetics;
import com.DragonFerocity.expanded.Ref;
//import com.DragonFerocity.expanded.blocks.CobblestoneChest;
//import com.DragonFerocity.expanded.blocks.ModChest;
import com.DragonFerocity.expanded.blocks.ModAdvancedWorkbench;
import com.DragonFerocity.expanded.blocks.ModAlloyFurnace;
import com.DragonFerocity.expanded.blocks.ModBlock;
import com.DragonFerocity.expanded.blocks.ModBlockBed;
import com.DragonFerocity.expanded.blocks.ModBlockCrops;
import com.DragonFerocity.expanded.blocks.ModBlockDoor;
import com.DragonFerocity.expanded.blocks.ModBlockGrandfatherClock;
import com.DragonFerocity.expanded.blocks.ModBlockPortal;
import com.DragonFerocity.expanded.blocks.ModBlockPressurePlate;
import com.DragonFerocity.expanded.blocks.ModBlockSlab;
import com.DragonFerocity.expanded.blocks.ModBlockSlabDouble;
import com.DragonFerocity.expanded.blocks.ModBlockSlabHalf;
import com.DragonFerocity.expanded.blocks.ModCampfire;
import com.DragonFerocity.expanded.blocks.ModChest;
import com.DragonFerocity.expanded.blocks.ModCraftingTable;
import com.DragonFerocity.expanded.blocks.ModLamp;
import com.DragonFerocity.expanded.blocks.ModLantern;
import com.DragonFerocity.expanded.blocks.ModOre;
import com.DragonFerocity.expanded.blocks.ModStairs;
import com.DragonFerocity.expanded.entities.ModTileEntityAlloyFurnace;
import com.DragonFerocity.expanded.entities.ModTileEntityCampfire;
import com.DragonFerocity.expanded.items.ModArmor;
import com.DragonFerocity.expanded.items.ModAxe;
import com.DragonFerocity.expanded.items.ModHoe;
import com.DragonFerocity.expanded.items.ModItem;
import com.DragonFerocity.expanded.items.ModItemBed;
import com.DragonFerocity.expanded.items.ModItemDoor;
import com.DragonFerocity.expanded.items.ModItemFood;
import com.DragonFerocity.expanded.items.ModItemSeeds;
import com.DragonFerocity.expanded.items.ModItemSlab;
import com.DragonFerocity.expanded.items.ModItemSoup;
import com.DragonFerocity.expanded.items.ModItemTeleporter;
import com.DragonFerocity.expanded.items.ModPickaxe;
import com.DragonFerocity.expanded.items.ModSpade;
import com.DragonFerocity.expanded.items.ModSword;
import com.DragonFerocity.expanded.items.ModTool;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

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
  public static ModBlockDoor acaciaStableDoor;
  public static Item iAcaciaStableDoor;

  // Andesite Items
  public static ModBlockDoor andesitePolishedDoor;
  public static Item iAndesitePolishedDoor;
  public static ModStairs andesitePolishedStairs;
  public static ItemBlock ibAndesitePolishedStairs;
  public static ModStairs andesitePolishedStairsAlt;
  public static ItemBlock ibAndesitePolishedStairsAlt;
  public static ModBlockSlabHalf andesitePolishedSlabHalf;
  public static ModBlockSlabDouble andesitePolishedSlabDouble;
  public static ItemBlock iAndesitePolishedSlab;

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
  public static ModBlockSlabHalf goldBrickSlabHalf;
  public static ModBlockSlabDouble goldBrickSlabDouble;
  public static ItemBlock iGoldBrickSlab;
  // Copper
  public static ModBlock copperBrick;
  public static ItemBlock ibCopperBrick;
  public static ModStairs copperBrickStairs;
  public static ItemBlock ibCopperBrickStairs;
  public static ModStairs copperBrickStairsAlt;
  public static ItemBlock ibCopperBrickStairsAlt;
  public static ModBlockSlabHalf copperBrickSlabHalf;
  public static ModBlockSlabDouble copperBrickSlabDouble;
  public static ItemBlock iCopperBrickSlab;
  // Silver
  public static ModBlock silverBrick;
  public static ItemBlock ibSilverBrick;
  public static ModStairs silverBrickStairs;
  public static ItemBlock ibSilverBrickStairs;
  public static ModStairs silverBrickStairsAlt;
  public static ItemBlock ibSilverBrickStairsAlt;
  public static ModBlockSlabHalf silverBrickSlabHalf;
  public static ModBlockSlabDouble silverBrickSlabDouble;
  public static ItemBlock iSilverBrickSlab;
  // Obsidian
  public static ModBlock polishedObsidianBrick;
  public static ItemBlock ibPolishedObsidianBrick;
  public static ModStairs polishedObsidianBrickStairs;
  public static ItemBlock ibPolishedObsidianBrickStairs;
  public static ModStairs polishedObsidianBrickStairsAlt;
  public static ItemBlock ibPolishedObsidianBrickStairsAlt;
  public static ModBlockSlabHalf polishedObsidianSlabHalf;
  public static ModBlockSlabDouble polishedObsidianSlabDouble;
  public static ItemBlock iPolishedObsidianSlab;
  public static ModBlockSlabHalf polishedObsidianBrickSlabHalf;
  public static ModBlockSlabDouble polishedObsidianBrickSlabDouble;
  public static ItemBlock iPolishedObsidianBrickSlab;

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
  public static ModBlockSlabHalf cutCactusSlabHalf;
  public static ModBlockSlabDouble cutCactusSlabDouble;
  public static ItemBlock iCutCactusSlab;

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
  public static ModBlockSlabHalf dioritePolishedSlabHalf;
  public static ModBlockSlabDouble dioritePolishedSlabDouble;
  public static ItemBlock iDioritePolishedSlab;

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
  public static ModBlockSlabHalf granitePolishedSlabHalf;
  public static ModBlockSlabDouble granitePolishedSlabDouble;
  public static ItemBlock iGranitePolishedSlab;

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
  public static ModBlockSlabHalf obsidianSlabHalf;
  public static ModBlockSlabDouble obsidianSlabDouble;
  public static ItemBlock iObsidianSlab;
  
  //Snow Stone
  public static ModBlock snowStone;
  public static ItemBlock ibSnowStone;
  public static ModBlock snowStoneBrick;
  public static ItemBlock ibSnowStoneBrick;

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
  public static ModOre tinOre;
  public static ItemBlock ibTinOre;
  public static Item iTinIngot;
  public static ModOre platinumOre;
  public static ItemBlock ibPlatinumOre;
  public static Item iPlatinumIngot;
  public static ModOre silverOre;
  public static ItemBlock ibSilverOre;
  public static ModOre mithrilOre;
  public static ItemBlock ibMithrilOre;
  public static ModOre titaniumOre;
  public static ItemBlock ibTitaniumOre;

  // Special Ores
  public static Item iCopperIngot;
  public static Item iCopperNuggets;
  public static Item iSteelIngot;
  public static Item iBronzeNuggets;
  public static Item iBronzeIngot;
  public static Item iSilverIngot;
  public static Item iMithrilIngot;
  public static Item iTitaniumIngot;
  public static Item iCelestialBronzeNuggets;
  public static Item iCelestialBronzeIngot;
  public static Item iImperialGoldNuggets;
  public static Item iImperialGoldIngot;
  public static Item iStygianIronIngot;

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
  public static ModBlock stygianIronBlock;
  public static ItemBlock ibStygianIronBlock;

  //Tool Material
  public static ItemTool.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("copper", 0, 72, 5.0F, 1.2F, 7).setRepairItem(new ItemStack(iCopperIngot));
  public static ItemTool.ToolMaterial bronzeToolMaterial = EnumHelper.addToolMaterial("bronze", 1, 175, 5.2F, 1.4F, 7).setRepairItem(new ItemStack(iBronzeIngot));
  public static ItemTool.ToolMaterial silverToolMaterial = EnumHelper.addToolMaterial("silver", 2, 40, 4.0F, 2.0F, 20).setRepairItem(new ItemStack(iSilverIngot));
  public static ItemTool.ToolMaterial steelToolMaterial = EnumHelper.addToolMaterial("steel", 2, 550, 7.3F, 3.4F, 12).setRepairItem(new ItemStack(iSteelIngot));
  public static ItemTool.ToolMaterial coldIronToolMaterial = EnumHelper.addToolMaterial("cold_iron", 2, 220, 5.5F, 2.0F, 16).setRepairItem(new ItemStack(Items.IRON_INGOT));
  public static ItemTool.ToolMaterial mithrilToolMaterial = EnumHelper.addToolMaterial("mithril", 3, 850, 12.0F, 2.2F, 8).setRepairItem(new ItemStack(iMithrilIngot));
  
  public static ItemTool.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("obsidian", 4, 500, 4.0F, 8.0F, 12).setRepairItem(new ItemStack(Blocks.OBSIDIAN));
  public static ItemTool.ToolMaterial celestialBronzeToolMaterial = EnumHelper.addToolMaterial("celestial_bronze", 3, 620, 7.0F, 3.0F, 15).setRepairItem(new ItemStack(iCelestialBronzeIngot));
  public static ItemTool.ToolMaterial imperialGoldToolMaterial = EnumHelper.addToolMaterial("imperial_gold", 3, 260, 10.0F, 1.0F, 25).setRepairItem(new ItemStack(iImperialGoldIngot));
  public static ItemTool.ToolMaterial stygianIronToolMaterial = EnumHelper.addToolMaterial("obsidian", 4, 450, 6.0F, 3.0F, 18).setRepairItem(new ItemStack(iStygianIronIngot));
  
  // Pickaxes
  public static ModPickaxe iCopperHammer;
  public static ModPickaxe iBronzePickaxe;
  public static ModPickaxe iSteelPickaxe;
  public static ModPickaxe iMithrilPickaxe;
  public static ModPickaxe iCelestialBronzePickaxe;
  public static ModPickaxe iImperialGoldPickaxe;
  public static ModPickaxe iObsidianPickaxe;

  // Axe
  public static ModAxe iCopperAxe;
  public static ModAxe iBronzeAxe;
  public static ModAxe iSteelAxe;
  public static ModAxe iMithrilAxe;
  public static ModAxe iCelestialBronzeAxe;
  public static ModAxe iImperialGoldAxe;
  public static ModAxe iObsidianAxe;
  public static ModAxe iStygianIronAxe;

  // Shovel
  public static ModSpade iCopperShovel;
  public static ModSpade iBronzeShovel;
  public static ModSpade iSteelShovel;
  public static ModSpade iMithrilShovel;
  public static ModSpade iCelestialBronzeShovel;
  public static ModSpade iImperialGoldShovel;
  public static ModSpade iObsidianShovel;
  public static ModSpade iStygianIronShovel;

  // Hoe
  public static ModHoe iCopperHoe;
  public static ModHoe iBronzeHoe;
  public static ModHoe iSteelHoe;
  public static ModHoe iMithrilHoe;
  public static ModHoe iCelestialBronzeHoe;
  public static ModHoe iImperialGoldHoe;
  public static ModHoe iObsidianHoe;
  public static ModHoe iStygianIronHoe;

  // Sword
  public static ModSword iBronzeSword;
  public static ModSword iSilverSword;
  public static ModSword iColdIronSword;
  public static ModSword iSteelSword;
  public static ModSword iMithrilSword;
  public static ModSword iCelestialBronzeSword;
  public static ModSword iImperialGoldSword;
  public static ModSword iObsidianSword;
  public static ModSword iStygianIronSword;
  
  //Armor
  public static ItemArmor.ArmorMaterial copperMaterial = EnumHelper.addArmorMaterial("copper", Ref.MODID + ":copper", 10, new int[]{1, 3, 4, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
  public static ItemArmor.ArmorMaterial bronzeMaterial = EnumHelper.addArmorMaterial("bronze", Ref.MODID + ":bronze", 15, new int[]{2, 5, 5, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
  public static ItemArmor.ArmorMaterial steelMaterial = EnumHelper.addArmorMaterial("steel", Ref.MODID + ":steel", 18, new int[]{2, 5, 7, 3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
  public static ItemArmor.ArmorMaterial mithrilMaterial = EnumHelper.addArmorMaterial("mithril", Ref.MODID + ":mithril", 20, new int[]{3, 5, 7, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
  public static ItemArmor.ArmorMaterial coldIronMaterial = EnumHelper.addArmorMaterial("cold_iron", Ref.MODID + ":cold_iron", 14, new int[]{2, 5, 6, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
  public static ItemArmor.ArmorMaterial celestialBronzeMaterial = EnumHelper.addArmorMaterial("celestial_bronze", Ref.MODID + ":celestial_bronze", 36, new int[]{4, 6, 9, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 3.0F);
  public static ItemArmor.ArmorMaterial imperialGoldMaterial = EnumHelper.addArmorMaterial("imperial_gold", Ref.MODID + ":imperial_gold", 34, new int[]{4, 6, 9, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 3.0F);
  public static ItemArmor iCopperHelmet;
  public static ItemArmor iCopperChest;
  public static ItemArmor iCopperLegs;
  public static ItemArmor iCopperBoots;
  public static ItemArmor iBronzeHelmet;
  public static ItemArmor iBronzeChest;
  public static ItemArmor iBronzeLegs;
  public static ItemArmor iBronzeBoots;
  public static ItemArmor iSteelHelmet;
  public static ItemArmor iSteelChest;
  public static ItemArmor iSteelLegs;
  public static ItemArmor iSteelBoots;
  public static ItemArmor iMithrilHelmet;
  public static ItemArmor iMithrilChest;
  public static ItemArmor iMithrilLegs;
  public static ItemArmor iMithrilBoots;
  public static ItemArmor iCelestialBronzeHelmet;
  public static ItemArmor iCelestialBronzeChest;
  public static ItemArmor iCelestialBronzeLegs;
  public static ItemArmor iCelestialBronzeBoots;
  public static ItemArmor iImperialGoldHelmet;
  public static ItemArmor iImperialGoldChest;
  public static ItemArmor iImperialGoldLegs;
  public static ItemArmor iImperialGoldBoots;
  public static ItemArmor iColdIronHelmet;
  public static ItemArmor iColdIronChest;
  public static ItemArmor iColdIronLegs;
  public static ItemArmor iColdIronBoots;
  public static ItemArmor iColdIronHelmetBlue;
  public static ItemArmor iColdIronChestBlue;
  public static ItemArmor iColdIronLegsBlue;
  public static ItemArmor iColdIronBootsBlue;

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
  
  //Plants
  public static ModBlockCrops strawberry;
  public static ModItem iStrawberry;
  public static ItemSeeds iStrawberrySeed;
  public static ModItem iBlueStrawberry;
  
  public static ModBlockCrops blueberry;
  public static ModItem iBlueberry;
  public static ItemSeeds iBlueberrySeed;
  public static ModItem iGreenBlueberry;
  
  public static ModBlockCrops bellPepper;
  public static ModItem iBellPepperGreen;
  public static ModItem iBellPepperYellow;
  public static ModItem iBellPepperRed;
  public static ModItem iBellPepperOrange;
  public static ItemSeeds iBellPepperSeed;
  public static ModItem iCayennePepper;
  public static ModItem iJalapenoPepper;
  public static ModItem iGhostPepper;
  
  public static ModBlockCrops corn;
  public static ModItem iCorn;
  public static ItemSeeds iCornSeed;
  public static ModItem iBlueCorn;
  
  public static ModBlockCrops tomato;
  public static ModItem iTomato;
  public static ItemSeeds iTomatoSeeds;
  public static ModItem iCherryTomato;
  
  //Foodstuffs
  public static ModItem iHeavyCream;
  public static ModItem iFlour;
  public static ModItem iSalt;
  public static ModItem iButter;
  //public static ModItem iPowderedSugar;
  public static ModItemFood iBreadBowl;
  public static ModItemFood iChickenBroth;
  public static ModItem iPancakeBatter;
  public static ModItemFood iTortilla;
  public static ModItemFood iCornTortilla;
  //public static ModItem iCornKernals;
  public static ModItem iGroundBeef;
  public static ModItem iTomatoSauce;
  public static ModItem iAlfredoSauce;
  
  public static ModItemSoup iPotatoSoup;
  public static ModItemFood iPotatoSoupInBreadBowl;
  public static ModItemSoup iChickenSoup;
  public static ModItemFood iChickenSoupInBreadBowl;
  public static ModItemSoup iVegetableSoup;
  public static ModItemFood iVegetableSoupInBreadBowl;
  public static ModItemFood iPancakes;
  public static ModItemFood iChocolateChipPancakes;
  public static ModItemFood iBlueberryPancakes;
  public static ModItemFood iApplePancakes;
  public static ModItemFood iScrambledEggs;
  public static ModItemFood iBreadSlice;
  public static ModItemFood iToast;
  //public static ModItemFood iFrenchToast;
  public static ModItemFood iChickenSandwich;
  //public static ModItemFood iCornOnTheCob;
  //public static ModItemFood iPopcorn;
  public static ModItemFood iBurrito;
  public static ModItemFood iTaco;
  public static ModItemFood iCheese;
  public static ModItemFood iCookedBeef;
  public static ModItemFood iHamburger;
  public static ModItemFood iCheeseburger;
  public static ModItemFood iVanillaIceCream;
  public static ModItemFood iChocolateIceCream;
  public static ModItemFood iStrawberryIceCream;
  public static ModItemFood iNeopolitanIceCream;
  public static ModItemFood iPasta;
  public static ModItemFood iFeticciniAlfredo;
  public static ModItemFood iChickenFeticciniAlfredo;
  public static ModItemFood iSpaghetti;
  //public static ModItemFood iMeatball;
  //public static ModItemFood iSpaghettiAndMeatballs;
  public static ModItemFood iSalsa;
  public static ModItemFood iCornChips;
  public static ModItemFood iChipsAndSalsa;
  public static ModItemFood iNachos;
  public static ModItemFood iChickenParmesan;
  
  //Pressure Plates
  public static ModBlockPressurePlate silverPressurePlate;
  public static ItemBlock ibSilverPressurePlate;
  
  //Portals
  public static ModBlockPortal portalArctic;
  public static ModItemTeleporter iArcticTeleporter;
  
  // Other Vars
  public static ArrayList<ItemBlock> itemBlockList = new ArrayList<>();
  public static ArrayList<Block> blockList = new ArrayList<>();
  public static ArrayList<Item> itemList = new ArrayList<>();

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
    ibCampfire = createItemMultiTexture(new ItemMultiTexture(campfire, campfire, ModCampfire.types), campfire);
    blockList.add(litCampfire = new ModCampfire(true, "lit_campfire", CreativeTabs.DECORATIONS, 1F, 1F, "pickaxe", 0));
    ibLitCampfire = createItemMultiTexture(new ItemMultiTexture(campfire, campfire, ModCampfire.types), litCampfire);
    
    GameRegistry.registerTileEntity(ModTileEntityCampfire.class, "campfire_tile_entity");
    
    /*acaciaCampfire = createBlock(new ModCampfire(false, "acacia_campfire", CreativeTabs.DECORATIONS, 1F, 1F, "pickaxe", 0, 4), event);
    litAcaciaCampfire = createBlock(new ModCampfire(true, "lit_acacia_campfire", CreativeTabs.DECORATIONS, 1F, 1F, "pickaxe", 0, 4), event);
    ibAcaciaCampfire = createItemBlockWithoutAddingToList(new ItemBlock(acaciaCampfire), acaciaCampfire);
    ibAcaciaLitCampfire = createItemBlockWithoutAddingToList(new ItemBlock(litAcaciaCampfire), litAcaciaCampfire);*/

    // Acacia Wood
    blockList.add(acaciaStableDoor = new ModBlockDoor(Material.WOOD, "acacia_stable_door", 1.9F, 5F, 0, "pickaxe"));
    
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
    
    blockList.add(andesitePolishedSlabHalf = new ModBlockSlabHalf(Material.ROCK, "andesite_polished_slab", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    blockList.add(andesitePolishedSlabDouble = new ModBlockSlabDouble(Material.ROCK, "andesite_polished_slab_double", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    //ibAndesitePolishedSlab = createItemBlock(new ItemBlock(andesitePolishedSlabHalf), andesitePolishedSlabHalf);

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
    
    blockList.add(cutCactusSlabHalf = new ModBlockSlabHalf(Material.ROCK, "cut_cactus_slab", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1.5F, 1, "pickaxe"));
    blockList.add(cutCactusSlabDouble = new ModBlockSlabDouble(Material.ROCK, "cut_cactus_slab_double", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1.5F, 1, "pickaxe"));
    //ibCutCactusSlab = createItemBlock(new ItemBlock(cutCactusSlabHalf), cutCactusSlabHalf);

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
    
    blockList.add(dioritePolishedSlabHalf = new ModBlockSlabHalf(Material.ROCK, "diorite_polished_slab", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    blockList.add(dioritePolishedSlabDouble = new ModBlockSlabDouble(Material.ROCK, "diorite_polished_slab_double", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    //ibDioritePolishedSlab = createItemBlock(new ItemBlock(dioritePolishedSlabHalf), dioritePolishedSlabHalf);

    //blockList.add(dioritePolishedChest = new ModChest(ModChest.Type.POLISHED_DIORITE, Material.ROCK, "diorite_polished_chest", 4F, 40F, 1, "pickaxe"));
    //ibDioritePolishedChest = createItemBlock(new ItemBlock(dioritePolishedChest), dioritePolishedChest);
    
    //GameRegistry.registerTileEntity(ModTileEntityChest.class, "chest_tile_entity");
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
    
    blockList.add(granitePolishedSlabHalf = new ModBlockSlabHalf(Material.ROCK, "granite_polished_slab", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    blockList.add(granitePolishedSlabDouble = new ModBlockSlabDouble(Material.ROCK, "granite_polished_slab_double", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    //ibGranitePolishedSlab = createItemBlock(new ItemBlock(granitePolishedSlabHalf), granitePolishedSlabHalf);

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
    
    blockList.add(polishedObsidianSlabHalf = new ModBlockSlabHalf(Material.ROCK, "polished_obsidian_slab", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    blockList.add(polishedObsidianSlabDouble = new ModBlockSlabDouble(Material.ROCK, "polished_obsidian_slab_double", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    //ibPolishedObsidianSlab = createItemBlock(new ItemBlock(polishedObsidianSlabHalf), polishedObsidianSlabHalf);
    
    blockList.add(obsidianSlabHalf = new ModBlockSlabHalf(Material.ROCK, "obsidian_slab", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    blockList.add(obsidianSlabDouble = new ModBlockSlabDouble(Material.ROCK, "obsidian_slab_double", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    //ibObsidianSlab = createItemBlock(new ItemBlock(obsidianSlabHalf), obsidianSlabHalf);

    // Spruce Wood
    blockList.add(spruceWoodStairsAlt = new ModStairs(Blocks.PLANKS, "spruce_wood_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 1.5F, 3F, 0, "axe"));
    ibSpruceWoodStairsAlt = createItemBlock(new ItemBlock(spruceWoodStairsAlt), spruceWoodStairsAlt);

    blockList.add(spruceWoodCraftingTable = new ModCraftingTable("spruce_wood_crafting_table", CreativeTabs.DECORATIONS, 2F, 3F, 0, "axe"));
    ibSpruceWoodCraftingTable = createItemBlock(new ItemBlock(spruceWoodCraftingTable), spruceWoodCraftingTable);

    // Snow Stone
    blockList.add(snowStone = new ModBlock(Material.ROCK, "snow_stone", CreativeTabs.BUILDING_BLOCKS, 0.2F, 1F, 0, "pickaxe"));
    ibSnowStone = createItemBlock(new ItemBlock(snowStone), snowStone);
    
    blockList.add(snowStoneBrick = new ModBlock(Material.ROCK, "snow_stone_brick", CreativeTabs.BUILDING_BLOCKS, 0.4F, 1.5F, 0, "pickaxe"));
    ibSnowStoneBrick = createItemBlock(new ItemBlock(snowStoneBrick), snowStoneBrick);
    // Advanced Workbench
    // advancedWorkbench = new ModAdvancedWorkbench(Material.WOOD);

    // Ores
    blockList.add(copperOre = new ModOre("copper_ore", 1F, 6F, 0, Material.WOOD));
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
    
    blockList.add(goldBrickSlabHalf = new ModBlockSlabHalf(Material.ROCK, "gold_brick_slab", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    blockList.add(goldBrickSlabDouble = new ModBlockSlabDouble(Material.ROCK, "gold_brick_slab_double", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    //ibGoldBrickSlab = createItemBlock(new ItemBlock(goldBrickSlabHalf), goldBrickSlabHalf);
    // Copper
    blockList.add(copperBrick = new ModBlock(Material.ROCK, "copper_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    ibCopperBrick = createItemBlock(new ItemBlock(copperBrick), copperBrick);

    blockList.add(copperBrickStairs = new ModStairs(copperBlock, "copper_brick_stairs", CreativeTabs.BUILDING_BLOCKS, 2.8F, 27F, 1, "pickaxe"));
    ibCopperBrickStairs = createItemBlock(new ItemBlock(copperBrickStairs), copperBrickStairs);

    blockList.add(copperBrickStairsAlt = new ModStairs(copperBlock, "copper_brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 20F, 1, "pickaxe"));
    ibCopperBrickStairsAlt = createItemBlock(new ItemBlock(copperBrickStairsAlt), copperBrickStairsAlt);
    
    blockList.add(copperBrickSlabHalf = new ModBlockSlabHalf(Material.ROCK, "copper_brick_slab", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    blockList.add(copperBrickSlabDouble = new ModBlockSlabDouble(Material.ROCK, "copper_brick_slab_double", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    //ibCopperBrickSlab = createItemBlock(new ItemBlock(copperBrickSlabHalf), copperBrickSlabHalf);
    // Silver
    blockList.add(silverBrick = new ModBlock(Material.ROCK, "silver_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    ibSilverBrick = createItemBlock(new ItemBlock(silverBrick), silverBrick);

    blockList.add(silverBrickStairs = new ModStairs(silverBlock, "silver_brick_stairs", CreativeTabs.BUILDING_BLOCKS, 2.8F, 27F, 1, "pickaxe"));
    ibSilverBrickStairs = createItemBlock(new ItemBlock(silverBrickStairs), silverBrickStairs);

    blockList.add(silverBrickStairsAlt = new ModStairs(silverBlock, "silver_brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 2.0F, 20F, 1, "pickaxe"));
    ibSilverBrickStairsAlt = createItemBlock(new ItemBlock(silverBrickStairsAlt), silverBrickStairsAlt);
    
    blockList.add(silverBrickSlabHalf = new ModBlockSlabHalf(Material.ROCK, "silver_brick_slab", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    blockList.add(silverBrickSlabDouble = new ModBlockSlabDouble(Material.ROCK, "silver_brick_slab_double", CreativeTabs.BUILDING_BLOCKS, 1.5F, 30F, 1, "pickaxe"));
    //ibSilverBrickSlab = createItemBlock(new ItemBlock(silverBrickSlabHalf), silverBrickSlabHalf);
    // Obsidian
    blockList.add(obsidianSlabHalf = new ModBlockSlabHalf(Material.ROCK, "obsidian_slab", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    blockList.add(obsidianSlabDouble = new ModBlockSlabDouble(Material.ROCK, "obsidian_slab_double", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    
    blockList.add(polishedObsidianBrick = new ModBlock(Material.ROCK, "polished_obsidian_brick", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    ibPolishedObsidianBrick = createItemBlock(new ItemBlock(polishedObsidianBrick), polishedObsidianBrick);

    blockList.add(polishedObsidianBrickStairs = new ModStairs(polishedObsidianBlock, "polished_obsidian_brick_stairs", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    ibPolishedObsidianBrickStairs = createItemBlock(new ItemBlock(polishedObsidianBrickStairs), polishedObsidianBrickStairs);

    blockList.add(polishedObsidianBrickStairsAlt = new ModStairs(polishedObsidianBlock, "polished_obsidian_brick_stairs_alt", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    ibPolishedObsidianBrickStairsAlt = createItemBlock(new ItemBlock(polishedObsidianBrickStairsAlt), polishedObsidianBrickStairsAlt);
    
    blockList.add(polishedObsidianBrickSlabHalf = new ModBlockSlabHalf(Material.ROCK, "polished_obsidian_brick_slab", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    blockList.add(polishedObsidianBrickSlabDouble = new ModBlockSlabDouble(Material.ROCK, "polished_obsidian_brick_slab_double", CreativeTabs.BUILDING_BLOCKS, 50F, 5500F, 3, "pickaxe"));
    //PressurePlates
    blockList.add(silverPressurePlate = new ModBlockPressurePlate("silver_pressure_plate", Material.IRON, ModBlockPressurePlate.Sensitivity.PLAYER, 0.5F, 2.5F, 1, "pickaxe"));
    ibSilverPressurePlate = createItemBlock(new ItemBlock(silverPressurePlate), silverPressurePlate);
    
    // Portal
    blockList.add(portalArctic = new ModBlockPortal("portal_arctic", CreativeTabs.MISC, 0.5F, 2.5F, 1, "axe", Blocks.SNOW));
    
    //Plants
    blockList.add(strawberry = new ModBlockCrops("strawberries"));
    blockList.add(blueberry = new ModBlockCrops("blueberries"));
    blockList.add(bellPepper = new ModBlockCrops("bell_pepper"));
    
    //Foodstuffs
    ///////////////////////////////////////////
    //Register Blocks
    for(Block block : blockList) {
      event.getRegistry().register(block);
    }
    for(Block block : blockList) {
      event.getRegistry().register(block);
    }
  }
  
  private static ItemBlock createItemBlock(ItemBlock iBlock, Block block) {
    iBlock.setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getUnlocalizedName());
    itemBlockList.add(iBlock);

    return iBlock;
  }

  private static ItemBlock createItemMultiTexture(ItemMultiTexture iBlock, Block block) {
    iBlock.setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getUnlocalizedName());
    itemBlockList.add(iBlock);

    return iBlock;
  }
  /////////////////////////////////////////////////////////////////////////////////////////////

  public static void initItems(RegistryEvent.Register<Item> event) {
    // iTutItem = new ItemTutItem("tut_item", CreativeTabs.MATERIALS);
    // Acacia
    itemList.add(iAcaciaStableDoor = new ModItemDoor(acaciaStableDoor, "acacia_stable_door", 64));
    
    // Andesite
    itemList.add(iAndesitePolishedDoor = new ModItemDoor(andesitePolishedDoor, "andesite_polished_door", 64));
    itemList.add(iAndesitePolishedSlab = new ModItemSlab(andesitePolishedSlabHalf, andesitePolishedSlabHalf, andesitePolishedSlabDouble, "andesite_polished_slab"));
    
    // Birch
    itemList.add(iBirchStableDoor = new ModItemDoor(birchStableDoor, "birch_stable_door", 64));

    // Brick
    itemList.add(iBrickDoor = new ModItemDoor(brickDoor, "brick_door", 64));
    
    // Cactus
    itemList.add(iCutCactusSlab = new ModItemSlab(cutCactusSlabHalf, cutCactusSlabHalf, cutCactusSlabDouble, "cut_cactus_slab"));
    
    // Cobblestone
    itemList.add(iCobblestoneDoor = new ModItemDoor(cobblestoneDoor, "cobblestone_door", 64));

    // Dark Oak
    itemList.add(iDarkOakBed = new ModItemBed(darkOakBed, "dark_oak_bed", 64));

    // Diorite
    itemList.add(iDioritePolishedDoor = new ModItemDoor(dioritePolishedDoor, "diorite_polished_door", 64));
    itemList.add(iDioritePolishedBed = new ModItemBed(dioritePolishedBed, "diorite_polished_bed", 64));
    itemList.add(iDioritePolishedSlab = new ModItemSlab(dioritePolishedSlabHalf, dioritePolishedSlabHalf, dioritePolishedSlabDouble, "diorite_polished_slab"));
    
    // Glass
    // Regular
    itemList.add(iGlassDoor = new ModItemDoor(glassDoor, "glass_door", 64));

    // Granite
    itemList.add(iGranitePolishedDoor = new ModItemDoor(granitePolishedDoor, "granite_polished_door", 64));
    itemList.add(iGranitePolishedSlab = new ModItemSlab(granitePolishedSlabHalf, granitePolishedSlabHalf, granitePolishedSlabDouble, "granite_polished_slab"));
    
    // Hardened Clay
    // Regular
    itemList.add(iHardenedClayDoor = new ModItemDoor(hardenedClayDoor, "hardened_clay_door", 64));

    // Oak
    itemList.add(iOakStableDoor = new ModItemDoor(oakStableDoor, "oak_stable_door", 64));

    // Obsidian
    itemList.add(iPolishedObsidianDoor = new ModItemDoor(polishedObsidianDoor, "polished_obsidian_door", 64));
    itemList.add(iPolishedObsidianSlab = new ModItemSlab(polishedObsidianSlabHalf, polishedObsidianSlabHalf, polishedObsidianSlabDouble, "polished_obsidian_slab"));
    itemList.add(iObsidianSlab = new ModItemSlab(obsidianSlabHalf, obsidianSlabHalf, obsidianSlabDouble, "obsidian_slab"));
    itemList.add(iPolishedObsidianBrickSlab = new ModItemSlab(polishedObsidianBrickSlabHalf, polishedObsidianBrickSlabHalf, polishedObsidianBrickSlabDouble, "polished_obsidian_brick_slab"));
    
    // Gold Brick
    itemList.add(iGoldBrickSlab = new ModItemSlab(goldBrickSlabHalf, goldBrickSlabHalf, goldBrickSlabDouble, "gold_brick_slab"));
    
    // Silver Brick
    itemList.add(iSilverBrickSlab = new ModItemSlab(silverBrickSlabHalf, silverBrickSlabHalf, silverBrickSlabDouble, "silver_brick_slab"));
    
    // Copper Brick
    itemList.add(iCopperBrickSlab = new ModItemSlab(copperBrickSlabHalf, copperBrickSlabHalf, copperBrickSlabDouble, "copper_brick_slab"));
    
    // Ingots
    itemList.add(iCopperIngot = new ModItem("copper_ingot", CreativeTabs.MATERIALS));
    itemList.add(iTinIngot = new ModItem("tin_ingot", CreativeTabs.MATERIALS));
    itemList.add(iBronzeIngot = new ModItem("bronze_ingot", CreativeTabs.MATERIALS));
    itemList.add(iPlatinumIngot = new ModItem("platinum_ingot", CreativeTabs.MATERIALS));
    itemList.add(iSilverIngot = new ModItem("silver_ingot", CreativeTabs.MATERIALS));
    itemList.add(iTitaniumIngot = new ModItem("titanium_ingot", CreativeTabs.MATERIALS));
    itemList.add(iSteelIngot = new ModItem("steel_ingot", CreativeTabs.MATERIALS));
    itemList.add(iMithrilIngot = new ModItem("mithril_ingot", CreativeTabs.MATERIALS));
    itemList.add(iCelestialBronzeIngot = new ModItem("celestial_bronze_ingot", CreativeTabs.MATERIALS));
    itemList.add(iImperialGoldIngot = new ModItem("imperial_gold_ingot", CreativeTabs.MATERIALS));

    // Ore Nuggets
    itemList.add(iCopperNuggets = new ModItem("copper_nuggets", CreativeTabs.MATERIALS));
    itemList.add(iBronzeNuggets = new ModItem("bronze_nuggets", CreativeTabs.MATERIALS));
    itemList.add(iCelestialBronzeNuggets = new ModItem("celestial_bronze_nuggets", CreativeTabs.MATERIALS));
    itemList.add(iImperialGoldNuggets = new ModItem("imperial_gold_nuggets", CreativeTabs.MATERIALS));

    // Pickaxes
    itemList.add(iCopperHammer = new ModPickaxe("copper_hammer", copperToolMaterial, 0.8F, -2.2F));
    itemList.add(iBronzePickaxe = new ModPickaxe("bronze_pickaxe", bronzeToolMaterial, 1.0F, -2.4F));
    itemList.add(iSteelPickaxe = new ModPickaxe("steel_pickaxe", steelToolMaterial, 1.0F, -2.4F));
    itemList.add(iMithrilPickaxe = new ModPickaxe("mithril_pickaxe", mithrilToolMaterial, 0.7F, -2.6F));
    itemList.add(iCelestialBronzePickaxe = new ModPickaxe("celestial_bronze_pickaxe", celestialBronzeToolMaterial, 1.0F, -2.4F));
    itemList.add(iImperialGoldPickaxe = new ModPickaxe("imperial_gold_pickaxe", imperialGoldToolMaterial, 1.0F, -2.4F));
    itemList.add(iObsidianPickaxe = new ModPickaxe("obsidian_pickaxe", obsidianToolMaterial, 2.0F, -1.0F));

    // Axes
    itemList.add(iCopperAxe = new ModAxe("copper_axe", copperToolMaterial, 7.0F, -3.15F));
    itemList.add(iBronzeAxe = new ModAxe("bronze_axe", bronzeToolMaterial, 7.0F, -3.15F));
    itemList.add(iSteelAxe = new ModAxe("steel_axe", steelToolMaterial, 8.3F, -3.0F));
    itemList.add(iMithrilAxe = new ModAxe("mithril_axe", mithrilToolMaterial, 7.0F, -2.5F));
    itemList.add(iCelestialBronzeAxe = new ModAxe("celestial_bronze_axe", celestialBronzeToolMaterial, 11F, -3.8F));
    itemList.add(iImperialGoldAxe = new ModAxe("imperial_gold_axe", imperialGoldToolMaterial, 8.0F, -2.6F));
    itemList.add(iObsidianAxe = new ModAxe("obsidian_axe", obsidianToolMaterial, 16F, -1.5F));

    // Shovels
    itemList.add(iCopperShovel = new ModSpade("copper_shovel", copperToolMaterial));
    itemList.add(iBronzeShovel = new ModSpade("bronze_shovel", bronzeToolMaterial));
    itemList.add(iSteelShovel = new ModSpade("steel_shovel", steelToolMaterial));
    itemList.add(iMithrilShovel = new ModSpade("mithril_shovel", mithrilToolMaterial));
    itemList.add(iCelestialBronzeShovel = new ModSpade("celestial_bronze_shovel", celestialBronzeToolMaterial));
    itemList.add(iImperialGoldShovel = new ModSpade("imperial_gold_shovel", imperialGoldToolMaterial));
    itemList.add(iObsidianShovel = new ModSpade("obsidian_shovel", obsidianToolMaterial));

    // Hoes
    itemList.add(iCopperHoe = new ModHoe("copper_hoe", copperToolMaterial));
    itemList.add(iBronzeHoe = new ModHoe("bronze_hoe", bronzeToolMaterial));
    itemList.add(iSteelHoe = new ModHoe("steel_hoe", steelToolMaterial));
    itemList.add(iMithrilHoe = new ModHoe("mithril_hoe", mithrilToolMaterial));
    itemList.add(iCelestialBronzeHoe = new ModHoe("celestial_bronze_hoe", celestialBronzeToolMaterial));
    itemList.add(iImperialGoldHoe = new ModHoe("imperial_gold_hoe", imperialGoldToolMaterial));
    itemList.add(iObsidianHoe = new ModHoe("obsidian_hoe", obsidianToolMaterial));

    // Swords
    itemList.add(iBronzeSword = new ModSword("bronze_sword", bronzeToolMaterial));
    itemList.add(iSilverSword = new ModSword("silver_sword", silverToolMaterial));
    itemList.add(iColdIronSword = new ModSword("cold_iron_sword", coldIronToolMaterial));
    itemList.add(iSteelSword = new ModSword("steel_sword", steelToolMaterial));
    itemList.add(iMithrilSword = new ModSword("mithril_sword", mithrilToolMaterial));
    itemList.add(iCelestialBronzeSword = new ModSword("celestial_bronze_sword", celestialBronzeToolMaterial));
    itemList.add(iImperialGoldSword = new ModSword("imperial_gold_sword", imperialGoldToolMaterial));
    itemList.add(iObsidianSword = new ModSword("obsidian_sword", obsidianToolMaterial));
    
    //Armor
    //itemList.add(iCopperArmor = new ModArmor("copper", ModArmor.ArmorMaterial.COPPER, EntityEquipmentSlot.CHEST));
    itemList.add(iColdIronHelmet = new ModArmor("cold_iron", coldIronMaterial, 1, EntityEquipmentSlot.HEAD));
    itemList.add(iColdIronChest = new ModArmor("cold_iron", coldIronMaterial, 1, EntityEquipmentSlot.CHEST));
    itemList.add(iColdIronLegs = new ModArmor("cold_iron", coldIronMaterial, 2, EntityEquipmentSlot.LEGS));
    itemList.add(iColdIronBoots = new ModArmor("cold_iron", coldIronMaterial, 1, EntityEquipmentSlot.FEET));
    itemList.add(iColdIronHelmetBlue = new ModArmor("cold_iron_nether", coldIronMaterial, 1, EntityEquipmentSlot.HEAD));
    itemList.add(iColdIronChestBlue = new ModArmor("cold_iron_nether", coldIronMaterial, 1, EntityEquipmentSlot.CHEST));
    itemList.add(iColdIronLegsBlue = new ModArmor("cold_iron_nether", coldIronMaterial, 2, EntityEquipmentSlot.LEGS));
    itemList.add(iColdIronBootsBlue = new ModArmor("cold_iron_nether", coldIronMaterial, 1, EntityEquipmentSlot.FEET));

    itemList.add(iCopperHelmet = new ModArmor("copper", copperMaterial, 1, EntityEquipmentSlot.HEAD));
    itemList.add(iCopperChest = new ModArmor("copper", copperMaterial, 1, EntityEquipmentSlot.CHEST));
    itemList.add(iCopperLegs = new ModArmor("copper", copperMaterial, 2, EntityEquipmentSlot.LEGS));
    itemList.add(iCopperBoots = new ModArmor("copper", copperMaterial, 1, EntityEquipmentSlot.FEET));

    itemList.add(iBronzeHelmet = new ModArmor("bronze", bronzeMaterial, 1, EntityEquipmentSlot.HEAD));
    itemList.add(iBronzeChest = new ModArmor("bronze", bronzeMaterial, 1, EntityEquipmentSlot.CHEST));
    itemList.add(iBronzeLegs = new ModArmor("bronze", bronzeMaterial, 2, EntityEquipmentSlot.LEGS));
    itemList.add(iBronzeBoots = new ModArmor("bronze", bronzeMaterial, 1, EntityEquipmentSlot.FEET));

    itemList.add(iSteelHelmet = new ModArmor("steel", steelMaterial, 1, EntityEquipmentSlot.HEAD));
    itemList.add(iSteelChest = new ModArmor("steel", steelMaterial, 1, EntityEquipmentSlot.CHEST));
    itemList.add(iSteelLegs = new ModArmor("steel", steelMaterial, 2, EntityEquipmentSlot.LEGS));
    itemList.add(iSteelBoots = new ModArmor("steel", steelMaterial, 1, EntityEquipmentSlot.FEET));

    itemList.add(iMithrilHelmet = new ModArmor("mithril", mithrilMaterial, 1, EntityEquipmentSlot.HEAD));
    itemList.add(iMithrilChest = new ModArmor("mithril", mithrilMaterial, 1, EntityEquipmentSlot.CHEST));
    itemList.add(iMithrilLegs = new ModArmor("mithril", mithrilMaterial, 2, EntityEquipmentSlot.LEGS));
    itemList.add(iMithrilBoots = new ModArmor("mithril", mithrilMaterial, 1, EntityEquipmentSlot.FEET));
    
    itemList.add(iArcticTeleporter = new ModItemTeleporter("arctic_teleporter", ExpandedAesthetics.snowDimensionId));
    
    //Plants
    itemList.add(iStrawberry = new ModItem("strawberry", CreativeTabs.FOOD));
    itemList.add(iBlueStrawberry = new ModItem("strawberry_blue", CreativeTabs.FOOD));
    itemList.add(iStrawberrySeed = new ModItemSeeds(strawberry, Blocks.FARMLAND, "seeds_strawberry"));
    
    itemList.add(iBlueberry = new ModItem("blueberry", CreativeTabs.FOOD));
    itemList.add(iGreenBlueberry = new ModItem("blueberry_green", CreativeTabs.FOOD));
    itemList.add(iStrawberrySeed = new ModItemSeeds(blueberry, Blocks.FARMLAND, "seeds_blueberry"));
    
    itemList.add(iBellPepperRed = new ModItem("bell_pepper_red", CreativeTabs.FOOD));
    itemList.add(iBellPepperOrange = new ModItem("bell_pepper_orange", CreativeTabs.FOOD));
    itemList.add(iBellPepperYellow = new ModItem("bell_pepper_yellow", CreativeTabs.FOOD));
    itemList.add(iBellPepperGreen = new ModItem("bell_pepper_green", CreativeTabs.FOOD));
    itemList.add(iCayennePepper = new ModItem("cayenne_pepper", CreativeTabs.FOOD));
    itemList.add(iJalapenoPepper = new ModItem("jalapeno_pepper", CreativeTabs.FOOD));
    itemList.add(iGhostPepper = new ModItem("ghost_pepper", CreativeTabs.FOOD));
    itemList.add(iBellPepperSeed = new ModItemSeeds(bellPepper, Blocks.FARMLAND, "seeds_bell_pepper"));
    
    //Foodstuffs
    itemList.add(iHeavyCream = new ModItem("heavy_cream", CreativeTabs.FOOD));
    itemList.add(iFlour = new ModItem("flour", CreativeTabs.FOOD));
    itemList.add(iSalt = new ModItem("salt", CreativeTabs.FOOD));
    itemList.add(iButter = new ModItem("butter", CreativeTabs.FOOD));
    //itemList.add(iPowderedSugar = new ModItem("powdered_sugar", CreativeTabs.FOOD));
    itemList.add(iBreadBowl = new ModItemFood(5, 0.3F, "bread_bowl"));
    itemList.add(iChickenBroth = new ModItemFood(6, 1.0F, "chicken_broth"));
    itemList.add(iPancakeBatter = new ModItem("pancake_batter", CreativeTabs.FOOD));
    itemList.add(iTortilla = new ModItemFood(2, 0.1F, "tortilla"));
    itemList.add(iCornTortilla = new ModItemFood(2, 0.1F, "corn_tortilla"));
    itemList.add(iGroundBeef = new ModItem("ground_beef", CreativeTabs.FOOD));
    //itemList.add(iTomatoSauce = new ModItem("tomato_sauce", CreativeTabs.FOOD));
    itemList.add(iAlfredoSauce = new ModItem("alfredo_sauce", CreativeTabs.FOOD));
    
    itemList.add(iPotatoSoup = new ModItemSoup(8, 1.0F, "potato_soup"));
    itemList.add(iPotatoSoupInBreadBowl = new ModItemFood(10, 1.2F, "potato_soup_in_bread_bowl"));
    itemList.add(iChickenSoup = new ModItemSoup(6, 0.8F, "chicken_soup"));
    itemList.add(iChickenSoupInBreadBowl = new ModItemFood(8, 1.0F, "chicken_soup_in_bread_bowl"));
    //itemList.add(iVegetableSoup = new ModItemSoup(6, 0.8F, "vegetable_soup"));
    //itemList.add(iVegetableSoupInBreadBowl = new ModItemFood(8, 1.0F, "vegetable_soup_in_bread_bowl"));
    itemList.add(iPancakes = new ModItemFood(2, 0.2F, "pancake"));
    itemList.add(iChocolateChipPancakes = new ModItemFood(2, 0.3F, "chocolate_chip_pancake"));
    itemList.add(iBlueberryPancakes = new ModItemFood(2, 0.3F, "blueberry_pancake"));
    itemList.add(iApplePancakes = new ModItemFood(2, 0.3F, "apple_pancake"));
    itemList.add(iScrambledEggs = new ModItemFood(2, 0.2F, "scrambled_eggs"));
    itemList.add(iBreadSlice = new ModItemFood(1, 0.12F, "bread_slice"));
    itemList.add(iToast = new ModItemFood(1, 0.12F, "toast"));
    itemList.add(iChickenSandwich = new ModItemFood(8, 0.8F, "chicken_sandwich"));
    itemList.add(iBurrito = new ModItemFood(6, 0.6F, "burrito"));
    itemList.add(iTaco = new ModItemFood(4, 0.4F, "taco"));
    itemList.add(iCheese = new ModItemFood(2, 0.3F, "cheese"));
    itemList.add(iCookedBeef = new ModItemFood(2, 0.3F, "browned_beef"));
    itemList.add(iHamburger = new ModItemFood(6, 0.7F, "hamburger"));
    itemList.add(iCheeseburger = new ModItemFood(7, 0.7F, "cheeseburger"));
    itemList.add(iVanillaIceCream = new ModItemFood(3, 0.3F, "vanilla_ice_cream"));
    itemList.add(iChocolateIceCream = new ModItemFood(3, 0.4F, "chocolate_ice_cream"));
    itemList.add(iStrawberryIceCream = new ModItemFood(3, 0.3F, "strawberry_ice_cream"));
    itemList.add(iNeopolitanIceCream = new ModItemFood(3, 0.5F, "neopolitan_ice_cream"));
    itemList.add(iPasta = new ModItemFood(2, 0.4F, "pasta"));
    itemList.add(iFeticciniAlfredo = new ModItemFood(8, 1.0F, "fettuccini_alfredo"));
    itemList.add(iChickenFeticciniAlfredo = new ModItemFood(10, 1.4F, "chicken_fettuccini_alfredo"));
    //itemList.add(iSpaghetti = new ModItemFood(6, 0.8F, "spaghetti"));
    //itemList.add(iMeatball = new ModItemFood(3, 0.4F, "meatball"));
    //itemList.add(iSpaghettiAndMeatballs = new ModItemFood(10, 1.4F, "spaghetti_and_meatballs"));
    itemList.add(iSalsa = new ModItemFood(1, 0.2F, "salsa"));
    itemList.add(iCornChips = new ModItemFood(2, 0.1F, "corn_chips"));
    //itemList.add(iChipsAndSalsa = new ModItemFood(2, 0.3F, "chips_and_salsa"));
    //itemList.add(iNachos = new ModItemFood(4, 0.5F, "nachos"));
    //itemList.add(iChickenParmesan = new ModItemFood(12, 1.6F, "chicken_parmesan"));
    
    /*
     * 
  
  public static ModItemFood iPasta;
  public static ModItemFood iFeticciniAlfredo;
  public static ModItemFood iChickenFeticciniAlfredo;
  public static ModItemFood iSpaghetti;
  public static ModItemFood iMeatball;
  public static ModItemFood iSpaghettiAndMeatballs;
  public static ModItemFood iSalsa;
  public static ModItemFood iCornChips;
  public static ModItemFood iChipsAndSalsa;
  public static ModItemFood iNachos;
  public static ModItemFood iChickenParmesan;
     */

    for (Item item : itemList) {
      createItem(item, event);
    }
    
    for (ItemBlock iBlock : itemBlockList) {
      createItemBlock(iBlock, event);
    }
  }

  private static void createItem(Item item, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(item);
  }

  private static ItemBlock createItemBlock(ItemBlock block, RegistryEvent.Register<Item> event) {
    event.getRegistry().register(block);

    return block;
  }

  public static void registerModels() {
    ////////////////// Item Block Registration
    for (Item item : itemList) {
      register(item);
    }
    for (ItemBlock iBlock : itemBlockList) {
      register(iBlock);
    }
    //////////////////
    
    //Campfire
    register(ibCampfire, 0, "expanded:oak_campfire");
    register(ibLitCampfire, 0, "expanded:oak_campfire");
    register(ibCampfire, 1, "expanded:spruce_campfire");
    register(ibLitCampfire, 1, "expanded:spruce_campfire");
    register(ibCampfire, 2, "expanded:birch_campfire");
    register(ibLitCampfire, 2, "expanded:birch_campfire");
    register(ibCampfire, 3, "expanded:jungle_campfire");
    register(ibLitCampfire, 3, "expanded:jungle_campfire");
    register(ibCampfire, 4, "expanded:acacia_campfire");
    register(ibLitCampfire, 4, "expanded:acacia_campfire");
    register(ibCampfire, 5, "expanded:dark_oak_campfire");
    register(ibLitCampfire, 5, "expanded:dark_oak_campfire");
    
    //Chests
    //register(ibDioritePolishedChest);
  }

  private static void register(Item item) {
    register(item, 0);
  }

  private static void register(Item item, int meta) {
    registerVariant(item, meta, "normal");
  }
  private static void registerVariant(Item item, int meta, String metaName) {
    register(item, meta, metaName, item.getRegistryName());
  }
  private static void register(Item item, int meta, String metaName, ResourceLocation resourceLocation) {
    ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(resourceLocation, metaName));
  }
  private static void register(Item item, int meta, String resourceLocation) {
    ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(resourceLocation));
  }

  public static void registerTileEntities() {
    //GameRegistry.registerTileEntity(ModTileEntityChest.class, "mod_chests");
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