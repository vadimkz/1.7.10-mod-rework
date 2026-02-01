package com.mark719.magicalcrops.seedbags;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Слот, в который нельзя ничего положить и из которого нельзя ничего забрать.
 * Используется для визуального отделения или блокировки интерфейса сумок.
 */
public class DisabledSlot extends Slot {

    public DisabledSlot(IInventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean isItemValid(ItemStack itemStack) {
        // Нельзя положить предмет в этот слот
        return false;
    }

    @Override
    public boolean canTakeStack(EntityPlayer player) {
        // Нельзя забрать предмет из этого слота
        return false;
    }
}