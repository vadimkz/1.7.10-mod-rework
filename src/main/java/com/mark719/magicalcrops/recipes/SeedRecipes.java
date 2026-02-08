/*     */ package com.mark719.magicalcrops.recipes;
/*     */ 
/*     */ import com.mark719.magicalcrops.config.ConfigMain;
/*     */ import com.mark719.magicalcrops.handlers.Essence;
/*     */ import com.mark719.magicalcrops.handlers.MSeeds;
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.IRecipe;
/*     */ import net.minecraftforge.oredict.ShapedOreRecipe;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SeedRecipes
/*     */ {
/*  21 */   static int seedOutPut = ConfigMain.SEED_OUTPUT;
/*     */   
/*  23 */   static Item minicioEssence = Essence.MinicioEssence;
/*  24 */   static Item accioEssence = Essence.AccioEssence;
/*  25 */   static Item crucioEssence = Essence.CrucioEssence;
/*  26 */   static Item imperioEssence = Essence.ImperioEssence;
/*  27 */   static Item zivicioEssence = Essence.ZivicioEssence;
/*     */   
/*  29 */   static ItemStack allDye = new ItemStack(Items.dye, 1, 32767);
/*  30 */   static ItemStack minicioSeed = new ItemStack(MSeeds.MinicioSeeds);
/*  31 */   static ItemStack enchantedBook = new ItemStack((Item)Items.enchanted_book, 1, 32767);
/*     */   
/*  33 */   static ItemStack airSeeds = new ItemStack(MSeeds.AirSeeds, 1, 32767);
/*  34 */   static ItemStack coalSeeds = new ItemStack(MSeeds.CoalSeeds, 1, 32767);
/*  35 */   static ItemStack diamondSeeds = new ItemStack(MSeeds.DiamondSeeds, 1, 32767);
/*  36 */   static ItemStack dyeSeeds = new ItemStack(MSeeds.DyeSeeds, 1, 32767);
/*  37 */   static ItemStack earthSeeds = new ItemStack(MSeeds.EarthSeeds, 1, 32767);
/*  38 */   static ItemStack emeraldSeeds = new ItemStack(MSeeds.EmeraldSeeds, 1, 32767);
/*  39 */   static ItemStack experienceSeeds = new ItemStack(MSeeds.ExperienceSeeds, 1, 32767);
/*  40 */   static ItemStack fireSeeds = new ItemStack(MSeeds.FireSeeds, 1, 32767);
/*  41 */   static ItemStack glowstoneSeeds = new ItemStack(MSeeds.GlowstoneSeeds, 1, 32767);
/*  42 */   static ItemStack goldSeeds = new ItemStack(MSeeds.GoldSeeds, 1, 32767);
/*  43 */   static ItemStack ironSeeds = new ItemStack(MSeeds.IronSeeds, 1, 32767);
/*  44 */   static ItemStack lapisSeeds = new ItemStack(MSeeds.LapisSeeds, 1, 32767);
/*  45 */   static ItemStack minicioSeeds = new ItemStack(MSeeds.MinicioSeeds, 1, 32767);
/*  46 */   static ItemStack natureSeeds = new ItemStack(MSeeds.NatureSeeds, 1, 32767);
/*  47 */   static ItemStack netherSeeds = new ItemStack(MSeeds.NetherSeeds, 1, 32767);
/*  48 */   static ItemStack obsidianSeeds = new ItemStack(MSeeds.ObsidianSeeds, 1, 32767);
/*  49 */   static ItemStack quartzSeeds = new ItemStack(MSeeds.QuartzSeeds, 1, 32767);
/*  50 */   static ItemStack redstoneSeeds = new ItemStack(MSeeds.RedstoneSeeds, 1, 32767);
/*  51 */   static ItemStack waterSeeds = new ItemStack(MSeeds.WaterSeeds, 1, 32767);
/*     */   
/*  53 */   static ItemStack cowSeeds = new ItemStack(MSeeds.CowSeeds, 1, 32767);
/*  54 */   static ItemStack chickenSeeds = new ItemStack(MSeeds.ChickenSeeds, 1, 32767);
/*  55 */   static ItemStack sheepSeeds = new ItemStack(MSeeds.SheepSeeds, 1, 32767);
/*  56 */   static ItemStack pigSeeds = new ItemStack(MSeeds.PigSeeds, 1, 32767);
/*  57 */   static ItemStack creeperSeeds = new ItemStack(MSeeds.CreeperSeeds, 1, 32767);
/*  58 */   static ItemStack blazeSeeds = new ItemStack(MSeeds.BlazeSeeds, 1, 32767);
/*  59 */   static ItemStack ghastSeeds = new ItemStack(MSeeds.GhastSeeds, 1, 32767);
/*  60 */   static ItemStack skeletonSeeds = new ItemStack(MSeeds.SkeletonSeeds, 1, 32767);
/*  61 */   static ItemStack slimeSeeds = new ItemStack(MSeeds.SlimeSeeds, 1, 32767);
/*  62 */   static ItemStack spiderSeeds = new ItemStack(MSeeds.SpiderSeeds, 1, 32767);
/*  63 */   static ItemStack witherSeeds = new ItemStack(MSeeds.WitherSeeds, 1, 32767);
/*  64 */   static ItemStack endermanSeeds = new ItemStack(MSeeds.EndermanSeeds, 1, 32767);
/*     */ 
/*     */ 
/*     */   
/*     */   public static void loadRecipes() {
/*  69 */     GameRegistry.addRecipe(new ItemStack(MSeeds.MinicioSeeds, 1), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), minicioEssence, Character.valueOf('Y'), Items.wheat_seeds });
/*     */ 
/*     */     
/*  72 */     GameRegistry.addRecipe(new ItemStack(MSeeds.CoalSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Items.coal, Character.valueOf('Z'), minicioSeed });
/*  73 */     GameRegistry.addRecipe(new ItemStack(MSeeds.DyeSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), allDye, Character.valueOf('Z'), minicioSeed });
/*  74 */     GameRegistry.addRecipe(new ItemStack(MSeeds.WaterSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Items.water_bucket, Character.valueOf('Z'), minicioSeed });
/*  75 */     GameRegistry.addRecipe(new ItemStack(MSeeds.FireSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Items.lava_bucket, Character.valueOf('Z'), minicioSeed });
/*  76 */     GameRegistry.addRecipe(new ItemStack(MSeeds.EarthSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Blocks.dirt, Character.valueOf('Z'), minicioSeed });
/*  77 */     GameRegistry.addRecipe(new ItemStack(MSeeds.AirSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Items.glass_bottle, Character.valueOf('Z'), minicioSeed });
/*  78 */     GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(MSeeds.NatureSeeds, seedOutPut), new Object[] { Boolean.valueOf(true), "YXY", "XZX", "YXY", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), "natureMaterial", Character.valueOf('Z'), minicioSeed }));
/*     */     
/*  80 */     GameRegistry.addRecipe(new ItemStack(MSeeds.RedstoneSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), Items.redstone, Character.valueOf('Z'), minicioSeed });
/*  81 */     GameRegistry.addRecipe(new ItemStack(MSeeds.GlowstoneSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), Items.glowstone_dust, Character.valueOf('Z'), minicioSeed });
/*  82 */     GameRegistry.addRecipe(new ItemStack(MSeeds.ObsidianSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), Blocks.obsidian, Character.valueOf('Z'), minicioSeed });
/*  83 */     GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(MSeeds.NetherSeeds, seedOutPut), new Object[] { Boolean.valueOf(true), "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), "netherMaterial", Character.valueOf('Z'), minicioSeed }));
/*     */     
/*  85 */     GameRegistry.addRecipe(new ItemStack(MSeeds.IronSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), Items.iron_ingot, Character.valueOf('Z'), minicioSeed });
/*  86 */     GameRegistry.addRecipe(new ItemStack(MSeeds.GoldSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), Items.gold_ingot, Character.valueOf('Z'), minicioSeed });
/*  87 */     GameRegistry.addRecipe(new ItemStack(MSeeds.LapisSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 4), Character.valueOf('Z'), minicioSeed });
/*  88 */     GameRegistry.addRecipe(new ItemStack(MSeeds.ExperienceSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Z'), minicioSeed, Character.valueOf('Y'), enchantedBook });
/*  89 */     GameRegistry.addRecipe(new ItemStack(MSeeds.QuartzSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), Items.quartz, Character.valueOf('Z'), minicioSeed });
/*     */     
/*  91 */     GameRegistry.addRecipe(new ItemStack(MSeeds.DiamondSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), Items.diamond, Character.valueOf('Z'), minicioSeed });
/*  92 */     GameRegistry.addRecipe(new ItemStack(MSeeds.EmeraldSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), Items.emerald, Character.valueOf('Z'), minicioSeed });
/*     */ 
/*     */     
/*  95 */     GameRegistry.addRecipe(new ItemStack(MSeeds.CowSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), Items.leather, Character.valueOf('Z'), minicioSeeds });
/*  96 */     GameRegistry.addRecipe(new ItemStack(MSeeds.PigSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), Items.porkchop, Character.valueOf('Z'), minicioSeeds });
/*  97 */     GameRegistry.addRecipe(new ItemStack(MSeeds.ChickenSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), Items.egg, Character.valueOf('Z'), minicioSeeds });
/*  98 */     GameRegistry.addRecipe(new ItemStack(MSeeds.SheepSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), Blocks.wool, Character.valueOf('Z'), minicioSeeds });
/*  99 */     GameRegistry.addRecipe(new ItemStack(MSeeds.CreeperSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), Items.gunpowder, Character.valueOf('Z'), minicioSeeds });
/* 100 */     GameRegistry.addRecipe(new ItemStack(MSeeds.BlazeSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), Items.blaze_rod, Character.valueOf('Z'), minicioSeeds });
/* 101 */     GameRegistry.addRecipe(new ItemStack(MSeeds.EndermanSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), Items.ender_pearl, Character.valueOf('Z'), minicioSeeds });
/* 102 */     GameRegistry.addRecipe(new ItemStack(MSeeds.SkeletonSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), Items.bone, Character.valueOf('Z'), minicioSeeds });
/* 103 */     GameRegistry.addRecipe(new ItemStack(MSeeds.SlimeSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), Items.slime_ball, Character.valueOf('Z'), minicioSeeds });
/* 104 */     GameRegistry.addRecipe(new ItemStack(MSeeds.SpiderSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), Items.spider_eye, Character.valueOf('Z'), minicioSeeds });
/* 105 */     GameRegistry.addRecipe(new ItemStack(MSeeds.GhastSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), Items.ghast_tear, Character.valueOf('Z'), minicioSeeds });
/* 106 */     GameRegistry.addRecipe(new ItemStack(MSeeds.WitherSeeds, seedOutPut), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), new ItemStack(Items.skull, 1, 1), Character.valueOf('Z'), skeletonSeeds });
/*     */ 
/*     */     
/* 109 */     GameRegistry.addRecipe(new ItemStack(Essence.AirEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), airSeeds });
/* 110 */     GameRegistry.addRecipe(new ItemStack(Essence.CoalEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), coalSeeds });
/* 111 */     GameRegistry.addRecipe(new ItemStack(Essence.DiamondEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), diamondSeeds });
/* 112 */     GameRegistry.addRecipe(new ItemStack(Essence.DyeEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), dyeSeeds });
/* 113 */     GameRegistry.addRecipe(new ItemStack(Essence.EarthEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), earthSeeds });
/* 114 */     GameRegistry.addRecipe(new ItemStack(Essence.EmeraldEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), emeraldSeeds });
/* 115 */     GameRegistry.addRecipe(new ItemStack(Essence.ExperienceEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), experienceSeeds });
/* 116 */     GameRegistry.addRecipe(new ItemStack(Essence.FireEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), fireSeeds });
/* 117 */     GameRegistry.addRecipe(new ItemStack(Essence.GlowstoneEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), glowstoneSeeds });
/* 118 */     GameRegistry.addRecipe(new ItemStack(Essence.GoldEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), goldSeeds });
/* 119 */     GameRegistry.addRecipe(new ItemStack(Essence.IronEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ironSeeds });
/* 120 */     GameRegistry.addRecipe(new ItemStack(Essence.LapisEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), lapisSeeds });
/* 121 */     GameRegistry.addRecipe(new ItemStack(Essence.NatureEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), natureSeeds });
/* 122 */     GameRegistry.addRecipe(new ItemStack(Essence.NetherEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), netherSeeds });
/* 123 */     GameRegistry.addRecipe(new ItemStack(Essence.ObsidianEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), obsidianSeeds });
/* 124 */     GameRegistry.addRecipe(new ItemStack(Essence.QuartzEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), quartzSeeds });
/* 125 */     GameRegistry.addRecipe(new ItemStack(Essence.RedstoneEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), redstoneSeeds });
/* 126 */     GameRegistry.addRecipe(new ItemStack(Essence.WaterEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), waterSeeds });
/*     */ 
/*     */     
/* 129 */     GameRegistry.addRecipe(new ItemStack(Essence.CowEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), cowSeeds });
/* 130 */     GameRegistry.addRecipe(new ItemStack(Essence.ChickenEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), chickenSeeds });
/* 131 */     GameRegistry.addRecipe(new ItemStack(Essence.SheepEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), sheepSeeds });
/* 132 */     GameRegistry.addRecipe(new ItemStack(Essence.PigEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), pigSeeds });
/* 133 */     GameRegistry.addRecipe(new ItemStack(Essence.CreeperEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), creeperSeeds });
/* 134 */     GameRegistry.addRecipe(new ItemStack(Essence.BlazeEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), blazeSeeds });
/* 135 */     GameRegistry.addRecipe(new ItemStack(Essence.EndermanEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), endermanSeeds });
/* 136 */     GameRegistry.addRecipe(new ItemStack(Essence.SkeletonEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), skeletonSeeds });
/* 137 */     GameRegistry.addRecipe(new ItemStack(Essence.SlimeEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), slimeSeeds });
/* 138 */     GameRegistry.addRecipe(new ItemStack(Essence.SpiderEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), spiderSeeds });
/* 139 */     GameRegistry.addRecipe(new ItemStack(Essence.GhastEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), ghastSeeds });
/* 140 */     GameRegistry.addRecipe(new ItemStack(Essence.WitherEssence, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), witherSeeds });
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\recipes\SeedRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
