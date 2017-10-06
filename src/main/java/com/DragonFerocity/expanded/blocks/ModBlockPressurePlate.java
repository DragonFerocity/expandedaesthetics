package com.DragonFerocity.expanded.blocks;

import java.util.List;

import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.handlers.BlockHandler;

import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModBlockPressurePlate extends BlockBasePressurePlate {
  public static final PropertyBool POWERED = PropertyBool.create("powered");
  private final ModBlockPressurePlate.Sensitivity sensitivity;
  
  public ModBlockPressurePlate(String name, Material materialIn, ModBlockPressurePlate.Sensitivity sensitivityIn, float hardness, float resistance, int harvest, String tool)
  {
      super(materialIn);
      this.setDefaultState(this.blockState.getBaseState().withProperty(POWERED, Boolean.valueOf(false)));
      this.sensitivity = sensitivityIn;
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
      setCreativeTab(CreativeTabs.REDSTONE);
      setHardness(hardness);
      setResistance(resistance);
      setHarvestLevel(tool, harvest);
  }
  
  protected int getRedstoneStrength(IBlockState state)
  {
      return ((Boolean)state.getValue(POWERED)).booleanValue() ? 15 : 0;
  }
  
  protected IBlockState setRedstoneStrength(IBlockState state, int strength)
  {
      return state.withProperty(POWERED, Boolean.valueOf(strength > 0));
  }

  protected void playClickOnSound(World worldIn, BlockPos color)
  {
      if (this == BlockHandler.silverPressurePlate)
      {
          worldIn.playSound((EntityPlayer)null, color, SoundEvents.BLOCK_STONE_PRESSPLATE_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.6F);
      }
      else
      {
        worldIn.playSound((EntityPlayer)null, color, SoundEvents.BLOCK_WOOD_PRESSPLATE_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.8F);
      }
  }

  protected void playClickOffSound(World worldIn, BlockPos pos)
  {
      if (this == BlockHandler.silverPressurePlate)
      {
          worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_STONE_PRESSPLATE_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.5F);
      }
      else
      {
        worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_WOOD_PRESSPLATE_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.7F);
      }
  }
  
  protected int computeRedstoneStrength(World worldIn, BlockPos pos)
  {
      AxisAlignedBB axisalignedbb = PRESSURE_AABB.offset(pos);
      List <? extends Entity > list;

      switch (this.sensitivity)
      {
          case PLAYER:
              list = worldIn.<Entity>getEntitiesWithinAABB(EntityPlayer.class, axisalignedbb);
              break;
          default:
              return 0;
      }

      if (!list.isEmpty())
      {
          for (Entity entity : list)
          {
              if (!entity.doesEntityNotTriggerPressurePlate())
              {
                  return 15;
              }
          }
      }

      return 0;
  }
  
  /**
   * Convert the given metadata into a BlockState for this Block
   */
  @Override
  public IBlockState getStateFromMeta(int meta)
  {
      return this.getDefaultState().withProperty(POWERED, Boolean.valueOf(meta == 1));
  }

  /**
   * Convert the BlockState into the correct metadata value
   */
  @Override
  public int getMetaFromState(IBlockState state)
  {
      return ((Boolean)state.getValue(POWERED)).booleanValue() ? 1 : 0;
  }
  @Override
  protected BlockStateContainer createBlockState()
  {
      return new BlockStateContainer(this, new IProperty[] {POWERED});
  }
  
  public static enum Sensitivity
  {
      PLAYER;
  }
}
