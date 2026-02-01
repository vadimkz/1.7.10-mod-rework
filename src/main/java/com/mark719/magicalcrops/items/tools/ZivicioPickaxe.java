package com.mark719.magicalcrops.items.tools;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.config.ConfigMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

public class ZivicioPickaxe extends ItemPickaxe {

    public ZivicioPickaxe(int par1, Item.ToolMaterial material) {
        super(material);
        this.maxStackSize = 1;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        return true;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase entity) {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        if (ConfigMain.EXTRA_PICKAXE) {
            list.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
            if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
                list.add(EnumChatFormatting.ITALIC + "- 16 Extra essence from Minicio Ores");
            }
        }
        list.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + "Infinite");
    }
}