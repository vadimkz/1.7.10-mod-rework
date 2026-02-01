package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import com.mark719.magicalcrops.handlers.ModCompat;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

/**
 * Класс блока культуры Манюллина (Manyullyn).
 * Требует наличия Tinker's Construct для работы предметов из ModCompat.
 */
public class ManyullynCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    public Item getSeed() {
        // Получаем семена Манюллина
        return ModCompat.ManyullynSeeds;
    }

    @Override
    public Item getCrop() {
        // Получаем эссенцию Манюллина
        return ModCompat.ManyullynEssence;
    }

        @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            // Путь к текстуре: magicalcrops:textures/blocks/CropManyullyn_X.png
            this.iconArray[i] = iconRegister.registerIcon("magicalcrops:CropManyullyn_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        // Логика отображения стадий роста
        if (metadata < 7) {
            if (metadata == 6) {
                metadata = 5;
            }
            return this.iconArray[metadata >> 1];
        }
        // Возвращаем иконку полностью выросшего растения
        return this.iconArray[3];
    }
}