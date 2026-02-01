package com.mark719.magicalcrops.furnace;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.handlers.MBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
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
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * Accio Furnace (inactive/active variants).
 *
 * Notes:
 * - Minecraft 1.7.10 (Forge 10.13.4.1614) with MCP names.
 * - Originally Java 6; kept 1.7.10-compatible while being clean for IDEA/Java 8.
 */
public class AccioFurnace extends Block implements ITileEntityProvider {

    /** Used to suppress inventory drops while swapping inactive/active blocks. */
    private static boolean isBurning;

    private final Random rand = new Random();

    /** True for the active (lit) block variant. */
    private final boolean isActive;

    @SideOnly(Side.CLIENT)
    private IIcon iconTop;

    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    public AccioFurnace(boolean isActive) {
        super(Material.rock);
        this.isActive = isActive;
        setHardness(3.5F);
        setResistance(5.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        // 0 = bottom, 1 = top, 2/3/4/5 = sides with metadata indicating front facing
        if (side == 1) return iconTop;
        if (side == 0) return iconTop;

        if (side == meta) {
            return iconFront;
        }
        return this.blockIcon;
    }


    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon("magicalcrops:furnaceaccio_side");
        this.iconFront = register.registerIcon(isActive
                ? "magicalcrops:furnaceaccio_front_on"
                : "magicalcrops:furnaceaccio_front_off");
        this.iconTop = register.registerIcon("magicalcrops:furnaceaccio_top");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z,
                                    EntityPlayer player, int side,
                                    float hitX, float hitY, float hitZ) {
        player.openGui(MagicalCrops.instance, 1, world, x, y, z);
        return true;
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return Item.getItemFromBlock(MBlocks.AccioFurnace);
    }

    @Override
    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(MBlocks.AccioFurnace);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityAccioFurnace();
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        setDefaultDirection(world, x, y, z);
    }

    /**
     * Matches vanilla furnace logic: if placed against a solid block, face away from it.
     */
    private void setDefaultDirection(World world, int x, int y, int z) {
        if (world.isRemote) return;

        Block north = world.getBlock(x, y, z - 1);
        Block south = world.getBlock(x, y, z + 1);
        Block west = world.getBlock(x - 1, y, z);
        Block east = world.getBlock(x + 1, y, z);

        byte facing = 3;

        if (north.isOpaqueCube() && !south.isOpaqueCube()) facing = 3;
        if (south.isOpaqueCube() && !north.isOpaqueCube()) facing = 2;
        if (west.isOpaqueCube() && !east.isOpaqueCube()) facing = 5;
        if (east.isOpaqueCube() && !west.isOpaqueCube()) facing = 4;

        world.setBlockMetadataWithNotify(x, y, z, facing, 2);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z,
                                EntityLivingBase placer, ItemStack stack) {
        int l = MathHelper.floor_double((placer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0) world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        if (l == 1) world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        if (l == 2) world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        if (l == 3) world.setBlockMetadataWithNotify(x, y, z, 4, 2);

        if (stack.hasDisplayName()) {
            TileEntity te = world.getTileEntity(x, y, z);
            if (te instanceof TileEntityAccioFurnace) {
                ((TileEntityAccioFurnace) te).setCustomInventoryName(stack.getDisplayName());
            }
        }
    }

    /**
     * Swap between inactive/active block variants while keeping metadata and tile entity.
     */
    public static void updateBlockState(boolean active, World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        TileEntity te = world.getTileEntity(x, y, z);
        isBurning = true;

        if (active) {
            world.setBlock(x, y, z, MBlocks.AccioFurnaceActive);
        } else {
            world.setBlock(x, y, z, MBlocks.AccioFurnace);
        }

        isBurning = false;
        world.setBlockMetadataWithNotify(x, y, z, meta, 2);

        if (te != null) {
            te.validate();
            world.setTileEntity(x, y, z, te);
        }
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
        if (!isBurning) {
            TileEntity te = world.getTileEntity(x, y, z);

            if (te instanceof TileEntityAccioFurnace) {
                TileEntityAccioFurnace furnace = (TileEntityAccioFurnace) te;

                for (int i = 0; i < furnace.getSizeInventory(); i++) {
                    ItemStack stack = furnace.getStackInSlot(i);

                    if (stack != null) {
                        float f = this.rand.nextFloat() * 0.6F + 0.1F;
                        float f1 = this.rand.nextFloat() * 0.6F + 0.1F;
                        float f2 = this.rand.nextFloat() * 0.6F + 0.1F;

                        while (stack.stackSize > 0) {
                            int j = this.rand.nextInt(21) + 10;
                            if (j > stack.stackSize) j = stack.stackSize;

                            stack.stackSize -= j;

                            EntityItem entityItem = new EntityItem(
                                    world,
                                    x + f, y + f1, z + f2,
                                    new ItemStack(stack.getItem(), j, stack.getMetadata())
                            );

                            if (stack.hasTagCompound()) {
                                NBTTagCompound tag = (NBTTagCompound) stack.getTagCompound().copy();
                                entityItem.getEntityItem().setTagCompound(tag);
                            }

                            float vel = 0.025F;
                            entityItem.motionX = (float) this.rand.nextGaussian() * vel;
                            entityItem.motionY = (float) this.rand.nextGaussian() * vel + 0.1F;
                            entityItem.motionZ = (float) this.rand.nextGaussian() * vel;

                            world.spawnEntityInWorld((Entity) entityItem);
                        }
                    }
                }

                world.notifyBlockOfNeighborChange(x, y, z, block);
            }
        }

        super.breakBlock(world, x, y, z, block, meta);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        if (!this.isActive) return;

        int meta = world.getBlockMetadata(x, y, z);
        float fx = x + 0.5F;
        float fy = y + 0.0F + rand.nextFloat() * 6.0F / 16.0F;
        float fz = z + 0.5F;

        float offset = 0.52F;
        float spread = rand.nextFloat() * 0.6F - 0.3F;

        if (meta == 4) {
            world.spawnParticle("smoke", fx - offset, fy, fz + spread, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", fx - offset, fy, fz + spread, 0.0D, 0.0D, 0.0D);
        } else if (meta == 5) {
            world.spawnParticle("smoke", fx + offset, fy, fz + spread, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", fx + offset, fy, fz + spread, 0.0D, 0.0D, 0.0D);
        } else if (meta == 2) {
            world.spawnParticle("smoke", fx + spread, fy, fz - offset, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", fx + spread, fy, fz - offset, 0.0D, 0.0D, 0.0D);
        } else if (meta == 3) {
            world.spawnParticle("smoke", fx + spread, fy, fz + offset, 0.0D, 0.0D, 0.0D);
            world.spawnParticle("flame", fx + spread, fy, fz + offset, 0.0D, 0.0D, 0.0D);
        }
    }
}
