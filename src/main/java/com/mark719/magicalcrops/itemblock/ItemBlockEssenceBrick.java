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
/*    */ public class ItemBlockEssenceBrick
/*    */   extends ItemBlock
/*    */ {
/* 14 */   private static final String[] SUBNAMES = new String[] { "coal", "earth", "emerald", "fire", "gold", "lapis", "obsidian", "redstone" };
/*    */   
/*    */   public ItemBlockEssenceBrick(Block block) {
/* 17 */     super(block);
/* 18 */     setHasSubtypes(true);
/*    */   }
/*    */   
/*    */   public String getUnlocalizedName(ItemStack par1ItemStack) {
/* 22 */     int i = MathHelper.clamp_int(par1ItemStack.getMetadata(), 0, 7);
/* 23 */     return getUnlocalizedName() + "." + SUBNAMES[i];
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 28 */     int meta = stack.getMetadata();
/* 29 */     if (meta == 0) {
/* 30 */       return EnumChatFormatting.DARK_GRAY + super.getItemStackDisplayName(stack);
/* 31 */     } else if (meta == 1) {
/* 32 */       return EnumChatFormatting.WHITE + super.getItemStackDisplayName(stack);
/* 33 */     } else if (meta == 2) {
/* 34 */       return EnumChatFormatting.GREEN + super.getItemStackDisplayName(stack);
/* 35 */     } else if (meta == 3) {
/* 36 */       return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
/* 37 */     } else if (meta == 4) {
/* 38 */       return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
/* 39 */     } else if (meta == 5) {
/* 40 */       return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
/* 41 */     } else if (meta == 6) {
/* 42 */       return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
/* 43 */     } else if (meta == 7) {
/* 44 */       return EnumChatFormatting.RED + super.getItemStackDisplayName(stack);
/*    */     }
/* 46 */     return EnumChatFormatting.GRAY + super.getItemStackDisplayName(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getMetadata(int meta) {
/* 44 */     return meta;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\itemblock\ItemBlockEssenceBrick.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
