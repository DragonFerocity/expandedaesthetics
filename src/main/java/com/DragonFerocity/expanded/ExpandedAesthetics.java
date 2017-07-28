package com.DragonFerocity.expanded;

import com.DragonFerocity.expanded.handlers.BlockHandler;
import com.DragonFerocity.expanded.handlers.GuiHandler;
import com.DragonFerocity.expanded.proxy.IProxy;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@Mod(modid = Ref.MODID, name = Ref.NAME, version = Ref.VERSION)
public class ExpandedAesthetics {

  @Instance(Ref.MODID)
  public static ExpandedAesthetics instance;

  @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.SERVER_PROXY)
  public static IProxy proxy;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    proxy.preInit();
    NetworkRegistry.INSTANCE.registerGuiHandler(ExpandedAesthetics.instance, new GuiHandler());
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    proxy.init();
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    proxy.postInit();
  }
}
