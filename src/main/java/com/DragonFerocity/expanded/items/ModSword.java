package com.DragonFerocity.expanded.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.DragonFerocity.expanded.items.ModTool;
import com.google.common.collect.Multimap;

public class ModSword extends ModItem {
  private final float attackDamage;
  private final ModTool.ToolMaterial material;

  public ModSword(String name, ModTool.ToolMaterial material)
  {
      super(name, CreativeTabs.COMBAT, 1);
      this.material = material;
      this.maxStackSize = 1;
      this.setMaxDamage(material.getMaxUses());
      this.setCreativeTab(CreativeTabs.COMBAT);
      this.attackDamage = 3.0F + material.getDamageVsEntity();
  }

  /**
   * Returns the amount of damage this item will deal. One heart of damage is equal to 2 damage points.
   */
  public float getDamageVsEntity()
  {
      return this.material.getDamageVsEntity();
  }

  public float getStrVsBlock(ItemStack stack, IBlockState state)
  {
      Block block = state.getBlock();

      if (block == Blocks.WEB)
      {
          return 15.0F;
      }
      else
      {
          Material material = state.getMaterial();
          return material != Material.PLANTS && material != Material.VINE && material != Material.CORAL && material != Material.LEAVES && material != Material.GOURD ? 1.0F : 1.5F;
      }
  }

  /**
   * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
   * the damage on the stack.
   */
  public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
  {
      stack.damageItem(1, attacker);
      return true;
  }
  
  /*@Override
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
  {
      entity.attackEntityFrom(DamageSource.GENERIC, 10.0F);
      return false;
  }*/

  /**
   * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
   */
  public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
  {
      if ((double)state.getBlockHardness(worldIn, pos) != 0.0D)
      {
          stack.damageItem(2, entityLiving);
      }

      return true;
  }

  /**
   * Returns True is the item is renderer in full 3D when hold.
   */
  public boolean isFull3D()
  {
      return true;
  }

  /**
   * Check whether this Item can harvest the given Block
   */
  public boolean canHarvestBlock(IBlockState blockIn)
  {
      return blockIn.getBlock() == Blocks.WEB;
  }

  /**
   * Return the enchantability factor of the item, most of the time is based on material.
   */
  public int getItemEnchantability()
  {
      return this.material.getEnchantability();
  }

  /**
   * Return the name for this tool's material.
   */
  public String getToolMaterialName()
  {
      return this.material.toString();
  }

  /**
   * Return whether this item is repairable in an anvil.
   */
  public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
  {
      return this.material.getRepairItem() == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
  }

  public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
  {
      Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

      if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
      {
          multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, 0));
          multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4000000953674316D, 0));
      }

      return multimap;
  }
}
