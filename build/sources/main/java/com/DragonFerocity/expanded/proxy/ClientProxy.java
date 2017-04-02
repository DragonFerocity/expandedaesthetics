package com.DragonFerocity.expanded.proxy;

import com.DragonFerocity.expanded.handlers.BlockHandler;

import net.minecraft.item.Item;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {
  public void init() {
    registerRenders();
  }

  public void registerRenders() {
    //Register Items
    register(BlockHandler.iTutItem);

    //Register Blocks
    register(BlockHandler.ibTutBlock);
    register(BlockHandler.ibGlassDoor);
  }


  private void register(Item item) {
    register(item, 0);
  }

  private void register(Item item, int meta) {
    register(item, meta, item.getRegistryName().toString());
  }

  private void register(Item item, int meta, String name) {
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(name, "inventory"));
  }
}