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

public class ItemInfusionStone2Regular extends Item {

    public ItemInfusionStone2Regular() {
        super();
        this.maxStackSize = 1; // field_77777_bU
        this.setMaxDamage(ConfigMain.REGULAR_DURABILITY); // Метод, который пока пропускаем
        this.setCreativeTab(MagicalCrops.tabMagical); // setCreativeTab
        this.setTextureName("magicalcrops:InfusionStone_T2"); // setTextureName
        this.setUnlocalizedName("InfusionStoneRegular"); // setUnlocalizedName
        this.canRepair = false;
        this.bFull3D = true; // field_77787_bX
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
        // Создаем копию предмета для возврата в сетку крафта
        ItemStack cStack = itemStack.copy(); // copy

        if (ConfigMain.INFUSION_DURABILITY) {
            // Увеличиваем урон (Metadata) на 1
            int newDamage = cStack.getItemDamage() + 1; // getItemDamage
            cStack.setItemDamage(newDamage); // setItemDamage
            cStack.stackSize = 1; // stackSize

            // Если предмет полностью сломался — возвращаем null (исчезает)
            if (cStack.getItemDamage() >= cStack.getMaxDamage()) {
                return null;
            }
        }
        return cStack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par2) {
        return EnumRarity.uncommon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add("Accio -> Crucio");
        if (ConfigMain.INFUSION_DURABILITY) {
            // Отображение прочности: (Макс - Текущий) / Макс
            int maxDur = stack.getMaxDamage(); // getMaxDamage
            int currentDur = maxDur - stack.getItemDamage(); // getItemDamage
            list.add("Durability: " + currentDur + "/" + maxDur);
        }
    }
}