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
/* 21 */       ItemStack getBoots = player.func_82169_q(0);
/* 22 */       ItemStack getLegs = player.func_82169_q(1);
/* 23 */       ItemStack getChest = player.func_82169_q(2);
/* 24 */       ItemStack getHelm = player.func_82169_q(3);
/*    */       
/* 26 */       if (event.source.equals(DamageSource.field_76371_c) || event.source.equals(DamageSource.field_76372_a) || event.source.equals(DamageSource.field_76370_b))
/*    */       {
/* 28 */         if (getBoots != null && getLegs != null && getChest != null && getHelm != null)
/*    */         {
/* 30 */           if (getBoots.func_77973_b() instanceof com.mark719.magicalcrops.items.armour.ItemZivicioArmour && getLegs.func_77973_b() instanceof com.mark719.magicalcrops.items.armour.ItemZivicioArmour && getChest.func_77973_b() == Armour.ZivicioArmourChestplateFire && getHelm.func_77973_b() instanceof com.mark719.magicalcrops.items.armour.ItemZivicioArmour) {
/*    */ 
/*    */             
/* 33 */             event.setCanceled(true);
/* 34 */             player.func_70066_B();
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