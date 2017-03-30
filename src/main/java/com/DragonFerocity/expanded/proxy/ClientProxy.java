package com.DragonFerocity.expanded.proxy;

import com.DragonFerocity.expanded.handlers.ItemHandler;
import com.DragonFerocity.expanded.handlers.BlockHandler;

public class ClientProxy extends CommonProxy {
  public void init() {
    ItemHandler.registerRenders();
    BlockHandler.registerRenders();
  }
}