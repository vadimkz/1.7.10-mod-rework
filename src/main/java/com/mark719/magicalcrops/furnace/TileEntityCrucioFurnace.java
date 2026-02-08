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
/*     */   public int func_70302_i_() {
/*  48 */     return this.furnaceItemStacks.length;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack func_70301_a(int slot) {
/*  53 */     return this.furnaceItemStacks[slot];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack func_70298_a(int p_70298_1_, int p_70298_2_) {
/*  59 */     if (this.furnaceItemStacks[p_70298_1_] != null) {
/*     */ 
/*     */ 
/*     */       
/*  63 */       if ((this.furnaceItemStacks[p_70298_1_]).field_77994_a <= p_70298_2_) {
/*     */         
/*  65 */         ItemStack itemStack = this.furnaceItemStacks[p_70298_1_];
/*  66 */         this.furnaceItemStacks[p_70298_1_] = null;
/*  67 */         return itemStack;
/*     */       } 
/*     */ 
/*     */       
/*  71 */       ItemStack itemstack = this.furnaceItemStacks[p_70298_1_].func_77979_a(p_70298_2_);
/*     */       
/*  73 */       if ((this.furnaceItemStacks[p_70298_1_]).field_77994_a == 0)
/*     */       {
/*  75 */         this.furnaceItemStacks[p_70298_1_] = null;
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
/*     */   public ItemStack func_70304_b(int p_70304_1_) {
/*  90 */     if (this.furnaceItemStacks[p_70304_1_] != null) {
/*     */       
/*  92 */       ItemStack itemstack = this.furnaceItemStacks[p_70304_1_];
/*  93 */       this.furnaceItemStacks[p_70304_1_] = null;
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
/*     */   public void func_70299_a(int p_70299_1_, ItemStack p_70299_2_) {
/* 105 */     this.furnaceItemStacks[p_70299_1_] = p_70299_2_;
/*     */     
/* 107 */     if (p_70299_2_ != null && p_70299_2_.field_77994_a > func_70297_j_())
/*     */     {
/* 109 */       p_70299_2_.field_77994_a = func_70297_j_();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_145825_b() {
/* 115 */     return func_145818_k_() ? this.furnaceName : "Crucio Furnace";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_145818_k_() {
/* 120 */     return (this.furnaceName != null && this.furnaceName.length() > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145839_a(NBTTagCompound p_145839_1_) {
/* 126 */     super.func_145839_a(p_145839_1_);
/* 127 */     NBTTagList nbttaglist = p_145839_1_.func_150295_c("Items", 10);
/* 128 */     this.furnaceItemStacks = new ItemStack[func_70302_i_()];
/*     */     
/* 130 */     for (int i = 0; i < nbttaglist.func_74745_c(); i++) {
/*     */       
/* 132 */       NBTTagCompound nbttagcompound1 = nbttaglist.func_150305_b(i);
/* 133 */       byte b0 = nbttagcompound1.func_74771_c("Slot");
/*     */       
/* 135 */       if (b0 >= 0 && b0 < this.furnaceItemStacks.length)
/*     */       {
/* 137 */         this.furnaceItemStacks[b0] = ItemStack.func_77949_a(nbttagcompound1);
/*     */       }
/*     */     } 
/*     */     
/* 141 */     this.furnaceBurnTime = p_145839_1_.func_74765_d("BurnTime");
/* 142 */     this.furnaceCookTime = p_145839_1_.func_74765_d("CookTime");
/* 143 */     this.currentBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
/*     */     
/* 145 */     if (p_145839_1_.func_150297_b("CustomName", 8))
/*     */     {
/* 147 */       this.furnaceName = p_145839_1_.func_74779_i("CustomName");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145841_b(NBTTagCompound p_145841_1_) {
/* 154 */     super.func_145841_b(p_145841_1_);
/* 155 */     p_145841_1_.func_74777_a("BurnTime", (short)this.furnaceBurnTime);
/* 156 */     p_145841_1_.func_74777_a("CookTime", (short)this.furnaceCookTime);
/* 157 */     NBTTagList nbttaglist = new NBTTagList();
/*     */     
/* 159 */     for (int i = 0; i < this.furnaceItemStacks.length; i++) {
/*     */       
/* 161 */       if (this.furnaceItemStacks[i] != null) {
/*     */         
/* 163 */         NBTTagCompound nbttagcompound1 = new NBTTagCompound();
/* 164 */         nbttagcompound1.func_74774_a("Slot", (byte)i);
/* 165 */         this.furnaceItemStacks[i].func_77955_b(nbttagcompound1);
/* 166 */         nbttaglist.func_74742_a((NBTBase)nbttagcompound1);
/*     */       } 
/*     */     } 
/*     */     
/* 170 */     p_145841_1_.func_74782_a("Items", (NBTBase)nbttaglist);
/*     */     
/* 172 */     if (func_145818_k_())
/*     */     {
/* 174 */       p_145841_1_.func_74778_a("CustomName", this.furnaceName);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_70297_j_() {
/* 181 */     return 64;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getCookProgressScaled(int par1) {
/* 186 */     return this.furnaceCookTime * par1 / 50;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int getBurnTimeRemainingScaled(int p_145955_1_) {
/* 192 */     if (this.currentBurnTime == 0)
/*     */     {
/* 194 */       this.currentBurnTime = 100;
/*     */     }
/*     */     
/* 197 */     return this.furnaceBurnTime * p_145955_1_ / this.currentBurnTime;
/*     */   }
/*     */   
/*     */   public boolean isBurning() {
/* 201 */     return (this.furnaceBurnTime > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145845_h() {
/* 207 */     boolean flag = (this.furnaceBurnTime > 0);
/* 208 */     boolean flag1 = false;
/*     */     
/* 210 */     if (this.furnaceBurnTime > 0)
/*     */     {
/* 212 */       this.furnaceBurnTime--;
/*     */     }
/*     */     
/* 215 */     if (!this.field_145850_b.field_72995_K) {
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
/* 229 */               (this.furnaceItemStacks[1]).field_77994_a--;
/*     */               
/* 231 */               if ((this.furnaceItemStacks[1]).field_77994_a == 0)
/*     */               {
/* 233 */                 this.furnaceItemStacks[1] = this.furnaceItemStacks[1].func_77973_b().getContainerItem(this.furnaceItemStacks[1]);
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
/* 259 */         CrucioFurnace.updateBlockState((this.furnaceBurnTime > 0), this.field_145850_b, this.field_145851_c, this.field_145848_d, this.field_145849_e);
/*     */       } 
/*     */     } 
/*     */     
/* 263 */     if (flag1)
/*     */     {
/* 265 */       func_70296_d();
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
/* 277 */     ItemStack itemstack = FurnaceRecipes.func_77602_a().func_151395_a(this.furnaceItemStacks[0]);
/* 278 */     if (itemstack == null) return false; 
/* 279 */     if (this.furnaceItemStacks[2] == null) return true; 
/* 280 */     if (!this.furnaceItemStacks[2].func_77969_a(itemstack)) return false; 
/* 281 */     int result = (this.furnaceItemStacks[2]).field_77994_a + itemstack.field_77994_a;
/* 282 */     return (result <= func_70297_j_() && result <= this.furnaceItemStacks[2].func_77976_d());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void smeltItem() {
/* 288 */     if (canSmelt()) {
/*     */       
/* 290 */       ItemStack itemstack = FurnaceRecipes.func_77602_a().func_151395_a(this.furnaceItemStacks[0]);
/*     */       
/* 292 */       if (this.furnaceItemStacks[2] == null) {
/*     */         
/* 294 */         this.furnaceItemStacks[2] = itemstack.func_77946_l();
/*     */       }
/* 296 */       else if (this.furnaceItemStacks[2].func_77973_b() == itemstack.func_77973_b()) {
/*     */         
/* 298 */         (this.furnaceItemStacks[2]).field_77994_a += itemstack.field_77994_a;
/*     */       } 
/*     */       
/* 301 */       (this.furnaceItemStacks[0]).field_77994_a--;
/*     */       
/* 303 */       if ((this.furnaceItemStacks[0]).field_77994_a <= 0)
/*     */       {
/* 305 */         this.furnaceItemStacks[0] = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static int getItemBurnTime(ItemStack p_145952_0_) {
/* 312 */     if (p_145952_0_ == null)
/*     */     {
/* 314 */       return 0;
/*     */     }
/*     */ 
/*     */     
/* 318 */     Item item = p_145952_0_.func_77973_b();
/*     */     
/* 320 */     if (item instanceof net.minecraft.item.ItemBlock && Block.func_149634_a(item) != Blocks.field_150350_a) {
/*     */       
/* 322 */       Block block = Block.func_149634_a(item);
/*     */       
/* 324 */       if (block == Blocks.field_150376_bx)
/*     */       {
/* 326 */         return 150;
/*     */       }
/*     */       
/* 329 */       if (block.func_149688_o() == Material.field_151575_d)
/*     */       {
/* 331 */         return 300;
/*     */       }
/*     */       
/* 334 */       if (block == Blocks.field_150402_ci)
/*     */       {
/* 336 */         return 16000;
/*     */       }
/*     */     } 
/*     */     
/* 340 */     if (item instanceof ItemTool && ((ItemTool)item).func_77861_e().equals("WOOD")) return 200; 
/* 341 */     if (item instanceof ItemSword && ((ItemSword)item).func_150932_j().equals("WOOD")) return 200; 
/* 342 */     if (item instanceof ItemHoe && ((ItemHoe)item).func_77842_f().equals("WOOD")) return 200; 
/* 343 */     if (item == Items.field_151055_y) return 100; 
/* 344 */     if (item == Items.field_151044_h) return 1600; 
/* 345 */     if (item == Items.field_151129_at) return 20000; 
/* 346 */     if (item == Item.func_150898_a(Blocks.field_150345_g)) return 100; 
/* 347 */     if (item == Items.field_151072_bj) return 2400; 
/* 348 */     return GameRegistry.getFuelValue(p_145952_0_);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isItemFuel(ItemStack p_145954_0_) {
/* 354 */     return (getItemBurnTime(p_145954_0_) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_70300_a(EntityPlayer player) {
/* 359 */     return (this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e) != this) ? false : ((player.func_70092_e(this.field_145851_c + 0.5D, this.field_145848_d + 0.5D, this.field_145849_e + 0.5D) <= 64.0D));
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
/* 375 */     return (p_94041_1_ == 2) ? false : ((p_94041_1_ == 1) ? isItemFuel(p_94041_2_) : true);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] func_94128_d(int p_94128_1_) {
/* 381 */     return (p_94128_1_ == 0) ? slotsBottom : ((p_94128_1_ == 1) ? slotsTop : slotsSides);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_102007_a(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
/* 387 */     return func_94041_b(p_102007_1_, p_102007_2_);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_102008_b(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
/* 393 */     return (p_102008_3_ != 0 || p_102008_1_ != 1 || p_102008_2_.func_77973_b() == Items.field_151133_ar);
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\TileEntityCrucioFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */