/*    */ package com.mark719.magicalcrops.worldgen;
/*    */ 
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.util.MathHelper;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraft.world.gen.feature.WorldGenerator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WorldGenMineableEnd
/*    */   extends WorldGenerator
/*    */ {
/*    */   private Block oreBlock;
/*    */   private int numberOfBlocks;
/*    */   private Block targetBlock;
/*    */   private static final String __OBFID = "CL_00000426";
/*    */   private int mineableBlockMeta;
/*    */   
/*    */   public WorldGenMineableEnd(Block p_i45459_1_, int p_i45459_2_) {
/* 22 */     this(p_i45459_1_, p_i45459_2_, Blocks.end_stone);
/*    */   }
/*    */ 
/*    */   
/*    */   public WorldGenMineableEnd(Block p_i45460_1_, int p_i45460_2_, Block p_i45460_3_) {
/* 27 */     this.oreBlock = p_i45460_1_;
/* 28 */     this.numberOfBlocks = p_i45460_2_;
/* 29 */     this.targetBlock = p_i45460_3_;
/*    */   }
/*    */ 
/*    */   
/*    */   public WorldGenMineableEnd(Block block, int meta, int number, Block target) {
/* 34 */     this(block, number, target);
/* 35 */     this.mineableBlockMeta = meta;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5) {
/* 40 */     float f = par2Random.nextFloat() * 3.1415927F;
/* 41 */     double d0 = ((par3 + 8) + MathHelper.sin(f) * this.numberOfBlocks / 8.0F);
/* 42 */     double d1 = ((par3 + 8) - MathHelper.sin(f) * this.numberOfBlocks / 8.0F);
/* 43 */     double d2 = ((par5 + 8) + MathHelper.cos(f) * this.numberOfBlocks / 8.0F);
/* 44 */     double d3 = ((par5 + 8) - MathHelper.cos(f) * this.numberOfBlocks / 8.0F);
/* 45 */     double d4 = (par4 + par2Random.nextInt(3) - 2);
/* 46 */     double d5 = (par4 + par2Random.nextInt(3) - 2);
/*    */     
/* 48 */     for (int l = 0; l <= this.numberOfBlocks; l++) {
/*    */       
/* 50 */       double d6 = d0 + (d1 - d0) * l / this.numberOfBlocks;
/* 51 */       double d7 = d4 + (d5 - d4) * l / this.numberOfBlocks;
/* 52 */       double d8 = d2 + (d3 - d2) * l / this.numberOfBlocks;
/* 53 */       double d9 = par2Random.nextDouble() * this.numberOfBlocks / 16.0D;
/* 54 */       double d10 = (MathHelper.sin(l * 3.1415927F / this.numberOfBlocks) + 1.0F) * d9 + 1.0D;
/* 55 */       double d11 = (MathHelper.sin(l * 3.1415927F / this.numberOfBlocks) + 1.0F) * d9 + 1.0D;
/* 56 */       int i1 = MathHelper.floor_double(d6 - d10 / 2.0D);
/* 57 */       int j1 = MathHelper.floor_double(d7 - d11 / 2.0D);
/* 58 */       int k1 = MathHelper.floor_double(d8 - d10 / 2.0D);
/* 59 */       int l1 = MathHelper.floor_double(d6 + d10 / 2.0D);
/* 60 */       int i2 = MathHelper.floor_double(d7 + d11 / 2.0D);
/* 61 */       int j2 = MathHelper.floor_double(d8 + d10 / 2.0D);
/*    */       
/* 63 */       for (int k2 = i1; k2 <= l1; k2++) {
/*    */         
/* 65 */         double d12 = (k2 + 0.5D - d6) / d10 / 2.0D;
/*    */         
/* 67 */         if (d12 * d12 < 1.0D)
/*    */         {
/* 69 */           for (int l2 = j1; l2 <= i2; l2++) {
/*    */             
/* 71 */             double d13 = (l2 + 0.5D - d7) / d11 / 2.0D;
/*    */             
/* 73 */             if (d12 * d12 + d13 * d13 < 1.0D)
/*    */             {
/* 75 */               for (int i3 = k1; i3 <= j2; i3++) {
/*    */                 
/* 77 */                 double d14 = (i3 + 0.5D - d8) / d10 / 2.0D;
/*    */                 
/* 79 */                 if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && par1World.getBlock(k2, l2, i3).isReplaceableOreGen(par1World, k2, l2, i3, this.targetBlock))
/*    */                 {
/* 81 */                   par1World.setBlock(k2, l2, i3, this.oreBlock, this.mineableBlockMeta, 2);
/*    */                 }
/*    */               } 
/*    */             }
/*    */           } 
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 90 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\worldgen\WorldGenMineableEnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */