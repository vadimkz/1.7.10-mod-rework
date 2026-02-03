package com.mark719.magicalcrops.furnace;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityImperioFurnace extends TileEntity implements ISidedInventory {

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
        return hasCustomInventoryName() ? this.customName : "Imperio Furnace";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return this.customName != null && this.customName.length() > 0;
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
        this.furnaceItemStacks[slot] = stack;

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
    public void markDirty() {
        super.markDirty();
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this
                && player.getDistanceSq(this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D) <= 64.0D;
    }

    @Override
    public void openInventory() {
        // no-op
    }

    @Override
    public void closeInventory() {
        // no-op
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        if (slot == 2) return false; // output
        if (slot == 1) return isItemFuel(stack); // fuel
        return true; // input
    }

    /* ================= ISidedInventory ================= */

    @Override
    public int[] getSlotsForFace(int side) {
        // 0 = down, 1 = up, 2-5 = sides
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
        // allow taking output always, and allow taking buckets from fuel (ванильная логика)
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
        if (this.currentBurnTime == 0) this.currentBurnTime = 200;
        return this.furnaceBurnTime * scale / this.currentBurnTime;
    }

    @Override
    public void updateEntity() {
        boolean wasBurning = isBurning();
        boolean changed = false;

        if (this.furnaceBurnTime > 0) {
            this.furnaceBurnTime--;
        }

        if (!this.worldObj.isRemote) {
            if (this.furnaceBurnTime == 0 && canSmelt()) {
                this.currentBurnTime = this.furnaceBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);

                if (this.furnaceBurnTime > 0) {
                    changed = true;

                    if (this.furnaceItemStacks[1] != null) {
                        this.furnaceItemStacks[1].stackSize--;

                        if (this.furnaceItemStacks[1].stackSize == 0) {
                            Item container = this.furnaceItemStacks[1].getItem();
                            this.furnaceItemStacks[1] = container.getContainerItem(this.furnaceItemStacks[1]);
                        }
                    }
                }
            }

            if (isBurning() && canSmelt()) {
                this.furnaceCookTime++;

                if (this.furnaceCookTime == 25) {
                    this.furnaceCookTime = 0;
                    smeltItem();
                    changed = true;
                }
            } else {
                this.furnaceCookTime = 0;
            }

            if (wasBurning != isBurning()) {
                changed = true;
                ImperioFurnace.updateBlockState(isBurning(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (changed) {
            markDirty();
        }
    }

    private boolean canSmelt() {
        if (this.furnaceItemStacks[0] == null) return false;

        ItemStack result = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);
        if (result == null) return false;

        if (this.furnaceItemStacks[2] == null) return true;

        if (!this.furnaceItemStacks[2].isItemEqual(result)) return false;

        int total = this.furnaceItemStacks[2].stackSize + result.stackSize;
        return total <= getInventoryStackLimit() && total <= this.furnaceItemStacks[2].getMaxStackSize();
    }

    public void smeltItem() {
        if (!canSmelt()) return;

        ItemStack result = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);

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

    public static int getItemBurnTime(ItemStack stack) {
        if (stack == null) return 0;

        Item item = stack.getItem();

        // blocks
        if (item instanceof net.minecraft.item.ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
            Block block = Block.getBlockFromItem(item);

            if (block == Blocks.wooden_slab) return 150;
            if (block.getMaterial() == Material.wood) return 300;
            if (block == Blocks.coal_block) return 16000;
        }

        // wooden tools
        if (item instanceof ItemTool && "WOOD".equals(((ItemTool) item).getToolMaterialName())) return 200;
        if (item instanceof ItemSword && "WOOD".equals(((ItemSword) item).getToolMaterialName())) return 200;

        // hoe: не трогаем getToolMaterialName, чтобы не ловить вашу ошибку по ItemHoe
        if (item == Items.wooden_hoe) return 200;

        // a few vanilla fuels
        if (item == Items.stick) return 100;
        if (item == Items.coal) return 1600;
        if (item == Items.lava_bucket) return 20000;
        if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
        if (item == Items.blaze_rod) return 2400;

        return GameRegistry.getFuelValue(stack);
    }

    public static boolean isItemFuel(ItemStack stack) {
        return getItemBurnTime(stack) > 0;
    }
}