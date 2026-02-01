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
 * DyeCrop handles the growth logic and textures for Dye-producing magical crops.
 * It uses a 4-stage texture array mapped across 8 growth metadata states.
 */
public class DyeCrop extends BlockMagicalCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @Override
    public Item getSeed() {
        return MSeeds.DyeSeeds;
    }

    @Override
    public Item getCrop() {
        return Essence.DyeEssence;
    }

        @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        // Magical Crops typically uses 4 distinct textures for growth stages
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; i++) {
            this.iconArray[i] = iconRegister.registerIcon("magicalcrops:CropDye_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        // Logic to map 8 growth stages (0-7) to 4 textures
        if (metadata < 7) {
            if (metadata == 6) {
                metadata = 5; // Slight adjustment for the penultimate stage
            }
            // Use bit-shifting to select index (0, 1, 2, or 3)
            return this.iconArray[metadata >> 1];
        }

        // Final mature stage (metadata 7)
        return this.iconArray[3];
    }
}