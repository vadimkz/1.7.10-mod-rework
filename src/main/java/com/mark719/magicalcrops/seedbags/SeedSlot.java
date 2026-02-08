/*    */ package com.mark719.magicalcrops.seedbags;
/*    */ 
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.inventory.Slot;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SeedSlot
/*    */   extends Slot
/*    */ {
/*    */   public SeedSlot(IInventory par1IInventory, int par2, int par3, int par4) {
/* 13 */     super(par1IInventory, par2, par3, par4);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_75214_a(ItemStack stack) {
/* 18 */     return (stack != null && stack.func_77973_b() instanceof net.minecraftforge.common.IPlantable);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\SeedSlot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */