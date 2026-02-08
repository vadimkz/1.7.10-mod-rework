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

public class BlockFarmlandAccio extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon iconWet;
    @SideOnly(Side.CLIENT)
    private IIcon iconDry;

    public BlockFarmlandAccio() {
        super(Material.ground); // Вместо ground
        this.setTickRandomly(true);
        this.setBlockTextureName("magicalcrops:farmland_");
        this.setBlockName("AccioFarmland");
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
        this.setLightOpacity(255);
        this.setHardness(0.6F);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + 1, z + 1);
    }

    @Override
    public boolean isOpaqueCube() { return false; }

    @Override
    public boolean renderAsNormalBlock() { return false; }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        // 1 - это верхняя сторона блока
        return (side == 1) ? this.iconWet : Blocks.dirt.getIcon(side, 0);
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        // Принудительно держим влажность на максимуме (7)
        if (world.getBlockMetadata(x, y, z) < 7) {
            world.setBlockMetadataWithNotify(x, y, z, 7, 2);
        }
    }

    @Override
    public void onFallenUpon(World world, int x, int y, int z, Entity entity, float fall) {
        // Защита от затаптывания (пустой метод)
    }

    @Override
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
        return true;
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return Item.getItemFromBlock(Blocks.dirt);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister reg) {
        this.iconWet = reg.registerIcon(this.getTextureName() + "wet_accio");
        this.iconDry = reg.registerIcon(this.getTextureName() + "dry_accio");
    }
}