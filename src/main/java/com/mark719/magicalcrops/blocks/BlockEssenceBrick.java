package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.handlers.MBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

/**
 * Класс кирпичей из эссенции. 
 * Содержит 8 вариантов текстур, переключаемых через метаданные (metadata).
 */
public class BlockEssenceBrick extends Block {

    @SideOnly(Side.CLIENT)
    protected IIcon[] icons;

    public static String textureName = "magicalcrops:";

    public BlockEssenceBrick(Material material) {
        super(material);
        this.icons = new IIcon[8];

        this.setCreativeTab(MagicalCrops.tabMagical); // Установка вкладки в креативе
        this.setHardness(2.0F); // Прочность
        this.setResistance(10.0F); // Сопротивление взрыву
        this.setLightLevel(1.0F); // Светимость
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.icons[0] = iconRegister.registerIcon(textureName + "block_essence_brick_coal");
        this.icons[1] = iconRegister.registerIcon(textureName + "block_essence_brick_earth");
        this.icons[2] = iconRegister.registerIcon(textureName + "block_essence_brick_emerald");
        this.icons[3] = iconRegister.registerIcon(textureName + "block_essence_brick_fire");
        this.icons[4] = iconRegister.registerIcon(textureName + "block_essence_brick_gold");
        this.icons[5] = iconRegister.registerIcon(textureName + "block_essence_brick_lapis");
        this.icons[6] = iconRegister.registerIcon(textureName + "block_essence_brick_obsidian");
        this.icons[7] = iconRegister.registerIcon(textureName + "block_essence_brick_redstone");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        // Добавляем все 8 вариантов кирпичей во вкладку креатива
        for (int i = 0; i < 8; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        // Предотвращаем выход за границы массива, если метаданные некорректны
        if (meta < 0 || meta >= icons.length) {
            meta = 0;
        }
        return this.icons[meta];
    }

    @Override
    public int damageDropped(int meta) {
        // Чтобы при ломании блока выпадал кирпич с той же метой
        return meta;
    }
}