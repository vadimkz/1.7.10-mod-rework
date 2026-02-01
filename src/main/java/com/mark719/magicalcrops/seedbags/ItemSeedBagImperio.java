package com.mark719.magicalcrops.seedbags;

import com.mark719.magicalcrops.MagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemSeedBagImperio extends Planter {

    public ItemSeedBagImperio() {
        super(27, 6);
        this.setUnlocalizedName("magicalcrops.SeedBagImperio");
        this.setTextureName("magicalcrops:seedbag_3");
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.rare;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
        list.add(StatCollector.translateToLocal("tooltip.seedbag.imperio.info"));
    }
}