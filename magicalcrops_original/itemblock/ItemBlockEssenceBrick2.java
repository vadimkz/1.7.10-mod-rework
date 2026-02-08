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
/* 28 */     switch (stack.getMetadata()) {
/*    */       case 0:
/* 30 */         return EnumChatFormatting.DARK_GRAY + super.getItemStackDisplayName(stack);
/* 31 */       case 1: return EnumChatFormatting.WHITE + super.getItemStackDisplayName(stack);
/* 32 */       case 2: return EnumChatFormatting.GREEN + super.getItemStackDisplayName(stack);
/* 33 */       case 3: return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
/* 34 */       case 4: return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
/* 35 */       case 5: return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
/* 36 */       case 6: return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
/* 37 */       case 7: return EnumChatFormatting.RED + super.getItemStackDisplayName(stack);
/*    */     } 
/* 39 */     return EnumChatFormatting.GRAY + super.getItemStackDisplayName(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getMetadata(int meta) {
/* 44 */     return meta;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\itemblock\ItemBlockEssenceBrick2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */