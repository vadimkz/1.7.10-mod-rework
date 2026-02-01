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

public class BlockEssenceBrick2 extends Block {

    @SideOnly(Side.CLIENT)
    private IIcon[] icon;

    public static String textureName = "magicalcrops:";

    public BlockEssenceBrick2(Material material) {
        super(material);
        this.icon = new IIcon[8];

        // Установка параметров блока
        this.setCreativeTab(MagicalCrops.tabMagical); // func_149647_a
        this.setHardness(2.0F);                       // func_149711_c
        this.setResistance(10.0F);                    // func_149752_b
        this.setLightLevel(1.0F);                     // func_149715_a
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        // Регистрация текстур для 8 подтипов (метаданные 0-7)
        this.icon[0] = iconRegister.registerIcon(textureName + "EssBrick_coal");
        this.icon[1] = iconRegister.registerIcon(textureName + "EssBrick_earth");
        this.icon[2] = iconRegister.registerIcon(textureName + "EssBrick_emerald");
        this.icon[3] = iconRegister.registerIcon(textureName + "EssBrick_blaze");
        this.icon[4] = iconRegister.registerIcon(textureName + "EssBrick_glowstone");
        this.icon[5] = iconRegister.registerIcon(textureName + "EssBrick_lapis");
        this.icon[6] = iconRegister.registerIcon(textureName + "EssBrick_obsidian");
        this.icon[7] = iconRegister.registerIcon(textureName + "EssBrick_redstone");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        // Добавление всех 8 вариантов в креативную вкладку
        for (int i = 0; i < 8; i++) {
            list.add(new ItemStack(MBlocks.EssenceBrick2, 1, i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        // Защита от выхода за пределы массива
        if (meta < 0 || meta >= icon.length) {
            meta = 0;
        }
        return this.icon[meta];
    }

    @Override
    public int damageDropped(int meta) {
        // Чтобы при ломании выпадал блок с той же метой
        return meta;
    }
}