package com.mark719.magicalcrops.items.tools;

import com.mark719.magicalcrops.MagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class AccioAxe extends ItemAxe {

    public AccioAxe(int par1, Item.ToolMaterial material) {
        super(material);
        this.maxStackSize = 1;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        // Устанавливаем золотой цвет названия предмета
        return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        // Исправлено: в 1.7.10 метод getMaxDamage требует ItemStack в качестве аргумента
        int maxDmg = this.getMaxDamage(stack);
        // Вычисляем оставшуюся прочность
        int currentDmg = maxDmg - this.getDamage(stack);

        // Добавляем информацию о прочности в описание (Lore)
        list.add(EnumChatFormatting.WHITE + "Durability: " +
                EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" +
                currentDmg + "/" + maxDmg);
    }
}