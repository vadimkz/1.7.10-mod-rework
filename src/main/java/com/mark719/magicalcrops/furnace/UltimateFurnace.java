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
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class UltimateFurnace extends BlockContainer {
    @SideOnly(Side.CLIENT)
    private IIcon iconTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconFront;
    private static boolean isBurning;
    private final boolean isBurning2;
    private final Random random = new Random();

    public UltimateFurnace(boolean isActive) {
        super(Material.rock);
        this.isBurning2 = isActive;
        this.setHardness(3.0F);
        this.setResistance(2000.0F);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        if (meta == 0 && side == 3) {
            return this.iconFront;
        }
        return (side == 1 || side == 0) ? this.iconTop : ((side != meta) ? this.blockIcon : this.iconFront);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("magicalcrops:furnaceultimate_side");
        this.iconFront = iconRegister.registerIcon(this.isBurning2 ? "magicalcrops:furnaceultimate_front_on" : "magicalcrops:furnaceultimate_front_off");
        this.iconTop = iconRegister.registerIcon("magicalcrops:furnaceultimate_top");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        player.openGui(MagicalCrops.instance, 5, world, x, y, z);
        return true;
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par3) {
        return Item.getItemFromBlock(MBlocks.UltimateFurnace);
    }

    @Override
    public Item getItem(World world, int par2, int par3, int par4) {
        return Item.getItemFromBlock(MBlocks.UltimateFurnace);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityUltimateFurnace();
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        setDefaultDirection(world, x, y, z);
    }

    private void setDefaultDirection(World world, int x, int y, int z) {
        if (!world.isRemote) {
            Block block = world.getBlock(x, y, z - 1);
            Block block1 = world.getBlock(x, y, z + 1);
            Block block2 = world.getBlock(x - 1, y, z);
            Block block3 = world.getBlock(x + 1, y, z);
            byte b0 = 3;

            if (block.isFullBlock() && !block1.isFullBlock()) {
                b0 = 3;
            }
            if (block1.isFullBlock() && !block.isFullBlock()) {
                b0 = 2;
            }
            if (block2.isFullBlock() && !block3.isFullBlock()) {
                b0 = 5;
            }
            if (block3.isFullBlock() && !block2.isFullBlock()) {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
        }
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
        int l = MathHelper.floor_double((player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 0x3;

        if (l == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if (l == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if (l == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if (l == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        if (stack.hasDisplayName()) {
            TileEntity tile = world.getTileEntity(x, y, z);
            if (tile instanceof TileEntityFurnace) {
                ((TileEntityFurnace) tile).setCustomInventoryName(stack.getDisplayName());
            }
        }
    }

    public static void updateBlockState(boolean isActive, World world, int x, int y, int z) {
        int l = world.getBlockMetadata(x, y, z);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        isBurning = true;

        if (isActive) {
            world.setBlock(x, y, z, MBlocks.UltimateFurnaceActive);
        } else {
            world.setBlock(x, y, z, MBlocks.UltimateFurnace);
        }

        isBurning = false;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);

        if (tileentity != null) {
            tileentity.validate();
            world.setTileEntity(x, y, z, tileentity);
        }
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
        if (!isBurning) {
            TileEntityUltimateFurnace tile = (TileEntityUltimateFurnace) world.getTileEntity(x, y, z);

            if (tile != null) {
                for (int i = 0; i < tile.getSizeInventory(); i++) {
                    ItemStack itemstack = tile.getStackInSlot(i);

                    if (itemstack != null) {
                        float f = this.random.nextFloat() * 0.6F + 0.1F;
                        float f1 = this.random.nextFloat() * 0.6F + 0.1F;
                        float f2 = this.random.nextFloat() * 0.6F + 0.1F;

                        while (itemstack.stackSize > 0) {
                            int j = this.random.nextInt(21) + 10;

                            if (j > itemstack.stackSize) {
                                j = itemstack.stackSize;
                            }

                            itemstack.stackSize -= j;
                            EntityItem entityitem = new EntityItem(world, (x + f), (y + f1), (z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getMetadata()));

                            if (itemstack.hasTagCompound()) {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound) itemstack.getTagCompound().copy());
                            }

                            float f3 = 0.025F;
                            entityitem.motionX = (this.random.nextGaussian() * f3);
                            entityitem.motionY = (this.random.nextGaussian() * f3 + 0.1F);
                            entityitem.motionZ = (this.random.nextGaussian() * f3);
                            world.spawnEntityInWorld(entityitem);
                        }
                    }
                }
                world.updateComparatorOutputLevel(x, y, z, block);
            }
        }
        super.breakBlock(world, x, y, z, block, meta);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void randomDisplayTick(World world, int x, int y, int z, Random random) {
        if (this.isBurning2) {
            int l = world.getBlockMetadata(x, y, z);
            float f = x + 0.5F;
            float f1 = y + 0.0F + random.nextFloat() * 6.0F / 16.0F;
            float f2 = z + 0.5F;
            float f3 = 0.52F;
            float f4 = random.nextFloat() * 0.6F - 0.3F;

            if (l == 4) {
                world.spawnParticle("smoke", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
            } else if (l == 5) {
                world.spawnParticle("smoke", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
            } else if (l == 2) {
                world.spawnParticle("smoke", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
            } else if (l == 3) {
                world.spawnParticle("smoke", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
            }
        }
    }
}
