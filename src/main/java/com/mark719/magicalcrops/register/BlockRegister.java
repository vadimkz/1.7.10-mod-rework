package com.mark719.magicalcrops.register;

import com.mark719.magicalcrops.config.ConfigDisable;
import com.mark719.magicalcrops.handlers.MBlocks;
import com.mark719.magicalcrops.handlers.MCrops;
import com.mark719.magicalcrops.help.BlockRegisterHelper;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceBlock;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceBrick;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceBrick2;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceLamp;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceSquare;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceStorage;

import net.minecraft.block.Block;

/**
 * Регистрация блоков — логика как в оригинале Magical Crops.
 * ConfigDisable = флаг отключения, поэтому регистрируем при false.
 */
public class BlockRegister {

    public static void registerBlock() {

        safe(MBlocks.MinicioOre);
        safe(MBlocks.MinicioOreNether);
        safe(MBlocks.MinicioOreEnd);

        // === CROPS (регистрируем когда НЕ отключены) ===
        if (!ConfigDisable.AIR) safe(MCrops.AirCrop);
        if (!ConfigDisable.COAL) safe(MCrops.CoalCrop);
        if (!ConfigDisable.DYE) safe(MCrops.DyeCrop);
        if (!ConfigDisable.EARTH) safe(MCrops.EarthCrop);
        if (!ConfigDisable.FIRE) safe(MCrops.FireCrop);
        if (!ConfigDisable.MINICIO) safe(MCrops.MinicioCrop);
        if (!ConfigDisable.NATURE) safe(MCrops.NatureCrop);
        if (!ConfigDisable.WATER) safe(MCrops.WaterCrop);
        if (!ConfigDisable.REDSTONE) safe(MCrops.RedstoneCrop);
        if (!ConfigDisable.GLOWSTONE) safe(MCrops.GlowstoneCrop);
        if (!ConfigDisable.OBSIDIAN) safe(MCrops.ObsidianCrop);
        if (!ConfigDisable.NETHER) safe(MCrops.NetherCrop);
        if (!ConfigDisable.IRON) safe(MCrops.IronCrop);
        if (!ConfigDisable.GOLD) safe(MCrops.GoldCrop);
        if (!ConfigDisable.LAPIS) safe(MCrops.LapisCrop);
        if (!ConfigDisable.EXPERIENCE) safe(MCrops.ExperienceCrop);
        if (!ConfigDisable.QUARTZ) safe(MCrops.QuartzCrop);
        if (!ConfigDisable.DIAMOND) safe(MCrops.DiamondCrop);
        if (!ConfigDisable.EMERALD) safe(MCrops.EmeraldCrop);

        if (!ConfigDisable.BLAZE) safe(MCrops.BlazeCrop);
        if (!ConfigDisable.CREEPER) safe(MCrops.CreeperCrop);
        if (!ConfigDisable.ENDERMAN) safe(MCrops.EndermanCrop);
        if (!ConfigDisable.GHAST) safe(MCrops.GhastCrop);
        if (!ConfigDisable.SKELETON) safe(MCrops.SkeletonCrop);
        if (!ConfigDisable.SLIME) safe(MCrops.SlimeCrop);
        if (!ConfigDisable.SPIDER) safe(MCrops.SpiderCrop);
        if (!ConfigDisable.WITHER) safe(MCrops.WitherCrop);

        if (!ConfigDisable.CHICKEN) safe(MCrops.ChickenCrop);
        if (!ConfigDisable.COW) safe(MCrops.CowCrop);
        if (!ConfigDisable.PIG) safe(MCrops.PigCrop);
        if (!ConfigDisable.SHEEP) safe(MCrops.SheepCrop);

        // === OTHER BLOCKS ===
        safe(MBlocks.CropBooster);
        safe(MBlocks.EssenceStone);

        safe(MBlocks.FarmlandAccio);
        safe(MBlocks.FarmlandCrucio);
        safe(MBlocks.FarmlandImperio);
        safe(MBlocks.FarmlandZivicio);

        safe(MBlocks.WitherProof);
        safe(MBlocks.WitherProofGlass);

        safe(MBlocks.AccioFurnace);
        safe(MBlocks.AccioFurnaceActive);
        safe(MBlocks.CrucioFurnace);
        safe(MBlocks.CrucioFurnaceActive);
        safe(MBlocks.ImperioFurnace);
        safe(MBlocks.ImperioFurnaceActive);
        safe(MBlocks.ZivicioFurnace);
        safe(MBlocks.ZivicioFurnaceActive);
        safe(MBlocks.UltimateFurnace);
        safe(MBlocks.UltimateFurnaceActive);

        // === BLOCKS WITH CUSTOM ITEMBLOCK ===
        if (MBlocks.EssenceStorage != null)
            BlockRegisterHelper.registerBlock(MBlocks.EssenceStorage, ItemBlockEssenceStorage.class, "essence_storage");
        if (MBlocks.EssenceBrick != null)
            BlockRegisterHelper.registerBlock(MBlocks.EssenceBrick, ItemBlockEssenceBrick.class, "essence_brick");
        if (MBlocks.EssenceBlock != null)
            BlockRegisterHelper.registerBlock(MBlocks.EssenceBlock, ItemBlockEssenceBlock.class, "essence_block");
        if (MBlocks.EssenceBrick2 != null)
            BlockRegisterHelper.registerBlock(MBlocks.EssenceBrick2, ItemBlockEssenceBrick2.class, "essence_brick2");
        if (MBlocks.EssenceSquare != null)
            BlockRegisterHelper.registerBlock(MBlocks.EssenceSquare, ItemBlockEssenceSquare.class, "essence_square");
        if (MBlocks.EssenceLamp != null)
            BlockRegisterHelper.registerBlock(MBlocks.EssenceLamp, ItemBlockEssenceLamp.class, "essence_lamp");
    }

    private static void safe(Block block) {
        if (block != null) {
            BlockRegisterHelper.registerBlock(block);
        }
    }
}
