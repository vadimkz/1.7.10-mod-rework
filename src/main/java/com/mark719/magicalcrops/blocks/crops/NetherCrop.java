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
 * Класс блока культуры Нижнего Мира (Nether).
 */
public class NetherCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    public Item getSeed() {
        // Возвращает семена Nether
        return MSeeds.NetherSeeds;
    }

    @Override
    public Item getCrop() {
        // Возвращает эссенцию Nether
        return Essence.NetherEssence;
    }

        @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        // Инициализация 4 стадий роста
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            // Регистрация текстур: "magicalcrops:CropNether_0" и т.д.
            this.iconArray[i] = iconRegister.registerIcon("magicalcrops:CropNether_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        // Метаданные от 0 до 7 (стадии роста)
        if (metadata < 7) {
            // На 6-й стадии используется иконка от 5-й (для плавности/замедления)
            if (metadata == 6) {
                metadata = 5;
            }
            // Сдвиг вправо на 1 (деление на 2) для выбора индекса 0, 1 или 2
            return this.iconArray[metadata >> 1];
        }
        // Метаданные 7 — финальная стадия
        return this.iconArray[3];
    }
}