/*    */ package com.mark719.magicalcrops.register;
/*    */ 
/*    */ import com.mark719.magicalcrops.config.ConfigDisable;
/*    */ import com.mark719.magicalcrops.handlers.MBlocks;
/*    */ import com.mark719.magicalcrops.handlers.MCrops;
/*    */ import com.mark719.magicalcrops.help.BlockRegisterHelper;
/*    */ import com.mark719.magicalcrops.itemblock.ItemBlockEssenceBlock;
/*    */ import com.mark719.magicalcrops.itemblock.ItemBlockEssenceBrick;
/*    */ import com.mark719.magicalcrops.itemblock.ItemBlockEssenceBrick2;
/*    */ import com.mark719.magicalcrops.itemblock.ItemBlockEssenceLamp;
/*    */ import com.mark719.magicalcrops.itemblock.ItemBlockEssenceSquare;
/*    */ import com.mark719.magicalcrops.itemblock.ItemBlockEssenceStorage;
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockRegister
/*    */ {
/*    */   public static void registerBlock() {
/* 21 */     BlockRegisterHelper.registerBlock(MBlocks.MinicioOre);
/* 22 */     BlockRegisterHelper.registerBlock(MBlocks.MinicioOreNether);
/* 23 */     BlockRegisterHelper.registerBlock(MBlocks.MinicioOreEnd);
/*    */ 
/*    */     
/* 26 */     if (ConfigDisable.AIR) BlockRegisterHelper.registerBlock(MCrops.AirCrop); 
/* 27 */     if (ConfigDisable.COAL) BlockRegisterHelper.registerBlock(MCrops.CoalCrop); 
/* 28 */     if (ConfigDisable.DYE) BlockRegisterHelper.registerBlock(MCrops.DyeCrop); 
/* 29 */     if (ConfigDisable.EARTH) BlockRegisterHelper.registerBlock(MCrops.EarthCrop); 
/* 30 */     if (ConfigDisable.FIRE) BlockRegisterHelper.registerBlock(MCrops.FireCrop); 
/* 31 */     if (ConfigDisable.MINICIO) BlockRegisterHelper.registerBlock(MCrops.MinicioCrop); 
/* 32 */     if (ConfigDisable.NATURE) BlockRegisterHelper.registerBlock(MCrops.NatureCrop); 
/* 33 */     if (ConfigDisable.WATER) BlockRegisterHelper.registerBlock(MCrops.WaterCrop); 
/* 34 */     if (ConfigDisable.REDSTONE) BlockRegisterHelper.registerBlock(MCrops.RedstoneCrop); 
/* 35 */     if (ConfigDisable.GLOWSTONE) BlockRegisterHelper.registerBlock(MCrops.GlowstoneCrop); 
/* 36 */     if (ConfigDisable.OBSIDIAN) BlockRegisterHelper.registerBlock(MCrops.ObsidianCrop); 
/* 37 */     if (ConfigDisable.NETHER) BlockRegisterHelper.registerBlock(MCrops.NetherCrop); 
/* 38 */     if (ConfigDisable.IRON) BlockRegisterHelper.registerBlock(MCrops.IronCrop); 
/* 39 */     if (ConfigDisable.GOLD) BlockRegisterHelper.registerBlock(MCrops.GoldCrop); 
/* 40 */     if (ConfigDisable.LAPIS) BlockRegisterHelper.registerBlock(MCrops.LapisCrop); 
/* 41 */     if (ConfigDisable.EXPERIENCE) BlockRegisterHelper.registerBlock(MCrops.ExperienceCrop); 
/* 42 */     if (ConfigDisable.QUARTZ) BlockRegisterHelper.registerBlock(MCrops.QuartzCrop); 
/* 43 */     if (ConfigDisable.DIAMOND) BlockRegisterHelper.registerBlock(MCrops.DiamondCrop); 
/* 44 */     if (ConfigDisable.EMERALD) BlockRegisterHelper.registerBlock(MCrops.EmeraldCrop);
/*    */     
/* 46 */     if (ConfigDisable.BLAZE) BlockRegisterHelper.registerBlock(MCrops.BlazeCrop); 
/* 47 */     if (ConfigDisable.CREEPER) BlockRegisterHelper.registerBlock(MCrops.CreeperCrop); 
/* 48 */     if (ConfigDisable.ENDERMAN) BlockRegisterHelper.registerBlock(MCrops.EndermanCrop); 
/* 49 */     if (ConfigDisable.GHAST) BlockRegisterHelper.registerBlock(MCrops.GhastCrop); 
/* 50 */     if (ConfigDisable.SKELETON) BlockRegisterHelper.registerBlock(MCrops.SkeletonCrop); 
/* 51 */     if (ConfigDisable.SLIME) BlockRegisterHelper.registerBlock(MCrops.SlimeCrop); 
/* 52 */     if (ConfigDisable.SPIDER) BlockRegisterHelper.registerBlock(MCrops.SpiderCrop); 
/* 53 */     if (ConfigDisable.WITHER) BlockRegisterHelper.registerBlock(MCrops.WitherCrop);
/*    */     
/* 55 */     if (ConfigDisable.CHICKEN) BlockRegisterHelper.registerBlock(MCrops.ChickenCrop); 
/* 56 */     if (ConfigDisable.COW) BlockRegisterHelper.registerBlock(MCrops.CowCrop); 
/* 57 */     if (ConfigDisable.PIG) BlockRegisterHelper.registerBlock(MCrops.PigCrop); 
/* 58 */     if (ConfigDisable.SHEEP) BlockRegisterHelper.registerBlock(MCrops.SheepCrop);
/*    */ 
/*    */     
/* 61 */     BlockRegisterHelper.registerBlock(MBlocks.CropBooster);
/* 62 */     BlockRegisterHelper.registerBlock(MBlocks.EssenceStone);
/*    */ 
/*    */     
/* 65 */     BlockRegisterHelper.registerBlock(MBlocks.FarmlandAccio);
/* 66 */     BlockRegisterHelper.registerBlock(MBlocks.FarmlandCrucio);
/* 67 */     BlockRegisterHelper.registerBlock(MBlocks.FarmlandImperio);
/* 68 */     BlockRegisterHelper.registerBlock(MBlocks.FarmlandZivicio);
/*    */     
/* 70 */     BlockRegisterHelper.registerBlock(MBlocks.WitherProof);
/* 71 */     BlockRegisterHelper.registerBlock(MBlocks.WitherProofGlass);
/*    */ 
/*    */     
/* 74 */     BlockRegisterHelper.registerBlock(MBlocks.AccioFurnace);
/* 75 */     BlockRegisterHelper.registerBlock(MBlocks.AccioFurnaceActive);
/* 76 */     BlockRegisterHelper.registerBlock(MBlocks.CrucioFurnace);
/* 77 */     BlockRegisterHelper.registerBlock(MBlocks.CrucioFurnaceActive);
/* 78 */     BlockRegisterHelper.registerBlock(MBlocks.ImperioFurnace);
/* 79 */     BlockRegisterHelper.registerBlock(MBlocks.ImperioFurnaceActive);
/* 80 */     BlockRegisterHelper.registerBlock(MBlocks.ZivicioFurnace);
/* 81 */     BlockRegisterHelper.registerBlock(MBlocks.ZivicioFurnaceActive);
/* 82 */     BlockRegisterHelper.registerBlock(MBlocks.UltimateFurnace);
/* 83 */     BlockRegisterHelper.registerBlock(MBlocks.UltimateFurnaceActive);
/*    */ 
/*    */     
/* 86 */     GameRegistry.registerBlock(MBlocks.EssenceStorage, ItemBlockEssenceStorage.class, "essence_storage");
/* 87 */     GameRegistry.registerBlock(MBlocks.EssenceBrick, ItemBlockEssenceBrick.class, "essence_brick");
/* 88 */     GameRegistry.registerBlock(MBlocks.EssenceBlock, ItemBlockEssenceBlock.class, "essence_block");
/* 89 */     GameRegistry.registerBlock(MBlocks.EssenceBrick2, ItemBlockEssenceBrick2.class, "essence_brick2");
/* 90 */     GameRegistry.registerBlock(MBlocks.EssenceSquare, ItemBlockEssenceSquare.class, "essence_Square");
/* 91 */     GameRegistry.registerBlock(MBlocks.EssenceLamp, ItemBlockEssenceLamp.class, "essence_lamp");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\register\BlockRegister.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
