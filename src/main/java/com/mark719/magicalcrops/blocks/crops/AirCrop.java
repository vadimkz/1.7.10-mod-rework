package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class AirCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] growthIcons;

    public AirCrop() {
        super();
        this.setUnlocalizedName("AirCrop");
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {

        this.growthIcons = new IIcon[4];

        for (int i = 0; i < 4; i++) {
            this.growthIcons[i] = reg.registerIcon("magicalcrops:CropAir_" + i);
        }
    }

    /**
     * ВАЖНО:
     * В 1.7.10 растения используют этот метод для стадий роста,
     * а не getIcon()
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int stage) {

        if (this.growthIcons == null) {
            return null;
        }

        if (stage < 0) stage = 0;
        if (stage >= this.growthIcons.length) stage = this.growthIcons.length - 1;

        return this.growthIcons[stage];
    }
}
