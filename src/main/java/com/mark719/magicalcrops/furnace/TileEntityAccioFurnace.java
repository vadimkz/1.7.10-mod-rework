/*     */ package com.mark719.magicalcrops.furnace;
/*     */ 
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.inventory.ISidedInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemHoe;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.ItemSword;
/*     */ import net.minecraft.item.ItemTool;
/*     */ import net.minecraft.item.crafting.FurnaceRecipes;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ 
/*     */ 
/*     */ public class TileEntityAccioFurnace
/*     */   extends TileEntity
/*     */   implements ISidedInventory
/*     */ {
/*  28 */   private static final int[] slotsTop = new int[] { 0 };
/*  29 */   private static final int[] slotsBottom = new int[] { 2, 1 };
/*  30 */   private static final int[] slotsSides = new int[] { 1 };
/*     */   
/*  32 */   private ItemStack[] furnaceItemStacks = new ItemStack[3];
/*     */   
/*     */   public int furnaceBurnTime;
/*     */   
/*     */   public int currentBurnTime;
/*     */   public int furnaceCookTime;
/*     */   private String furnaceName;
/*     */   
/*     */   public void furnaceName(String string) {
/*  41 */     this.furnaceName = string;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getSizeInventory() {
/*  46 */     return this.furnaceItemStacks.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack getStackInSlot(int slot) {
/*  51 */     return this.furnaceItemStacks[slot];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
/*  57 */     if (this.furnaceItemStacks[p_70298_1_] != null) {
/*     */ 
/*     */ 
/*     */       
/*  61 */       if ((this.furnaceItemStacks[p_70298_1_]).stackSize <= p_70298_2_) {
/*     */         
/*  63 */         ItemStack itemStack = this.furnaceItemStacks[p_70298_1_];
/*  64 */         this.furnaceItemStacks[p_70298_1_] = null;
/*  65 */         return itemStack;
/*     */       } 
/*     */ 
/*     */       
/*  69 */       ItemStack itemstack = this.furnaceItemStacks[p_70298_1_].splitStack(p_70298_2_);
/*     */       
/*  71 */       if ((this.furnaceItemStacks[p_70298_1_]).stackSize == 0)
/*     */       {
/*  73 */         this.furnaceItemStacks[p_70298_1_] = null;
/*     */       }
/*     */       
/*  76 */       return itemstack;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  81 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
/*  88 */     if (this.furnaceItemStacks[p_70304_1_] != null) {
/*     */       
/*  90 */       ItemStack itemstack = this.furnaceItemStacks[p_70304_1_];
/*  91 */       this.furnaceItemStacks[p_70304_1_] = null;
/*  92 */       return itemstack;
/*     */     } 
/*     */ 
/*     */     
/*  96 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
/* 103 */     this.furnaceItemStacks[p_70299_1_] = p_70299_2_;
/*     */     
/* 105 */     if (p_70299_2_ != null && p_70299_2_.stackSize > getInventoryStackLimit())
/*     */     {
/* 107 */       p_70299_2_.stackSize = getInventoryStackLimit();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getInventoryName() {
/* 113 */     return isCustomInventoryName() ? this.furnaceName : "Accio Furnace";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCustomInventoryName() {
/* 118 */     return (this.furnaceName != null && this.furnaceName.length() > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void readFromNBT(NBTTagCompound p_145839_1_) {
/* 124 */     super.readFromNBT(p_145839_1_);
/* 125 */     NBTTagList nbttaglist = p_145839_1_.getTagList("Items", 10);
/* 126 */     this.furnaceItemStacks = new ItemStack[getSizeInventory()];
/*     */     
/* 128 */     for (int i = 0; i < nbttaglist.tagCount(); i++) {
/*     */       
/* 130 */       NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
/* 131 */       byte b0 = nbttagcompound1.getByte("Slot");
/*     */       
/* 133 */       if (b0 >= 0 && b0 < this.furnaceItemStacks.length)
/*     */       {
/* 135 */         this.furnaceItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
/*     */       }
/*     */     } 
/*     */     
/* 139 */     this.furnaceBurnTime = p_145839_1_.getShort("BurnTime");
/* 140 */     this.furnaceCookTime = p_145839_1_.getShort("CookTime");
/* 141 */     this.currentBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
/*     */     
/* 143 */     if (p_145839_1_.hasKey("CustomName", 8))
/*     */     {
/* 145 */       this.furnaceName = p_145839_1_.getString("CustomName");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToNBT(NBTTagCompound p_145841_1_) {
/* 152 */     super.writeToNBT(p_145841_1_);
/* 153 */     p_145841_1_.setShort("BurnTime", (short)this.furnaceBurnTime);
/* 154 */     p_145841_1_.setShort("CookTime", (short)this.furnaceCookTime);
/* 155 */     NBTTagList nbttaglist = new NBTTagList();
/*     */     
/* 157 */     for (int i = 0; i < this.furnaceItemStacks.length; i++) {
/*     */       
/* 159 */       if (this.furnaceItemStacks[i] != null) {
/*     */         
/* 161 */         NBTTagCompound nbttagcompound1 = new NBTTagCompound();
/* 162 */         nbttagcompound1.setByte("Slot", (byte)i);
/* 163 */         this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
/* 164 */         nbttaglist.appendTag((NBTBase)nbttagcompound1);
/*     */       } 
/*     */     } 
/*     */     
/* 168 */     p_145841_1_.setTag("Items", (NBTBase)nbttaglist);
/*     */     
/* 170 */     if (isCustomInventoryName())
/*     */     {
/* 172 */       p_145841_1_.setString("CustomName", this.furnaceName);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInventoryStackLimit() {
/* 179 */     return 64;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getCookProgressScaled(int par1) {
/* 184 */     return this.furnaceCookTime * par1 / 100;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getBurnTimeRemainingScaled(int p_145955_1_) {
/* 190 */     if (this.currentBurnTime == 0)
/*     */     {
/* 192 */       this.currentBurnTime = 200;
/*     */     }
/*     */     
/* 195 */     return this.furnaceBurnTime * p_145955_1_ / this.currentBurnTime;
/*     */   }
/*     */   
/*     */   public boolean isBurning() {
/* 199 */     return (this.furnaceBurnTime > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateEntity() {
/* 205 */     boolean flag = (this.furnaceBurnTime > 0);
/* 206 */     boolean flag1 = false;
/*     */     
/* 208 */     if (this.furnaceBurnTime > 0)
/*     */     {
/* 210 */       this.furnaceBurnTime--;
/*     */     }
/*     */     
/* 213 */     if (!this.worldObj.isRemote) {
/*     */       
/* 215 */       if (this.furnaceBurnTime != 0 || (this.furnaceItemStacks[1] != null && this.furnaceItemStacks[0] != null)) {
/*     */         
/* 217 */         if (this.furnaceBurnTime == 0 && canSmelt()) {
/*     */           
/* 219 */           this.currentBurnTime = this.furnaceBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
/*     */           
/* 221 */           if (this.furnaceBurnTime > 0) {
/*     */             
/* 223 */             flag1 = true;
/*     */             
/* 225 */             if (this.furnaceItemStacks[1] != null) {
/*     */               
/* 227 */               (this.furnaceItemStacks[1]).stackSize--;
/*     */               
/* 229 */               if ((this.furnaceItemStacks[1]).stackSize == 0)
/*     */               {
/* 231 */                 this.furnaceItemStacks[1] = this.furnaceItemStacks[1].getItem().getContainerItem(this.furnaceItemStacks[1]);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 237 */         if (isBurning() && canSmelt()) {
/*     */           
/* 239 */           this.furnaceCookTime++;
/*     */           
/* 241 */           if (this.furnaceCookTime == 100)
/*     */           {
/* 243 */             this.furnaceCookTime = 0;
/* 244 */             smeltItem();
/* 245 */             flag1 = true;
/*     */           }
/*     */         
/*     */         } else {
/*     */           
/* 250 */           this.furnaceCookTime = 0;
/*     */         } 
/*     */       } 
/*     */       
/* 254 */       if (flag != ((this.furnaceBurnTime > 0))) {
/*     */         
/* 256 */         flag1 = true;
/* 257 */         AccioFurnace.updateBlockState((this.furnaceBurnTime > 0), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
/*     */       } 
/*     */     } 
/*     */     
/* 261 */     if (flag1)
/*     */     {
/* 263 */       markDirty();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean canSmelt() {
/* 269 */     if (this.furnaceItemStacks[0] == null)
/*     */     {
/* 271 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 275 */     ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.furnaceItemStacks[0]);
/* 276 */     if (itemstack == null) return false; 
/* 277 */     if (this.furnaceItemStacks[2] == null) return true; 
/* 278 */     if (!this.furnaceItemStacks[2].isItemEqual(itemstack)) return false; 
/* 279 */     int result = (this.furnaceItemStacks[2]).stackSize + itemstack.stackSize;
/* 280 */     return (result <= getInventoryStackLimit() && result <= this.furnaceItemStacks[2].getMaxStackSize());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void smeltItem() {
/* 286 */     if (canSmelt()) {
/*     */       
/* 288 */       ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.furnaceItemStacks[0]);
/*     */       
/* 290 */       if (this.furnaceItemStacks[2] == null) {
/*     */         
/* 292 */         this.furnaceItemStacks[2] = itemstack.copy();
/*     */       }
/* 294 */       else if (this.furnaceItemStacks[2].getItem() == itemstack.getItem()) {
/*     */         
/* 296 */         (this.furnaceItemStacks[2]).stackSize += itemstack.stackSize;
/*     */       } 
/*     */       
/* 299 */       (this.furnaceItemStacks[0]).stackSize--;
/*     */       
/* 301 */       if ((this.furnaceItemStacks[0]).stackSize <= 0)
/*     */       {
/* 303 */         this.furnaceItemStacks[0] = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static int getItemBurnTime(ItemStack p_145952_0_) {
/* 310 */     if (p_145952_0_ == null)
/*     */     {
/* 312 */       return 0;
/*     */     }
/*     */ 
/*     */     
/* 316 */     Item item = p_145952_0_.getItem();
/*     */     
/* 318 */     if (item instanceof net.minecraft.item.ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
/*     */       
/* 320 */       Block block = Block.getBlockFromItem(item);
/*     */       
/* 322 */       if (block == Blocks.wooden_slab)
/*     */       {
/* 324 */         return 150;
/*     */       }
/*     */       
/* 327 */       if (block.getMaterial() == Material.wood)
/*     */       {
/* 329 */         return 300;
/*     */       }
/*     */       
/* 332 */       if (block == Blocks.coal_block)
/*     */       {
/* 334 */         return 16000;
/*     */       }
/*     */     } 
/*     */     
/* 338 */     if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200; 
/* 339 */     if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200; 
/* 340 */     if (item instanceof ItemHoe && ((ItemHoe)item).getMaterialName().equals("WOOD")) return 200; 
/* 341 */     if (item == Items.stick) return 100; 
/* 342 */     if (item == Items.coal) return 1600; 
/* 343 */     if (item == Items.lava_bucket) return 20000; 
/* 344 */     if (item == Item.getItemFromBlock(Blocks.sapling)) return 100; 
/* 345 */     if (item == Items.blaze_rod) return 2400; 
/* 346 */     return GameRegistry.getFuelValue(p_145952_0_);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isItemFuel(ItemStack p_145954_0_) {
/* 352 */     return (getItemBurnTime(p_145954_0_) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUseableByPlayer(EntityPlayer player) {
/* 357 */     return (this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this) ? false : ((player.getDistanceSq(this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D) <= 64.0D));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void openChest() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void closeChest() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
/* 373 */     return (p_94041_1_ == 2) ? false : ((p_94041_1_ == 1) ? isItemFuel(p_94041_2_) : true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getSlotsForFace(int p_94128_1_) {
/* 379 */     return (p_94128_1_ == 0) ? slotsBottom : ((p_94128_1_ == 1) ? slotsTop : slotsSides);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
/* 385 */     return isItemValidForSlot(p_102007_1_, p_102007_2_);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
/* 391 */     return (p_102008_3_ != 0 || p_102008_1_ != 1 || p_102008_2_.getItem() == Items.bucket);
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\TileEntityAccioFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */