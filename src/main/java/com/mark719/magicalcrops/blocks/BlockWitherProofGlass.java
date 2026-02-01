package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.MagicalCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Прозрачное стекло, устойчивое к Иссушителю и взрывам.
 * В отличие от обычного стекла, оно выпадает при разрушении.
 */
public class BlockWitherProofGlass extends BlockGlass {

    public BlockWitherProofGlass() {
        // Material.glass, false указывает на то, что это не обычное стекло (не ломается сразу)
        super(Material.glass, false);

        // Установка вкладки в креативе
        this.setCreativeTab(MagicalCrops.tabMagical);

        // Твердость 2.0 и сопротивление 2000.0 (как у Wither Proof Block)
        this.setHardness(2.0F);
        this.setResistance(2000.0F);
    }

    /**
     * Защита от разрушения сущностями (Иссушителем).
     */
    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
        return false;
    }

    /**
     * Защита от взрыва.
     */
    @Override
    public void onBlockExploded(World world, int x, int y, int z, Explosion explosion) {
        // Блок игнорирует попытку подрыва
    }

    /**
     * Запрет на разрушение дропа при взрыве.
     */
    @Override
    public boolean canDropFromExplosion(Explosion explosion) {
        return false;
    }

    /**
     * Количество выпадаемых предметов при поломке.
     * Возвращает 1, что позволяет забирать стекло обратно без чар.
     */
    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    /**
     * Слой рендеринга (прозрачность).
     */
    @SideOnly(Side.CLIENT)
    @Override
    public int getRenderBlockPass() {
        return 1;
    }

    /**
     * Является ли блок полным кубом (для оптимизации рендера).
     */
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    /**
     * Нужно ли отрисовывать смежные стороны (false для прозрачных блоков).
     */
    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    /**
     * Регистрация иконки (текстуры).
     */
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("magicalcrops:wither_glass");
    }
}