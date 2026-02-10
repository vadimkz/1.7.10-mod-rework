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
/*    */   public ZivicioAxe(int itemId, Item.ToolMaterial toolMaterial) {
/* 24 */     super(toolMaterial);
/* 25 */     this.setMaxStackSize(1);
/* 26 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 31 */     return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
/* 36 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase entity) {
/* 41 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 46 */     tooltip.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "Unbreakable");
/* 47 */     tooltip.add(EnumChatFormatting.GREEN + "Gem Socket:");
/* 48 */     tooltip.add(EnumChatFormatting.ITALIC + "- Empty");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\tools\ZivicioAxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */