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
 * Clean restored version based on original Magical Crops logic.
 * Fixes:
 *  - proper unlocalized name (prevents magicalcrops_null)
 *  - MCP method names
 *  - correct icon handling
 */
public class AirCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    public AirCrop() {
        super();
        this.setUnlocalizedName("AirCrop");
    }

    @Override
    protected Item getSeed() {
        return MSeeds.AirSeeds;
    }

    @Override
    protected Item getCrop() {
        return Essence.AirEssence;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            this.iconArray[i] = reg.registerIcon("magicalcrops:CropAir_" + i);
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
