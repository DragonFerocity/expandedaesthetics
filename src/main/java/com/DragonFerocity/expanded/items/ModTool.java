package com.DragonFerocity.expanded.items;

import java.util.Set;

import com.DragonFerocity.expanded.handlers.BlockHandler;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ModTool extends ItemTool {
  private final Set<Block> effectiveBlocks;
  protected float efficiencyOnProperMaterial;
  /** Damage versus entities. */
  protected float damageVsEntity;
  protected float attackSpeed;
  /** The material this tool is made from. */
  protected ModTool.ToolMaterial toolMaterial;

  protected ModTool(float attackDamageIn, float attackSpeedIn, ItemTool.ToolMaterial materialIn, Set<Block> effectiveBlocksIn)
  {
      super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
      this.effectiveBlocks = effectiveBlocksIn;
      this.setCreativeTab(CreativeTabs.TOOLS);
  }
  public float getStrVsBlock(ItemStack stack, IBlockState state)
  {
      for (String type : getToolClasses(stack))
      {
          if (state.getBlock().isToolEffective(type, state))
              return efficiencyOnProperMaterial;
      }
      return this.effectiveBlocks.contains(state.getBlock()) ? this.efficiencyOnProperMaterial : 1.0F;
  }
  
  public static enum ToolMaterial
  {
      //               hL, mU,  Effic,  Dmg , en
      WOOD(             0, 59,   2.0F,  0.0F, 15),
      STONE(            1, 131,  4.0F,  1.0F, 5),
      COPPER(           0, 72,   5.0F,  1.5F, 7),
      BRONZE(           1, 175,  5.0F,  1.5F, 7),
      SILVER(           2, 40,   4.0F,  2.0F, 20),
      IRON(             2, 250,  6.0F,  2.0F, 14),
      COLD_IRON(        2, 220,  5.5F,  2.0F, 16),
      STEEL(            2, 550,  7.5F,  3.4F, 12),
      MITHRIL(          3, 850, 12.0F,  2.7F, 6),
      DIAMOND(          3, 1561, 8.0F,  3.0F, 10),
      GOLD(             0, 32,  12.0F,  0.0F, 22),
      CELESTIAL_BRONZE( 3, 620,  7.0F,  3.0F, 15),
      IMPERIAL_GOLD(    3, 260, 10.0F,  2.0F, 25),
      OBSIDIAN(         3, 1000, 4.0F,  8.0F, 12);

      /** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) */
      private final int harvestLevel;
      /** The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
      private final int maxUses;
      /** The strength of this tool material against blocks which it is effective against. */
      private final float efficiencyOnProperMaterial;
      /** Damage versus entities. 4 + this variable*/
      private final float damageVsEntity;
      /** Defines the natural enchantability factor of the material. */
      private final int enchantability;
      //Added by forge for custom Tool materials.
      private ItemStack repairMaterial = ItemStack.EMPTY;

      private ToolMaterial(int harvestLevel, int maxUses, float efficiency, float damageVsEntity, int enchantability)
      {
          this.harvestLevel = harvestLevel;
          this.maxUses = maxUses;
          this.efficiencyOnProperMaterial = efficiency;
          this.damageVsEntity = damageVsEntity;
          this.enchantability = enchantability;
      }

      public int getMaxUses()
      {
          return this.maxUses;
      }

      public float getEfficiencyOnProperMaterial()
      {
          return this.efficiencyOnProperMaterial;
      }

      public float getDamageVsEntity()
      {
          return this.damageVsEntity;
      }

      public int getHarvestLevel()
      {
          return this.harvestLevel;
      }

      public int getEnchantability()
      {
          return this.enchantability;
      }

      @Deprecated // Use getRepairItemStack below
      public Item getRepairItem()
      {
        Item itemStack = null;
        if (this == WOOD) {
          itemStack = Item.getItemFromBlock(Blocks.PLANKS);
        }
        else if (this == BRONZE) {
          itemStack = BlockHandler.iBronzeIngot;
        }
        else if (this == STEEL) {
          itemStack = BlockHandler.iSteelIngot;
        }
        else if (this == MITHRIL) {
          itemStack = BlockHandler.iMithrilIngot;
        }
        else if (this == CELESTIAL_BRONZE) {
          itemStack = BlockHandler.iCelestialBronzeIngot;
        }
        else if (this == IMPERIAL_GOLD) {
          itemStack = BlockHandler.iImperialGoldIngot;
        }
        else if (this == STONE) {
          itemStack = Item.getItemFromBlock(Blocks.COBBLESTONE);
        }
        else if (this == GOLD) {
          itemStack = Items.GOLD_INGOT;
        }
        else if (this == IRON) {
          itemStack = Items.IRON_INGOT;
        }
        else if (this == DIAMOND) {
          itemStack = Items.DIAMOND;
        }
        else if (this == OBSIDIAN) {
          itemStack = Item.getItemFromBlock(Blocks.OBSIDIAN);
        }
        return itemStack;
      }
      
      public ToolMaterial setRepairItem(ItemStack stack)
      {
          if (!this.repairMaterial.isEmpty()) throw new RuntimeException("Repair material has already been set");
          if (this == WOOD || this == STONE || this == GOLD || this == IRON || this == DIAMOND) throw new RuntimeException("Can not change vanilla tool repair materials");
          this.repairMaterial = stack;
          return this;
      }
      
      public ItemStack getRepairItemStack()
      {
          if (!repairMaterial.isEmpty()) return repairMaterial;
          Item ret = this.getRepairItem();
          if (ret != null) repairMaterial = new ItemStack(ret, 1, net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE);
          return repairMaterial;
      }
  }
}
