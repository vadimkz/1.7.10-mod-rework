package com.mark719.magicalcrops.help;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Регистрация блоков как в оригинальном Magical Crops 4.0.0_PUBLIC_BETA_3.
 *
 * Оригинал использовал имя вида: "magicalcrops_" + unlocalizedName.substring(5)
 * где unlocalizedName начинается с "tile.".
 *
 * Важно: это предотвращает двойную регистрацию (например MinicioOre vs minicio_ore),
 * которая ломает загрузку и приводит к missing textures/крашам.
 */
public class BlockRegisterHelper {

    /** Оригинальный вариант (рекомендуемый) */
    public static void registerBlock(Block block) {
        if (block == null) {
            throw new IllegalArgumentException("Tried to register null block");
        }

        String unloc = block.getUnlocalizedName(); // например "tile.MinicioOre"
        String suffix = (unloc != null && unloc.startsWith("tile.")) ? unloc.substring(5) : unloc;

        GameRegistry.registerBlock(block, "magicalcrops_" + suffix);
    }

    /**
     * Совместимость с кодом, который ожидал registerBlock(Block, String).
     * Используй только если реально нужно задать имя вручную.
     */
    public static void registerBlock(Block block, String name) {
        if (block == null) {
            throw new IllegalArgumentException("Tried to register null block: " + name);
        }
        GameRegistry.registerBlock(block, name);
    }
}
