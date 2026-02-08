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
/*    */   public SeedSlot(IInventory inventory, int slotIndex, int x, int y) {
/* 13 */     super(inventory, slotIndex, x, y);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isItemValid(ItemStack stack) {
/* 18 */     return (stack != null && stack.getItem() instanceof net.minecraftforge.common.IPlantable);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\SeedSlot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */