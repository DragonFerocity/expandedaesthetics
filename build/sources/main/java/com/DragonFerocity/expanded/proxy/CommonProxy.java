package com.DragonFerocity.expanded.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import com.DragonFerocity.expanded.handlers.BlockHandler;
import com.DragonFerocity.expanded.OreGen;

public class CommonProxy implements IProxy {
  public void preInit() {
    //ItemHandler.init();
    //ItemHandler.register();
  
    BlockHandler.init();
    GameRegistry.registerWorldGenerator(new OreGen(), 0);
    //BlockHandler.register();
  }

  public void init() {
  
  }

  public void postInit() {
  
  }
}