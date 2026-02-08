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
/* 36 */   public static final String[] field_150923_a = new String[] { "accio", "crucio", "imperio", "zivicio" };
/*    */   
/* 38 */   public static final String[] field_150921_b = new String[] { "ingot_accio", "ingot_crucio", "ingot_imperio", "ingot_zivicio" };
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon[] field_150920_d;
/*    */   
/*    */   private static final String __OBFID = "CL_00000022";
/*    */   
/*    */   public ItemsEssenceIngots() {
/* 46 */     func_77627_a(true);
/* 47 */     func_77656_e(0);
/* 48 */     func_77637_a(MagicalCrops.tabMagical);
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_77653_i(ItemStack stack) {
/* 53 */     switch (stack.func_77960_j()) {
/*    */       case 0:
/* 55 */         return EnumChatFormatting.GOLD + super.func_77653_i(stack);
/* 56 */       case 1: return EnumChatFormatting.YELLOW + super.func_77653_i(stack);
/* 57 */       case 2: return EnumChatFormatting.AQUA + super.func_77653_i(stack);
/* 58 */       case 3: return EnumChatFormatting.LIGHT_PURPLE + super.func_77653_i(stack);
/*    */     } 
/* 60 */     return EnumChatFormatting.GRAY + super.func_77653_i(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public IIcon func_77617_a(int par1) {
/* 66 */     int j = MathHelper.func_76125_a(par1, 0, 3);
/* 67 */     return this.field_150920_d[j];
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_77667_c(ItemStack par1ItemStack) {
/* 72 */     int i = MathHelper.func_76125_a(par1ItemStack.func_77960_j(), 0, 3);
/* 73 */     return func_77658_a() + "." + field_150923_a[i];
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_150895_a(Item p_150895_1_, CreativeTabs p_150895_2_, List<ItemStack> p_150895_3_) {
/* 79 */     for (int i = 0; i < 4; i++)
/*    */     {
/* 81 */       p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_94581_a(IIconRegister par1IconRegister) {
/* 88 */     this.field_150920_d = new IIcon[field_150921_b.length];
/*    */     
/* 90 */     for (int i = 0; i < field_150921_b.length; i++)
/*    */     {
/* 92 */       this.field_150920_d[i] = par1IconRegister.func_94245_a("magicalcrops:" + field_150921_b[i]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemsEssenceIngots.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */