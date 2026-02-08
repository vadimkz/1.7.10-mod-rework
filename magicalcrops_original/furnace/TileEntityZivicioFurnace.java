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
/*     */ public class TileEntityZivicioFurnace
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
/*     */   public int func_70302_i_() {
/*  46 */     return this.furnaceItemStacks.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack func_70301_a(int slot) {
/*  51 */     return this.furnaceItemStacks[slot];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack func_70298_a(int p_70298_1_, int p_70298_2_) {
/*  57 */     if (this.furnaceItemStacks[p_70298_1_] != null) {
/*     */ 
/*     */ 
/*     */       
/*  61 */       if ((this.furnaceItemStacks[p_70298_1_]).field_77994_a <= p_70298_2_) {
/*     */         
/*  63 */         ItemStack itemStack = this.furnaceItemStacks[p_70298_1_];
/*  64 */         this.furnaceItemStacks[p_70298_1_] = null;
/*  65 */         return itemStack;
/*     */       } 
/*     */ 
/*     */       
/*  69 */       ItemStack itemstack = this.furnaceItemStacks[p_70298_1_].func_77979_a(p_70298_2_);
/*     */       
/*  71 */       if ((this.furnaceItemStacks[p_70298_1_]).field_77994_a == 0)
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
/*     */   public ItemStack func_70304_b(int p_70304_1_) {
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
/*     */   public void func_70299_a(int p_70299_1_, ItemStack p_70299_2_) {
/* 103 */     this.furnaceItemStacks[p_70299_1_] = p_70299_2_;
/*     */     
/* 105 */     if (p_70299_2_ != null && p_70299_2_.field_77994_a > func_70297_j_())
/*     */     {
/* 107 */       p_70299_2_.field_77994_a = func_70297_j_();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_145825_b() {
/* 113 */     return func_145818_k_() ? this.furnaceName : "Zivicio Furnace";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_145818_k_() {
/* 118 */     return (this.furnaceName != null && this.furnaceName.length() > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145839_a(NBTTagCompound p_145839_1_) {
/* 124 */     super.func_145839_a(p_145839_1_);
/* 125 */     NBTTagList nbttaglist = p_145839_1_.func_150295_c("Items", 10);
/* 126 */     this.furnaceItemStacks = new ItemStack[func_70302_i_()];
/*     */     
/* 128 */     for (int i = 0; i < nbttaglist.func_74745_c(); i++) {
/*     */       
/* 130 */       NBTTagCompound nbttagcompound1 = nbttaglist.func_150305_b(i);
/* 131 */       byte b0 = nbttagcompound1.func_74771_c("Slot");
/*     */       
/* 133 */       if (b0 >= 0 && b0 < this.furnaceItemStacks.length)
/*     */       {
/* 135 */         this.furnaceItemStacks[b0] = ItemStack.func_77949_a(nbttagcompound1);
/*     */       }
/*     */     } 
/*     */     
/* 139 */     this.furnaceBurnTime = p_145839_1_.func_74765_d("BurnTime");
/* 140 */     this.furnaceCookTime = p_145839_1_.func_74765_d("CookTime");
/* 141 */     this.currentBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
/*     */     
/* 143 */     if (p_145839_1_.func_150297_b("CustomName", 8))
/*     */     {
/* 145 */       this.furnaceName = p_145839_1_.func_74779_i("CustomName");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145841_b(NBTTagCompound p_145841_1_) {
/* 152 */     super.func_145841_b(p_145841_1_);
/* 153 */     p_145841_1_.func_74777_a("BurnTime", (short)this.furnaceBurnTime);
/* 154 */     p_145841_1_.func_74777_a("CookTime", (short)this.furnaceCookTime);
/* 155 */     NBTTagList nbttaglist = new NBTTagList();
/*     */     
/* 157 */     for (int i = 0; i < this.furnaceItemStacks.length; i++) {
/*     */       
/* 159 */       if (this.furnaceItemStacks[i] != null) {
/*     */         
/* 161 */         NBTTagCompound nbttagcompound1 = new NBTTagCompound();
/* 162 */         nbttagcompound1.func_74774_a("Slot", (byte)i);
/* 163 */         this.furnaceItemStacks[i].func_77955_b(nbttagcompound1);
/* 164 */         nbttaglist.func_74742_a((NBTBase)nbttagcompound1);
/*     */       } 
/*     */     } 
/*     */     
/* 168 */     p_145841_1_.func_74782_a("Items", (NBTBase)nbttaglist);
/*     */     
/* 170 */     if (func_145818_k_())
/*     */     {
/* 172 */       p_145841_1_.func_74778_a("CustomName", this.furnaceName);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70297_j_() {
/* 179 */     return 64;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getCookProgressScaled(int par1) {
/* 184 */     return this.furnaceCookTime * par1 / 12;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getBurnTimeRemainingScaled(int p_145955_1_) {
/* 190 */     if (this.currentBurnTime == 0)
/*     */     {
/* 192 */       this.currentBurnTime = 25;
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
/*     */   public void func_145845_h() {
/* 205 */     boolean flag = (this.furnaceBurnTime > 0);
/* 206 */     boolean flag1 = false;
/*     */     
/* 208 */     if (this.furnaceBurnTime > 0)
/*     */     {
/* 210 */       this.furnaceBurnTime--;
/*     */     }
/*     */     
/* 213 */     if (!this.field_145850_b.field_72995_K) {
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
/* 227 */               (this.furnaceItemStacks[1]).field_77994_a--;
/*     */               
/* 229 */               if ((this.furnaceItemStacks[1]).field_77994_a == 0)
/*     */               {
/* 231 */                 this.furnaceItemStacks[1] = this.furnaceItemStacks[1].func_77973_b().getContainerItem(this.furnaceItemStacks[1]);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 237 */         if (isBurning() && canSmelt()) {
/*     */           
/* 239 */           this.furnaceCookTime++;
/*     */           
/* 241 */           if (this.furnaceCookTime == 12)
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
/* 257 */         ZivicioFurnace.updateBlockState((this.furnaceBurnTime > 0), this.field_145850_b, this.field_145851_c, this.field_145848_d, this.field_145849_e);
/*     */       } 
/*     */     } 
/*     */     
/* 261 */     if (flag1)
/*     */     {
/* 263 */       func_70296_d();
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
/* 275 */     ItemStack itemstack = FurnaceRecipes.func_77602_a().func_151395_a(this.furnaceItemStacks[0]);
/* 276 */     if (itemstack == null) return false; 
/* 277 */     if (this.furnaceItemStacks[2] == null) return true; 
/* 278 */     if (!this.furnaceItemStacks[2].func_77969_a(itemstack)) return false; 
/* 279 */     int result = (this.furnaceItemStacks[2]).field_77994_a + itemstack.field_77994_a;
/* 280 */     return (result <= func_70297_j_() && result <= this.furnaceItemStacks[2].func_77976_d());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void smeltItem() {
/* 286 */     if (canSmelt()) {
/*     */       
/* 288 */       ItemStack itemstack = FurnaceRecipes.func_77602_a().func_151395_a(this.furnaceItemStacks[0]);
/*     */       
/* 290 */       if (this.furnaceItemStacks[2] == null) {
/*     */         
/* 292 */         this.furnaceItemStacks[2] = itemstack.func_77946_l();
/*     */       }
/* 294 */       else if (this.furnaceItemStacks[2].func_77973_b() == itemstack.func_77973_b()) {
/*     */         
/* 296 */         (this.furnaceItemStacks[2]).field_77994_a += itemstack.field_77994_a;
/*     */       } 
/*     */       
/* 299 */       (this.furnaceItemStacks[0]).field_77994_a--;
/*     */       
/* 301 */       if ((this.furnaceItemStacks[0]).field_77994_a <= 0)
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
/* 316 */     Item item = p_145952_0_.func_77973_b();
/*     */     
/* 318 */     if (item instanceof net.minecraft.item.ItemBlock && Block.func_149634_a(item) != Blocks.field_150350_a) {
/*     */       
/* 320 */       Block block = Block.func_149634_a(item);
/*     */       
/* 322 */       if (block == Blocks.field_150376_bx)
/*     */       {
/* 324 */         return 150;
/*     */       }
/*     */       
/* 327 */       if (block.func_149688_o() == Material.field_151575_d)
/*     */       {
/* 329 */         return 300;
/*     */       }
/*     */       
/* 332 */       if (block == Blocks.field_150402_ci)
/*     */       {
/* 334 */         return 16000;
/*     */       }
/*     */     } 
/*     */     
/* 338 */     if (item instanceof ItemTool && ((ItemTool)item).func_77861_e().equals("WOOD")) return 200; 
/* 339 */     if (item instanceof ItemSword && ((ItemSword)item).func_150932_j().equals("WOOD")) return 200; 
/* 340 */     if (item instanceof ItemHoe && ((ItemHoe)item).func_77842_f().equals("WOOD")) return 200; 
/* 341 */     if (item == Items.field_151055_y) return 100; 
/* 342 */     if (item == Items.field_151044_h) return 1600; 
/* 343 */     if (item == Items.field_151129_at) return 20000; 
/* 344 */     if (item == Item.func_150898_a(Blocks.field_150345_g)) return 100; 
/* 345 */     if (item == Items.field_151072_bj) return 2400; 
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
/*     */   public boolean func_70300_a(EntityPlayer player) {
/* 357 */     return (this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e) != this) ? false : ((player.func_70092_e(this.field_145851_c + 0.5D, this.field_145848_d + 0.5D, this.field_145849_e + 0.5D) <= 64.0D));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70295_k_() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_70305_f() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_94041_b(int p_94041_1_, ItemStack p_94041_2_) {
/* 373 */     return (p_94041_1_ == 2) ? false : ((p_94041_1_ == 1) ? isItemFuel(p_94041_2_) : true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] func_94128_d(int p_94128_1_) {
/* 379 */     return (p_94128_1_ == 0) ? slotsBottom : ((p_94128_1_ == 1) ? slotsTop : slotsSides);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_102007_a(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
/* 385 */     return func_94041_b(p_102007_1_, p_102007_2_);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_102008_b(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
/* 391 */     return (p_102008_3_ != 0 || p_102008_1_ != 1 || p_102008_2_.func_77973_b() == Items.field_151133_ar);
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\TileEntityZivicioFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */