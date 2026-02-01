package com.mark719.magicalcrops.furnace;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.handlers.MBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class CrucioFurnace extends BlockContainer {
    @SideOnly(Side.CLIENT)
    private IIcon iconTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    private static boolean isUpdating;
    private final boolean isActive;
    private final Random random = new Random();

    public CrucioFurnace(boolean isActive) {
        super(Material.rock);
        this.isActive = isActive;
        this.setHardness(3.0F);
        this.setResistance(2000.0F);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        if (meta == 0 && side == 3) return this.iconFront;
        if (side == 1 || side == 0) return this.iconTop;
        return (side != meta) ? this.blockIcon : this.iconFront;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("magicalcrops:furnacecrucio_side");
        this.iconFront = iconRegister.registerIcon(this.isActive ? "magicalcrops:furnacecrucio_front_on" : "magicalcrops:furnacecrucio_front_off");
        this.iconTop = iconRegister.registerIcon("magicalcrops:furnacecrucio_top");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            player.openGui(MagicalCrops.instance, 2, world, x, y, z);
        }
        return true;
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return Item.getItemFromBlock(MBlocks.CrucioFurnace);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(MBlocks.CrucioFurnace);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityCrucioFurnace();
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        this.setDefaultDirection(world, x, y, z);
    }

    private void setDefaultDirection(World world, int x, int y, int z) {
        if (!world.isRemote) {
            Block bNorth = world.getBlock(x, y, z - 1);
            Block bSouth = world.getBlock(x, y, z + 1);
            Block bWest = world.getBlock(x - 1, y, z);
            Block bEast = world.getBlock(x + 1, y, z);
            byte facing = 3;

            if (bNorth.isFullBlock() && !bSouth.isFullBlock()) facing = 3;
            if (bSouth.isFullBlock() && !bNorth.isFullBlock()) facing = 2;
            if (bWest.isFullBlock() && !bEast.isFullBlock()) facing = 5;
            if (bEast.isFullBlock() && !bWest.isFullBlock()) facing = 4;

            world.setBlockMetadataWithNotify(x, y, z, facing, 2);
        }
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
        int l = MathHelper.floor_double((player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0) world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        if (l == 1) world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        if (l == 2) world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        if (l == 3) world.setBlockMetadataWithNotify(x, y, z, 4, 2);

        if (stack.hasDisplayName()) {
            TileEntity tile = world.getTileEntity(x, y, z);
            if (tile instanceof TileEntityCrucioFurnace) {
                // Пытаемся вызвать метод установки имени.
                // В зависимости от маппингов это может быть func_145951_a или setGuiDisplayName
                ((TileEntityCrucioFurnace)tile).setGuiDisplayName(stack.getDisplayName());
            }
        }
    }

    public static void updateBlockState(boolean active, World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        isUpdating = true;

        if (active) {
            world.setBlock(x, y, z, MBlocks.CrucioFurnaceActive);
        } else {
            world.setBlock(x, y, z, MBlocks.CrucioFurnace);
        }

        isUpdating = false;
        world.setBlockMetadataWithNotify(x, y, z, meta, 2);

        if (tileentity != null) {
            tileentity.validate();
            world.setTileEntity(x, y, z, tileentity);
        }
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
        if (!isUpdating) {
            TileEntity tile = world.getTileEntity(x, y, z);
            if (tile instanceof TileEntityCrucioFurnace) {
                TileEntityCrucioFurnace inv = (TileEntityCrucioFurnace) tile;
                for (int i = 0; i < inv.getSizeInventory(); i++) {
                    ItemStack itemstack = inv.getStackInSlot(i);
                    if (itemstack != null) {
                        float f = this.random.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.random.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.random.nextFloat() * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0) {
                            int j = this.random.nextInt(21) + 10;
                            if (j > itemstack.stackSize) j = itemstack.stackSize;
                            itemstack.stackSize -= j;

                            // Метод получения урона/метадаты предмета
                            EntityItem entityitem = new EntityItem(world, (double)(x + f), (double)(y + f1), (double)(z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound()) {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }

                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.random.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.random.nextGaussian() * f3);
                            world.spawnEntityInWorld(entityitem);
                        }
                    }
                }
                // Альтернатива func_147453_f
                world.updateNeighborsAboutBlockChange(x, y, z, block);
            }
        }
        super.breakBlock(world, x, y, z, block, meta);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void randomDisplayTick(World world, int x, int y, int z, Random random) {
        if (this.isActive) {
            int l = world.getBlockMetadata(x, y, z);
            float f = (float)x + 0.5F;
            float f1 = (float)y + 0.0F + random.nextFloat() * 6.0F / 16.0F;
            float f2 = (float)z + 0.5F;
            float f3 = 0.52F;
            float f4 = random.nextFloat() * 0.6F - 0.3F;

            if (l == 4) {
                world.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            } else if (l == 5) {
                world.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            } else if (l == 2) {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
            } else if (l == 3) {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
            }
        }
    }
}