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
/*  22 */     assert this.currentItem.getItem() instanceof Planter;
/*     */     
/*  24 */     int itemNumSlots = ((Planter)this.currentItem.getItem()).getInvSlots();
/*  25 */     if (itemNumSlots > 0) {
/*  26 */       this.inventoryItems = new ItemStack[itemNumSlots];
/*  27 */       this.size = itemNumSlots;
/*     */     } else {
/*     */       
/*  30 */       this.inventoryItems = new ItemStack[0];
/*  31 */       this.size = 0;
/*     */     } 
/*     */     
/*  34 */     if (!this.currentItem.hasTagCompound()) {
/*  35 */       this.currentItem.setTagCompound(new NBTTagCompound());
/*     */     }
/*     */     
/*  38 */     loadFromNBT(this.currentItem.getTagCompound());
/*     */   }
/*     */ 
/*     */   
/*     */   public int getSizeInventory() {
/*  43 */     return this.size;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack getStackInSlot(int i) {
/*  48 */     if (i >= getSizeInventory()) {
/*  49 */       throw new IndexOutOfBoundsException();
/*     */     }
/*     */     
/*  52 */     return this.inventoryItems[i];
/*     */   }
/*     */   
/*     */   public ItemStack decrStackSize(int index, int amount) {
/*     */     ItemStack output;
/*  57 */     if (this.inventoryItems[index] == null) {
/*  58 */       return null;
/*     */     }
/*     */ 
/*     */     
/*  62 */     if ((this.inventoryItems[index]).stackSize <= amount) {
/*  63 */       output = this.inventoryItems[index];
/*  64 */       this.inventoryItems[index] = null;
/*     */     } else {
/*     */       
/*  67 */       output = this.inventoryItems[index].splitStack(amount);
/*     */       
/*  69 */       if ((this.inventoryItems[index]).stackSize == 0) {
/*  70 */         this.inventoryItems[index] = null;
/*     */       }
/*     */     } 
/*  73 */     markDirty();
/*     */     
/*  75 */     return output;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack getStackInSlotOnClosing(int slotNum) {
/*  80 */     if (this.inventoryItems[slotNum] != null) {
/*  81 */       ItemStack stack = this.inventoryItems[slotNum];
/*  82 */       setInventorySlotContents(slotNum, null);
/*  83 */       return stack;
/*     */     } 
/*     */     
/*  86 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInventorySlotContents(int num, ItemStack itemStack) {
/*  92 */     this.inventoryItems[num] = itemStack;
/*     */     
/*  94 */     if (itemStack != null && itemStack.stackSize > getInventoryStackLimit()) {
/*  95 */       itemStack.stackSize = getInventoryStackLimit();
/*     */     }
/*     */     
/*  98 */     markDirty();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getInventoryName() {
/* 103 */     return "Seed Bag";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCustomInventoryName() {
/* 108 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getInventoryStackLimit() {
/* 113 */     return 64;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void markDirty() {
/* 119 */     for (int i = 0; i < getSizeInventory(); i++) {
/* 120 */       if (getStackInSlot(i) != null && (getStackInSlot(i)).stackSize == 0) {
/* 121 */         setInventorySlotContents(i, null);
/*     */       }
/*     */     } 
/*     */     
/* 125 */     saveToNBT(this.currentItem.getTagCompound());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUseableByPlayer(EntityPlayer entityPlayer) {
/* 130 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void openChest() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void closeChest() {}
/*     */ 
/*     */   
/*     */   public boolean isItemValidForSlot(int i, ItemStack itemStack) {
/* 143 */     return (itemStack != null && itemStack.getItem() != null && itemStack.getItem() instanceof net.minecraftforge.common.IPlantable);
/*     */   }
/*     */   
/*     */   public void loadFromNBT(NBTTagCompound tagCompound) {
/* 147 */     int NBT_TAGLIST = 10;
/* 148 */     NBTTagList tagList = tagCompound.getTagList("ItemsPlanterHelper", 10);
/*     */     
/* 150 */     for (int i = 0; i < tagList.tagCount(); i++) {
/* 151 */       NBTTagCompound itemTag = tagList.getCompoundTagAt(i);
/* 152 */       int slot = itemTag.getInteger("SlotPlanterHelper");
/*     */       
/* 154 */       if (slot >= 0 && slot < getSizeInventory()) {
/* 155 */         setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(itemTag));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void saveToNBT(NBTTagCompound newCompound) {
/* 161 */     NBTTagList list = new NBTTagList();
/*     */     
/* 163 */     for (int i = 0; i < getSizeInventory(); i++) {
/* 164 */       ItemStack stack = this.inventoryItems[i];
/* 165 */       if (stack != null) {
/* 166 */         NBTTagCompound itemTag = new NBTTagCompound();
/* 167 */         itemTag.setInteger("SlotPlanterHelper", i);
/* 168 */         stack.writeToNBT(itemTag);
/* 169 */         list.appendTag((NBTBase)itemTag);
/*     */       } 
/*     */     } 
/*     */     
/* 173 */     newCompound.setTag("ItemsPlanterHelper", (NBTBase)list);
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\SeedInventory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */