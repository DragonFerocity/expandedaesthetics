package com.DragonFerocity.expanded.handlers;

import com.DragonFerocity.expanded.blocks.ModCraftingTable;
import com.DragonFerocity.expanded.entities.ModTileEntityAlloyFurnace;
import com.DragonFerocity.expanded.entities.ModTileEntityCampfire;
import com.DragonFerocity.expanded.gui.ModGuiAlloyFurnace;
import com.DragonFerocity.expanded.gui.ModGuiCampfire;
import com.DragonFerocity.expanded.inventory.ModContainerAlloyFurnace;
import com.DragonFerocity.expanded.inventory.ModContainerCampfire;

import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiHandler implements IGuiHandler
{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
    { 
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        if (tileEntity != null)
        {
          if (ID == BlockHandler.GUI_ENUM.ALLOY_FURNACE.ordinal())
          {
              return new ModContainerAlloyFurnace(player.inventory, (ModTileEntityAlloyFurnace)tileEntity);
          }
          else if (ID == BlockHandler.GUI_ENUM.CRAFTING_TABLE.ordinal())
          {
              return new ModCraftingTable.InterfaceCraftingTable(world, new BlockPos(x, y, z));
          }
          else if (ID == BlockHandler.GUI_ENUM.CAMPFIRE.ordinal())
          {
              return new ModContainerCampfire(player.inventory, (ModTileEntityCampfire)tileEntity);
          }
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        if (tileEntity != null)
        {
          if (ID == BlockHandler.GUI_ENUM.ALLOY_FURNACE.ordinal())
          {
              return new ModGuiAlloyFurnace(player.inventory, (ModTileEntityAlloyFurnace)tileEntity);
          }
          else if (ID == BlockHandler.GUI_ENUM.CRAFTING_TABLE.ordinal())
          {
              return new GuiCrafting(player.inventory, world, new BlockPos(x, y, z));
          }
          else if (ID == BlockHandler.GUI_ENUM.CAMPFIRE.ordinal())
          {
              return new ModGuiCampfire(player.inventory, (ModTileEntityCampfire)tileEntity);
          }
        }
        return null;
    }
}