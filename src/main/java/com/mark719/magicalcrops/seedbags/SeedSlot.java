package com.mark719.magicalcrops.seedbags;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IPlantable;

/**
 * Слот, который принимает только семена (предметы, реализующие IPlantable).
 */
public class SeedSlot extends Slot {

    public SeedSlot(IInventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        // Разрешаем класть предмет, только если это семена
        return stack != null && stack.getItem() instanceof IPlantable;
    }
}