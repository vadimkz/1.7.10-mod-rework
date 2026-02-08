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
/*  26 */     func_77637_a(MagicalCrops.tabMagical);
/*  27 */     func_77848_i();
/*  28 */     func_77656_e(0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void func_77849_c(ItemStack stack, World world, EntityPlayer player) {
/*  34 */     if (!world.field_72995_K) {
/*     */       
/*  36 */       int duration = 0;
/*     */ 
/*     */       
/*  39 */       PotionEffect potion = player.func_70660_b(Potion.field_76428_l);
/*  40 */       if (potion != null)
/*  41 */         duration = potion.func_76459_b(); 
/*  42 */       player.func_70690_d(new PotionEffect(Potion.field_76428_l.field_76415_H, duration + 12000, 0));
/*     */       
/*  44 */       potion = player.func_70660_b(Potion.field_76426_n);
/*  45 */       if (potion != null)
/*  46 */         duration = potion.func_76459_b(); 
/*  47 */       player.func_70690_d(new PotionEffect(Potion.field_76426_n.field_76415_H, duration + 12000, 0));
/*     */       
/*  49 */       potion = player.func_70660_b(Potion.field_76444_x);
/*  50 */       if (potion != null)
/*  51 */         duration = potion.func_76459_b(); 
/*  52 */       player.func_70690_d(new PotionEffect(Potion.field_76444_x.field_76415_H, duration + 12000, 4));
/*     */       
/*  54 */       potion = player.func_70660_b(Potion.field_76429_m);
/*  55 */       if (potion != null)
/*  56 */         duration = potion.func_76459_b(); 
/*  57 */       player.func_70690_d(new PotionEffect(Potion.field_76429_m.field_76415_H, duration + 12000, 1));
/*     */       
/*  59 */       potion = player.func_70660_b(Potion.field_76422_e);
/*  60 */       if (potion != null)
/*  61 */         duration = potion.func_76459_b(); 
/*  62 */       player.func_70690_d(new PotionEffect(Potion.field_76422_e.field_76415_H, duration + 12000, 0));
/*     */       
/*  64 */       potion = player.func_70660_b(Potion.field_76420_g);
/*  65 */       if (potion != null)
/*  66 */         duration = potion.func_76459_b(); 
/*  67 */       player.func_70690_d(new PotionEffect(Potion.field_76420_g.field_76415_H, duration + 12000, 0));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int func_77626_a(ItemStack par1ItemStack) {
/*  74 */     return 32;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumAction func_77661_b(ItemStack par1ItemStack) {
/*  80 */     return EnumAction.eat;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_77636_d(ItemStack is) {
/*  86 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_77653_i(ItemStack stack) {
/*  91 */     return EnumChatFormatting.GREEN + super.func_77653_i(stack);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/*  97 */     par3List.add(EnumChatFormatting.YELLOW + "Hold shift for info");
/*  98 */     if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/*  99 */       par3List.add("Regeneration I - +10:00");
/* 100 */       par3List.add("Fire Resistance - +10:00");
/* 101 */       par3List.add("Absorption V - +10:00");
/* 102 */       par3List.add("Damage Resistance II - +10:00");
/* 103 */       par3List.add("Haste - +10:00");
/* 104 */       par3List.add("Strength - +10:00");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemUltimateEmeraldApple.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */