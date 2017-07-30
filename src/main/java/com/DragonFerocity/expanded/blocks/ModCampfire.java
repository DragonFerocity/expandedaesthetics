package com.DragonFerocity.expanded.blocks;

import java.util.Random;

import com.DragonFerocity.expanded.ExpandedAesthetics;
import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.entities.ModTileEntityCampfire;
import com.DragonFerocity.expanded.handlers.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
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
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModCampfire extends Block {
  public static final PropertyEnum<BlockPlanks.EnumType> TYPE = PropertyEnum.<BlockPlanks.EnumType>create("type", BlockPlanks.EnumType.class);
  private final boolean isBurning;
  protected static boolean keepInventory;

  public ModCampfire(boolean isBurning, String name, CreativeTabs tab, float hardness, float resistance, String tool, int harvest)
  {
      super(Material.WOOD);
      this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, BlockPlanks.EnumType.OAK));
      this.isBurning = isBurning;
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
      setCreativeTab(tab);
      setHardness(hardness);
      setResistance(resistance);
      setHarvestLevel(tool, harvest);
      
      if (isBurning)
        setLightLevel((float)13 / 15);
  }

  @SideOnly(Side.CLIENT)
  @SuppressWarnings("incomplete-switch")
  public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
  {
      if (this.isBurning)
      {
          double xx = (double)pos.getX() + 0.5D;
          double yy = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
          double zz = (double)pos.getZ() + 0.5D;
          double rand1 = rand.nextDouble() * 0.6D - 0.3D;
          double rand2 = rand.nextDouble() * 0.6D - 0.3D;
          double rand3 = rand.nextDouble() * 0.6D - 0.3D;
          double rand4 = rand.nextDouble() * 0.6D - 0.3D;
          double rand5 = rand.nextDouble() * 0.6D - 0.1D;

          if (rand.nextDouble() < 0.1D)
          {
              worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_FIRE_AMBIENT, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
          }
          
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx - 0.25D, yy, zz + rand1, 0.0D, 0.0D, 0.0D);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, xx - 0.25D, yy, zz + rand1, 0.0D, 0.0D, 0.0D);
          
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx + 0.25D, yy, zz + rand2, 0.0D, 0.0D, 0.0D);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, xx + 0.25D, yy, zz + rand2, 0.0D, 0.0D, 0.0D);
          
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx + rand3, yy, zz - 0.25D, 0.0D, 0.0D, 0.0D);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, xx + rand3, yy, zz - 0.25D, 0.0D, 0.0D, 0.0D);
          
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx + rand4, yy, zz + 0.25D, 0.0D, 0.0D, 0.0D);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, xx + rand4, yy, zz + 0.25D, 0.0D, 0.0D, 0.0D);
          
          worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, xx, yy + rand5, zz, 0.0D, 0.0D, 0.0D);
          worldIn.spawnParticle(EnumParticleTypes.FLAME, xx, yy + rand5, zz, 0.0D, 0.0D, 0.0D);
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

          if (tileentity instanceof ModTileEntityCampfire)
          {
              playerIn.openGui((Object)ExpandedAesthetics.instance, BlockHandler.GUI_ENUM.CAMPFIRE.ordinal(), worldIn, pos.getX(), pos.getY(), pos.getZ());
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
          worldIn.setBlockState(pos, BlockHandler.litCampfire.getDefaultState().withProperty(TYPE, iblockstate.getValue(TYPE)), 3);
          worldIn.setBlockState(pos, BlockHandler.litCampfire.getDefaultState().withProperty(TYPE, iblockstate.getValue(TYPE)), 3);
      }
      else
      {
          worldIn.setBlockState(pos, BlockHandler.campfire.getDefaultState().withProperty(TYPE, iblockstate.getValue(TYPE)), 3);
          worldIn.setBlockState(pos, BlockHandler.campfire.getDefaultState().withProperty(TYPE, iblockstate.getValue(TYPE)), 3);
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
  public TileEntity createTileEntity(World worldIn, IBlockState state)
  {
      return new ModTileEntityCampfire();
  }
  
  @Override
  public boolean hasTileEntity(IBlockState state)
  {
    return true;
  }

  /**
   * Called by ItemBlocks after a block is set in the world, to allow post-place logic
   */
  public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
  {
      //worldIn.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);

      if (stack.hasDisplayName())
      {
          TileEntity tileentity = worldIn.getTileEntity(pos);

          if (tileentity instanceof ModTileEntityCampfire)
          {
              ((ModTileEntityCampfire)tileentity).setCustomInventoryName(stack.getDisplayName());
          }
      }
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

  /**
   * Called serverside after this block is replaced with another in Chunk, but before the Tile Entity is updated
   */
  public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
  {
      if (!keepInventory)
      {
          TileEntity tileentity = worldIn.getTileEntity(pos);

          if (tileentity instanceof ModTileEntityCampfire)
          {
              InventoryHelper.dropInventoryItems(worldIn, pos, (ModTileEntityCampfire)tileentity);
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
      return new ItemStack(Item.getItemFromBlock(this));
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
  @Override
  public IBlockState getStateFromMeta(int meta)
  {
    IBlockState b = this.getDefaultState().withProperty(TYPE, BlockPlanks.EnumType.values()[meta]);
    return b;
  }

  /**
   * Convert the BlockState into the correct metadata value
   */
  @Override
  public int getMetaFromState(IBlockState state)
  {
    int a = ((BlockPlanks.EnumType)state.getValue(TYPE)).getMetadata();
    return a;
  }
  
  @Override
  protected BlockStateContainer createBlockState()
  {
      return new BlockStateContainer(this, new IProperty[] {TYPE});
  }
}
