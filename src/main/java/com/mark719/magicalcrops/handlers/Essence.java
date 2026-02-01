package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.items.essence.*;
import net.minecraft.item.Item;

/**
 * Registry class for Magical Crops essences.
 * Refactored for Minecraft 1.7.10 (Forge) and Java 8 compatibility.
 */
public class Essence {

    // Tiered Essences
    public static Item MinicioEssence = new MinicioEssence().setUnlocalizedName("1MinicioEssence");
    public static Item AccioEssence = new AccioEssence().setUnlocalizedName("2AccioEssence");
    public static Item CrucioEssence = new CrucioEssence().setUnlocalizedName("3CrucioEssence");
    public static Item ImperioEssence = new ImperioEssence().setUnlocalizedName("4ImperioEssence");
    public static Item ZivicioEssence = new ZivicioEssence().setUnlocalizedName("5ZivicioEssence");
    public static Item TaintedEssence = new TaintedEssence().setUnlocalizedName("TaintedEssence");

    // Basic Resource Essences
    public static Item AirEssence = new AirEssence().setUnlocalizedName("AirEssence");
    public static Item CoalEssence = new CoalEssence().setUnlocalizedName("CoalEssence");
    public static Item DyeEssence = new DyeEssence().setUnlocalizedName("DyeEssence");
    public static Item EarthEssence = new EarthEssence().setUnlocalizedName("EarthEssence");
    public static Item FireEssence = new FireEssence().setUnlocalizedName("FireEssence");
    public static Item NatureEssence = new NatureEssence().setUnlocalizedName("NatureEssence");
    public static Item WaterEssence = new WaterEssence().setUnlocalizedName("WaterEssence");

    // Intermediate Resource Essences
    public static Item RedstoneEssence = new RedstoneEssence().setUnlocalizedName("RedstoneEssence");
    public static Item GlowstoneEssence = new GlowstoneEssence().setUnlocalizedName("GlowstoneEssence");
    public static Item ObsidianEssence = new ObsidianEssence().setUnlocalizedName("ObsidianEssence");
    public static Item NetherEssence = new NetherEssence().setUnlocalizedName("NetherEssence");

    // Advanced Resource Essences
    public static Item IronEssence = new IronEssence().setUnlocalizedName("IronEssence");
    public static Item GoldEssence = new GoldEssence().setUnlocalizedName("GoldEssence");
    public static Item LapisEssence = new LapisEssence().setUnlocalizedName("LapisEssence");
    public static Item ExperienceEssence = new ExperienceEssence().setUnlocalizedName("ExperienceEssence");
    public static Item QuartzEssence = new QuartzEssence().setUnlocalizedName("QuartzEssence");

    // Precious Resource Essences
    public static Item DiamondEssence = new DiamondEssence().setUnlocalizedName("DiamondEssence");
    public static Item EmeraldEssence = new EmeraldEssence().setUnlocalizedName("EmeraldEssence");

    // Mob Essences
    public static Item BlazeEssence = new BlazeEssence().setUnlocalizedName("BlazeEssence");
    public static Item CreeperEssence = new CreeperEssence().setUnlocalizedName("CreeperEssence");
    public static Item EndermanEssence = new EndermanEssence().setUnlocalizedName("EndermanEssence");
    public static Item GhastEssence = new GhastEssence().setUnlocalizedName("GhastEssence");
    public static Item SkeletonEssence = new SkeletonEssence().setUnlocalizedName("SkeletonEssence");
    public static Item SlimeEssence = new SlimeEssence().setUnlocalizedName("SlimeEssence");
    public static Item SpiderEssence = new SpiderEssence().setUnlocalizedName("SpiderEssence");
    public static Item WitherEssence = new WitherEssence().setUnlocalizedName("WitherEssence");

    // Passive Mob Essences
    public static Item ChickenEssence = new ChickenEssence().setUnlocalizedName("ChickenEssence");
    public static Item CowEssence = new CowEssence().setUnlocalizedName("CowEssence");
    public static Item PigEssence = new PigEssence().setUnlocalizedName("PigEssence");
    public static Item SheepEssence = new SheepEssence().setUnlocalizedName("SheepEssence");
}