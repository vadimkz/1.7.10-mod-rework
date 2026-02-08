/*    */ package com.mark719.magicalcrops.worldgen;
/*    */ 
/*    */ import com.mark719.magicalcrops.config.ConfigMain;
/*    */ import com.mark719.magicalcrops.handlers.MBlocks;
/*    */ import cpw.mods.fml.common.IWorldGenerator;
/*    */ import java.util.Random;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraft.world.chunk.IChunkProvider;
/*    */ import net.minecraft.world.gen.feature.WorldGenMinable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WorldGenEssence
/*    */   implements IWorldGenerator
/*    */ {
/*    */   public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
/* 20 */     switch (world.field_73011_w.field_76574_g) {
/*    */       
/*    */       case -1:
/* 23 */         generateNether(world, random, chunkX * 16, chunkZ * 16);
/*    */         break;
/*    */       case 0:
/* 26 */         generateSurface(world, random, chunkX * 16, chunkZ * 16);
/*    */         break;
/*    */       case 1:
/* 29 */         generateEnd(world, random, chunkX * 16, chunkZ * 16);
/*    */         break;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private void generateSurface(World world, Random random, int i, int j) {
/* 36 */     if (ConfigMain.essOreOverworld)
/*    */     {
/* 38 */       for (int k = 0; k < 25; k++) {
/*    */         
/* 40 */         int chunkX = i + random.nextInt(16);
/* 41 */         int chunkY = random.nextInt(ConfigMain.oreGenerateYCord);
/* 42 */         int chunkZ = j + random.nextInt(16);
/*    */         
/* 44 */         (new WorldGenMinable(MBlocks.MinicioOre, ConfigMain.maxVeinSize)).func_76484_a(world, random, chunkX, chunkY, chunkZ);
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   private void generateEnd(World world, Random random, int i, int j) {}
/*    */   
/*    */   private void generateNether(World world, Random random, int i, int j) {}
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\worldgen\WorldGenEssence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */