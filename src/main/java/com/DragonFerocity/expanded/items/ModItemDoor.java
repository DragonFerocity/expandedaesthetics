package com.DragonFerocity.expanded.items;

import com.DragonFerocity.expanded.Ref;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemDoor;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModItemDoor extends ItemDoor
{
    public ModItemDoor(Block block, String name, int stackSize)
    {
        super (block);
        setUnlocalizedName(Ref.MODID + ":" + name + "_item");
        setRegistryName(Ref.MODID + ":" + name + "_item");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setMaxStackSize(stackSize);
    }
}
