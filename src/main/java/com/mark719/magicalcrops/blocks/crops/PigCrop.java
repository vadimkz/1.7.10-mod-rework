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
 * Класс блока магической культуры Свиньи.
 * Относится к категории "Soul Crops" (культуры душ животных).
 */
public class PigCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    public Item getSeed() {
        // Семена свиньи из общего обработчика семян
        return MSeeds.PigSeeds;
    }

    @Override
    public Item getCrop() {
        // Эссенция свиньи из общего обработчика эссенций
        return Essence.PigEssence;
    }

        @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            // Внимание: для животных используется префикс SoulCrop
            // Путь: assets/magicalcrops/textures/blocks/SoulCropPig_i.png
            this.iconArray[i] = iconRegister.registerIcon("magicalcrops:SoulCropPig_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        // Стандартная логика выбора иконки в зависимости от стадии роста (0-7)
        if (metadata < 7) {
            if (metadata == 6) {
                metadata = 5;
            }
            return this.iconArray[metadata >> 1];
        }
        return this.iconArray[3];
    }
}