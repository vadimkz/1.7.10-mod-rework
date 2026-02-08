/*    */ package com.mark719.magicalcrops.blocks;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.world.Explosion;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ public class BlockWitherProof
/*    */   extends Block
/*    */ {
/*    */   public BlockWitherProof() {
/* 16 */     super(Material.field_151576_e);
/* 17 */     func_149658_d("magicalcrops:wither_block");
/* 18 */     func_149647_a(MagicalCrops.tabMagical);
/* 19 */     func_149672_a(field_149780_i);
/* 20 */     func_149711_c(2.0F);
/* 21 */     func_149752_b(2000.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
/* 26 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onBlockExploded(World world, int x, int y, int z, Explosion explosion) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_149659_a(Explosion p_149659_1_) {
/* 36 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockWitherProof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */