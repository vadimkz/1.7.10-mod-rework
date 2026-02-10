/*    */ package com.mark719.magicalcrops.items.tools;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemSpade;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AccioShovel
/*    */   extends ItemSpade
/*    */ {
/*    */   public AccioShovel(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/* 22 */     super(par2EnumToolMaterial);
/* 23 */     this.setMaxStackSize(1);
/* 24 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 29 */     return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 34 */     par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (getMaxDurability() - getDamage(par1ItemStack)) + "/" + getMaxDurability());
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\tools\AccioShovel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */