/*    */ package com.mark719.magicalcrops.seedbags;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.IPlantable;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ public class PlantingLogic
/*    */ {
/*    */   public static int getSeedsSlot(IInventory inv, int initialSlot) {
/* 15 */     if (initialSlot < 0) {
/* 16 */       return -1;
/*    */     }
/*    */     
/* 19 */     ItemStack initialTarget = inv.getStackInSlot(initialSlot);
/*    */     
/* 21 */     if (initialTarget != null && initialTarget.stackSize > 0) {
/* 22 */       return initialSlot;
/*    */     }
/*    */     
/* 25 */     int slot = 0;
/*    */     
/* 27 */     while (inv.getStackInSlot(slot) == null || inv.getStackInSlot(slot).getItem() == null || !(inv.getStackInSlot(slot).getItem() instanceof IPlantable) || ((inv.getStackInSlot(slot)).stackSize <= 0 && slot < inv.getSizeInventory())) {
/* 28 */       slot++;
/* 29 */       if (slot >= inv.getSizeInventory()) {
/* 30 */         return -1;
/*    */       }
/*    */     } 
/*    */     
/* 34 */     return slot;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean placeSeed(IInventory inv, World world, int x, int y, int z, int invPos, ForgeDirection direction) {
/* 39 */     ItemStack currentItem = inv.getStackInSlot(invPos);
/* 40 */     if (currentItem == null || !(currentItem.getItem() instanceof IPlantable)) {
/* 41 */       return false;
/*    */     }
/*    */     
/* 44 */     IPlantable plantable = (IPlantable)currentItem.getItem();
/*    */     
/* 46 */     Block targetBlock = world.getBlock(x, y, z);
/* 47 */     if (targetBlock == null || !targetBlock.canSustainPlant((IBlockAccess)world, x, y, z, direction, plantable)) {
/* 48 */       return false;
/*    */     }
/*    */     
/* 51 */     if (!world.isAirBlock(x, y + 1, z)) {
/* 52 */       return false;
/*    */     }
/*    */     
/* 55 */     Block plantablePlant = plantable.getPlant((IBlockAccess)world, x, y + 1, z);
/* 56 */     int plantMeta = plantable.getPlantMetadata((IBlockAccess)world, x, y + 1, z);
/*    */     
/* 58 */     world.setBlock(x, y + 1, z, plantablePlant, plantMeta, 3);
/*    */     
/* 60 */     return true;
/*    */   }
/*    */   
/*    */   public static boolean targetedSuitableFarmland(World world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
/* 64 */     Block block = world.getBlock(x, y, z);
/*    */     
/* 66 */     return (block != null && block.canSustainPlant((IBlockAccess)world, x, y, z, direction, plantable));
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\PlantingLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */