/*    */ package com.mark719.magicalcrops.items.tools;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemAxe;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CrucioAxe
/*    */   extends ItemAxe
/*    */ {
/*    */   public CrucioAxe(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/* 21 */     super(par2EnumToolMaterial);
/* 22 */     this.setMaxStackSize(1);
/* 23 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 28 */     return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 33 */     par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (getMaxDurability() - getDamage(par1ItemStack)) + "/" + getMaxDurability());
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\tools\CrucioAxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */