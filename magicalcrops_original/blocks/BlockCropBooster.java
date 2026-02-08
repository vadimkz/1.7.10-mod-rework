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
/* 26 */     super(Material.ground);
/*    */     
/* 28 */     this.prng = new CropRandom();
/* 29 */     this.s_prng = new StemRandom();
/*    */     
/* 31 */     setTickRandomly(true);
/* 32 */     setHardness(1.0F);
/* 33 */     setStepSound(Block.soundTypeStone);
/* 34 */     setCreativeTab(MagicalCrops.tabMagical);
/* 35 */     setTextureName("magicalcrops:booster_block");
/*    */   }
/*    */ 
/*    */   
/*    */   public void updateTick(World world, int x, int y, int z, Random prng) {
/* 40 */     Block block_above = world.getBlock(x, y + 1, z);
/*    */     
/* 42 */     if (!world.blockExists(x, y + 1, z)) {
/*    */       return;
/*    */     }
/* 45 */     if (block_above instanceof BlockCropBooster) {
/* 46 */       block_above.updateTick(world, x, y + 1, z, prng);
/*    */       
/*    */       return;
/*    */     } 
/* 50 */     if (!world.blockExists(x, y + 2, z)) {
/*    */       return;
/*    */     }
/* 53 */     Block plant_block = world.getBlock(x, y + 2, z);
/*    */     
/* 55 */     if (plant_block instanceof net.minecraft.block.BlockStem) {
/*    */       
/* 57 */       if (world.getBlockMetadata(x, y + 2, z) >= 7) {
/* 58 */         plant_block.updateTick(world, x, y + 2, z, (Random)this.s_prng);
/*    */       } else {
/* 60 */         plant_block.updateTick(world, x, y + 2, z, (Random)this.prng);
/*    */       } 
/* 62 */     } else if (plant_block instanceof net.minecraft.block.BlockReed || plant_block instanceof net.minecraft.block.BlockCactus) {
/*    */       
/* 64 */       for (int l = 1; world.blockExists(x, y + 1 + l, z) && l < 3; l++)
/*    */       {
/* 66 */         world.getBlock(x, y + 1 + l, z).updateTick(world, x, y + 1 + l, z, (Random)this.prng);
/*    */       
/*    */       }
/*    */     }
/* 70 */     else if (plant_block instanceof net.minecraftforge.common.IPlantable || plant_block instanceof BlockMagicalCrops) {
/*    */       
/* 72 */       plant_block.updateTick(world, x, y + 2, z, (Random)this.prng);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockCropBooster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
