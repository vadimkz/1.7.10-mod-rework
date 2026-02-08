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
/*  32 */     setUnlocalizedName(name);
/*  33 */     setCreativeTab(MagicalCrops.tabMagical);
/*     */     
/*  35 */     if (armorType == 0) {
/*  36 */       setTextureName("magicalcrops:armour_zivicio_helmet");
/*     */     }
/*  38 */     else if (armorType == 1) {
/*  39 */       setTextureName("magicalcrops:armour_zivicio_chestplate");
/*     */     }
/*  41 */     else if (armorType == 2) {
/*  42 */       setTextureName("magicalcrops:armour_zivicio_leggings");
/*     */     }
/*  44 */     else if (armorType == 3) {
/*  45 */       setTextureName("magicalcrops:armour_zivicio_boots");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String getArmorTexture(ItemStack itemToRepair, Entity entity, int slot, String type) {
/*  51 */     if (this.armorType == 0 || this.armorType == 1 || this.armorType == 3) {
/*  52 */       return "magicalcrops:textures/armour/zivicio_armour_1.png";
/*     */     }
/*  54 */     if (this.armorType == 2) {
/*  55 */       return "magicalcrops:textures/armour/zivicio_armour_2.png";
/*     */     }
/*  57 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem) {
/*  63 */     return (repairItem.isItemEqual(new ItemStack(Essence.ZivicioEssence)) || super.getIsRepairable(itemToRepair, repairItem));
/*     */   }
/*     */ 
/*     */   
/*     */   public String getItemStackDisplayName(ItemStack stack) {
/*  68 */     return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/*  73 */     tooltip.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for info:");
/*  74 */     if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/*  75 */       tooltip.add(EnumChatFormatting.ITALIC + "- 96% Damage Reduction");
/*  76 */       if (ConfigMain.ARMOUR_FLIGHT) {
/*  77 */         tooltip.add(EnumChatFormatting.ITALIC + "- Negates fall damage");
/*  78 */         tooltip.add(EnumChatFormatting.ITALIC + "- Flight");
/*     */       } 
/*  80 */     }  tooltip.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (getMaxDurability() - getDamage(stack)) + "/" + getMaxDurability());
/*  81 */     tooltip.add(EnumChatFormatting.GREEN + "Gem Socket:");
/*  82 */     if (stack.getItem() == Armour.ZivicioArmourHelmet || stack.getItem() == Armour.ZivicioArmourChestplate || stack.getItem() == Armour.ZivicioArmourLeggings || stack.getItem() == Armour.ZivicioArmourBoots)
/*     */     {
/*  84 */       tooltip.add(EnumChatFormatting.ITALIC + "- Empty");
/*     */     }
/*     */     
/*  87 */     if (stack.getItem() == Armour.ZivicioArmourHelmetFeed) {
/*  88 */       tooltip.add(EnumChatFormatting.ITALIC + "- Saturation");
/*     */     }
/*  90 */     if (stack.getItem() == Armour.ZivicioArmourHelmetNight) {
/*  91 */       tooltip.add(EnumChatFormatting.ITALIC + "- Night Vision");
/*     */     }
/*  93 */     if (stack.getItem() == Armour.ZivicioArmourHelmetWater) {
/*  94 */       tooltip.add(EnumChatFormatting.ITALIC + "- Water Breathing");
/*     */     }
/*     */ 
/*     */     
/*  98 */     if (stack.getItem() == Armour.ZivicioArmourChestplateFire) {
/*  99 */       tooltip.add(EnumChatFormatting.ITALIC + "- Fire Protection");
/*     */     }
/* 101 */     if (stack.getItem() == Armour.ZivicioArmourChestplateWither) {
/* 102 */       tooltip.add(EnumChatFormatting.ITALIC + "- Wither Protection");
/*     */     }
/* 104 */     if (stack.getItem() == Armour.ZivicioArmourChestplatePoison) {
/* 105 */       tooltip.add(EnumChatFormatting.ITALIC + "- Poison Protection");
/*     */     }
/*     */ 
/*     */     
/* 109 */     if (stack.getItem() == Armour.ZivicioArmourLeggingsWeak) {
/* 110 */       tooltip.add(EnumChatFormatting.ITALIC + "- Weakness Protection");
/*     */     }
/* 112 */     if (stack.getItem() == Armour.ZivicioArmourLeggingsConfusion) {
/* 113 */       tooltip.add(EnumChatFormatting.ITALIC + "- Confusion Protection");
/*     */     }
/* 115 */     if (stack.getItem() == Armour.ZivicioArmourLeggingsBlind) {
/* 116 */       tooltip.add(EnumChatFormatting.ITALIC + "- Blindness Protection");
/*     */     }
/*     */ 
/*     */     
/* 120 */     if (stack.getItem() == Armour.ZivicioArmourBootsSpeed) {
/* 121 */       tooltip.add(EnumChatFormatting.ITALIC + "- Speed Increase");
/*     */     }
/* 123 */     if (stack.getItem() == Armour.ZivicioArmourBootsStep) {
/* 124 */       tooltip.add(EnumChatFormatting.ITALIC + "- Step Assist");
/*     */     }
/* 126 */     if (stack.getItem() == Armour.ZivicioArmourBootsJump) {
/* 127 */       tooltip.add(EnumChatFormatting.ITALIC + "- Jump Boost");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
/* 134 */     ItemStack getBoots = player.getCurrentArmor(0);
/* 135 */     ItemStack getLegs = player.getCurrentArmor(1);
/* 136 */     ItemStack getChest = player.getCurrentArmor(2);
/* 137 */     ItemStack getHelm = player.getCurrentArmor(3);
/*     */     
/* 139 */     if (getBoots != null && getLegs != null && getChest != null && getHelm != null) {
/*     */ 
/*     */       
/* 142 */       if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() == Armour.ZivicioArmourHelmetFeed)
/*     */       {
/*     */         
/* 145 */         if (player.getFoodStats().getFoodLevel() <= 19 && player.getFoodStats().getFoodLevel() != 20)
/*     */         {
/* 147 */           player.getFoodStats().addStats(1, 1.0F);
/*     */         }
/*     */       }
/*     */       
/* 151 */       if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() == Armour.ZivicioArmourHelmetWater)
/*     */       {
/*     */         
/* 154 */         if (player.isInWater())
/*     */         {
/* 156 */           player.setAir(300);
/*     */         }
/*     */       }
/*     */       
/* 160 */       if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() == Armour.ZivicioArmourHelmetNight)
/*     */       {
/*     */         
/* 163 */         player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0, true));
/*     */       }
/*     */ 
/*     */       
/* 167 */       if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() == Armour.ZivicioArmourChestplateWither && getHelm.getItem() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 170 */         if (player.isPotionActive(Potion.wither.id))
/*     */         {
/* 172 */           player.removePotionEffect(Potion.wither.id);
/*     */         }
/*     */       }
/*     */       
/* 176 */       if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() == Armour.ZivicioArmourChestplatePoison && getHelm.getItem() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 179 */         if (player.isPotionActive(Potion.poison.id))
/*     */         {
/* 181 */           player.removePotionEffect(Potion.poison.id);
/*     */         }
/*     */       }
/*     */ 
/*     */       
/* 186 */       if (getBoots.getItem() == Armour.ZivicioArmourBootsSpeed && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 189 */         if (!player.isInWater() && !player.capabilities.isFlying) {
/* 190 */           player.moveEntityWithHeading(player.moveStrafing * 0.4F, player.moveForward * 0.4F);
/* 191 */         } else if (!player.isInWater() && player.isAirBorne) {
/* 192 */           player.moveEntityWithHeading(player.moveStrafing * 0.1F, player.moveForward * 0.1F);
/*     */         } 
/*     */       }
/*     */       
/* 196 */       if (getBoots.getItem() == Armour.ZivicioArmourBootsJump && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 199 */         if (!player.isSneaking()) {
/* 200 */           player.addPotionEffect(new PotionEffect(Potion.jump.id, 15, 2, true));
/*     */         } else {
/*     */           return;
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 207 */       if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() == Armour.ZivicioArmourLeggingsBlind && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 210 */         if (player.isPotionActive(Potion.blindness.id))
/*     */         {
/* 212 */           player.removePotionEffect(Potion.blindness.id);
/*     */         }
/*     */       }
/*     */       
/* 216 */       if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() == Armour.ZivicioArmourLeggingsWeak && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 219 */         if (player.isPotionActive(Potion.weakness.id))
/*     */         {
/* 221 */           player.removePotionEffect(Potion.weakness.id);
/*     */         }
/*     */       }
/*     */       
/* 225 */       if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() == Armour.ZivicioArmourLeggingsConfusion && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 228 */         if (player.isPotionActive(Potion.confusion.id))
/*     */         {
/* 230 */           player.removePotionEffect(Potion.confusion.id);
/*     */         }
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 236 */     if (ConfigMain.ARMOUR_FLIGHT)
/*     */     {
/* 238 */       if (getBoots != null && getLegs != null && getChest != null && getHelm != null) {
/*     */         
/* 240 */         if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour)
/*     */         {
/*     */           
/* 243 */           player.capabilities.allowFlying = true;
/*     */         }
/*     */       }
/* 246 */       else if (player.capabilities.isCreativeMode != true) {
/*     */         
/* 248 */         player.capabilities.allowFlying = false;
/* 249 */         player.capabilities.isFlying = false;
/* 250 */         player.sendPlayerAbilities();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 255 */     if (getBoots != null && getLegs != null && getChest != null && getHelm != null) {
/*     */       
/* 257 */       if (getBoots.getItem() == Armour.ZivicioArmourBootsStep && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour)
/*     */       {
/*     */         
/* 260 */         player.stepHeight = 1.0F;
/*     */       }
/*     */     } else {
/* 263 */       player.stepHeight = 0.5F;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\armour\ItemZivicioArmour.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
