package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.blocks.crops.*;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class MCrops {
    // Базовые культуры
    public static Block AirCrop;
    public static Block CoalCrop;
    public static Block DyeCrop;
    public static Block EarthCrop;
    public static Block FireCrop;
    public static Block NatureCrop;
    public static Block MinicioCrop;
    public static Block WaterCrop;

    // Ресурсы мира
    public static Block RedstoneCrop;
    public static Block GlowstoneCrop;
    public static Block ObsidianCrop;
    public static Block NetherCrop;

    // Металлы и драгоценности
    public static Block IronCrop;
    public static Block GoldCrop;
    public static Block LapisCrop;
    public static Block ExperienceCrop;
    public static Block QuartzCrop;
    public static Block DiamondCrop;
    public static Block EmeraldCrop;

    // Монстры
    public static Block BlazeCrop;
    public static Block CreeperCrop;
    public static Block EndermanCrop;
    public static Block GhastCrop;
    public static Block SkeletonCrop;
    public static Block SlimeCrop;
    public static Block SpiderCrop;
    public static Block WitherCrop;

    // Животные
    public static Block ChickenCrop;
    public static Block CowCrop;
    public static Block PigCrop;
    public static Block SheepCrop;

    public static void init() {
        // Базовые культуры
        AirCrop = new AirCrop().setUnlocalizedName("AirCrop");
        CoalCrop = new CoalCrop().setUnlocalizedName("CoalCrop");
        DyeCrop = new DyeCrop().setUnlocalizedName("DyeCrop");
        EarthCrop = new EarthCrop().setUnlocalizedName("EarthCrop");
        FireCrop = new FireCrop().setUnlocalizedName("FireCrop");
        NatureCrop = new NatureCrop().setUnlocalizedName("NatureCrop");
        MinicioCrop = new MinicioCrop().setUnlocalizedName("MinicioCrop");
        WaterCrop = new WaterCrop().setUnlocalizedName("WaterCrop");

        // Ресурсы мира
        RedstoneCrop = new RedstoneCrop().setUnlocalizedName("RedstoneCrop");
        GlowstoneCrop = new GlowstoneCrop().setUnlocalizedName("GlowstoneCrop");
        ObsidianCrop = new ObsidianCrop().setUnlocalizedName("ObsidianCrop");
        NetherCrop = new NetherCrop().setUnlocalizedName("NetherCrop");

        // Металлы и драгоценности
        IronCrop = new IronCrop().setUnlocalizedName("IronCrop");
        GoldCrop = new GoldCrop().setUnlocalizedName("GoldCrop");
        LapisCrop = new LapisCrop().setUnlocalizedName("LapisCrop");
        ExperienceCrop = new ExperienceCrop().setUnlocalizedName("ExperienceCrop");
        QuartzCrop = new QuartzCrop().setUnlocalizedName("QuartzCrop");
        DiamondCrop = new DiamondCrop().setUnlocalizedName("DiamondCrop");
        EmeraldCrop = new EmeraldCrop().setUnlocalizedName("EmeraldCrop");

        // Монстры
        BlazeCrop = new BlazeCrop().setUnlocalizedName("BlazeCrop");
        CreeperCrop = new CreeperCrop().setUnlocalizedName("CreeperCrop");
        EndermanCrop = new EndermanCrop().setUnlocalizedName("EndermanCrop");
        GhastCrop = new GhastCrop().setUnlocalizedName("GhastCrop");
        SkeletonCrop = new SkeletonCrop().setUnlocalizedName("SkeletonCrop");
        SlimeCrop = new SlimeCrop().setUnlocalizedName("SlimeCrop");
        SpiderCrop = new SpiderCrop().setUnlocalizedName("SpiderCrop");
        WitherCrop = new WitherCrop().setUnlocalizedName("WitherCrop");

        // Животные
        ChickenCrop = new ChickenCrop().setUnlocalizedName("ChickenCrop");
        CowCrop = new CowCrop().setUnlocalizedName("CowCrop");
        PigCrop = new PigCrop().setUnlocalizedName("PigCrop");
        SheepCrop = new SheepCrop().setUnlocalizedName("SheepCrop");

        registerBlocks();
    }

    private static void registerBlocks() {
        // Здесь должна быть регистрация в GameRegistry, если вы её не делаете в другом месте
        // Пример: GameRegistry.registerBlock(AirCrop, "AirCrop");
    }
}