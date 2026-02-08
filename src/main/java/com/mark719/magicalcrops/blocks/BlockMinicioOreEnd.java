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
/* 21 */     super(Material.rock);
/* 22 */     setTextureName("magicalcrops:EssenceOreEnd");
/* 23 */     setCreativeTab(MagicalCrops.tabMagical);
/* 24 */     setStepSound(soundTypePiston);
/* 25 */     setHardness(3.0F);
/* 26 */     setResistance(5.0F);
/* 27 */     setHarvestLevel("pickaxe", 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public Item getItemDropped(int meta, Random random, int fortune) {
/* 32 */     return Essence.MinicioEssence;
/*    */   }
/*    */ 
/*    */   
/*    */   public int quantityDropped(Random random) {
/* 37 */     return 8;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean canSilkHarvest() {
/* 43 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockMinicioOreEnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */