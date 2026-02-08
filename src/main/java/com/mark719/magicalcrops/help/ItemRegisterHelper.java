/*    */ package com.mark719.magicalcrops.help;
/*    */ 
/*    */ import cpw.mods.fml.common.FMLLog;
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ import net.minecraft.item.Item;
/*    */ 
/*    */ 
/*    */ public class ItemRegisterHelper
/*    */ {
/*    */   public static void registerItem(Item item, String fieldName) {
/* 10 */     if (item == null) {
/* 11 */       FMLLog.severe("[MagicalCrops] Skipping null item registration for field: %s", fieldName);
/* 12 */       return;
/*    */     }
/* 14 */     String unlocalizedName = item.getUnlocalizedName();
/* 15 */     if (unlocalizedName == null) {
/* 16 */       FMLLog.severe("[MagicalCrops] Skipping item registration, unlocalized name is null for field: %s", fieldName);
/* 17 */       return;
/*    */     }
/* 19 */     String cleanName = unlocalizedName.startsWith("item.") ? unlocalizedName.substring(5) : unlocalizedName;
/* 20 */     GameRegistry.registerItem(item, "magicalcrops_" + cleanName);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\help\ItemRegisterHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
