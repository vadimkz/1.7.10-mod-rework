package com.mark719.magicalcrops.register;

import com.mark719.magicalcrops.config.ConfigDisable;
import com.mark719.magicalcrops.config.ConfigMain;
import com.mark719.magicalcrops.handlers.Armour;
import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MItems;
import com.mark719.magicalcrops.handlers.MSeeds;
import com.mark719.magicalcrops.handlers.Tools;
import com.mark719.magicalcrops.help.ItemRegisterHelper;

public class ItemRegister {

    public static void registerItem() {

        // Infusion stones
        ItemRegisterHelper.registerItem(MItems.InfusionStoneWeak);
        ItemRegisterHelper.registerItem(MItems.InfusionStoneRegular);
        ItemRegisterHelper.registerItem(MItems.InfusionStoneStrong);
        ItemRegisterHelper.registerItem(MItems.InfusionStoneExtreme);
        ItemRegisterHelper.registerItem(MItems.InfusionStoneMaster);

        // === SEEDS (register only when NOT disabled) ===
        if (!ConfigDisable.AIR && MSeeds.AirSeeds != null) ItemRegisterHelper.registerItem(MSeeds.AirSeeds);
        if (!ConfigDisable.COAL && MSeeds.CoalSeeds != null) ItemRegisterHelper.registerItem(MSeeds.CoalSeeds);
        if (!ConfigDisable.DYE && MSeeds.DyeSeeds != null) ItemRegisterHelper.registerItem(MSeeds.DyeSeeds);
        if (!ConfigDisable.EARTH && MSeeds.EarthSeeds != null) ItemRegisterHelper.registerItem(MSeeds.EarthSeeds);
        if (!ConfigDisable.FIRE && MSeeds.FireSeeds != null) ItemRegisterHelper.registerItem(MSeeds.FireSeeds);
        if (!ConfigDisable.MINICIO && MSeeds.MinicioSeeds != null) ItemRegisterHelper.registerItem(MSeeds.MinicioSeeds);
        if (!ConfigDisable.NATURE && MSeeds.NatureSeeds != null) ItemRegisterHelper.registerItem(MSeeds.NatureSeeds);
        if (!ConfigDisable.WATER && MSeeds.WaterSeeds != null) ItemRegisterHelper.registerItem(MSeeds.WaterSeeds);
        if (!ConfigDisable.REDSTONE && MSeeds.RedstoneSeeds != null) ItemRegisterHelper.registerItem(MSeeds.RedstoneSeeds);
        if (!ConfigDisable.GLOWSTONE && MSeeds.GlowstoneSeeds != null) ItemRegisterHelper.registerItem(MSeeds.GlowstoneSeeds);
        if (!ConfigDisable.OBSIDIAN && MSeeds.ObsidianSeeds != null) ItemRegisterHelper.registerItem(MSeeds.ObsidianSeeds);
        if (!ConfigDisable.NETHER && MSeeds.NetherSeeds != null) ItemRegisterHelper.registerItem(MSeeds.NetherSeeds);
        if (!ConfigDisable.IRON && MSeeds.IronSeeds != null) ItemRegisterHelper.registerItem(MSeeds.IronSeeds);
        if (!ConfigDisable.GOLD && MSeeds.GoldSeeds != null) ItemRegisterHelper.registerItem(MSeeds.GoldSeeds);
        if (!ConfigDisable.LAPIS && MSeeds.LapisSeeds != null) ItemRegisterHelper.registerItem(MSeeds.LapisSeeds);
        if (!ConfigDisable.EXPERIENCE && MSeeds.ExperienceSeeds != null) ItemRegisterHelper.registerItem(MSeeds.ExperienceSeeds);
        if (!ConfigDisable.QUARTZ && MSeeds.QuartzSeeds != null) ItemRegisterHelper.registerItem(MSeeds.QuartzSeeds);
        if (!ConfigDisable.DIAMOND && MSeeds.DiamondSeeds != null) ItemRegisterHelper.registerItem(MSeeds.DiamondSeeds);
        if (!ConfigDisable.EMERALD && MSeeds.EmeraldSeeds != null) ItemRegisterHelper.registerItem(MSeeds.EmeraldSeeds);

        if (!ConfigDisable.BLAZE && MSeeds.BlazeSeeds != null) ItemRegisterHelper.registerItem(MSeeds.BlazeSeeds);
        if (!ConfigDisable.CREEPER && MSeeds.CreeperSeeds != null) ItemRegisterHelper.registerItem(MSeeds.CreeperSeeds);
        if (!ConfigDisable.ENDERMAN && MSeeds.EndermanSeeds != null) ItemRegisterHelper.registerItem(MSeeds.EndermanSeeds);
        if (!ConfigDisable.GHAST && MSeeds.GhastSeeds != null) ItemRegisterHelper.registerItem(MSeeds.GhastSeeds);
        if (!ConfigDisable.SKELETON && MSeeds.SkeletonSeeds != null) ItemRegisterHelper.registerItem(MSeeds.SkeletonSeeds);
        if (!ConfigDisable.SLIME && MSeeds.SlimeSeeds != null) ItemRegisterHelper.registerItem(MSeeds.SlimeSeeds);
        if (!ConfigDisable.SPIDER && MSeeds.SpiderSeeds != null) ItemRegisterHelper.registerItem(MSeeds.SpiderSeeds);
        if (!ConfigDisable.WITHER && MSeeds.WitherSeeds != null) ItemRegisterHelper.registerItem(MSeeds.WitherSeeds);

        if (!ConfigDisable.CHICKEN && MSeeds.ChickenSeeds != null) ItemRegisterHelper.registerItem(MSeeds.ChickenSeeds);
        if (!ConfigDisable.COW && MSeeds.CowSeeds != null) ItemRegisterHelper.registerItem(MSeeds.CowSeeds);
        if (!ConfigDisable.PIG && MSeeds.PigSeeds != null) ItemRegisterHelper.registerItem(MSeeds.PigSeeds);
        if (!ConfigDisable.SHEEP && MSeeds.SheepSeeds != null) ItemRegisterHelper.registerItem(MSeeds.SheepSeeds);

        // Fertilizers & misc
        ItemRegisterHelper.registerItem(MItems.MagicalFertilizer);
        ItemRegisterHelper.registerItem(MItems.EssenceFertilizer);
        ItemRegisterHelper.registerItem(MItems.EssenceIngots);

        if (ConfigMain.ENCHANT_CRAFT)
            ItemRegisterHelper.registerItem(MItems.ExperienceBook);

        // Base essences
        ItemRegisterHelper.registerItem(Essence.MinicioEssence);
        ItemRegisterHelper.registerItem(Essence.AccioEssence);
        ItemRegisterHelper.registerItem(Essence.CrucioEssence);
        ItemRegisterHelper.registerItem(Essence.ImperioEssence);
        ItemRegisterHelper.registerItem(Essence.ZivicioEssence);
        ItemRegisterHelper.registerItem(Essence.TaintedEssence);

        // === ESSENCES (register only when NOT disabled) ===
        if (!ConfigDisable.AIR) ItemRegisterHelper.registerItem(Essence.AirEssence);
        if (!ConfigDisable.COAL) ItemRegisterHelper.registerItem(Essence.CoalEssence);
        if (!ConfigDisable.DYE) ItemRegisterHelper.registerItem(Essence.DyeEssence);
        if (!ConfigDisable.EARTH) ItemRegisterHelper.registerItem(Essence.EarthEssence);
        if (!ConfigDisable.FIRE) ItemRegisterHelper.registerItem(Essence.FireEssence);
        if (!ConfigDisable.NATURE) ItemRegisterHelper.registerItem(Essence.NatureEssence);
        if (!ConfigDisable.WATER) ItemRegisterHelper.registerItem(Essence.WaterEssence);
        if (!ConfigDisable.REDSTONE) ItemRegisterHelper.registerItem(Essence.RedstoneEssence);
        if (!ConfigDisable.GLOWSTONE) ItemRegisterHelper.registerItem(Essence.GlowstoneEssence);
        if (!ConfigDisable.OBSIDIAN) ItemRegisterHelper.registerItem(Essence.ObsidianEssence);
        if (!ConfigDisable.NETHER) ItemRegisterHelper.registerItem(Essence.NetherEssence);
        if (!ConfigDisable.IRON) ItemRegisterHelper.registerItem(Essence.IronEssence);
        if (!ConfigDisable.GOLD) ItemRegisterHelper.registerItem(Essence.GoldEssence);
        if (!ConfigDisable.LAPIS) ItemRegisterHelper.registerItem(Essence.LapisEssence);
        if (!ConfigDisable.EXPERIENCE) ItemRegisterHelper.registerItem(Essence.ExperienceEssence);
        if (!ConfigDisable.QUARTZ) ItemRegisterHelper.registerItem(Essence.QuartzEssence);
        if (!ConfigDisable.DIAMOND) ItemRegisterHelper.registerItem(Essence.DiamondEssence);
        if (!ConfigDisable.EMERALD) ItemRegisterHelper.registerItem(Essence.EmeraldEssence);

        if (!ConfigDisable.BLAZE) ItemRegisterHelper.registerItem(Essence.BlazeEssence);
        if (!ConfigDisable.CREEPER) ItemRegisterHelper.registerItem(Essence.CreeperEssence);
        if (!ConfigDisable.ENDERMAN) ItemRegisterHelper.registerItem(Essence.EndermanEssence);
        if (!ConfigDisable.GHAST) ItemRegisterHelper.registerItem(Essence.GhastEssence);
        if (!ConfigDisable.SKELETON) ItemRegisterHelper.registerItem(Essence.SkeletonEssence);
        if (!ConfigDisable.SLIME) ItemRegisterHelper.registerItem(Essence.SlimeEssence);
        if (!ConfigDisable.SPIDER) ItemRegisterHelper.registerItem(Essence.SpiderEssence);
        if (!ConfigDisable.WITHER) ItemRegisterHelper.registerItem(Essence.WitherEssence);
        if (!ConfigDisable.CHICKEN) ItemRegisterHelper.registerItem(Essence.ChickenEssence);
        if (!ConfigDisable.COW) ItemRegisterHelper.registerItem(Essence.CowEssence);
        if (!ConfigDisable.PIG) ItemRegisterHelper.registerItem(Essence.PigEssence);
        if (!ConfigDisable.SHEEP) ItemRegisterHelper.registerItem(Essence.SheepEssence);

        // Armour
        ItemRegisterHelper.registerItem(Armour.AccioArmourHelmet);
        ItemRegisterHelper.registerItem(Armour.AccioArmourChestplate);
        ItemRegisterHelper.registerItem(Armour.AccioArmourLeggings);
        ItemRegisterHelper.registerItem(Armour.AccioArmourBoots);

        ItemRegisterHelper.registerItem(Armour.CrucioArmourHelmet);
        ItemRegisterHelper.registerItem(Armour.CrucioArmourChestplate);
        ItemRegisterHelper.registerItem(Armour.CrucioArmourLeggings);
        ItemRegisterHelper.registerItem(Armour.CrucioArmourBoots);

        ItemRegisterHelper.registerItem(Armour.ImperioArmourHelmet);
        ItemRegisterHelper.registerItem(Armour.ImperioArmourChestplate);
        ItemRegisterHelper.registerItem(Armour.ImperioArmourLeggings);
        ItemRegisterHelper.registerItem(Armour.ImperioArmourBoots);

        ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmet);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplate);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggings);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourBoots);

        ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmetFeed);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmetNight);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmetWater);

        ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplateFire);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplateWither);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplatePoison);

        ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggingsBlind);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggingsWeak);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggingsConfusion);

        ItemRegisterHelper.registerItem(Armour.ZivicioArmourBootsStep);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourBootsSpeed);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourBootsJump);

        // Tools
        ItemRegisterHelper.registerItem(Tools.AccioPickaxe);
        ItemRegisterHelper.registerItem(Tools.AccioSword);
        ItemRegisterHelper.registerItem(Tools.AccioAxe);
        ItemRegisterHelper.registerItem(Tools.AccioShovel);
        ItemRegisterHelper.registerItem(Tools.AccioHoe);

        ItemRegisterHelper.registerItem(Tools.CrucioPickaxe);
        ItemRegisterHelper.registerItem(Tools.CrucioSword);
        ItemRegisterHelper.registerItem(Tools.CrucioAxe);
        ItemRegisterHelper.registerItem(Tools.CrucioShovel);
        ItemRegisterHelper.registerItem(Tools.CrucioHoe);

        ItemRegisterHelper.registerItem(Tools.ImperioPickaxe);
        ItemRegisterHelper.registerItem(Tools.ImperioSword);
        ItemRegisterHelper.registerItem(Tools.ImperioAxe);
        ItemRegisterHelper.registerItem(Tools.ImperioShovel);
        ItemRegisterHelper.registerItem(Tools.ImperioHoe);

        ItemRegisterHelper.registerItem(Tools.ZivicioPickaxe);
        ItemRegisterHelper.registerItem(Tools.ZivicioSword);
        ItemRegisterHelper.registerItem(Tools.ZivicioAxe);
        ItemRegisterHelper.registerItem(Tools.ZivicioShovel);
        ItemRegisterHelper.registerItem(Tools.ZivicioHoe);

        // Seed bags
        ItemRegisterHelper.registerItem(MItems.SeedBagAccio);
        ItemRegisterHelper.registerItem(MItems.SeedBagCrucio);
        ItemRegisterHelper.registerItem(MItems.SeedBagImperio);
        ItemRegisterHelper.registerItem(MItems.SeedBagZivicio);

        if (ConfigMain.APPLES) {
            ItemRegisterHelper.registerItem(MItems.UltimateDiamondApple);
            ItemRegisterHelper.registerItem(MItems.EmeraldApple);
            ItemRegisterHelper.registerItem(MItems.UltimateEmeraldApple);
        }
    }
}
