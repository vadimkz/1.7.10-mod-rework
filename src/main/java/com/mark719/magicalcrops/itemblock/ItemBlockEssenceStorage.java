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
/* 18 */     setHasSubtypes(true);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getMetadata(int meta) {
/* 23 */     return meta;
/*    */   }
/*    */   
/*    */   public String getUnlocalizedName(ItemStack par1ItemStack) {
/* 27 */     int i = MathHelper.clamp_int(par1ItemStack.getMetadata(), 0, 5);
/* 28 */     return getUnlocalizedName() + "." + SUBNAMES[i];
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 33 */     switch (stack.getMetadata()) {
/*    */       case 0:
/* 35 */         return EnumChatFormatting.GREEN + super.getItemStackDisplayName(stack);
/* 36 */       case 1: return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
/* 37 */       case 2: return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
/* 38 */       case 3: return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
/* 39 */       case 4: return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
/* 40 */       case 5: return EnumChatFormatting.DARK_GRAY + super.getItemStackDisplayName(stack);
/*    */     } 
/* 42 */     return EnumChatFormatting.GRAY + super.getItemStackDisplayName(stack);
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\itemblock\ItemBlockEssenceStorage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */