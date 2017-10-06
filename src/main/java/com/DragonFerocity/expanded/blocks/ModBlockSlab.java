package com.DragonFerocity.expanded.blocks;

import java.util.Random;

import com.DragonFerocity.expanded.Ref;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class ModBlockSlab extends BlockSlab {
  public ModBlockSlab(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
    super(mat);
    setUnlocalizedName(Ref.MODID + ":" + name);
    setRegistryName(Ref.MODID + ":" + name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
    setHarvestLevel(tool, harvest);
    
    /*IBlockState state = this.blockState.getBaseState();
    if (!this.isDouble()){
      state = state.withProperty(BlockSlab.HALF, BlockSlab.EnumBlockHalf.BOTTOM);
    }
    this.setDefaultState(state);*/
    this.useNeighborBrightness = true;
  }
  /**
   * Used to determine ambient occlusion and culling when rebuilding chunks for render
   */
  @Override
  public boolean isOpaqueCube(IBlockState state)
  {
      return false;
  }
  @Override
  public boolean isFullCube(IBlockState state)
  {
      return false;
  }
  @Override
  public String getUnlocalizedName(int meta)
  {
      return super.getUnlocalizedName();
  }
  @Override
  public IProperty<?> getVariantProperty(){
    return BlockSlab.HALF;
  }
  @Override
  public Comparable<?> getTypeForItem(ItemStack item){
    return BlockSlab.EnumBlockHalf.BOTTOM;
  }
  @Override
  public int damageDropped(IBlockState state){
    return 0;
  }
  /*@Override
  public IBlockState getStateFromMeta(int meta){
    if (!this.isDouble())
      return this.getDefaultState().withProperty(BlockSlab.HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
    return this.getStateFromMeta(meta);
  }
  @Override
  public int getMetaFromState(IBlockState state){
    if (this.isDouble())
      return 0;
    return ((EnumBlockHalf)state.getValue(BlockSlab.HALF)).ordinal() + 1;
  }*/
  @Override
  public Item getItemDropped(IBlockState state, Random rand, int fortune)
  {
      return Item.getItemFromBlock(state.getBlock());
  }
}
