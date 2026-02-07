package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.handlers.Essence;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockMinicioOre extends Block {

    public BlockMinicioOre() {
        // Material.rock — это Material.rock (камень)
        super(Material.rock);

        // func_149658_d — это setTextureName
        this.setTextureName("magicalcrops:EssenceOre");

        // setCreativeTab — это setCreativeTab
        this.setCreativeTab(MagicalCrops.tabMagical);

        // func_149672_a(field_149780_i) — это setStepSound(soundTypeStone)
        this.setStepSound(soundTypeStone);

        // func_149711_c — это setHardness (прочность)
        this.setHardness(3.0F);

        // func_149752_b — это setResistance (сопротивление взрыву)
        this.setResistance(5.0F);

        // Уровень добычи: железная кирка (2)
        this.setHarvestLevel("pickaxe", 2);

        // Не забудь добавить имя, чтобы блок не назывался tile.null
        this.setUnlocalizedName("minicioOre");
    }

    /**
     * func_149650_a — это getItemDropped
     * Определяет, какой предмет выпадет при разрушении блока
     */
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Essence.MinicioEssence;
    }

    /**
     * func_149745_a — это quantityDropped
     * Определяет количество выпадаемых предметов
     */
    @Override
    public int quantityDropped(Random random) {
        return 4;
    }

    /**
     * func_149700_E — это canSilkHarvest
     * Позволяет ли блок добычу шелковым касанием
     */
    @Override
    protected boolean canSilkHarvest() {
        return true;
    }
}