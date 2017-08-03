package com.DragonFerocity.expanded.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.handlers.BlockHandler;

public class ModOre extends Block
{
  public ModOre(String name, float hardness, float resistance, int harvestLevel)
  {
      this(name, hardness, resistance, harvestLevel, Material.ROCK);
  }
  
  public ModOre(String name, float hardness, float resistance, int harvestLevel, Material materialIn)
  {
      this(materialIn);
      setHardness(hardness);
      setResistance(resistance);
      setHarvestLevel("pickaxe", harvestLevel);
      setUnlocalizedName(Ref.MODID + ":" + name);
      setRegistryName(Ref.MODID + ":" + name);
  }

    public ModOre(Material materialIn)
    {
        super(materialIn, materialIn.getMaterialMapColor());
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
    
    private String[] harvestTool = new String[16];
    private int[] harvestLevel = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    /**
     * Sets or removes the tool and level required to harvest this block.
     *
     * @param toolClass Class
     * @param level Harvest level:
     *     Wood:    0
     *     Stone:   1
     *     Iron:    2
     *     Diamond: 3
     *     Gold:    0
     */
    @Override
    public void setHarvestLevel(String toolClass, int level)
    {
        java.util.Iterator<IBlockState> itr = getBlockState().getValidStates().iterator();
        while (itr.hasNext())
        {
            setHarvestLevel(toolClass, level, itr.next());
        }
    }
    
    /**
     * Sets or removes the tool and level required to harvest this block.
     *
     * @param toolClass Class
     * @param level Harvest level:
     *     Wood:    0
     *     Stone:   1
     *     Iron:    2
     *     Diamond: 3
     *     Gold:    0
     * @param state The specific state.
     */
    @Override
    public void setHarvestLevel(String toolClass, int level, IBlockState state)
    {
        int idx = this.getMetaFromState(state);
        this.harvestTool[idx] = toolClass;
        this.harvestLevel[idx] = level;
    }
    @Override
    public String getHarvestTool(IBlockState state)
    {
      if (this == BlockHandler.copperOre)
        return null;
      else
        return this.harvestTool[getMetaFromState(state)];
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
      if (this == BlockHandler.copperOre)
        return BlockHandler.iCopperNuggets;
      else if (this == BlockHandler.tinOre)
        return BlockHandler.ibTinOre;
    	else if (this == BlockHandler.platinumOre)
        	return BlockHandler.ibPlatinumOre;
    	else if (this == BlockHandler.silverOre)
        	return BlockHandler.ibSilverOre;
    	else if (this == BlockHandler.mithrilOre)
        	return BlockHandler.ibMithrilOre;
    	else if (this == BlockHandler.titaniumOre)
        	return BlockHandler.ibTitaniumOre;
      else
      	return Item.getItemFromBlock(this);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random random)
    {
      if (this == BlockHandler.copperOre)
        return 2;
      else
        return 1;
    }

    /**
     * Get the quantity dropped based on the given fortune level
     */
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
      if (fortune > 0) {
        int i = random.nextInt(fortune + 2) - 1;
        
        if (i < 0)
          i = 0;
        
        return this.quantityDropped(random) * (i + 1);
      }
      else
      {
          return this.quantityDropped(random);
      }
    }

    /**
     * Spawns this Block's drops into the World as EntityItems.
     */
    /*public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);

        if (this.getItemDropped(state, worldIn.rand, fortune) != Item.getItemFromBlock(this))
        {
            int i = 0;

            if (this == BlockHandler.copperOre)
            {
                i = MathHelper.getInt(worldIn.rand, 0, 2);
            }

            this.dropXpOnBlockBreak(worldIn, pos, i);
        }
    }*/

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this);
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
        return 0;
    }
}
