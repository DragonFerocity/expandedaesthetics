package com.DragonFerocity.expanded.inventory;

import com.DragonFerocity.expanded.ModCampfireRecipes;
import com.DragonFerocity.expanded.entities.ModTileEntityCampfire;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModContainerCampfire extends Container {
  private final IInventory tileCampfire;
  private int cookTime;
  private int totalCookTime;
  private int campfireBurnTime;
  private int currentItemBurnTime;

  public ModContainerCampfire(InventoryPlayer playerInventory, IInventory campfireInventory)
  {
    this.tileCampfire = campfireInventory;
    this.addSlotToContainer(new Slot(campfireInventory, 0, 56, 17));
    this.addSlotToContainer(new SlotFurnaceFuel(campfireInventory, 1, 56, 53));
    this.addSlotToContainer(new ModSlotCampfireOutput(playerInventory.player, campfireInventory, 2, 116, 35));

    for (int i = 0; i < 3; ++i)
    {
        for (int j = 0; j < 9; ++j)
        {
            this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
        }
    }

    for (int k = 0; k < 9; ++k)
    {
        this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
    }
}

public void addListener(IContainerListener listener)
{
    super.addListener(listener);
    listener.sendAllWindowProperties(this, this.tileCampfire);
}

/**
 * Looks for changes made in the container, sends them to every listener.
 */
public void detectAndSendChanges()
{
    super.detectAndSendChanges();

    for (int i = 0; i < this.listeners.size(); ++i)
    {
        IContainerListener icontainerlistener = this.listeners.get(i);

        if (this.cookTime != this.tileCampfire.getField(2))
        {
            icontainerlistener.sendWindowProperty(this, 2, this.tileCampfire.getField(2));
        }

        if (this.campfireBurnTime != this.tileCampfire.getField(0))
        {
            icontainerlistener.sendWindowProperty(this, 0, this.tileCampfire.getField(0));
        }

        if (this.currentItemBurnTime != this.tileCampfire.getField(1))
        {
            icontainerlistener.sendWindowProperty(this, 1, this.tileCampfire.getField(1));
        }

        if (this.totalCookTime != this.tileCampfire.getField(3))
        {
            icontainerlistener.sendWindowProperty(this, 3, this.tileCampfire.getField(3));
        }
    }

    this.cookTime = this.tileCampfire.getField(2);
    this.campfireBurnTime = this.tileCampfire.getField(0);
    this.currentItemBurnTime = this.tileCampfire.getField(1);
    this.totalCookTime = this.tileCampfire.getField(3);
}

@SideOnly(Side.CLIENT)
public void updateProgressBar(int id, int data)
{
    this.tileCampfire.setField(id, data);
}

/**
 * Determines whether supplied player can use this container
 */
public boolean canInteractWith(EntityPlayer playerIn)
{
    return this.tileCampfire.isUsableByPlayer(playerIn);
}

/**
 * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player
 * inventory and the other inventory(s).
 */
public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
{
    ItemStack itemstack = ItemStack.EMPTY;
    Slot slot = this.inventorySlots.get(index);

    if (slot != null && slot.getHasStack())
    {
        ItemStack itemstack1 = slot.getStack();
        itemstack = itemstack1.copy();

        if (index == 2)
        {
            if (!this.mergeItemStack(itemstack1, 3, 39, true))
            {
                return ItemStack.EMPTY;
            }

            slot.onSlotChange(itemstack1, itemstack);
        }
        else if (index != 1 && index != 0)
        {
            if (!ModCampfireRecipes.instance().getSmeltingResult(itemstack1).isEmpty())
            {
                if (!this.mergeItemStack(itemstack1, 0, 1, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (ModTileEntityCampfire.isItemFuel(itemstack1))
            {
                if (!this.mergeItemStack(itemstack1, 1, 2, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (index >= 3 && index < 30)
            {
                if (!this.mergeItemStack(itemstack1, 30, 39, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (index >= 30 && index < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
            {
                return ItemStack.EMPTY;
            }
        }
        else if (!this.mergeItemStack(itemstack1, 3, 39, false))
        {
            return ItemStack.EMPTY;
        }

        if (itemstack1.isEmpty())
        {
            slot.putStack(ItemStack.EMPTY);
        }
        else
        {
            slot.onSlotChanged();
        }

        if (itemstack1.getCount() == itemstack.getCount())
        {
            return ItemStack.EMPTY;
        }

        slot.onTake(playerIn, itemstack1);
    }

    return itemstack;
  }
}
