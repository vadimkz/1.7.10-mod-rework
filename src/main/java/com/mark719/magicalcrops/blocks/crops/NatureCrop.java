package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MSeeds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

/**
 * Класс блока культуры Природы (Nature).
 * Используется для выращивания эссенции природы, из которой крафтятся органические материалы.
 */
public class NatureCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    public Item getSeed() {
        // Возвращает предмет семян природы
        return MSeeds.NatureSeeds;
    }

    @Override
    public Item getCrop() {
        // Возвращает предмет эссенции природы
        return Essence.NatureEssence;
    }

        @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        // Инициализация массива иконок для 4 стадий отрисовки
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            // Регистрация текстур: "magicalcrops:CropNature_0", "magicalcrops:CropNature_1", и т.д.
            this.iconArray[i] = iconRegister.registerIcon("magicalcrops:CropNature_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        // Логика выбора текстуры в зависимости от стадии роста (метаданных блока)
        if (metadata < 7) {
            // Искусственное замедление смены текстуры на 6-й стадии
            if (metadata == 6) {
                metadata = 5;
            }
            // Выбор иконки (0-1 -> индекс 0, 2-3 -> индекс 1, 4-6 -> индекс 2)
            return this.iconArray[metadata >> 1];
        }
        // Метаданные 7 — полностью созревшая культура (индекс 3)
        return this.iconArray[3];
    }
}