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
 * Класс блока культуры Миничио.
 * Миничио является фундаментальным ресурсом мода.
 */
public class MinicioCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    public Item getSeed() {
        // Получаем стандартные семена Миничио из общего обработчика семян
        return MSeeds.MinicioSeeds;
    }

    @Override
    public Item getCrop() {
        // Получаем эссенцию Миничио из общего обработчика предметов/эссенций
        return Essence.MinicioEssence;
    }

        @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            // Регистрация текстур: "magicalcrops:CropMinicio_0" и т.д.
            this.iconArray[i] = iconRegister.registerIcon("magicalcrops:CropMinicio_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        // Стандартная логика выбора иконки в зависимости от стадии роста (метаданных)
        if (metadata < 7) {
            // На 6-й стадии используется та же иконка, что и на 5-й (визуальный хак мода)
            if (metadata == 6) {
                metadata = 5;
            }
            // Сдвиг вправо на 1 эквивалентен делению на 2 (0-1 -> 0, 2-3 -> 1, 4-6 -> 2)
            return this.iconArray[metadata >> 1];
        }
        // Метаданные 7 соответствуют финальной стадии роста
        return this.iconArray[3];
    }
}