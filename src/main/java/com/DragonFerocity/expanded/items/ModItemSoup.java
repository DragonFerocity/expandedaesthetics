package com.DragonFerocity.expanded.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemSoup extends ModItemFood {
  public ModItemSoup(int healAmount, float saturationAmount, String name)
  {
      super(healAmount, saturationAmount, name);
      this.setMaxStackSize(1);
  }

  /**
   * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
   * the Item before the action is complete.
   */
  public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
  {
      super.onItemUseFinish(stack, worldIn, entityLiving);
      return new ItemStack(Items.BOWL);
  }
}
