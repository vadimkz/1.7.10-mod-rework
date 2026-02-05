package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.blocks.crops.*;
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

    public static void init() {

        if (ConfigDisable.AIR) AirCrop = new AirCrop();
        if (ConfigDisable.COAL) CoalCrop = new CoalCrop();
        if (ConfigDisable.DYE) DyeCrop = new DyeCrop();
        if (ConfigDisable.EARTH) EarthCrop = new EarthCrop();
        if (ConfigDisable.FIRE) FireCrop = new FireCrop();
        if (ConfigDisable.MINICIO) MinicioCrop = new MinicioCrop();
        if (ConfigDisable.NATURE) NatureCrop = new NatureCrop();
        if (ConfigDisable.WATER) WaterCrop = new WaterCrop();
        if (ConfigDisable.REDSTONE) RedstoneCrop = new RedstoneCrop();
        if (ConfigDisable.GLOWSTONE) GlowstoneCrop = new GlowstoneCrop();
        if (ConfigDisable.OBSIDIAN) ObsidianCrop = new ObsidianCrop();
        if (ConfigDisable.NETHER) NetherCrop = new NetherCrop();
        if (ConfigDisable.IRON) IronCrop = new IronCrop();
        if (ConfigDisable.GOLD) GoldCrop = new GoldCrop();
        if (ConfigDisable.LAPIS) LapisCrop = new LapisCrop();
        if (ConfigDisable.EXPERIENCE) ExperienceCrop = new ExperienceCrop();
        if (ConfigDisable.QUARTZ) QuartzCrop = new QuartzCrop();
        if (ConfigDisable.DIAMOND) DiamondCrop = new DiamondCrop();
        if (ConfigDisable.EMERALD) EmeraldCrop = new EmeraldCrop();

        if (ConfigDisable.BLAZE) BlazeCrop = new BlazeCrop();
        if (ConfigDisable.CREEPER) CreeperCrop = new CreeperCrop();
        if (ConfigDisable.ENDERMAN) EndermanCrop = new EndermanCrop();
        if (ConfigDisable.GHAST) GhastCrop = new GhastCrop();
        if (ConfigDisable.SKELETON) SkeletonCrop = new SkeletonCrop();
        if (ConfigDisable.SLIME) SlimeCrop = new SlimeCrop();
        if (ConfigDisable.SPIDER) SpiderCrop = new SpiderCrop();
        if (ConfigDisable.WITHER) WitherCrop = new WitherCrop();

        if (ConfigDisable.CHICKEN) ChickenCrop = new ChickenCrop();
        if (ConfigDisable.COW) CowCrop = new CowCrop();
        if (ConfigDisable.PIG) PigCrop = new PigCrop();
        if (ConfigDisable.SHEEP) SheepCrop = new SheepCrop();
    }
}
