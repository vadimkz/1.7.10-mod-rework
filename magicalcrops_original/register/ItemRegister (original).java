/*     */ package com.mark719.magicalcrops.register;
/*     */ 
/*     */ import com.mark719.magicalcrops.config.ConfigDisable;
/*     */ import com.mark719.magicalcrops.config.ConfigMain;
/*     */ import com.mark719.magicalcrops.handlers.Armour;
/*     */ import com.mark719.magicalcrops.handlers.Essence;
/*     */ import com.mark719.magicalcrops.handlers.MItems;
/*     */ import com.mark719.magicalcrops.handlers.MSeeds;
/*     */ import com.mark719.magicalcrops.handlers.Tools;
/*     */ import com.mark719.magicalcrops.help.ItemRegisterHelper;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ItemRegister
/*     */ {
/*     */   public static void registerItem() {
/*  17 */     ItemRegisterHelper.registerItem(MItems.InfusionStoneWeak);
/*  18 */     ItemRegisterHelper.registerItem(MItems.InfusionStoneRegular);
/*  19 */     ItemRegisterHelper.registerItem(MItems.InfusionStoneStrong);
/*  20 */     ItemRegisterHelper.registerItem(MItems.InfusionStoneExtreme);
/*  21 */     ItemRegisterHelper.registerItem(MItems.InfusionStoneMaster);
/*     */ 
/*     */     
/*  24 */     if (ConfigDisable.AIR) ItemRegisterHelper.registerItem(MSeeds.AirSeeds); 
/*  25 */     if (ConfigDisable.COAL) ItemRegisterHelper.registerItem(MSeeds.CoalSeeds); 
/*  26 */     if (ConfigDisable.DYE) ItemRegisterHelper.registerItem(MSeeds.DyeSeeds); 
/*  27 */     if (ConfigDisable.EARTH) ItemRegisterHelper.registerItem(MSeeds.EarthSeeds); 
/*  28 */     if (ConfigDisable.FIRE) ItemRegisterHelper.registerItem(MSeeds.FireSeeds); 
/*  29 */     if (ConfigDisable.MINICIO) ItemRegisterHelper.registerItem(MSeeds.MinicioSeeds); 
/*  30 */     if (ConfigDisable.NATURE) ItemRegisterHelper.registerItem(MSeeds.NatureSeeds); 
/*  31 */     if (ConfigDisable.WATER) ItemRegisterHelper.registerItem(MSeeds.WaterSeeds); 
/*  32 */     if (ConfigDisable.REDSTONE) ItemRegisterHelper.registerItem(MSeeds.RedstoneSeeds); 
/*  33 */     if (ConfigDisable.GLOWSTONE) ItemRegisterHelper.registerItem(MSeeds.GlowstoneSeeds); 
/*  34 */     if (ConfigDisable.OBSIDIAN) ItemRegisterHelper.registerItem(MSeeds.ObsidianSeeds); 
/*  35 */     if (ConfigDisable.NETHER) ItemRegisterHelper.registerItem(MSeeds.NetherSeeds); 
/*  36 */     if (ConfigDisable.IRON) ItemRegisterHelper.registerItem(MSeeds.IronSeeds); 
/*  37 */     if (ConfigDisable.GOLD) ItemRegisterHelper.registerItem(MSeeds.GoldSeeds); 
/*  38 */     if (ConfigDisable.LAPIS) ItemRegisterHelper.registerItem(MSeeds.LapisSeeds); 
/*  39 */     if (ConfigDisable.EXPERIENCE) ItemRegisterHelper.registerItem(MSeeds.ExperienceSeeds); 
/*  40 */     if (ConfigDisable.QUARTZ) ItemRegisterHelper.registerItem(MSeeds.QuartzSeeds); 
/*  41 */     if (ConfigDisable.DIAMOND) ItemRegisterHelper.registerItem(MSeeds.DiamondSeeds); 
/*  42 */     if (ConfigDisable.EMERALD) ItemRegisterHelper.registerItem(MSeeds.EmeraldSeeds);
/*     */     
/*  44 */     if (ConfigDisable.BLAZE) ItemRegisterHelper.registerItem(MSeeds.BlazeSeeds); 
/*  45 */     if (ConfigDisable.CREEPER) ItemRegisterHelper.registerItem(MSeeds.CreeperSeeds); 
/*  46 */     if (ConfigDisable.ENDERMAN) ItemRegisterHelper.registerItem(MSeeds.EndermanSeeds); 
/*  47 */     if (ConfigDisable.GHAST) ItemRegisterHelper.registerItem(MSeeds.GhastSeeds); 
/*  48 */     if (ConfigDisable.SKELETON) ItemRegisterHelper.registerItem(MSeeds.SkeletonSeeds); 
/*  49 */     if (ConfigDisable.SLIME) ItemRegisterHelper.registerItem(MSeeds.SlimeSeeds); 
/*  50 */     if (ConfigDisable.SPIDER) ItemRegisterHelper.registerItem(MSeeds.SpiderSeeds); 
/*  51 */     if (ConfigDisable.WITHER) ItemRegisterHelper.registerItem(MSeeds.WitherSeeds);
/*     */     
/*  53 */     if (ConfigDisable.CHICKEN) ItemRegisterHelper.registerItem(MSeeds.ChickenSeeds); 
/*  54 */     if (ConfigDisable.COW) ItemRegisterHelper.registerItem(MSeeds.CowSeeds); 
/*  55 */     if (ConfigDisable.PIG) ItemRegisterHelper.registerItem(MSeeds.PigSeeds); 
/*  56 */     if (ConfigDisable.SHEEP) ItemRegisterHelper.registerItem(MSeeds.SheepSeeds);
/*     */ 
/*     */     
/*  59 */     ItemRegisterHelper.registerItem(MItems.MagicalFertilizer);
/*  60 */     ItemRegisterHelper.registerItem(MItems.EssenceFertilizer);
/*     */ 
/*     */     
/*  63 */     ItemRegisterHelper.registerItem(MItems.EssenceIngots);
/*     */ 
/*     */     
/*  66 */     if (ConfigMain.ENCHANT_CRAFT) ItemRegisterHelper.registerItem(MItems.ExperienceBook);
/*     */ 
/*     */     
/*  69 */     ItemRegisterHelper.registerItem(Essence.MinicioEssence);
/*  70 */     ItemRegisterHelper.registerItem(Essence.AccioEssence);
/*  71 */     ItemRegisterHelper.registerItem(Essence.CrucioEssence);
/*  72 */     ItemRegisterHelper.registerItem(Essence.ImperioEssence);
/*  73 */     ItemRegisterHelper.registerItem(Essence.ZivicioEssence);
/*  74 */     ItemRegisterHelper.registerItem(Essence.TaintedEssence);
/*     */ 
/*     */     
/*  77 */     if (ConfigDisable.AIR) ItemRegisterHelper.registerItem(Essence.AirEssence); 
/*  78 */     if (ConfigDisable.COAL) ItemRegisterHelper.registerItem(Essence.CoalEssence); 
/*  79 */     if (ConfigDisable.DYE) ItemRegisterHelper.registerItem(Essence.DyeEssence); 
/*  80 */     if (ConfigDisable.EARTH) ItemRegisterHelper.registerItem(Essence.EarthEssence); 
/*  81 */     if (ConfigDisable.FIRE) ItemRegisterHelper.registerItem(Essence.FireEssence); 
/*  82 */     if (ConfigDisable.NATURE) ItemRegisterHelper.registerItem(Essence.NatureEssence); 
/*  83 */     if (ConfigDisable.WATER) ItemRegisterHelper.registerItem(Essence.WaterEssence); 
/*  84 */     if (ConfigDisable.REDSTONE) ItemRegisterHelper.registerItem(Essence.RedstoneEssence); 
/*  85 */     if (ConfigDisable.GLOWSTONE) ItemRegisterHelper.registerItem(Essence.GlowstoneEssence); 
/*  86 */     if (ConfigDisable.OBSIDIAN) ItemRegisterHelper.registerItem(Essence.ObsidianEssence); 
/*  87 */     if (ConfigDisable.NETHER) ItemRegisterHelper.registerItem(Essence.NetherEssence); 
/*  88 */     if (ConfigDisable.IRON) ItemRegisterHelper.registerItem(Essence.IronEssence); 
/*  89 */     if (ConfigDisable.GOLD) ItemRegisterHelper.registerItem(Essence.GoldEssence); 
/*  90 */     if (ConfigDisable.LAPIS) ItemRegisterHelper.registerItem(Essence.LapisEssence); 
/*  91 */     if (ConfigDisable.EXPERIENCE) ItemRegisterHelper.registerItem(Essence.ExperienceEssence); 
/*  92 */     if (ConfigDisable.QUARTZ) ItemRegisterHelper.registerItem(Essence.QuartzEssence); 
/*  93 */     if (ConfigDisable.DIAMOND) ItemRegisterHelper.registerItem(Essence.DiamondEssence); 
/*  94 */     if (ConfigDisable.EMERALD) ItemRegisterHelper.registerItem(Essence.EmeraldEssence);
/*     */ 
/*     */     
/*  97 */     if (ConfigDisable.BLAZE) ItemRegisterHelper.registerItem(Essence.BlazeEssence); 
/*  98 */     if (ConfigDisable.CREEPER) ItemRegisterHelper.registerItem(Essence.CreeperEssence); 
/*  99 */     if (ConfigDisable.ENDERMAN) ItemRegisterHelper.registerItem(Essence.EndermanEssence); 
/* 100 */     if (ConfigDisable.GHAST) ItemRegisterHelper.registerItem(Essence.GhastEssence); 
/* 101 */     if (ConfigDisable.SKELETON) ItemRegisterHelper.registerItem(Essence.SkeletonEssence); 
/* 102 */     if (ConfigDisable.SLIME) ItemRegisterHelper.registerItem(Essence.SlimeEssence); 
/* 103 */     if (ConfigDisable.SPIDER) ItemRegisterHelper.registerItem(Essence.SpiderEssence); 
/* 104 */     if (ConfigDisable.WITHER) ItemRegisterHelper.registerItem(Essence.WitherEssence); 
/* 105 */     if (ConfigDisable.CHICKEN) ItemRegisterHelper.registerItem(Essence.ChickenEssence); 
/* 106 */     if (ConfigDisable.COW) ItemRegisterHelper.registerItem(Essence.CowEssence); 
/* 107 */     if (ConfigDisable.PIG) ItemRegisterHelper.registerItem(Essence.PigEssence); 
/* 108 */     if (ConfigDisable.SHEEP) ItemRegisterHelper.registerItem(Essence.SheepEssence);
/*     */ 
/*     */     
/* 111 */     ItemRegisterHelper.registerItem(Armour.AccioArmourHelmet);
/* 112 */     ItemRegisterHelper.registerItem(Armour.AccioArmourChestplate);
/* 113 */     ItemRegisterHelper.registerItem(Armour.AccioArmourLeggings);
/* 114 */     ItemRegisterHelper.registerItem(Armour.AccioArmourBoots);
/*     */     
/* 116 */     ItemRegisterHelper.registerItem(Armour.CrucioArmourHelmet);
/* 117 */     ItemRegisterHelper.registerItem(Armour.CrucioArmourChestplate);
/* 118 */     ItemRegisterHelper.registerItem(Armour.CrucioArmourLeggings);
/* 119 */     ItemRegisterHelper.registerItem(Armour.CrucioArmourBoots);
/*     */     
/* 121 */     ItemRegisterHelper.registerItem(Armour.ImperioArmourHelmet);
/* 122 */     ItemRegisterHelper.registerItem(Armour.ImperioArmourChestplate);
/* 123 */     ItemRegisterHelper.registerItem(Armour.ImperioArmourLeggings);
/* 124 */     ItemRegisterHelper.registerItem(Armour.ImperioArmourBoots);
/*     */     
/* 126 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmet);
/* 127 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplate);
/* 128 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggings);
/* 129 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourBoots);
/*     */     
/* 131 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmetFeed);
/* 132 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmetNight);
/* 133 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmetWater);
/*     */     
/* 135 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplateFire);
/* 136 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplateWither);
/* 137 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplatePoison);
/*     */     
/* 139 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggingsBlind);
/* 140 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggingsWeak);
/* 141 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggingsConfusion);
/*     */     
/* 143 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourBootsStep);
/* 144 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourBootsSpeed);
/* 145 */     ItemRegisterHelper.registerItem(Armour.ZivicioArmourBootsJump);
/*     */ 
/*     */     
/* 148 */     ItemRegisterHelper.registerItem(Tools.AccioPickaxe);
/* 149 */     ItemRegisterHelper.registerItem(Tools.AccioSword);
/* 150 */     ItemRegisterHelper.registerItem(Tools.AccioAxe);
/* 151 */     ItemRegisterHelper.registerItem(Tools.AccioShovel);
/* 152 */     ItemRegisterHelper.registerItem(Tools.AccioHoe);
/*     */     
/* 154 */     ItemRegisterHelper.registerItem(Tools.CrucioPickaxe);
/* 155 */     ItemRegisterHelper.registerItem(Tools.CrucioSword);
/* 156 */     ItemRegisterHelper.registerItem(Tools.CrucioAxe);
/* 157 */     ItemRegisterHelper.registerItem(Tools.CrucioShovel);
/* 158 */     ItemRegisterHelper.registerItem(Tools.CrucioHoe);
/*     */     
/* 160 */     ItemRegisterHelper.registerItem(Tools.ImperioPickaxe);
/* 161 */     ItemRegisterHelper.registerItem(Tools.ImperioSword);
/* 162 */     ItemRegisterHelper.registerItem(Tools.ImperioAxe);
/* 163 */     ItemRegisterHelper.registerItem(Tools.ImperioShovel);
/* 164 */     ItemRegisterHelper.registerItem(Tools.ImperioHoe);
/*     */     
/* 166 */     ItemRegisterHelper.registerItem(Tools.ZivicioPickaxe);
/* 167 */     ItemRegisterHelper.registerItem(Tools.ZivicioSword);
/* 168 */     ItemRegisterHelper.registerItem(Tools.ZivicioAxe);
/* 169 */     ItemRegisterHelper.registerItem(Tools.ZivicioShovel);
/* 170 */     ItemRegisterHelper.registerItem(Tools.ZivicioHoe);
/*     */ 
/*     */     
/* 173 */     ItemRegisterHelper.registerItem(MItems.SeedBagAccio);
/* 174 */     ItemRegisterHelper.registerItem(MItems.SeedBagCrucio);
/* 175 */     ItemRegisterHelper.registerItem(MItems.SeedBagImperio);
/* 176 */     ItemRegisterHelper.registerItem(MItems.SeedBagZivicio);
/*     */ 
/*     */     
/* 179 */     if (ConfigMain.APPLES) {
/* 180 */       ItemRegisterHelper.registerItem(MItems.UltimateDiamondApple);
/* 181 */       ItemRegisterHelper.registerItem(MItems.EmeraldApple);
/* 182 */       ItemRegisterHelper.registerItem(MItems.UltimateEmeraldApple);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\register\ItemRegister.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */