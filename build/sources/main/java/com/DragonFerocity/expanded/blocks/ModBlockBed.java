package com.DragonFerocity.expanded.blocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

import com.DragonFerocity.expanded.handlers.BlockHandler;

import net.minecraft.block.BlockBed;
import net.minecraft.block.state.IBlockState;

public class ModBlockBed extends BlockBed
{
    public ModBlockBed(float hardness, float resistance, int harvestLevel)
    {
        super();
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel("pickaxe", harvestLevel);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this.getModItem();
    }


    private Item getModItem()
    {
        Item dropItem = null;

        if (this == BlockHandler.dioritePolishedBed)
          dropItem = BlockHandler.iDioritePolishedBed;

        return dropItem;
    }
}
