/*    */ package com.mark719.magicalcrops.items.tools;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.config.ConfigMain;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemPickaxe;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ import net.minecraft.world.World;
/*    */ import org.lwjgl.input.Keyboard;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ZivicioPickaxe
/*    */   extends ItemPickaxe
/*    */ {
/*    */   public ZivicioPickaxe(int itemId, Item.ToolMaterial toolMaterial) {
/* 26 */     super(toolMaterial);
/* 27 */     this.setMaxStackSize(1);
/* 28 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 33 */     return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
/* 38 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase entity) {
/* 43 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 48 */     if (ConfigMain.EXTRA_PICKAXE) {
/* 49 */       tooltip.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
/* 50 */       if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/* 51 */         tooltip.add(EnumChatFormatting.ITALIC + "- 16 Extra essence from Minicio Ores");
/*    */       }
/*    */     } 
/* 54 */     tooltip.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "Unbreakable");
/* 55 */     tooltip.add(EnumChatFormatting.GREEN + "Gem Socket:");
/* 56 */     tooltip.add(EnumChatFormatting.ITALIC + "- Empty");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\tools\ZivicioPickaxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */