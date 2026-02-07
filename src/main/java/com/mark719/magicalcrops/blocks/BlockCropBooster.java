package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.help.CropRandom;
import com.mark719.magicalcrops.help.StemRandom;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockStem;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Блок-ускоритель роста (Crop Booster).
 */
public class BlockCropBooster extends Block {

    private CropRandom prng;
    private StemRandom s_prng;

    @SideOnly(Side.CLIENT)
    private IIcon blockIconInstance;

    public BlockCropBooster() {
        super(Material.ground);

        this.prng = new CropRandom();
        this.s_prng = new StemRandom();

        this.setTickRandomly(true);
        this.setHardness(1.0F);
        this.setStepSound(Block.soundTypeGrass);
        this.setCreativeTab(MagicalCrops.tabMagical);
        // Убрали проблемный setBlockTextureName
    }

    // Попробуем убрать @Override, если компилятор жалуется,
    // но в 1.7.10 этот метод ДОЛЖЕН быть в классе Block.
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.blockIcon = reg.registerIcon("magicalcrops:booster_block");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        return this.blockIconInstance;
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.blockExists(x, y + 1, z)) {
            return;
        }

        Block blockAbove = world.getBlock(x, y + 1, z);

        if (blockAbove instanceof BlockCropBooster) {
            blockAbove.updateTick(world, x, y + 1, z, random);
            return;
        }

        if (!world.blockExists(x, y + 2, z)) {
            return;
        }

        Block plantBlock = world.getBlock(x, y + 2, z);

        if (plantBlock instanceof BlockStem) {
            if (world.getBlockMetadata(x, y + 2, z) >= 7) {
                plantBlock.updateTick(world, x, y + 2, z, (Random)this.s_prng);
            } else {
                plantBlock.updateTick(world, x, y + 2, z, (Random)this.prng);
            }
        }
        else if (plantBlock instanceof BlockReed || plantBlock instanceof BlockCactus) {
            for (int l = 1; l < 3; l++) {
                if (world.blockExists(x, y + 1 + l, z)) {
                    Block targetBlock = world.getBlock(x, y + 1 + l, z);
                    targetBlock.updateTick(world, x, y + 1 + l, z, (Random)this.prng);
                }
            }
        }
        else if (plantBlock instanceof IPlantable || plantBlock.getClass().getSimpleName().contains("MagicalCrops")) {
            plantBlock.updateTick(world, x, y + 2, z, (Random)this.prng);
        }
    }
}