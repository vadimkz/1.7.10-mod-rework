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

public class BlockFarmlandImperio extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon iconDry;

    @SideOnly(Side.CLIENT)
    private IIcon iconWet;

    private static final String __OBFID = "CL_00000241";

    public BlockFarmlandImperio() {
        super(Material.ground);
        setTickRandomly(true);
        setTextureName("magicalcrops:farmland_");
        setUnlocalizedName("ImperioFarmland");
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
        setLightOpacity(255);
        setHardness(0.6F);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World worldIn, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox((x + 0), (y + 0), (z + 0), (x + 1), (y + 1), (z + 1));
    }


    public boolean isOpaqueCube() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return (side == 1) ? ((meta > 0) ? this.iconDry : this.iconWet) : Blocks.dirt.getBlockTextureFromSide(side);
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!getIsCritical(world, x, y, z) && !world.isRainingAt(x, y + 1, z)) {
            int l = world.getBlockMetadata(x, y, z);
            if (l > 0)
                world.setBlockMetadataWithNotify(x, y, z, l - 1, 2);
        } else {
            world.setBlockMetadataWithNotify(x, y, z, 7, 2);
        }
    }

    public void onFallenUpon(World worldIn, int x, int y, int z, Entity entityIn, float fallDistance) {}

    private boolean hasWater(World world, int x, int y, int z) {
        byte b0 = 0;
        for (int l = x - b0; l <= x + b0; l++) {
            for (int i1 = z - b0; i1 <= z + b0; i1++) {
                Block block = world.getBlock(l, y + 1, i1);
                if (block instanceof IPlantable && canSustainPlant((IBlockAccess)world, x, y, z, ForgeDirection.UP, (IPlantable)block))
                    return true;
            }
        }
        return false;
    }

    private boolean getIsCritical(World world, int x, int y, int z) {
        for (int l = x - 4; l <= x + 4; l++) {
            for (int i1 = y; i1 <= y + 1; i1++) {
                for (int j1 = z - 4; j1 <= z + 4; j1++) {
                    if (world.getBlock(l, i1, j1).getMaterial() == Material.water)
                        return true;
                }
            }
        }
        return false;
    }

    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
        return true;
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighbor) {}

    public Item getItemDropped(int meta, Random random, int fortune) {
        return Blocks.dirt.getItemDropped(0, random, fortune);
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(Blocks.dirt);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.iconDry = iconRegister.registerIcon(getTextureName() + "wet_imperio");
        this.iconWet = iconRegister.registerIcon(getTextureName() + "dry_imperio");
    }
}
