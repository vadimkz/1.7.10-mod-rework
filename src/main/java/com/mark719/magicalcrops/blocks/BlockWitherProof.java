package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.MagicalCrops;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Блок, устойчивый к Иссушителю и взрывам.
 * Используется для создания арен для битв с боссами или защиты базы.
 */
public class BlockWitherProof extends Block {

    public BlockWitherProof() {
        // Material.rock (камень)
        super(Material.rock);

        // Установка текстуры
        this.setTextureName("magicalcrops:wither_block");

        // Вкладка в креатив-меню
        this.setCreativeTab(MagicalCrops.tabMagical);

        // Звук шагов (камень)
        this.setStepSound(soundTypeStone);

        // Скорость копания (2.0) — как у обычного камня или железного блока
        this.setHardness(2.0F);

        // Сопротивление взрыву (2000.0) — очень высокое (у обсидиана 2000.0)
        this.setResistance(2000.0F);

        // Внутреннее имя
        this.setUnlocalizedName("witherProofBlock");
    }

    /**
     * Запрещает мобам (включая Иссушителя) уничтожать этот блок.
     * Именно этот метод делает его "Wither Proof".
     */
    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
        return false;
    }

    /**
     * Вызывается, когда блок должен быть уничтожен взрывом.
     * Метод оставлен пустым, чтобы взрыв ничего не делал с блоком.
     */
    @Override
    public void onBlockExploded(World world, int x, int y, int z, Explosion explosion) {
        // Ничего не происходит
    }

    /**
     * Проверяет, может ли взрыв повредить блок.
     * Возвращает false, делая блок абсолютно невосприимчивым к детонации.
     */
    @Override
    public boolean canDropFromExplosion(Explosion explosion) {
        return false;
    }
}