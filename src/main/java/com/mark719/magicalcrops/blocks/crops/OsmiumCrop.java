package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import com.mark719.magicalcrops.handlers.ModCompat;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

/**
 * Класс блока культуры Осмия (Osmium).
 * Использует ModCompat для регистрации предметов, так как осмий — ресурс из сторонних модов.
 */
public class OsmiumCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    public Item getSeed() {
        // Получение семян через обработчик совместимости
        return ModCompat.OsmiumSeeds;
    }

    @Override
    public Item getCrop() {
        // Получение эссенции через обработчик совместимости
        return ModCompat.OsmiumEssence;
    }

        @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            // Регистрация текстур: assets/magicalcrops/textures/blocks/CropOsmium_i.png
            this.iconArray[i] = iconRegister.registerIcon("magicalcrops:CropOsmium_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        // Математика выбора иконки в зависимости от стадии роста (metadata)
        if (metadata < 7) {
            if (metadata == 6) {
                metadata = 5;
            }
            return this.iconArray[metadata >> 1];
        }
        // Финальная стадия роста
        return this.iconArray[3];
    }
}