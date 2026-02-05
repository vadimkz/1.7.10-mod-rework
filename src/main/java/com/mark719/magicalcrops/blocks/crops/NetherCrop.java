package com.mark719.magicalcrops.blocks.crops;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class NetherCrop extends BlockCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    public NetherCrop() {
        super();
        this.setUnlocalizedName("NetherCrop");
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
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            this.iconArray[i] = reg.registerIcon("magicalcrops:CropNether_" + i);
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
