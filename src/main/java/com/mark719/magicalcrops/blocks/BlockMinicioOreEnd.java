/*    */ package com.mark719.magicalcrops.blocks;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.handlers.Essence;
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.item.Item;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockMinicioOreEnd
/*    */   extends Block
/*    */ {
/*    */   public BlockMinicioOreEnd() {
/* 21 */     super(Material.field_151576_e);
/* 22 */     func_149658_d("magicalcrops:EssenceOreEnd");
/* 23 */     func_149647_a(MagicalCrops.tabMagical);
/* 24 */     func_149672_a(field_149780_i);
/* 25 */     func_149711_c(3.0F);
/* 26 */     func_149752_b(5.0F);
/* 27 */     setHarvestLevel("pickaxe", 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
/* 32 */     return Essence.MinicioEssence;
/*    */   }
/*    */ 
/*    */   
/*    */   public int func_149745_a(Random par1Random) {
/* 37 */     return 8;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean func_149700_E() {
/* 43 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockMinicioOreEnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */