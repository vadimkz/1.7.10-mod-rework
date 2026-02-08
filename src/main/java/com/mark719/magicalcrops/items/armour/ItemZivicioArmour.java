/*     */ package com.mark719.magicalcrops.items.armour;
/*     */ 
/*     */ import com.mark719.magicalcrops.MagicalCrops;
/*     */ import com.mark719.magicalcrops.config.ConfigMain;
/*     */ import com.mark719.magicalcrops.handlers.Armour;
/*     */ import com.mark719.magicalcrops.handlers.Essence;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemArmor;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ItemZivicioArmour
/*     */   extends ItemArmor
/*     */ {
/*     */   public ItemZivicioArmour(ItemArmor.ArmorMaterial material, int armorType, String name) {
/*  31 */     super(material, 0, armorType);
/*  32 */     func_77655_b(name);
/*  33 */     func_77637_a(MagicalCrops.tabMagical);
/*     */     
/*  35 */     if (armorType == 0) {
/*  36 */       func_111206_d("magicalcrops:armour_zivicio_helmet");
/*     */     }
/*  38 */     else if (armorType == 1) {
/*  39 */       func_111206_d("magicalcrops:armour_zivicio_chestplate");
/*     */     }
/*  41 */     else if (armorType == 2) {
/*  42 */       func_111206_d("magicalcrops:armour_zivicio_leggings");
/*     */     }
/*  44 */     else if (armorType == 3) {
/*  45 */       func_111206_d("magicalcrops:armour_zivicio_boots");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
/*  51 */     if (this.field_77881_a == 0 || this.field_77881_a == 1 || this.field_77881_a == 3) {
/*  52 */       return "magicalcrops:textures/armour/zivicio_armour_1.png";
/*     */     }
/*  54 */     if (this.field_77881_a == 2) {
/*  55 */       return "magicalcrops:textures/armour/zivicio_armour_2.png";
/*     */     }
/*  57 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_82789_a(ItemStack par1ItemStack, ItemStack par2ItemStack) {
/*  63 */     return (par2ItemStack.func_77969_a(new ItemStack(Essence.ZivicioEssence)) || super.func_82789_a(par1ItemStack, par2ItemStack));
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_77653_i(ItemStack stack) {
/*  68 */     return EnumChatFormatting.LIGHT_PURPLE + super.func_77653_i(stack);
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/*  73 */     par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for info:");
/*  74 */     if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/*  75 */       par3List.add(EnumChatFormatting.ITALIC + "- 96% Damage Reduction");
/*  76 */       if (ConfigMain.ARMOUR_FLIGHT) {
/*  77 */         par3List.add(EnumChatFormatting.ITALIC + "- Negates fall damage");
/*  78 */         par3List.add(EnumChatFormatting.ITALIC + "- Flight");
/*     */       } 
/*  80 */     }  par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (func_77612_l() - getDamage(par1ItemStack)) + "/" + func_77612_l());
/*  81 */     par3List.add(EnumChatFormatting.GREEN + "Gem Socket:");
/*  82 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourHelmet || par1ItemStack.func_77973_b() == Armour.ZivicioArmourChestplate || par1ItemStack.func_77973_b() == Armour.ZivicioArmourLeggings || par1ItemStack.func_77973_b() == Armour.ZivicioArmourBoots)
/*     */     {
/*  84 */       par3List.add(EnumChatFormatting.ITALIC + "- Empty");
/*     */     }
/*     */     
/*  87 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourHelmetFeed) {
/*  88 */       par3List.add(EnumChatFormatting.ITALIC + "- Saturation");
/*     */     }
/*  90 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourHelmetNight) {
/*  91 */       par3List.add(EnumChatFormatting.ITALIC + "- Night Vision");
/*     */     }
/*  93 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourHelmetWater) {
/*  94 */       par3List.add(EnumChatFormatting.ITALIC + "- Water Breathing");
/*     */     }
/*     */ 
/*     */     
/*  98 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourChestplateFire) {
/*  99 */       par3List.add(EnumChatFormatting.ITALIC + "- Fire Protection");
/*     */     }
/* 101 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourChestplateWither) {
/* 102 */       par3List.add(EnumChatFormatting.ITALIC + "- Wither Protection");
/*     */     }
/* 104 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourChestplatePoison) {
/* 105 */       par3List.add(EnumChatFormatting.ITALIC + "- Poison Protection");
/*     */     }
/*     */ 
/*     */     
/* 109 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourLeggingsWeak) {
/* 110 */       par3List.add(EnumChatFormatting.ITALIC + "- Weakness Protection");
/*     */     }
/* 112 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourLeggingsConfusion) {
/* 113 */       par3List.add(EnumChatFormatting.ITALIC + "- Confusion Protection");
/*     */     }
/* 115 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourLeggingsBlind) {
/* 116 */       par3List.add(EnumChatFormatting.ITALIC + "- Blindness Protection");
/*     */     }
/*     */ 
/*     */     
/* 120 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourBootsSpeed) {
/* 121 */       par3List.add(EnumChatFormatting.ITALIC + "- Speed Increase");
/*     */     }
/* 123 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourBootsStep) {
/* 124 */       par3List.add(EnumChatFormatting.ITALIC + "- Step Assist");
/*     */     }
/* 126 */     if (par1ItemStack.func_77973_b() == Armour.ZivicioArmourBootsJump) {
/* 127 */       par3List.add(EnumChatFormatting.ITALIC + "- Jump Boost");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
/* 134 */     ItemStack getBoots = player.func_82169_q(0);
/* 135 */     ItemStack getLegs = player.func_82169_q(1);
/* 136 */     ItemStack getChest = player.func_82169_q(2);
/* 137 */     ItemStack getHelm = player.func_82169_q(3);
/*     */     
/* 139 */     if (getBoots != null && getLegs != null && getChest != null && getHelm != null) {
/*     */ 
/*     */       
/* 142 */       if (getBoots.func_77973_b() instanceof ItemZivicioArmour && getLegs.func_77973_b() instanceof ItemZivicioArmour && getChest.func_77973_b() instanceof ItemZivicioArmour && getHelm.func_77973_b() == Armour.ZivicioArmourHelmetFeed)
/*     */       {
/*     */         
/* 145 */         if (player.func_71024_bL().func_75116_a() <= 19 && player.func_71024_bL().func_75116_a() != 20)
/*     */         {
/* 147 */           player.func_71024_bL().func_75122_a(1, 1.0F);
/*     */         }
/*     */       }
/*     */       
/* 151 */       if (getBoots.func_77973_b() instanceof ItemZivicioArmour && getLegs.func_77973_b() instanceof ItemZivicioArmour && getChest.func_77973_b() instanceof ItemZivicioArmour && getHelm.func_77973_b() == Armour.ZivicioArmourHelmetWater)
/*     */       {
/*     */         
/* 154 */         if (player.func_70090_H())
/*     */         {
/* 156 */           player.func_70050_g(300);
/*     */         }
/*     */       }
/*     */       
/* 160 */       if (getBoots.func_77973_b() instanceof ItemZivicioArmour && getLegs.func_77973_b() instanceof ItemZivicioArmour && getChest.func_77973_b() instanceof ItemZivicioArmour && getHelm.func_77973_b() == Armour.ZivicioArmourHelmetNight)
/*     */       {
/*     */         
/* 163 */         player.func_70690_d(new PotionEffect(Potion.field_76439_r.field_76415_H, 300, 0, true));
/*     */       }
/*     */ 
/*     */       
/* 167 */       if (getBoots.func_77973_b() instanceof ItemZivicioArmour && getLegs.func_77973_b() instanceof ItemZivicioArmour && getChest.func_77973_b() == Armour.ZivicioArmourChestplateWither && getHelm.func_77973_b() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 170 */         if (player.func_82165_m(Potion.field_82731_v.field_76415_H))
/*     */         {
/* 172 */           player.func_82170_o(Potion.field_82731_v.field_76415_H);
/*     */         }
/*     */       }
/*     */       
/* 176 */       if (getBoots.func_77973_b() instanceof ItemZivicioArmour && getLegs.func_77973_b() instanceof ItemZivicioArmour && getChest.func_77973_b() == Armour.ZivicioArmourChestplatePoison && getHelm.func_77973_b() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 179 */         if (player.func_82165_m(Potion.field_76436_u.field_76415_H))
/*     */         {
/* 181 */           player.func_82170_o(Potion.field_76436_u.field_76415_H);
/*     */         }
/*     */       }
/*     */ 
/*     */       
/* 186 */       if (getBoots.func_77973_b() == Armour.ZivicioArmourBootsSpeed && getLegs.func_77973_b() instanceof ItemZivicioArmour && getChest.func_77973_b() instanceof ItemZivicioArmour && getHelm.func_77973_b() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 189 */         if (!player.func_70090_H() && !player.field_71075_bZ.field_75100_b) {
/* 190 */           player.func_70612_e(player.field_70702_br * 0.4F, player.field_70701_bs * 0.4F);
/* 191 */         } else if (!player.func_70090_H() && player.field_70160_al) {
/* 192 */           player.func_70612_e(player.field_70702_br * 0.1F, player.field_70701_bs * 0.1F);
/*     */         } 
/*     */       }
/*     */       
/* 196 */       if (getBoots.func_77973_b() == Armour.ZivicioArmourBootsJump && getLegs.func_77973_b() instanceof ItemZivicioArmour && getChest.func_77973_b() instanceof ItemZivicioArmour && getHelm.func_77973_b() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 199 */         if (!player.func_70093_af()) {
/* 200 */           player.func_70690_d(new PotionEffect(Potion.field_76430_j.field_76415_H, 15, 2, true));
/*     */         } else {
/*     */           return;
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 207 */       if (getBoots.func_77973_b() instanceof ItemZivicioArmour && getLegs.func_77973_b() == Armour.ZivicioArmourLeggingsBlind && getChest.func_77973_b() instanceof ItemZivicioArmour && getHelm.func_77973_b() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 210 */         if (player.func_82165_m(Potion.field_76440_q.field_76415_H))
/*     */         {
/* 212 */           player.func_82170_o(Potion.field_76440_q.field_76415_H);
/*     */         }
/*     */       }
/*     */       
/* 216 */       if (getBoots.func_77973_b() instanceof ItemZivicioArmour && getLegs.func_77973_b() == Armour.ZivicioArmourLeggingsWeak && getChest.func_77973_b() instanceof ItemZivicioArmour && getHelm.func_77973_b() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 219 */         if (player.func_82165_m(Potion.field_76437_t.field_76415_H))
/*     */         {
/* 221 */           player.func_82170_o(Potion.field_76437_t.field_76415_H);
/*     */         }
/*     */       }
/*     */       
/* 225 */       if (getBoots.func_77973_b() instanceof ItemZivicioArmour && getLegs.func_77973_b() == Armour.ZivicioArmourLeggingsConfusion && getChest.func_77973_b() instanceof ItemZivicioArmour && getHelm.func_77973_b() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 228 */         if (player.func_82165_m(Potion.field_76431_k.field_76415_H))
/*     */         {
/* 230 */           player.func_82170_o(Potion.field_76431_k.field_76415_H);
/*     */         }
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 236 */     if (ConfigMain.ARMOUR_FLIGHT)
/*     */     {
/* 238 */       if (getBoots != null && getLegs != null && getChest != null && getHelm != null) {
/*     */         
/* 240 */         if (getBoots.func_77973_b() instanceof ItemZivicioArmour && getLegs.func_77973_b() instanceof ItemZivicioArmour && getChest.func_77973_b() instanceof ItemZivicioArmour && getHelm.func_77973_b() instanceof ItemZivicioArmour)
/*     */         {
/*     */           
/* 243 */           player.field_71075_bZ.field_75101_c = true;
/*     */         }
/*     */       }
/* 246 */       else if (player.field_71075_bZ.field_75098_d != true) {
/*     */         
/* 248 */         player.field_71075_bZ.field_75101_c = false;
/* 249 */         player.field_71075_bZ.field_75100_b = false;
/* 250 */         player.func_71016_p();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 255 */     if (getBoots != null && getLegs != null && getChest != null && getHelm != null) {
/*     */       
/* 257 */       if (getBoots.func_77973_b() == Armour.ZivicioArmourBootsStep && getLegs.func_77973_b() instanceof ItemZivicioArmour && getChest.func_77973_b() instanceof ItemZivicioArmour && getHelm.func_77973_b() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 260 */         player.field_70138_W = 1.0F;
/*     */       }
/*     */     } else {
/* 263 */       player.field_70138_W = 0.5F;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\armour\ItemZivicioArmour.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */