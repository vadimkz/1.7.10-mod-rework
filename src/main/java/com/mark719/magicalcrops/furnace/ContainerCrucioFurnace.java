package com.mark719.magicalcrops.furnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerCrucioFurnace extends Container {
    private TileEntityCrucioFurnace tileCrucioFurnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

    public ContainerCrucioFurnace(InventoryPlayer playerInv, TileEntityCrucioFurnace tileEntity) {
        this.tileCrucioFurnace = tileEntity;

        // Слот для переплавки (вход)
        this.addSlotToContainer(new Slot(tileEntity, 0, 56, 17));
        // Слот для топлива
        this.addSlotToContainer(new Slot(tileEntity, 1, 56, 53));
        // Слот для результата
        this.addSlotToContainer(new SlotFurnace(playerInv.player, tileEntity, 2, 116, 35));

        // Инвентарь игрока
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInv, j + i * 9 + 9, 8, 84 + i * 18));
            }
        }

        // Хотбар игрока
        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(playerInv, i, 8, 142));
        }
    }

    @Override
    public void onCraftGuiOpened(ICrafting crafting) {
        super.onCraftGuiOpened(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.tileCrucioFurnace.furnaceCookTime);
        crafting.sendProgressBarUpdate(this, 1, this.tileCrucioFurnace.furnaceBurnTime);
        crafting.sendProgressBarUpdate(this, 2, this.tileCrucioFurnace.currentBurnTime);
    }

    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i) {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.tileCrucioFurnace.furnaceCookTime) {
                icrafting.sendProgressBarUpdate(this, 0, this.tileCrucioFurnace.furnaceCookTime);
            }

            if (this.lastBurnTime != this.tileCrucioFurnace.furnaceBurnTime) {
                icrafting.sendProgressBarUpdate(this, 1, this.tileCrucioFurnace.furnaceBurnTime);
            }

            if (this.lastItemBurnTime != this.tileCrucioFurnace.currentBurnTime) {
                icrafting.sendProgressBarUpdate(this, 2, this.tileCrucioFurnace.currentBurnTime);
            }
        }

        this.lastCookTime = this.tileCrucioFurnace.furnaceCookTime;
        this.lastBurnTime = this.tileCrucioFurnace.furnaceBurnTime;
        this.lastItemBurnTime = this.tileCrucioFurnace.currentBurnTime;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int value) {
        if (id == 0) this.tileCrucioFurnace.furnaceCookTime = value;
        if (id == 1) this.tileCrucioFurnace.furnaceBurnTime = value;
        if (id == 2) this.tileCrucioFurnace.currentBurnTime = value;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return this.tileCrucioFurnace.isUseableByPlayer(player);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            // Если кликаем по слотам печи (0-2)
            if (slotIndex == 2) {
                if (!this.mergeItemStack(itemstack1, 3, 39, true)) {
                    return null;
                }
                slot.onSlotChange(itemstack1, itemstack);
            } else if (slotIndex != 1 && slotIndex != 0) {
                if (FurnaceRecipes.instance().getSmeltingResult(itemstack1) != null) {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false)) {
                        return null;
                    }
                } else if (TileEntityCrucioFurnace.isItemFuel(itemstack1)) {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false)) {
                        return null;
                    }
                } else if (slotIndex >= 3 && slotIndex < 30) {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false)) {
                        return null;
                    }
                } else if (slotIndex >= 30 && slotIndex < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)) {
                    return null;
                }
            } else if (!this.mergeItemStack(itemstack1, 3, 39, false)) {
                return null;
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack((ItemStack)null);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize) {
                return null;
            }

            slot.onPickupFromSlot(player, itemstack1);
        }

        return itemstack;
    }
}