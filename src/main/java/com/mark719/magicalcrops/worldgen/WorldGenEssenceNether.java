/*    */ package com.mark719.magicalcrops.worldgen;
/*    */ 
/*    */ import com.mark719.magicalcrops.config.ConfigMain;
/*    */ import com.mark719.magicalcrops.handlers.MBlocks;
/*    */ import cpw.mods.fml.common.IWorldGenerator;
/*    */ import java.util.Random;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraft.world.chunk.IChunkProvider;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WorldGenEssenceNether
/*    */   implements IWorldGenerator
/*    */ {
/*    */   public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
/* 19 */     switch (world.provider.dimensionId) {
/*    */       
/*    */       case -1:
/* 22 */         generateNether(world, random, chunkX * 16, chunkZ * 16);
/*    */         break;
/*    */       case 0:
/* 25 */         generateSurface(world, random, chunkX * 16, chunkZ * 16);
/*    */         break;
/*    */       case 1:
/* 28 */         generateEnd(world, random, chunkX * 16, chunkZ * 16);
/*    */         break;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private void generateSurface(World world, Random random, int i, int j) {}
/*    */   
/*    */   private void generateEnd(World world, Random random, int i, int j) {}
/*    */   
/*    */   private void generateNether(World world, Random random, int i, int j) {
/* 39 */     if (ConfigMain.essOreNether)
/*    */     {
/* 41 */       for (int k = 0; k < 25; k++) {
/*    */         
/* 43 */         int chunkX = i + random.nextInt(16);
/* 44 */         int chunkY = random.nextInt(256);
/* 45 */         int chunkZ = j + random.nextInt(16);
/*    */         
/* 47 */         (new WorldGenMineableNether(MBlocks.MinicioOreNether, ConfigMain.maxVeinSizeNether)).generate(world, random, chunkX, chunkY, chunkZ);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\worldgen\WorldGenEssenceNether.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
