package com.DragonFerocity.expanded.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@Mod.EventBusSubscriber
public class RegistryHandler {
  
  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event) {
    BlockHandler.initBlocks(event);
  }
  
  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    BlockHandler.initItems(event);
    CraftingHandler.init();
    BlockHandler.registerTileEntities();
  }
  
  @SubscribeEvent
  public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
  {
      BlockHandler.removeRegisteredItems(event);
  }
}
