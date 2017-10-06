package com.DragonFerocity.expanded.items;

import com.DragonFerocity.expanded.Ref;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ModItemFood extends ItemFood {
  /** Number of ticks to run while 'EnumAction'ing until result. */
  public final int itemUseDuration;
  /** The amount this food item heals the player. */
  private final int healAmount;
  private final float saturationModifier;

  public ModItemFood(int hungerRefillAmount, float hungerSaturation, String name)
  {
      super(hungerRefillAmount, hungerSaturation, false);
      this.itemUseDuration = 32;
      this.healAmount = hungerRefillAmount;
      this.saturationModifier = hungerSaturation;
      this.setCreativeTab(CreativeTabs.FOOD);
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
  }
}
