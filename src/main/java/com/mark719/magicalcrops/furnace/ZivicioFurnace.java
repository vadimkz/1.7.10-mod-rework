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
import net.minecraft.entity.Entity;
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

/**
 * Класс блока Zivicio Furnace (Печь из Дивизия).
 * Обрабатывает состояния включения/выключения, текстуры и поведение в мире.
 */
public class ZivicioFurnace extends BlockContainer {

    @SideOnly(Side.CLIENT)
    private IIcon iconTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    private static boolean isUpdatingState; // Флаг для предотвращения удаления TileEntity при смене блока
    private final boolean isBurningActive;
    private final Random random = new Random();

    public ZivicioFurnace(boolean isActive) {
        super(Material.rock);
        this.isBurningActive = isActive;
        this.setHardness(3.0F);
        this.setResistance(2000.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        // Если метаданные 0 (новое размещение), показываем переднюю панель на стороне 3
        if (meta == 0 && side == 3) return this.iconFront;

        // 1 - верх, 0 - низ
        if (side == 1 || side == 0) return this.iconTop;

        // Если сторона совпадает с направлением (метаданными), рисуем лицо печи
        return (side != meta) ? this.blockIcon : this.iconFront;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("magicalcrops:furnacezivicio_side");
        this.iconFront = iconRegister.registerIcon(this.isBurningActive ? "magicalcrops:furnacezivicio_front_on" : "magicalcrops:furnacezivicio_front_off");
        this.iconTop = iconRegister.registerIcon("magicalcrops:furnacezivicio_top");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            // ID GUI для печи Magical Crops обычно 4
            player.openGui(MagicalCrops.instance, 4, world, x, y, z);
        }
        return true;
    }

    @Override
    public Item getItemDropped(int meta, Random rand, int fortune) {
        return Item.getItemFromBlock(MBlocks.ZivicioFurnace);
    }

    @Override
    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(MBlocks.ZivicioFurnace);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityZivicioFurnace();
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
            byte meta = 3;

            if (bNorth.isFullBlock() && !bSouth.isFullBlock()) meta = 3;
            if (bSouth.isFullBlock() && !bNorth.isFullBlock()) meta = 2;
            if (bWest.isFullBlock() && !bEast.isFullBlock()) meta = 5;
            if (bEast.isFullBlock() && !bWest.isFullBlock()) meta = 4;

            world.setBlockMetadataWithNotify(x, y, z, meta, 2);
        }
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0) world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        if (l == 1) world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        if (l == 2) world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        if (l == 3) world.setBlockMetadataWithNotify(x, y, z, 4, 2);

        if (stack.hasDisplayName()) {
            ((TileEntityFurnace)world.getTileEntity(x, y, z)).setCustomInventoryName(stack.getDisplayName());
        }
    }

    /**
     * Статический метод для смены блока на активный/неактивный без потери содержимого инвентаря.
     */
    public static void updateBlockState(boolean active, World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        isUpdatingState = true;

        if (active) {
            world.setBlock(x, y, z, MBlocks.ZivicioFurnaceActive);
        } else {
            world.setBlock(x, y, z, MBlocks.ZivicioFurnace);
        }

        isUpdatingState = false;
        world.setBlockMetadataWithNotify(x, y, z, meta, 2);

        if (tileentity != null) {
            tileentity.validate();
            world.setTileEntity(x, y, z, tileentity);
        }
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
        if (!isUpdatingState) {
            TileEntityZivicioFurnace tile = (TileEntityZivicioFurnace)world.getTileEntity(x, y, z);

            if (tile != null) {
                for (int i = 0; i < tile.getSizeInventory(); ++i) {
                    ItemStack itemstack = tile.getStackInSlot(i);

                    if (itemstack != null) {
                        float f = this.random.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.random.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.random.nextFloat() * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0) {
                            int j = this.random.nextInt(21) + 10;
                            if (j > itemstack.stackSize) j = itemstack.stackSize;

                            itemstack.stackSize -= j;
                            EntityItem entityitem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getMetadata()));

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
                world.updateNeighborsAboutBlockChange(x, y, z, block);
            }
        }
        super.breakBlock(world, x, y, z, block, meta);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        if (this.isBurningActive) {
            int l = world.getBlockMetadata(x, y, z);
            float f = (float)x + 0.5F;
            float f1 = (float)y + 0.0F + rand.nextFloat() * 6.0F / 16.0F;
            float f2 = (float)z + 0.5F;
            float f3 = 0.52F;
            float f4 = rand.nextFloat() * 0.6F - 0.3F;

            // Частицы огня и дыма из передней панели в зависимости от направления
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
