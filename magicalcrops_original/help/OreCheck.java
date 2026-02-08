/*    */ package com.mark719.magicalcrops.help;
/*    */ 
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.oredict.OreDictionary;
/*    */ 
/*    */ 
/*    */ public class OreCheck
/*    */ {
/*    */   public static ItemStack getModOre(String oreName) {
/* 10 */     ItemStack modOre = null;
/*    */     
/* 12 */     if (OreDictionary.getOres(oreName).size() > 0) {
/* 13 */       modOre = OreDictionary.getOres(oreName).get(0);
/*    */     }
/* 15 */     if (modOre != null)
/*    */     {
/* 17 */       return modOre;
/*    */     }
/* 19 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\help\OreCheck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */