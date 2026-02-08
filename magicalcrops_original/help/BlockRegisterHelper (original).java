/*    */ package com.mark719.magicalcrops.help;
/*    */ 
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ import net.minecraft.block.Block;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockRegisterHelper
/*    */ {
/*    */   public static void registerBlock(Block block) {
/* 11 */     GameRegistry.registerBlock(block, "magicalcrops_" + block.func_149739_a().substring(5));
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\help\BlockRegisterHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */