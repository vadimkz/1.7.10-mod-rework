package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.config.ConfigDisable;
import com.mark719.magicalcrops.handlers.MCrops;
import com.mark719.magicalcrops.items.seeds.*;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/**
 * ВАЖНО: в нашем проекте MCrops теперь создаётся через MCrops.init().
 * Поэтому MSeeds НЕ должен создавать семена в статических полях (иначе crop = null).
 *
 * Использование:
 *   MCrops.init();
 *   MSeeds.init();
 * и только потом ItemRegister.registerItem();
 */
public class MSeeds {

    /** Ванильная пашня для посадки (как в оригинале) */
    public static final Block farmland = Blocks.farmland;

    public static Item AirSeeds;
    public static Item CoalSeeds;
    public static Item DyeSeeds;
    public static Item EarthSeeds;
    public static Item FireSeeds;
    public static Item NatureSeeds;
    public static Item MinicioSeeds;
    public static Item WaterSeeds;

    public static Item RedstoneSeeds;
    public static Item GlowstoneSeeds;
    public static Item ObsidianSeeds;
    public static Item NetherSeeds;

    public static Item IronSeeds;
    public static Item GoldSeeds;
    public static Item LapisSeeds;
    public static Item ExperienceSeeds;
    public static Item QuartzSeeds;
    public static Item DiamondSeeds;
    public static Item EmeraldSeeds;

    public static Item BlazeSeeds;
    public static Item CreeperSeeds;
    public static Item EndermanSeeds;
    public static Item GhastSeeds;
    public static Item SkeletonSeeds;
    public static Item SlimeSeeds;
    public static Item SpiderSeeds;
    public static Item WitherSeeds;

    public static Item ChickenSeeds;
    public static Item CowSeeds;
    public static Item PigSeeds;
    public static Item SheepSeeds;

    public static void init() {
        // Базовые
        if (!ConfigDisable.AIR) AirSeeds = new AirSeeds(MCrops.AirCrop, farmland).setTextureName("magicalcrops:seeds_air").setUnlocalizedName("AirSeeds");
        if (!ConfigDisable.COAL) CoalSeeds = new CoalSeeds(MCrops.CoalCrop, farmland).setTextureName("magicalcrops:seeds_coal").setUnlocalizedName("CoalSeeds");
        if (!ConfigDisable.DYE) DyeSeeds = new DyeSeeds(MCrops.DyeCrop, farmland).setTextureName("magicalcrops:seeds_dye").setUnlocalizedName("DyeSeeds");
        if (!ConfigDisable.EARTH) EarthSeeds = new EarthSeeds(MCrops.EarthCrop, farmland).setTextureName("magicalcrops:seeds_earth").setUnlocalizedName("EarthSeeds");
        if (!ConfigDisable.FIRE) FireSeeds = new FireSeeds(MCrops.FireCrop, farmland).setTextureName("magicalcrops:seeds_fire").setUnlocalizedName("FireSeeds");
        if (!ConfigDisable.NATURE) NatureSeeds = new NatureSeeds(MCrops.NatureCrop, farmland).setTextureName("magicalcrops:seeds_nature").setUnlocalizedName("NatureSeeds");
        if (!ConfigDisable.MINICIO) MinicioSeeds = new MinicioSeeds(MCrops.MinicioCrop, farmland).setTextureName("magicalcrops:seeds_minicio").setUnlocalizedName("MinicioSeeds");
        if (!ConfigDisable.WATER) WaterSeeds = new WaterSeeds(MCrops.WaterCrop, farmland).setTextureName("magicalcrops:seeds_water").setUnlocalizedName("WaterSeeds");

        // Ресурсы
        if (!ConfigDisable.REDSTONE) RedstoneSeeds = new RedstoneSeeds(MCrops.RedstoneCrop, farmland).setTextureName("magicalcrops:seeds_redstone").setUnlocalizedName("RedstoneSeeds");
        if (!ConfigDisable.GLOWSTONE) GlowstoneSeeds = new GlowstoneSeeds(MCrops.GlowstoneCrop, farmland).setTextureName("magicalcrops:seeds_glowstone").setUnlocalizedName("GlowstoneSeeds");
        if (!ConfigDisable.OBSIDIAN) ObsidianSeeds = new ObsidianSeeds(MCrops.ObsidianCrop, farmland).setTextureName("magicalcrops:seeds_obsidian").setUnlocalizedName("ObsidianSeeds");
        if (!ConfigDisable.NETHER) NetherSeeds = new NetherSeeds(MCrops.NetherCrop, farmland).setTextureName("magicalcrops:seeds_nether").setUnlocalizedName("NetherSeeds");

        // Руды/драгоценности
        if (!ConfigDisable.IRON) IronSeeds = new IronSeeds(MCrops.IronCrop, farmland).setTextureName("magicalcrops:seeds_iron").setUnlocalizedName("IronSeeds");
        if (!ConfigDisable.GOLD) GoldSeeds = new GoldSeeds(MCrops.GoldCrop, farmland).setTextureName("magicalcrops:seeds_gold").setUnlocalizedName("GoldSeeds");
        if (!ConfigDisable.LAPIS) LapisSeeds = new LapisSeeds(MCrops.LapisCrop, farmland).setTextureName("magicalcrops:seeds_lapis").setUnlocalizedName("LapisSeeds");
        if (!ConfigDisable.EXPERIENCE) ExperienceSeeds = new ExperienceSeeds(MCrops.ExperienceCrop, farmland).setTextureName("magicalcrops:seeds_experience").setUnlocalizedName("ExperienceSeeds");
        if (!ConfigDisable.QUARTZ) QuartzSeeds = new QuartzSeeds(MCrops.QuartzCrop, farmland).setTextureName("magicalcrops:seeds_quartz").setUnlocalizedName("QuartzSeeds");
        if (!ConfigDisable.DIAMOND) DiamondSeeds = new DiamondSeeds(MCrops.DiamondCrop, farmland).setTextureName("magicalcrops:seeds_diamond").setUnlocalizedName("DiamondSeeds");
        if (!ConfigDisable.EMERALD) EmeraldSeeds = new EmeraldSeeds(MCrops.EmeraldCrop, farmland).setTextureName("magicalcrops:seeds_emerald").setUnlocalizedName("EmeraldSeeds");

        // Мобы
        if (!ConfigDisable.BLAZE) BlazeSeeds = new BlazeSeeds(MCrops.BlazeCrop, farmland).setTextureName("magicalcrops:seeds_blaze").setUnlocalizedName("BlazeSeeds");
        if (!ConfigDisable.CREEPER) CreeperSeeds = new CreeperSeeds(MCrops.CreeperCrop, farmland).setTextureName("magicalcrops:seeds_creeper").setUnlocalizedName("CreeperSeeds");
        if (!ConfigDisable.ENDERMAN) EndermanSeeds = new EndermanSeeds(MCrops.EndermanCrop, farmland).setTextureName("magicalcrops:seeds_enderman").setUnlocalizedName("EndermanSeeds");
        if (!ConfigDisable.GHAST) GhastSeeds = new GhastSeeds(MCrops.GhastCrop, farmland).setTextureName("magicalcrops:seeds_ghast").setUnlocalizedName("GhastSeeds");
        if (!ConfigDisable.SKELETON) SkeletonSeeds = new SkeletonSeeds(MCrops.SkeletonCrop, farmland).setTextureName("magicalcrops:seeds_skeleton").setUnlocalizedName("SkeletonSeeds");
        if (!ConfigDisable.SLIME) SlimeSeeds = new SlimeSeeds(MCrops.SlimeCrop, farmland).setTextureName("magicalcrops:seeds_slime").setUnlocalizedName("SlimeSeeds");
        if (!ConfigDisable.SPIDER) SpiderSeeds = new SpiderSeeds(MCrops.SpiderCrop, farmland).setTextureName("magicalcrops:seeds_spider").setUnlocalizedName("SpiderSeeds");
        if (!ConfigDisable.WITHER) WitherSeeds = new WitherSeeds(MCrops.WitherCrop, farmland).setTextureName("magicalcrops:seeds_wither").setUnlocalizedName("WitherSeeds");

        // Животные
        if (!ConfigDisable.CHICKEN) ChickenSeeds = new ChickenSeeds(MCrops.ChickenCrop, farmland).setTextureName("magicalcrops:seeds_chicken").setUnlocalizedName("ChickenSeeds");
        if (!ConfigDisable.COW) CowSeeds = new CowSeeds(MCrops.CowCrop, farmland).setTextureName("magicalcrops:seeds_cow").setUnlocalizedName("CowSeeds");
        if (!ConfigDisable.PIG) PigSeeds = new PigSeeds(MCrops.PigCrop, farmland).setTextureName("magicalcrops:seeds_pig").setUnlocalizedName("PigSeeds");
        if (!ConfigDisable.SHEEP) SheepSeeds = new SheepSeeds(MCrops.SheepCrop, farmland).setTextureName("magicalcrops:seeds_sheep").setUnlocalizedName("SheepSeeds");
    }
}
