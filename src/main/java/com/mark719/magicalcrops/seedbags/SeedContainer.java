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
/*  22 */     int rows = this.inv.func_70302_i_() / 9;
/*     */     
/*  24 */     int invHeightPx = (rows - 4) * 18;
/*     */ 
/*     */     
/*     */     int invRow;
/*     */     
/*  29 */     for (invRow = 0; invRow < rows; invRow++) {
/*  30 */       for (int i = 0; i < 9; i++) {
/*  31 */         func_75146_a(new SeedSlot(inventory, i + invRow * 9, 8 + i * 18, 18 + invRow * 18));
/*     */       }
/*     */     } 
/*     */     
/*  35 */     for (invRow = 0; invRow < 3; invRow++) {
/*  36 */       for (int i = 0; i < 9; i++) {
/*  37 */         func_75146_a(new Slot((IInventory)player, i + invRow * 9 + 9, 8 + i * 18, 102 + invRow * 18 + invHeightPx + 1));
/*     */       }
/*     */     } 
/*     */     
/*  41 */     for (int invColumn = 0; invColumn < 9; invColumn++) {
/*  42 */       if (invColumn == player.field_70461_c) {
/*  43 */         func_75146_a(new DisabledSlot((IInventory)player, invColumn, 8 + invColumn * 18, 161 + invHeightPx));
/*     */       } else {
/*     */         
/*  46 */         func_75146_a(new Slot((IInventory)player, invColumn, 8 + invColumn * 18, 161 + invHeightPx));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_75134_a(EntityPlayer player) {
/*  54 */     this.inv.saveToNBT(player.func_71045_bC().func_77978_p());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_75145_c(EntityPlayer entityPlayer) {
/*  60 */     return this.inv.func_70300_a(entityPlayer);
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack func_75144_a(int paramInt1, int paramInt2, int paramInt3, EntityPlayer paramEntityPlayer) {
/*  65 */     if (paramInt3 == 4) {
/*  66 */       if (!Keyboard.isKeyDown(42) && !Keyboard.isKeyDown(54)) {
/*  67 */         return super.func_75144_a(paramInt1, paramInt2, 0, paramEntityPlayer);
/*     */       }
/*     */       
/*  70 */       return func_82846_b(paramEntityPlayer, paramInt1);
/*     */     } 
/*     */     
/*  73 */     return super.func_75144_a(paramInt1, paramInt2, paramInt3, paramEntityPlayer);
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack func_82846_b(EntityPlayer player, int slot) {
/*  78 */     ItemStack stack = null;
/*  79 */     Slot slotObject = this.field_75151_b.get(slot);
/*     */ 
/*     */     
/*  82 */     if (slotObject != null && slotObject.func_75216_d() && slotObject.func_75211_c().func_77973_b() instanceof net.minecraftforge.common.IPlantable) {
/*  83 */       ItemStack stackInSlot = slotObject.func_75211_c();
/*  84 */       stack = stackInSlot.func_77946_l();
/*     */ 
/*     */       
/*  87 */       if (slot < this.inv.func_70302_i_()) {
/*  88 */         if (!func_75135_a(stackInSlot, this.inv.func_70302_i_() + 1, this.inv.func_70302_i_() + 36, true)) {
/*  89 */           return null;
/*     */         
/*     */         }
/*     */       }
/*  93 */       else if (!func_75135_a(stackInSlot, 0, this.inv.func_70302_i_(), false)) {
/*  94 */         return null;
/*     */       } 
/*     */       
/*  97 */       if (stackInSlot.field_77994_a == 0) {
/*  98 */         slotObject.func_75215_d(null);
/*     */       } else {
/* 100 */         slotObject.func_75218_e();
/*     */       } 
/*     */       
/* 103 */       if (stackInSlot.field_77994_a == stack.field_77994_a) {
/* 104 */         return null;
/*     */       }
/* 106 */       slotObject.func_82870_a(player, stackInSlot);
/*     */     } 
/* 108 */     return stack;
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\SeedContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */