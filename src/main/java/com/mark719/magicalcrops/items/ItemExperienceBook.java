package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.MagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class ItemExperienceBook extends Item {

    public static final String[] subNames = new String[] { "level1", "level2", "level3", "level4", "level5" };
    public static final String[] iconNames = new String[] { "experience_book", "experience_book_accio", "experience_book_crucio", "experience_book_imperio", "experience_book_zivicio" };

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ItemExperienceBook() {
        this.setHasSubtypes(true);
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        // Заменяем func_77960_j() на getItemDamage() или getMetadata()
        int meta = stack.getMetadata();
        switch (meta) {
            case 1: return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
            case 2: return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
            case 3: return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
            case 4: return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
            default: return EnumChatFormatting.WHITE + super.getItemStackDisplayName(stack);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage) {
        int j = MathHelper.clamp_int(damage, 0, 4);
        return this.icons[j];
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        int i = MathHelper.clamp_int(stack.getMetadata(), 0, 4);
        return super.getUnlocalizedName() + "." + subNames[i];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < 5; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        int meta = stack.getMetadata();
        list.add("Level " + (meta + 1));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.icons = new IIcon[iconNames.length];
        for (int i = 0; i < iconNames.length; i++) {
            this.icons[i] = iconRegister.registerIcon("magicalcrops:" + iconNames[i]);
        }
    }
}