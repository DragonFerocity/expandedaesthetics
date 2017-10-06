package com.DragonFerocity.expanded;

import com.DragonFerocity.expanded.handlers.GuiHandler;
import com.DragonFerocity.expanded.proxy.IProxy;
import com.DragonFerocity.expanded.world.TeleporterArctic;
import com.DragonFerocity.expanded.world.WorldProviderArctic;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

@Mod(modid = Ref.MODID, name = Ref.NAME, version = Ref.VERSION)
public class ExpandedAesthetics {

  //Dimensions
  public static int snowDimensionId = DimensionManager.getNextFreeDimId();
  public static DimensionType arcticDimension;
  
  @Instance(Ref.MODID)
  public static ExpandedAesthetics instance;

  @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.SERVER_PROXY)
  public static IProxy proxy;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    proxy.preInit();
    NetworkRegistry.INSTANCE.registerGuiHandler(ExpandedAesthetics.instance, new GuiHandler());
    arcticDimension = DimensionType.register("arctic", "_arctic", snowDimensionId, WorldProviderArctic.class, false);
    DimensionManager.registerDimension(snowDimensionId, arcticDimension);
    DimensionManager.createProviderFor(snowDimensionId);
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
