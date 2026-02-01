package com.mark719.magicalcrops.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Исправленная версия для Minecraft 1.7.10
 * Реализует IGrowable с методами: canFertilize, shouldFertilize, fertilize
 */
public class BlockMagicalCrops extends BlockBush implements IGrowable {

    @SideOnly(Side.CLIENT)
    protected IIcon[] icons;

    public BlockMagicalCrops() {
        super();
        this.setTickRandomly(true);
        float f = 0.5F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setStepSound(soundTypeGrass);
        this.disableStats();
    }

    // --- Методы IGrowable (MCP Mappings) ---

    /**
     * Можно ли вообще использовать удобрение (проверка стадии роста)
     */
    @Override
    public boolean canFertilize(World world, int x, int y, int z, boolean isRemote) {
        return world.getBlockMetadata(x, y, z) < 7;
    }

    /**
     * Сработает ли удобрение в данный момент (шанс)
     */
    @Override
    public boolean shouldFertilize(World world, Random random, int x, int y, int z) {
        return true;
    }

    /**
     * Сам процесс роста при применении удобрения
     */
    @Override
    public void fertilize(World world, Random random, int x, int y, int z) {
        this.grow(world, x, y, z);
    }

    // --- Логика роста ---

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        super.updateTick(world, x, y, z, random);

        // Стандартная проверка света для растений
        if (world.getBlockLightValue(x, y + 1, z) >= 9) {
            int meta = world.getBlockMetadata(x, y, z);
            if (meta < 7) {
                float f = this.getGrowthChance(world, x, y, z);
                if (random.nextInt((int)(25.0F / f) + 1) == 0) {
                    meta++;
                    world.setBlockMetadataWithNotify(x, y, z, meta, 2);
                }
            }
        }
    }

    /**
     * Ускорение роста в зависимости от типа грядки под блоком
     */
    private float getGrowthChance(World world, int x, int y, int z) {
        float f = 1.0F;
        Block ground = world.getBlock(x, y - 1, z);
        String name = ground.getUnlocalizedName().toLowerCase();

        if (name.contains("accio")) f = 4.0F;
        else if (name.contains("crucio")) f = 8.0F;
        else if (name.contains("imperio")) f = 12.0F;
        else if (name.contains("zivicio")) f = 25.0F;
        else if (ground == Blocks.farmland) f = 2.0F;

        return f;
    }

    public void grow(World world, int x, int y, int z) {
        int nextMeta = world.getBlockMetadata(x, y, z) + MathHelper.getRandomIntegerInRange(world.rand, 2, 5);
        if (nextMeta > 7) nextMeta = 7;
        world.setBlockMetadataWithNotify(x, y, z, nextMeta, 2);
    }

    // --- Переопределения BlockBush ---

    @Override
    protected boolean canPlaceBlockOn(Block block) {
        return block == Blocks.farmland || (block != null && block.getUnlocalizedName().toLowerCase().contains("farmland"));
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return meta == 7 ? this.getCrop() : this.getSeed();
    }

    protected Item getSeed() {
        return Items.wheat_seeds;
    }

    protected Item getCrop() {
        return Items.wheat;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (this.icons == null || meta < 0 || meta >= this.icons.length) {
            return Blocks.wheat.getIcon(0, meta);
        }
        return this.icons[meta];
    }

    @Override
    public int getRenderType() {
        return 1; // Cross texture (как трава/пшеница)
    }
}