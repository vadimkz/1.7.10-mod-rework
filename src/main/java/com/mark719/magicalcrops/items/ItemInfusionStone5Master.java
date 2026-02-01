package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.config.ConfigMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemInfusionStone5Master extends Item {

    public ItemInfusionStone5Master() {
        super();
        this.maxStackSize = 1; // field_77777_bU
        this.setMaxDamage(0); // func_77656_e(0) - бесконечный ресурс
        this.setCreativeTab(MagicalCrops.tabMagical); // setCreativeTab
        this.setTextureName("magicalcrops:InfusionStone_T5"); // setTextureName
        this.setUnlocalizedName("InfusionStoneMaster"); // setUnlocalizedName
        this.canRepair = false;
        this.bFull3D = true; // field_77787_bX
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        // Цвет названия DARK_RED
        return EnumChatFormatting.DARK_RED + super.getItemStackDisplayName(stack);
    }

    @Override
    public boolean isDamageable() {
        // Предмет не должен получать урон
        return false;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        // Просто возвращаем копию без изменений (прочность не тратится)
        return itemStack.copy(); // copy
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par2) {
        return EnumRarity.epic; // func_77613_e -> EPIC
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add("Infuses All");
        if (ConfigMain.INFUSION_DURABILITY) {
            // В оригинале здесь была опечатка "Infinate", сохранил смысл
            list.add("Durability: Infinite");
        }
    }
}