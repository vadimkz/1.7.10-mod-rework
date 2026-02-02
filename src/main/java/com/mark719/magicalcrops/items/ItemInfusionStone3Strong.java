package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.config.ConfigMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemInfusionStone3Strong extends Item {

    private final int durability = ConfigMain.STRONG_DURABILITY;

    public ItemInfusionStone3Strong() {
        this.maxStackSize = 1;
        this.setMaxDurability(this.durability);              // func_77656_e
        this.setCreativeTab(MagicalCrops.tabMagical);    // func_77637_a
        this.setTextureName("magicalcrops:InfusionStone_T3"); // func_111206_d
        this.setUnlocalizedName("InfusionStoneStrong");  // func_77655_b
        this.canRepair = false;
        this.setHasSubtypes(true);                       // field_77787_bX
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return false;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack cStack = itemStack.copy();

        if (ConfigMain.INFUSION_DURABILITY) {
            cStack.setMetadata(cStack.getMetadata() + 1); // func_77964_b / func_77960_j
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
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
        list.add("Crucio -> Imperio");

        if (ConfigMain.INFUSION_DURABILITY) {
            int max = stack.getMaxDurability();   // func_77958_k
            int used = stack.getMetadata();       // func_77960_j
            list.add("Durability: " + (max - used) + "/" + max);
        }
    }
}
