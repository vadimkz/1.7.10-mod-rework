package com.mark719.magicalcrops.recipes;

import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BlockRecipes
{
    public static void loadRecipes() {
        // --- РЕЦЕПТЫ ПАШЕН ---

        // Accio Farmland из ванильной земли (Blocks.dirt)
        GameRegistry.addRecipe(new ItemStack(MBlocks.FarmlandAccio, 1), new Object[] {
                " X ", "XYX", " X ",
                Character.valueOf('X'), Essence.AccioEssence,
                Character.valueOf('Y'), Blocks.dirt
        });

        // Crucio Farmland из Accio Farmland
        GameRegistry.addRecipe(new ItemStack(MBlocks.FarmlandCrucio, 1), new Object[] {
                " X ", "XYX", " X ",
                Character.valueOf('X'), Essence.CrucioEssence,
                Character.valueOf('Y'), Blocks.dirt
        });

        // Imperio Farmland из Crucio Farmland
        GameRegistry.addRecipe(new ItemStack(MBlocks.FarmlandImperio, 1), new Object[] {
                " X ", "XYX", " X ",
                Character.valueOf('X'), Essence.ImperioEssence,
                Character.valueOf('Y'), Blocks.dirt
        });

        // Zivicio Farmland из Imperio Farmland
        GameRegistry.addRecipe(new ItemStack(MBlocks.FarmlandZivicio, 1), new Object[] {
                " X ", "XYX", " X ",
                Character.valueOf('X'), Essence.ZivicioEssence,
                Character.valueOf('Y'), Blocks.dirt
        });

        // --- РЕЦЕПТЫ ПЕЧЕЙ ---
        // Blocks.furnace - обычная печь
        GameRegistry.addRecipe(new ItemStack(MBlocks.AccioFurnace, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), Essence.AccioEssence, Character.valueOf('Y'), Blocks.furnace });
        GameRegistry.addRecipe(new ItemStack(MBlocks.CrucioFurnace, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), Essence.CrucioEssence, Character.valueOf('Y'), MBlocks.AccioFurnace });
        GameRegistry.addRecipe(new ItemStack(MBlocks.ImperioFurnace, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), Essence.ImperioEssence, Character.valueOf('Y'), MBlocks.CrucioFurnace });
        GameRegistry.addRecipe(new ItemStack(MBlocks.ZivicioFurnace, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), Essence.ZivicioEssence, Character.valueOf('Y'), MBlocks.ImperioFurnace });
        GameRegistry.addRecipe(new ItemStack(MBlocks.UltimateFurnace, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 4), Character.valueOf('Y'), MBlocks.ZivicioFurnace });

        // --- БУСТЕРЫ И ХРАНИЛИЩА ---
        // Blocks.cobblestone - булыжник, Items.diamond - алмаз
        GameRegistry.addRecipe(new ItemStack(MBlocks.CropBooster, 1), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 0), Character.valueOf('Y'), Blocks.cobblestone, Character.valueOf('Z'), Items.diamond });

        // Цикл для блоков хранения эссенции
        for (int i = 0; i < 5; i++) {
            Object essence = (i == 0) ? Essence.MinicioEssence :
                    (i == 1) ? Essence.AccioEssence :
                            (i == 2) ? Essence.CrucioEssence :
                                    (i == 3) ? Essence.ImperioEssence : Essence.ZivicioEssence;
            GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, i), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), essence });
        }

        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 5), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 4) });

        // --- КАМЕНЬ И ДЕКОРАЦИИ ---
        // Blocks.cobblestone - булыжник
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStone, 8), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Essence.MinicioEssence, Character.valueOf('X'), Blocks.cobblestone });

        // Красители: Items.dye
        int[] dyeMetas = {0, 3, 2, 14, 11, 4, 5, 1}; // черная кость, какао-бобы, кактус и т.д.

        for (int i = 0; i < 8; i++) {
            ItemStack dye = new ItemStack(Items.dye, 1, dyeMetas[i]);
            GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, i), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), dye, Character.valueOf('X'), MBlocks.EssenceStone });

            GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, i), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, i) });
            GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, i), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, i) });
            GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, i), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBrick, 1, i) });
            // Blocks.glowstone - светящийся камень
            GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, i), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Blocks.glowstone, Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, i) });
        }
    }
}