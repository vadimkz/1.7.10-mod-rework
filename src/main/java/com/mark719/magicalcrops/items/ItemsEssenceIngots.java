package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.MagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

/**
 * Класс для слитков эссенции (Accio, Crucio, Imperio, Zivicio).
 * Использует метадату (damage) для разделения типов слитков.
 */
public class ItemsEssenceIngots extends Item {

    // Внутренние имена для регистрации и локализации
    public static final String[] names = new String[] { "accio", "crucio", "imperio", "zivicio" };

    // Пути к текстурам
    public static final String[] textureNames = new String[] { "ingot_accio", "ingot_crucio", "ingot_imperio", "ingot_zivicio" };

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ItemsEssenceIngots() {
        super();
        this.setHasSubtypes(true); // Разрешаем метадату (подтипы)
        this.setMaxDurability(0);  // Слитки не ломаются
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

    /**
     * Изменяет цвет названия предмета в зависимости от тира (уровня).
     */
    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        String name = super.getItemStackDisplayName(stack);
        int meta = stack.getMetadata();
        if (meta == 0) {
            return EnumChatFormatting.GOLD + name;          // Accio
        } else if (meta == 1) {
            return EnumChatFormatting.YELLOW + name;        // Crucio
        } else if (meta == 2) {
            return EnumChatFormatting.AQUA + name;          // Imperio
        } else if (meta == 3) {
            return EnumChatFormatting.LIGHT_PURPLE + name;  // Zivicio
        }
        return EnumChatFormatting.GRAY + name;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta) {
        int index = MathHelper.clamp_int(meta, 0, names.length - 1);
        return this.icons[index];
    }

    /**
     * Генерирует уникальное имя для перевода (например, item.magicalcrops.ingot.accio)
     */
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        int meta = MathHelper.clamp_int(stack.getMetadata(), 0, names.length - 1);
        return super.getUnlocalizedName() + "." + names[meta];
    }

    /**
     * Добавляет все 4 слитка в творческую вкладку.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < names.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    /**
     * Регистрация текстур для всех типов слитков.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.icons = new IIcon[textureNames.length];
        for (int i = 0; i < textureNames.length; i++) {
            this.icons[i] = iconRegister.registerIcon("magicalcrops:" + textureNames[i]);
        }
    }
}
