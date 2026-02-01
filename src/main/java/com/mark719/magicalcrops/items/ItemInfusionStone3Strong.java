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
        this.setCreativeTab(MagicalCrops.tabMagical); // func_77637_a
        this.setTextureName("magicalcrops:InfusionStone_T3"); // func_111206_d
        this.setUnlocalizedName("InfusionStoneStrong"); // func_77655_b
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
        ItemStack cStack = itemStack.copy(); // func_77946_l

        if (ConfigMain.INFUSION_DURABILITY) {
            int newDamage = cStack.getMetadata() + 1; // func_77960_j
            cStack.setMetadata(newDamage); // func_77964_b
            cStack.stackSize = 1; // field_77994_a

            // Удаление если сломан
            if (cStack.getMetadata() >= cStack.getMaxDurability()) {
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
            int maxDur = stack.getMaxDurability(); // func_77958_k
            int currentDur = maxDur - stack.getMetadata(); // func_77960_j
            list.add("Durability: " + currentDur + "/" + maxDur);
        }
    }
}