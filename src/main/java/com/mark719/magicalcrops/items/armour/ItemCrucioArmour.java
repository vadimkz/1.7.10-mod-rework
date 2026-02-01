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
/*    */ public class ItemCrucioArmour
/*    */   extends ItemArmor
/*    */ {
/*    */   public ItemCrucioArmour(ItemArmor.ArmorMaterial material, int armorType, String name) {
/* 27 */     super(material, 0, armorType);
/* 28 */     setUnlocalizedName(name);
/* 29 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */     
/* 31 */     if (armorType == 0) {
/* 32 */       setTextureName("magicalcrops:armour_crucio_helmet");
/*    */     }
/* 34 */     else if (armorType == 1) {
/* 35 */       setTextureName("magicalcrops:armour_crucio_chestplate");
/*    */     }
/* 37 */     else if (armorType == 2) {
/* 38 */       setTextureName("magicalcrops:armour_crucio_leggings");
/*    */     }
/* 40 */     else if (armorType == 3) {
/* 41 */       setTextureName("magicalcrops:armour_crucio_boots");
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
/* 47 */     if (stack.getItem() == Armour.CrucioArmourHelmet || stack.getItem() == Armour.CrucioArmourChestplate || stack.getItem() == Armour.CrucioArmourBoots) {
/* 48 */       return "magicalcrops:textures/armour/crucio_armour_1.png";
/*    */     }
/* 50 */     if (stack.getItem() == Armour.CrucioArmourLeggings) {
/* 51 */       return "magicalcrops:textures/armour/crucio_armour_2.png";
/*    */     }
/*    */     
/* 54 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
/* 60 */     return (par2ItemStack.isItemEqual(new ItemStack(Essence.CrucioEssence)) || super.getIsRepairable(par1ItemStack, par2ItemStack));
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 65 */     return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 70 */     par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for info:");
/* 71 */     if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/* 72 */       par3List.add(EnumChatFormatting.ITALIC + "- 88% Damage Reduction");
/*    */     }
/* 74 */     par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (getMaxDamage() - getDamage(par1ItemStack)) + "/" + getMaxDamage());
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\armour\ItemCrucioArmour.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */