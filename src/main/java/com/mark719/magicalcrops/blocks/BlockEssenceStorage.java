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
 * Класс блока для хранения эссенций.
 * Текстуры и дроп зависят от метаданных (0-5).
 */
public class BlockEssenceStorage extends Block {

    @SideOnly(Side.CLIENT)
    private IIcon[] icon;

    public static String textureName = "magicalcrops:";

    public BlockEssenceStorage(Material material) {
        super(material);
        this.icon = new IIcon[6];

        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setUnlocalizedName("essence_storage");
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.icon[0] = iconRegister.registerIcon(textureName + "dust_block_minicio");
        this.icon[1] = iconRegister.registerIcon(textureName + "dust_block_accio");
        this.icon[2] = iconRegister.registerIcon(textureName + "dust_block_crucio");
        this.icon[3] = iconRegister.registerIcon(textureName + "dust_block_imperio");
        this.icon[4] = iconRegister.registerIcon(textureName + "dust_block_zivicio");
        this.icon[5] = iconRegister.registerIcon(textureName + "dust_block_zivicio_extra");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        // Возвращаем использование MBlocks.EssenceStorage, чтобы импорт не был серым
        for (int i = 0; i < 6; i++) {
            list.add(new ItemStack(MBlocks.EssenceStorage, 1, i));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta < 0 || meta >= this.icon.length) {
            meta = 0;
        }
        return this.icon[meta];
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }
}