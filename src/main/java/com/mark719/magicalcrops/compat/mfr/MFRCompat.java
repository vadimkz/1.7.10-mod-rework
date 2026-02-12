package com.mark719.magicalcrops.compat.mfr;

import com.mark719.magicalcrops.handlers.ModCompat;
import cpw.mods.fml.common.Loader;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import powercrystals.minefactoryreloaded.api.FactoryRegistry;
import powercrystals.minefactoryreloaded.api.IFactoryHarvestable;
import powercrystals.minefactoryreloaded.api.HarvestType;

import java.util.List;
import java.util.Map;
import java.util.Random;

import com.mark719.magicalcrops.handlers.MCrops;

public class MFRCompat {

    public static void registerAll() {
        if (!Loader.isModLoaded("MineFactoryReloaded")) return;

        register(MCrops.AirCrop);
        register(MCrops.FireCrop);
        register(MCrops.WaterCrop);
        register(MCrops.AirCrop);
        register(MCrops.CoalCrop);
        register(MCrops.DyeCrop);
        register(MCrops.EarthCrop);
        register(MCrops.FireCrop);
        register(MCrops.NatureCrop);
        register(MCrops.MinicioCrop);
        register(MCrops.WaterCrop);
        register(MCrops.RedstoneCrop);
        register(MCrops.GlowstoneCrop);
        register(MCrops.ObsidianCrop);
        register(MCrops.NetherCrop);
        register(MCrops.IronCrop);
        register(MCrops.GoldCrop);
        register(MCrops.LapisCrop);
        register(MCrops.ExperienceCrop);
        register(MCrops.QuartzCrop);
        register(MCrops.DiamondCrop);
        register(MCrops.EmeraldCrop);
        register(MCrops.BlazeCrop);
        register(MCrops.CreeperCrop);
        register(MCrops.EndermanCrop);
        register(MCrops.GhastCrop);
        register(MCrops.SkeletonCrop);
        register(MCrops.SlimeCrop);
        register(MCrops.SpiderCrop);
        register(MCrops.WitherCrop);
        register(MCrops.ChickenCrop);
        register(MCrops.CowCrop);
        register(MCrops.PigCrop);
        register(MCrops.SheepCrop);
        register(ModCompat.AluminiumCrop);
        register(ModCompat.ArditeCrop);
        register(ModCompat.CobaltCrop);
        register(ModCompat.CopperCrop);
        register(ModCompat.CertusQuartzCrop);
        register(ModCompat.LeadCrop);
        register(ModCompat.NickelCrop);
        register(ModCompat.OsmiumCrop);
        register(ModCompat.PeridotCrop);
        register(ModCompat.RubyCrop);
        register(ModCompat.SapphireCrop);
        register(ModCompat.PlatinumCrop);
        register(ModCompat.RubberCrop);
        register(ModCompat.SilverCrop);
        register(ModCompat.TinCrop);
        register(ModCompat.SulfurCrop);
        register(ModCompat.AlumiteCrop);
        register(ModCompat.YelloriteCrop);
        register(ModCompat.BlizzCrop);
        register(ModCompat.BronzeCrop);
        register(ModCompat.ElectrumCrop);
        register(ModCompat.EnderiumCrop);
        register(ModCompat.FluixCrop);
        register(ModCompat.InvarCrop);
        register(ModCompat.LumiumCrop);
        register(ModCompat.ManasteelCrop);
        register(ModCompat.ManyullynCrop);
        register(ModCompat.SaltpeterCrop);
        register(ModCompat.SignalumCrop);
        register(ModCompat.SteelCrop);
        register(ModCompat.TerrasteelCrop);
    }

    private static void register(Block crop) {
        FactoryRegistry.sendMessage(
                "registerHarvestable",
                new MagicalCropHarvestable(crop)
        );
    }

    private static class MagicalCropHarvestable implements IFactoryHarvestable {

        private final Block crop;

        public MagicalCropHarvestable(Block crop) {
            this.crop = crop;
        }

        @Override
        public Block getPlant() {
            return crop;
        }

        @Override
        public HarvestType getHarvestType() {
            return HarvestType.Normal;
        }

        @Override
        public boolean breakBlock() {
            return false;
        }

        @Override
        public boolean canBeHarvested(World world, Map<String, Boolean> settings, int x, int y, int z) {
            return world.getBlockMetadata(x, y, z) >= 7;
        }

        @Override
        public List<ItemStack> getDrops(World world, Random rand, Map<String, Boolean> settings,
                                        int x, int y, int z) {
            int meta = world.getBlockMetadata(x, y, z);
            return crop.getDrops(world, x, y, z, meta, 0);
        }

        @Override
        public void preHarvest(World world, int x, int y, int z) {
            world.setBlockMetadataWithNotify(x, y, z, 0, 2);
        }

        @Override
        public void postHarvest(World world, int x, int y, int z) {
        }
    }
}
