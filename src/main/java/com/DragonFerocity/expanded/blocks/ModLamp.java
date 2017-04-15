package com.DragonFerocity.expanded.blocks;

import com.google.common.base.Predicate;
import java.util.Random;
import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockFence;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;

public class ModLamp extends Block {
  
	public static final PropertyDirection FACING = PropertyDirection.create("facing", new Predicate<EnumFacing>()
	{
	    public boolean apply(@Nullable EnumFacing p_apply_1_)
	    {
	        return p_apply_1_ != EnumFacing.DOWN;
	    }
	});
	protected static final AxisAlignedBB STANDING_AABB = new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 0.8125D, 2.0D, 0.8125D);

  public ModLamp(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool, float light) {
    super(mat);
    //setUnlocalizedName(name);
    //setRegistryName(name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
    setHarvestLevel(tool, harvest);
    setLightLevel(light);
    this.setTickRandomly(true);
    this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
  }

  public ModLamp(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool, float light, int encouragement, int flamability) {
    super(mat);
    //setUnlocalizedName(name);
    //setRegistryName(name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
    setHarvestLevel(tool, harvest);
    setLightLevel(light);
    this.setTickRandomly(true);
    this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
    //BlockFire.setFireInfo(this, encouragement, flamability);
  }

  public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
  {
      switch ((EnumFacing)state.getValue(FACING))
      {
          default:
              return STANDING_AABB;
      }
  }

  @Nullable
  public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
  {
      return NULL_AABB;
  }

  /**
   * Used to determine ambient occlusion and culling when rebuilding chunks for render
   */
  public boolean isOpaqueCube(IBlockState state)
  {
      return false;
  }

  public boolean isFullCube(IBlockState state)
  {
      return false;
  }

  private boolean canPlaceOn(World worldIn, BlockPos pos)
  {
      if (worldIn.getBlockState(pos).isFullyOpaque())
      {
          return true;
      }
      else
      {
          Block block = worldIn.getBlockState(pos).getBlock();
          return block instanceof BlockFence || block == Blocks.COBBLESTONE_WALL;
      }
  }

  public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
  {
      for (EnumFacing enumfacing : FACING.getAllowedValues())
      {
          if (this.canPlaceAt(worldIn, pos, enumfacing))
          {
              return true;
          }
      }

      return false;
  }

  private boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing)
  {
      BlockPos blockpos = pos.offset(facing.getOpposite());
      boolean flag = facing.getAxis().isHorizontal();
      return flag && worldIn.isBlockNormalCube(blockpos, true) || facing.equals(EnumFacing.UP) && this.canPlaceOn(worldIn, blockpos);
  }

  /**
   * Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the
   * IBlockstate
   */
  public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
  {
      if (this.canPlaceAt(worldIn, pos, facing))
      {
          return this.getDefaultState().withProperty(FACING, facing);
      }
      else
      {
          for (EnumFacing enumfacing : EnumFacing.Plane.VERTICAL)
          {
              if (worldIn.isBlockNormalCube(pos.offset(enumfacing.getOpposite()), true))
              {
                  return this.getDefaultState().withProperty(FACING, enumfacing);
              }
          }

          return this.getDefaultState();
      }
  }

  /**
   * Called after the block is set in the Chunk data, but before the Tile Entity is set
   */
  public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
  {
      this.checkForDrop(worldIn, pos, state);
  }

  /**
   * Called when a neighboring block was changed and marks that this state should perform any checks during a neighbor
   * change. Cases may include when redstone power is updated, cactus blocks popping off due to a neighboring solid
   * block, etc.
   */
  public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos p_189540_5_)
  {
      this.onNeighborChangeInternal(worldIn, pos, state);
  }

  protected boolean onNeighborChangeInternal(World worldIn, BlockPos pos, IBlockState state)
  {
      if (!this.checkForDrop(worldIn, pos, state))
      {
          return true;
      }
      else
      {
          EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);
          EnumFacing.Axis enumfacing$axis = enumfacing.getAxis();
          EnumFacing enumfacing1 = enumfacing.getOpposite();
          boolean flag = false;

          if (enumfacing$axis.isHorizontal() && !worldIn.isBlockNormalCube(pos.offset(enumfacing1), true))
          {
              flag = true;
          }
          else if (enumfacing$axis.isVertical() && !this.canPlaceOn(worldIn, pos.offset(enumfacing1)))
          {
              flag = true;
          }

          if (flag)
          {
              this.dropBlockAsItem(worldIn, pos, state, 0);
              worldIn.setBlockToAir(pos);
              return true;
          }
          else
          {
              return false;
          }
      }
  }

  protected boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state)
  {
      if (state.getBlock() == this && this.canPlaceAt(worldIn, pos, (EnumFacing)state.getValue(FACING)))
      {
          return true;
      }
      else
      {
          if (worldIn.getBlockState(pos).getBlock() == this)
          {
              this.dropBlockAsItem(worldIn, pos, state, 0);
              worldIn.setBlockToAir(pos);
          }

          return false;
      }
  }

  public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
  {
      EnumFacing enumfacing = (EnumFacing)stateIn.getValue(FACING);
      double d0 = (double)pos.getX() + 0.5D;
      double d1 = (double)pos.getY() + 1.9D;
      double d2 = (double)pos.getZ() + 0.5D;
      double d3 = 0.22D;
      double d4 = 0.27D;

      if (enumfacing.getAxis().isHorizontal())
      {
          EnumFacing enumfacing1 = enumfacing.getOpposite();
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + 0.27D * (double)enumfacing1.getFrontOffsetX(), d1 + 0.22D, d2 + 0.27D * (double)enumfacing1.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D, new int[0]);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + 0.27D * (double)enumfacing1.getFrontOffsetX(), d1 + 0.22D, d2 + 0.27D * (double)enumfacing1.getFrontOffsetZ(), 0.0D, 0.0D, 0.0D, new int[0]);
      }
      else
      {
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
      }
  }

  public BlockRenderLayer getBlockLayer()
  {
      return BlockRenderLayer.CUTOUT;
  }

  /**
   * Convert the given metadata into a BlockState for this Block
   */
  public IBlockState getStateFromMeta(int meta)
  {
      IBlockState iblockstate = this.getDefaultState();

      switch (meta)
      {
          case 1:
          default:
              iblockstate = iblockstate.withProperty(FACING, EnumFacing.UP);
      }

      return iblockstate;
  }

  /**
   * Convert the BlockState into the correct metadata value
   */
  public int getMetaFromState(IBlockState state)
  {
      int i = 0;

      switch ((EnumFacing)state.getValue(FACING))
      {
          case UP:
          default:
              i = i | 1;
      }

      return i;
  }

  /**
   * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
   * blockstate.
   */
  public IBlockState withRotation(IBlockState state, Rotation rot)
  {
      return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
  }

  /**
   * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
   * blockstate.
   */
  public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
  {
      return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
  }

  protected BlockStateContainer createBlockState()
  {
      return new BlockStateContainer(this, new IProperty[] {FACING});
  }
}