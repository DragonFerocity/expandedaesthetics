package com.DragonFerocity.expanded.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
}
