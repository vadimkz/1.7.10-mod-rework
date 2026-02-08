/*    */ package com.mark719.magicalcrops.handlers;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.blocks.BlockCropBooster;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceBlock;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceBrick;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceBrick2;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceLamp;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceSquare;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceStone;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceStorage;
/*    */ import com.mark719.magicalcrops.blocks.BlockFarmlandAccio;
/*    */ import com.mark719.magicalcrops.blocks.BlockFarmlandCrucio;
/*    */ import com.mark719.magicalcrops.blocks.BlockFarmlandImperio;
/*    */ import com.mark719.magicalcrops.blocks.BlockFarmlandZivicio;
/*    */ import com.mark719.magicalcrops.blocks.BlockMinicioOre;
/*    */ import com.mark719.magicalcrops.blocks.BlockMinicioOreEnd;
/*    */ import com.mark719.magicalcrops.blocks.BlockMinicioOreNether;
/*    */ import com.mark719.magicalcrops.blocks.BlockWitherProof;
/*    */ import com.mark719.magicalcrops.blocks.BlockWitherProofGlass;
/*    */ import com.mark719.magicalcrops.furnace.AccioFurnace;
/*    */ import com.mark719.magicalcrops.furnace.CrucioFurnace;
/*    */ import com.mark719.magicalcrops.furnace.ImperioFurnace;
/*    */ import com.mark719.magicalcrops.furnace.UltimateFurnace;
/*    */ import com.mark719.magicalcrops.furnace.ZivicioFurnace;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MBlocks
/*    */ {
/* 33 */   public static Block MinicioOre = (new BlockMinicioOre()).func_149663_c("MinicioOre");
/* 34 */   public static Block MinicioOreNether = (new BlockMinicioOreNether()).func_149663_c("MinicioOreNether");
/* 35 */   public static Block MinicioOreEnd = (new BlockMinicioOreEnd()).func_149663_c("MinicioOreEnd");
/*    */ 
/*    */   
/* 38 */   public static Block CropBooster = (new BlockCropBooster()).func_149663_c("CropBooster");
/*    */ 
/*    */   
/* 41 */   public static Block FarmlandAccio = (Block)new BlockFarmlandAccio();
/* 42 */   public static Block FarmlandCrucio = (Block)new BlockFarmlandCrucio();
/* 43 */   public static Block FarmlandImperio = (Block)new BlockFarmlandImperio();
/* 44 */   public static Block FarmlandZivicio = (Block)new BlockFarmlandZivicio();
/*    */ 
/*    */   
/* 47 */   public static Block EssenceStone = (new BlockEssenceStone()).func_149663_c("EssenceStone");
/* 48 */   public static Block EssenceStorage = (new BlockEssenceStorage(Material.field_151576_e)).func_149663_c("EssenceStorage");
/* 49 */   public static Block EssenceBlock = (new BlockEssenceBlock(Material.field_151576_e)).func_149663_c("EssenceBlock");
/* 50 */   public static Block EssenceLamp = (new BlockEssenceLamp(Material.field_151576_e)).func_149663_c("EssenceLamp");
/* 51 */   public static Block EssenceBrick = (new BlockEssenceBrick(Material.field_151576_e)).func_149663_c("EssenceBrick");
/* 52 */   public static Block EssenceBrick2 = (new BlockEssenceBrick2(Material.field_151576_e)).func_149663_c("EssenceBrick2");
/* 53 */   public static Block EssenceSquare = (new BlockEssenceSquare(Material.field_151576_e)).func_149663_c("EssenceSquare");
/* 54 */   public static Block WitherProof = (new BlockWitherProof()).func_149663_c("WitherProof");
/* 55 */   public static Block WitherProofGlass = (new BlockWitherProofGlass()).func_149663_c("WitherProofGlass");
/*    */ 
/*    */   
/* 58 */   public static Block AccioFurnace = (new AccioFurnace(false)).func_149663_c("AccioFurnace").func_149647_a(MagicalCrops.tabMagical);
/* 59 */   public static Block AccioFurnaceActive = (new AccioFurnace(true)).func_149663_c("AccioFurnaceActive");
/*    */   
/* 61 */   public static Block CrucioFurnace = (new CrucioFurnace(false)).func_149663_c("CrucioFurnace").func_149647_a(MagicalCrops.tabMagical);
/* 62 */   public static Block CrucioFurnaceActive = (new CrucioFurnace(true)).func_149663_c("CrucioFurnaceActive");
/*    */   
/* 64 */   public static Block ImperioFurnace = (new ImperioFurnace(false)).func_149663_c("ImperioFurnace").func_149647_a(MagicalCrops.tabMagical);
/* 65 */   public static Block ImperioFurnaceActive = (new ImperioFurnace(true)).func_149663_c("ImperioFurnaceActive");
/*    */   
/* 67 */   public static Block ZivicioFurnace = (new ZivicioFurnace(false)).func_149663_c("ZivicioFurnace").func_149647_a(MagicalCrops.tabMagical);
/* 68 */   public static Block ZivicioFurnaceActive = (new ZivicioFurnace(true)).func_149663_c("ZivicioFurnaceActive");
/*    */   
/* 70 */   public static Block UltimateFurnace = (new UltimateFurnace(false)).func_149663_c("UltimateFurnace").func_149647_a(MagicalCrops.tabMagical);
/* 71 */   public static Block UltimateFurnaceActive = (new UltimateFurnace(true)).func_149663_c("UltimateFurnaceActive");
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\handlers\MBlocks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
