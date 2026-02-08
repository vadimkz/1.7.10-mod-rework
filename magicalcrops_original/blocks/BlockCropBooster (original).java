/*    */ package com.mark719.magicalcrops.blocks;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.help.CropRandom;
/*    */ import com.mark719.magicalcrops.help.StemRandom;
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockCropBooster
/*    */   extends Block
/*    */ {
/*    */   private CropRandom prng;
/*    */   private StemRandom s_prng;
/*    */   
/*    */   public BlockCropBooster() {
/* 26 */     super(Material.field_151578_c);
/*    */     
/* 28 */     this.prng = new CropRandom();
/* 29 */     this.s_prng = new StemRandom();
/*    */     
/* 31 */     func_149675_a(true);
/* 32 */     func_149711_c(1.0F);
/* 33 */     func_149672_a(Block.field_149769_e);
/* 34 */     func_149647_a(MagicalCrops.tabMagical);
/* 35 */     func_149658_d("magicalcrops:booster_block");
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_149674_a(World world, int x, int y, int z, Random prng) {
/* 40 */     Block block_above = world.func_147439_a(x, y + 1, z);
/*    */     
/* 42 */     if (!world.func_72899_e(x, y + 1, z)) {
/*    */       return;
/*    */     }
/* 45 */     if (block_above instanceof BlockCropBooster) {
/* 46 */       block_above.func_149674_a(world, x, y + 1, z, prng);
/*    */       
/*    */       return;
/*    */     } 
/* 50 */     if (!world.func_72899_e(x, y + 2, z)) {
/*    */       return;
/*    */     }
/* 53 */     Block plant_block = world.func_147439_a(x, y + 2, z);
/*    */     
/* 55 */     if (plant_block instanceof net.minecraft.block.BlockStem) {
/*    */       
/* 57 */       if (world.func_72805_g(x, y + 2, z) >= 7) {
/* 58 */         plant_block.func_149674_a(world, x, y + 2, z, (Random)this.s_prng);
/*    */       } else {
/* 60 */         plant_block.func_149674_a(world, x, y + 2, z, (Random)this.prng);
/*    */       } 
/* 62 */     } else if (plant_block instanceof net.minecraft.block.BlockReed || plant_block instanceof net.minecraft.block.BlockCactus) {
/*    */       
/* 64 */       for (int l = 1; world.func_72899_e(x, y + 1 + l, z) && l < 3; l++)
/*    */       {
/* 66 */         world.func_147439_a(x, y + 1 + l, z).func_149674_a(world, x, y + 1 + l, z, (Random)this.prng);
/*    */       
/*    */       }
/*    */     }
/* 70 */     else if (plant_block instanceof net.minecraftforge.common.IPlantable || plant_block instanceof BlockMagicalCrops) {
/*    */       
/* 72 */       plant_block.func_149674_a(world, x, y + 2, z, (Random)this.prng);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockCropBooster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */