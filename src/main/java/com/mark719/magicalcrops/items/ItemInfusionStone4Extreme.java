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

public class ItemInfusionStone4Extreme extends Item {

    private final int durability = ConfigMain.EXTREME_DURABILITY;

    public ItemInfusionStone4Extreme() {
        this.maxStackSize = 1;
        this.setMaxDurability(this.durability);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:InfusionStone_T4");
        this.setUnlocalizedName("InfusionStoneExtreme");
        this.canRepair = false;
        this.setHasSubtypes(true);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return false;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack cStack = itemStack.copy();

        if (ConfigMain.INFUSION_DURABILITY) {
            cStack.setMetadata(cStack.getMetadata() + 1);
            cStack.stackSize = 1;
        }

        return cStack;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.epic;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
        list.add("Imperio -> Zivicio");
        if (ConfigMain.INFUSION_DURABILITY) {
            int max = stack.getMaxDurability();
            int used = stack.getMetadata();
            list.add("Durability: " + (max - used) + "/" + max);
        }
    }
}
