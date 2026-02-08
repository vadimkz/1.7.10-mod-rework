/*    */ package com.mark719.magicalcrops.items.tools;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.config.ConfigMain;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemHoe;
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
/*    */ public class ImperioHoe
/*    */   extends ItemHoe
/*    */ {
/*    */   public ImperioHoe(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/* 26 */     super(par2EnumToolMaterial);
/* 27 */     this.maxStackSize = 1;
/* 28 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 33 */     return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 38 */     if (ConfigMain.EXTRA_HOE) {
/* 39 */       par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
/* 40 */       if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/* 41 */         par3List.add(EnumChatFormatting.ITALIC + "- 4 Extra essence from Minicio Crops");
/*    */       }
/*    */     } 
/* 44 */     par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (getMaxDurability() - getDamage(par1ItemStack)) + "/" + getMaxDurability());
/* 45 */     par3List.add("");
/* 46 */     par3List.add(EnumChatFormatting.BLUE + "+1 Attack Damage");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\tools\ImperioHoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */