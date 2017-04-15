package com.DragonFerocity.expanded.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.block.BlockStone;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {
  public static void init() {
    initDoorRecipes();
  }

  private static void initDoorRecipes() {
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iGlassDoor, 3), "##", "##", "##", '#', Blocks.GLASS);
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iCobblestoneDoor, 3), "##", "##", "##", '#', Blocks.COBBLESTONE);
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iAndesitePolishedDoor, 3), "##", "##", "##", '#', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata()));
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iGranitePolishedDoor, 3), "##", "##", "##", '#', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata()));
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iDioritePolishedDoor, 3), "##", "##", "##", '#', new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata()));
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iBrickDoor, 3), "##", "##", "##", '#', Blocks.BRICK_BLOCK);
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iObsidianDoor, 3), "##", "##", "##", '#', Blocks.OBSIDIAN);
    GameRegistry.addRecipe(new ItemStack(BlockHandler.iHardenedClayDoor, 3), "##", "##", "##", '#', Blocks.HARDENED_CLAY);
    GameRegistry.addRecipe(new ItemStack(BlockHandler.ibOakLantern, 1), "#", "T", '#', Blocks.PLANKS, 'T', Blocks.TORCH);
    GameRegistry.addRecipe(new ItemStack(BlockHandler.ibOakLamp, 1), "T", "#", "#", '#', Blocks.PLANKS, 'T', Blocks.TORCH);
  }
}