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
/*    */ public class ItemAccioArmour
/*    */   extends ItemArmor
/*    */ {
/*    */   public ItemAccioArmour(ItemArmor.ArmorMaterial material, int armorType, String name) {
/* 26 */     super(material, 0, armorType);
/* 27 */     setUnlocalizedName(name);
/* 28 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */     
/* 30 */     if (armorType == 0) {
/* 31 */       setTextureName("magicalcrops:armour_accio_helmet");
/*    */     }
/* 33 */     else if (armorType == 1) {
/* 34 */       setTextureName("magicalcrops:armour_accio_chestplate");
/*    */     }
/* 36 */     else if (armorType == 2) {
/* 37 */       setTextureName("magicalcrops:armour_accio_leggings");
/*    */     }
/* 39 */     else if (armorType == 3) {
/* 40 */       setTextureName("magicalcrops:armour_accio_boots");
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String getArmorTexture(ItemStack itemToRepair, Entity entity, int slot, String type) {
/* 46 */     if (itemToRepair.getItem() == Armour.AccioArmourHelmet || itemToRepair.getItem() == Armour.AccioArmourChestplate || itemToRepair.getItem() == Armour.AccioArmourBoots) {
/* 47 */       return "magicalcrops:textures/armour/accio_armour_1.png";
/*    */     }
/* 49 */     if (itemToRepair.getItem() == Armour.AccioArmourLeggings) {
/* 50 */       return "magicalcrops:textures/armour/accio_armour_2.png";
/*    */     }
/*    */     
/* 53 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem) {
/* 59 */     return (repairItem.isItemEqual(new ItemStack(Essence.AccioEssence)) || super.getIsRepairable(itemToRepair, repairItem));
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 64 */     return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 69 */     tooltip.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for info:");
/* 70 */     if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/* 71 */       tooltip.add(EnumChatFormatting.ITALIC + "- 84% Damage Reduction");
/*    */     }
/* 73 */     tooltip.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (getMaxDurability() - getDamage(stack)) + "/" + getMaxDurability());
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\armour\ItemAccioArmour.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
