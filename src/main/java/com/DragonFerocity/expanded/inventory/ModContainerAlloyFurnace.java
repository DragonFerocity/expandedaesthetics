package com.DragonFerocity.expanded.inventory;

import com.DragonFerocity.expanded.ModAlloyFurnaceRecipes;
import com.DragonFerocity.expanded.entities.ModTileEntityAlloyFurnace;

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

public class ModContainerAlloyFurnace extends Container {
  private final IInventory tileAlloyFurnace;
  private int cookTime;
  private int totalCookTime;
  private int furnaceBurnTime;
  private int currentItemBurnTime;

  public ModContainerAlloyFurnace(InventoryPlayer playerInventory, IInventory alloyFurnaceInventory)
  {
    this.tileAlloyFurnace = alloyFurnaceInventory;
    this.addSlotToContainer(new Slot(alloyFurnaceInventory, 0, 38, 17));
    this.addSlotToContainer(new SlotFurnaceFuel(alloyFurnaceInventory, 1, 56, 53));
    this.addSlotToContainer(new ModSlotFurnaceOutput(playerInventory.player, alloyFurnaceInventory, 2, 116, 35));
    this.addSlotToContainer(new Slot(alloyFurnaceInventory, 3, 74, 17));

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
    listener.sendAllWindowProperties(this, this.tileAlloyFurnace);
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

        if (this.cookTime != this.tileAlloyFurnace.getField(2))
        {
            icontainerlistener.sendWindowProperty(this, 2, this.tileAlloyFurnace.getField(2));
        }

        if (this.furnaceBurnTime != this.tileAlloyFurnace.getField(0))
        {
            icontainerlistener.sendWindowProperty(this, 0, this.tileAlloyFurnace.getField(0));
        }

        if (this.currentItemBurnTime != this.tileAlloyFurnace.getField(1))
        {
            icontainerlistener.sendWindowProperty(this, 1, this.tileAlloyFurnace.getField(1));
        }

        if (this.totalCookTime != this.tileAlloyFurnace.getField(3))
        {
            icontainerlistener.sendWindowProperty(this, 3, this.tileAlloyFurnace.getField(3));
        }
    }

    this.cookTime = this.tileAlloyFurnace.getField(2);
    this.furnaceBurnTime = this.tileAlloyFurnace.getField(0);
    this.currentItemBurnTime = this.tileAlloyFurnace.getField(1);
    this.totalCookTime = this.tileAlloyFurnace.getField(3);
}

@SideOnly(Side.CLIENT)
public void updateProgressBar(int id, int data)
{
    this.tileAlloyFurnace.setField(id, data);
}

/**
 * Determines whether supplied player can use this container
 */
public boolean canInteractWith(EntityPlayer playerIn)
{
    return this.tileAlloyFurnace.isUsableByPlayer(playerIn);
}

/**
 * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player
 * inventory and the other inventory(s).
 */
public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
{
    ItemStack itemstack = ItemStack.EMPTY;
    Slot slot = this.inventorySlots.get(index);
    
    Slot inputSlot = this.inventorySlots.get(0);
    if (inputSlot.getStack().isEmpty())
      inputSlot = this.inventorySlots.get(3);

    if (slot != null && slot.getHasStack())
    {
        ItemStack itemstack1 = slot.getStack();
        itemstack = itemstack1.copy();

        if (index == 2)
        {
            if (!this.mergeItemStack(itemstack1, 4, 40, true))
            {
                return ItemStack.EMPTY;
            }

            slot.onSlotChange(itemstack1, itemstack);
        }
        else if (index != 1 && index != 0 && index != 3)
        {
            if (ModTileEntityAlloyFurnace.isItemFuel(itemstack1))
            {
                if (!this.mergeItemStack(itemstack1, 1, 2, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!ModAlloyFurnaceRecipes.instance().getSmeltingResult(itemstack1, inputSlot.getStack()).isEmpty())
            {
                if (!this.mergeItemStack(itemstack1, 0, 1, false) && !this.mergeItemStack(itemstack1, 3, 4, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (index >= 4 && index < 31)
            {
                if (!this.mergeItemStack(itemstack1, 31, 40, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (index >= 31 && index < 40 && !this.mergeItemStack(itemstack1, 4, 31, false))
            {
                return ItemStack.EMPTY;
            }
        }
        else if (!this.mergeItemStack(itemstack1, 4, 31, false))
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
