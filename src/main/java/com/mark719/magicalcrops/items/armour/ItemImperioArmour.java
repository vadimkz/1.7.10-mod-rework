/*    */ package com.mark719.magicalcrops.items.armour;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.handlers.Armour;
/*    */ import com.mark719.magicalcrops.handlers.Essence;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemArmor;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ import org.lwjgl.input.Keyboard;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemImperioArmour
/*    */   extends ItemArmor
/*    */ {
/*    */   public ItemImperioArmour(ItemArmor.ArmorMaterial material, int armorType, String name) {
/* 27 */     super(material, 0, armorType);
/* 28 */     func_77655_b(name);
/* 29 */     func_77637_a(MagicalCrops.tabMagical);
/*    */     
/* 31 */     if (armorType == 0) {
/* 32 */       func_111206_d("magicalcrops:armour_imperio_helmet");
/*    */     }
/* 34 */     else if (armorType == 1) {
/* 35 */       func_111206_d("magicalcrops:armour_imperio_chestplate");
/*    */     }
/* 37 */     else if (armorType == 2) {
/* 38 */       func_111206_d("magicalcrops:armour_imperio_leggings");
/*    */     }
/* 40 */     else if (armorType == 3) {
/* 41 */       func_111206_d("magicalcrops:armour_imperio_boots");
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
/* 48 */     if (stack.func_77973_b() == Armour.ImperioArmourHelmet || stack.func_77973_b() == Armour.ImperioArmourChestplate || stack.func_77973_b() == Armour.ImperioArmourBoots)
/*    */     {
/* 50 */       return "magicalcrops:textures/armour/imperio_armour_1.png";
/*    */     }
/*    */     
/* 53 */     if (stack.func_77973_b() == Armour.ImperioArmourLeggings)
/*    */     {
/* 55 */       return "magicalcrops:textures/armour/imperio_armour_2.png";
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 60 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_82789_a(ItemStack par1ItemStack, ItemStack par2ItemStack) {
/* 66 */     return (par2ItemStack.func_77969_a(new ItemStack(Essence.ImperioEssence)) || super.func_82789_a(par1ItemStack, par2ItemStack));
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_77653_i(ItemStack stack) {
/* 71 */     return EnumChatFormatting.AQUA + super.func_77653_i(stack);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 76 */     par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for info:");
/* 77 */     if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/* 78 */       par3List.add(EnumChatFormatting.ITALIC + "- 92% Damage Reduction");
/*    */     }
/* 80 */     par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (func_77612_l() - getDamage(par1ItemStack)) + "/" + func_77612_l());
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\armour\ItemImperioArmour.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */