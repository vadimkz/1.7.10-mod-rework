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
 * Магическая грядка Accio — почищенная версия без дубликатов и крашей.
 */
public class BlockFarmlandAccio extends Block {

    @SideOnly(Side.CLIENT)
    private IIcon topIcon;

    @SideOnly(Side.CLIENT)
    private IIcon sideIcon;

    public BlockFarmlandAccio() {
        super(Material.ground);
        this.setTickRandomly(true);
        this.setUnlocalizedName("farmland_accio");

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
        this.setLightOpacity(255);
        this.setHardness(0.6F);
        this.setStepSound(soundTypeGrass);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
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

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 1) return this.topIcon;
        return this.sideIcon;
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        if (world.getBlockMetadata(x, y, z) < 7) {
            world.setBlockMetadataWithNotify(x, y, z, 7, 2);
        }
    }

    @Override
    public void onFallenUpon(World world, int x, int y, int z, net.minecraft.entity.Entity entity, float fall) {
        // Не превращается в землю
    }

    @Override
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
        return true;
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return Item.getItemFromBlock(Blocks.dirt);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        if (world.getBlock(x, y + 1, z).getMaterial().isSolid()) {
            world.setBlock(x, y, z, Blocks.dirt);
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.topIcon = reg.registerIcon("magicalcrops:farmland_wet_accio");
        this.sideIcon = reg.registerIcon("magicalcrops:farmland_dry_accio");
    }
}
