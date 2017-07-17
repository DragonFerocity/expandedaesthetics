package com.DragonFerocity.expanded.blocks;

import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.handlers.BlockHandler;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ModBlockGrandfatherClock extends Block
{
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D);
    protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D);
    public static final PropertyEnum<ModBlockGrandfatherClock.EnumHalf> HALF = PropertyEnum.<ModBlockGrandfatherClock.EnumHalf>create("half", ModBlockGrandfatherClock.EnumHalf.class);
	
    public ModBlockGrandfatherClock(Material materialIn, String name, float hardness, float resistance, int harvestLevel)
    //Harvest Level: 3 = Diamond, 2 = Iron, 1 = Gold/Stone, 0 = Wood
    {
        super(materialIn);
        setUnlocalizedName(Ref.MODID + ":" + name);
        setRegistryName(Ref.MODID + ":" + name);
        setCreativeTab(CreativeTabs.DECORATIONS);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel("pickaxe", harvestLevel);
    }
    
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        state = state.getActualState(source, pos);
        EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

        switch (enumfacing)
        {
            case EAST:
            default:
                return EAST_AABB;

            case SOUTH:
                return SOUTH_AABB;

            case WEST:
                return WEST_AABB;

            case NORTH:
                return NORTH_AABB;
        }
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this.getModItem();
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this.getModItem());
    }

    private Item getModItem()
    {
        Item dropItem = null;

        if (this == BlockHandler.oakGrandfatherClock)
          dropItem = BlockHandler.iOakGrandfatherClock;

        return dropItem;
    }
    
    public static int combineMetadata(IBlockAccess worldIn, BlockPos pos)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        int i = iblockstate.getBlock().getMetaFromState(iblockstate);
        boolean flag = isTop(i);
        IBlockState iblockstate1 = worldIn.getBlockState(pos.down());
        int j = iblockstate1.getBlock().getMetaFromState(iblockstate1);
        int k = flag ? j : i;
        IBlockState iblockstate2 = worldIn.getBlockState(pos.up());
        int l = iblockstate2.getBlock().getMetaFromState(iblockstate2);
        int i1 = flag ? i : l;
        boolean flag1 = (i1 & 1) != 0;
        boolean flag2 = (i1 & 2) != 0;
        return removeHalfBit(k) | (flag ? 8 : 0) | (flag1 ? 16 : 0) | (flag2 ? 32 : 0);
    }
    
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;

        if (state.getValue(HALF) == ModBlockGrandfatherClock.EnumHalf.UPPER)
        {
            i = i | 8;
        }
        else
        {
            i = i | ((EnumFacing)state.getValue(FACING)).rotateY().getHorizontalIndex();
        }

        return i;
    }
    
    protected static int removeHalfBit(int meta)
    {
        return meta & 7;
    }
    
    public static EnumFacing getFacing(IBlockAccess worldIn, BlockPos pos)
    {
        return getFacing(combineMetadata(worldIn, pos));
    }

    public static EnumFacing getFacing(int combinedMeta)
    {
        return EnumFacing.getHorizontal(combinedMeta & 3).rotateYCCW();
    }
    
    protected static boolean isTop(int meta)
    {
        return (meta & 8) != 0;
    }
    
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {HALF, FACING});
    }
    
    public static enum EnumHalf implements IStringSerializable
    {
        UPPER,
        LOWER;

        public String toString()
        {
            return this.getName();
        }

        public String getName()
        {
            return this == UPPER ? "upper" : "lower";
        }
    }
}
