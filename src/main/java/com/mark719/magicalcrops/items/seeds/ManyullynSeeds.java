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
/*    */ public class ManyullynSeeds
/*    */   extends ItemSeeds
/*    */ {
/*    */   public ManyullynSeeds(Block crop, Block farmland) {
/* 16 */     super(crop, farmland);
/* 17 */     this.setMaxStackSize(64);
/* 18 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public int getColorFromItemStack(ItemStack stack, int tintIndex) {
/* 25 */     return 7422380;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\seeds\ManyullynSeeds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */