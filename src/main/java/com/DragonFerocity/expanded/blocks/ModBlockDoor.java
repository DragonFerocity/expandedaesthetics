package com.DragonFerocity.expanded.blocks;

import com.DragonFerocity.expanded.handlers.BlockHandler;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ModBlockDoor extends BlockDoor
{
    public String blockName;

    public ModBlockDoor(Material materialIn, String name, float hardness, float resistance)
    {
        super(materialIn);
        //setUnlocalizedName(name);
        //setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel("pickaxe", 0);
        blockName = name;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        System.out.println("INSIDE");
        return /*state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? Items.field_190931_a : */this.getModItem();
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this.getItem());
    }

    private Item getModItem()
    {
        System.out.println("Blocks equal? " + (this == BlockHandler.glassDoor) + " : " + (this.blockName == BlockHandler.glassDoor.blockName));
        return this.blockName == BlockHandler.glassDoor.blockName ? BlockHandler.iGlassDoor : null;
    }
}
