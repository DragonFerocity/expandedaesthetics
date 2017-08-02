package com.DragonFerocity.expanded;

import java.util.Map;
import java.util.Map.Entry;

import com.DragonFerocity.expanded.handlers.BlockHandler;
import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;

public class ModCampfireRecipes {
  private static final ModCampfireRecipes SMELTING_BASE = new ModCampfireRecipes();
  /** The list of smelting results. */
  private final Map<ItemStack, ItemStack> smeltingList = Maps.<ItemStack, ItemStack>newHashMap();
  /** A list which contains how many experience points each recipe output will give. */
  private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

  /**
   * Returns an instance of FurnaceRecipes.
   */
  public static ModCampfireRecipes instance()
  {
      return SMELTING_BASE;
  }

  private ModCampfireRecipes()
  {
      //this.addSmeltingRecipe(ItemStack.EMPTY, ItemStack.EMPTY, 0); //Allows just fuel to burn to give off light (Think about it)
      this.addSmelting(Items.PORKCHOP, new ItemStack(Items.COOKED_PORKCHOP), 0.35F);
      this.addSmelting(Items.BEEF, new ItemStack(Items.COOKED_BEEF), 0.35F);
      this.addSmelting(Items.CHICKEN, new ItemStack(Items.COOKED_CHICKEN), 0.35F);
      this.addSmelting(Items.RABBIT, new ItemStack(Items.COOKED_RABBIT), 0.35F);
      this.addSmelting(Items.MUTTON, new ItemStack(Items.COOKED_MUTTON), 0.35F);
      this.addSmelting(Items.CLAY_BALL, new ItemStack(Items.BRICK), 0.3F);
      this.addSmeltingRecipeForBlock(Blocks.CLAY, new ItemStack(Blocks.HARDENED_CLAY), 0.35F);
      this.addSmeltingRecipeForBlock(Blocks.CACTUS, new ItemStack(Items.DYE, 1, EnumDyeColor.GREEN.getDyeDamage()), 0.2F);
      this.addSmeltingRecipeForBlock(Blocks.LOG, new ItemStack(Items.COAL, 1, 1), 0.15F);
      this.addSmeltingRecipeForBlock(Blocks.LOG2, new ItemStack(Items.COAL, 1, 1), 0.15F);
      this.addSmelting(Items.POTATO, new ItemStack(Items.BAKED_POTATO), 0.35F);
      this.addSmeltingRecipe(new ItemStack(Blocks.SPONGE, 1, 1), new ItemStack(Blocks.SPONGE, 1, 0), 0.15F);
      this.addSmelting(Items.CHORUS_FRUIT, new ItemStack(Items.CHORUS_FRUIT_POPPED), 0.1F);

      for (ItemFishFood.FishType itemfishfood$fishtype : ItemFishFood.FishType.values())
      {
          if (itemfishfood$fishtype.canCook())
          {
              this.addSmeltingRecipe(new ItemStack(Items.FISH, 1, itemfishfood$fishtype.getMetadata()), new ItemStack(Items.COOKED_FISH, 1, itemfishfood$fishtype.getMetadata()), 0.35F);
          }
      }

      this.addSmelting(BlockHandler.iCopperNuggets, new ItemStack(BlockHandler.iCopperIngot), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.WHITE.getMetadata()), new ItemStack(Blocks.WHITE_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.ORANGE.getMetadata()), new ItemStack(Blocks.ORANGE_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.MAGENTA.getMetadata()), new ItemStack(Blocks.MAGENTA_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.LIGHT_BLUE.getMetadata()), new ItemStack(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.YELLOW.getMetadata()), new ItemStack(Blocks.YELLOW_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.LIME.getMetadata()), new ItemStack(Blocks.LIME_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.PINK.getMetadata()), new ItemStack(Blocks.PINK_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.GRAY.getMetadata()), new ItemStack(Blocks.GRAY_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.SILVER.getMetadata()), new ItemStack(Blocks.SILVER_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.CYAN.getMetadata()), new ItemStack(Blocks.CYAN_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.PURPLE.getMetadata()), new ItemStack(Blocks.PURPLE_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BLUE.getMetadata()), new ItemStack(Blocks.BLUE_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BROWN.getMetadata()), new ItemStack(Blocks.BROWN_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.GREEN.getMetadata()), new ItemStack(Blocks.GREEN_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.RED.getMetadata()), new ItemStack(Blocks.RED_GLAZED_TERRACOTTA), 0.1F);
      this.addSmeltingRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, EnumDyeColor.BLACK.getMetadata()), new ItemStack(Blocks.BLACK_GLAZED_TERRACOTTA), 0.1F);
  }

  /**
   * Adds a smelting recipe, where the input item is an instance of Block.
   */
  public void addSmeltingRecipeForBlock(Block input, ItemStack stack, float experience)
  {
      this.addSmelting(Item.getItemFromBlock(input), stack, experience);
  }

  /**
   * Adds a smelting recipe using an Item as the input item.
   */
  public void addSmelting(Item input, ItemStack stack, float experience)
  {
      this.addSmeltingRecipe(new ItemStack(input, 1, 32767), stack, experience);
  }

  /**
   * Adds a smelting recipe using an ItemStack as the input for the recipe.
   */
  public void addSmeltingRecipe(ItemStack input, ItemStack stack, float experience)
  {
      if (getSmeltingResult(input) != ItemStack.EMPTY) { net.minecraftforge.fml.common.FMLLog.log.info("Ignored smelting recipe with conflicting input: {} = {}", input, stack); return; }
      this.smeltingList.put(input, stack);
      this.experienceList.put(stack, Float.valueOf(experience));
  }

  /**
   * Returns the smelting result of an item.
   */
  public ItemStack getSmeltingResult(ItemStack stack)
  {
      for (Entry<ItemStack, ItemStack> entry : this.smeltingList.entrySet())
      {
          if (this.compareItemStacks(stack, entry.getKey()))
          {
              return entry.getValue();
          }
      }

      return ItemStack.EMPTY;
  }

  /**
   * Compares two itemstacks to ensure that they are the same. This checks both the item and the metadata of the item.
   */
  private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
  {
      return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
  }

  public Map<ItemStack, ItemStack> getSmeltingList()
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