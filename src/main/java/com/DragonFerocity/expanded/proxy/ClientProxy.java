package com.DragonFerocity.expanded.proxy;

import com.DragonFerocity.expanded.entities.ModTileEntityChest;
import com.DragonFerocity.expanded.handlers.BlockHandler;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ClientProxy extends ServerProxy {
  public void preInit() {
    
  }
  
  public void init() {
    //registerTileEntitySpecialRenderer(ModTileEntityChest.class);
    //registerTileEntitySpecialRenderer(ModTileEntityChest.class);
  }
  
  public static <T extends ModTileEntityChest> void registerTileEntitySpecialRenderer(Class<T> type)
  {
      //ClientRegistry.bindTileEntitySpecialRenderer(type, new ModTileEntityChestRenderer());
  }
  
  @SubscribeEvent
  public static void registerModels(ModelRegistryEvent event) {
    BlockHandler.registerModels();
  }
}