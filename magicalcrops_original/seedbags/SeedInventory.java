/*     */ package com.mark719.magicalcrops.seedbags;
/*     */ 
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ 
/*     */ 
/*     */ public class SeedInventory
/*     */   implements IInventory
/*     */ {
/*     */   private ItemStack[] inventoryItems;
/*     */   private ItemStack currentItem;
/*     */   private int size;
/*     */   
/*     */   public SeedInventory(ItemStack current) {
/*  19 */     this.currentItem = current;
/*     */     
/*  21 */     assert this.currentItem != null;
/*  22 */     assert this.currentItem.func_77973_b() instanceof Planter;
/*     */     
/*  24 */     int itemNumSlots = ((Planter)this.currentItem.func_77973_b()).getInvSlots();
/*  25 */     if (itemNumSlots > 0) {
/*  26 */       this.inventoryItems = new ItemStack[itemNumSlots];
/*  27 */       this.size = itemNumSlots;
/*     */     } else {
/*     */       
/*  30 */       this.inventoryItems = new ItemStack[0];
/*  31 */       this.size = 0;
/*     */     } 
/*     */     
/*  34 */     if (!this.currentItem.func_77942_o()) {
/*  35 */       this.currentItem.func_77982_d(new NBTTagCompound());
/*     */     }
/*     */     
/*  38 */     loadFromNBT(this.currentItem.func_77978_p());
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_70302_i_() {
/*  43 */     return this.size;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack func_70301_a(int i) {
/*  48 */     if (i >= func_70302_i_()) {
/*  49 */       throw new IndexOutOfBoundsException();
/*     */     }
/*     */     
/*  52 */     return this.inventoryItems[i];
/*     */   }
/*     */   
/*     */   public ItemStack func_70298_a(int index, int amount) {
/*     */     ItemStack output;
/*  57 */     if (this.inventoryItems[index] == null) {
/*  58 */       return null;
/*     */     }
/*     */ 
/*     */     
/*  62 */     if ((this.inventoryItems[index]).field_77994_a <= amount) {
/*  63 */       output = this.inventoryItems[index];
/*  64 */       this.inventoryItems[index] = null;
/*     */     } else {
/*     */       
/*  67 */       output = this.inventoryItems[index].func_77979_a(amount);
/*     */       
/*  69 */       if ((this.inventoryItems[index]).field_77994_a == 0) {
/*  70 */         this.inventoryItems[index] = null;
/*     */       }
/*     */     } 
/*  73 */     func_70296_d();
/*     */     
/*  75 */     return output;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack func_70304_b(int slotNum) {
/*  80 */     if (this.inventoryItems[slotNum] != null) {
/*  81 */       ItemStack stack = this.inventoryItems[slotNum];
/*  82 */       func_70299_a(slotNum, null);
/*  83 */       return stack;
/*     */     } 
/*     */     
/*  86 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70299_a(int num, ItemStack itemStack) {
/*  92 */     this.inventoryItems[num] = itemStack;
/*     */     
/*  94 */     if (itemStack != null && itemStack.field_77994_a > func_70297_j_()) {
/*  95 */       itemStack.field_77994_a = func_70297_j_();
/*     */     }
/*     */     
/*  98 */     func_70296_d();
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_145825_b() {
/* 103 */     return "Seed Bag";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_145818_k_() {
/* 108 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_70297_j_() {
/* 113 */     return 64;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70296_d() {
/* 119 */     for (int i = 0; i < func_70302_i_(); i++) {
/* 120 */       if (func_70301_a(i) != null && (func_70301_a(i)).field_77994_a == 0) {
/* 121 */         func_70299_a(i, null);
/*     */       }
/*     */     } 
/*     */     
/* 125 */     saveToNBT(this.currentItem.func_77978_p());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70300_a(EntityPlayer entityPlayer) {
/* 130 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70295_k_() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70305_f() {}
/*     */ 
/*     */   
/*     */   public boolean func_94041_b(int i, ItemStack itemStack) {
/* 143 */     return (itemStack != null && itemStack.func_77973_b() != null && itemStack.func_77973_b() instanceof net.minecraftforge.common.IPlantable);
/*     */   }
/*     */   
/*     */   public void loadFromNBT(NBTTagCompound tagCompound) {
/* 147 */     int NBT_TAGLIST = 10;
/* 148 */     NBTTagList tagList = tagCompound.func_150295_c("ItemsPlanterHelper", 10);
/*     */     
/* 150 */     for (int i = 0; i < tagList.func_74745_c(); i++) {
/* 151 */       NBTTagCompound itemTag = tagList.func_150305_b(i);
/* 152 */       int slot = itemTag.func_74762_e("SlotPlanterHelper");
/*     */       
/* 154 */       if (slot >= 0 && slot < func_70302_i_()) {
/* 155 */         func_70299_a(slot, ItemStack.func_77949_a(itemTag));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void saveToNBT(NBTTagCompound newCompound) {
/* 161 */     NBTTagList list = new NBTTagList();
/*     */     
/* 163 */     for (int i = 0; i < func_70302_i_(); i++) {
/* 164 */       ItemStack stack = this.inventoryItems[i];
/* 165 */       if (stack != null) {
/* 166 */         NBTTagCompound itemTag = new NBTTagCompound();
/* 167 */         itemTag.func_74768_a("SlotPlanterHelper", i);
/* 168 */         stack.func_77955_b(itemTag);
/* 169 */         list.func_74742_a((NBTBase)itemTag);
/*     */       } 
/*     */     } 
/*     */     
/* 173 */     newCompound.func_74782_a("ItemsPlanterHelper", (NBTBase)list);
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\SeedInventory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */