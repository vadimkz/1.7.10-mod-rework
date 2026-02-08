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
/*    */ public class ItemBlockEssenceBrick2
/*    */   extends ItemBlock
/*    */ {
/* 14 */   private static final String[] SUBNAMES = new String[] { "coal", "earth", "emerald", "fire", "gold", "lapis", "obsidian", "redstone" };
/*    */   
/*    */   public ItemBlockEssenceBrick2(Block block) {
/* 17 */     super(block);
/* 18 */     func_77627_a(true);
/*    */   }
/*    */   
/*    */   public String func_77667_c(ItemStack par1ItemStack) {
/* 22 */     int i = MathHelper.func_76125_a(par1ItemStack.func_77960_j(), 0, 7);
/* 23 */     return func_77658_a() + "." + SUBNAMES[i];
/*    */   }
/*    */ 
/*    */   
/*    */   public String func_77653_i(ItemStack stack) {
/* 28 */     switch (stack.func_77960_j()) {
/*    */       case 0:
/* 30 */         return EnumChatFormatting.DARK_GRAY + super.func_77653_i(stack);
/* 31 */       case 1: return EnumChatFormatting.WHITE + super.func_77653_i(stack);
/* 32 */       case 2: return EnumChatFormatting.GREEN + super.func_77653_i(stack);
/* 33 */       case 3: return EnumChatFormatting.GOLD + super.func_77653_i(stack);
/* 34 */       case 4: return EnumChatFormatting.YELLOW + super.func_77653_i(stack);
/* 35 */       case 5: return EnumChatFormatting.AQUA + super.func_77653_i(stack);
/* 36 */       case 6: return EnumChatFormatting.LIGHT_PURPLE + super.func_77653_i(stack);
/* 37 */       case 7: return EnumChatFormatting.RED + super.func_77653_i(stack);
/*    */     } 
/* 39 */     return EnumChatFormatting.GRAY + super.func_77653_i(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   public int func_77647_b(int meta) {
/* 44 */     return meta;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\itemblock\ItemBlockEssenceBrick2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */