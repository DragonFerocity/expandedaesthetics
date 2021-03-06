package com.DragonFerocity.expanded.blocks;

import java.util.Random;

import com.DragonFerocity.expanded.ExpandedAesthetics;
import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.entities.ModTileEntityAlloyFurnace;
import com.DragonFerocity.expanded.handlers.BlockHandler;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModAlloyFurnace extends BlockContainer {
  public static final PropertyDirection FACING = BlockHorizontal.FACING;
  private final boolean isBurning;
  private static boolean keepInventory;

  public ModAlloyFurnace(boolean isBurning, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvest)
  {
      super(Material.IRON);
      this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
      this.isBurning = isBurning;
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
      setCreativeTab(tab);
      setHardness(hardness);
      setResistance(resistance);
      setHarvestLevel(tool, harvest);
  }

  /**
   * Get the Item that this Block should drop when harvested.
   */
  public Item getItemDropped(IBlockState state, Random rand, int fortune)
  {
      return BlockHandler.ibAlloyFurnace;
  }

  /**
   * Called after the block is set in the Chunk data, but before the Tile Entity is set
   */
  public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
  {
      this.setDefaultFacing(worldIn, pos, state);
  }

  private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
  {
      if (!worldIn.isRemote)
      {
          IBlockState iblockstate = worldIn.getBlockState(pos.north());
          IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
          IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
          IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
          EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

          if (enumfacing == EnumFacing.NORTH && iblockstate.isFullBlock() && !iblockstate1.isFullBlock())
          {
              enumfacing = EnumFacing.SOUTH;
          }
          else if (enumfacing == EnumFacing.SOUTH && iblockstate1.isFullBlock() && !iblockstate.isFullBlock())
          {
              enumfacing = EnumFacing.NORTH;
          }
          else if (enumfacing == EnumFacing.WEST && iblockstate2.isFullBlock() && !iblockstate3.isFullBlock())
          {
              enumfacing = EnumFacing.EAST;
          }
          else if (enumfacing == EnumFacing.EAST && iblockstate3.isFullBlock() && !iblockstate2.isFullBlock())
          {
              enumfacing = EnumFacing.WEST;
          }

          worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
      }
  }

  @SideOnly(Side.CLIENT)
  @SuppressWarnings("incomplete-switch")
  public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
  {
      if (this.isBurning)
      {
          EnumFacing enumfacing = (EnumFacing)stateIn.getValue(FACING);
          double xx = (double)pos.getX() + 0.5D;
          double yy = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
          double zz = (double)pos.getZ() + 0.5D;
          double d4 = rand.nextDouble() * 0.6D - 0.3D;
          double rand1 = rand.nextDouble() * 0.6D - 0.3D;
          double rand2 = rand.nextDouble() * 0.6D - 0.3D;
          double rand3 = rand.nextDouble() * 0.6D - 0.3D;
          double rand4 = rand.nextDouble() * 0.6D - 0.3D;

          if (rand.nextDouble() < 0.1D)
          {
              worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
          }

          switch (enumfacing)
          {
              case WEST:
                  worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx - 0.52D, yy, zz + d4, 0.0D, 0.0D, 0.0D);
                  worldIn.spawnParticle(EnumParticleTypes.FLAME, xx - 0.52D, yy, zz + d4, 0.0D, 0.0D, 0.0D);
                  break;
              case EAST:
                  worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx + 0.52D, yy, zz + d4, 0.0D, 0.0D, 0.0D);
                  worldIn.spawnParticle(EnumParticleTypes.FLAME, xx + 0.52D, yy, zz + d4, 0.0D, 0.0D, 0.0D);
                  break;
              case NORTH:
                  worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx + d4, yy, zz - 0.52D, 0.0D, 0.0D, 0.0D);
                  worldIn.spawnParticle(EnumParticleTypes.FLAME, xx + d4, yy, zz - 0.52D, 0.0D, 0.0D, 0.0D);
                  break;
              case SOUTH:
                  worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx + d4, yy, zz + 0.52D, 0.0D, 0.0D, 0.0D);
                  worldIn.spawnParticle(EnumParticleTypes.FLAME, xx + d4, yy, zz + 0.52D, 0.0D, 0.0D, 0.0D);
          }
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx - 0.25D, yy, zz + rand1, 0.0D, 0.0D, 0.0D);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, xx - 0.25D, yy, zz + rand1, 0.0D, 0.0D, 0.0D);
          
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx + 0.25D, yy, zz + rand2, 0.0D, 0.0D, 0.0D);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, xx + 0.25D, yy, zz + rand2, 0.0D, 0.0D, 0.0D);
          
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx + rand3, yy, zz - 0.25D, 0.0D, 0.0D, 0.0D);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, xx + rand3, yy, zz - 0.25D, 0.0D, 0.0D, 0.0D);
          
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx + rand4, yy, zz + 0.25D, 0.0D, 0.0D, 0.0D);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, xx + rand4, yy, zz + 0.25D, 0.0D, 0.0D, 0.0D);
      }
  }

  /**
   * Called when the block is right clicked by a player.
   */
  public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
  {
      if (worldIn.isRemote)
      {
          return true;
      }
      else
      {
          TileEntity tileentity = worldIn.getTileEntity(pos);

          if (tileentity instanceof ModTileEntityAlloyFurnace)
          {
              playerIn.openGui((Object)ExpandedAesthetics.instance, BlockHandler.GUI_ENUM.ALLOY_FURNACE.ordinal(), worldIn, pos.getX(), pos.getY(), pos.getZ());
              playerIn.addStat(StatList.FURNACE_INTERACTION);
          }

          return true;
      }
  }

  public static void setState(boolean active, World worldIn, BlockPos pos)
  {
      IBlockState iblockstate = worldIn.getBlockState(pos);
      TileEntity tileentity = worldIn.getTileEntity(pos);
      keepInventory = true;

      if (active)
      {
          worldIn.setBlockState(pos, BlockHandler.litAlloyFurnace.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
          worldIn.setBlockState(pos, BlockHandler.litAlloyFurnace.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
      }
      else
      {
          worldIn.setBlockState(pos, BlockHandler.alloyFurnace.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
          worldIn.setBlockState(pos, BlockHandler.alloyFurnace.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
      }

      keepInventory = false;

      if (tileentity != null)
      {
          tileentity.validate();
          worldIn.setTileEntity(pos, tileentity);
      }
  }

  /**
   * Returns a new instance of a block's tile entity class. Called on placing the block.
   */
  @Override
  public TileEntity createNewTileEntity(World worldIn, int meta)
  {
      return new ModTileEntityAlloyFurnace();
  }

  /**
   * Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the
   * IBlockstate
   */
  public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
  {
      return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
  }

  /**
   * Called by ItemBlocks after a block is set in the world, to allow post-place logic
   */
  public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
  {
      worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);

      if (stack.hasDisplayName())
      {
          TileEntity tileentity = worldIn.getTileEntity(pos);

          if (tileentity instanceof ModTileEntityAlloyFurnace)
          {
              ((ModTileEntityAlloyFurnace)tileentity).setCustomInventoryName(stack.getDisplayName());
          }
      }
  }

  /**
   * Called serverside after this block is replaced with another in Chunk, but before the Tile Entity is updated
   */
  public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
  {
      if (!keepInventory)
      {
          TileEntity tileentity = worldIn.getTileEntity(pos);

          if (tileentity instanceof ModTileEntityAlloyFurnace)
          {
              InventoryHelper.dropInventoryItems(worldIn, pos, (ModTileEntityAlloyFurnace)tileentity);
              worldIn.updateComparatorOutputLevel(pos, this);
          }
      }

      super.breakBlock(worldIn, pos, state);
  }

  public boolean hasComparatorInputOverride(IBlockState state)
  {
      return true;
  }

  public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos)
  {
      return Container.calcRedstone(worldIn.getTileEntity(pos));
  }

  public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
  {
      return new ItemStack(BlockHandler.alloyFurnace);
  }

  /**
   * The type of render function called. MODEL for mixed tesr and static model, MODELBLOCK_ANIMATED for TESR-only,
   * LIQUID for vanilla liquids, INVISIBLE to skip all rendering
   */
  public EnumBlockRenderType getRenderType(IBlockState state)
  {
      return EnumBlockRenderType.MODEL;
  }

  /**
   * Convert the given metadata into a BlockState for this Block
   */
  public IBlockState getStateFromMeta(int meta)
  {
      EnumFacing enumfacing = EnumFacing.getFront(meta);

      if (enumfacing.getAxis() == EnumFacing.Axis.Y)
      {
          enumfacing = EnumFacing.NORTH;
      }

      return this.getDefaultState().withProperty(FACING, enumfacing);
  }

  /**
   * Convert the BlockState into the correct metadata value
   */
  public int getMetaFromState(IBlockState state)
  {
      return ((EnumFacing)state.getValue(FACING)).getIndex();
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
