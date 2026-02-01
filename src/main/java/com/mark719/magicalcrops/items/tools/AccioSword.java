package com.mark719.magicalcrops.items.tools;

import com.mark719.magicalcrops.MagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;

public class AccioSword extends ItemSword {

    public AccioSword(int par1, Item.ToolMaterial material) {
        super(material);
        this.maxStackSize = 1;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        int maxDmg = this.getMaxDamage(stack);
        int currentDmg = maxDmg - this.getDamage(stack);

        list.add(EnumChatFormatting.WHITE + "Durability: " +
                EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" +
                currentDmg + "/" + maxDmg);
    }
}