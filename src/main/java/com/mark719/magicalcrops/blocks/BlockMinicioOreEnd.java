package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.handlers.Essence;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockMinicioOreEnd extends Block {

    public BlockMinicioOreEnd() {
        // Material.rock -> Material.rock
        super(Material.rock);

        // Установка текстуры руды для Энда
        this.setTextureName("magicalcrops:EssenceOreEnd");

        // Вкладка в креативе
        this.setCreativeTab(MagicalCrops.tabMagical);

        // Звук камня
        this.setStepSound(soundTypeStone);

        // Характеристики блока
        this.setHardness(3.0F);
        this.setResistance(5.0F);

        // Уровень добычи: 2 (Железная кирка)
        this.setHarvestLevel("pickaxe", 2);

        // Внутреннее имя
        this.setUnlocalizedName("minicioOreEnd");
    }

    /**
     * Что выпадает при разрушении
     */
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Essence.MinicioEssence;
    }

    /**
     * Количество выпадаемых предметов
     * В Энде падает 8 штук (в обычном мире было 4)
     */
    @Override
    public int quantityDropped(Random random) {
        return 8;
    }

    /**
     * Можно ли использовать шелковое касание
     * В оригинальном коде (func_149700_E) стоит false
     */
    @Override
    protected boolean canSilkHarvest() {
        return false;
    }
}