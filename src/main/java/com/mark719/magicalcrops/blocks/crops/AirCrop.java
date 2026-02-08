package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class AirCrop extends BlockMagicalCrops {

    public AirCrop() {
        super();
        this.setUnlocalizedName("AirCrop");
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        // ВАЖНО: используем поле icons из BlockMagicalCrops,
        // иначе базовый getIcon/логика может уйти в fallback на пшеницу.
        this.icons = new IIcon[4];
        for (int i = 0; i < 4; i++) {
            this.icons[i] = reg.registerIcon("magicalcrops:CropAir_" + i);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        // Если по какой-то причине иконки ещё не прошиты — используем fallback из базового класса
        if (this.icons == null) {
            return super.getIcon(side, meta);
        }

        if (meta < 0) meta = 0;
        if (meta > 7) meta = 7;

        int stage = meta >> 1; // 0..3
        if (stage < 0) stage = 0;
        if (stage >= this.icons.length) stage = this.icons.length - 1;

        return this.icons[stage];
    }
}
