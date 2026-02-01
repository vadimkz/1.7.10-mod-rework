package com.mark719.magicalcrops.seedbags;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class SeedInventory implements IInventory {
    private ItemStack[] inventoryItems;
    private ItemStack currentItem;
    private int size;
    private String customName;

    public SeedInventory(ItemStack current) {
        this.currentItem = current;
        if (this.currentItem != null && this.currentItem.getItem() instanceof Planter) {
            int itemNumSlots = ((Planter)this.currentItem.getItem()).getInvSlots();
            this.size = itemNumSlots;
            this.inventoryItems = new ItemStack[this.size];
            if (this.currentItem.hasTagCompound()) {
                readFromNBT(this.currentItem.getTagCompound());
            }
        }
    }

    @Override
    public int getSizeInventory() {
        return this.size;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return (slot >= 0 && slot < this.size) ? this.inventoryItems[slot] : null;
    }

    @Override
    public ItemStack decrStackSize(int slot, int amount) {
        if (this.inventoryItems[slot] != null) {
            ItemStack itemstack;
            if (this.inventoryItems[slot].stackSize <= amount) {
                itemstack = this.inventoryItems[slot];
                this.inventoryItems[slot] = null;
                markDirty();
                return itemstack;
            }
            itemstack = this.inventoryItems[slot].splitStack(amount);
            if (this.inventoryItems[slot].stackSize == 0) {
                this.inventoryItems[slot] = null;
            }
            markDirty();
            return itemstack;
        }
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        if (this.inventoryItems[slot] != null) {
            ItemStack itemstack = this.inventoryItems[slot];
            this.inventoryItems[slot] = null;
            return itemstack;
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        this.inventoryItems[slot] = stack;
        if (stack != null && stack.stackSize > getInventoryStackLimit()) {
            stack.stackSize = getInventoryStackLimit();
        }
        markDirty();
    }

    @Override
    public String getInventoryName() {
        return this.isCustomInventoryName() ? this.customName : "container.seedbag";
    }

    // ВАЖНО: Используем имя из вашего интерфейса
    @Override
    public boolean isCustomInventoryName() {
        return this.customName != null && this.customName.length() > 0;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public void markDirty() {
        if (this.currentItem != null) {
            NBTTagCompound nbt = this.currentItem.getTagCompound();
            if (nbt == null) {
                nbt = new NBTTagCompound();
                this.currentItem.setTagCompound(nbt);
            }
            saveToNBT(nbt);
        }
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return player.getCurrentEquippedItem() == this.currentItem;
    }

    // Имена методов ниже также взяты из вашего интерфейса
    @Override
    public void openChest() {}

    @Override
    public void closeChest() {}

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        return stack != null && stack.getItem() instanceof net.minecraftforge.common.IPlantable;
    }

    public void readFromNBT(NBTTagCompound nbt) {
        if (nbt.hasKey("Items", 9)) {
            NBTTagList list = nbt.getTagList("Items", 10);
            for (int i = 0; i < list.tagCount(); ++i) {
                NBTTagCompound tag = list.getCompoundTagAt(i);
                int slot = tag.getByte("Slot") & 255;
                if (slot >= 0 && slot < this.inventoryItems.length) {
                    this.inventoryItems[slot] = ItemStack.loadItemStackFromNBT(tag);
                }
            }
        }
    }

    public void saveToNBT(NBTTagCompound nbt) {
        NBTTagList list = new NBTTagList();
        for (int i = 0; i < this.inventoryItems.length; ++i) {
            if (this.inventoryItems[i] != null) {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setByte("Slot", (byte)i);
                this.inventoryItems[i].writeToNBT(tag);
                list.appendTag(tag);
            }
        }
        nbt.setTag("Items", list);
    }
}