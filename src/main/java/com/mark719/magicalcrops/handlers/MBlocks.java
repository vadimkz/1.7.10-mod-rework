package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.blocks.*;
import com.mark719.magicalcrops.furnace.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MBlocks {
    // 1. Только объявляем переменные.
    // Создавать объекты лучше прямо в init(), чтобы избежать проблем с порядком загрузки мода.

    public static Block MinicioOre;
    public static Block MinicioOreNether;
    public static Block MinicioOreEnd;
    public static Block CropBooster;
    public static Block FarmlandAccio;
    public static Block FarmlandCrucio;
    public static Block FarmlandImperio;
    public static Block FarmlandZivicio;
    public static Block EssenceStone;
    public static Block EssenceStorage;
    public static Block EssenceBlock;
    public static Block EssenceLamp;
    public static Block EssenceBrick;
    public static Block EssenceBrick2;
    public static Block EssenceSquare;
    public static Block WitherProof;
    public static Block WitherProofGlass;
    public static Block AccioFurnace;
    public static Block AccioFurnaceActive;
    public static Block CrucioFurnace;
    public static Block CrucioFurnaceActive;
    public static Block ImperioFurnace;
    public static Block ImperioFurnaceActive;
    public static Block ZivicioFurnace;
    public static Block ZivicioFurnaceActive;
    public static Block UltimateFurnace;
    public static Block UltimateFurnaceActive;

    public static void init() {
        // РУДЫ
        MinicioOre = setup(new BlockMinicioOre(), "MinicioOre");
        MinicioOreNether = setup(new BlockMinicioOreNether(), "MinicioOreNether");
        MinicioOreEnd = setup(new BlockMinicioOreEnd(), "MinicioOreEnd");

        // ФУНКЦИОНАЛЬНЫЕ
        CropBooster = setup(new BlockCropBooster(), "CropBooster");
        FarmlandAccio = setup(new BlockFarmlandAccio(), "FarmlandAccio");
        FarmlandCrucio = setup(new BlockFarmlandCrucio(), "FarmlandCrucio");
        FarmlandImperio = setup(new BlockFarmlandImperio(), "FarmlandImperio");
        FarmlandZivicio = setup(new BlockFarmlandZivicio(), "FarmlandZivicio");

        // ДЕКОРАТИВНЫЕ
        EssenceStone = setup(new BlockEssenceStone(), "EssenceStone");
        EssenceStorage = setup(new BlockEssenceStorage(Material.rock), "EssenceStorage");
        EssenceLamp = setup(new BlockEssenceLamp(Material.rock), "EssenceLamp");
        EssenceBrick = setup(new BlockEssenceBrick(Material.rock), "EssenceBrick");
        EssenceBrick2 = setup(new BlockEssenceBrick2(Material.rock), "EssenceBrick2");
        EssenceSquare = setup(new BlockEssenceSquare(Material.rock), "EssenceSquare");

        // Блок с метаданными: создание здесь, регистрация (с ItemBlock) делается в BlockRegister
        EssenceBlock = new BlockEssenceBlock(Material.rock).setUnlocalizedName("EssenceBlock");

        // ЗАЩИТА
        WitherProof = setup(new BlockWitherProof(), "WitherProof");
        WitherProofGlass = setup(new BlockWitherProofGlass(), "WitherProofGlass");

        // ПЕЧИ (Выключаем дублирование через передачу параметров)
        AccioFurnace = setupFurnace(new AccioFurnace(false), "AccioFurnace", true);
        AccioFurnaceActive = setupFurnace(new AccioFurnace(true), "AccioFurnaceActive", false);

        CrucioFurnace = setupFurnace(new CrucioFurnace(false), "CrucioFurnace", true);
        CrucioFurnaceActive = setupFurnace(new CrucioFurnace(true), "CrucioFurnaceActive", false);

        ImperioFurnace = setupFurnace(new ImperioFurnace(false), "ImperioFurnace", true);
        ImperioFurnaceActive = setupFurnace(new ImperioFurnace(true), "ImperioFurnaceActive", false);

        ZivicioFurnace = setupFurnace(new ZivicioFurnace(false), "ZivicioFurnace", true);
        ZivicioFurnaceActive = setupFurnace(new ZivicioFurnace(true), "ZivicioFurnaceActive", false);

        UltimateFurnace = setupFurnace(new UltimateFurnace(false), "UltimateFurnace", true);
        UltimateFurnaceActive = setupFurnace(new UltimateFurnace(true), "UltimateFurnaceActive", false);
    }


    /**
     * Создание (и настройка) блока. Регистрация делается отдельно в BlockRegister.
     */
    private static Block setup(Block block, String unlocalizedName) {
        return block.setUnlocalizedName(unlocalizedName);
    }

    /**
     * Создание печей: активная версия без creative tab, неактивная — с tab.
     * Регистрация делается отдельно в BlockRegister.
     */
    private static Block setupFurnace(Block block, String unlocalizedName, boolean hasTab) {
        if (hasTab) block.setCreativeTab(MagicalCrops.tabMagical);
        return setup(block, unlocalizedName);
    }

}
