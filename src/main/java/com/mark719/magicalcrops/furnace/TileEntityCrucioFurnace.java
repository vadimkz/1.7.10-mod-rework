package com.mark719.magicalcrops.furnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class TileEntityCrucioFurnace extends TileEntity implements ISidedInventory {

    private static final int[] SLOTS_TOP = new int[] { 0 };
    private static final int[] SLOTS_BOTTOM = new int[] { 2, 1 };
    private static final int[] SLOTS_SIDES = new int[] { 1 };

    private ItemStack[] furnaceItemStacks = new ItemStack[3];

    public int furnaceBurnTime;
    public int currentBurnTime;
    public int furnaceCookTime;

    private String customName;

    /* ================= Naming ================= */

    public void setCustomInventoryName(String name) {
        this.customName = name;
    }

    @Override
    public String getInventoryName() {
        return hasCustomInventoryName() ? this.customName : "Crucio Furnace";
    }

    public boolean hasCustomInventoryName() {
        return this.customName != null && !this.customName.isEmpty();
    }

    @Override
    public boolean isCustomInventoryName() {
        return hasCustomInventoryName();
    }

    /* ================= IInventory ================= */

    @Override
    public int getSizeInventory() {
        return this.furnaceItemStacks.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return this.furnaceItemStacks[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int amount) {
        if (this.furnaceItemStacks[slot] == null) return null;

        if (this.furnaceItemStacks[slot].stackSize <= amount) {
            ItemStack stack = this.furnaceItemStacks[slot];
            this.furnaceItemStacks[slot] = null;
            markDirty();
            return stack;
        }

        ItemStack split = this.furnaceItemStacks[slot].splitStack(amount);
        if (this.furnaceItemStacks[slot].stackSize == 0) {
            this.furnaceItemStacks[slot] = null;
        }
        markDirty();
        return split;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        if (this.furnaceItemStacks[slot] == null) return null;

        ItemStack stack = this.furnaceItemStacks[slot];
        this.furnaceItemStacks[slot] = null;
        return stack;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        ItemStack current = this.furnaceItemStacks[slot];
        this.furnaceItemStacks[slot] = stack;

        if (slot == 0 && (stack == null || !stack.isItemEqual(current))) {
            this.furnaceCookTime = 0;
            markDirty();
        }

        if (stack != null && stack.stackSize > getInventoryStackLimit()) {
            stack.stackSize = getInventoryStackLimit();
        }
        markDirty();
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this
                && player.getDistanceSq(this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D) <= 64.0D;
    }

    @Override
    public void openChest() {}

    @Override
    public void closeChest() {}


    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        if (slot == 2) return false;
        if (slot == 1) return isItemFuel(stack);
        return true;
    }
    public static boolean isItemFuel(ItemStack stack) {
        return getItemBurnTime(stack) > 0;
    }
    /* ================= ISidedInventory ================= */

    @Override
    public int[] getSlotsForFace(int side) {
        if (side == 1) return SLOTS_TOP;
        if (side == 0) return SLOTS_BOTTOM;
        return SLOTS_SIDES;
    }

    @Override
    public boolean canInsertItem(int slot, ItemStack stack, int side) {
        return isItemValidForSlot(slot, stack);
    }

    @Override
    public boolean canExtractItem(int slot, ItemStack stack, int side) {
        return side != 0 || slot != 1 || stack.getItem() == Items.bucket;
    }

    /* ================= NBT ================= */

    @Override
    public void readFromNBT(NBTTagCompound tag) {
        super.readFromNBT(tag);

        NBTTagList list = tag.getTagList("Items", 10);
        this.furnaceItemStacks = new ItemStack[getSizeInventory()];

        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound entry = list.getCompoundTagAt(i);
            int slot = entry.getByte("Slot") & 255;
            if (slot >= 0 && slot < this.furnaceItemStacks.length) {
                this.furnaceItemStacks[slot] = ItemStack.loadItemStackFromNBT(entry);
            }
        }

        this.furnaceBurnTime = tag.getShort("BurnTime");
        this.furnaceCookTime = tag.getShort("CookTime");
        this.currentBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);

        if (tag.hasKey("CustomName", 8)) {
            this.customName = tag.getString("CustomName");
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
        super.writeToNBT(tag);

        tag.setShort("BurnTime", (short) this.furnaceBurnTime);
        tag.setShort("CookTime", (short) this.furnaceCookTime);

        NBTTagList list = new NBTTagList();
        for (int i = 0; i < this.furnaceItemStacks.length; i++) {
            if (this.furnaceItemStacks[i] != null) {
                NBTTagCompound entry = new NBTTagCompound();
                entry.setByte("Slot", (byte) i);
                this.furnaceItemStacks[i].writeToNBT(entry);
                list.appendTag(entry);
            }
        }
        tag.setTag("Items", list);

        if (hasCustomInventoryName()) {
            tag.setString("CustomName", this.customName);
        }
    }

    /* ================= Furnace logic ================= */

    public boolean isBurning() {
        return this.furnaceBurnTime > 0;
    }

    public int getCookProgressScaled(int scale) {
        return this.furnaceCookTime * scale / 25;
    }

    public int getBurnTimeRemainingScaled(int scale) {
        if (this.currentBurnTime == 0) {
            this.currentBurnTime = 200;
        }
        return this.furnaceBurnTime * scale / this.currentBurnTime;
    }

    @Override
    public void updateEntity() {
        boolean wasBurning = isBurning();
        boolean dirty = false;

        if (this.furnaceBurnTime > 0) {
            this.furnaceBurnTime--;
        }

        if (!this.worldObj.isRemote) {
            if (this.furnaceBurnTime == 0 && canSmelt()) {
                this.currentBurnTime = this.furnaceBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);

                if (this.furnaceBurnTime > 0) {
                    dirty = true;
                    if (this.furnaceItemStacks[1] != null) {
                        this.furnaceItemStacks[1].stackSize--;
                        if (this.furnaceItemStacks[1].stackSize == 0) {
                            Item container = this.furnaceItemStacks[1].getItem().getContainerItem();
                            this.furnaceItemStacks[1] = container != null ? new ItemStack(container) : null;
                        }
                    }
                }
            }

            if (isBurning() && canSmelt()) {
                this.furnaceCookTime++;
                if (this.furnaceCookTime == 25) {
                    this.furnaceCookTime = 0;
                    smeltItem();
                    dirty = true;
                }
            } else {
                this.furnaceCookTime = 0;
            }

            if (wasBurning != isBurning()) {
                dirty = true;
                CrucioFurnace.updateBlockState(isBurning(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (dirty) {
            markDirty();
        }
    }

    private boolean canSmelt() {
        if (this.furnaceItemStacks[0] == null) return false;
        ItemStack result = FurnaceRecipes.instance().getSmeltingResult(this.furnaceItemStacks[0]);
        if (result == null) return false;

        if (this.furnaceItemStacks[2] == null) return true;
        if (!this.furnaceItemStacks[2].isItemEqual(result)) return false;

        int combined = this.furnaceItemStacks[2].stackSize + result.stackSize;
        return combined <= getInventoryStackLimit() && combined <= result.getMaxStackSize();
    }

    private void smeltItem() {
        if (!canSmelt()) return;

        ItemStack result = FurnaceRecipes.instance().getSmeltingResult(this.furnaceItemStacks[0]);

        if (this.furnaceItemStacks[2] == null) {
            this.furnaceItemStacks[2] = result.copy();
        } else if (this.furnaceItemStacks[2].getItem() == result.getItem()) {
            this.furnaceItemStacks[2].stackSize += result.stackSize;
        }

        this.furnaceItemStacks[0].stackSize--;
        if (this.furnaceItemStacks[0].stackSize <= 0) {
            this.furnaceItemStacks[0] = null;
        }
    }

    private static int getItemBurnTime(ItemStack stack) {
        return TileEntityFurnace.getItemBurnTime(stack);
    }
}
