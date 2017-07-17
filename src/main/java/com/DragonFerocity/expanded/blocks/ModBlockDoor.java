package com.DragonFerocity.expanded.blocks;

import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.handlers.BlockHandler;

import java.util.Random;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModBlockDoor extends BlockDoor
{
    public ModBlockDoor(Material materialIn, String name, float hardness, float resistance, int harvestLevel, String tool)
    //Harvest Level: 3 = Diamond, 2 = Iron, 1 = Gold/Stone, 0 = Wood
    {
        super(materialIn);
        setUnlocalizedName(name);
        setUnlocalizedName(Ref.MODID + ":" + name);
        setRegistryName(Ref.MODID + ":" + name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, harvestLevel);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return /*state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.AIR : */this.getModItem();
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this.getModItem());
    }

    private Item getModItem()
    {
        Item dropItem = null;

        if (this == BlockHandler.glassDoor)
          dropItem = BlockHandler.iGlassDoor;
        else if (this == BlockHandler.cobblestoneDoor)
          dropItem = BlockHandler.iCobblestoneDoor;
        else if (this == BlockHandler.andesitePolishedDoor)
          dropItem = BlockHandler.iAndesitePolishedDoor;
        else if (this == BlockHandler.dioritePolishedDoor)
          dropItem = BlockHandler.iDioritePolishedDoor;
        else if (this == BlockHandler.granitePolishedDoor)
          dropItem = BlockHandler.iGranitePolishedDoor;
        else if (this == BlockHandler.hardenedClayDoor)
          dropItem = BlockHandler.iHardenedClayDoor;
        else if (this == BlockHandler.brickDoor)
          dropItem = BlockHandler.iBrickDoor;
        else if (this == BlockHandler.polishedObsidianDoor)
          dropItem = BlockHandler.iPolishedObsidianDoor;
        else if (this == BlockHandler.oakStableDoor)
          dropItem = BlockHandler.iOakStableDoor;
        else if (this == BlockHandler.birchStableDoor)
          dropItem = BlockHandler.iBirchStableDoor;

        return dropItem;
    }
}
