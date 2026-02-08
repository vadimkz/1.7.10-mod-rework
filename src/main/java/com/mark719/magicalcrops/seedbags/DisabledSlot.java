/*    */ package com.mark719.magicalcrops.seedbags;
/*    */ 
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.inventory.Slot;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class DisabledSlot extends Slot {
/*    */   public DisabledSlot(IInventory par1IInventory, int par2, int par3, int par4) {
/* 10 */     super(par1IInventory, par2, par3, par4);
/*    */   }
/*    */   
/*    */   public boolean isItemValid(ItemStack itemStack) {
/* 14 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canTakeStack(EntityPlayer player) {
/* 19 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\DisabledSlot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */