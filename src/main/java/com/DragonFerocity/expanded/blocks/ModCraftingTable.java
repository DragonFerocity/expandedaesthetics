package com.DragonFerocity.expanded.blocks;

import com.DragonFerocity.expanded.ExpandedAesthetics;
import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.handlers.BlockHandler;
import com.DragonFerocity.expanded.inventory.ModContainerCraftingTable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class ModCraftingTable extends Block {
  public ModCraftingTable(String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
    super(Material.WOOD);
    setUnlocalizedName(Ref.MODID + ":" + name);
    setRegistryName(Ref.MODID + ":" + name);
    setCreativeTab(tab);
    setHardness(hardness);
    setResistance(resistance);
    setHarvestLevel(tool, harvest);
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
  public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
  {
      //playerIn.openGui((Object)ExpandedAesthetics.instance, BlockHandler.GUI_ENUM.CRAFTING_TABLE.ordinal(), worldIn, pos.getX(), pos.getY(), pos.getZ());
      playerIn.displayGui(new ModCraftingTable.InterfaceCraftingTable(worldIn, pos));
      playerIn.addStat(StatList.CRAFTING_TABLE_INTERACTION);
      return true;
  }
  
  public static class InterfaceCraftingTable implements IInteractionObject
  {
      private final World world;
      private final BlockPos position;

      public InterfaceCraftingTable(World worldIn, BlockPos pos)
      {
          this.world = worldIn;
          this.position = pos;
      }

      /**
       * Get the name of this object. For players this returns their username
       */
      public String getName()
      {
          return "crafting_table";
      }

      /**
       * Returns true if this thing is named
       */
      public boolean hasCustomName()
      {
          return false;
      }

      /**
       * Get the formatted ChatComponent that will be used for the sender's username in chat
       */
      public ITextComponent getDisplayName()
      {
          return new TextComponentTranslation(Blocks.CRAFTING_TABLE.getUnlocalizedName() + ".name", new Object[0]);
      }

      public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
      {
          return new ModContainerCraftingTable(playerInventory, this.world, this.position);
      }

      public String getGuiID()
      {
          return "minecraft:crafting_table";
      }
  }
}
