package com.mark719.magicalcrops.blocks.crops;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class NetherCrop extends BlockCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public NetherCrop() {
        this.setUnlocalizedName("nether_crop");
    }

    @Override
    protected Item getSeed() { // семя
        return com.mark719.magicalcrops.handlers.MSeeds.NetherSeeds;
    }

    @Override
    protected Item getCrop() { // дроп (эссенция)
        return com.mark719.magicalcrops.handlers.Essence.NetherEssence;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.icons = new IIcon[4];
        for (int i = 0; i < 4; i++) {
            this.icons[i] = reg.registerIcon("magicalcrops:CropNether_" + i);
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (icons == null) return null;

        int stage = meta >> 1;
        if (stage < 0) stage = 0;
        if (stage >= icons.length) stage = icons.length - 1;
        return icons[stage];
    }
}
