/*    */ package com.mark719.magicalcrops.register;
/*    */ 
/*    */ import com.mark719.magicalcrops.config.ConfigDisable;
/*    */ import com.mark719.magicalcrops.handlers.Essence;
/*    */ import com.mark719.magicalcrops.handlers.MBlocks;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.init.Items;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.oredict.OreDictionary;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OreDictionaryRegister
/*    */ {
/*    */   public static void oreRegister() {
/* 17 */     OreDictionary.registerOre("oreMinicio", new ItemStack(MBlocks.MinicioOre));
/*    */ 
/*    */     
/* 20 */     if (ConfigDisable.AIR) OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.AirEssence)); 
/* 21 */     if (ConfigDisable.COAL) OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.CoalEssence)); 
/* 22 */     if (ConfigDisable.DYE) OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.DyeEssence)); 
/* 23 */     if (ConfigDisable.EARTH) OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.EarthEssence)); 
/* 24 */     if (ConfigDisable.FIRE) OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.FireEssence)); 
/* 25 */     if (ConfigDisable.NATURE) OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.NatureEssence)); 
/* 26 */     if (ConfigDisable.WATER) OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.WaterEssence));
/*    */ 
/*    */     
/* 29 */     if (ConfigDisable.REDSTONE) OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.RedstoneEssence)); 
/* 30 */     if (ConfigDisable.GLOWSTONE) OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.GlowstoneEssence)); 
/* 31 */     if (ConfigDisable.OBSIDIAN) OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.ObsidianEssence)); 
/* 32 */     if (ConfigDisable.NETHER) OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.NetherEssence)); 
/* 33 */     if (ConfigDisable.COW) OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.CowEssence)); 
/* 34 */     if (ConfigDisable.PIG) OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.PigEssence)); 
/* 35 */     if (ConfigDisable.CHICKEN) OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.ChickenEssence)); 
/* 36 */     if (ConfigDisable.SHEEP) OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.SheepEssence));
/*    */ 
/*    */     
/* 39 */     if (ConfigDisable.IRON) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.IronEssence)); 
/* 40 */     if (ConfigDisable.GOLD) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.GoldEssence)); 
/* 41 */     if (ConfigDisable.LAPIS) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.LapisEssence)); 
/* 42 */     if (ConfigDisable.EXPERIENCE) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.ExperienceEssence)); 
/* 43 */     if (ConfigDisable.QUARTZ) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.QuartzEssence)); 
/* 44 */     if (ConfigDisable.CREEPER) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.CreeperEssence)); 
/* 45 */     if (ConfigDisable.SKELETON) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.SkeletonEssence)); 
/* 46 */     if (ConfigDisable.GHAST) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.GhastEssence)); 
/* 47 */     if (ConfigDisable.SPIDER) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.SpiderEssence)); 
/* 48 */     if (ConfigDisable.SLIME) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.SlimeEssence)); 
/* 49 */     if (ConfigDisable.ENDERMAN) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.EndermanEssence)); 
/* 50 */     if (ConfigDisable.BLAZE) OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.BlazeEssence));
/*    */ 
/*    */     
/* 53 */     if (ConfigDisable.DIAMOND) OreDictionary.registerOre("zivicioMaterial", new ItemStack(Essence.DiamondEssence)); 
/* 54 */     if (ConfigDisable.EMERALD) OreDictionary.registerOre("zivicioMaterial", new ItemStack(Essence.EmeraldEssence)); 
/* 55 */     if (ConfigDisable.WITHER) OreDictionary.registerOre("zivicioMaterial", new ItemStack(Essence.WitherEssence));
/*    */ 
/*    */     
/* 58 */     OreDictionary.registerOre("MainInfusionMaterial", new ItemStack(Items.diamond));
/* 59 */     OreDictionary.registerOre("MainInfusionMaterial", new ItemStack(Items.emerald));
/* 60 */     OreDictionary.registerOre("MainInfusionMaterial", new ItemStack(Blocks.gold_block));
/*    */ 
/*    */     
/* 63 */     OreDictionary.registerOre("netherMaterial", new ItemStack(Blocks.nether_brick));
/* 64 */     OreDictionary.registerOre("netherMaterial", new ItemStack(Blocks.netherrack));
/* 65 */     OreDictionary.registerOre("netherMaterial", new ItemStack(Blocks.soul_sand));
/*    */ 
/*    */     
/* 68 */     OreDictionary.registerOre("natureMaterial", new ItemStack(Blocks.vine));
/* 69 */     OreDictionary.registerOre("natureMaterial", new ItemStack((Block)Blocks.red_flower));
/* 70 */     OreDictionary.registerOre("natureMaterial", new ItemStack((Block)Blocks.yellow_flower));
/* 71 */     OreDictionary.registerOre("natureMaterial", new ItemStack(Blocks.cactus));
/* 72 */     OreDictionary.registerOre("natureMaterial", new ItemStack(Blocks.pumpkin));
/* 73 */     OreDictionary.registerOre("natureMaterial", new ItemStack(Blocks.waterlily));
/* 74 */     OreDictionary.registerOre("natureMaterial", new ItemStack((Block)Blocks.deadbush));
/* 75 */     OreDictionary.registerOre("natureMaterial", new ItemStack(Items.reeds));
/* 76 */     OreDictionary.registerOre("natureMaterial", new ItemStack(Items.carrot));
/* 77 */     OreDictionary.registerOre("natureMaterial", new ItemStack(Items.potato));
/* 78 */     OreDictionary.registerOre("natureMaterial", new ItemStack(Items.wheat));
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\register\OreDictionaryRegister.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */