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

public class ImperioFurnace extends BlockContainer {
    @SideOnly(Side.CLIENT)
    private IIcon iconTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    private static boolean isUpdating;
    private final boolean isActive;
    private final Random random = new Random();

    public ImperioFurnace(boolean isActive) {
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
        this.blockIcon = iconRegister.registerIcon("magicalcrops:furnaceimperio_side");
        this.iconFront = iconRegister.registerIcon(this.isActive ? "magicalcrops:furnaceimperio_front_on" : "magicalcrops:furnaceimperio_front_off");
        this.iconTop = iconRegister.registerIcon("magicalcrops:furnaceimperio_top");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            player.openGui(MagicalCrops.instance, 3, world, x, y, z);
        }
        return true;
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return Item.getItemFromBlock(MBlocks.ImperioFurnace);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(MBlocks.ImperioFurnace);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityImperioFurnace();
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
            if (tile instanceof TileEntityImperioFurnace) {
                // FIX 1: func_145951_a -> func_145951_a (Если IDEA ругается, значит в TileEntityImperioFurnace метод должен называться func_145951_a или вы его не создали)
                // Но в стандартной печке 1.7.10 этот метод называется func_145951_a (или 'func_145951_a' в SRG)
                // Если TileEntity его не видит, проверьте само наличие метода в TileEntityImperioFurnace.
                ((TileEntityImperioFurnace)tile).func_145951_a(stack.getDisplayName());
            }
        }
    }

    public static void updateBlockState(boolean active, World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        isUpdating = true;

        if (active) {
            world.setBlock(x, y, z, MBlocks.ImperioFurnaceActive);
        } else {
            world.setBlock(x, y, z, MBlocks.ImperioFurnace);
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
            if (tile instanceof TileEntityImperioFurnace) {
                TileEntityImperioFurnace inv = (TileEntityImperioFurnace) tile;
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

                            // FIX 2: getItemDamage() -> В 1.7.10 ItemStack.getItemDamage() существует.
                            // Если IDEA его не видит, значит используется старый Forge/MCP. Попробуйте getMetadata() или просто напрямую .itemDamage
                            EntityItem entityitem = new EntityItem(world, (double)(x + f), (double)(y + f1), (double)(z + f2),
                                    new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));

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
                // FIX 3: func_147453_f -> func_147453_f (Это обновление силы сигнала компаратора)
                // В чистом MCP 1.7.10 это: func_147453_f
                world.func_147453_f(x, y, z, block);
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