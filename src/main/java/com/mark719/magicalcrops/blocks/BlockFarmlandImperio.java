package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.handlers.MCrops;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
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

    public BlockFarmlandImperio() {
        super(Material.ground);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTickRandomly(true);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister reg) {
        this.iconDry = reg.registerIcon("magicalcrops:farmland_dry_imperio");
        this.iconWet = reg.registerIcon("magicalcrops:farmland_wet_imperio");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (side == 1) {
            return meta > 0 ? this.iconWet : this.iconDry;
        }
        return Blocks.dirt.getIcon(side, 0);
    }

    @Override
    public boolean canSustainPlant(
            IBlockAccess world, int x, int y, int z,
            ForgeDirection direction, IPlantable plant) {
        return true;
    }

    @Override
    public boolean isFertile(World world, int x, int y, int z) {
        return true;
    }

    @Override
    public void onFallenUpon(World world, int x, int y, int z,
                             Entity entity, float fallDistance) {
        // no trampling
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random rand) {

        if (!world.isRemote) {
            if (world.getBlockMetadata(x, y, z) != 7) {
                world.setBlockMetadataWithNotify(x, y, z, 7, 2);
            }
        }

        super.updateTick(world, x, y, z, rand);
    }

}
