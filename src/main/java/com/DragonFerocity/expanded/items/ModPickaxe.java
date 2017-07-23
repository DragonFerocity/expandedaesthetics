package com.DragonFerocity.expanded.items;

import java.util.Set;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.DragonFerocity.expanded.items.ModTool;
import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.handlers.BlockHandler;

public class ModPickaxe extends ModTool {
  private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE, BlockHandler.copperOre, BlockHandler.tinOre, BlockHandler.platinumOre, BlockHandler.silverOre, BlockHandler.mithrilOre, BlockHandler.titaniumOre, BlockHandler.copperBlock, BlockHandler.tinBlock, BlockHandler.bronzeBlock, BlockHandler.platinumBlock, BlockHandler.silverBlock, BlockHandler.mithrilBlock, BlockHandler.titaniumBlock, BlockHandler.steelBlock, BlockHandler.celestialBronzeBlock, BlockHandler.imperialGoldBlock, BlockHandler.coldIronBlock});
  
  public ModPickaxe(String name, ModTool.ToolMaterial material, float attackDmg, float attackSpd) {
    super(attackDmg, attackSpd, material, EFFECTIVE_ON);
    setUnlocalizedName(Ref.MODID + ":" + name);
    setRegistryName(Ref.MODID + ":" + name);
  }
  
  /**
   * Check whether this Item can harvest the given Block
   */
  public boolean canHarvestBlock(IBlockState blockIn)
  {
      Block block = blockIn.getBlock();
      int harvestLevel = this.toolMaterial.getHarvestLevel();
      
      //Base Harvest Levels
      //3: Obsidian (Diamond)
      //2: Gold, Emerald, Diamond, Redstone, Platinum, Silver, Mithril, Titanium (Iron)
      //1: Iron, Tin, Copper (Stone/Gold)
      //0: Stone, Coal (Wood)
      
      if (block == Blocks.OBSIDIAN)
      {
          return harvestLevel >= 3;
      }
      else if (block == Blocks.DIAMOND_BLOCK && block == Blocks.DIAMOND_ORE &&
               block == Blocks.EMERALD_ORE && block == Blocks.EMERALD_BLOCK &&
               block == Blocks.GOLD_BLOCK && block == Blocks.GOLD_ORE && 
               block == Blocks.REDSTONE_ORE && block == Blocks.LIT_REDSTONE_ORE &&
               block == BlockHandler.mithrilOre &&
               block == BlockHandler.titaniumOre)
      {
          return harvestLevel >= 2;
      }
      else if (block == Blocks.IRON_BLOCK && block == Blocks.IRON_ORE &&
               block == Blocks.LAPIS_BLOCK && block == Blocks.LAPIS_ORE &&
               block == BlockHandler.copperOre &&
               block == BlockHandler.tinOre &&
               block == BlockHandler.platinumOre &&
               block == BlockHandler.silverOre)
      {
          return  harvestLevel >= 1;
      }
      else
      {
          Material material = blockIn.getMaterial();
          return material == Material.ROCK ? true : (material == Material.IRON ? true : material == Material.ANVIL);
      }
  }
  
  public float getStrVsBlock(ItemStack stack, IBlockState state)
  {
      Material material = state.getMaterial();
      return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
  }

}
