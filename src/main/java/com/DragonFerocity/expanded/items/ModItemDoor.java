package com.DragonFerocity.expanded.items;

import com.DragonFerocity.expanded.Ref;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ModItemDoor extends ItemDoor
{
    public ModItemDoor(Block block, String name, int stackSize)
    {
        super (block);
        setUnlocalizedName(Ref.MODID + ":" + name);
        setRegistryName(Ref.MODID + ":" + name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setMaxStackSize(stackSize);
    }
}
