package com.DragonFerocity.expanded.proxy;

import com.DragonFerocity.expanded.entities.ModTileEntityChest;
import com.DragonFerocity.expanded.entities.ModTileEntityChestRenderer;
import com.DragonFerocity.expanded.handlers.BlockHandler;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
  public void init() {
    BlockHandler.registerRenders();
    //registerTileEntitySpecialRenderer(ModTileEntityChest.class);
  }
  
  public static <T extends ModTileEntityChest> void registerTileEntitySpecialRenderer(Class<T> type)
  {
      //ClientRegistry.bindTileEntitySpecialRenderer(type, new ModTileEntityChestRenderer());
  }
}