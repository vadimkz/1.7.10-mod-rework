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

public class ContainerZivicioFurnace extends Container {
    private TileEntityZivicioFurnace tileZivicioFurnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

    public ContainerZivicioFurnace(InventoryPlayer player, TileEntityZivicioFurnace tileEntityZivicioFurnace) {
        this.tileZivicioFurnace = tileEntityZivicioFurnace;
        this.addSlotToContainer(new Slot(tileEntityZivicioFurnace, 0, 56, 17));
        this.addSlotToContainer(new Slot(tileEntityZivicioFurnace, 1, 56, 53));
        this.addSlotToContainer(new SlotFurnace(player.player, tileEntityZivicioFurnace, 2, 116, 35));

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
        crafting.sendProgressBarUpdate(this, 0, this.tileZivicioFurnace.furnaceCookTime);
        crafting.sendProgressBarUpdate(this, 1, this.tileZivicioFurnace.furnaceBurnTime);
        crafting.sendProgressBarUpdate(this, 2, this.tileZivicioFurnace.currentBurnTime);
    }

    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        for (int i = 0; i < this.crafters.size(); ++i) {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);
            if (this.lastCookTime != this.tileZivicioFurnace.furnaceCookTime) {
                icrafting.sendProgressBarUpdate(this, 0, this.tileZivicioFurnace.furnaceCookTime);
            }
            if (this.lastBurnTime != this.tileZivicioFurnace.furnaceBurnTime) {
                icrafting.sendProgressBarUpdate(this, 1, this.tileZivicioFurnace.furnaceBurnTime);
            }
            if (this.lastItemBurnTime != this.tileZivicioFurnace.currentBurnTime) {
                icrafting.sendProgressBarUpdate(this, 2, this.tileZivicioFurnace.currentBurnTime);
            }
        }
        this.lastCookTime = this.tileZivicioFurnace.furnaceCookTime;
        this.lastBurnTime = this.tileZivicioFurnace.furnaceBurnTime;
        this.lastItemBurnTime = this.tileZivicioFurnace.currentBurnTime;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int value) {
        if (id == 0) this.tileZivicioFurnace.furnaceCookTime = value;
        if (id == 1) this.tileZivicioFurnace.furnaceBurnTime = value;
        if (id == 2) this.tileZivicioFurnace.currentBurnTime = value;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return this.tileZivicioFurnace.isUseableByPlayer(player);
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
                } else if (TileEntityZivicioFurnace.isItemFuel(itemstack1)) {
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