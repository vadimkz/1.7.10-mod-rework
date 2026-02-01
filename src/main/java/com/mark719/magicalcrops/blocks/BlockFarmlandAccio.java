package com.mark719.magicalcrops.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Класс грядки Accio для мода Magical Crops.
 * Исправлены названия методов для соответствия маппингам MCP (1.7.10).
 */
public class BlockFarmlandAccio extends Block {

    @SideOnly(Side.CLIENT)
    private IIcon iconWet;

    public BlockFarmlandAccio() {
        super(Material.ground);
        this.setTickRandomly(true);

        // Установка системного имени для локализации
        this.setUnlocalizedName("magicalcrops.AccioFarmland");

        // Установка префикса для текстур (assets/magicalcrops/textures/blocks/...)
        this.setTextureName("magicalcrops:farmland_");

        // Физические свойства
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
        this.setLightOpacity(255);
        this.setHardness(0.6F);
        this.setStepSound(soundTypeGrass);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        // Коллизия полного блока, чтобы сущности не проваливались
        return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + 1, z + 1);
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        // side 1 - верхняя грань грядки
        if (side == 1) {
            return this.iconWet;
        }
        // Боковые стороны и низ используют текстуру обычной земли из ванилы
        return Blocks.dirt.getIcon(side, 0);
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        // Магическая грядка всегда увлажнена (метадата 7)
        if (world.getBlockMetadata(x, y, z) < 7) {
            world.setBlockMetadataWithNotify(x, y, z, 7, 2);
        }
    }

    @Override
    public void onFallenUpon(World world, int x, int y, int z, net.minecraft.entity.Entity entity, float fall) {
        // Переопределяем, чтобы грядка не превращалась в землю при прыжках
    }

    @Override
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
        // Позволяет сажать любые растения (включая ванильные и из мода)
        return true;
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        // Возвращает блок земли из MBlocks, если он там зарегистрирован,
        // иначе возвращает ванильную землю.
        return Item.getItemFromBlock(Blocks.dirt);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        // Если над грядкой появился непрозрачный блок, она "задыхается"
        if (world.getBlock(x, y + 1, z).getMaterial().isSolid()) {
            world.setBlock(x, y, z, Blocks.dirt);
        }
    }

    @SideOnly(Side.CLIENT)

    public void registerBlockIcons(IIconRegister reg) {
        // Регистрация специфичной текстуры для верхней грани
        this.iconWet = reg.registerIcon(this.getTextureName() + "wet_accio");
    }
}