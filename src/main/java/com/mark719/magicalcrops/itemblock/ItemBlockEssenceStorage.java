/*    */ package com.mark719.magicalcrops.itemblock;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.item.ItemBlock;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ import net.minecraft.util.MathHelper;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemBlockEssenceStorage
/*    */   extends ItemBlock
/*    */ {
/* 14 */   private static final String[] SUBNAMES = new String[] { "minicio", "accio", "crucio", "imperio", "zivicio", "ultimate" };
/*    */   
/*    */   public ItemBlockEssenceStorage(Block block) {
/* 17 */     super(block);
/* 18 */     func_77627_a(true);
/*    */   }
/*    */ 
/*    */   
/*    */   public int func_77647_b(int meta) {
/* 23 */     return meta;
/*    */   }
/*    */   
/*    */   public String func_77667_c(ItemStack par1ItemStack) {
/* 27 */     int i = MathHelper.func_76125_a(par1ItemStack.func_77960_j(), 0, 5);
/* 28 */     return func_77658_a() + "." + SUBNAMES[i];
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_77653_i(ItemStack stack) {
/* 33 */     switch (stack.func_77960_j()) {
/*    */       case 0:
/* 35 */         return EnumChatFormatting.GREEN + super.func_77653_i(stack);
/* 36 */       case 1: return EnumChatFormatting.GOLD + super.func_77653_i(stack);
/* 37 */       case 2: return EnumChatFormatting.YELLOW + super.func_77653_i(stack);
/* 38 */       case 3: return EnumChatFormatting.AQUA + super.func_77653_i(stack);
/* 39 */       case 4: return EnumChatFormatting.LIGHT_PURPLE + super.func_77653_i(stack);
/* 40 */       case 5: return EnumChatFormatting.DARK_GRAY + super.func_77653_i(stack);
/*    */     } 
/* 42 */     return EnumChatFormatting.GRAY + super.func_77653_i(stack);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\itemblock\ItemBlockEssenceStorage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */