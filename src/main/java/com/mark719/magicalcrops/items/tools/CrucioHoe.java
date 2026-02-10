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
/*    */   public CrucioHoe(int itemId, Item.ToolMaterial toolMaterial) {
/* 26 */     super(toolMaterial);
/* 27 */     this.setMaxStackSize(1);
/* 28 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 33 */     return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 38 */     if (ConfigMain.EXTRA_HOE) {
/* 39 */       tooltip.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
/* 40 */       if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/* 41 */         tooltip.add(EnumChatFormatting.ITALIC + "- 2 Extra essence from Minicio Crops");
/*    */       }
/*    */     } 
/* 44 */     tooltip.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (getMaxDurability() - getDamage(stack)) + "/" + getMaxDurability());
/* 45 */     tooltip.add("");
/* 46 */     tooltip.add(EnumChatFormatting.BLUE + "+1 Attack Damage");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\tools\CrucioHoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */