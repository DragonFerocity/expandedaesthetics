package com.DragonFerocity.expanded.proxy;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.DragonFerocity.expanded.handlers.BlockHandler;
import com.DragonFerocity.expanded.handlers.CraftingHandler;
import com.DragonFerocity.expanded.handlers.GuiHandler;
import com.DragonFerocity.expanded.ExpandedAesthetics;
import com.DragonFerocity.expanded.OreGen;

public class ServerProxy implements IProxy {
  public void preInit() {
    //ItemHandler.init();
    //ItemHandler.register();
  
    //BlockHandler.init();
    //CraftingHandler.init();
    GameRegistry.registerWorldGenerator(new OreGen(), 0);
    //BlockHandler.register();
    //NetworkRegistry.INSTANCE.registerGuiHandler(ExpandedAesthetics.instance, new GuiHandler());
  }

  public void init() {
    //NetworkRegistry.INSTANCE.registerGuiHandler(ExpandedAesthetics.instance, new GuiHandler());
  }

  public void postInit() {
  
  }
}