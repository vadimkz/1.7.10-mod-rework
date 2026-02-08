/*     */ package com.mark719.magicalcrops.seedbags;
/*     */ 
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.InventoryPlayer;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SeedContainer
/*     */   extends Container
/*     */ {
/*     */   private SeedInventory inv;
/*     */   
/*     */   public SeedContainer(InventoryPlayer player, SeedInventory inventory) {
/*  21 */     this.inv = inventory;
/*  22 */     int rows = this.inv.getSizeInventory() / 9;
/*     */     
/*  24 */     int invHeightPx = (rows - 4) * 18;
/*     */ 
/*     */     
/*     */     int invRow;
/*     */     
/*  29 */     for (invRow = 0; invRow < rows; invRow++) {
/*  30 */       for (int i = 0; i < 9; i++) {
/*  31 */         addSlotToContainer(new SeedSlot(inventory, i + invRow * 9, 8 + i * 18, 18 + invRow * 18));
/*     */       }
/*     */     } 
/*     */     
/*  35 */     for (invRow = 0; invRow < 3; invRow++) {
/*  36 */       for (int i = 0; i < 9; i++) {
/*  37 */         addSlotToContainer(new Slot((IInventory)player, i + invRow * 9 + 9, 8 + i * 18, 102 + invRow * 18 + invHeightPx + 1));
/*     */       }
/*     */     } 
/*     */     
/*  41 */     for (int invColumn = 0; invColumn < 9; invColumn++) {
/*  42 */       if (invColumn == player.currentItem) {
/*  43 */         addSlotToContainer(new DisabledSlot((IInventory)player, invColumn, 8 + invColumn * 18, 161 + invHeightPx));
/*     */       } else {
/*     */         
/*  46 */         addSlotToContainer(new Slot((IInventory)player, invColumn, 8 + invColumn * 18, 161 + invHeightPx));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onContainerClosed(EntityPlayer player) {
/*  54 */     this.inv.saveToNBT(player.getCurrentEquippedItem().getTagCompound());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canInteractWith(EntityPlayer entityPlayer) {
/*  60 */     return this.inv.isUseableByPlayer(entityPlayer);
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack slotClick(int paramInt1, int paramInt2, int paramInt3, EntityPlayer paramEntityPlayer) {
/*  65 */     if (paramInt3 == 4) {
/*  66 */       if (!Keyboard.isKeyDown(42) && !Keyboard.isKeyDown(54)) {
/*  67 */         return super.slotClick(paramInt1, paramInt2, 0, paramEntityPlayer);
/*     */       }
/*     */       
/*  70 */       return transferStackInSlot(paramEntityPlayer, paramInt1);
/*     */     } 
/*     */     
/*  73 */     return super.slotClick(paramInt1, paramInt2, paramInt3, paramEntityPlayer);
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
/*  78 */     ItemStack stack = null;
/*  79 */     Slot slotObject = (Slot)this.inventorySlots.get(slot);
/*     */ 
/*     */     
/*  82 */     if (slotObject != null && slotObject.getHasStack() && slotObject.getStack().getItem() instanceof net.minecraftforge.common.IPlantable) {
/*  83 */       ItemStack stackInSlot = slotObject.getStack();
/*  84 */       stack = stackInSlot.copy();
/*     */ 
/*     */       
/*  87 */       if (slot < this.inv.getSizeInventory()) {
/*  88 */         if (!mergeItemStack(stackInSlot, this.inv.getSizeInventory() + 1, this.inv.getSizeInventory() + 36, true)) {
/*  89 */           return null;
/*     */         
/*     */         }
/*     */       }
/*  93 */       else if (!mergeItemStack(stackInSlot, 0, this.inv.getSizeInventory(), false)) {
/*  94 */         return null;
/*     */       } 
/*     */       
/*  97 */       if (stackInSlot.stackSize == 0) {
/*  98 */         slotObject.putStack(null);
/*     */       } else {
/* 100 */         slotObject.onSlotChanged();
/*     */       } 
/*     */       
/* 103 */       if (stackInSlot.stackSize == stack.stackSize) {
/* 104 */         return null;
/*     */       }
/* 106 */       slotObject.onPickupFromSlot(player, stackInSlot);
/*     */     } 
/* 108 */     return stack;
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\SeedContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
