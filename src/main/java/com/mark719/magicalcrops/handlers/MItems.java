package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.items.*;
import com.mark719.magicalcrops.seedbags.*;
import net.minecraft.item.Item;

/**
 * Registry class for Magical Crops miscellaneous items.
 * Refactored for readability and IntelliJ IDEA integration (MC 1.7.10).
 */
public class MItems {

    // Infusion Stones
    public static Item InfusionStoneWeak = new ItemInfusionStone1Weak().setUnlocalizedName("InfusionStoneWeak");
    public static Item InfusionStoneRegular = new ItemInfusionStone2Regular().setUnlocalizedName("InfusionStoneRegular");
    public static Item InfusionStoneStrong = new ItemInfusionStone3Strong().setUnlocalizedName("InfusionStoneStrong");
    public static Item InfusionStoneExtreme = new ItemInfusionStone4Extreme().setUnlocalizedName("InfusionStoneExtreme");
    public static Item InfusionStoneMaster = new ItemInfusionStone5Master().setUnlocalizedName("InfusionStoneMaster");

    // Fertilizers
    public static Item MagicalFertilizer = new ItemMagicalFertilizer().setUnlocalizedName("MagicalFertilizer");
    public static Item EssenceFertilizer = new ItemEssenceFertilizer().setUnlocalizedName("EssenceFertilizer");

    // Tools and Books
    public static Item ExperienceBook = new ItemExperienceBook().setUnlocalizedName("ExperienceBook");
    public static Item EssenceIngots = new ItemsEssenceIngots().setUnlocalizedName("EssenceIngots");

    // Seed Bags (Casting is retained as per original decompile)
    public static Item SeedBagAccio = (Item) new ItemSeedBagAccio();
    public static Item SeedBagCrucio = (Item) new ItemSeedBagCrucio();
    public static Item SeedBagImperio = (Item) new ItemSeedBagImperio();
    public static Item SeedBagZivicio = (Item) new ItemSeedBagZivicio();

    // Special Food / Apples
    public static Item UltimateDiamondApple = new ItemUltimateDiamondApple(4, 2.0F, false)
            .setUnlocalizedName("UltimateDiamondApple")
            .setTextureName("magicalcrops:apple_diamond");

    public static Item EmeraldApple = new ItemEmeraldApple(4, 2.0F, false)
            .setUnlocalizedName("EmeraldApple")
            .setTextureName("magicalcrops:apple_emerald");

    public static Item UltimateEmeraldApple = new ItemUltimateEmeraldApple(4, 2.0F, false)
            .setUnlocalizedName("UltimateEmeraldApple")
            .setTextureName("magicalcrops:apple_emerald");
}