/*    */ package com.mark719.magicalcrops.events;
/*    */ 
/*    */ import com.mark719.magicalcrops.config.ConfigMain;
/*    */ import com.mark719.magicalcrops.handlers.Essence;
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import java.util.Random;
/*    */ import net.minecraft.entity.item.EntityItem;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.event.entity.living.LivingDropsEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MobDropEvent
/*    */ {
/*    */   public static Random random;
/*    */   public static int dropped;
/*    */   
/*    */   @SubscribeEvent
/*    */   public void essenceMobDrops(LivingDropsEvent event) {
/* 28 */     double posX = event.entityLiving.posX;
/* 29 */     double posY = event.entityLiving.posY;
/* 30 */     double posZ = event.entityLiving.posZ;
/*    */     
/* 32 */     ItemStack minicioEssence = new ItemStack(Essence.MinicioEssence, 1);
/* 33 */     ItemStack dragonZivicioEssence = new ItemStack(Essence.ZivicioEssence, ConfigMain.DRGAON_ESS_DROP_AMOUNT);
/* 34 */     ItemStack witherZivicioEssence = new ItemStack(Essence.ZivicioEssence, ConfigMain.WITHER_ESS_DROP_AMOUNT);
/*    */     
/* 36 */     random = new Random();
/* 37 */     dropped = random.nextInt(100);
/*    */     
/* 39 */     if ((event.entityLiving instanceof net.minecraft.entity.boss.EntityDragon & ConfigMain.DRAGON_ESS_DROP) != 0) {
/* 40 */       event.drops.add(new EntityItem(event.entityLiving.worldObj, posX, posY, posZ, dragonZivicioEssence));
/*    */     }
/* 42 */     if ((event.entityLiving instanceof net.minecraft.entity.passive.EntityAnimal & ConfigMain.PASSIVE_ESS_DROP) != 0 && 
/* 43 */       dropped < ConfigMain.PASSIVE_DROP_CHANCE) {
/* 44 */       event.drops.add(new EntityItem(event.entityLiving.worldObj, posX, posY, posZ, minicioEssence));
/*    */     }
/*    */     
/* 47 */     if ((event.entityLiving instanceof net.minecraft.entity.monster.EntityMob & ConfigMain.HOSTILE_ESS_DROP) != 0 && 
/* 48 */       dropped < ConfigMain.HOSTILE_DROP_CHANCE) {
/* 49 */       event.drops.add(new EntityItem(event.entityLiving.worldObj, posX, posY, posZ, minicioEssence));
/*    */     }
/*    */     
/* 52 */     if ((event.entityLiving instanceof net.minecraft.entity.boss.EntityWither & ConfigMain.WITHER_ESS_DROP) != 0)
/* 53 */       event.drops.add(new EntityItem(event.entityLiving.worldObj, posX, posY, posZ, witherZivicioEssence)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\events\MobDropEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */