package com.mark719.magicalcrops.recipes;

import com.mark719.magicalcrops.config.ConfigMain;
import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MSeeds;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class SeedRecipes {
    static int seedOutPut = ConfigMain.SEED_OUTPUT;

    static Item minicioEssence = Essence.MinicioEssence;
    static Item accioEssence = Essence.AccioEssence;
    static Item crucioEssence = Essence.CrucioEssence;
    static Item imperioEssence = Essence.ImperioEssence;
    static Item zivicioEssence = Essence.ZivicioEssence;

    static ItemStack allDye = new ItemStack(Items.dye, 1, 32767);
    static ItemStack minicioSeed = new ItemStack(MSeeds.MinicioSeeds);
    static ItemStack enchantedBook = new ItemStack(Items.enchanted_book, 1, 32767);

    static ItemStack airSeeds = new ItemStack(MSeeds.AirSeeds, 1, 32767);
    static ItemStack coalSeeds = new ItemStack(MSeeds.CoalSeeds, 1, 32767);
    static ItemStack diamondSeeds = new ItemStack(MSeeds.DiamondSeeds, 1, 32767);
    static ItemStack dyeSeeds = new ItemStack(MSeeds.DyeSeeds, 1, 32767);
    static ItemStack earthSeeds = new ItemStack(MSeeds.EarthSeeds, 1, 32767);
    static ItemStack emeraldSeeds = new ItemStack(MSeeds.EmeraldSeeds, 1, 32767);
    static ItemStack experienceSeeds = new ItemStack(MSeeds.ExperienceSeeds, 1, 32767);
    static ItemStack fireSeeds = new ItemStack(MSeeds.FireSeeds, 1, 32767);
    static ItemStack glowstoneSeeds = new ItemStack(MSeeds.GlowstoneSeeds, 1, 32767);
    static ItemStack goldSeeds = new ItemStack(MSeeds.GoldSeeds, 1, 32767);
    static ItemStack ironSeeds = new ItemStack(MSeeds.IronSeeds, 1, 32767);
    static ItemStack lapisSeeds = new ItemStack(MSeeds.LapisSeeds, 1, 32767);
    static ItemStack minicioSeeds = new ItemStack(MSeeds.MinicioSeeds, 1, 32767);
    static ItemStack natureSeeds = new ItemStack(MSeeds.NatureSeeds, 1, 32767);
    static ItemStack netherSeeds = new ItemStack(MSeeds.NetherSeeds, 1, 32767);
    static ItemStack obsidianSeeds = new ItemStack(MSeeds.ObsidianSeeds, 1, 32767);
    static ItemStack quartzSeeds = new ItemStack(MSeeds.QuartzSeeds, 1, 32767);
    static ItemStack redstoneSeeds = new ItemStack(MSeeds.RedstoneSeeds, 1, 32767);
    static ItemStack waterSeeds = new ItemStack(MSeeds.WaterSeeds, 1, 32767);

    static ItemStack cowSeeds = new ItemStack(MSeeds.CowSeeds, 1, 32767);
    static ItemStack chickenSeeds = new ItemStack(MSeeds.ChickenSeeds, 1, 32767);
    static ItemStack sheepSeeds = new ItemStack(MSeeds.SheepSeeds, 1, 32767);
    static ItemStack pigSeeds = new ItemStack(MSeeds.PigSeeds, 1, 32767);
    static ItemStack creeperSeeds = new ItemStack(MSeeds.CreeperSeeds, 1, 32767);
    static ItemStack blazeSeeds = new ItemStack(MSeeds.BlazeSeeds, 1, 32767);
    static ItemStack ghastSeeds = new ItemStack(MSeeds.GhastSeeds, 1, 32767);
    static ItemStack skeletonSeeds = new ItemStack(MSeeds.SkeletonSeeds, 1, 32767);
    static ItemStack slimeSeeds = new ItemStack(MSeeds.SlimeSeeds, 1, 32767);
    static ItemStack spiderSeeds = new ItemStack(MSeeds.SpiderSeeds, 1, 32767);
    static ItemStack witherSeeds = new ItemStack(MSeeds.WitherSeeds, 1, 32767);
    static ItemStack endermanSeeds = new ItemStack(MSeeds.EndermanSeeds, 1, 32767);

    public static void loadRecipes() {
        // Базовые семена
        GameRegistry.addRecipe(new ItemStack(MSeeds.MinicioSeeds, 1), "XXX", "XYX", "XXX", 'X', minicioEssence, 'Y', Items.wheat_seeds);

        // Уровень Accio
        GameRegistry.addRecipe(new ItemStack(MSeeds.CoalSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', accioEssence, 'Y', Items.coal, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.DyeSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', accioEssence, 'Y', allDye, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.WaterSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', accioEssence, 'Y', Items.water_bucket, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.FireSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', accioEssence, 'Y', Items.lava_bucket, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.EarthSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', accioEssence, 'Y', Blocks.dirt, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.AirSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', accioEssence, 'Y', Items.feather, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MSeeds.NatureSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', accioEssence, 'Y', "natureMaterial", 'Z', minicioSeed));

        // Уровень Crucio
        GameRegistry.addRecipe(new ItemStack(MSeeds.RedstoneSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', crucioEssence, 'Y', Items.redstone, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.GlowstoneSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', crucioEssence, 'Y', Items.glowstone_dust, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.ObsidianSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', crucioEssence, 'Y', Blocks.obsidian, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MSeeds.NetherSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', crucioEssence, 'Y', "netherMaterial", 'Z', minicioSeed));

        // Уровень Imperio
        GameRegistry.addRecipe(new ItemStack(MSeeds.IronSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', Items.iron_ingot, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.GoldSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', Items.gold_ingot, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.LapisSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', new ItemStack(Items.dye, 1, 4), 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.ExperienceSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Z', minicioSeed, 'Y', enchantedBook);
        GameRegistry.addRecipe(new ItemStack(MSeeds.QuartzSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', Items.quartz, 'Z', minicioSeed);

        // Уровень Zivicio
        GameRegistry.addRecipe(new ItemStack(MSeeds.DiamondSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', zivicioEssence, 'Y', Items.diamond, 'Z', minicioSeed);
        GameRegistry.addRecipe(new ItemStack(MSeeds.EmeraldSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', zivicioEssence, 'Y', Items.emerald, 'Z', minicioSeed);

        // Моб-семена
        GameRegistry.addRecipe(new ItemStack(MSeeds.CowSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', crucioEssence, 'Y', Items.leather, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.PigSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', crucioEssence, 'Y', Items.porkchop, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.ChickenSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', crucioEssence, 'Y', Items.egg, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.SheepSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', crucioEssence, 'Y', Blocks.wool, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.CreeperSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', Items.gunpowder, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.BlazeSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', Items.blaze_rod, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.EndermanSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', Items.ender_pearl, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.SkeletonSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', Items.bone, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.SlimeSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', Items.slime_ball, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.SpiderSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', Items.spider_eye, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.GhastSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', imperioEssence, 'Y', Items.ghast_tear, 'Z', minicioSeeds);
        GameRegistry.addRecipe(new ItemStack(MSeeds.WitherSeeds, seedOutPut), "YXY", "XZX", "YXY", 'X', zivicioEssence, 'Y', new ItemStack(Items.skull, 1, 1), 'Z', skeletonSeeds);

        // Эссенции из семян
        registerEssenceRecipe(Essence.AirEssence, airSeeds);
        registerEssenceRecipe(Essence.CoalEssence, coalSeeds);
        registerEssenceRecipe(Essence.DiamondEssence, diamondSeeds);
        registerEssenceRecipe(Essence.DyeEssence, dyeSeeds);
        registerEssenceRecipe(Essence.EarthEssence, earthSeeds);
        registerEssenceRecipe(Essence.EmeraldEssence, emeraldSeeds);
        registerEssenceRecipe(Essence.ExperienceEssence, experienceSeeds);
        registerEssenceRecipe(Essence.FireEssence, fireSeeds);
        registerEssenceRecipe(Essence.GlowstoneEssence, glowstoneSeeds);
        registerEssenceRecipe(Essence.GoldEssence, goldSeeds);
        registerEssenceRecipe(Essence.IronEssence, ironSeeds);
        registerEssenceRecipe(Essence.LapisEssence, lapisSeeds);
        registerEssenceRecipe(Essence.NatureEssence, natureSeeds);
        registerEssenceRecipe(Essence.NetherEssence, netherSeeds);
        registerEssenceRecipe(Essence.ObsidianEssence, obsidianSeeds);
        registerEssenceRecipe(Essence.QuartzEssence, quartzSeeds);
        registerEssenceRecipe(Essence.RedstoneEssence, redstoneSeeds);
        registerEssenceRecipe(Essence.WaterEssence, waterSeeds);

        // Эссенции мобов
        registerEssenceRecipe(Essence.CowEssence, cowSeeds);
        registerEssenceRecipe(Essence.ChickenEssence, chickenSeeds);
        registerEssenceRecipe(Essence.SheepEssence, sheepSeeds);
        registerEssenceRecipe(Essence.PigEssence, pigSeeds);
        registerEssenceRecipe(Essence.CreeperEssence, creeperSeeds);
        registerEssenceRecipe(Essence.BlazeEssence, blazeSeeds);
        registerEssenceRecipe(Essence.EndermanEssence, endermanSeeds);
        registerEssenceRecipe(Essence.SkeletonEssence, skeletonSeeds);
        registerEssenceRecipe(Essence.SlimeEssence, slimeSeeds);
        registerEssenceRecipe(Essence.SpiderEssence, spiderSeeds);
        registerEssenceRecipe(Essence.GhastEssence, ghastSeeds);
        registerEssenceRecipe(Essence.WitherEssence, witherSeeds);
    }

    /**
     * Вспомогательный метод для регистрации крафта эссенции из 9 семян.
     */
    private static void registerEssenceRecipe(Item essence, ItemStack seed) {
        GameRegistry.addRecipe(new ItemStack(essence, 1), "XXX", "XXX", "XXX", 'X', seed);
    }
}