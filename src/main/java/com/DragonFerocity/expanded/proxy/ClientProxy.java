package com.DragonFerocity.expanded.proxy;

import com.DragonFerocity.expanded.entities.ModTileEntityChest;
import com.DragonFerocity.expanded.entities.ModTileEntityChestRenderer;
import com.DragonFerocity.expanded.handlers.BlockHandler;
import com.DragonFerocity.expanded.handlers.GuiHandler;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends ServerProxy {
  public void init() {
    BlockHandler.registerRenders();
    //registerTileEntitySpecialRenderer(ModTileEntityChest.class);
    registerTileEntitySpecialRenderer(ModTileEntityChest.class);
  }
  
  public static <T extends ModTileEntityChest> void registerTileEntitySpecialRenderer(Class<T> type)
  {
      //ClientRegistry.bindTileEntitySpecialRenderer(type, new ModTileEntityChestRenderer());
  }
}