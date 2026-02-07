package com.mark719.magicalcrops.help;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * Helper для регистрации блоков, максимально совместимый с оригинальным Magical Crops,
 * но без падений на null и с корректной перегрузкой GameRegistry.registerBlock(...)
 * для Forge 1.7.10.
 */
public class BlockRegisterHelper {

    /**
     * Оригинальная схема: имя формируется из unlocalizedName:
     * tile.X -> magicalcrops_X
     */
    public static void registerBlock(Block block) {
        if (block == null) {
            System.err.println("[MagicalCrops] Skipping null block registration (auto-name). Check MBlocks/MCrops init order.");
            return;
        }

        String unloc = block.getUnlocalizedName(); // e.g. "tile.MinicioOre"
        String suffix = (unloc != null && unloc.startsWith("tile.")) ? unloc.substring(5) : unloc;
        String regName = "magicalcrops_" + suffix;

        GameRegistry.registerBlock(block, ItemBlock.class, regName);
    }

    /**
     * Совместимость со старым кодом: ручное имя.
     * ВАЖНО: смена регистра/имени может сломать уже созданные миры.
     */
    public static void registerBlock(Block block, String name) {
        if (block == null) {
            System.err.println("[MagicalCrops] Skipping null block registration: " + name);
            return;
        }
        GameRegistry.registerBlock(block, ItemBlock.class, name);
    }

    /**
     * Регистрация блока с кастомным ItemBlock (для метадаты/вариантов).
     */
    public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlockClass, String name) {
        if (block == null) {
            System.err.println("[MagicalCrops] Skipping null block registration (ItemBlock=" + itemBlockClass + "): " + name);
            return;
        }
        GameRegistry.registerBlock(block, itemBlockClass, name);
    }
}
