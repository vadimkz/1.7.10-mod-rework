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

public class ItemInfusionStone4Extreme extends Item {

    public ItemInfusionStone4Extreme() {
        super();
        this.maxStackSize = 1; // field_77777_bU
        this.setMaxDamage(ConfigMain.EXTREME_DURABILITY); // setMaxDamage
        this.setCreativeTab(MagicalCrops.tabMagical); // setCreativeTab
        this.setTextureName("magicalcrops:InfusionStone_T4"); // setTextureName
        this.setUnlocalizedName("InfusionStoneExtreme"); // setUnlocalizedName
        this.canRepair = false;
        this.bFull3D = true; // field_77787_bX
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
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
        ItemStack cStack = itemStack.copy();

        if (ConfigMain.INFUSION_DURABILITY) {
            int newDamage = cStack.getItemDamage() + 1;
            cStack.setItemDamage(newDamage);
            cStack.stackSize = 1;

            if (cStack.getItemDamage() >= cStack.getMaxDamage()) {
                return null;
            }
        }
        return cStack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par2) {
        return EnumRarity.epic;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add("Imperio -> Zivicio");
        if (ConfigMain.INFUSION_DURABILITY) {
            int maxDur = stack.getMaxDamage();
            int currentDur = maxDur - stack.getItemDamage();
            list.add("Durability: " + currentDur + "/" + maxDur);
        }
    }
}
