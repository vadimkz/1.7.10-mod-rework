package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.blocks.crops.AirCrop;
import com.mark719.magicalcrops.blocks.crops.BlazeCrop;
import com.mark719.magicalcrops.blocks.crops.ChickenCrop;
import com.mark719.magicalcrops.blocks.crops.CoalCrop;
import com.mark719.magicalcrops.blocks.crops.CowCrop;
import com.mark719.magicalcrops.blocks.crops.CreeperCrop;
import com.mark719.magicalcrops.blocks.crops.DiamondCrop;
import com.mark719.magicalcrops.blocks.crops.DyeCrop;
import com.mark719.magicalcrops.blocks.crops.EarthCrop;
import com.mark719.magicalcrops.blocks.crops.EmeraldCrop;
import com.mark719.magicalcrops.blocks.crops.EndermanCrop;
import com.mark719.magicalcrops.blocks.crops.ExperienceCrop;
import com.mark719.magicalcrops.blocks.crops.FireCrop;
import com.mark719.magicalcrops.blocks.crops.GhastCrop;
import com.mark719.magicalcrops.blocks.crops.GlowstoneCrop;
import com.mark719.magicalcrops.blocks.crops.GoldCrop;
import com.mark719.magicalcrops.blocks.crops.IronCrop;
import com.mark719.magicalcrops.blocks.crops.LapisCrop;
import com.mark719.magicalcrops.blocks.crops.MinicioCrop;
import com.mark719.magicalcrops.blocks.crops.NatureCrop;
import com.mark719.magicalcrops.blocks.crops.NetherCrop;
import com.mark719.magicalcrops.blocks.crops.ObsidianCrop;
import com.mark719.magicalcrops.blocks.crops.PigCrop;
import com.mark719.magicalcrops.blocks.crops.QuartzCrop;
import com.mark719.magicalcrops.blocks.crops.RedstoneCrop;
import com.mark719.magicalcrops.blocks.crops.SheepCrop;
import com.mark719.magicalcrops.blocks.crops.SkeletonCrop;
import com.mark719.magicalcrops.blocks.crops.SlimeCrop;
import com.mark719.magicalcrops.blocks.crops.SpiderCrop;
import com.mark719.magicalcrops.blocks.crops.WaterCrop;
import com.mark719.magicalcrops.blocks.crops.WitherCrop;
import com.mark719.magicalcrops.config.ConfigDisable;
import net.minecraft.block.Block;

public class MCrops {

    public static Block AirCrop;
    public static Block CoalCrop;
    public static Block DyeCrop;
    public static Block EarthCrop;
    public static Block FireCrop;
    public static Block MinicioCrop;
    public static Block NatureCrop;
    public static Block WaterCrop;
    public static Block RedstoneCrop;
    public static Block GlowstoneCrop;
    public static Block ObsidianCrop;
    public static Block NetherCrop;
    public static Block IronCrop;
    public static Block GoldCrop;
    public static Block LapisCrop;
    public static Block ExperienceCrop;
    public static Block QuartzCrop;
    public static Block DiamondCrop;
    public static Block EmeraldCrop;

    public static Block BlazeCrop;
    public static Block CreeperCrop;
    public static Block EndermanCrop;
    public static Block GhastCrop;
    public static Block SkeletonCrop;
    public static Block SlimeCrop;
    public static Block SpiderCrop;
    public static Block WitherCrop;

    public static Block ChickenCrop;
    public static Block CowCrop;
    public static Block PigCrop;
    public static Block SheepCrop;

