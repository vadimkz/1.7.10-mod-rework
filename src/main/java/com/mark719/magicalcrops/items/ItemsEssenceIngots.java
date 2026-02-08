/*    */ package com.mark719.magicalcrops.items;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraft.util.MathHelper;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemsEssenceIngots
/*    */   extends Item
/*    */ {
/* 36 */   public static final String[] dyeColorNames = new String[] { "accio", "crucio", "imperio", "zivicio" };
/*    */   
/* 38 */   public static final String[] dyeIcons = new String[] { "ingot_accio", "ingot_crucio", "ingot_imperio", "ingot_zivicio" };
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon[] dyeIconArray;
/*    */   
/*    */   private static final String __OBFID = "CL_00000022";
/*    */   
/*    */   public ItemsEssenceIngots() {
/* 46 */     setHasSubtypes(true);
/* 47 */     setMaxDurability(0);
/* 48 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 53 */     switch (stack.getMetadata()) {
/*    */       case 0:
/* 55 */         return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
/* 56 */       case 1: return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
/* 57 */       case 2: return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
/* 58 */       case 3: return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
/*    */     } 
/* 60 */     return EnumChatFormatting.GRAY + super.getItemStackDisplayName(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public IIcon getIconFromDamage(int par1) {
/* 66 */     int j = MathHelper.clamp_int(par1, 0, 3);
/* 67 */     return this.dyeIconArray[j];
/*    */   }
/*    */ 
/*    */   
/*    */   public String getUnlocalizedName(ItemStack par1ItemStack) {
/* 72 */     int i = MathHelper.clamp_int(par1ItemStack.getMetadata(), 0, 3);
/* 73 */     return getUnlocalizedName() + "." + dyeColorNames[i];
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List<ItemStack> p_150895_3_) {
/* 79 */     for (int i = 0; i < 4; i++)
/*    */     {
/* 81 */       p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerIcons(IIconRegister par1IconRegister) {
/* 88 */     this.dyeIconArray = new IIcon[dyeIcons.length];
/*    */     
/* 90 */     for (int i = 0; i < dyeIcons.length; i++)
/*    */     {
/* 92 */       this.dyeIconArray[i] = par1IconRegister.registerIcon("magicalcrops:" + dyeIcons[i]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemsEssenceIngots.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */