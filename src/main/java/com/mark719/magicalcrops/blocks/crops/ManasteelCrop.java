package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import com.mark719.magicalcrops.handlers.ModCompat;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

/**
 * Класс блока культуры Манастали (Manasteel).
 * Использует ModCompat для интеграции с модом Botania.
 */
public class ManasteelCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    public Item getSeed() {
        // Получаем семена Манастали из обработчика совместимости
        return ModCompat.ManasteelSeeds;
    }

    @Override
    public Item getCrop() {
        // Получаем эссенцию Манастали из обработчика совместимости
        return ModCompat.ManasteelEssence;
    }

        @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            // Регистрация текстур: assets/magicalcrops/textures/blocks/CropManasteel_X.png
            this.iconArray[i] = iconRegister.registerIcon("magicalcrops:CropManasteel_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        // Логика выбора иконки в зависимости от стадии роста (metadata)
        if (metadata < 7) {
            if (metadata == 6) {
                metadata = 5;
            }
            // Используем сдвиг вправо (>> 1) для распределения 4 текстур на 7 стадий
            return this.iconArray[metadata >> 1];
        }
        // Финальная стадия роста
        return this.iconArray[3];
    }
}