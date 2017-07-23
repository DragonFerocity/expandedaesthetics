package com.DragonFerocity.expanded;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;

public class ModAlloyFurnaceRecipes {
  private static final ModAlloyFurnaceRecipes SMELTING_BASE = new ModAlloyFurnaceRecipes();
  /** The list of smelting results. */
  private final Map<ItemStack[], ItemStack> smeltingList = Maps.<ItemStack[], ItemStack>newHashMap();
  /** A list which contains how many experience points each recipe output will give. */
  private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

  /**
   * Returns an instance of FurnaceRecipes.
   */
  public static ModAlloyFurnaceRecipes instance()
  {
      return SMELTING_BASE;
  }

  private ModAlloyFurnaceRecipes()
  {
      this.addSmeltingRecipeForBlock(Blocks.IRON_ORE, Blocks.AIR, new ItemStack(Items.IRON_INGOT), 0.7F);
      this.addSmeltingRecipeForBlock(Blocks.GOLD_ORE, Blocks.AIR, new ItemStack(Items.GOLD_INGOT), 1.0F);
      this.addSmeltingRecipeForBlock(Blocks.DIAMOND_ORE, Blocks.AIR, new ItemStack(Items.DIAMOND), 1.0F);
      this.addSmeltingRecipeForBlock(Blocks.SAND, Blocks.AIR, new ItemStack(Blocks.GLASS), 0.1F);
      this.addSmelting(Items.PORKCHOP, Items.AIR, new ItemStack(Items.COOKED_PORKCHOP), 0.35F);
      this.addSmelting(Items.BEEF, Items.AIR, new ItemStack(Items.COOKED_BEEF), 0.35F);
      this.addSmelting(Items.CHICKEN, Items.AIR, new ItemStack(Items.COOKED_CHICKEN), 0.35F);
      this.addSmelting(Items.RABBIT, Items.AIR, new ItemStack(Items.COOKED_RABBIT), 0.35F);
      this.addSmelting(Items.MUTTON, Items.AIR, new ItemStack(Items.COOKED_MUTTON), 0.35F);
      this.addSmeltingRecipeForBlock(Blocks.COBBLESTONE, Blocks.AIR, new ItemStack(Blocks.STONE), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STONEBRICK, 1, BlockStoneBrick.DEFAULT_META), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.STONEBRICK, 1, BlockStoneBrick.CRACKED_META), 0.1F);
      this.addSmelting(Items.CLAY_BALL, Items.AIR, new ItemStack(Items.BRICK), 0.3F);
      this.addSmeltingRecipeForBlock(Blocks.CLAY, Blocks.AIR, new ItemStack(Blocks.HARDENED_CLAY), 0.35F);
      this.addSmeltingRecipeForBlock(Blocks.CACTUS, Blocks.AIR, new ItemStack(Items.DYE, 1, EnumDyeColor.GREEN.getDyeDamage()), 0.2F);
      this.addSmeltingRecipeForBlock(Blocks.LOG, Blocks.AIR, new ItemStack(Items.COAL, 1, 1), 0.15F);
      this.addSmeltingRecipeForBlock(Blocks.LOG2, Blocks.AIR, new ItemStack(Items.COAL, 1, 1), 0.15F);
      this.addSmeltingRecipeForBlock(Blocks.EMERALD_ORE, Blocks.AIR, new ItemStack(Items.EMERALD), 1.0F);
      this.addSmelting(Items.POTATO, Items.AIR, new ItemStack(Items.BAKED_POTATO), 0.35F);
      this.addSmeltingRecipeForBlock(Blocks.NETHERRACK, Blocks.AIR, new ItemStack(Items.NETHERBRICK), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.SPONGE, 1, 1), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.SPONGE, 1, 0), 0.15F);
      this.addSmelting(Items.CHORUS_FRUIT, Items.AIR, new ItemStack(Items.CHORUS_FRUIT_POPPED), 0.1F);

      for (ItemFishFood.FishType itemfishfood$fishtype : ItemFishFood.FishType.values())
      {
          if (itemfishfood$fishtype.canCook())
          {
              this.addSmeltingRecipe(new ItemStack(Items.FISH, 1, itemfishfood$fishtype.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Items.COOKED_FISH, 1, itemfishfood$fishtype.getMetadata()), 0.35F);
          }
      }

      this.addSmeltingRecipeForBlock(Blocks.COAL_ORE, Blocks.AIR, new ItemStack(Items.COAL), 0.1F);
      this.addSmeltingRecipeForBlock(Blocks.REDSTONE_ORE, Blocks.AIR, new ItemStack(Items.REDSTONE), 0.7F);
      this.addSmeltingRecipeForBlock(Blocks.LAPIS_ORE, Blocks.AIR, new ItemStack(Items.DYE, 1, EnumDyeColor.BLUE.getDyeDamage()), 0.2F);
      this.addSmeltingRecipeForBlock(Blocks.QUARTZ_ORE, Blocks.AIR, new ItemStack(Items.QUARTZ), 0.2F);
      this.addSmelting(Items.CHAINMAIL_HELMET, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.CHAINMAIL_CHESTPLATE, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.CHAINMAIL_LEGGINGS, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.CHAINMAIL_BOOTS, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.IRON_PICKAXE, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.IRON_SHOVEL, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.IRON_AXE, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.IRON_HOE, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.IRON_SWORD, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.IRON_HELMET, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.IRON_CHESTPLATE, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.IRON_LEGGINGS, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.IRON_BOOTS, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.IRON_HORSE_ARMOR, Items.AIR, new ItemStack(Items.IRON_NUGGET), 0.1F);
      this.addSmelting(Items.GOLDEN_PICKAXE, Items.AIR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
      this.addSmelting(Items.GOLDEN_SHOVEL, Items.AIR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
      this.addSmelting(Items.GOLDEN_AXE, Items.AIR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
      this.addSmelting(Items.GOLDEN_HOE, Items.AIR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
      this.addSmelting(Items.GOLDEN_SWORD, Items.AIR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
      this.addSmelting(Items.GOLDEN_HELMET, Items.AIR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
      this.addSmelting(Items.GOLDEN_CHESTPLATE, Items.AIR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
      this.addSmelting(Items.GOLDEN_LEGGINGS, Items.AIR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
      this.addSmelting(Items.GOLDEN_BOOTS, Items.AIR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
      this.addSmelting(Items.GOLDEN_HORSE_ARMOR, Items.AIR, new ItemStack(Items.GOLD_NUGGET), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.WHITE.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.WHITE_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.ORANGE.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.ORANGE_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.MAGENTA.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.MAGENTA_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.LIGHT_BLUE.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.YELLOW.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.YELLOW_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.LIME.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.PINK.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.PINK_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.GRAY.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.GRAY_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.SILVER.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.SILVER_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.CYAN.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.CYAN_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.PURPLE.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.PURPLE_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BLUE.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.BLUE_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BROWN.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.BROWN_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.GREEN.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.GREEN_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.RED.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.RED_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BLACK.getMetadata()), new ItemStack(Blocks.AIR, 1), new ItemStack(Blocks.BLACK_GLAZED_TERRACOTTA), 0.1F);
  }

  /**
   * Adds a smelting recipe, where the input item is an instance of Block.
   */
  public void addSmeltingRecipeForBlock(Block input1, Block input2, ItemStack stack, float experience)
  {
      this.addSmelting(Item.getItemFromBlock(input1), Item.getItemFromBlock(input2), stack, experience);
  }

  /**
   * Adds a smelting recipe using an Item as the input item.
   */
  public void addSmelting(Item input1, Item input2, ItemStack stack, float experience)
  {
      this.addSmeltingRecipe(new ItemStack(input1, 1, 32767), new ItemStack(input2, 1, 32767), stack, experience);
  }

  /**
   * Adds a smelting recipe using an ItemStack as the input for the recipe.
   */
  public void addSmeltingRecipe(ItemStack input1, ItemStack input2, ItemStack stack, float experience)
  {
      if (getSmeltingResult(input1, input2) != ItemStack.EMPTY) { net.minecraftforge.fml.common.FMLLog.log.info("Ignored smelting recipe with conflicting input: {} and {} = {}", input1, input2, stack); return; }
      this.smeltingList.put(new ItemStack[]{input1, input2}, stack);
      this.experienceList.put(stack, Float.valueOf(experience));
  }

  /**
   * Returns the smelting result of an item.
   */
  public ItemStack getSmeltingResult(ItemStack stack1, ItemStack stack2)
  {
      for (Entry<ItemStack[], ItemStack> entry : this.smeltingList.entrySet())
      {
          if (this.compareItemStacks(stack1, stack2, entry.getKey()))
          {
              return entry.getValue();
          }
      }

      return ItemStack.EMPTY;
  }

  /**
   * Compares two itemstacks to ensure that they are the same. This checks both the item and the metadata of the item.
   */
  private boolean compareItemStacks(ItemStack input1, ItemStack input2, ItemStack[] result1)
  {
    if (input1.getItem() != result1[0].getItem() && input1.getItem() != result1[1].getItem())
      return false;
    if (input2.getItem() != result1[0].getItem() && input2.getItem() != result1[1].getItem())
      return false;
    if (result1[0].getMetadata() != 32767 || result1[1].getMetadata() != 32767) {
      if (input1.getMetadata() != result1[0].getMetadata() && input1.getMetadata() != result1[1].getMetadata())
        return false;
      if (input2.getMetadata() != result1[0].getMetadata() && input2.getMetadata() != result1[1].getMetadata())
        return false;
    }
    
    return true;
  }
  private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
  {
      return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
  }

  public Map<ItemStack[], ItemStack> getSmeltingList()
  {
      return this.smeltingList;
  }

  public float getSmeltingExperience(ItemStack stack)
  {
      float ret = stack.getItem().getSmeltingExperience(stack);
      if (ret != -1) return ret;

      for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
      {
          if (this.compareItemStacks(stack, entry.getKey()))
          {
              return ((Float)entry.getValue()).floatValue();
          }
      }

      return 0.0F;
  }
}
