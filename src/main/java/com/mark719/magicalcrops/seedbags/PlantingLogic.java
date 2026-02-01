package com.mark719.magicalcrops.seedbags;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Логика поиска семян и взаимодействия с миром для сумок.
 */
public class PlantingLogic {

    /**
     * Ищет подходящий слот с семенами в инвентаре сумки.
     */
    public static int getSeedsSlot(IInventory inv, int initialSlot) {
        if (initialSlot < 0) return -1;

        ItemStack initialTarget = inv.getStackInSlot(initialSlot);
        if (initialTarget != null && initialTarget.stackSize > 0 && initialTarget.getItem() instanceof IPlantable) {
            return initialSlot;
        }

        for (int slot = 0; slot < inv.getSizeInventory(); slot++) {
            ItemStack stack = inv.getStackInSlot(slot);
            if (stack != null && stack.stackSize > 0 && stack.getItem() instanceof IPlantable) {
                return slot;
            }
        }
        return -1;
    }

    /**
     * Проверяет, можно ли посадить семя в указанные координаты.
     * Используется для логики "жилы" (vein) или предварительной проверки.
     */
    public static boolean canPlant(IInventory inv, World world, int x, int y, int z, ForgeDirection direction) {
        int slot = getSeedsSlot(inv, 0);
        if (slot < 0) return false;

        ItemStack stack = inv.getStackInSlot(slot);
        IPlantable plantable = (IPlantable) stack.getItem();

        Block targetBlock = world.getBlock(x, y, z);
        if (targetBlock == null) return false;

        // Проверяем: пригодна ли почва и пусто ли место над ней
        return targetBlock.canSustainPlant(world, x, y, z, direction, plantable) &&
                world.isAirBlock(x, y + 1, z);
    }

    /**
     * Пытается посадить семя в указанные координаты.
     */
    public static boolean placeSeed(IInventory inv, World world, int x, int y, int z, int slot, ForgeDirection direction) {
        ItemStack currentItem = inv.getStackInSlot(slot);
        if (currentItem == null || !(currentItem.getItem() instanceof IPlantable)) {
            return false;
        }

        IPlantable plantable = (IPlantable) currentItem.getItem();
        Block targetBlock = world.getBlock(x, y, z);

        if (targetBlock == null || !targetBlock.canSustainPlant(world, x, y, z, direction, plantable)) {
            return false;
        }

        if (!world.isAirBlock(x, y + 1, z)) {
            return false;
        }

        Block plantBlock = plantable.getPlant(world, x, y + 1, z);
        int plantMeta = plantable.getPlantMetadata(world, x, y + 1, z);

        return world.setBlock(x, y + 1, z, plantBlock, plantMeta, 3);
    }

    /**
     * Проверка: является ли блок под прицелом подходящей грядкой.
     */
    public static boolean targetedSuitableFarmland(World world, int x, int y, int z, int side, float hitX) {
        if (side != 1) return false;
        Block block = world.getBlock(x, y, z);
        return block != null && block.isFertile(world, x, y, z);
    }

    /**
     * Получение инвентаря из ItemStack сумки.
     */
    public static IInventory getInventory(ItemStack stack) {
        if (stack != null && stack.getItem() instanceof Planter) {
            return new SeedInventory(stack);
        }
        return null;
    }
}