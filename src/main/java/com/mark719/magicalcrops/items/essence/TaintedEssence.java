/*    */ package com.mark719.magicalcrops.items.essence;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TaintedEssence
/*    */   extends Item
/*    */ {
/*    */   public TaintedEssence() {
/* 14 */     func_77625_d(64);
/* 15 */     func_77637_a(MagicalCrops.tabMagical);
/* 16 */     func_111206_d("magicalcrops:tainted_essence");
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_77653_i(ItemStack stack) {
/* 21 */     return EnumChatFormatting.DARK_GRAY + super.func_77653_i(stack);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\essence\TaintedEssence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */