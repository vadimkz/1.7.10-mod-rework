/*     */ package com.mark719.magicalcrops.items;
/*     */ 
/*     */ import com.mark719.magicalcrops.MagicalCrops;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.EnumAction;
/*     */ import net.minecraft.item.ItemFood;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.potion.Potion;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraft.world.World;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ItemUltimateEmeraldApple
/*     */   extends ItemFood
/*     */ {
/*     */   public ItemUltimateEmeraldApple(int i, float f, boolean b) {
/*  25 */     super(i, f, b);
/*  26 */     setCreativeTab(MagicalCrops.tabMagical);
/*  27 */     setAlwaysEdible();
/*  28 */     setMaxDurability(0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
/*  34 */     if (!world.isRemote) {
/*     */       
/*  36 */       int duration = 0;
/*     */ 
/*     */       
/*  39 */       PotionEffect potion = player.getActivePotionEffect(Potion.regeneration);
/*  40 */       if (potion != null)
/*  41 */         duration = potion.getDuration(); 
/*  42 */       player.addPotionEffect(new PotionEffect(Potion.regeneration.id, duration + 12000, 0));
/*     */       
/*  44 */       potion = player.getActivePotionEffect(Potion.fireResistance);
/*  45 */       if (potion != null)
/*  46 */         duration = potion.getDuration(); 
/*  47 */       player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, duration + 12000, 0));
/*     */       
/*  49 */       potion = player.getActivePotionEffect(Potion.absorption);
/*  50 */       if (potion != null)
/*  51 */         duration = potion.getDuration(); 
/*  52 */       player.addPotionEffect(new PotionEffect(Potion.absorption.id, duration + 12000, 4));
/*     */       
/*  54 */       potion = player.getActivePotionEffect(Potion.resistance);
/*  55 */       if (potion != null)
/*  56 */         duration = potion.getDuration(); 
/*  57 */       player.addPotionEffect(new PotionEffect(Potion.resistance.id, duration + 12000, 1));
/*     */       
/*  59 */       potion = player.getActivePotionEffect(Potion.digSpeed);
/*  60 */       if (potion != null)
/*  61 */         duration = potion.getDuration(); 
/*  62 */       player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, duration + 12000, 0));
/*     */       
/*  64 */       potion = player.getActivePotionEffect(Potion.damageBoost);
/*  65 */       if (potion != null)
/*  66 */         duration = potion.getDuration(); 
/*  67 */       player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, duration + 12000, 0));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxItemUseDuration(ItemStack stack) {
/*  74 */     return 32;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumAction getItemUseAction(ItemStack stack) {
/*  80 */     return EnumAction.eat;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasEffect(ItemStack is) {
/*  86 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getItemStackDisplayName(ItemStack stack) {
/*  91 */     return EnumChatFormatting.GREEN + super.getItemStackDisplayName(stack);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/*  97 */     tooltip.add(EnumChatFormatting.YELLOW + "Hold shift for info");
/*  98 */     if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/*  99 */       tooltip.add("Regeneration I - +10:00");
/* 100 */       tooltip.add("Fire Resistance - +10:00");
/* 101 */       tooltip.add("Absorption V - +10:00");
/* 102 */       tooltip.add("Damage Resistance II - +10:00");
/* 103 */       tooltip.add("Haste - +10:00");
/* 104 */       tooltip.add("Strength - +10:00");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemUltimateEmeraldApple.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */