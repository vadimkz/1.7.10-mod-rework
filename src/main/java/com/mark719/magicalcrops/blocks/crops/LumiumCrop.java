package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import com.mark719.magicalcrops.handlers.ModCompat;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

/**
 * Класс блока культуры Люмиума (Lumium)
 * Требует наличия Thermal Foundation или аналогичного мода для работы ModCompat
 */
public class LumiumCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    public Item getSeed() {
        // Семена Lumium из обработчика совместимости
        return ModCompat.LumiumSeeds;
    }

    @Override
    public Item getCrop() {
        // Эссенция Lumium из обработчика совместимости
        return ModCompat.LumiumEssence;
    }

        @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            // Путь к текстуре: assets/magicalcrops/textures/blocks/CropLumium_X.png
            this.iconArray[i] = iconRegister.registerIcon("magicalcrops:CropLumium_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        // Стандартная логика отображения стадий роста (0-7)
        if (metadata < 7) {
            if (metadata == 6) {
                metadata = 5;
            }
            return this.iconArray[metadata >> 1];
        }
        // Финальная стадия
        return this.iconArray[3];
    }
}