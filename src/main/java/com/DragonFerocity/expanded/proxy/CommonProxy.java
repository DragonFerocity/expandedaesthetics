package com.DragonFerocity.expanded.proxy;

import com.DragonFerocity.expanded.handlers.ItemHandler;
import com.DragonFerocity.expanded.handlers.BlockHandler;

public class CommonProxy implements IProxy {
  public void preInit() {
    ItemHandler.init();
    ItemHandler.register();
  
    BlockHandler.init();
    BlockHandler.register();
  }

  public void init() {
  
  }

  public void postInit() {
  
  }
}