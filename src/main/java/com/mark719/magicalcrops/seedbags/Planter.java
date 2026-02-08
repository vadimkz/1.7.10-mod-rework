/*     */ package com.mark719.magicalcrops.seedbags;
/*     */ 
/*     */ import com.mark719.magicalcrops.MagicalCrops;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.IPlantable;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ public abstract class Planter
/*     */   extends Item
/*     */ {
/*     */   protected boolean hasGui;
/*     */   protected int invSlots;
/*     */   protected int range;
/*     */   
/*     */   public Planter(int guiSlots, int range) {
/*  22 */     setMaxStackSize(1);
/*  23 */     setCreativeTab(CreativeTabs.tabTools);
/*     */     
/*  25 */     if (guiSlots > 0) {
/*  26 */       this.hasGui = true;
/*  27 */       this.invSlots = guiSlots;
/*     */     } else {
/*     */       
/*  30 */       this.hasGui = false;
/*  31 */       this.invSlots = -1;
/*     */     } 
/*     */     
/*  34 */     this.range = range;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
/*  40 */     if (this.hasGui && player.isSneaking()) {
/*  41 */       player.openGui(MagicalCrops.instance, 0, world, 0, 0, 0);
/*     */     }
/*     */     
/*  44 */     return stack;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onItemUse(ItemStack itemStackUsed, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
/*  49 */     if (this.hasGui && player.isSneaking()) {
/*  50 */       return false;
/*     */     }
/*     */     
/*  53 */     IInventory inventory = getInventory(player);
/*  54 */     if (inventory == null) {
/*  55 */       return false;
/*     */     }
/*     */     
/*  58 */     if (canPlant(inventory, world, x, y, z, ForgeDirection.getOrientation(side))) {
/*  59 */       plant(player, inventory, world, x, y, z, this.range, player.rotationYaw);
/*     */     }
/*     */     
/*  62 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getMaxItemUseDuration(ItemStack itemstack) {
/*  67 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IInventory getInventory(EntityPlayer player) {
/*  74 */     if (player.getHeldItem().getItem() == this) {
/*  75 */       return new SeedInventory(player.getHeldItem());
/*     */     }
/*  77 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFirstSlot(IInventory inventory) {
/*  84 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean canPlant(IInventory inv, World world, int x, int y, int z, ForgeDirection direction) {
/*  88 */     int nextSlot = PlantingLogic.getSeedsSlot(inv, getFirstSlot(inv));
/*  89 */     if (nextSlot >= 0) {
/*  90 */       ItemStack targetItem = inv.getStackInSlot(nextSlot);
/*  91 */       assert targetItem != null;
/*  92 */       assert targetItem.getItem() instanceof IPlantable;
/*  93 */       IPlantable targetPlantable = (IPlantable)targetItem.getItem();
/*     */       
/*  95 */       return PlantingLogic.targetedSuitableFarmland(world, x, y, z, direction, targetPlantable);
/*     */     } 
/*  97 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void plant(EntityPlayer player, IInventory inv, World world, int startX, int startY, int startZ, int width, float playerRotation) {
/* 108 */     int startCornerX, startCornerZ, j, i, rowZ, rowX, intFacing = MathHelper.floor_double((playerRotation * 4.0F / 360.0F) + 0.5D) & 0x3;
/* 109 */     ForgeDirection[] directions = { ForgeDirection.SOUTH, ForgeDirection.WEST, ForgeDirection.NORTH, ForgeDirection.EAST };
/* 110 */     ForgeDirection direction = directions[intFacing];
/*     */     
/* 112 */     switch (direction) {
/*     */       case NORTH:
/* 114 */         startCornerX = startX - (width - 1) / 2;
/* 115 */         startCornerZ = startZ;
/*     */         
/* 117 */         for (j = startCornerZ; j > startCornerZ - width; j--) {
/* 118 */           for (int columnX = startCornerX; columnX < startCornerX + width; columnX++) {
/* 119 */             plantSeedInPlace(inv, world, columnX, startY, j, direction);
/*     */           }
/*     */         } 
/*     */         break;
/*     */       case EAST:
/* 124 */         startCornerX = startX;
/* 125 */         startCornerZ = startZ - (width - 1) / 2;
/*     */         
/* 127 */         for (i = startCornerX; i < startCornerX + width; i++) {
/* 128 */           for (int columnZ = startCornerZ; columnZ < startCornerZ + width; columnZ++) {
/* 129 */             plantSeedInPlace(inv, world, i, startY, columnZ, direction);
/*     */           }
/*     */         } 
/*     */         break;
/*     */       case SOUTH:
/* 134 */         startCornerX = startX + (width - 1) / 2;
/* 135 */         startCornerZ = startZ;
/*     */         
/* 137 */         for (rowZ = startCornerZ; rowZ < startCornerZ + width; rowZ++) {
/* 138 */           for (int columnX = startCornerX; columnX > startCornerX - width; columnX--) {
/* 139 */             plantSeedInPlace(inv, world, columnX, startY, rowZ, direction);
/*     */           }
/*     */         } 
/*     */         break;
/*     */       case WEST:
/* 144 */         startCornerX = startX;
/* 145 */         startCornerZ = startZ + (width - 1) / 2;
/*     */         
/* 147 */         for (rowX = startCornerX; rowX > startCornerX - width; rowX--) {
/* 148 */           for (int columnZ = startCornerZ; columnZ > startCornerZ - width; columnZ--)
/* 149 */             plantSeedInPlace(inv, world, rowX, startY, columnZ, direction); 
/*     */         } 
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean plantSeedInPlace(IInventory inv, World world, int x, int y, int z, ForgeDirection direction) {
/* 156 */     int slot = PlantingLogic.getSeedsSlot(inv, getFirstSlot(inv));
/* 157 */     if (slot < 0) {
/* 158 */       return false;
/*     */     }
/* 160 */     boolean success = PlantingLogic.placeSeed(inv, world, x, y, z, slot, direction);
/* 161 */     if (success) {
/* 162 */       inv.decrStackSize(slot, 1);
/*     */     }
/*     */     
/* 165 */     return success;
/*     */   }
/*     */   
/*     */   public int getInvSlots() {
/* 169 */     return this.invSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\Planter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */