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

/**
 * Исправленная версия камня инфузии.
 * Исправляет баг бесконечной прочности при крафте.
 */
public class ItemInfusionStone1Weak extends Item {

    public ItemInfusionStone1Weak() {
        super();
        this.maxStackSize = 1; // field_77777_bU
        this.setMaxDamage(ConfigMain.WEAK_DURABILITY); // was: field_77779_bT
        this.setCreativeTab(MagicalCrops.tabMagical); // func_77637_a
        this.setTextureName("magicalcrops:InfusionStone_T1"); // func_111206_d
        this.setUnlocalizedName("InfusionStoneWeak"); // func_77655_b
        this.canRepair = false;
        this.bFull3D = true; // field_77787_bX
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

    // ВАЖНО: Мы НЕ переопределяем func_77630_h (isItemTool),
    // чтобы игра позволяла наносить урон в рецептах крафта.

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        // Создаем копию предмета для возврата в сетку крафта
        ItemStack cStack = itemStack.copy(); // func_77946_l

        if (ConfigMain.INFUSION_DURABILITY) {
            // Увеличиваем урон (Metadata) на 1
            int newDamage = cStack.getMetadata() + 1; // func_77960_j
            cStack.setMetadata(newDamage); // func_77964_b
            cStack.stackSize = 1; // field_77994_a

            // Если предмет полностью сломался — возвращаем null (исчезает)
            if (cStack.getMetadata() >= cStack.getMaxDurability()) {
                return null;
            }
        }
        return cStack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par2) {
        return EnumRarity.common;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add("Minicio -> Accio");
        if (ConfigMain.INFUSION_DURABILITY) {
            // Отображение прочности: (Макс - Текущий) / Макс
            int maxDur = stack.getMaxDurability(); // func_77958_k
            int currentDur = maxDur - stack.getMetadata(); // func_77960_j
            list.add("Durability: " + currentDur + "/" + maxDur);
        }
    }
}