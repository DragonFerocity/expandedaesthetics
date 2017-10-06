package com.DragonFerocity.expanded.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {
  public static void init() {
    initSmeltingRecipes();
  }

  private static void initSmeltingRecipes() {
    //Smelting Ore
    GameRegistry.addSmelting(BlockHandler.iCopperNuggets, new ItemStack(BlockHandler.iCopperIngot), 0.2F);
    //GameRegistry.addSmelting(BlockHandler.ibTinOre, new ItemStack(BlockHandler.iTinIngot), 0.25F);
    GameRegistry.addSmelting(BlockHandler.iBronzeNuggets, new ItemStack(BlockHandler.iBronzeIngot), 0.3F);
    GameRegistry.addSmelting(BlockHandler.ibPlatinumOre, new ItemStack(BlockHandler.iPlatinumIngot), 0.3F);
    //GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(BlockHandler.iSteelIngot), 0.7F);
    GameRegistry.addSmelting(BlockHandler.ibSilverOre, new ItemStack(BlockHandler.iSilverIngot), 0.2F);
    GameRegistry.addSmelting(Items.WATER_BUCKET, new ItemStack(BlockHandler.iSalt), 0F);
    //GameRegistry.addSmelting(BlockHandler.ibMithrilOre, new ItemStack(BlockHandler.iMithrilIngot), 1.3F);
    //GameRegistry.addSmelting(BlockHandler.ibTitaniumOre, new ItemStack(BlockHandler.iTitaniumIngot), 1.5F);
    
    //GameRegistry.addSmelting(BlockHandler.iCelestialBronzeNuggets, new ItemStack(BlockHandler.iCelestialBronzeIngot), 5F);
    //GameRegistry.addSmelting(BlockHandler.iImperialGoldNuggets, new ItemStack(BlockHandler.iImperialGoldIngot), 5F);
  }
}