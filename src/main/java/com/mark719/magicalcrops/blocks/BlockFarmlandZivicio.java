package com.mark719.magicalcrops.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockFarmlandZivicio extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon iconWet;
    @SideOnly(Side.CLIENT)
    private IIcon iconDry;

    public BlockFarmlandZivicio() {
        // Используем Material.ground (земля)
        super(Material.ground);
        this.setTickRandomly(true);
        this.setUnlocalizedName("magicalcrops.ZivicioFarmland");
        // Высота грядки чуть ниже целого блока (15/16 пикселя)
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
        this.setLightOpacity(255);
        this.setHardness(0.6F);
        this.setStepSound(soundTypeGravel);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        // Коллизия полного блока, чтобы нельзя было провалиться
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
        // side == 1 — это верхняя грань
        if (side == 1) {
            return (meta == 7) ? this.iconWet : this.iconDry;
        }
        // Для боков и низа используем текстуру обычной земли
        return Blocks.dirt.getIcon(side, 0);
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        // Zivicio пашня всегда влажная (метадата 7)
        if (world.getBlockMetadata(x, y, z) < 7) {
            world.setBlockMetadataWithNotify(x, y, z, 7, 2);
        }
    }

    @Override
    public void onFallenUpon(World world, int x, int y, int z, Entity entity, float fall) {
        // Пустой метод предотвращает превращение грядки в землю при прыжках
    }

    @Override
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
        // Позволяет сажать любые культуры
        return true;
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        // При разрушении выпадает обычная земля
        return Item.getItemFromBlock(Blocks.dirt);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        // Регистрируем текстуры напрямую из папки assets/magicalcrops/textures/blocks/
        this.iconWet = reg.registerIcon("magicalcrops:farmland_wet_zivicio");
        this.iconDry = reg.registerIcon("magicalcrops:farmland_dry_zivicio");
    }
}