/*     */ package com.mark719.magicalcrops.furnace;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.InventoryPlayer;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.inventory.ICrafting;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.inventory.SlotFurnace;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.FurnaceRecipes;
/*     */ 
/*     */ public class ContainerZivicioFurnace
/*     */   extends Container {
/*     */   private TileEntityZivicioFurnace tileZivicioFurnace;
/*     */   private int lastCookTime;
/*     */   private int lastBurnTime;
/*     */   private int lastItemBurnTime;
/*     */   
/*     */   public ContainerZivicioFurnace(InventoryPlayer player, TileEntityZivicioFurnace tileEntityZivicioFurnace) {
/*  23 */     this.tileZivicioFurnace = tileEntityZivicioFurnace;
/*  24 */     addSlotToContainer(new Slot((IInventory)tileEntityZivicioFurnace, 0, 56, 17));
/*  25 */     addSlotToContainer(new Slot((IInventory)tileEntityZivicioFurnace, 1, 56, 53));
/*  26 */     addSlotToContainer((Slot)new SlotFurnace(player.player, (IInventory)tileEntityZivicioFurnace, 2, 116, 35));
/*     */     
/*     */     int i;
/*  29 */     for (i = 0; i < 3; i++) {
/*  30 */       for (int j = 0; j < 9; j++) {
/*  31 */         addSlotToContainer(new Slot((IInventory)player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*     */     
/*  35 */     for (i = 0; i < 9; i++) {
/*  36 */       addSlotToContainer(new Slot((IInventory)player, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public void onCraftGuiOpened(ICrafting craft) {
/*  41 */     super.onCraftGuiOpened(craft);
/*  42 */     craft.sendProgressBarUpdate(this, 0, this.tileZivicioFurnace.furnaceCookTime);
/*  43 */     craft.sendProgressBarUpdate(this, 1, this.tileZivicioFurnace.furnaceBurnTime);
/*  44 */     craft.sendProgressBarUpdate(this, 2, this.tileZivicioFurnace.currentBurnTime);
/*     */   }
/*     */   
/*     */   public void detectAndSendChanges() {
/*  48 */     super.detectAndSendChanges();
/*  49 */     for (int i = 0; i < this.crafters.size(); i++) {
/*  50 */       ICrafting craft = this.crafters.get(i);
/*     */       
/*  52 */       if (this.lastCookTime != this.tileZivicioFurnace.furnaceCookTime) {
/*  53 */         craft.sendProgressBarUpdate(this, 0, this.tileZivicioFurnace.furnaceCookTime);
/*     */       }
/*     */       
/*  56 */       if (this.lastBurnTime != this.tileZivicioFurnace.furnaceBurnTime) {
/*  57 */         craft.sendProgressBarUpdate(this, 1, this.tileZivicioFurnace.furnaceBurnTime);
/*     */       }
/*     */       
/*  60 */       if (this.lastItemBurnTime != this.tileZivicioFurnace.currentBurnTime) {
/*  61 */         craft.sendProgressBarUpdate(this, 2, this.tileZivicioFurnace.currentBurnTime);
/*     */       }
/*     */     } 
/*     */     
/*  65 */     this.lastBurnTime = this.tileZivicioFurnace.furnaceBurnTime;
/*  66 */     this.lastCookTime = this.tileZivicioFurnace.furnaceCookTime;
/*  67 */     this.lastItemBurnTime = this.tileZivicioFurnace.currentBurnTime;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void updateProgressBar(int par1, int par2) {
/*  72 */     if (par1 == 0) {
/*  73 */       this.tileZivicioFurnace.furnaceCookTime = par2;
/*     */     }
/*     */     
/*  76 */     if (par1 == 1) {
/*  77 */       this.tileZivicioFurnace.furnaceBurnTime = par2;
/*     */     }
/*     */     
/*  80 */     if (par1 == 2) {
/*  81 */       this.tileZivicioFurnace.currentBurnTime = par2;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canInteractWith(EntityPlayer player) {
/*  87 */     return this.tileZivicioFurnace.isUseableByPlayer(player);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_) {
/*  93 */     ItemStack itemstack = null;
/*  94 */     Slot slot = this.inventorySlots.get(p_82846_2_);
/*     */     
/*  96 */     if (slot != null && slot.getHasStack()) {
/*     */       
/*  98 */       ItemStack itemstack1 = slot.getStack();
/*  99 */       itemstack = itemstack1.copy();
/*     */       
/* 101 */       if (p_82846_2_ == 2) {
/*     */         
/* 103 */         if (!mergeItemStack(itemstack1, 3, 39, true))
/*     */         {
/* 105 */           return null;
/*     */         }
/*     */         
/* 108 */         slot.onSlotChange(itemstack1, itemstack);
/*     */       }
/* 110 */       else if (p_82846_2_ != 1 && p_82846_2_ != 0) {
/*     */         
/* 112 */         if (FurnaceRecipes.instance().getSmeltingResult(itemstack1) != null)
/*     */         {
/* 114 */           if (!mergeItemStack(itemstack1, 0, 1, false))
/*     */           {
/* 116 */             return null;
/*     */           }
/*     */         }
/* 119 */         else if (TileEntityZivicioFurnace.isItemFuel(itemstack1))
/*     */         {
/* 121 */           if (!mergeItemStack(itemstack1, 1, 2, false))
/*     */           {
/* 123 */             return null;
/*     */           }
/*     */         }
/* 126 */         else if (p_82846_2_ >= 3 && p_82846_2_ < 30)
/*     */         {
/* 128 */           if (!mergeItemStack(itemstack1, 30, 39, false))
/*     */           {
/* 130 */             return null;
/*     */           }
/*     */         }
/* 133 */         else if (p_82846_2_ >= 30 && p_82846_2_ < 39 && !mergeItemStack(itemstack1, 3, 30, false))
/*     */         {
/* 135 */           return null;
/*     */         }
/*     */       
/* 138 */       } else if (!mergeItemStack(itemstack1, 3, 39, false)) {
/*     */         
/* 140 */         return null;
/*     */       } 
/*     */       
/* 143 */       if (itemstack1.stackSize == 0) {
/*     */         
/* 145 */         slot.putStack((ItemStack)null);
/*     */       }
/*     */       else {
/*     */         
/* 149 */         slot.onSlotChanged();
/*     */       } 
/*     */       
/* 152 */       if (itemstack1.stackSize == itemstack.stackSize)
/*     */       {
/* 154 */         return null;
/*     */       }
/*     */       
/* 157 */       slot.onPickupFromSlot(p_82846_1_, itemstack1);
/*     */     } 
/*     */     
/* 160 */     return itemstack;
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\ContainerZivicioFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */