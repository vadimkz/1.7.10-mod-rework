package com.mark719.magicalcrops.seedbags;

import com.mark719.magicalcrops.MagicalCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.List;

/**
 * Базовый класс для всех сумок с семенами (Planters).
 */
public abstract class Planter extends Item {
    protected boolean hasGui;
    protected int invSlots;
    protected int range;

    public Planter(int guiSlots, int range) {
        this.maxStackSize = 1;
        // Устанавливаем вкладку (замените на MagicalCrops.tabMagical, если нужно)
        this.setCreativeTab(CreativeTabs.tabMaterials);

        if (guiSlots > 0) {
            this.hasGui = true;
            this.invSlots = guiSlots;
        }
        this.range = range;
    }

    public int getInvSlots() {
        return this.invSlots;
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            return true;
        }

        // Открытие GUI при Shift + ПКМ
        if (player.isSneaking() && this.hasGui) {
            player.openGui(MagicalCrops.instance, 1, world, (int) player.posX, (int) player.posY, (int) player.posZ);
            return true;
        }

        // Проверка: кликнули ли мы по подходящей почве
        if (PlantingLogic.targetedSuitableFarmland(world, x, y, z, side, hitX)) {
            IInventory inv = PlantingLogic.getInventory(stack);
            if (inv != null) {
                // Направление взгляда игрока (0-3)
                int l = MathHelper.floor_double((double) (player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
                ForgeDirection direction = ForgeDirection.getOrientation(ForgeDirection.OPPOSITES[side]);

                plantArea(inv, world, x, y, z, direction, l, this.range);
                return true;
            }
        }
        return false;
    }

    public void plantArea(IInventory inv, World world, int startX, int startY, int startZ, ForgeDirection direction, int playerFacing, int radius) {
        int width = radius * 2 + 1;
        int startCornerX, startCornerZ;

        // Логика построения сетки в зависимости от поворота игрока
        switch (ForgeDirection.getOrientation(playerFacing + 2)) {
            case NORTH:
                startCornerX = startX - (width - 1) / 2;
                startCornerZ = startZ;
                for (int x = startCornerX; x < startCornerX + width; x++) {
                    for (int z = startCornerZ; z < startCornerZ + width; z++) {
                        plantSeedInPlace(inv, world, x, startY, z, direction);
                    }
                }
                break;
            case SOUTH:
                startCornerX = startX + (width - 1) / 2;
                startCornerZ = startZ;
                for (int x = startCornerX; x > startCornerX - width; x--) {
                    for (int z = startCornerZ; z > startCornerZ - width; z--) {
                        plantSeedInPlace(inv, world, x, startY, z, direction);
                    }
                }
                break;
            case EAST:
                startCornerX = startX;
                startCornerZ = startZ - (width - 1) / 2;
                for (int z = startCornerZ; z < startCornerZ + width; z++) {
                    for (int x = startCornerX; x < startCornerX + width; x++) {
                        plantSeedInPlace(inv, world, x, startY, z, direction);
                    }
                }
                break;
            case WEST:
                startCornerX = startX;
                startCornerZ = startZ + (width - 1) / 2;
                for (int x = startCornerX; x > startCornerX - width; x--) {
                    for (int z = startCornerZ; z > startCornerZ - width; z--) {
                        plantSeedInPlace(inv, world, x, startY, z, direction);
                    }
                }
                break;
        }
    }

    /**
     * Проверка возможности посадки для VeinPlanterInstance
     */
    public boolean canPlant(IInventory inv, World world, int x, int y, int z, ForgeDirection direction) {
        return PlantingLogic.canPlant(inv, world, x, y, z, direction);
    }

    public boolean plantSeedInPlace(IInventory inv, World world, int x, int y, int z, ForgeDirection direction) {
        int slot = PlantingLogic.getSeedsSlot(inv, getFirstSlot(inv));
        if (slot < 0) return false;

        boolean success = PlantingLogic.placeSeed(inv, world, x, y, z, slot, direction);
        if (success) {
            inv.decrStackSize(slot, 1);
            return true;
        }
        return false;
    }

    public int getFirstSlot(IInventory inv) {
        return 0;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add("Area: " + (this.range * 2 + 1) + "x" + (this.range * 2 + 1));
        if (this.hasGui) {
            list.add("Sneak + Right Click to open bag.");
        }
    }
}