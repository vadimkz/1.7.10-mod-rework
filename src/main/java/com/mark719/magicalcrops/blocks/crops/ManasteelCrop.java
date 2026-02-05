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

    public ManasteelCrop() {
        super();
        this.setUnlocalizedName("ManasteelCrop");
    }


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
    public void registerBlockIcons(IIconRegister reg) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            this.iconArray[i] = reg.registerIcon("magicalcrops:CropManasteel_" + i);
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