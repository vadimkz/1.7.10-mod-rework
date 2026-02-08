/*    */ package com.mark719.magicalcrops.help;
/*    */ 
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ import net.minecraft.item.Item;
/*    */ 
/*    */ 
/*    */ public class ItemRegisterHelper
/*    */ {
/*    */   public static void registerItem(Item item) {
/* 10 */     GameRegistry.registerItem(item, "magicalcrops_" + item.getUnlocalizedName().substring(5));
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\help\ItemRegisterHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */