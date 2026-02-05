package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import com.mark719.magicalcrops.handlers.ModCompat;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

/**
 * Класс блока культуры Перидота (Peridot).
 * Перидот обычно является частью модов на драгоценные камни или модов типа Project Red/Biomes O' Plenty.
 */
public class PeridotCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    public PeridotCrop() {
        super();
        this.setUnlocalizedName("PeridotCrop");
    }


    @Override
    public Item getSeed() {
        // Получение семян через ModCompat
        return ModCompat.PeridotSeeds;
    }

    @Override
    public Item getCrop() {
        // Получение эссенции через ModCompat
        return ModCompat.PeridotEssence;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            this.iconArray[i] = reg.registerIcon("magicalcrops:CropPeridot_" + i);
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