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
/*    */ 
/*    */ public class BlockMinicioOre
/*    */   extends Block
/*    */ {
/*    */   public BlockMinicioOre() {
/* 22 */     super(Material.field_151576_e);
/* 23 */     func_149658_d("magicalcrops:EssenceOre");
/* 24 */     func_149647_a(MagicalCrops.tabMagical);
/* 25 */     func_149672_a(field_149780_i);
/* 26 */     func_149711_c(3.0F);
/* 27 */     func_149752_b(5.0F);
/* 28 */     setHarvestLevel("pickaxe", 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
/* 33 */     return Essence.MinicioEssence;
/*    */   }
/*    */ 
/*    */   
/*    */   public int func_149745_a(Random par1Random) {
/* 38 */     return 4;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean func_149700_E() {
/* 44 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockMinicioOre.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */