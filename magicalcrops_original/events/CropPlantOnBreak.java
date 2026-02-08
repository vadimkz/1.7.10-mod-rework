/*    */ package com.mark719.magicalcrops.events;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import net.minecraftforge.event.world.BlockEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CropPlantOnBreak
/*    */ {
/*    */   @SubscribeEvent
/*    */   public void onCropPlantBreak(BlockEvent.HarvestDropsEvent event) {
/* 15 */     if (event.harvester != null && event.harvester instanceof net.minecraft.entity.player.EntityPlayer)
/*    */     {
/* 17 */       if (event.block instanceof com.mark719.magicalcrops.blocks.BlockMagicalCrops && event.blockMetadata == 7)
/*    */       {
/* 19 */         event.world.setBlock(event.x, event.y, event.z, event.block, 1, 2);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\events\CropPlantOnBreak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
