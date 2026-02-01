package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.MagicalCrops;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Класс блока Камня Эссенции.
 * Исправлены названия методов, которые чаще всего вызывают ошибки в IDE.
 */
public class BlockEssenceStone extends Block {

    public BlockEssenceStone() {
        // Вызываем конструктор суперкласса с материалом "камень"
        super(Material.rock);

        // Если setUnlocalizedName красный, используем setUnlocalizedName
        // Это имя используется для перевода в .lang файлах
        this.setUnlocalizedName("essence_stone");

        // Если setBlockTextureName красный, попробуйте setTextureName
        // Формат: "modid:filename"
        this.setTextureName("magicalcrops:essence_stone");

        // Установка вкладки в креативном режиме
        this.setCreativeTab(MagicalCrops.tabMagical);

        // Стандартные звуки при ходьбе/разрушении (для камня)
        this.setStepSound(soundTypePiston);

        // Прочность (как у обсидиана или камня, на ваш вкус)
        this.setHardness(3.0F);

        // Сопротивление взрыву
        this.setResistance(5.0F);
    }
}