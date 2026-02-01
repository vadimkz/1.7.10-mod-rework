package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import com.mark719.magicalcrops.handlers.ModCompat;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

/**
 * Класс блока культуры Никеля.
 * Использует ModCompat для получения предметов, так как никель не является ванильной рудой.
 */
public class NickelCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    public Item getSeed() {
        // Получение семян из обработчика совместимости модов
        return ModCompat.NickelSeeds;
    }

    @Override
    public Item getCrop() {
        // Получение эссенции из обработчика совместимости модов
        return ModCompat.NickelEssence;
    }

        @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            // Регистрация текстур по пути: assets/magicalcrops/textures/blocks/CropNickel_i.png
            this.iconArray[i] = iconRegister.registerIcon("magicalcrops:CropNickel_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        // Стандартная логика отображения 4-х иконок на 8-ми стадиях роста
        if (metadata < 7) {
            if (metadata == 6) {
                metadata = 5;
            }
            return this.iconArray[metadata >> 1];
        }
        return this.iconArray[3];
    }
}