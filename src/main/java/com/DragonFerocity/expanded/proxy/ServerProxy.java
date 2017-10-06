package com.DragonFerocity.expanded.proxy;

import com.DragonFerocity.expanded.OreGen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ServerProxy implements IProxy {
  public void preInit() {
    GameRegistry.registerWorldGenerator(new OreGen(), 0);
    //NetworkRegistry.INSTANCE.registerGuiHandler(ExpandedAesthetics.instance, new GuiHandler());
  }

  public void init() {
    //NetworkRegistry.INSTANCE.registerGuiHandler(ExpandedAesthetics.instance, new GuiHandler());
  }

  public void postInit() {
  
  }
}