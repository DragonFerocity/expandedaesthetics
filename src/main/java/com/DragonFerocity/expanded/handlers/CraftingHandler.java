package com.DragonFerocity.expanded.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockStone;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {
  public static void init() {
    initSmeltingRecipes();
  }

  private static void initSmeltingRecipes() {
    //Smelting Ore
    GameRegistry.addSmelting(BlockHandler.ibCopperOre, new ItemStack(BlockHandler.iCopperIngot), 0.2F);
    //GameRegistry.addSmelting(BlockHandler.ibTinOre, new ItemStack(BlockHandler.iTinIngot), 0.25F);
    GameRegistry.addSmelting(BlockHandler.iBronzeNuggets, new ItemStack(BlockHandler.iBronzeIngot), 0.4F);
    GameRegistry.addSmelting(BlockHandler.ibPlatinumOre, new ItemStack(BlockHandler.iPlatinumIngot), 0.5F);
    GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(BlockHandler.iSteelIngot), 0.7F);
    GameRegistry.addSmelting(BlockHandler.ibSilverOre, new ItemStack(BlockHandler.iSilverIngot), 0.6F);
    GameRegistry.addSmelting(BlockHandler.ibMithrilOre, new ItemStack(BlockHandler.iMithrilIngot), 1.3F);
    GameRegistry.addSmelting(BlockHandler.ibTitaniumOre, new ItemStack(BlockHandler.iTitaniumIngot), 1.5F);
    
    GameRegistry.addSmelting(BlockHandler.iCelestialBronzeNuggets, new ItemStack(BlockHandler.iCelestialBronzeIngot), 5F);
    GameRegistry.addSmelting(BlockHandler.iImperialGoldNuggets, new ItemStack(BlockHandler.iImperialGoldIngot), 5F);
  }
}