package com.DragonFerocity.expanded.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDoor;

public class ModItemDoor extends ItemDoor
{
    public ModItemDoor(Block block, String name, int stackSize)
    {
        super (block);
        //setUnlocalizedName(Ref.MODID + ":" + name + "_item");
        //setRegistryName(Ref.MODID + ":" + name + "_item");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setMaxStackSize(stackSize);
    }
}
