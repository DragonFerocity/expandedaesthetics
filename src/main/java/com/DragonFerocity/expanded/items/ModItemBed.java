package com.DragonFerocity.expanded.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import com.DragonFerocity.expanded.blocks.ModBlockBed;
import com.DragonFerocity.expanded.handlers.BlockHandler;

public class ModItemBed extends Item
{
    private final Block block;
    
    public ModItemBed(Block block, int stackSize)
    {
        this.setCreativeTab(CreativeTabs.DECORATIONS);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setMaxStackSize(stackSize);
        this.block = block;
    }

    /**
     * Called when a Block is right-clicked with this Item
     */
    public EnumActionResult onItemUse(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY)
    {
        if (playerIn.isRemote)
        {
            return EnumActionResult.SUCCESS;
        }
        else if (hand != EnumFacing.UP)
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            IBlockState iblockstate = playerIn.getBlockState(worldIn);
            Block block = iblockstate.getBlock();
            boolean flag = block.isReplaceable(playerIn, worldIn);

            if (!flag)
            {
                worldIn = worldIn.up();
            }

            int i = MathHelper.floor((double)(stack.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
            EnumFacing enumfacing = EnumFacing.getHorizontal(i);
            BlockPos blockpos = worldIn.offset(enumfacing);
            ItemStack itemstack = stack.getHeldItem(pos);

            if (stack.canPlayerEdit(worldIn, hand, itemstack) && stack.canPlayerEdit(blockpos, hand, itemstack))
            {
                IBlockState iblockstate1 = playerIn.getBlockState(blockpos);
                boolean flag1 = iblockstate1.getBlock().isReplaceable(playerIn, blockpos);
                boolean flag2 = flag || playerIn.isAirBlock(worldIn);
                boolean flag3 = flag1 || playerIn.isAirBlock(blockpos);

                if (flag2 && flag3 && playerIn.getBlockState(worldIn.down()).isFullyOpaque() && playerIn.getBlockState(blockpos.down()).isFullyOpaque())
                {
                    IBlockState iblockstate2 = this.block.getDefaultState().withProperty(ModBlockBed.OCCUPIED, Boolean.valueOf(false)).withProperty(ModBlockBed.FACING, enumfacing).withProperty(ModBlockBed.PART,ModBlockBed.EnumPartType.FOOT);
                    playerIn.setBlockState(worldIn, iblockstate2, 10);
                    playerIn.setBlockState(blockpos, iblockstate2.withProperty(ModBlockBed.PART, ModBlockBed.EnumPartType.HEAD), 10);
                    playerIn.notifyNeighborsRespectDebug(worldIn, block, false);
                    playerIn.notifyNeighborsRespectDebug(blockpos, iblockstate1.getBlock(), false);
                    SoundType soundtype = iblockstate2.getBlock().getSoundType();
                    playerIn.playSound((EntityPlayer)null, worldIn, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                    itemstack.shrink(1);
                    return EnumActionResult.SUCCESS;
                }
                else
                {
                    return EnumActionResult.FAIL;
                }
            }
            else
            {
                return EnumActionResult.FAIL;
            }
        }
    }
}
