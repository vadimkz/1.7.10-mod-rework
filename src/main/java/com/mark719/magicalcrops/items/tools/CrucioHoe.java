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
/*    */ public class CrucioHoe
/*    */   extends ItemHoe
/*    */ {
/*    */   public CrucioHoe(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/* 26 */     super(par2EnumToolMaterial);
/* 27 */     this.field_77777_bU = 1;
/* 28 */     func_77637_a(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_77653_i(ItemStack stack) {
/* 33 */     return EnumChatFormatting.YELLOW + super.func_77653_i(stack);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 38 */     if (ConfigMain.EXTRA_HOE) {
/* 39 */       par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
/* 40 */       if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/* 41 */         par3List.add(EnumChatFormatting.ITALIC + "- 2 Extra essence from Minicio Crops");
/*    */       }
/*    */     } 
/* 44 */     par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (func_77612_l() - getDamage(par1ItemStack)) + "/" + func_77612_l());
/* 45 */     par3List.add("");
/* 46 */     par3List.add(EnumChatFormatting.BLUE + "+1 Attack Damage");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\tools\CrucioHoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */