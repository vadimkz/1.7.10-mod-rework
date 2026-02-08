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
/*     */ 
/*     */ 
/*     */ public class TileEntityCrucioFurnace
/*     */   extends TileEntity
/*     */   implements ISidedInventory
/*     */ {
/*  30 */   private static final int[] slotsTop = new int[] { 0 };
/*  31 */   private static final int[] slotsBottom = new int[] { 2, 1 };
/*  32 */   private static final int[] slotsSides = new int[] { 1 };
/*     */   
/*  34 */   private ItemStack[] furnaceItemStacks = new ItemStack[3];
/*     */   
/*     */   public int furnaceBurnTime;
/*     */   
/*     */   public int currentBurnTime;
/*     */   public int furnaceCookTime;
/*     */   private String furnaceName;
/*     */   
/*     */   public void furnaceName(String string) {
/*  43 */     this.furnaceName = string;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getSizeInventory() {
/*  48 */     return this.furnaceItemStacks.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack getStackInSlot(int slot) {
/*  53 */     return this.furnaceItemStacks[slot];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack decrStackSize(int slot, int amount) {
/*  59 */     if (this.furnaceItemStacks[slot] != null) {
/*     */ 
/*     */ 
/*     */       
/*  63 */       if ((this.furnaceItemStacks[slot]).stackSize <= amount) {
/*     */         
/*  65 */         ItemStack itemStack = this.furnaceItemStacks[slot];
/*  66 */         this.furnaceItemStacks[slot] = null;
/*  67 */         return itemStack;
/*     */       } 
/*     */ 
/*     */       
/*  71 */       ItemStack itemstack = this.furnaceItemStacks[slot].splitStack(amount);
/*     */       
/*  73 */       if ((this.furnaceItemStacks[slot]).stackSize == 0)
/*     */       {
/*  75 */         this.furnaceItemStacks[slot] = null;
/*     */       }
/*     */       
/*  78 */       return itemstack;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  83 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack getStackInSlotOnClosing(int slot) {
/*  90 */     if (this.furnaceItemStacks[slot] != null) {
/*     */       
/*  92 */       ItemStack itemstack = this.furnaceItemStacks[slot];
/*  93 */       this.furnaceItemStacks[slot] = null;
/*  94 */       return itemstack;
/*     */     } 
/*     */ 
/*     */     
/*  98 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInventorySlotContents(int slot, ItemStack itemStack) {
/* 105 */     this.furnaceItemStacks[slot] = itemStack;
/*     */     
/* 107 */     if (itemStack != null && itemStack.stackSize > getInventoryStackLimit())
/*     */     {
/* 109 */       itemStack.stackSize = getInventoryStackLimit();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getInventoryName() {
/* 115 */     return isCustomInventoryName() ? this.furnaceName : "Crucio Furnace";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCustomInventoryName() {
/* 120 */     return (this.furnaceName != null && this.furnaceName.length() > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void readFromNBT(NBTTagCompound nbt) {
/* 126 */     super.readFromNBT(nbt);
/* 127 */     NBTTagList nbttaglist = nbt.getTagList("Items", 10);
/* 128 */     this.furnaceItemStacks = new ItemStack[getSizeInventory()];
/*     */     
/* 130 */     for (int i = 0; i < nbttaglist.tagCount(); i++) {
/*     */       
/* 132 */       NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
/* 133 */       byte b0 = nbttagcompound1.getByte("Slot");
/*     */       
/* 135 */       if (b0 >= 0 && b0 < this.furnaceItemStacks.length)
/*     */       {
/* 137 */         this.furnaceItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
/*     */       }
/*     */     } 
/*     */     
/* 141 */     this.furnaceBurnTime = nbt.getShort("BurnTime");
/* 142 */     this.furnaceCookTime = nbt.getShort("CookTime");
/* 143 */     this.currentBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
/*     */     
/* 145 */     if (nbt.hasKey("CustomName", 8))
/*     */     {
/* 147 */       this.furnaceName = nbt.getString("CustomName");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToNBT(NBTTagCompound nbt) {
/* 154 */     super.writeToNBT(nbt);
/* 155 */     nbt.setShort("BurnTime", (short)this.furnaceBurnTime);
/* 156 */     nbt.setShort("CookTime", (short)this.furnaceCookTime);
/* 157 */     NBTTagList nbttaglist = new NBTTagList();
/*     */     
/* 159 */     for (int i = 0; i < this.furnaceItemStacks.length; i++) {
/*     */       
/* 161 */       if (this.furnaceItemStacks[i] != null) {
/*     */         
/* 163 */         NBTTagCompound nbttagcompound1 = new NBTTagCompound();
/* 164 */         nbttagcompound1.setByte("Slot", (byte)i);
/* 165 */         this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
/* 166 */         nbttaglist.appendTag((NBTBase)nbttagcompound1);
/*     */       } 
/*     */     } 
/*     */     
/* 170 */     nbt.setTag("Items", (NBTBase)nbttaglist);
/*     */     
/* 172 */     if (isCustomInventoryName())
/*     */     {
/* 174 */       nbt.setString("CustomName", this.furnaceName);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInventoryStackLimit() {
/* 181 */     return 64;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getCookProgressScaled(int scale) {
/* 186 */     return this.furnaceCookTime * scale / 50;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getBurnTimeRemainingScaled(int scale) {
/* 192 */     if (this.currentBurnTime == 0)
/*     */     {
/* 194 */       this.currentBurnTime = 100;
/*     */     }
/*     */     
/* 197 */     return this.furnaceBurnTime * scale / this.currentBurnTime;
/*     */   }
/*     */   
/*     */   public boolean isBurning() {
/* 201 */     return (this.furnaceBurnTime > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateEntity() {
/* 207 */     boolean flag = (this.furnaceBurnTime > 0);
/* 208 */     boolean flag1 = false;
/*     */     
/* 210 */     if (this.furnaceBurnTime > 0)
/*     */     {
/* 212 */       this.furnaceBurnTime--;
/*     */     }
/*     */     
/* 215 */     if (!this.worldObj.isRemote) {
/*     */       
/* 217 */       if (this.furnaceBurnTime != 0 || (this.furnaceItemStacks[1] != null && this.furnaceItemStacks[0] != null)) {
/*     */         
/* 219 */         if (this.furnaceBurnTime == 0 && canSmelt()) {
/*     */           
/* 221 */           this.currentBurnTime = this.furnaceBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
/*     */           
/* 223 */           if (this.furnaceBurnTime > 0) {
/*     */             
/* 225 */             flag1 = true;
/*     */             
/* 227 */             if (this.furnaceItemStacks[1] != null) {
/*     */               
/* 229 */               (this.furnaceItemStacks[1]).stackSize--;
/*     */               
/* 231 */               if ((this.furnaceItemStacks[1]).stackSize == 0)
/*     */               {
/* 233 */                 this.furnaceItemStacks[1] = this.furnaceItemStacks[1].getItem().getContainerItem(this.furnaceItemStacks[1]);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 239 */         if (isBurning() && canSmelt()) {
/*     */           
/* 241 */           this.furnaceCookTime++;
/*     */           
/* 243 */           if (this.furnaceCookTime == 50)
/*     */           {
/* 245 */             this.furnaceCookTime = 0;
/* 246 */             smeltItem();
/* 247 */             flag1 = true;
/*     */           }
/*     */         
/*     */         } else {
/*     */           
/* 252 */           this.furnaceCookTime = 0;
/*     */         } 
/*     */       } 
/*     */       
/* 256 */       if (flag != ((this.furnaceBurnTime > 0))) {
/*     */         
/* 258 */         flag1 = true;
/* 259 */         CrucioFurnace.updateBlockState((this.furnaceBurnTime > 0), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
/*     */       } 
/*     */     } 
/*     */     
/* 263 */     if (flag1)
/*     */     {
/* 265 */       markDirty();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean canSmelt() {
/* 271 */     if (this.furnaceItemStacks[0] == null)
/*     */     {
/* 273 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 277 */     ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.furnaceItemStacks[0]);
/* 278 */     if (itemstack == null) return false; 
/* 279 */     if (this.furnaceItemStacks[2] == null) return true; 
/* 280 */     if (!this.furnaceItemStacks[2].isItemEqual(itemstack)) return false; 
/* 281 */     int result = (this.furnaceItemStacks[2]).stackSize + itemstack.stackSize;
/* 282 */     return (result <= getInventoryStackLimit() && result <= this.furnaceItemStacks[2].getMaxStackSize());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void smeltItem() {
/* 288 */     if (canSmelt()) {
/*     */       
/* 290 */       ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.furnaceItemStacks[0]);
/*     */       
/* 292 */       if (this.furnaceItemStacks[2] == null) {
/*     */         
/* 294 */         this.furnaceItemStacks[2] = itemstack.copy();
/*     */       }
/* 296 */       else if (this.furnaceItemStacks[2].getItem() == itemstack.getItem()) {
/*     */         
/* 298 */         (this.furnaceItemStacks[2]).stackSize += itemstack.stackSize;
/*     */       } 
/*     */       
/* 301 */       (this.furnaceItemStacks[0]).stackSize--;
/*     */       
/* 303 */       if ((this.furnaceItemStacks[0]).stackSize <= 0)
/*     */       {
/* 305 */         this.furnaceItemStacks[0] = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static int getItemBurnTime(ItemStack itemStack) {
/* 312 */     if (itemStack == null)
/*     */     {
/* 314 */       return 0;
/*     */     }
/*     */ 
/*     */     
/* 318 */     Item item = itemStack.getItem();
/*     */     
/* 320 */     if (item instanceof net.minecraft.item.ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
/*     */       
/* 322 */       Block block = Block.getBlockFromItem(item);
/*     */       
/* 324 */       if (block == Blocks.wooden_slab)
/*     */       {
/* 326 */         return 150;
/*     */       }
/*     */       
/* 329 */       if (block.getMaterial() == Material.wood)
/*     */       {
/* 331 */         return 300;
/*     */       }
/*     */       
/* 334 */       if (block == Blocks.coal_block)
/*     */       {
/* 336 */         return 16000;
/*     */       }
/*     */     } 
/*     */     
/* 340 */     if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200; 
/* 341 */     if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200; 
/* 342 */     if (item instanceof ItemHoe && ((ItemHoe)item).getMaterialName().equals("WOOD")) return 200; 
/* 343 */     if (item == Items.stick) return 100; 
/* 344 */     if (item == Items.coal) return 1600; 
/* 345 */     if (item == Items.lava_bucket) return 20000; 
/* 346 */     if (item == Item.getItemFromBlock(Blocks.sapling)) return 100; 
/* 347 */     if (item == Items.blaze_rod) return 2400; 
/* 348 */     return GameRegistry.getFuelValue(itemStack);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isItemFuel(ItemStack itemStack) {
/* 354 */     return (getItemBurnTime(itemStack) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUseableByPlayer(EntityPlayer player) {
/* 359 */     return (this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this) ? false : ((player.getDistanceSq(this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D) <= 64.0D));
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
/*     */   public boolean isItemValidForSlot(int slot, ItemStack itemStack) {
/* 375 */     return (slot == 2) ? false : ((slot == 1) ? isItemFuel(itemStack) : true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getSlotsForFace(int side) {
/* 381 */     return (side == 0) ? slotsBottom : ((side == 1) ? slotsTop : slotsSides);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canInsertItem(int slot, ItemStack itemStack, int side) {
/* 387 */     return isItemValidForSlot(slot, itemStack);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canExtractItem(int slot, ItemStack itemStack, int side) {
/* 393 */     return (side != 0 || slot != 1 || itemStack.getItem() == Items.bucket);
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\TileEntityCrucioFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */