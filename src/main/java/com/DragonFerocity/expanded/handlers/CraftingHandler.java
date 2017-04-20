package com.DragonFerocity.expanded.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockStone;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {
  public static void init() {
    initDoorRecipes();
  }

  private static void initDoorRecipes() {
    //Andesite
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iAndesitePolishedDoor, 3), "##", "##", "##", '#', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata()));
    
    //Brick
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iBrickDoor, 3), "##", "##", "##", '#', Blocks.BRICK_BLOCK);
    
    //Diorite
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iDioritePolishedDoor, 3), "##", "##", "##", '#', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata()));
    GameRegistry.addRecipe(new ItemStack(BlockHandler.ibDioritePolishedStairs, 3), "  #", " ##", "###", '#', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata()));
    GameRegistry.addRecipe(new ItemStack(BlockHandler.ibDioritePolishedLamp, 1), "T", "#", "#", '#', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata()), 'T', Blocks.TORCH);
    
    //Cobblestone
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iCobblestoneDoor, 3), "##", "##", "##", '#', Blocks.COBBLESTONE);
    
    //Glass
    //Regular
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iGlassDoor, 3), "##", "##", "##", '#', Blocks.GLASS);
    
    //Granite
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iGranitePolishedDoor, 3), "##", "##", "##", '#', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata()));
    
    //Hardened Clay
    //Regular
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iHardenedClayDoor, 3), "##", "##", "##", '#', Blocks.HARDENED_CLAY);
    
    //Oak
    GameRegistry.addRecipe(new ItemStack(BlockHandler.ibOakLantern, 2), "#", "T", '#', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.OAK.getMetadata()), 'T', Blocks.TORCH);
    GameRegistry.addRecipe(new ItemStack(BlockHandler.ibOakLamp, 1), "T", "#", "#", '#', new ItemStack(Blocks.PLANKS, 1, BlockPlanks.EnumType.OAK.getMetadata()), 'T', Blocks.TORCH);
    
    //Obsidian
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iObsidianDoor, 3), "##", "##", "##", '#', Blocks.OBSIDIAN);
    
    //Smelting Ore
    GameRegistry.addSmelting(BlockHandler.ibCopperOre, new ItemStack(BlockHandler.iCopperIngot), 0.4F);
    GameRegistry.addSmelting(BlockHandler.ibPlatinumOre, new ItemStack(BlockHandler.iPlatinumIngot), 0.5F);
    GameRegistry.addSmelting(BlockHandler.ibSilverOre, new ItemStack(BlockHandler.iSilverIngot), 0.6F);
    GameRegistry.addSmelting(BlockHandler.ibMithrilOre, new ItemStack(BlockHandler.iMithrilIngot), 1.3F);
    GameRegistry.addSmelting(BlockHandler.ibTitaniumOre, new ItemStack(BlockHandler.iTitaniumIngot), 1.5F);
    
    //Ore Blocks
    GameRegistry.addRecipe(new ItemStack(BlockHandler.ibCopperBlock, 1), "CCC", "CCC", "CCC", 'C', BlockHandler.iCopperIngot);
    GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.iCopperIngot, 9), BlockHandler.ibCopperBlock);
  }
}