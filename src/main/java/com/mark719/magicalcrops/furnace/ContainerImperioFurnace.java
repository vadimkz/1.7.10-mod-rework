package com.mark719.magicalcrops.furnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerImperioFurnace extends Container {
    private TileEntityImperioFurnace tileImperioFurnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

    public ContainerImperioFurnace(InventoryPlayer player, TileEntityImperioFurnace tileEntityImperioFurnace) {
        this.tileImperioFurnace = tileEntityImperioFurnace;
        this.addSlotToContainer(new Slot(tileEntityImperioFurnace, 0, 56, 17));
        this.addSlotToContainer(new Slot(tileEntityImperioFurnace, 1, 56, 53));
        this.addSlotToContainer(new SlotFurnace(player.player, tileEntityImperioFurnace, 2, 116, 35));

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(player, i, 8, 142));
        }
    }

    @Override
    public void onCraftGuiOpened(ICrafting crafting) {
        super.onCraftGuiOpened(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.tileImperioFurnace.furnaceCookTime);
        crafting.sendProgressBarUpdate(this, 1, this.tileImperioFurnace.furnaceBurnTime);
        crafting.sendProgressBarUpdate(this, 2, this.tileImperioFurnace.currentBurnTime);
    }

    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        for (int i = 0; i < this.crafters.size(); ++i) {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);
            if (this.lastCookTime != this.tileImperioFurnace.furnaceCookTime) {
                icrafting.sendProgressBarUpdate(this, 0, this.tileImperioFurnace.furnaceCookTime);
            }
            if (this.lastBurnTime != this.tileImperioFurnace.furnaceBurnTime) {
                icrafting.sendProgressBarUpdate(this, 1, this.tileImperioFurnace.furnaceBurnTime);
            }
            if (this.lastItemBurnTime != this.tileImperioFurnace.currentBurnTime) {
                icrafting.sendProgressBarUpdate(this, 2, this.tileImperioFurnace.currentBurnTime);
            }
        }
        this.lastCookTime = this.tileImperioFurnace.furnaceCookTime;
        this.lastBurnTime = this.tileImperioFurnace.furnaceBurnTime;
        this.lastItemBurnTime = this.tileImperioFurnace.currentBurnTime;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int value) {
        if (id == 0) this.tileImperioFurnace.furnaceCookTime = value;
        if (id == 1) this.tileImperioFurnace.furnaceBurnTime = value;
        if (id == 2) this.tileImperioFurnace.currentBurnTime = value;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return this.tileImperioFurnace.isUseableByPlayer(player);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotIndex == 2) {
                if (!this.mergeItemStack(itemstack1, 3, 39, true)) return null;
                slot.onSlotChange(itemstack1, itemstack);
            } else if (slotIndex != 1 && slotIndex != 0) {
                if (FurnaceRecipes.instance().getSmeltingResult(itemstack1) != null) {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false)) return null;
                } else if (TileEntityImperioFurnace.isItemFuel(itemstack1)) {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false)) return null;
                } else if (slotIndex >= 3 && slotIndex < 30) {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false)) return null;
                } else if (slotIndex >= 30 && slotIndex < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)) {
                    return null;
                }
            } else if (!this.mergeItemStack(itemstack1, 3, 39, false)) {
                return null;
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize) return null;
            slot.onPickupFromSlot(player, itemstack1);
        }
        return itemstack;
    }
}