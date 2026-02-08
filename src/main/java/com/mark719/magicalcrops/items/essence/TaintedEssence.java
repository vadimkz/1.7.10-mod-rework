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
/* 14 */     setMaxStackSize(64);
/* 15 */     setCreativeTab(MagicalCrops.tabMagical);
/* 16 */     setTextureName("magicalcrops:tainted_essence");
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 21 */     return EnumChatFormatting.DARK_GRAY + super.getItemStackDisplayName(stack);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\essence\TaintedEssence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */