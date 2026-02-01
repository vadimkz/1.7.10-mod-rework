package com.mark719.magicalcrops.recipes;

import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantmentRecipes
{
    static Item minicioEssence = Essence.MinicioEssence;
    static Item accioEssence = Essence.AccioEssence;
    static Item crucioEssence = Essence.CrucioEssence;
    static Item imperioEssence = Essence.ImperioEssence;
    static Item zivicioEssence = Essence.ZivicioEssence;

    static ItemStack airEssence = new ItemStack(Essence.AirEssence, 1, 0);
    static ItemStack coalEssence = new ItemStack(Essence.CoalEssence, 1, 0);
    static ItemStack diamondEssence = new ItemStack(Essence.DiamondEssence, 1, 0);
    static ItemStack dyeEssence = new ItemStack(Essence.DyeEssence, 1, 0);
    static ItemStack earthEssence = new ItemStack(Essence.EarthEssence, 1, 0);
    static ItemStack emeraldEssence = new ItemStack(Essence.EmeraldEssence, 1, 0);
    static ItemStack xpEssence = new ItemStack(Essence.ExperienceEssence, 1, 0);
    static ItemStack fireEssence = new ItemStack(Essence.FireEssence, 1, 0);
    static ItemStack glowstoneEssence = new ItemStack(Essence.GlowstoneEssence, 1, 0);
    static ItemStack goldEssence = new ItemStack(Essence.GoldEssence, 1, 0);
    static ItemStack ironEssence = new ItemStack(Essence.IronEssence, 1, 0);
    static ItemStack lapisEssence = new ItemStack(Essence.LapisEssence, 1, 0);
    static ItemStack natureEssence = new ItemStack(Essence.NatureEssence, 1, 0);
    static ItemStack netherEssence = new ItemStack(Essence.NetherEssence, 1, 0);
    static ItemStack obsidianEssence = new ItemStack(Essence.ObsidianEssence, 1, 0);
    static ItemStack quartzEssence = new ItemStack(Essence.QuartzEssence, 1, 0);
    static ItemStack redstoneEssence = new ItemStack(Essence.RedstoneEssence, 1, 0);
    static ItemStack taintedEssence = new ItemStack(Essence.TaintedEssence, 1, 0);
    static ItemStack waterEssence = new ItemStack(Essence.WaterEssence, 1, 0);

    static ItemStack blazeEssence = new ItemStack(Essence.BlazeEssence, 1, 0);
    static ItemStack creeperEssence = new ItemStack(Essence.CreeperEssence, 1, 0);
    static ItemStack EndermanEssence = new ItemStack(Essence.EndermanEssence, 1, 0);
    static ItemStack ghastEssence = new ItemStack(Essence.GhastEssence, 1, 0);
    static ItemStack skeletonEssence = new ItemStack(Essence.SkeletonEssence, 1, 0);
    static ItemStack slimeEssence = new ItemStack(Essence.SlimeEssence, 1, 0);
    static ItemStack spiderEssence = new ItemStack(Essence.SpiderEssence, 1, 0);
    static ItemStack witherEssence = new ItemStack(Essence.WitherEssence, 1, 0);
    static ItemStack cowEssence = new ItemStack(Essence.CowEssence, 1, 0);
    static ItemStack pigEssence = new ItemStack(Essence.PigEssence, 1, 0);
    static ItemStack chickenEssence = new ItemStack(Essence.ChickenEssence, 1, 0);
    static ItemStack sheepEssence = new ItemStack(Essence.SheepEssence, 1, 0);

    static ItemStack xpBook1 = new ItemStack(MItems.ExperienceBook, 1, 0);
    static ItemStack xpBook2 = new ItemStack(MItems.ExperienceBook, 1, 1);
    static ItemStack xpBook3 = new ItemStack(MItems.ExperienceBook, 1, 2);
    static ItemStack xpBook4 = new ItemStack(MItems.ExperienceBook, 1, 3);
    static ItemStack xpBook5 = new ItemStack(MItems.ExperienceBook, 1, 4);

    public static void loadRecipes() {
        // Items.book - обычная книга
        GameRegistry.addRecipe(xpBook1, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), Items.book });
        GameRegistry.addRecipe(xpBook2, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook1 });
        GameRegistry.addRecipe(xpBook3, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook2 });
        GameRegistry.addRecipe(xpBook4, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook3 });
        GameRegistry.addRecipe(xpBook5, new Object[] { "XXX", "XZX", "XXX", Character.valueOf('X'), xpEssence, Character.valueOf('Z'), xpBook4 });

        // --- Flame (Горящая стрела / Заговор огня) ---
        // Enchantment.flame - Горящая стрела
        EnchantmentData flame1 = new EnchantmentData(Enchantment.flame, 1);
        ItemStack flameBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(flameBook1, flame1);
        GameRegistry.addRecipe(flameBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), fireEssence, Character.valueOf('Y'), xpBook1 });

        // --- Efficiency (Эффективность) ---
        // Enchantment.efficiency
        EnchantmentData eff1 = new EnchantmentData(Enchantment.efficiency, 1);
        ItemStack effBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(effBook1, eff1);
        GameRegistry.addRecipe(effBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData eff2 = new EnchantmentData(Enchantment.efficiency, 2);
        ItemStack effBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(effBook2, eff2);
        GameRegistry.addRecipe(effBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook2 });

        EnchantmentData eff3 = new EnchantmentData(Enchantment.efficiency, 3);
        ItemStack effBook3 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(effBook3, eff3);
        GameRegistry.addRecipe(effBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook3 });

        EnchantmentData eff4 = new EnchantmentData(Enchantment.efficiency, 4);
        ItemStack effBook4 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(effBook4, eff4);
        GameRegistry.addRecipe(effBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook4 });

        EnchantmentData eff5 = new EnchantmentData(Enchantment.efficiency, 5);
        ItemStack effBook5 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(effBook5, eff5);
        GameRegistry.addRecipe(effBook5, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), redstoneEssence, Character.valueOf('Y'), xpBook5 });

        // --- Silk Touch (Шелковое касание) ---
        // Enchantment.silkTouch
        EnchantmentData silk1 = new EnchantmentData(Enchantment.silkTouch, 1);
        ItemStack silkBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(silkBook1, silk1);
        GameRegistry.addRecipe(silkBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), emeraldEssence, Character.valueOf('Y'), xpBook1 });

        // --- Unbreaking (Прочность) ---
        // Enchantment.unbreaking
        EnchantmentData unb1 = new EnchantmentData(Enchantment.unbreaking, 1);
        ItemStack unbBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(unbBook1, unb1);
        GameRegistry.addRecipe(unbBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), obsidianEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData unb2 = new EnchantmentData(Enchantment.unbreaking, 2);
        ItemStack unbBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(unbBook2, unb2);
        GameRegistry.addRecipe(unbBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), obsidianEssence, Character.valueOf('Y'), xpBook2 });

        EnchantmentData unb3 = new EnchantmentData(Enchantment.unbreaking, 3);
        ItemStack unbBook3 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(unbBook3, unb3);
        GameRegistry.addRecipe(unbBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), obsidianEssence, Character.valueOf('Y'), xpBook3 });

        // --- Fortune (Удача) ---
        // Enchantment.fortune
        EnchantmentData fort1 = new EnchantmentData(Enchantment.fortune, 1);
        ItemStack fortBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(fortBook1, fort1);
        GameRegistry.addRecipe(fortBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), lapisEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData fort2 = new EnchantmentData(Enchantment.fortune, 2);
        ItemStack fortBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(fortBook2, fort2);
        GameRegistry.addRecipe(fortBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), lapisEssence, Character.valueOf('Y'), xpBook2 });

        EnchantmentData fort3 = new EnchantmentData(Enchantment.fortune, 3);
        ItemStack fortBook3 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(fortBook3, fort3);
        GameRegistry.addRecipe(fortBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), lapisEssence, Character.valueOf('Y'), xpBook3 });
// --- Protection (Защита) ---
        // Enchantment.protection
        EnchantmentData prot1 = new EnchantmentData(Enchantment.protection, 1);
        ItemStack protBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(protBook1, prot1);
        GameRegistry.addRecipe(protBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData prot2 = new EnchantmentData(Enchantment.protection, 2);
        ItemStack protBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(protBook2, prot2);
        GameRegistry.addRecipe(protBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook2 });

        EnchantmentData prot3 = new EnchantmentData(Enchantment.protection, 3);
        ItemStack protBook3 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(protBook3, prot3);
        GameRegistry.addRecipe(protBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook3 });

        EnchantmentData prot4 = new EnchantmentData(Enchantment.protection, 4);
        ItemStack protBook4 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(protBook4, prot4);
        GameRegistry.addRecipe(protBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), diamondEssence, Character.valueOf('Y'), xpBook4 });

        // --- Fire Protection (Огнеупорность) ---
        // Enchantment.fireProtection
        EnchantmentData fireProt1 = new EnchantmentData(Enchantment.fireProtection, 1);
        ItemStack fireProtBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(fireProtBook1, fireProt1);
        GameRegistry.addRecipe(fireProtBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData fireProt2 = new EnchantmentData(Enchantment.fireProtection, 2);
        ItemStack fireProtBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(fireProtBook2, fireProt2);
        GameRegistry.addRecipe(fireProtBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook2 });

        EnchantmentData fireProt3 = new EnchantmentData(Enchantment.fireProtection, 3);
        ItemStack fireProtBook3 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(fireProtBook3, fireProt3);
        GameRegistry.addRecipe(fireProtBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook3 });

        EnchantmentData fireProt4 = new EnchantmentData(Enchantment.fireProtection, 4);
        ItemStack fireProtBook4 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(fireProtBook4, fireProt4);
        GameRegistry.addRecipe(fireProtBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), blazeEssence, Character.valueOf('Y'), xpBook4 });

        // --- Feather Falling (Невесомость) ---
        // Enchantment.featherFalling
        EnchantmentData feather1 = new EnchantmentData(Enchantment.featherFalling, 1);
        ItemStack featherBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(featherBook1, feather1);
        GameRegistry.addRecipe(featherBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData feather2 = new EnchantmentData(Enchantment.featherFalling, 2);
        ItemStack featherBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(featherBook2, feather2);
        GameRegistry.addRecipe(featherBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook2 });

        EnchantmentData feather3 = new EnchantmentData(Enchantment.featherFalling, 3);
        ItemStack featherBook3 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(featherBook3, feather3);
        GameRegistry.addRecipe(featherBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook3 });

        EnchantmentData feather4 = new EnchantmentData(Enchantment.featherFalling, 4);
        ItemStack featherBook4 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(featherBook4, feather4);
        GameRegistry.addRecipe(featherBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), chickenEssence, Character.valueOf('Y'), xpBook4 });

        // --- Blast Protection (Взрывоустойчивость) ---
        // Enchantment.blastProtection
        EnchantmentData blast1 = new EnchantmentData(Enchantment.blastProtection, 1);
        ItemStack blastBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(blastBook1, blast1);
        GameRegistry.addRecipe(blastBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData blast2 = new EnchantmentData(Enchantment.blastProtection, 2);
        ItemStack blastBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(blastBook2, blast2);
        GameRegistry.addRecipe(blastBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook2 });

        EnchantmentData blast3 = new EnchantmentData(Enchantment.blastProtection, 3);
        ItemStack blastBook3 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(blastBook3, blast3);
        GameRegistry.addRecipe(blastBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook3 });

        EnchantmentData blast4 = new EnchantmentData(Enchantment.blastProtection, 4);
        ItemStack blastBook4 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(blastBook4, blast4);
        GameRegistry.addRecipe(blastBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), creeperEssence, Character.valueOf('Y'), xpBook4 });

        // --- Projectile Protection (Защита от снарядов) ---
        // Enchantment.projectileProtection
        EnchantmentData proj1 = new EnchantmentData(Enchantment.projectileProtection, 1);
        ItemStack projBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(projBook1, proj1);
        GameRegistry.addRecipe(projBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData proj2 = new EnchantmentData(Enchantment.projectileProtection, 2);
        ItemStack projBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(projBook2, proj2);
        GameRegistry.addRecipe(projBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook2 });

        EnchantmentData proj3 = new EnchantmentData(Enchantment.projectileProtection, 3);
        ItemStack projBook3 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(projBook3, proj3);
        GameRegistry.addRecipe(projBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook3 });

// --- Продолжение Projectile Protection IV ---
        EnchantmentData proj4 = new EnchantmentData(Enchantment.projectileProtection, 4);
        ItemStack projBook4 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(projBook4, proj4);
        GameRegistry.addRecipe(projBook4, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), skeletonEssence, Character.valueOf('Y'), xpBook4 });

        // --- Respiration (Подводное дыхание) ---
        // Enchantment.respiration
        EnchantmentData resp1 = new EnchantmentData(Enchantment.respiration, 1);
        ItemStack respBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(respBook1, resp1);
        GameRegistry.addRecipe(respBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), airEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData resp2 = new EnchantmentData(Enchantment.respiration, 2);
        ItemStack respBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(respBook2, resp2);
        GameRegistry.addRecipe(respBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), airEssence, Character.valueOf('Y'), xpBook2 });

        EnchantmentData resp3 = new EnchantmentData(Enchantment.respiration, 3);
        ItemStack respBook3 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(respBook3, resp3);
        GameRegistry.addRecipe(respBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), airEssence, Character.valueOf('Y'), xpBook3 });

        // --- Aqua Affinity (Родство с водой) ---
        // Enchantment.aquaAffinity
        EnchantmentData aqua1 = new EnchantmentData(Enchantment.aquaAffinity, 1);
        ItemStack aquaBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(aquaBook1, aqua1);
        GameRegistry.addRecipe(aquaBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), waterEssence, Character.valueOf('Y'), xpBook1 });

        // --- Thorns (Шипы) ---
        // Enchantment.thorns
        EnchantmentData thorns1 = new EnchantmentData(Enchantment.thorns, 1);
        ItemStack thornsBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(thornsBook1, thorns1);
        GameRegistry.addRecipe(thornsBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData thorns2 = new EnchantmentData(Enchantment.thorns, 2);
        ItemStack thornsBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(thornsBook2, thorns2);
        GameRegistry.addRecipe(thornsBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), xpBook2 });

        EnchantmentData thorns3 = new EnchantmentData(Enchantment.thorns, 3);
        ItemStack thornsBook3 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(thornsBook3, thorns3);
        GameRegistry.addRecipe(thornsBook3, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), natureEssence, Character.valueOf('Y'), xpBook3 });

        // --- Sharpness (Острота) ---
        // Enchantment.sharpness
        for (int i = 1; i <= 5; i++) {
            EnchantmentData sharp = new EnchantmentData(Enchantment.sharpness, i);
            ItemStack sharpBook = new ItemStack(Items.enchanted_book, 1);
            Items.enchanted_book.addEnchantment(sharpBook, sharp);
            // Используем соответствующую книгу опыта (xpBook1...xpBook5)
            Object currentXpBook = (i == 1) ? xpBook1 : (i == 2) ? xpBook2 : (i == 3) ? xpBook3 : (i == 4) ? xpBook4 : xpBook5;
            GameRegistry.addRecipe(sharpBook, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), quartzEssence, Character.valueOf('Y'), currentXpBook });
        }

        // --- Smite (Небесная кара) ---
        // Enchantment.smite
        for (int i = 1; i <= 5; i++) {
            EnchantmentData smite = new EnchantmentData(Enchantment.smite, i);
            ItemStack smiteBook = new ItemStack(Items.enchanted_book, 1);
            Items.enchanted_book.addEnchantment(smiteBook, smite);
            Object currentXpBook = (i == 1) ? xpBook1 : (i == 2) ? xpBook2 : (i == 3) ? xpBook3 : (i == 4) ? xpBook4 : xpBook5;
            GameRegistry.addRecipe(smiteBook, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), netherEssence, Character.valueOf('Y'), currentXpBook });
        }

        // --- Bane of Arthropods (Бич членистоногих) ---
        // Enchantment.baneOfArthropods
        for (int i = 1; i <= 5; i++) {
            EnchantmentData bane = new EnchantmentData(Enchantment.baneOfArthropods, i);
            ItemStack baneBook = new ItemStack(Items.enchanted_book, 1);
            Items.enchanted_book.addEnchantment(baneBook, bane);
            Object currentXpBook = (i == 1) ? xpBook1 : (i == 2) ? xpBook2 : (i == 3) ? xpBook3 : (i == 4) ? xpBook4 : xpBook5;
            GameRegistry.addRecipe(baneBook, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), spiderEssence, Character.valueOf('Y'), currentXpBook });
        }

        // --- Knockback (Отдача) ---
        // Enchantment.knockback
        EnchantmentData knock1 = new EnchantmentData(Enchantment.knockback, 1);
        ItemStack knockBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(knockBook1, knock1);
        GameRegistry.addRecipe(knockBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), ironEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData knock2 = new EnchantmentData(Enchantment.knockback, 2);
        ItemStack knockBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(knockBook2, knock2);
        GameRegistry.addRecipe(knockBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), ironEssence, Character.valueOf('Y'), xpBook2 });

        // --- Looting (Добыча) ---
        // Enchantment.looting
        for (int i = 1; i <= 3; i++) {
            EnchantmentData loot = new EnchantmentData(Enchantment.looting, i);
            ItemStack lootBook = new ItemStack(Items.enchanted_book, 1);
            Items.enchanted_book.addEnchantment(lootBook, loot);
            Object currentXpBook = (i == 1) ? xpBook1 : (i == 2) ? xpBook2 : xpBook3;
            GameRegistry.addRecipe(lootBook, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), goldEssence, Character.valueOf('Y'), currentXpBook });
        }

        // --- Power (Сила лука) ---
        // Enchantment.power
        for (int i = 1; i <= 5; i++) {
            EnchantmentData power = new EnchantmentData(Enchantment.power, i);
            ItemStack powerBook = new ItemStack(Items.enchanted_book, 1);
            Items.enchanted_book.addEnchantment(powerBook, power);
            Object currentXpBook = (i == 1) ? xpBook1 : (i == 2) ? xpBook2 : (i == 3) ? xpBook3 : (i == 4) ? xpBook4 : xpBook5;
            GameRegistry.addRecipe(powerBook, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), coalEssence, Character.valueOf('Y'), currentXpBook });
        }

        // --- Infinity (Бесконечность) ---
        // Enchantment.infinity
        EnchantmentData inf1 = new EnchantmentData(Enchantment.infinity, 1);
        ItemStack infBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(infBook1, inf1);
        GameRegistry.addRecipe(infBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), slimeEssence, Character.valueOf('Y'), xpBook1 });

        // --- Punch (Откидывание лука) ---
        // Enchantment.punch
        EnchantmentData punch1 = new EnchantmentData(Enchantment.punch, 1);
        ItemStack punchBook1 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(punchBook1, punch1);
        GameRegistry.addRecipe(punchBook1, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), glowstoneEssence, Character.valueOf('Y'), xpBook1 });

        EnchantmentData punch2 = new EnchantmentData(Enchantment.punch, 2);
        ItemStack punchBook2 = new ItemStack(Items.enchanted_book, 1);
        Items.enchanted_book.addEnchantment(punchBook2, punch2);
        GameRegistry.addRecipe(punchBook2, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), glowstoneEssence, Character.valueOf('Y'), xpBook2 });
    }
}
