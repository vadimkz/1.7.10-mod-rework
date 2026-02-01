package com.mark719.magicalcrops.items.tools;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.config.ConfigMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import org.lwjgl.input.Keyboard;

public class AccioHoe extends ItemHoe {

    public AccioHoe(int par1, Item.ToolMaterial material) {
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
        if (ConfigMain.EXTRA_HOE) {
            list.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");

            // Проверка нажатия SHIFT (42 - LShift, 54 - RShift)
            if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
                list.add(EnumChatFormatting.ITALIC + "- 1 Extra essence from Minicio Crops");
            }
        }

        // В 1.7.10 getMaxDamage требует ItemStack в качестве аргумента
        int maxDmg = this.getMaxDamage(stack);
        int currentDmg = maxDmg - this.getDamage(stack);

        list.add(EnumChatFormatting.WHITE + "Durability: " +
                EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" +
                currentDmg + "/" + maxDmg);

        list.add("");
        list.add(EnumChatFormatting.BLUE + "+1 Attack Damage");
    }
}