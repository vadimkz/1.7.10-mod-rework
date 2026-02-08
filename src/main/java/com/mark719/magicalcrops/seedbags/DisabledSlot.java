/*    */ package com.mark719.magicalcrops.seedbags;
/*    */ 
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.inventory.Slot;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class DisabledSlot extends Slot {
/*    */   public DisabledSlot(IInventory inventory, int slotIndex, int x, int y) {
/* 10 */     super(inventory, slotIndex, x, y);
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