package com.mark719.magicalcrops.register;

import com.mark719.magicalcrops.config.ConfigDisable;
import com.mark719.magicalcrops.handlers.MBlocks;
import com.mark719.magicalcrops.handlers.MCrops;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceBlock;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceBrick;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceBrick2;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceLamp;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceSquare;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceStorage;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

/**
 * Регистрация блоков — логика как в оригинале Magical Crops.
 * ConfigDisable = флаг отключения, поэтому регистрируем при false.
 */
public class BlockRegister {

    public static void registerBlock() {

        // === ORES ===
        register(MBlocks.MinicioOre);
        register(MBlocks.MinicioOreNether);
        register(MBlocks.MinicioOreEnd);

        // === BOOSTER + FARMLAND ===
        register(MBlocks.CropBooster);
        register(MBlocks.FarmlandAccio);
        register(MBlocks.FarmlandCrucio);
        register(MBlocks.FarmlandImperio);
        register(MBlocks.FarmlandZivicio);

        // === ESSENCE + WITHER PROOF ===
        register(MBlocks.EssenceStone);
        register(MBlocks.EssenceStorage, ItemBlockEssenceStorage.class);
        register(MBlocks.EssenceBlock, ItemBlockEssenceBlock.class);
        register(MBlocks.EssenceLamp, ItemBlockEssenceLamp.class);
        register(MBlocks.EssenceBrick, ItemBlockEssenceBrick.class);
        register(MBlocks.EssenceBrick2, ItemBlockEssenceBrick2.class);
        register(MBlocks.EssenceSquare, ItemBlockEssenceSquare.class);
        register(MBlocks.WitherProof);
        register(MBlocks.WitherProofGlass);

        // === FURNACES ===
        register(MBlocks.AccioFurnace);
        register(MBlocks.AccioFurnaceActive);
        register(MBlocks.CrucioFurnace);
        register(MBlocks.CrucioFurnaceActive);
        register(MBlocks.ImperioFurnace);
        register(MBlocks.ImperioFurnaceActive);
        register(MBlocks.ZivicioFurnace);
        register(MBlocks.ZivicioFurnaceActive);
        register(MBlocks.UltimateFurnace);
        register(MBlocks.UltimateFurnaceActive);

        // === CROPS (регистрируем когда НЕ отключены) ===
        if (!ConfigDisable.AIR) register(MCrops.AirCrop);
        if (!ConfigDisable.COAL) register(MCrops.CoalCrop);
        if (!ConfigDisable.DYE) register(MCrops.DyeCrop);
        if (!ConfigDisable.EARTH) register(MCrops.EarthCrop);
        if (!ConfigDisable.FIRE) register(MCrops.FireCrop);
        if (!ConfigDisable.MINICIO) register(MCrops.MinicioCrop);
        if (!ConfigDisable.NATURE) register(MCrops.NatureCrop);
        if (!ConfigDisable.WATER) register(MCrops.WaterCrop);
        if (!ConfigDisable.REDSTONE) register(MCrops.RedstoneCrop);
        if (!ConfigDisable.GLOWSTONE) register(MCrops.GlowstoneCrop);
        if (!ConfigDisable.OBSIDIAN) register(MCrops.ObsidianCrop);
        if (!ConfigDisable.NETHER) register(MCrops.NetherCrop);
        if (!ConfigDisable.IRON) register(MCrops.IronCrop);
        if (!ConfigDisable.GOLD) register(MCrops.GoldCrop);
        if (!ConfigDisable.LAPIS) register(MCrops.LapisCrop);
        if (!ConfigDisable.EXPERIENCE) register(MCrops.ExperienceCrop);
        if (!ConfigDisable.QUARTZ) register(MCrops.QuartzCrop);
        if (!ConfigDisable.DIAMOND) register(MCrops.DiamondCrop);
        if (!ConfigDisable.EMERALD) register(MCrops.EmeraldCrop);

        if (!ConfigDisable.BLAZE) register(MCrops.BlazeCrop);
        if (!ConfigDisable.CREEPER) register(MCrops.CreeperCrop);
        if (!ConfigDisable.ENDERMAN) register(MCrops.EndermanCrop);
        if (!ConfigDisable.GHAST) register(MCrops.GhastCrop);
        if (!ConfigDisable.SKELETON) register(MCrops.SkeletonCrop);
        if (!ConfigDisable.SLIME) register(MCrops.SlimeCrop);
        if (!ConfigDisable.SPIDER) register(MCrops.SpiderCrop);
        if (!ConfigDisable.WITHER) register(MCrops.WitherCrop);

        if (!ConfigDisable.CHICKEN) register(MCrops.ChickenCrop);
        if (!ConfigDisable.COW) register(MCrops.CowCrop);
        if (!ConfigDisable.PIG) register(MCrops.PigCrop);
        if (!ConfigDisable.SHEEP) register(MCrops.SheepCrop);
    }

    private static void register(Block block) {
        if (block == null) {
            return;
        }
        GameRegistry.registerBlock(block, ItemBlock.class, getRegistryName(block));
    }

    private static void register(Block block, Class<? extends ItemBlock> itemBlockClass) {
        if (block == null) {
            return;
        }
        GameRegistry.registerBlock(block, itemBlockClass, getRegistryName(block));
    }

    private static String getRegistryName(Block block) {
        String unloc = block.getUnlocalizedName();
        return unloc != null && unloc.startsWith("tile.") ? unloc.substring(5) : unloc;
    }
}
