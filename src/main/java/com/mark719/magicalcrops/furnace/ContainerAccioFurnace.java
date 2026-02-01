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

public class ContainerAccioFurnace extends Container {
    private TileEntityAccioFurnace tileAccioFurnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

    public ContainerAccioFurnace(InventoryPlayer playerInventory, TileEntityAccioFurnace tileEntity) {
        this.tileAccioFurnace = tileEntity;

        // Слот для переплавки (0)
        this.addSlotToContainer(new Slot(tileEntity, 0, 56, 17));
        // Слот для топлива (1)
        this.addSlotToContainer(new Slot(tileEntity, 1, 56, 53));
        // Слот результата (2)
        this.addSlotToContainer(new SlotFurnace(playerInventory.player, tileEntity, 2, 116, 35));

        // Инвентарь игрока
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        // Хотбар игрока
        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    @Override
    public void onCraftGuiOpened(ICrafting crafting) {
        super.onCraftGuiOpened(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.tileAccioFurnace.furnaceCookTime);
        crafting.sendProgressBarUpdate(this, 1, this.tileAccioFurnace.furnaceBurnTime);
        crafting.sendProgressBarUpdate(this, 2, this.tileAccioFurnace.currentBurnTime);
    }

    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i) {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.tileAccioFurnace.furnaceCookTime) {
                icrafting.sendProgressBarUpdate(this, 0, this.tileAccioFurnace.furnaceCookTime);
            }

            if (this.lastBurnTime != this.tileAccioFurnace.furnaceBurnTime) {
                icrafting.sendProgressBarUpdate(this, 1, this.tileAccioFurnace.furnaceBurnTime);
            }

            if (this.lastItemBurnTime != this.tileAccioFurnace.currentBurnTime) {
                icrafting.sendProgressBarUpdate(this, 2, this.tileAccioFurnace.currentBurnTime);
            }
        }

        this.lastCookTime = this.tileAccioFurnace.furnaceCookTime;
        this.lastBurnTime = this.tileAccioFurnace.furnaceBurnTime;
        this.lastItemBurnTime = this.tileAccioFurnace.currentBurnTime;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int value) {
        if (id == 0) this.tileAccioFurnace.furnaceCookTime = value;
        if (id == 1) this.tileAccioFurnace.furnaceBurnTime = value;
        if (id == 2) this.tileAccioFurnace.currentBurnTime = value;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return this.tileAccioFurnace.isUseableByPlayer(player);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotIndex == 2) { // Если забираем из слота результата
                if (!this.mergeItemStack(itemstack1, 3, 39, true)) {
                    return null;
                }
                slot.onSlotChange(itemstack1, itemstack);
            } else if (slotIndex != 1 && slotIndex != 0) { // Если кликаем в инвентаре
                if (FurnaceRecipes.instance().getSmeltingResult(itemstack1) != null) {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false)) return null;
                } else if (TileEntityAccioFurnace.isItemFuel(itemstack1)) {
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