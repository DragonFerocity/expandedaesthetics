package com.DragonFerocity.expanded.items;

import com.DragonFerocity.expanded.Ref;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DimensionType;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ModItemTeleporter extends Item {
  private int dimToTeleportTo;
  
  public ModItemTeleporter(String name, int DimensionId)
  {
      setCreativeTab(CreativeTabs.MISC);
      setMaxStackSize(1);
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
      dimToTeleportTo = DimensionId;
  }
  @Override
  public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
  {
    MinecraftServer minecraftserver = player.getServer();
    
    if (player.dimension == 0) {
      player.world.removeEntity(player);
      player.changeDimension(dimToTeleportTo);
      if (player.dimension == dimToTeleportTo)
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
      else
        return new ActionResult<ItemStack>(EnumActionResult.FAIL, player.getHeldItem(handIn));
    }
    else {
      player.changeDimension(DimensionType.OVERWORLD.getId());
      return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
    }
  }
  
  /*private Entity changePlayerDimension(EntityPlayer player, int newDimension) {
    if (!player.world.isRemote && !player.isDead)
    {
        if (!net.minecraftforge.common.ForgeHooks.onTravelToDimension(player, newDimension)) return null;
        player.world.profiler.startSection("changeDimension");
        MinecraftServer minecraftserver = player.getServer();
        int oldDimension = player.dimension;
        WorldServer worldserver = minecraftserver.getWorld(oldDimension);
        WorldServer worldserver1 = minecraftserver.getWorld(newDimension);
        int overworldId = DimensionType.OVERWORLD.getId();
        player.dimension = newDimension;

        player.world.removeEntity(player);
        player.isDead = false;
        player.world.profiler.startSection("reposition");
        BlockPos blockpos;

        if (newDimension != overworldId)
        {
            blockpos = worldserver1.getSpawnCoordinate();
        }

        worldserver.updateEntityWithOptionalForce(player, false);
        player.world.profiler.endStartSection("reloading");
        Entity entity = EntityList.newEntity(player.getClass(), worldserver1);

        if (entity != null)
        {
            entity.copyDataFromOld(player);

            if (oldDimension == 1 && newDimension == 1)
            {
                BlockPos blockpos1 = worldserver1.getTopSolidOrLiquidBlock(worldserver1.getSpawnPoint());
                entity.moveToBlockPosAndAngles(blockpos1, entity.rotationYaw, entity.rotationPitch);
            }
            else
            {
                entity.moveToBlockPosAndAngles(blockpos, entity.rotationYaw, entity.rotationPitch);
            }

            boolean flag = entity.forceSpawn;
            entity.forceSpawn = true;
            worldserver1.spawnEntity(entity);
            entity.forceSpawn = flag;
            worldserver1.updateEntityWithOptionalForce(entity, false);
        }

        player.isDead = true;
        player.world.profiler.endSection();
        worldserver.resetUpdateEntityTick();
        worldserver1.resetUpdateEntityTick();
        player.world.profiler.endSection();
        return entity;
    }
    else
    {
        return null;
    }
  }*/
}
