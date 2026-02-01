package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.handlers.Essence;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockMinicioOreNether extends Block {

    public BlockMinicioOreNether() {
        // Material.field_151576_e -> Material.rock (камень)
        super(Material.rock);

        // Установка пути к текстуре руды для Незера
        this.setTextureName("magicalcrops:EssenceOreNether");

        // Добавление во вкладку мода в креативе
        this.setCreativeTab(MagicalCrops.tabMagical);

        // Звук при ходьбе/ломании (камень)
        this.setStepSound(soundTypeStone);

        // Прочность (3.0) и сопротивление взрыву (5.0)
        this.setHardness(3.0F);
        this.setResistance(5.0F);

        // Настройка инструмента: железная кирка и выше
        this.setHarvestLevel("pickaxe", 2);

        // Внутреннее имя блока
        this.setUnlocalizedName("minicioOreNether");
    }

    /**
     * Предмет, который выпадает при разрушении
     */
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Essence.MinicioEssence;
    }

    /**
     * Количество выпадаемой эссенции. 
     * Для адской руды установлено значение 8.
     */
    @Override
    public int quantityDropped(Random random) {
        return 8;
    }

    /**
     * Запрет на добычу самого блока через "Шелковое касание"
     */
    @Override
    protected boolean canSilkHarvest() {
        return false;
    }
}