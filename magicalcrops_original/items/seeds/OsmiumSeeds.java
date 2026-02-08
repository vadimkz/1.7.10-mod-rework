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
/*    */ public class OsmiumSeeds
/*    */   extends ItemSeeds
/*    */ {
/*    */   public OsmiumSeeds(Block crop, Block farmland) {
/* 16 */     super(crop, farmland);
/* 17 */     this.field_77777_bU = 64;
/* 18 */     func_77637_a(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public int func_82790_a(ItemStack par1ItemStack, int par2) {
/* 25 */     return 4416394;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\seeds\OsmiumSeeds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */