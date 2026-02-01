package com.mark719.magicalcrops.recipes;

import com.mark719.magicalcrops.config.ConfigCrafting;
import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ResourceRecipes {
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
    static ItemStack endermanEssence = new ItemStack(Essence.EndermanEssence, 1, 0);
    static ItemStack ghastEssence = new ItemStack(Essence.GhastEssence, 1, 0);
    static ItemStack skeletonEssence = new ItemStack(Essence.SkeletonEssence, 1, 0);
    static ItemStack slimeEssence = new ItemStack(Essence.SlimeEssence, 1, 0);
    static ItemStack spiderEssence = new ItemStack(Essence.SpiderEssence, 1, 0);
    static ItemStack witherEssence = new ItemStack(Essence.WitherEssence, 1, 0);

    static ItemStack chickenEssence = new ItemStack(Essence.ChickenEssence, 1, 0);
    static ItemStack cowEssence = new ItemStack(Essence.CowEssence, 1, 0);
    static ItemStack pigEssence = new ItemStack(Essence.PigEssence, 1, 0);
    static ItemStack sheepEssence = new ItemStack(Essence.SheepEssence, 1, 0);

    public static void loadRecipes() {
        // Ванильные ресурсы
        GameRegistry.addRecipe(new ItemStack(Items.coal, ConfigCrafting.outPutCoal), new Object[] { "XXX", "XXX", "XXX", 'X', coalEssence });

        // Красители (разные паттерны для разных цветов)
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 0), new Object[] { "XXX", "   ", "   ", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 1), new Object[] { "   ", "XXX", "   ", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 2), new Object[] { "   ", "   ", "XXX", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 5), new Object[] { " X ", " X ", " X ", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 6), new Object[] { "X  ", "X  ", "X  ", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 7), new Object[] { "X  ", " X ", "  X", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 8), new Object[] { " X ", " X ", "X  ", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 9), new Object[] { "XX ", "X  ", "   ", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 10), new Object[] { " XX", "X  ", "   ", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 11), new Object[] { "   ", " X ", "X X", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 12), new Object[] { "XX ", " X ", "   ", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 13), new Object[] { " X ", "X  ", " X ", 'X', dyeEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutDye, 14), new Object[] { "  X", " X ", " X ", 'X', dyeEssence });

        // Природа и блоки
        GameRegistry.addRecipe(new ItemStack(Blocks.mossy_cobblestone, ConfigCrafting.outPutMossyCobble), new Object[] { "XXX", "XYX", "XXX", 'X', Blocks.cobblestone, 'Y', natureEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, ConfigCrafting.outPutMossyBrick, 1), new Object[] { "XXX", "XYX", "XXX", 'Y', natureEssence, 'X', Blocks.stonebrick });
        GameRegistry.addRecipe(new ItemStack(Blocks.vine, ConfigCrafting.outPutVines), new Object[] { "X X", "XXX", "X X", 'X', natureEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.waterlily, ConfigCrafting.outPutLily), new Object[] { " X ", "XXX", "X X", 'X', natureEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.mycelium, ConfigCrafting.outPutMycelium), new Object[] { "YXY", "XZX", "YXY", 'X', natureEssence, 'Y', Blocks.dirt, 'Z', Blocks.brown_mushroom });
        GameRegistry.addRecipe(new ItemStack(Blocks.mycelium, ConfigCrafting.outPutMycelium), new Object[] { "YXY", "XZX", "YXY", 'X', natureEssence, 'Y', Blocks.dirt, 'Z', Blocks.red_mushroom });
        GameRegistry.addRecipe(new ItemStack(Blocks.cactus, ConfigCrafting.outPutCactus), new Object[] { "XX ", "XX ", "XX ", 'X', natureEssence });

        // Древесина (0-дуб, 1-ель, 2-береза, 3-тропическое)
        GameRegistry.addRecipe(new ItemStack(Blocks.log, ConfigCrafting.outPutWood, 0), new Object[] { "YX ", "XX ", 'X', natureEssence, 'Y', waterEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.log, ConfigCrafting.outPutWood, 1), new Object[] { "XY ", "XX ", 'X', natureEssence, 'Y', waterEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.log, ConfigCrafting.outPutWood, 2), new Object[] { "XX ", "YX ", 'X', natureEssence, 'Y', waterEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.log, ConfigCrafting.outPutWood, 3), new Object[] { "XX ", "XY ", 'X', natureEssence, 'Y', waterEssence });

        // Базовые материалы
        GameRegistry.addRecipe(new ItemStack(Items.snowball, ConfigCrafting.outPutSnowBalls), new Object[] { "XY ", "YX ", 'X', waterEssence, 'Y', airEssence });
        GameRegistry.addRecipe(new ItemStack(Items.lava_bucket, 1), new Object[] { " X ", "XYX", " X ", 'X', fireEssence, 'Y', Items.bucket });
        GameRegistry.addRecipe(new ItemStack(Items.water_bucket, 1), new Object[] { " X ", "XYX", " X ", 'X', waterEssence, 'Y', Items.bucket });
        GameRegistry.addRecipe(new ItemStack(Items.clay_ball, ConfigCrafting.outPutClayBall), new Object[] { "XY ", "YX ", 'X', waterEssence, 'Y', earthEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone, ConfigCrafting.outPutCobblestone), new Object[] { "XY ", "YX ", 'X', fireEssence, 'Y', earthEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.dirt, ConfigCrafting.outPutDirt), new Object[] { "XXX", "X X", "XXX", 'X', earthEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.sand, ConfigCrafting.outPutSand), new Object[] { "YX ", "XY ", 'X', fireEssence, 'Y', earthEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.gravel, ConfigCrafting.outPutGravel), new Object[] { "YY ", "XX ", 'X', fireEssence, 'Y', earthEssence });

        // Руды и драгоценности
        GameRegistry.addRecipe(new ItemStack(Items.redstone, ConfigCrafting.outPutRedstone), new Object[] { "XXX", "XXX", "XXX", 'X', redstoneEssence });
        GameRegistry.addRecipe(new ItemStack(Items.glowstone_dust, ConfigCrafting.outPutGlowstone), new Object[] { "XXX", "XXX", "XXX", 'X', glowstoneEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, ConfigCrafting.outPutObsidian), new Object[] { "XXX", "XXX", "XXX", 'X', obsidianEssence });

        // Незер-ресурсы
        GameRegistry.addRecipe(new ItemStack(Blocks.soul_sand, ConfigCrafting.outPutSoul), new Object[] { "XXX", "X X", "XXX", 'X', netherEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.netherrack, ConfigCrafting.outPutNether), new Object[] { "XX", "XX", 'X', netherEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.nether_brick, ConfigCrafting.outPutNetherbrick), new Object[] { "XXX", "XXX", "XXX", 'X', netherEssence });

        // Металлы и камни
        GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, ConfigCrafting.outPutIron), new Object[] { "XXX", "XXX", "XXX", 'X', ironEssence });
        GameRegistry.addRecipe(new ItemStack(Items.gold_ingot, ConfigCrafting.outPutGold), new Object[] { "XXX", "XXX", "XXX", 'X', goldEssence });
        GameRegistry.addRecipe(new ItemStack(Items.dye, ConfigCrafting.outPutLapis, 4), new Object[] { "XXX", "XXX", "XXX", 'X', lapisEssence });
        GameRegistry.addRecipe(new ItemStack(Items.quartz, ConfigCrafting.outPutQuartz), new Object[] { "XXX", "XXX", "XXX", 'X', quartzEssence });
        GameRegistry.addRecipe(new ItemStack(Items.experience_bottle, ConfigCrafting.outPutXP), new Object[] { "XXX", "XXX", "XXX", 'X', xpEssence });
        GameRegistry.addRecipe(new ItemStack(Items.emerald, ConfigCrafting.outPutEmerald), new Object[] { "XXX", "XXX", "XXX", 'X', emeraldEssence });
        GameRegistry.addRecipe(new ItemStack(Items.diamond, ConfigCrafting.outPutDiamond), new Object[] { "XXX", "XXX", "XXX", 'X', diamondEssence });

        // Коровы
        GameRegistry.addRecipe(new ItemStack(Items.leather, ConfigCrafting.outPutCowLeather), new Object[] { "XXX", "X X", "XXX", 'X', cowEssence });
        GameRegistry.addRecipe(new ItemStack(Items.beef, ConfigCrafting.outPutCowBeef), new Object[] { "XX", "XX", 'X', cowEssence });
        GameRegistry.addRecipe(new ItemStack(Items.milk_bucket, 1), new Object[] { " X ", "XYX", " X ", 'X', cowEssence, 'Y', Items.bucket });

        // Свиньи
        GameRegistry.addRecipe(new ItemStack(Items.porkchop, ConfigCrafting.outPutPigPork), new Object[] { "XX", "XX", 'X', pigEssence });

        // Курицы
        GameRegistry.addRecipe(new ItemStack(Items.chicken, ConfigCrafting.outPutChicken), new Object[] { "XX", "XX", 'X', chickenEssence });
        GameRegistry.addRecipe(new ItemStack(Items.feather, ConfigCrafting.outPutFeather), new Object[] { "XXX", "X X", "XXX", 'X', chickenEssence });
        GameRegistry.addRecipe(new ItemStack(Items.egg, ConfigCrafting.outPutEggs), new Object[] { "XXX", "XXX", "XXX", 'X', chickenEssence });

        // Овцы
        GameRegistry.addRecipe(new ItemStack(Blocks.wool, ConfigCrafting.outPutSheepWool), new Object[] { "XXX", "XXX", "XXX", 'X', sheepEssence });

        // Криперы
        GameRegistry.addRecipe(new ItemStack(Items.skull, ConfigCrafting.outPutCreeperHead, 4), new Object[] { "XXX", "XXX", "XXX", 'X', creeperEssence });
        GameRegistry.addRecipe(new ItemStack(Items.gunpowder, ConfigCrafting.outPutCreeperGun), new Object[] { "XXX", "X X", "XXX", 'X', creeperEssence });

        // Ифриты
        GameRegistry.addRecipe(new ItemStack(Items.blaze_rod, ConfigCrafting.outPutBlazerod), new Object[] { "XXX", "XXX", "XXX", 'X', blazeEssence });

        // Эндермены
        GameRegistry.addRecipe(new ItemStack(Items.ender_pearl, ConfigCrafting.outPutEnderPearl), new Object[] { "XXX", "XXX", "XXX", 'X', endermanEssence });
        GameRegistry.addRecipe(new ItemStack(Blocks.end_stone, 8), new Object[] { "XXX", "XYX", "XXX", 'Y', endermanEssence, 'X', Blocks.stone });

        // Скелеты
        GameRegistry.addRecipe(new ItemStack(Items.skull, ConfigCrafting.outPutSkeleSkull, 0), new Object[] { "XXX", "X X", "XXX", 'X', skeletonEssence });
        GameRegistry.addRecipe(new ItemStack(Items.bone, ConfigCrafting.outPutBones), new Object[] { "XXX", "XXX", "XXX", 'X', skeletonEssence });

        // Визеры
        GameRegistry.addRecipe(new ItemStack(Items.skull, ConfigCrafting.outPutWitherSkull, 1), new Object[] { "XXX", "XXX", "XXX", 'X', witherEssence });

        // Слизни
        GameRegistry.addRecipe(new ItemStack(Items.slime_ball, ConfigCrafting.outPutSlimeBall), new Object[] { "XXX", "XXX", "XXX", 'X', slimeEssence });

        // Пауки
        GameRegistry.addRecipe(new ItemStack(Items.string, ConfigCrafting.outPutSpiderString), new Object[] { "XXX", "X X", "XXX", 'X', spiderEssence });
        GameRegistry.addRecipe(new ItemStack(Items.spider_eye, ConfigCrafting.outPutSpiderEye), new Object[] { "XXX", "XXX", "XXX", 'X', spiderEssence });

        // Гасты
        GameRegistry.addRecipe(new ItemStack(Items.ghast_tear, ConfigCrafting.outPutGhastTear), new Object[] { "XXX", "XXX", "XXX", 'X', ghastEssence });

        // Пластинки
        GameRegistry.addRecipe(new ItemStack(Items.record_13, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 11) });
        GameRegistry.addRecipe(new ItemStack(Items.record_cat, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 2) });
        GameRegistry.addRecipe(new ItemStack(Items.record_blocks, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 14) });
        GameRegistry.addRecipe(new ItemStack(Items.record_chirp, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 1) });
        GameRegistry.addRecipe(new ItemStack(Items.record_far, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 15) });
        GameRegistry.addRecipe(new ItemStack(Items.record_mall, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 6) });
        GameRegistry.addRecipe(new ItemStack(Items.record_mellohi, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 10) });
        GameRegistry.addRecipe(new ItemStack(Items.record_stal, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 5) });
        GameRegistry.addRecipe(new ItemStack(Items.record_strad, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 9) });
        GameRegistry.addRecipe(new ItemStack(Items.record_ward, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 0) });
        GameRegistry.addRecipe(new ItemStack(Items.record_11, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 8) });
        GameRegistry.addRecipe(new ItemStack(Items.record_wait, 1), new Object[] { "XYX", "YZY", "XYX", 'X', skeletonEssence, 'Y', creeperEssence, 'Z', new ItemStack(Items.dye, 1, 4) });

        // Особые блоки
        GameRegistry.addRecipe(new ItemStack(Blocks.chest, 1), new Object[] { "XXX", "XYX", "XXX", 'X', blazeEssence, 'Y', MBlocks.WitherProof });
    }
}