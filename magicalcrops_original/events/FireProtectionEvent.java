/*    */ package com.mark719.magicalcrops.events;
/*    */ 
/*    */ import com.mark719.magicalcrops.handlers.Armour;
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.DamageSource;
/*    */ import net.minecraftforge.event.entity.living.LivingAttackEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FireProtectionEvent
/*    */ {
/*    */   @SubscribeEvent
/*    */   public void onBurnDamage(LivingAttackEvent event) {
/* 17 */     if (event.entity instanceof EntityPlayer) {
/*    */       
/* 19 */       EntityPlayer player = (EntityPlayer)event.entity;
/*    */       
/* 21 */       ItemStack getBoots = player.getCurrentArmor(0);
/* 22 */       ItemStack getLegs = player.getCurrentArmor(1);
/* 23 */       ItemStack getChest = player.getCurrentArmor(2);
/* 24 */       ItemStack getHelm = player.getCurrentArmor(3);
/*    */       
/* 26 */       if (event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire) || event.source.equals(DamageSource.onFire))
/*    */       {
/* 28 */         if (getBoots != null && getLegs != null && getChest != null && getHelm != null)
/*    */         {
/* 30 */           if (getBoots.getItem() instanceof com.mark719.magicalcrops.items.armour.ItemZivicioArmour && getLegs.getItem() instanceof com.mark719.magicalcrops.items.armour.ItemZivicioArmour && getChest.getItem() == Armour.ZivicioArmourChestplateFire && getHelm.getItem() instanceof com.mark719.magicalcrops.items.armour.ItemZivicioArmour) {
/*    */ 
/*    */             
/* 33 */             event.setCanceled(true);
/* 34 */             player.extinguish();
/*    */           } else {
/*    */             
/* 37 */             event.setCanceled(false);
/*    */           } 
/*    */         }
/*    */       }
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\events\FireProtectionEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */