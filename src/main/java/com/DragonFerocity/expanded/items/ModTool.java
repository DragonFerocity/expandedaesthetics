package com.DragonFerocity.expanded.items;

import com.DragonFerocity.expanded.handlers.BlockHandler;
import com.google.common.collect.Multimap;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ModTool extends Item {
  private final Set<Block> effectiveBlocks;
  protected float efficiencyOnProperMaterial;
  /** Damage versus entities. */
  protected float damageVsEntity;
  protected float attackSpeed;
  /** The material this tool is made from. */
  protected ModTool.ToolMaterial toolMaterial;

  protected ModTool(float attackDamageIn, float attackSpeedIn, ModTool.ToolMaterial materialIn, Set<Block> effectiveBlocksIn)
  {
      this.efficiencyOnProperMaterial = 4.0F;
      this.toolMaterial = materialIn;
      this.effectiveBlocks = effectiveBlocksIn;
      this.maxStackSize = 1;
      this.setMaxDamage(materialIn.getMaxUses());
      this.efficiencyOnProperMaterial = materialIn.getEfficiencyOnProperMaterial();
      this.damageVsEntity = attackDamageIn + materialIn.getDamageVsEntity();
      this.attackSpeed = attackSpeedIn;
      this.setCreativeTab(CreativeTabs.TOOLS);
      if (this instanceof ModPickaxe)
      {
          toolClass = "pickaxe";
      }
      /*else if (this instanceof ItemAxe)
      {
          toolClass = "axe";
      }
      else if (this instanceof ItemSpade)
      {
          toolClass = "shovel";
      }*/
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

  /**
   * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
   * the damage on the stack.
   */
  public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
  {
      stack.damageItem(2, attacker);
      return true;
  }

  /**
   * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
   */
  public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
  {
      if (!worldIn.isRemote && (double)state.getBlockHardness(worldIn, pos) != 0.0D)
      {
          stack.damageItem(1, entityLiving);
      }

      return true;
  }

  /**
   * Returns True is the item is renderer in full 3D when hold.
   */
  @SideOnly(Side.CLIENT)
  public boolean isFull3D()
  {
      return true;
  }

  public ModTool.ToolMaterial getToolMaterial()
  {
      return this.toolMaterial;
  }

  /**
   * Return the enchantability factor of the item, most of the time is based on material.
   */
  public int getItemEnchantability()
  {
      return this.toolMaterial.getEnchantability();
  }

  /**
   * Return the name for this tool's material.
   */
  public String getToolMaterialName()
  {
      return this.toolMaterial.toString();
  }

  /**
   * Return whether this item is repairable in an anvil.
   */
  public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
  {
      ItemStack mat = this.toolMaterial.getRepairItemStack();
      if (!mat.isEmpty() && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
      return super.getIsRepairable(toRepair, repair);
  }

  public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
  {
      Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

      if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
      {
          multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", (double)this.damageVsEntity, 0));
          multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", (double)this.attackSpeed, 0));
      }

      return multimap;
  }

  /*===================================== FORGE START =================================*/
  @javax.annotation.Nullable
  private String toolClass;
  @Override
  public int getHarvestLevel(ItemStack stack, String toolClass, @javax.annotation.Nullable net.minecraft.entity.player.EntityPlayer player, @javax.annotation.Nullable IBlockState blockState)
  {
      int level = super.getHarvestLevel(stack, toolClass,  player, blockState);
      if (level == -1 && toolClass.equals(this.toolClass))
      {
          return this.toolMaterial.getHarvestLevel();
      }
      else
      {
          return level;
      }
  }

  @Override
  public Set<String> getToolClasses(ItemStack stack)
  {
      return toolClass != null ? com.google.common.collect.ImmutableSet.of(toolClass) : super.getToolClasses(stack);
  }
  /*===================================== FORGE END =================================*/
  
  public static enum ToolMaterial
  {
      //               hL, mU,  Effic,  Dmg , en
      WOOD(             0, 59,   2.0F,  0.0F, 15),
      STONE(            1, 131,  4.0F,  1.0F, 5),
      BRONZE(           1, 175,  5.0F,  1.5F, 7),
      SILVER(           2, 40,   4.0F,  2.0F, 20),
      IRON(             2, 250,  6.0F,  2.0F, 14),
      STEEL(            2, 550,  7.5F,  3.4F, 12),
      MITHRIL(          3, 850, 12.0F,  2.7F, 6),
      DIAMOND(          3, 1561, 8.0F,  3.0F, 10),
      GOLD(             0, 32,  12.0F,  0.0F, 22),
      CELESTIAL_BRONZE( 3, 620,  7.0F,  5.0F, 19),
      IMPERIAL_GOLD(    3, 260,  9.0F,  4.0F, 25),
      OBSIDIAN(         3, 1200, 3.0F,  8.0F, 12);

      /** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) */
      private final int harvestLevel;
      /** The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
      private final int maxUses;
      /** The strength of this tool material against blocks which it is effective against. */
      private final float efficiencyOnProperMaterial;
      /** Damage versus entities. */
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
