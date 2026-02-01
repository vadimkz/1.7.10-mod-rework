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

public class BlockEssenceBlock extends Block {

    @SideOnly(Side.CLIENT)
    protected IIcon[] icon;

    public static String textureName = "magicalcrops:";

    public BlockEssenceBlock(Material material) {
        super(material);
        this.icon = new IIcon[8];
        // Установка базовых свойств блока
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setLightLevel(1.0F);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        this.icon[0] = par1IconRegister.registerIcon(textureName + "block_essence_block_coal");
        this.icon[1] = par1IconRegister.registerIcon(textureName + "block_essence_block_earth");
        this.icon[2] = par1IconRegister.registerIcon(textureName + "block_essence_block_emerald");
        this.icon[3] = par1IconRegister.registerIcon(textureName + "block_essence_block_fire");
        this.icon[4] = par1IconRegister.registerIcon(textureName + "block_essence_block_gold");
        this.icon[5] = par1IconRegister.registerIcon(textureName + "block_essence_block_lapis");
        this.icon[6] = par1IconRegister.registerIcon(textureName + "block_essence_block_obsidian");
        this.icon[7] = par1IconRegister.registerIcon(textureName + "block_essence_block_redstone");
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < 8; i++) {
            // Возвращаем связь с MBlocks, как в оригинале
            list.add(new ItemStack(MBlocks.EssenceBlock, 1, i));
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