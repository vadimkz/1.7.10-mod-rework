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

public class BlockEssenceLamp extends Block {

    @SideOnly(Side.CLIENT)
    protected IIcon[] icon;

    public static String textureName = "magicalcrops:";

    public BlockEssenceLamp(Material material) {
        super(material);
        this.icon = new IIcon[8];

        // Настройки блока ( func_149... -> понятные названия )
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setLightLevel(1.0F); // Лампы светятся на максимум
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.icon[0] = par1IconRegister.registerIcon(textureName + "EssLamp_coal");
        this.icon[1] = par1IconRegister.registerIcon(textureName + "EssLamp_brown");
        this.icon[2] = par1IconRegister.registerIcon(textureName + "EssLamp_emerald");
        this.icon[3] = par1IconRegister.registerIcon(textureName + "EssLamp_blaze");
        this.icon[4] = par1IconRegister.registerIcon(textureName + "EssLamp_glowstone");
        this.icon[5] = par1IconRegister.registerIcon(textureName + "EssLamp_lapis");
        this.icon[6] = par1IconRegister.registerIcon(textureName + "EssLamp_obsidian");
        this.icon[7] = par1IconRegister.registerIcon(textureName + "EssLamp_redstone");
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < 8; i++) {
            list.add(new ItemStack(MBlocks.EssenceLamp, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta < 0 || meta >= this.icon.length) {
            meta = 0;
        }
        return this.icon[meta];
    }

    public int damageDropped(int meta) {
        return meta;
    }
}