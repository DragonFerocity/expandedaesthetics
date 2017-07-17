package com.DragonFerocity.expanded.items;

import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.blocks.ModLamp;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModItemLamp extends Item {
  private final Block block;

  public ModItemLamp(Block block, String name, int stackSize)
  {
      this.block = block;
      setCreativeTab(CreativeTabs.DECORATIONS);
      setMaxStackSize(stackSize);
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
  }
  
  /**
   * Called when a Block is right-clicked with this Item
   */
  public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
  {
      if (facing != EnumFacing.UP)
      {
          return EnumActionResult.FAIL;
      }
      else
      {
          IBlockState iblockstate = worldIn.getBlockState(pos);
          Block block = iblockstate.getBlock();

          if (!block.isReplaceable(worldIn, pos))
          {
              pos = pos.offset(facing);
          }

          ItemStack itemstack = player.getHeldItem(hand);

          if (player.canPlayerEdit(pos, facing, itemstack) && this.block.canPlaceBlockAt(worldIn, pos))
          {
              EnumFacing enumfacing = EnumFacing.fromAngle((double)player.rotationYaw);
              placeLamp(worldIn, pos, enumfacing, this.block);
              SoundType soundtype = worldIn.getBlockState(pos).getBlock().getSoundType(worldIn.getBlockState(pos), worldIn, pos, player);
              worldIn.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
              itemstack.shrink(1);
              return EnumActionResult.SUCCESS;
          }
          else
          {
              return EnumActionResult.FAIL;
          }
      }
  }

  public static void placeLamp(World worldIn, BlockPos pos, EnumFacing facing, Block lamp)
  {
      BlockPos blockpos2 = pos.up();
      IBlockState iblockstate = lamp.getDefaultState().withProperty(ModLamp.FACING, facing);
      worldIn.setBlockState(pos, iblockstate.withProperty(ModLamp.HALF, ModLamp.EnumLampHalf.LOWER), 2);
      worldIn.setBlockState(blockpos2, iblockstate.withProperty(ModLamp.HALF, ModLamp.EnumLampHalf.UPPER), 2);
      worldIn.notifyNeighborsOfStateChange(pos, lamp, false);
      worldIn.notifyNeighborsOfStateChange(blockpos2, lamp, false);
  }
}
