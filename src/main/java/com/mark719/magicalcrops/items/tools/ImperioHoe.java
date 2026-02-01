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

public class ImperioHoe extends ItemHoe {

    public ImperioHoe(int par1, Item.ToolMaterial material) {
        super(material);
        this.maxStackSize = 1;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        if (ConfigMain.EXTRA_HOE) {
            list.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
            if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
                list.add(EnumChatFormatting.ITALIC + "- 4 Extra essence from Minicio Crops");
            }
        }

        int maxDmg = this.getMaxDamage(stack);
        int currentDmg = maxDmg - this.getDamage(stack);

        list.add(EnumChatFormatting.WHITE + "Durability: " +
                EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" +
                currentDmg + "/" + maxDmg);
    }
}