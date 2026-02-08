/*    */ package com.mark719.magicalcrops.items.tools;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemAxe;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ZivicioAxe
/*    */   extends ItemAxe
/*    */ {
/*    */   public ZivicioAxe(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/* 24 */     super(par2EnumToolMaterial);
/* 25 */     this.field_77777_bU = 1;
/* 26 */     func_77637_a(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_77653_i(ItemStack stack) {
/* 31 */     return EnumChatFormatting.LIGHT_PURPLE + super.func_77653_i(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_77644_a(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
/* 36 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_150894_a(ItemStack p_150894_1_, World p_150894_2_, Block p_150894_3_, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase p_150894_7_) {
/* 41 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 46 */     par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "Unbreakable");
/* 47 */     par3List.add(EnumChatFormatting.GREEN + "Gem Socket:");
/* 48 */     par3List.add(EnumChatFormatting.ITALIC + "- Empty");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\tools\ZivicioAxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */