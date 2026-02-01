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

public class ItemInfusionStone3Strong extends Item {

    public ItemInfusionStone3Strong() {
        super();
        this.maxStackSize = 1; // field_77777_bU
        this.setMaxDamage(ConfigMain.STRONG_DURABILITY); // Пропускаем проблему здесь
        this.setCreativeTab(MagicalCrops.tabMagical); // setCreativeTab
        this.setTextureName("magicalcrops:InfusionStone_T3"); // setTextureName
        this.setUnlocalizedName("InfusionStoneStrong"); // setUnlocalizedName
        this.canRepair = false;
        this.bFull3D = true; // field_77787_bX
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        // Цветной текст названия (AQUA)
        return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        // Копия предмета для крафта
        ItemStack cStack = itemStack.copy(); // copy

        if (ConfigMain.INFUSION_DURABILITY) {
            int newDamage = cStack.getItemDamage() + 1; // getItemDamage
            cStack.setItemDamage(newDamage); // setItemDamage
            cStack.stackSize = 1; // stackSize

            // Удаление если сломан
            if (cStack.getItemDamage() >= cStack.getMaxDamage()) {
                return null;
            }
        }
        return cStack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par2) {
        return EnumRarity.rare;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add("Crucio -> Imperio");
        if (ConfigMain.INFUSION_DURABILITY) {
            int maxDur = stack.getMaxDamage(); // getMaxDamage
            int currentDur = maxDur - stack.getItemDamage(); // getItemDamage
            list.add("Durability: " + currentDur + "/" + maxDur);
        }
    }
}