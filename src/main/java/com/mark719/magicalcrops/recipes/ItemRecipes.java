package com.mark719.magicalcrops.recipes;

import com.mark719.magicalcrops.config.ConfigMain;
import com.mark719.magicalcrops.handlers.Armour;
import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MBlocks;
import com.mark719.magicalcrops.handlers.MItems;
import com.mark719.magicalcrops.handlers.Tools;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ItemRecipes {
    static int meta = 32767;

    static Item minicioEssence = Essence.MinicioEssence;
    static Item accioEssence = Essence.AccioEssence;
    static Item crucioEssence = Essence.CrucioEssence;
    static Item imperioEssence = Essence.ImperioEssence;
    static Item zivicioEssence = Essence.ZivicioEssence;

    static ItemStack infusionWeak = new ItemStack(MItems.InfusionStoneWeak, 1, 32767);
    static ItemStack infusionRegular = new ItemStack(MItems.InfusionStoneRegular, 1, 32767);
    static ItemStack infusionStrong = new ItemStack(MItems.InfusionStoneStrong, 1, 32767);
    static ItemStack infusionExtreme = new ItemStack(MItems.InfusionStoneExtreme, 1, 32767);
    static ItemStack infusionMaster = new ItemStack(MItems.InfusionStoneMaster, 1, 32767);

    static ItemStack allWool = new ItemStack(Blocks.wool, 1, 32767);

    static ItemStack accioIngot = new ItemStack(MItems.EssenceIngots, 1, 0);
    static ItemStack crucioIngot = new ItemStack(MItems.EssenceIngots, 1, 1);
    static ItemStack imperioIngot = new ItemStack(MItems.EssenceIngots, 1, 2);
    static ItemStack zivicioIngot = new ItemStack(MItems.EssenceIngots, 1, 3);

    public static void loadRecipes() {
        // Рецепты камней инфузии (через OreDictionary)
        GameRegistry.addRecipe(new ShapedOreRecipe(MItems.InfusionStoneWeak, new Object[] { true, "XXX", "XYX", "XXX", 'X', minicioEssence, 'Y', "MainInfusionMaterial" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(MItems.InfusionStoneRegular, new Object[] { true, "XXX", "XYX", "XXX", 'Y', infusionWeak, 'X', "accioMaterial" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(MItems.InfusionStoneStrong, new Object[] { true, "XXX", "XYX", "XXX", 'Y', infusionRegular, 'X', "crucioMaterial" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(MItems.InfusionStoneExtreme, new Object[] { true, "XXX", "XYX", "XXX", 'Y', infusionStrong, 'X', "imperioMaterial" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(MItems.InfusionStoneMaster, new Object[] { true, "XXX", "XYX", "XXX", 'Y', infusionExtreme, 'X', "zivicioMaterial" }));

        // Крафт эссенций (повышение уровня)
        GameRegistry.addRecipe(new ItemStack(Essence.AccioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', minicioEssence, 'Z', infusionWeak });
        GameRegistry.addRecipe(new ItemStack(Essence.CrucioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', accioEssence, 'Z', infusionRegular });
        GameRegistry.addRecipe(new ItemStack(Essence.ImperioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', crucioEssence, 'Z', infusionStrong });
        GameRegistry.addRecipe(new ItemStack(Essence.ZivicioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', imperioEssence, 'Z', infusionExtreme });

        // Крафт эссенций (с использованием Мастер-камня)
        GameRegistry.addRecipe(new ItemStack(Essence.AccioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', minicioEssence, 'Z', infusionMaster });
        GameRegistry.addRecipe(new ItemStack(Essence.CrucioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', accioEssence, 'Z', infusionMaster });
        GameRegistry.addRecipe(new ItemStack(Essence.ImperioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', crucioEssence, 'Z', infusionMaster });
        GameRegistry.addRecipe(new ItemStack(Essence.ZivicioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', imperioEssence, 'Z', infusionMaster });

        // Разбор эссенций на уровень ниже
        GameRegistry.addShapelessRecipe(new ItemStack(Essence.MinicioEssence, 4), new Object[] { accioEssence });
        GameRegistry.addShapelessRecipe(new ItemStack(Essence.AccioEssence, 4), new Object[] { crucioEssence });
        GameRegistry.addShapelessRecipe(new ItemStack(Essence.CrucioEssence, 4), new Object[] { imperioEssence });
        GameRegistry.addShapelessRecipe(new ItemStack(Essence.ImperioEssence, 4), new Object[] { zivicioEssence });

        // Магическое удобрение
        GameRegistry.addRecipe(new ItemStack(MItems.MagicalFertilizer, 4), new Object[] { "YXY", "XZX", "YXY", 'X', minicioEssence, 'Y', new ItemStack(Items.dye, 1, 15), 'Z', Items.diamond });

        // Сумки для семян
        GameRegistry.addRecipe(new ItemStack(MItems.SeedBagAccio, 1), new Object[] { " X ", "XZX", " X ", 'X', accioEssence, 'Z', Items.leather });
        GameRegistry.addRecipe(new ItemStack(MItems.SeedBagCrucio, 1), new Object[] { " X ", "XZX", " X ", 'X', crucioEssence, 'Z', new ItemStack(MItems.SeedBagAccio, 1) });
        GameRegistry.addRecipe(new ItemStack(MItems.SeedBagImperio, 1), new Object[] { " X ", "XZX", " X ", 'X', imperioEssence, 'Z', new ItemStack(MItems.SeedBagCrucio, 1) });
        GameRegistry.addRecipe(new ItemStack(MItems.SeedBagZivicio, 1), new Object[] { " X ", "XZX", " X ", 'X', zivicioEssence, 'Z', new ItemStack(MItems.SeedBagImperio, 1) });

        // Слитки эссенции
        GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 0), new Object[] { "YXY", "XZX", "YXY", 'X', Items.iron_ingot, 'Z', accioEssence, 'Y', Items.gold_ingot });
        GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 1), new Object[] { "YXY", "XZX", "YXY", 'X', Items.iron_ingot, 'Z', crucioEssence, 'Y', Items.gold_ingot });
        GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 2), new Object[] { "YXY", "XZX", "YXY", 'X', Items.iron_ingot, 'Z', imperioEssence, 'Y', Items.gold_ingot });
        GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 3), new Object[] { "YXY", "XZX", "YXY", 'X', Items.iron_ingot, 'Z', zivicioEssence, 'Y', Items.gold_ingot });

        // Броня Accio
        GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourHelmet, 1), new Object[] { "XXX", "XYX", 'X', accioIngot, 'Y', Items.leather_helmet });
        GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourChestplate, 1), new Object[] { "XYX", "XXX", "XXX", 'X', accioIngot, 'Y', Items.leather_chestplate });
        GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourLeggings, 1), new Object[] { "XXX", "XYX", "X X", 'X', accioIngot, 'Y', Items.leather_leggings });
        GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourBoots, 1), new Object[] { "X X", "XYX", 'X', accioIngot, 'Y', Items.leather_boots });

        // Инструменты Accio
        GameRegistry.addRecipe(new ItemStack(Tools.AccioAxe, 1), new Object[] { " X ", "XYX", " X ", 'X', accioEssence, 'Y', Items.wooden_axe });
        GameRegistry.addRecipe(new ItemStack(Tools.AccioHoe, 1), new Object[] { " X ", "XYX", " X ", 'X', accioEssence, 'Y', Items.wooden_hoe });
        GameRegistry.addRecipe(new ItemStack(Tools.AccioPickaxe, 1), new Object[] { " X ", "XYX", " X ", 'X', accioEssence, 'Y', Items.wooden_pickaxe });
        GameRegistry.addRecipe(new ItemStack(Tools.AccioShovel, 1), new Object[] { " X ", "XYX", " X ", 'X', accioEssence, 'Y', Items.wooden_shovel });
        GameRegistry.addRecipe(new ItemStack(Tools.AccioSword, 1), new Object[] { " X ", "XYX", " X ", 'X', accioEssence, 'Y', Items.wooden_sword });

        // Броня Crucio
        GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourHelmet, 1), new Object[] { "XXX", "X X", 'X', crucioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourChestplate, 1), new Object[] { "X X", "XXX", "XXX", 'X', crucioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourLeggings, 1), new Object[] { "XXX", "X X", "X X", 'X', crucioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourBoots, 1), new Object[] { "X X", "X X", 'X', crucioIngot });

        // Инструменты Crucio (улучшение из Accio)
        GameRegistry.addRecipe(new ItemStack(Tools.CrucioAxe, 1), new Object[] { " X ", "XYX", " X ", 'X', crucioEssence, 'Y', new ItemStack(Tools.AccioAxe, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.CrucioHoe, 1), new Object[] { " X ", "XYX", " X ", 'X', crucioEssence, 'Y', new ItemStack(Tools.AccioHoe, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.CrucioPickaxe, 1), new Object[] { " X ", "XYX", " X ", 'X', crucioEssence, 'Y', new ItemStack(Tools.AccioPickaxe, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.CrucioShovel, 1), new Object[] { " X ", "XYX", " X ", 'X', crucioEssence, 'Y', new ItemStack(Tools.AccioShovel, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.CrucioSword, 1), new Object[] { " X ", "XYX", " X ", 'X', crucioEssence, 'Y', new ItemStack(Tools.AccioSword, 1, meta) });

        // Броня Imperio
        GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourHelmet, 1), new Object[] { "XXX", "X X", 'X', imperioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourChestplate, 1), new Object[] { "X X", "XXX", "XXX", 'X', imperioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourLeggings, 1), new Object[] { "XXX", "X X", "X X", 'X', imperioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourBoots, 1), new Object[] { "X X", "X X", 'X', imperioIngot });

        // Инструменты Imperio (улучшение из Crucio)
        GameRegistry.addRecipe(new ItemStack(Tools.ImperioAxe, 1), new Object[] { " X ", "XYX", " X ", 'X', imperioEssence, 'Y', new ItemStack(Tools.CrucioAxe, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ImperioHoe, 1), new Object[] { " X ", "XYX", " X ", 'X', imperioEssence, 'Y', new ItemStack(Tools.CrucioHoe, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ImperioPickaxe, 1), new Object[] { " X ", "XYX", " X ", 'X', imperioEssence, 'Y', new ItemStack(Tools.CrucioPickaxe, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ImperioShovel, 1), new Object[] { " X ", "XYX", " X ", 'X', imperioEssence, 'Y', new ItemStack(Tools.CrucioShovel, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ImperioSword, 1), new Object[] { " X ", "XYX", " X ", 'X', imperioEssence, 'Y', new ItemStack(Tools.CrucioSword, 1, meta) });

        // Броня Zivicio
        GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourHelmet, 1), new Object[] { "XXX", "X X", 'X', zivicioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourChestplate, 1), new Object[] { "X X", "XXX", "XXX", 'X', zivicioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourLeggings, 1), new Object[] { "XXX", "X X", "X X", 'X', zivicioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourBoots, 1), new Object[] { "X X", "X X", 'X', zivicioIngot });

        // Инструменты Zivicio (улучшение из Imperio)
        GameRegistry.addRecipe(new ItemStack(Tools.ZivicioAxe, 1), new Object[] { " X ", "XYX", " X ", 'X', zivicioEssence, 'Y', new ItemStack(Tools.ImperioAxe, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ZivicioHoe, 1), new Object[] { " X ", "XYX", " X ", 'X', zivicioEssence, 'Y', new ItemStack(Tools.ImperioHoe, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ZivicioPickaxe, 1), new Object[] { " X ", "XYX", " X ", 'X', zivicioEssence, 'Y', new ItemStack(Tools.ImperioPickaxe, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ZivicioShovel, 1), new Object[] { " X ", "XYX", " X ", 'X', zivicioEssence, 'Y', new ItemStack(Tools.ImperioShovel, 1, meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ZivicioSword, 1), new Object[] { " X ", "XYX", " X ", 'X', zivicioEssence, 'Y', new ItemStack(Tools.ImperioSword, 1, meta) });

        // Обратные рецепты блоков эссенции в предметы
        GameRegistry.addRecipe(new ItemStack(minicioEssence, 9), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 0) });
        GameRegistry.addRecipe(new ItemStack(accioEssence, 9), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 1) });
        GameRegistry.addRecipe(new ItemStack(crucioEssence, 9), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 2) });
        GameRegistry.addRecipe(new ItemStack(imperioEssence, 9), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 3) });
        GameRegistry.addRecipe(new ItemStack(zivicioEssence, 9), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 4) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 9, 4), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 5) });

        // Магические яблоки
        GameRegistry.addRecipe(new ItemStack(MItems.UltimateDiamondApple, 1), new Object[] { "XZX", "ZYZ", "XZX", 'Y', Items.apple, 'X', Blocks.diamond_block, 'Z', Items.diamond });
        GameRegistry.addRecipe(new ItemStack(MItems.EmeraldApple, 1), new Object[] { "ZZZ", "ZYZ", "ZZZ", 'Y', Items.apple, 'Z', Items.emerald });
        GameRegistry.addRecipe(new ItemStack(MItems.UltimateEmeraldApple, 1), new Object[] { "XZX", "ZYZ", "XZX", 'Y', Items.apple, 'X', Blocks.emerald_block, 'Z', Items.emerald });
    }
}