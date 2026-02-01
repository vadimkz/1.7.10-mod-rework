package com.mark719.magicalcrops.seedbags;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IPlantable;

public class SeedContainer extends Container {
    private SeedInventory inv;

    public SeedContainer(InventoryPlayer playerInv, SeedInventory inventory) {
        this.inv = inventory;
        int numSlots = inventory.getSizeInventory();
        int rows = numSlots / 9;

        // Слоты сумки
        for (int j = 0; j < rows; ++j) {
            for (int k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(inventory, k + j * 9, 8 + k * 18, 18 + j * 18));
            }
        }

        // Инвентарь игрока
        int yOffset = 18 + rows * 18 + 13;
        for (int j = 0; j < 3; ++j) {
            for (int k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(playerInv, k + j * 9 + 9, 8 + k * 18, yOffset + j * 18));
            }
        }

        // Хотбар
        for (int j = 0; j < 9; ++j) {
            if (playerInv.getStackInSlot(j) == inventory.getStackInSlot(-1)) { // Пример защиты текущего предмета
                // Можно использовать DisabledSlot для текущей сумки, чтобы игрок её не выложил в саму себя
            }
            this.addSlotToContainer(new Slot(playerInv, j, 8 + j * 18, yOffset + 58));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotIndex < this.inv.getSizeInventory()) {
                if (!this.mergeItemStack(itemstack1, this.inv.getSizeInventory(), this.inventorySlots.size(), true)) {
                    return null;
                }
            } else if (itemstack1.getItem() instanceof IPlantable) {
                if (!this.mergeItemStack(itemstack1, 0, this.inv.getSizeInventory(), false)) {
                    return null;
                }
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            }
        }
        return itemstack;
    }
}