package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.MagicalCrops;
import com.mark719.magicalcrops.blocks.*;
import com.mark719.magicalcrops.furnace.*;
import com.mark719.magicalcrops.itemblock.ItemBlockEssenceBlock;
import cpw.mods.fml.common.registry.GameRegistry;
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
        MinicioOre = register(new BlockMinicioOre(), "MinicioOre");
        MinicioOreNether = register(new BlockMinicioOreNether(), "MinicioOreNether");
        MinicioOreEnd = register(new BlockMinicioOreEnd(), "MinicioOreEnd");

        // ФУНКЦИОНАЛЬНЫЕ
        CropBooster = register(new BlockCropBooster(), "CropBooster");
        FarmlandAccio = register(new BlockFarmlandAccio(), "FarmlandAccio");
        FarmlandCrucio = register(new BlockFarmlandCrucio(), "FarmlandCrucio");
        FarmlandImperio = register(new BlockFarmlandImperio(), "FarmlandImperio");
        FarmlandZivicio = register(new BlockFarmlandZivicio(), "FarmlandZivicio");

        // ДЕКОРАТИВНЫЕ
        EssenceStone = register(new BlockEssenceStone(), "EssenceStone");
        EssenceStorage = register(new BlockEssenceStorage(Material.rock), "EssenceStorage");
        EssenceLamp = register(new BlockEssenceLamp(Material.rock), "EssenceLamp");
        EssenceBrick = register(new BlockEssenceBrick(Material.rock), "EssenceBrick");
        EssenceBrick2 = register(new BlockEssenceBrick2(Material.rock), "EssenceBrick2");
        EssenceSquare = register(new BlockEssenceSquare(Material.rock), "EssenceSquare");

        // Блок с метаданными (оставляем как у вас, но через переменную)
        // Блок с метаданными (теперь ПРАВИЛЬНО привязываем существующий ItemBlock)
        EssenceBlock = new BlockEssenceBlock(Material.rock).setUnlocalizedName("EssenceBlock");
        GameRegistry.registerBlock(EssenceBlock, ItemBlockEssenceBlock.class, "EssenceBlock");

        // ЗАЩИТА
        WitherProof = register(new BlockWitherProof(), "WitherProof");
        WitherProofGlass = register(new BlockWitherProofGlass(), "WitherProofGlass");

        // ПЕЧИ (Выключаем дублирование через передачу параметров)
        AccioFurnace = registerFurnace(new AccioFurnace(false), "AccioFurnace", true);
        AccioFurnaceActive = registerFurnace(new AccioFurnace(true), "AccioFurnaceActive", false);

        CrucioFurnace = registerFurnace(new CrucioFurnace(false), "CrucioFurnace", true);
        CrucioFurnaceActive = registerFurnace(new CrucioFurnace(true), "CrucioFurnaceActive", false);

        ImperioFurnace = registerFurnace(new ImperioFurnace(false), "ImperioFurnace", true);
        ImperioFurnaceActive = registerFurnace(new ImperioFurnace(true), "ImperioFurnaceActive", false);

        ZivicioFurnace = registerFurnace(new ZivicioFurnace(false), "ZivicioFurnace", true);
        ZivicioFurnaceActive = registerFurnace(new ZivicioFurnace(true), "ZivicioFurnaceActive", false);

        UltimateFurnace = registerFurnace(new UltimateFurnace(false), "UltimateFurnace", true);
        UltimateFurnaceActive = registerFurnace(new UltimateFurnace(true), "UltimateFurnaceActive", false);
    }

    /**
     * Основной метод регистрации. Теперь он принимает ИМЯ вторым параметром.
     * Это гарантирует, что IDE перестанет считать вызовы дубликатами.
     */
    private static Block register(Block block, String name) {
        block.setUnlocalizedName(name);
        // Рекомендуется также добавлять ID мода в TextureName здесь, если они совпадают с именем
        // block.setBlockTextureName("magicalcrops:" + name);
        GameRegistry.registerBlock(block, name);
        return block;
    }

    /**
     * Специальный метод для печей, чтобы не прописывать Tab вручную каждый раз
     */
    private static Block registerFurnace(Block block, String name, boolean hasTab) {
        if (hasTab) block.setCreativeTab(MagicalCrops.tabMagical);
        return register(block, name);
    }
}