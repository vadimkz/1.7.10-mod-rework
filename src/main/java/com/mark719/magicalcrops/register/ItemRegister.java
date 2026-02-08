package com.mark719.magicalcrops.register;

import com.mark719.magicalcrops.config.ConfigDisable;
import com.mark719.magicalcrops.config.ConfigMain;
import com.mark719.magicalcrops.handlers.Armour;
import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MItems;
import com.mark719.magicalcrops.handlers.MSeeds;
import com.mark719.magicalcrops.handlers.Tools;
import com.mark719.magicalcrops.help.ItemRegisterHelper;
import net.minecraft.item.Item;

public class ItemRegister {

    public static void registerItem() {

        // Infusion stones
        registerItem(MItems.InfusionStoneWeak, "InfusionStoneWeak");
        registerItem(MItems.InfusionStoneRegular, "InfusionStoneRegular");
        registerItem(MItems.InfusionStoneStrong, "InfusionStoneStrong");
        registerItem(MItems.InfusionStoneExtreme, "InfusionStoneExtreme");
        registerItem(MItems.InfusionStoneMaster, "InfusionStoneMaster");

        // === SEEDS (register only when NOT disabled) ===
        if (!ConfigDisable.AIR && MSeeds.AirSeeds != null) registerItem(MSeeds.AirSeeds, "AirSeeds");
        if (!ConfigDisable.COAL && MSeeds.CoalSeeds != null) registerItem(MSeeds.CoalSeeds, "CoalSeeds");
        if (!ConfigDisable.DYE && MSeeds.DyeSeeds != null) registerItem(MSeeds.DyeSeeds, "DyeSeeds");
        if (!ConfigDisable.EARTH && MSeeds.EarthSeeds != null) registerItem(MSeeds.EarthSeeds, "EarthSeeds");
        if (!ConfigDisable.FIRE && MSeeds.FireSeeds != null) registerItem(MSeeds.FireSeeds, "FireSeeds");
        if (!ConfigDisable.MINICIO && MSeeds.MinicioSeeds != null) registerItem(MSeeds.MinicioSeeds, "MinicioSeeds");
        if (!ConfigDisable.NATURE && MSeeds.NatureSeeds != null) registerItem(MSeeds.NatureSeeds, "NatureSeeds");
        if (!ConfigDisable.WATER && MSeeds.WaterSeeds != null) registerItem(MSeeds.WaterSeeds, "WaterSeeds");
        if (!ConfigDisable.REDSTONE && MSeeds.RedstoneSeeds != null) registerItem(MSeeds.RedstoneSeeds, "RedstoneSeeds");
        if (!ConfigDisable.GLOWSTONE && MSeeds.GlowstoneSeeds != null) registerItem(MSeeds.GlowstoneSeeds, "GlowstoneSeeds");
        if (!ConfigDisable.OBSIDIAN && MSeeds.ObsidianSeeds != null) registerItem(MSeeds.ObsidianSeeds, "ObsidianSeeds");
        if (!ConfigDisable.NETHER && MSeeds.NetherSeeds != null) registerItem(MSeeds.NetherSeeds, "NetherSeeds");
        if (!ConfigDisable.IRON && MSeeds.IronSeeds != null) registerItem(MSeeds.IronSeeds, "IronSeeds");
        if (!ConfigDisable.GOLD && MSeeds.GoldSeeds != null) registerItem(MSeeds.GoldSeeds, "GoldSeeds");
        if (!ConfigDisable.LAPIS && MSeeds.LapisSeeds != null) registerItem(MSeeds.LapisSeeds, "LapisSeeds");
        if (!ConfigDisable.EXPERIENCE && MSeeds.ExperienceSeeds != null) registerItem(MSeeds.ExperienceSeeds, "ExperienceSeeds");
        if (!ConfigDisable.QUARTZ && MSeeds.QuartzSeeds != null) registerItem(MSeeds.QuartzSeeds, "QuartzSeeds");
        if (!ConfigDisable.DIAMOND && MSeeds.DiamondSeeds != null) registerItem(MSeeds.DiamondSeeds, "DiamondSeeds");
        if (!ConfigDisable.EMERALD && MSeeds.EmeraldSeeds != null) registerItem(MSeeds.EmeraldSeeds, "EmeraldSeeds");

        if (!ConfigDisable.BLAZE && MSeeds.BlazeSeeds != null) registerItem(MSeeds.BlazeSeeds, "BlazeSeeds");
        if (!ConfigDisable.CREEPER && MSeeds.CreeperSeeds != null) registerItem(MSeeds.CreeperSeeds, "CreeperSeeds");
        if (!ConfigDisable.ENDERMAN && MSeeds.EndermanSeeds != null) registerItem(MSeeds.EndermanSeeds, "EndermanSeeds");
        if (!ConfigDisable.GHAST && MSeeds.GhastSeeds != null) registerItem(MSeeds.GhastSeeds, "GhastSeeds");
        if (!ConfigDisable.SKELETON && MSeeds.SkeletonSeeds != null) registerItem(MSeeds.SkeletonSeeds, "SkeletonSeeds");
        if (!ConfigDisable.SLIME && MSeeds.SlimeSeeds != null) registerItem(MSeeds.SlimeSeeds, "SlimeSeeds");
        if (!ConfigDisable.SPIDER && MSeeds.SpiderSeeds != null) registerItem(MSeeds.SpiderSeeds, "SpiderSeeds");
        if (!ConfigDisable.WITHER && MSeeds.WitherSeeds != null) registerItem(MSeeds.WitherSeeds, "WitherSeeds");

        if (!ConfigDisable.CHICKEN && MSeeds.ChickenSeeds != null) registerItem(MSeeds.ChickenSeeds, "ChickenSeeds");
        if (!ConfigDisable.COW && MSeeds.CowSeeds != null) registerItem(MSeeds.CowSeeds, "CowSeeds");
        if (!ConfigDisable.PIG && MSeeds.PigSeeds != null) registerItem(MSeeds.PigSeeds, "PigSeeds");
        if (!ConfigDisable.SHEEP && MSeeds.SheepSeeds != null) registerItem(MSeeds.SheepSeeds, "SheepSeeds");

        // Fertilizers & misc
        registerItem(MItems.MagicalFertilizer, "MagicalFertilizer");
        registerItem(MItems.EssenceFertilizer, "EssenceFertilizer");
        registerItem(MItems.EssenceIngots, "EssenceIngots");

        if (ConfigMain.ENCHANT_CRAFT)
            registerItem(MItems.ExperienceBook, "ExperienceBook");

        // Base essences
        registerItem(Essence.MinicioEssence, "MinicioEssence");
        registerItem(Essence.AccioEssence, "AccioEssence");
        registerItem(Essence.CrucioEssence, "CrucioEssence");
        registerItem(Essence.ImperioEssence, "ImperioEssence");
        registerItem(Essence.ZivicioEssence, "ZivicioEssence");
        registerItem(Essence.TaintedEssence, "TaintedEssence");

        // === ESSENCES (register only when NOT disabled) ===
        if (!ConfigDisable.AIR) registerItem(Essence.AirEssence, "AirEssence");
        if (!ConfigDisable.COAL) registerItem(Essence.CoalEssence, "CoalEssence");
        if (!ConfigDisable.DYE) registerItem(Essence.DyeEssence, "DyeEssence");
        if (!ConfigDisable.EARTH) registerItem(Essence.EarthEssence, "EarthEssence");
        if (!ConfigDisable.FIRE) registerItem(Essence.FireEssence, "FireEssence");
        if (!ConfigDisable.NATURE) registerItem(Essence.NatureEssence, "NatureEssence");
        if (!ConfigDisable.WATER) registerItem(Essence.WaterEssence, "WaterEssence");
        if (!ConfigDisable.REDSTONE) registerItem(Essence.RedstoneEssence, "RedstoneEssence");
        if (!ConfigDisable.GLOWSTONE) registerItem(Essence.GlowstoneEssence, "GlowstoneEssence");
        if (!ConfigDisable.OBSIDIAN) registerItem(Essence.ObsidianEssence, "ObsidianEssence");
        if (!ConfigDisable.NETHER) registerItem(Essence.NetherEssence, "NetherEssence");
        if (!ConfigDisable.IRON) registerItem(Essence.IronEssence, "IronEssence");
        if (!ConfigDisable.GOLD) registerItem(Essence.GoldEssence, "GoldEssence");
        if (!ConfigDisable.LAPIS) registerItem(Essence.LapisEssence, "LapisEssence");
        if (!ConfigDisable.EXPERIENCE) registerItem(Essence.ExperienceEssence, "ExperienceEssence");
        if (!ConfigDisable.QUARTZ) registerItem(Essence.QuartzEssence, "QuartzEssence");
        if (!ConfigDisable.DIAMOND) registerItem(Essence.DiamondEssence, "DiamondEssence");
        if (!ConfigDisable.EMERALD) registerItem(Essence.EmeraldEssence, "EmeraldEssence");

        if (!ConfigDisable.BLAZE) registerItem(Essence.BlazeEssence, "BlazeEssence");
        if (!ConfigDisable.CREEPER) registerItem(Essence.CreeperEssence, "CreeperEssence");
        if (!ConfigDisable.ENDERMAN) registerItem(Essence.EndermanEssence, "EndermanEssence");
        if (!ConfigDisable.GHAST) registerItem(Essence.GhastEssence, "GhastEssence");
        if (!ConfigDisable.SKELETON) registerItem(Essence.SkeletonEssence, "SkeletonEssence");
        if (!ConfigDisable.SLIME) registerItem(Essence.SlimeEssence, "SlimeEssence");
        if (!ConfigDisable.SPIDER) registerItem(Essence.SpiderEssence, "SpiderEssence");
        if (!ConfigDisable.WITHER) registerItem(Essence.WitherEssence, "WitherEssence");
        if (!ConfigDisable.CHICKEN) registerItem(Essence.ChickenEssence, "ChickenEssence");
        if (!ConfigDisable.COW) registerItem(Essence.CowEssence, "CowEssence");
        if (!ConfigDisable.PIG) registerItem(Essence.PigEssence, "PigEssence");
        if (!ConfigDisable.SHEEP) registerItem(Essence.SheepEssence, "SheepEssence");

        // Armour
        registerItem(Armour.AccioArmourHelmet, "AccioArmourHelmet");
        registerItem(Armour.AccioArmourChestplate, "AccioArmourChestplate");
        registerItem(Armour.AccioArmourLeggings, "AccioArmourLeggings");
        registerItem(Armour.AccioArmourBoots, "AccioArmourBoots");

        registerItem(Armour.CrucioArmourHelmet, "CrucioArmourHelmet");
        registerItem(Armour.CrucioArmourChestplate, "CrucioArmourChestplate");
        registerItem(Armour.CrucioArmourLeggings, "CrucioArmourLeggings");
        registerItem(Armour.CrucioArmourBoots, "CrucioArmourBoots");

        registerItem(Armour.ImperioArmourHelmet, "ImperioArmourHelmet");
        registerItem(Armour.ImperioArmourChestplate, "ImperioArmourChestplate");
        registerItem(Armour.ImperioArmourLeggings, "ImperioArmourLeggings");
        registerItem(Armour.ImperioArmourBoots, "ImperioArmourBoots");

        registerItem(Armour.ZivicioArmourHelmet, "ZivicioArmourHelmet");
        registerItem(Armour.ZivicioArmourChestplate, "ZivicioArmourChestplate");
        registerItem(Armour.ZivicioArmourLeggings, "ZivicioArmourLeggings");
        registerItem(Armour.ZivicioArmourBoots, "ZivicioArmourBoots");

        registerItem(Armour.ZivicioArmourHelmetFeed, "ZivicioArmourHelmetFeed");
        registerItem(Armour.ZivicioArmourHelmetNight, "ZivicioArmourHelmetNight");
        registerItem(Armour.ZivicioArmourHelmetWater, "ZivicioArmourHelmetWater");

        registerItem(Armour.ZivicioArmourChestplateFire, "ZivicioArmourChestplateFire");
        registerItem(Armour.ZivicioArmourChestplateWither, "ZivicioArmourChestplateWither");
        registerItem(Armour.ZivicioArmourChestplatePoison, "ZivicioArmourChestplatePoison");

        registerItem(Armour.ZivicioArmourLeggingsBlind, "ZivicioArmourLeggingsBlind");
        registerItem(Armour.ZivicioArmourLeggingsWeak, "ZivicioArmourLeggingsWeak");
        registerItem(Armour.ZivicioArmourLeggingsConfusion, "ZivicioArmourLeggingsConfusion");

        registerItem(Armour.ZivicioArmourBootsStep, "ZivicioArmourBootsStep");
        registerItem(Armour.ZivicioArmourBootsSpeed, "ZivicioArmourBootsSpeed");
        registerItem(Armour.ZivicioArmourBootsJump, "ZivicioArmourBootsJump");

        // Tools
        registerItem(Tools.AccioPickaxe, "AccioPickaxe");
        registerItem(Tools.AccioSword, "AccioSword");
        registerItem(Tools.AccioAxe, "AccioAxe");
        registerItem(Tools.AccioShovel, "AccioShovel");
        registerItem(Tools.AccioHoe, "AccioHoe");

        registerItem(Tools.CrucioPickaxe, "CrucioPickaxe");
        registerItem(Tools.CrucioSword, "CrucioSword");
        registerItem(Tools.CrucioAxe, "CrucioAxe");
        registerItem(Tools.CrucioShovel, "CrucioShovel");
        registerItem(Tools.CrucioHoe, "CrucioHoe");

        registerItem(Tools.ImperioPickaxe, "ImperioPickaxe");
        registerItem(Tools.ImperioSword, "ImperioSword");
        registerItem(Tools.ImperioAxe, "ImperioAxe");
        registerItem(Tools.ImperioShovel, "ImperioShovel");
        registerItem(Tools.ImperioHoe, "ImperioHoe");

        registerItem(Tools.ZivicioPickaxe, "ZivicioPickaxe");
        registerItem(Tools.ZivicioSword, "ZivicioSword");
        registerItem(Tools.ZivicioAxe, "ZivicioAxe");
        registerItem(Tools.ZivicioShovel, "ZivicioShovel");
        registerItem(Tools.ZivicioHoe, "ZivicioHoe");

        // Seed bags
        registerItem(MItems.SeedBagAccio, "SeedBagAccio");
        registerItem(MItems.SeedBagCrucio, "SeedBagCrucio");
        registerItem(MItems.SeedBagImperio, "SeedBagImperio");
        registerItem(MItems.SeedBagZivicio, "SeedBagZivicio");

        if (ConfigMain.APPLES) {
            registerItem(MItems.UltimateDiamondApple, "UltimateDiamondApple");
            registerItem(MItems.EmeraldApple, "EmeraldApple");
            registerItem(MItems.UltimateEmeraldApple, "UltimateEmeraldApple");
        }
    }

    private static void registerItem(Item item, String fieldName) {
        ItemRegisterHelper.registerItem(item, fieldName);
    }
}
