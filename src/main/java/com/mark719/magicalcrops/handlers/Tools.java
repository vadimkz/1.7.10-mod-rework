package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.items.tools.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Registry class for Magical Crops tools.
 * Refactored for Minecraft 1.7.10 (Forge) using modern MCP mappings.
 */
public class Tools {

    // Tool Materials: Name, HarvestLevel, MaxUses, Efficiency, Damage, Enchantability
    public static Item.ToolMaterial AccioMaterial = EnumHelper.addToolMaterial("AccioMaterial", 3, 1900, 8.0F, 4.0F, 20);
    public static Item.ToolMaterial CrucioMaterial = EnumHelper.addToolMaterial("CrucioMaterial", 3, 2400, 9.0F, 6.0F, 25);
    public static Item.ToolMaterial ImperioMaterial = EnumHelper.addToolMaterial("ImperioMaterial", 4, 4000, 10.0F, 8.0F, 35);
    public static Item.ToolMaterial ZivicioMaterial = EnumHelper.addToolMaterial("ZivicioMaterial", 4, 8500, 15.0F, 10.0F, 50);

    // Accio Tools
    public static Item AccioPickaxe = new AccioPickaxe(0, AccioMaterial)
            .setUnlocalizedName("AccioPickaxe")
            .setTextureName("magicalcrops:tools_accio_pickaxe");

    public static Item AccioSword = new AccioSword(0, AccioMaterial)
            .setUnlocalizedName("AccioSword")
            .setTextureName("magicalcrops:tools_accio_sword");

    public static Item AccioAxe = new AccioAxe(0, AccioMaterial)
            .setUnlocalizedName("AccioAxe")
            .setTextureName("magicalcrops:tools_accio_axe");

    public static Item AccioShovel = new AccioShovel(0, AccioMaterial)
            .setUnlocalizedName("AccioShovel")
            .setTextureName("magicalcrops:tools_accio_spade");

    public static Item AccioHoe = new AccioHoe(0, AccioMaterial)
            .setUnlocalizedName("AccioHoe")
            .setTextureName("magicalcrops:tools_accio_hoe");

    // Crucio Tools
    public static Item CrucioPickaxe = new CrucioPickaxe(0, CrucioMaterial)
            .setUnlocalizedName("CrucioPickaxe")
            .setTextureName("magicalcrops:tools_crucio_pickaxe");

    public static Item CrucioSword = new CrucioSword(0, CrucioMaterial)
            .setUnlocalizedName("CrucioSword")
            .setTextureName("magicalcrops:tools_crucio_sword");

    public static Item CrucioAxe = new CrucioAxe(0, CrucioMaterial)
            .setUnlocalizedName("CrucioAxe")
            .setTextureName("magicalcrops:tools_crucio_axe");

    public static Item CrucioShovel = new CrucioShovel(0, CrucioMaterial)
            .setUnlocalizedName("CrucioShovel")
            .setTextureName("magicalcrops:tools_crucio_spade");

    public static Item CrucioHoe = new CrucioHoe(0, CrucioMaterial)
            .setUnlocalizedName("CrucioHoe")
            .setTextureName("magicalcrops:tools_crucio_hoe");

    // Imperio Tools
    public static Item ImperioPickaxe = new ImperioPickaxe(0, ImperioMaterial)
            .setUnlocalizedName("ImperioPickaxe")
            .setTextureName("magicalcrops:tools_imperio_pickaxe");

    public static Item ImperioSword = new ImperioSword(0, ImperioMaterial)
            .setUnlocalizedName("ImperioSword")
            .setTextureName("magicalcrops:tools_imperio_sword");

    public static Item ImperioAxe = new ImperioAxe(0, ImperioMaterial)
            .setUnlocalizedName("ImperioAxe")
            .setTextureName("magicalcrops:tools_imperio_axe");

    public static Item ImperioShovel = new ImperioShovel(0, ImperioMaterial)
            .setUnlocalizedName("ImperioShovel")
            .setTextureName("magicalcrops:tools_imperio_spade");

    public static Item ImperioHoe = new ImperioHoe(0, ImperioMaterial)
            .setUnlocalizedName("ImperioHoe")
            .setTextureName("magicalcrops:tools_imperio_hoe");

    // Zivicio Tools
    public static Item ZivicioPickaxe = new ZivicioPickaxe(0, ZivicioMaterial)
            .setUnlocalizedName("ZivicioPickaxe")
            .setTextureName("magicalcrops:tools_zivicio_pickaxe");

    public static Item ZivicioSword = new ZivicioSword(0, ZivicioMaterial)
            .setUnlocalizedName("ZivicioSword")
            .setTextureName("magicalcrops:tools_zivicio_sword");

    public static Item ZivicioAxe = new ZivicioAxe(0, ZivicioMaterial)
            .setUnlocalizedName("ZivicioAxe")
            .setTextureName("magicalcrops:tools_zivicio_axe");

    public static Item ZivicioShovel = new ZivicioShovel(0, ZivicioMaterial)
            .setUnlocalizedName("ZivicioShovel")
            .setTextureName("magicalcrops:tools_zivicio_spade");

    public static Item ZivicioHoe = new ZivicioHoe(0, ZivicioMaterial)
            .setUnlocalizedName("ZivicioHoe")
            .setTextureName("magicalcrops:tools_zivicio_hoe");
}