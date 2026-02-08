/*    */ package com.mark719.magicalcrops.events;
/*    */ 
/*    */ import com.mark719.magicalcrops.handlers.Essence;
/*    */ import com.mark719.magicalcrops.handlers.MBlocks;
/*    */ import com.mark719.magicalcrops.handlers.Tools;
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.event.world.BlockEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MinicioOreBreak
/*    */ {
/*    */   @SubscribeEvent
/*    */   public void onOreBreak(BlockEvent.HarvestDropsEvent event) {
/* 20 */     if (event.harvester != null)
/*    */     {
/* 22 */       if (event.block == MBlocks.MinicioOre && event.harvester.getCurrentEquippedItem() != null) {
/*    */         
/* 24 */         if (event.harvester.getCurrentEquippedItem().getItem() == Tools.AccioPickaxe)
/*    */         {
/* 26 */           event.drops.add(new ItemStack(Essence.MinicioEssence, 2));
/*    */         }
/* 28 */         if (event.harvester.getCurrentEquippedItem().getItem() == Tools.CrucioPickaxe)
/*    */         {
/* 30 */           event.drops.add(new ItemStack(Essence.MinicioEssence, 4));
/*    */         }
/* 32 */         if (event.harvester.getCurrentEquippedItem().getItem() == Tools.ImperioPickaxe)
/*    */         {
/* 34 */           event.drops.add(new ItemStack(Essence.MinicioEssence, 8));
/*    */         }
/* 36 */         if (event.harvester.getCurrentEquippedItem().getItem() == Tools.ZivicioPickaxe)
/*    */         {
/* 38 */           event.drops.add(new ItemStack(Essence.MinicioEssence, 16));
/*    */         }
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\events\MinicioOreBreak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */