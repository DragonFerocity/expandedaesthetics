package com.DragonFerocity.expanded.handlers;

import com.DragonFerocity.expanded.entities.ModTileEntityAlloyFurnace;
import com.DragonFerocity.expanded.gui.ModGuiAlloyFurnace;
import com.DragonFerocity.expanded.inventory.ModContainerAlloyFurnace;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
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
        }
        return null;
    }
}