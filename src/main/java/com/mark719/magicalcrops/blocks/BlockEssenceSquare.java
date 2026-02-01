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

public class BlockEssenceSquare extends Block {

    @SideOnly(Side.CLIENT)
    protected IIcon[] icon;

    public static String textureName = "magicalcrops:";

    public BlockEssenceSquare(Material material) {
        super(material);
        this.icon = new IIcon[8];
        // Установка параметров блока (ранее были func_ методы)
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setLightLevel(1.0F);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.icon[0] = iconRegister.registerIcon(textureName + "block_essence_qbrick_coal");
        this.icon[1] = iconRegister.registerIcon(textureName + "block_essence_qbrick_earth");
        this.icon[2] = iconRegister.registerIcon(textureName + "block_essence_qbrick_emerald");
        this.icon[3] = iconRegister.registerIcon(textureName + "block_essence_qbrick_fire");
        this.icon[4] = iconRegister.registerIcon(textureName + "block_essence_qbrick_gold");
        this.icon[5] = iconRegister.registerIcon(textureName + "block_essence_qbrick_lapis");
        this.icon[6] = iconRegister.registerIcon(textureName + "block_essence_qbrick_obsidian");
        this.icon[7] = iconRegister.registerIcon(textureName + "block_essence_qbrick_redstone");
    }

    @Override
    @SideOnly(Side.CLIENT)
    @SuppressWarnings("unchecked")
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        // Это бывший func_149666_a. Используем MBlocks.EssenceSquare как в оригинале.
        for (int i = 0; i < 8; i++) {
            list.add(new ItemStack(MBlocks.EssenceSquare, 1, i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta < 0 || meta >= 8) {
            meta = 0;
        }
        return this.icon[meta];
    }

    @Override
    public int damageDropped(int meta) {
        // Это бывший func_149692_a
        return meta;
    }
}