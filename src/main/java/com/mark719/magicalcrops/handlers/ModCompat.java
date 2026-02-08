package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.blocks.crops.*;
import com.mark719.magicalcrops.config.ConfigCrafting;
import com.mark719.magicalcrops.config.ConfigDisable;
import com.mark719.magicalcrops.config.ConfigMain;
import com.mark719.magicalcrops.help.BlockRegisterHelper;
import com.mark719.magicalcrops.help.ItemRegisterHelper;
import com.mark719.magicalcrops.help.OreCheck;
import com.mark719.magicalcrops.items.essence.AluminiumEssence;
import com.mark719.magicalcrops.items.essence.AlumiteEssence;
import com.mark719.magicalcrops.items.essence.ArditeEssence;
import com.mark719.magicalcrops.items.essence.BlizzEssence;
import com.mark719.magicalcrops.items.essence.BronzeEssence;
import com.mark719.magicalcrops.items.essence.CertusQuartzEssence;
import com.mark719.magicalcrops.items.essence.CobaltEssence;
import com.mark719.magicalcrops.items.essence.CopperEssence;
import com.mark719.magicalcrops.items.essence.ElectrumEssence;
import com.mark719.magicalcrops.items.essence.EnderiumEssence;
import com.mark719.magicalcrops.items.essence.FluixEssence;
import com.mark719.magicalcrops.items.essence.InvarEssence;
import com.mark719.magicalcrops.items.essence.LeadEssence;
import com.mark719.magicalcrops.items.essence.LumiumEssence;
import com.mark719.magicalcrops.items.essence.ManasteelEssence;
import com.mark719.magicalcrops.items.essence.ManyullynEssence;
import com.mark719.magicalcrops.items.essence.NickelEssence;
import com.mark719.magicalcrops.items.essence.OsmiumEssence;
import com.mark719.magicalcrops.items.essence.PeridotEssence;
import com.mark719.magicalcrops.items.essence.PlatinumEssence;
import com.mark719.magicalcrops.items.essence.RubberEssence;
import com.mark719.magicalcrops.items.essence.RubyEssence;
import com.mark719.magicalcrops.items.essence.SaltpeterEssence;
import com.mark719.magicalcrops.items.essence.SapphireEssence;
import com.mark719.magicalcrops.items.essence.SignalumEssence;
import com.mark719.magicalcrops.items.essence.SilverEssence;
import com.mark719.magicalcrops.items.essence.SteelEssence;
import com.mark719.magicalcrops.items.essence.SulfurEssence;
import com.mark719.magicalcrops.items.essence.TerrasteelEssence;
import com.mark719.magicalcrops.items.essence.TinEssence;
import com.mark719.magicalcrops.items.essence.YelloriteEssence;
import com.mark719.magicalcrops.items.seeds.AluminiumSeeds;
import com.mark719.magicalcrops.items.seeds.AlumiteSeeds;
import com.mark719.magicalcrops.items.seeds.ArditeSeeds;
import com.mark719.magicalcrops.items.seeds.BlizzSeeds;
import com.mark719.magicalcrops.items.seeds.BronzeSeeds;
import com.mark719.magicalcrops.items.seeds.CertusQuartzSeeds;
import com.mark719.magicalcrops.items.seeds.CobaltSeeds;
import com.mark719.magicalcrops.items.seeds.CopperSeeds;
import com.mark719.magicalcrops.items.seeds.ElectrumSeeds;
import com.mark719.magicalcrops.items.seeds.EnderiumSeeds;
import com.mark719.magicalcrops.items.seeds.FluixSeeds;
import com.mark719.magicalcrops.items.seeds.InvarSeeds;
import com.mark719.magicalcrops.items.seeds.LeadSeeds;
import com.mark719.magicalcrops.items.seeds.LumiumSeeds;
import com.mark719.magicalcrops.items.seeds.ManasteelSeeds;
import com.mark719.magicalcrops.items.seeds.ManyullynSeeds;
import com.mark719.magicalcrops.items.seeds.NickelSeeds;
import com.mark719.magicalcrops.items.seeds.OsmiumSeeds;
import com.mark719.magicalcrops.items.seeds.PeridotSeeds;
import com.mark719.magicalcrops.items.seeds.PlatinumSeeds;
import com.mark719.magicalcrops.items.seeds.RubberSeeds;
import com.mark719.magicalcrops.items.seeds.RubySeeds;
import com.mark719.magicalcrops.items.seeds.SaltpeterSeeds;
import com.mark719.magicalcrops.items.seeds.SapphireSeeds;
import com.mark719.magicalcrops.items.seeds.SignalumSeeds;
import com.mark719.magicalcrops.items.seeds.SilverSeeds;
import com.mark719.magicalcrops.items.seeds.SteelSeeds;
import com.mark719.magicalcrops.items.seeds.SulfurSeeds;
import com.mark719.magicalcrops.items.seeds.TerrasteelSeeds;
import com.mark719.magicalcrops.items.seeds.TinSeeds;
import com.mark719.magicalcrops.items.seeds.YelloriteSeeds;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModCompat {

    // Настройки выхода семян и эссенций для крафта
    static int seedOutPut = ConfigMain.SEED_OUTPUT;

    // Ссылки на базовые эссенции для рецептов
    static Item minicioEssence = Essence.MinicioEssence;
    static Item accioEssence = Essence.AccioEssence;
    static Item crucioEssence = Essence.CrucioEssence;
    static Item imperioEssence = Essence.ImperioEssence;
    static Item zivicioEssence = Essence.ZivicioEssence;

    // Семена Миничио нужны для крафта всех остальных семян (метадата 32767 - любой дамаг)
    static ItemStack minicioSeeds;

    public static Block farmland = Blocks.farmland;

    // --- БЛОКИ И ПРЕДМЕТЫ ---
    public static Block AluminiumCrop, ArditeCrop, CobaltCrop, CopperCrop, CertusQuartzCrop, LeadCrop, NickelCrop, OsmiumCrop, PeridotCrop, RubyCrop, SapphireCrop, PlatinumCrop, RubberCrop, SilverCrop, TinCrop, SulfurCrop, YelloriteCrop, AlumiteCrop, BlizzCrop, BronzeCrop, ElectrumCrop, EnderiumCrop, FluixCrop, InvarCrop, LumiumCrop, ManasteelCrop, ManyullynCrop, SaltpeterCrop, SignalumCrop, SteelCrop, TerrasteelCrop;
    public static Item AluminiumEssence, ArditeEssence, CobaltEssence, CopperEssence, CertusQuartzEssence, LeadEssence, NickelEssence, OsmiumEssence, PeridotEssence, RubyEssence, SapphireEssence, PlatinumEssence, RubberEssence, SilverEssence, TinEssence, SulfurEssence, YelloriteEssence, AlumiteEssence, BlizzEssence, BronzeEssence, ElectrumEssence, EnderiumEssence, FluixEssence, InvarEssence, LumiumEssence, ManasteelEssence, ManyullynEssence, SaltpeterEssence, SignalumEssence, SteelEssence, TerrasteelEssence;
    public static Item AluminiumSeeds, ArditeSeeds, CobaltSeeds, CopperSeeds, CertusQuartzSeeds, LeadSeeds, NickelSeeds, OsmiumSeeds, PeridotSeeds, RubySeeds, SapphireSeeds, PlatinumSeeds, RubberSeeds, SilverSeeds, TinSeeds, SulfurSeeds, YelloriteSeeds, AlumiteSeeds, BlizzSeeds, BronzeSeeds, ElectrumSeeds, EnderiumSeeds, FluixSeeds, InvarSeeds, LumiumSeeds, ManasteelSeeds, ManyullynSeeds, SaltpeterSeeds, SignalumSeeds, SteelSeeds, TerrasteelSeeds;

    /**
     * Главный метод инициализации. Проверяет наличие модов и регистрирует контент.
     */
    public static void loadCompat() {
        if (MSeeds.MinicioSeeds != null) {
            minicioSeeds = new ItemStack(MSeeds.MinicioSeeds, 1, 32767);
        } else {
            minicioSeeds = null;
        }

        // ALUMINIUM (Crucio Tier)
        if (!ConfigDisable.ALUMINIUM && OreCheck.getModOre("oreAluminium") != null) {
            AluminiumEssence = (new AluminiumEssence()).setUnlocalizedName("AluminiumEssence");
            AluminiumCrop = (new AluminiumCrop()).setUnlocalizedName("AluminiumCrop");
            AluminiumSeeds = (new AluminiumSeeds(AluminiumCrop, net.minecraft.init.Blocks.farmland))
                    .setTextureName("magicalcrops:seeds_blank")
                    .setUnlocalizedName("AluminiumSeeds");
            register(AluminiumEssence, AluminiumCrop, AluminiumSeeds);
            addRecipe(AluminiumSeeds, crucioEssence, "ingotAluminium");
            addEssenceToItemRecipe(AluminiumEssence, "ingotAluminium", ConfigCrafting.outPutAluminium);
            OreDictionary.registerOre("essenceAluminium", AluminiumEssence);
        }

        // ARDITE (Imperio Tier - Tinker's Construct)
        if (!ConfigDisable.ARDITE && OreCheck.getModOre("oreArdite") != null) {
            ArditeEssence = (new ArditeEssence()).setUnlocalizedName("ArditeEssence");
            ArditeCrop = (new ArditeCrop()).setUnlocalizedName("ArditeCrop");
            ArditeSeeds = (new ArditeSeeds(ArditeCrop, net.minecraft.init.Blocks.farmland))
                    .setTextureName("magicalcrops:seeds_blank")
                    .setUnlocalizedName("ArditeSeeds");
            register(ArditeEssence, ArditeCrop, ArditeSeeds);
            addRecipe(ArditeSeeds, imperioEssence, "ingotArdite");
            addEssenceToItemRecipe(ArditeEssence, "ingotArdite", ConfigCrafting.outPutArdite);
            OreDictionary.registerOre("essenceArdite", ArditeEssence);
        }

        // COBALT (Zivicio Tier - Tinker's Construct)
        if (!ConfigDisable.COBALT && OreCheck.getModOre("oreCobalt") != null) {
            CobaltEssence = (new CobaltEssence()).setUnlocalizedName("CobaltEssence");
            CobaltCrop = (new CobaltCrop()).setUnlocalizedName("CobaltCrop");
            CobaltSeeds = (new CobaltSeeds(CobaltCrop, net.minecraft.init.Blocks.farmland))
                    .setTextureName("magicalcrops:seeds_blank")
                    .setUnlocalizedName("CobaltSeeds");
            register(CobaltEssence, CobaltCrop, CobaltSeeds);
            addRecipe(CobaltSeeds, zivicioEssence, "ingotCobalt");
            addEssenceToItemRecipe(CobaltEssence, "ingotCobalt", ConfigCrafting.outPutCobalt);
            OreDictionary.registerOre("essenceCobalt", CobaltEssence);
        }

        // COPPER (Crucio Tier - Thermal/IC2)
        if (!ConfigDisable.COPPER && OreCheck.getModOre("oreCopper") != null) {
            CopperEssence = (new CopperEssence()).setUnlocalizedName("CopperEssence");
            CopperCrop = (new CopperCrop()).setUnlocalizedName("CopperCrop");
            CopperSeeds = (new CopperSeeds(CopperCrop, net.minecraft.init.Blocks.farmland))
                    .setTextureName("magicalcrops:seeds_blank")
                    .setUnlocalizedName("CopperSeeds");
            register(CopperEssence, CopperCrop, CopperSeeds);
            addRecipe(CopperSeeds, crucioEssence, "ingotCopper");
            addEssenceToItemRecipe(CopperEssence, "ingotCopper", ConfigCrafting.outPutCopper);
            OreDictionary.registerOre("essenceCopper", CopperEssence);
        }

        // CERTUS QUARTZ (Crucio Tier - AE2)
        if (!ConfigDisable.CERTUSQUARTZ && OreCheck.getModOre("oreCertusQuartz") != null) {
            CertusQuartzEssence = (new CertusQuartzEssence()).setUnlocalizedName("CertusQuartzEssence");
            CertusQuartzCrop = (new CertusQuartzCrop()).setUnlocalizedName("CertusQuartzCrop");
            CertusQuartzSeeds = (new CertusQuartzSeeds(CertusQuartzCrop, net.minecraft.init.Blocks.farmland))
                    .setTextureName("magicalcrops:seeds_blank")
                    .setUnlocalizedName("CertusQuartzSeeds");
            register(CertusQuartzEssence, CertusQuartzCrop, CertusQuartzSeeds);
            addRecipe(CertusQuartzSeeds, crucioEssence, "crystalCertusQuartz");
            addEssenceToItemRecipe(CertusQuartzEssence, "crystalCertusQuartz", ConfigCrafting.outPutCertusQuartz);
            OreDictionary.registerOre("essenceCertusQuartz", CertusQuartzEssence);
        }

        // LEAD (Crucio Tier - Thermal/IC2)
        if (!ConfigDisable.LEAD && OreCheck.getModOre("oreLead") != null) {
            LeadEssence = (new LeadEssence()).setUnlocalizedName("LeadEssence");
            LeadCrop = (new LeadCrop()).setUnlocalizedName("LeadCrop");
            LeadSeeds = (new LeadSeeds(LeadCrop, net.minecraft.init.Blocks.farmland))
                    .setTextureName("magicalcrops:seeds_blank")
                    .setUnlocalizedName("LeadSeeds");

            register(LeadEssence, LeadCrop, LeadSeeds);
            addRecipe(LeadSeeds, crucioEssence, "ingotLead");
            addEssenceToItemRecipe(LeadEssence, "ingotLead", ConfigCrafting.outPutLead);
            OreDictionary.registerOre("essenceLead", LeadEssence);
        }

        // NICKEL (Imperio Tier - Thermal)
        if (!ConfigDisable.NICKEL && OreCheck.getModOre("oreNickel") != null) {
            // Исправлено: заменено ModCompatEssence/Seeds на NickelEssence/Seeds для поддержки метаданных и иконок
            NickelEssence = (new NickelEssence()).setUnlocalizedName("NickelEssence");
            NickelCrop = (new NickelCrop()).setUnlocalizedName("NickelCrop");
            NickelSeeds = (new NickelSeeds(NickelCrop, net.minecraft.init.Blocks.farmland))
                    .setTextureName("magicalcrops:seeds_blank")
                    .setUnlocalizedName("NickelSeeds");

            register(NickelEssence, NickelCrop, NickelSeeds);
            addRecipe(NickelSeeds, imperioEssence, "ingotNickel");
            addEssenceToItemRecipe(NickelEssence, "ingotNickel", ConfigCrafting.outPutNickel);
            OreDictionary.registerOre("essenceNickel", NickelEssence);
        }

        // OSMIUM (Imperio Tier - Mekanism)
        if (!ConfigDisable.OSMIUM && OreCheck.getModOre("oreOsmium") != null) {
            OsmiumEssence = (new OsmiumEssence()).setUnlocalizedName("OsmiumEssence");
            OsmiumCrop = (new OsmiumCrop()).setUnlocalizedName("OsmiumCrop");
            OsmiumSeeds = (new OsmiumSeeds(OsmiumCrop, net.minecraft.init.Blocks.farmland))
                    .setTextureName("magicalcrops:seeds_blank")
                    .setUnlocalizedName("OsmiumSeeds");

            register(OsmiumEssence, OsmiumCrop, OsmiumSeeds);
            addRecipe(OsmiumSeeds, imperioEssence, "ingotOsmium");
            addEssenceToItemRecipe(OsmiumEssence, "ingotOsmium", ConfigCrafting.outPutOsmium);
            OreDictionary.registerOre("essenceOsmium", OsmiumEssence);
        }

        // PERIDOT (Imperio Tier - BOP/ProjectRed)
        if (!ConfigDisable.PERIDOT && OreCheck.getModOre("gemPeridot") != null) {
            PeridotEssence = (new PeridotEssence()).setUnlocalizedName("PeridotEssence");
            PeridotCrop = (new PeridotCrop()).setUnlocalizedName("PeridotCrop");
            PeridotSeeds = (new PeridotSeeds(PeridotCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("PeridotSeeds");

            register(PeridotEssence, PeridotCrop, PeridotSeeds);
            addRecipe(PeridotSeeds, imperioEssence, "gemPeridot");
            addEssenceToItemRecipe(PeridotEssence, "gemPeridot", ConfigCrafting.outPutPeridot);
            OreDictionary.registerOre("essencePeridot", PeridotEssence);
        }

        // RUBY (Imperio Tier)
        if (!ConfigDisable.RUBY && OreCheck.getModOre("gemRuby") != null) {
            RubyEssence = (new RubyEssence()).setUnlocalizedName("RubyEssence");
            RubyCrop = (new RubyCrop()).setUnlocalizedName("RubyCrop");
            RubySeeds = (new RubySeeds(RubyCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("RubySeeds");

            register(RubyEssence, RubyCrop, RubySeeds);
            addRecipe(RubySeeds, imperioEssence, "gemRuby");
            addEssenceToItemRecipe(RubyEssence, "gemRuby", ConfigCrafting.outPutRuby);
            OreDictionary.registerOre("essenceRuby", RubyEssence);
        }

        // SAPPHIRE (Imperio Tier)
        if (!ConfigDisable.SAPPHIRE && OreCheck.getModOre("gemSapphire") != null) {
            SapphireEssence = (new SapphireEssence()).setUnlocalizedName("SapphireEssence");
            SapphireCrop = (new SapphireCrop()).setUnlocalizedName("SapphireCrop");
            SapphireSeeds = (new SapphireSeeds(SapphireCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SapphireSeeds");

            register(SapphireEssence, SapphireCrop, SapphireSeeds);
            addRecipe(SapphireSeeds, imperioEssence, "gemSapphire");
            addEssenceToItemRecipe(SapphireEssence, "gemSapphire", ConfigCrafting.outPutSapphire);
            OreDictionary.registerOre("essenceSapphire", SapphireEssence);
        }

        // PLATINUM (Zivicio Tier - Thermal)
        if (!ConfigDisable.PLATINUM && OreCheck.getModOre("ingotPlatinum") != null) {
            PlatinumEssence = (new PlatinumEssence()).setUnlocalizedName("PlatinumEssence");
            PlatinumCrop = (new PlatinumCrop()).setUnlocalizedName("PlatinumCrop");
            PlatinumSeeds = (new PlatinumSeeds(PlatinumCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("PlatinumSeeds");

            register(PlatinumEssence, PlatinumCrop, PlatinumSeeds);
            addRecipe(PlatinumSeeds, zivicioEssence, "ingotPlatinum");
            addEssenceToItemRecipe(PlatinumEssence, "ingotPlatinum", ConfigCrafting.outPutPlatinum);
            OreDictionary.registerOre("essencePlatinum", PlatinumEssence);
        }

        // RUBBER (Accio Tier - IC2/MFR)
        if (!ConfigDisable.RUBBER && OreCheck.getModOre("itemRubber") != null) {
            RubberEssence = (new RubberEssence()).setUnlocalizedName("RubberEssence");
            RubberCrop = (new RubberCrop()).setUnlocalizedName("RubberCrop");
            RubberSeeds = (new RubberSeeds(RubberCrop, farmland))
                    .setTextureName("magicalcrops:seeds_blank")
                    .setUnlocalizedName("RubberSeeds");
            register(RubberEssence, RubberCrop, RubberSeeds);
            addRecipe(RubberSeeds, accioEssence, "itemRubber");
            addEssenceToItemRecipe(RubberEssence, "itemRubber", ConfigCrafting.outPutRubber);
            OreDictionary.registerOre("essenceRubber", RubberEssence);
        }

        // SILVER (Imperio Tier - Thermal)
        if (!ConfigDisable.SILVER && OreCheck.getModOre("ingotSilver") != null) {
            SilverEssence = (new SilverEssence()).setUnlocalizedName("SilverEssence");
            SilverCrop = (new SilverCrop()).setUnlocalizedName("SilverCrop");
            SilverSeeds = (new SilverSeeds(SilverCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SilverSeeds");

            register(SilverEssence, SilverCrop, SilverSeeds);
            addRecipe(SilverSeeds, imperioEssence, "ingotSilver");
            addEssenceToItemRecipe(SilverEssence, "ingotSilver", ConfigCrafting.outPutSilver);
            OreDictionary.registerOre("essenceSilver", SilverEssence);
        }

        // TIN (Crucio Tier - Thermal/IC2)
        if (!ConfigDisable.TIN && OreCheck.getModOre("ingotTin") != null) {
            TinEssence = (new TinEssence()).setUnlocalizedName("TinEssence");
            TinCrop = (new TinCrop()).setUnlocalizedName("TinCrop");
            TinSeeds = (new TinSeeds(TinCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("TinSeeds");

            register(TinEssence, TinCrop, TinSeeds);
            addRecipe(TinSeeds, crucioEssence, "ingotTin");
            addEssenceToItemRecipe(TinEssence, "ingotTin", ConfigCrafting.outPutTin);
            OreDictionary.registerOre("essenceTin", TinEssence);
        }

        // SULFUR (Crucio Tier - Thermal/Railcraft)
        if (!ConfigDisable.SULFUR && OreCheck.getModOre("dustSulfur") != null) {
            SulfurEssence = (new SulfurEssence()).setUnlocalizedName("SulfurEssence");
            SulfurCrop = (new SulfurCrop()).setUnlocalizedName("SulfurCrop");
            SulfurSeeds = (new SulfurSeeds(SulfurCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SulfurSeeds");


            register(SulfurEssence, SulfurCrop, SulfurSeeds);
            addRecipe(SulfurSeeds, crucioEssence, "dustSulfur");
            addEssenceToItemRecipe(SulfurEssence, "dustSulfur", ConfigCrafting.outPutSulfur);
            OreDictionary.registerOre("essenceSulfur", SulfurEssence);
        }

        // YELLORITE (Imperio Tier - Big Reactors)
        if (!ConfigDisable.YELLORITE && OreCheck.getModOre("ingotYellorium") != null) {
            YelloriteEssence = (new YelloriteEssence()).setUnlocalizedName("YelloriteEssence");
            YelloriteCrop = (new YelloriteCrop()).setUnlocalizedName("YelloriteCrop");
            YelloriteSeeds = (new YelloriteSeeds(YelloriteCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("YelloriteSeeds");

            register(YelloriteEssence, YelloriteCrop, YelloriteSeeds);
            addRecipe(YelloriteSeeds, imperioEssence, "ingotYellorium");
            addEssenceToItemRecipe(YelloriteEssence, "ingotYellorium", ConfigCrafting.outPutYellorite);
            OreDictionary.registerOre("essenceYellorite", YelloriteEssence);
        }

        // ALUMITE (Imperio Tier - Tinker's)
        if (!ConfigDisable.ALUMITE && OreCheck.getModOre("ingotAlumite") != null) {
            AlumiteEssence = (new AlumiteEssence()).setUnlocalizedName("AlumiteEssence");
            AlumiteCrop = (new AlumiteCrop()).setUnlocalizedName("AlumiteCrop");
            AlumiteSeeds = (new AlumiteSeeds(AlumiteCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("AlumiteSeeds");

            register(AlumiteEssence, AlumiteCrop, AlumiteSeeds);
            addRecipe(AlumiteSeeds, imperioEssence, "ingotAlumite");
            addEssenceToItemRecipe(AlumiteEssence, "ingotAlumite", ConfigCrafting.outPutAlumite);
            OreDictionary.registerOre("essenceAlumite", AlumiteEssence);
        }

        // BLIZZ (Imperio Tier - Thermal)
        if (!ConfigDisable.BLIZZ && OreCheck.getModOre("rodBlizz") != null) {
            BlizzEssence = (new BlizzEssence()).setUnlocalizedName("BlizzEssence");
            BlizzCrop = (new BlizzCrop()).setUnlocalizedName("BlizzCrop");
            BlizzSeeds = (new BlizzSeeds(BlizzCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("BlizzSeeds");

            register(BlizzEssence, BlizzCrop, BlizzSeeds);
            addRecipe(BlizzSeeds, imperioEssence, "rodBlizz");
            addEssenceToItemRecipe(BlizzEssence, "rodBlizz", ConfigCrafting.outPutBlizz);
            OreDictionary.registerOre("essenceBlizz", BlizzEssence);
        }

        // BRONZE (Crucio Tier - Thermal/IC2)
        if (!ConfigDisable.BRONZE && OreCheck.getModOre("ingotBronze") != null) {
            BronzeEssence = (new BronzeEssence()).setUnlocalizedName("BronzeEssence");
            BronzeCrop = (new BronzeCrop()).setUnlocalizedName("BronzeCrop");
            BronzeSeeds = (new BronzeSeeds(BronzeCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("BronzeSeeds");

            register(BronzeEssence, BronzeCrop, BronzeSeeds);
            addRecipe(BronzeSeeds, crucioEssence, "ingotBronze");
            addEssenceToItemRecipe(BronzeEssence, "ingotBronze", ConfigCrafting.outPutBronze);
            OreDictionary.registerOre("essenceBronze", BronzeEssence);
        }

        // ELECTRUM (Imperio Tier - Thermal)
        if (!ConfigDisable.ELECTRUM && OreCheck.getModOre("ingotElectrum") != null) {
            ElectrumEssence = (new ElectrumEssence()).setUnlocalizedName("ElectrumEssence");
            ElectrumCrop = (new ElectrumCrop()).setUnlocalizedName("ElectrumCrop");
            ElectrumSeeds = (new ElectrumSeeds(ElectrumCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("ElectrumSeeds");

            register(ElectrumEssence, ElectrumCrop, ElectrumSeeds);
            addRecipe(ElectrumSeeds, imperioEssence, "ingotElectrum");
            addEssenceToItemRecipe(ElectrumEssence, "ingotElectrum", ConfigCrafting.outPutElectrum);
            OreDictionary.registerOre("essenceElectrum", ElectrumEssence);
        }

        // ENDERIUM (Zivicio Tier - Thermal)
        if (!ConfigDisable.ENDERIUM && OreCheck.getModOre("ingotEnderium") != null) {
            EnderiumEssence = (new EnderiumEssence()).setUnlocalizedName("EnderiumEssence");
            EnderiumCrop = (new EnderiumCrop()).setUnlocalizedName("EnderiumCrop");
            EnderiumSeeds = (new EnderiumSeeds(EnderiumCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("EnderiumSeeds");

            register(EnderiumEssence, EnderiumCrop, EnderiumSeeds);
            addRecipe(EnderiumSeeds, zivicioEssence, "ingotEnderium");
            addEssenceToItemRecipe(EnderiumEssence, "ingotEnderium", ConfigCrafting.outPutEnderium);
            OreDictionary.registerOre("essenceEnderium", EnderiumEssence);
        }

        // FLUIX (Imperio Tier - AE2)
        if (!ConfigDisable.FLUIX && OreCheck.getModOre("crystalFluix") != null) {
            FluixEssence = (new FluixEssence()).setUnlocalizedName("FluixEssence");
            FluixCrop = (new FluixCrop()).setUnlocalizedName("FluixCrop");
            FluixSeeds = (new FluixSeeds(FluixCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("FluixSeeds");

            register(FluixEssence, FluixCrop, FluixSeeds);
            addRecipe(FluixSeeds, imperioEssence, "crystalFluix");
            addEssenceToItemRecipe(FluixEssence, "crystalFluix", ConfigCrafting.outPutFluix);
            OreDictionary.registerOre("essenceFluix", FluixEssence);
        }

        // INVAR (Imperio Tier - Thermal)
        if (!ConfigDisable.INVAR && OreCheck.getModOre("ingotInvar") != null) {
            InvarEssence = (new InvarEssence()).setUnlocalizedName("InvarEssence");
            InvarCrop = (new InvarCrop()).setUnlocalizedName("InvarCrop");
            InvarSeeds = (new InvarSeeds(InvarCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("InvarSeeds");

            register(InvarEssence, InvarCrop, InvarSeeds);
            addRecipe(InvarSeeds, imperioEssence, "ingotInvar");
            addEssenceToItemRecipe(InvarEssence, "ingotInvar", ConfigCrafting.outPutInvar);
            OreDictionary.registerOre("essenceInvar", InvarEssence);
        }

        // LUMIUM (Imperio Tier - Thermal)
        if (!ConfigDisable.LUMIUM && OreCheck.getModOre("ingotLumium") != null) {
            LumiumEssence = (new LumiumEssence()).setUnlocalizedName("LumiumEssence");
            LumiumCrop = (new LumiumCrop()).setUnlocalizedName("LumiumCrop");
            LumiumSeeds = (new LumiumSeeds(LumiumCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("LumiumSeeds");

            register(LumiumEssence, LumiumCrop, LumiumSeeds);
            addRecipe(LumiumSeeds, imperioEssence, "ingotLumium");
            addEssenceToItemRecipe(LumiumEssence, "ingotLumium", ConfigCrafting.outPutLumium);
            OreDictionary.registerOre("essenceLumium", LumiumEssence);
        }

        // MANASTEEL (Crucio Tier - Botania)
        if (!ConfigDisable.MANASTEEL && OreCheck.getModOre("ingotManasteel") != null) {
            ManasteelEssence = (new ManasteelEssence()).setUnlocalizedName("ManasteelEssence");
            ManasteelCrop = (new ManasteelCrop()).setUnlocalizedName("ManasteelCrop");
            ManasteelSeeds = (new ManasteelSeeds(ManasteelCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("ManasteelSeeds");

            register(ManasteelEssence, ManasteelCrop, ManasteelSeeds);
            addRecipe(ManasteelSeeds, crucioEssence, "ingotManasteel");
            addEssenceToItemRecipe(ManasteelEssence, "ingotManasteel", ConfigCrafting.outPutManasteel);
            OreDictionary.registerOre("essenceManasteel", ManasteelEssence);
        }

        // MANYULLYN (Zivicio Tier - Tinker's)
        if (!ConfigDisable.MANYULLYN && OreCheck.getModOre("ingotManyullyn") != null) {
            ManyullynEssence = (new ManyullynEssence()).setUnlocalizedName("ManyullynEssence");
            ManyullynCrop = (new ManyullynCrop()).setUnlocalizedName("ManyullynCrop");
            ManyullynSeeds = (new ManyullynSeeds(ManyullynCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("ManyullynSeeds");

            register(ManyullynEssence, ManyullynCrop, ManyullynSeeds);
            addRecipe(ManyullynSeeds, zivicioEssence, "ingotManyullyn");
            addEssenceToItemRecipe(ManyullynEssence, "ingotManyullyn", ConfigCrafting.outPutManyullyn);
            OreDictionary.registerOre("essenceManyullyn", ManyullynEssence);
        }

        // SALTPETER (Crucio Tier - Railcraft)
        if (!ConfigDisable.SALTPETER && OreCheck.getModOre("dustSaltpeter") != null) {
            SaltpeterEssence = (new SaltpeterEssence()).setUnlocalizedName("SaltpeterEssence");
            SaltpeterCrop = (new SaltpeterCrop()).setUnlocalizedName("SaltpeterCrop");
            SaltpeterSeeds = (new SaltpeterSeeds(SaltpeterCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SaltpeterSeeds");

            register(SaltpeterEssence, SaltpeterCrop, SaltpeterSeeds);
            addRecipe(SaltpeterSeeds, crucioEssence, "dustSaltpeter");
            addEssenceToItemRecipe(SaltpeterEssence, "dustSaltpeter", ConfigCrafting.outPutSaltpeter);
            OreDictionary.registerOre("essenceSaltpeter", SaltpeterEssence);
        }

        // SIGNALUM (Imperio Tier - Thermal)
        if (!ConfigDisable.SIGNALUM && OreCheck.getModOre("ingotSignalum") != null) {
            SignalumEssence = (new SignalumEssence()).setUnlocalizedName("SignalumEssence");
            SignalumCrop = (new SignalumCrop()).setUnlocalizedName("SignalumCrop");
            SignalumSeeds = (new SignalumSeeds(SignalumCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SignalumSeeds");

            register(SignalumEssence, SignalumCrop, SignalumSeeds);
            addRecipe(SignalumSeeds, imperioEssence, "ingotSignalum");
            addEssenceToItemRecipe(SignalumEssence, "ingotSignalum", ConfigCrafting.outPutSignalum);
            OreDictionary.registerOre("essenceSignalum", SignalumEssence);
        }

        // STEEL (Imperio Tier - Mekanism/IC2)
        if (!ConfigDisable.STEEL && OreCheck.getModOre("ingotSteel") != null) {
            SteelEssence = (new SteelEssence()).setUnlocalizedName("SteelEssence");
            SteelCrop = (new SteelCrop()).setUnlocalizedName("SteelCrop");
            SteelSeeds = (new SteelSeeds(SteelCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SteelSeeds");

            register(SteelEssence, SteelCrop, SteelSeeds);
            addRecipe(SteelSeeds, imperioEssence, "ingotSteel");
            addEssenceToItemRecipe(SteelEssence, "ingotSteel", ConfigCrafting.outPutSteel);
            OreDictionary.registerOre("essenceSteel", SteelEssence);
        }

        // TERRASTEEL (Zivicio Tier - Botania)
        if (!ConfigDisable.TERRASTEEL && OreCheck.getModOre("ingotTerrasteel") != null) {
            TerrasteelEssence = (new TerrasteelEssence()).setUnlocalizedName("TerrasteelEssence");
            TerrasteelCrop = (new TerrasteelCrop()).setUnlocalizedName("TerrasteelCrop");
            TerrasteelSeeds = (new TerrasteelSeeds(TerrasteelCrop, farmland)).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("TerrasteelSeeds");

            register(TerrasteelEssence, TerrasteelCrop, TerrasteelSeeds);
            addRecipe(TerrasteelSeeds, zivicioEssence, "ingotTerrasteel");
            addEssenceToItemRecipe(TerrasteelEssence, "ingotTerrasteel", ConfigCrafting.outPutTerrasteel);
            OreDictionary.registerOre("essenceTerrasteel", TerrasteelEssence);
        }
    }

    // Вспомогательный метод для регистрации
    private static void register(Item essence, Block crop, Item seeds) {
        ItemRegisterHelper.registerItem(essence);
        BlockRegisterHelper.registerBlock(crop, crop.getUnlocalizedName().replace("tile.", ""));
        ItemRegisterHelper.registerItem(seeds);
    }

    // Вспомогательный метод для добавления рецепта семян
    private static void addRecipe(Item seeds, Item essenceTier, String oreDictName) {
        if (minicioSeeds == null) {
            return;
        }
        // Явное приведение к (IRecipe) исправляет ошибку Ambiguous method call
        GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(seeds, seedOutPut),
                "YXY", "XZX", "YXY",
                'X', essenceTier,
                'Y', oreDictName,
                'Z', minicioSeeds
        ));
    }

    // Вспомогательный метод для крафта ресурсов из эссенции
    private static void addEssenceToItemRecipe(Item essence, String oreDictName, int outputAmount) {
        ItemStack output = OreCheck.getModOre(oreDictName);
        if (output != null) {
            output.stackSize = outputAmount;

            GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(output,
                    "EEE", " E ", "EEE",
                    'E', essence
            ));

            GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(output,
                    " E ", "EEE", " E ",
                    'E', essence
            ));
        }
    } // Конец метода addEssenceToItemRecipe

} // Конец всего КЛАССА (убедитесь, что эта скобка есть и она одна в самом низу)