    /**
     * IMPORTANT:
     * ConfigDisable.* flags are treated as "disabled = true".
     * So we create crops when the flag is FALSE.
     *
     * This matches the original behavior (all crops exist by default)
     * while still respecting the config toggles.
     */
    public static void init() {

        if (!ConfigDisable.AIR) AirCrop = (new AirCrop()).setUnlocalizedName("AirCrop");
        if (!ConfigDisable.COAL) CoalCrop = (new CoalCrop()).setUnlocalizedName("CoalCrop");
        if (!ConfigDisable.DYE) DyeCrop = (new DyeCrop()).setUnlocalizedName("DyeCrop");
        if (!ConfigDisable.EARTH) EarthCrop = (new EarthCrop()).setUnlocalizedName("EarthCrop");
        if (!ConfigDisable.FIRE) FireCrop = (new FireCrop()).setUnlocalizedName("FireCrop");
        if (!ConfigDisable.MINICIO) MinicioCrop = (new MinicioCrop()).setUnlocalizedName("MinicioCrop");
        if (!ConfigDisable.NATURE) NatureCrop = (new NatureCrop()).setUnlocalizedName("NatureCrop");
        if (!ConfigDisable.WATER) WaterCrop = (new WaterCrop()).setUnlocalizedName("WaterCrop");
        if (!ConfigDisable.REDSTONE) RedstoneCrop = (new RedstoneCrop()).setUnlocalizedName("RedstoneCrop");
        if (!ConfigDisable.GLOWSTONE) GlowstoneCrop = (new GlowstoneCrop()).setUnlocalizedName("GlowstoneCrop");
        if (!ConfigDisable.OBSIDIAN) ObsidianCrop = (new ObsidianCrop()).setUnlocalizedName("ObsidianCrop");
        if (!ConfigDisable.NETHER) NetherCrop = (new NetherCrop()).setUnlocalizedName("NetherCrop");
        if (!ConfigDisable.IRON) IronCrop = (new IronCrop()).setUnlocalizedName("IronCrop");
        if (!ConfigDisable.GOLD) GoldCrop = (new GoldCrop()).setUnlocalizedName("GoldCrop");
        if (!ConfigDisable.LAPIS) LapisCrop = (new LapisCrop()).setUnlocalizedName("LapisCrop");
        if (!ConfigDisable.EXPERIENCE) ExperienceCrop = (new ExperienceCrop()).setUnlocalizedName("ExperienceCrop");
        if (!ConfigDisable.QUARTZ) QuartzCrop = (new QuartzCrop()).setUnlocalizedName("QuartzCrop");
        if (!ConfigDisable.DIAMOND) DiamondCrop = (new DiamondCrop()).setUnlocalizedName("DiamondCrop");
        if (!ConfigDisable.EMERALD) EmeraldCrop = (new EmeraldCrop()).setUnlocalizedName("EmeraldCrop");

        if (!ConfigDisable.BLAZE) BlazeCrop = (new BlazeCrop()).setUnlocalizedName("BlazeCrop");
        if (!ConfigDisable.CREEPER) CreeperCrop = (new CreeperCrop()).setUnlocalizedName("CreeperCrop");
        if (!ConfigDisable.ENDERMAN) EndermanCrop = (new EndermanCrop()).setUnlocalizedName("EndermanCrop");
        if (!ConfigDisable.GHAST) GhastCrop = (new GhastCrop()).setUnlocalizedName("GhastCrop");
        if (!ConfigDisable.SKELETON) SkeletonCrop = (new SkeletonCrop()).setUnlocalizedName("SkeletonCrop");
        if (!ConfigDisable.SLIME) SlimeCrop = (new SlimeCrop()).setUnlocalizedName("SlimeCrop");
        if (!ConfigDisable.SPIDER) SpiderCrop = (new SpiderCrop()).setUnlocalizedName("SpiderCrop");
        if (!ConfigDisable.WITHER) WitherCrop = (new WitherCrop()).setUnlocalizedName("WitherCrop");

        if (!ConfigDisable.CHICKEN) ChickenCrop = (new ChickenCrop()).setUnlocalizedName("ChickenCrop");
        if (!ConfigDisable.COW) CowCrop = (new CowCrop()).setUnlocalizedName("CowCrop");
        if (!ConfigDisable.PIG) PigCrop = (new PigCrop()).setUnlocalizedName("PigCrop");
        if (!ConfigDisable.SHEEP) SheepCrop = (new SheepCrop()).setUnlocalizedName("SheepCrop");
    }
}
