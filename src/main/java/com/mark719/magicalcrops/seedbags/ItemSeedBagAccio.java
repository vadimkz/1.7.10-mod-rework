package com.mark719.magicalcrops.seedbags;

import com.mark719.magicalcrops.MagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemSeedBagAccio extends Planter {

    public ItemSeedBagAccio() {
        // Вместимость и радиус (предположительно параметры Planter)
        super(9, 2);
        this.setUnlocalizedName("magicalcrops.SeedBagAccio");
        this.setTextureName("magicalcrops:seedbag_1");
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.common;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
        list.add(StatCollector.translateToLocal("tooltip.seedbag.accio.info"));
    }
}