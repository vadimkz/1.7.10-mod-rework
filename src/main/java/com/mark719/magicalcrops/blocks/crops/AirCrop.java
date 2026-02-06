package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MSeeds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class AirCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    protected Item getSeed() {
        return MSeeds.AirSeeds;
    }

    @Override
    protected Item getCrop() {
        return Essence.AirEssence;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {

        if (iconArray == null) {
            System.out.println("AirCrop iconArray NULL — registerBlockIcons not called!");
            return net.minecraft.init.Blocks.wheat.getIcon(0,0);
        }

        if (meta < 7) {
            if (meta == 6) meta = 5;
            return iconArray[meta >> 1];
        }

        return iconArray[3];
    }
}
