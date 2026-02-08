/*    */ package com.mark719.magicalcrops;
/*    */ 
/*    */ import com.mark719.magicalcrops.handlers.MItems;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.item.Item;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tabMagical
/*    */   extends CreativeTabs
/*    */ {
/*    */   public tabMagical(int ID, String name) {
/* 18 */     super(ID, name);
/* 19 */     func_78025_a("magicalcrops.png");
/* 20 */     func_78014_h();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasSearchBar() {
/* 25 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public String func_78024_c() {
/* 30 */     return "Magical Crops";
/*    */   }
/*    */ 
/*    */   
/*    */   public Item func_78016_d() {
/* 35 */     return MItems.InfusionStoneMaster;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\tabMagical.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */