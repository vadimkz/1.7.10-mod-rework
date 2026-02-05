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
 * Класс блока магической культуры Кварца.
 * Использует стандартные хендлеры MSeeds и Essence для предметов.
 */
public class QuartzCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    public QuartzCrop() {
        super();
        this.setUnlocalizedName("QuartzCrop");
    }


    @Override
    public Item getSeed() {
        // Семена кварца из основного реестра семян
        return MSeeds.QuartzSeeds;
    }

    @Override
    public Item getCrop() {
        // Эссенция кварца из основного реестра эссенций
        return Essence.QuartzEssence;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            this.iconArray[i] = reg.registerIcon("magicalcrops:CropQuartz_" + i);
        }
    }


    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta < 7) {
            if (meta == 6) meta = 5;
            return this.iconArray[meta >> 1];
        }
        return this.iconArray[3];
    }
}