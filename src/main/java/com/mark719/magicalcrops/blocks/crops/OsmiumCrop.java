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

    public OsmiumCrop() {
        super();
        this.setUnlocalizedName("OsmiumCrop");
    }


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
    public void registerBlockIcons(IIconRegister reg) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            this.iconArray[i] = reg.registerIcon("magicalcrops:CropOsmium_" + i);
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