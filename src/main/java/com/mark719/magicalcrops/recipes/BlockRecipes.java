/*     */ package com.mark719.magicalcrops.recipes;
/*     */ 
/*     */ import com.mark719.magicalcrops.handlers.Essence;
/*     */ import com.mark719.magicalcrops.handlers.MBlocks;
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BlockRecipes
/*     */ {
/*  16 */   static Item minicioEssence = Essence.MinicioEssence;
/*  17 */   static Item accioEssence = Essence.AccioEssence;
/*  18 */   static Item crucioEssence = Essence.CrucioEssence;
/*  19 */   static Item imperioEssence = Essence.ImperioEssence;
/*  20 */   static Item zivicioEssence = Essence.ZivicioEssence;
/*     */   
/*  22 */   static Block accioFurnace = MBlocks.AccioFurnace;
/*  23 */   static Block crucioFurnace = MBlocks.CrucioFurnace;
/*  24 */   static Block imperioFurnace = MBlocks.ImperioFurnace;
/*  25 */   static Block zivicioFurnace = MBlocks.ZivicioFurnace;
/*  26 */   static Block ultimateFurnace = MBlocks.UltimateFurnace;
/*     */   
/*  28 */   static Block essenceStone = MBlocks.EssenceStone;
/*     */   
/*  30 */   static ItemStack zivicioBlock = new ItemStack(MBlocks.EssenceStorage, 1, 4);
/*     */   
/*  32 */   static ItemStack black = new ItemStack(Items.dye, 1, 0);
/*  33 */   static ItemStack brown = new ItemStack(Items.dye, 1, 3);
/*  34 */   static ItemStack green = new ItemStack(Items.dye, 1, 2);
/*  35 */   static ItemStack orange = new ItemStack(Items.dye, 1, 14);
/*  36 */   static ItemStack yellow = new ItemStack(Items.dye, 1, 11);
/*  37 */   static ItemStack blue = new ItemStack(Items.dye, 1, 4);
/*  38 */   static ItemStack purple = new ItemStack(Items.dye, 1, 5);
/*  39 */   static ItemStack red = new ItemStack(Items.dye, 1, 1);
/*     */ 
/*     */ 
/*     */   
/*     */   public static void loadRecipes() {
/*  44 */     GameRegistry.addRecipe(new ItemStack(MBlocks.AccioFurnace, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), accioEssence, Character.valueOf('Y'), Blocks.furnace });
/*  45 */     GameRegistry.addRecipe(new ItemStack(MBlocks.CrucioFurnace, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), crucioEssence, Character.valueOf('Y'), accioFurnace });
/*  46 */     GameRegistry.addRecipe(new ItemStack(MBlocks.ImperioFurnace, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), imperioEssence, Character.valueOf('Y'), crucioFurnace });
/*  47 */     GameRegistry.addRecipe(new ItemStack(MBlocks.ZivicioFurnace, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), zivicioEssence, Character.valueOf('Y'), imperioFurnace });
/*  48 */     GameRegistry.addRecipe(new ItemStack(MBlocks.UltimateFurnace, 1), new Object[] { " X ", "XYX", " X ", Character.valueOf('X'), zivicioBlock, Character.valueOf('Y'), zivicioFurnace });
/*     */ 
/*     */     
/*  51 */     GameRegistry.addRecipe(new ItemStack(MBlocks.CropBooster, 1), new Object[] { "YXY", "XZX", "YXY", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 0), Character.valueOf('Y'), Blocks.stone, Character.valueOf('Z'), Items.diamond });
/*     */ 
/*     */ 
/*     */     
/*  55 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 0), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), minicioEssence });
/*  56 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 1), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), accioEssence });
/*  57 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 2), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), crucioEssence });
/*  58 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 3), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), imperioEssence });
/*  59 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 4), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), zivicioEssence });
/*  60 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 5), new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceStorage, 1, 4) });
/*     */ 
/*     */     
/*  63 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStone, 8), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), minicioEssence, Character.valueOf('X'), Blocks.cobblestone });
/*     */     
/*  65 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 0), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), black, Character.valueOf('X'), essenceStone });
/*  66 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 1), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), brown, Character.valueOf('X'), essenceStone });
/*  67 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 2), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), green, Character.valueOf('X'), essenceStone });
/*  68 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 3), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), orange, Character.valueOf('X'), essenceStone });
/*  69 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 4), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), yellow, Character.valueOf('X'), essenceStone });
/*  70 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 5), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), blue, Character.valueOf('X'), essenceStone });
/*  71 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 6), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), purple, Character.valueOf('X'), essenceStone });
/*  72 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 7), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), red, Character.valueOf('X'), essenceStone });
/*     */     
/*  74 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 0), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 0) });
/*  75 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 1), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 1) });
/*  76 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 2), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 2) });
/*  77 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 3), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 3) });
/*  78 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 4), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 4) });
/*  79 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 5), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 5) });
/*  80 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 6), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 6) });
/*  81 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 7), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 7) });
/*     */     
/*  83 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 0), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 0) });
/*  84 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 1), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 1) });
/*  85 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 2), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 2) });
/*  86 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 3), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 3) });
/*  87 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 4), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 4) });
/*  88 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 5), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 5) });
/*  89 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 6), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 6) });
/*  90 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 7), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 7) });
/*     */     
/*  92 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 0), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBrick, 1, 0) });
/*  93 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 1), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBrick, 1, 1) });
/*  94 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 2), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBrick, 1, 2) });
/*  95 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 3), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBrick, 1, 3) });
/*  96 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 4), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBrick, 1, 4) });
/*  97 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 5), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBrick, 1, 5) });
/*  98 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 6), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBrick, 1, 6) });
/*  99 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 7), new Object[] { "XX", "XX", Character.valueOf('X'), new ItemStack(MBlocks.EssenceBrick, 1, 7) });
/*     */     
/* 101 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 0), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Blocks.glowstone, Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 0) });
/* 102 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 1), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Blocks.glowstone, Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 1) });
/* 103 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 2), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Blocks.glowstone, Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 2) });
/* 104 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 3), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Blocks.glowstone, Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 3) });
/* 105 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 4), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Blocks.glowstone, Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 4) });
/* 106 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 5), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Blocks.glowstone, Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 5) });
/* 107 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 6), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Blocks.glowstone, Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 6) });
/* 108 */     GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 7), new Object[] { "XXX", "XYX", "XXX", Character.valueOf('Y'), Blocks.glowstone, Character.valueOf('X'), new ItemStack(MBlocks.EssenceBlock, 1, 7) });
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\recipes\BlockRecipes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */