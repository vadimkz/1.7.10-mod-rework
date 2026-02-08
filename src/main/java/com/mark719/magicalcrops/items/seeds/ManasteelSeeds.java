/*    */ package com.mark719.magicalcrops.items.seeds;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.item.ItemSeeds;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ManasteelSeeds
/*    */   extends ItemSeeds
/*    */ {
/*    */   public ManasteelSeeds(Block crop, Block farmland) {
/* 16 */     super(crop, farmland);
/* 17 */     this.maxStackSize = 64;
/* 18 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public int getColorFromItemStack(ItemStack stack, int tintIndex) {
/* 25 */     return 2664944;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\seeds\ManasteelSeeds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */