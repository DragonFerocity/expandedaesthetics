package com.DragonFerocity.expanded.items;

import javax.swing.text.html.parser.Entity;

import com.DragonFerocity.expanded.Ref;
import com.DragonFerocity.expanded.handlers.BlockHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModArmor extends ItemArmor
{
    String textureName;
    public ModArmor(String name, ModArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(Ref.MODID + ":" + name + "_" + equipmentSlotIn.getName());
        setRegistryName(Ref.MODID + ":" + name + "_" + equipmentSlotIn.getName());
        textureName = name;
    }

    /**
     * Gets the equipment slot of this armor piece (formerly known as armor type)
     */
    @SideOnly(Side.CLIENT)
    public EntityEquipmentSlot getEquipmentSlot()
    {
        return this.armorType;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        return Ref.MODID + ":textures/armor/" + this.textureName + "_layer_" + (this.renderIndex == 2 ? "2" : "1") + ".png";
    }
    
    /**
     * Remove the color from the specified armor ItemStack.
     */
    @Override
    public void removeColor(ItemStack stack)
    {
        if (this == BlockHandler.iColdIronChest)
        {
            NBTTagCompound nbttagcompound = stack.getTagCompound();

            if (nbttagcompound != null)
            {
                NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");

                if (nbttagcompound1.hasKey("color"))
                {
                    nbttagcompound1.removeTag("color");
                }
            }
        }
    }

    /**
     * Sets the color of the specified armor ItemStack
     */
    @Override
    public void setColor(ItemStack stack, int color)
    {
        if (this == BlockHandler.iColdIronChest)
        {
            NBTTagCompound nbttagcompound = stack.getTagCompound();

            if (nbttagcompound == null)
            {
                nbttagcompound = new NBTTagCompound();
                stack.setTagCompound(nbttagcompound);
            }

            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");

            if (!nbttagcompound.hasKey("display", 10))
            {
                nbttagcompound.setTag("display", nbttagcompound1);
            }

            nbttagcompound1.setInteger("color", color);
        }
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
      if (player.dimension == -1) {
        /*if (player.inventory.armorItemInSlot(2).getItem() == BlockHandler.iColdIronChest) {
          this.setColor(new ItemStack(this), 0x1d7ef6);
        }*/
        
        checkColdIronBonus(player);
      }
      if (player.dimension == 0) {
        /*if (player.inventory.armorItemInSlot(2).getItem() == BlockHandler.iColdIronChestBlue) {
          this.removeColor(new ItemStack(this));
        }*/
      }
    }
    
    private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
      if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1) {
        player.addPotionEffect(new PotionEffect(potion, 200));
      }
    }
    
    private void checkColdIronBonus(EntityPlayer player) {
      Potion potion = Potion.REGISTRY.getObject(new ResourceLocation("fire_resistance"));
      
      if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1) {
        ItemStack armorHead = player.inventory.armorItemInSlot(3);
        ItemStack armorChest = player.inventory.armorItemInSlot(2);
        ItemStack armorLegs = player.inventory.armorItemInSlot(1);
        ItemStack armorFeet = player.inventory.armorItemInSlot(0);
        
        if (armorHead != null && armorHead.getItem() == BlockHandler.iColdIronHelmet &&
            armorChest != null && armorChest.getItem() == BlockHandler.iColdIronChest &&
            armorLegs != null && armorLegs.getItem() == BlockHandler.iColdIronLegs &&
            armorFeet != null && armorFeet.getItem() == BlockHandler.iColdIronBoots) {
          effectPlayer(player, potion, 0);
        }
      }
    }

    
}