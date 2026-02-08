/*    */ package com.mark719.magicalcrops.items.essence;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.init.Blocks;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NatureEssence
/*    */   extends Item
/*    */ {
/*    */   public NatureEssence() {
/* 23 */     func_77625_d(64);
/* 24 */     func_77637_a(MagicalCrops.tabMagical);
/* 25 */     func_111206_d("magicalcrops:cropessence_nature");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean func_77648_a(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
/* 31 */     if (p_77648_7_ != 1)
/*    */     {
/* 33 */       return false;
/*    */     }
/* 35 */     if (p_77648_2_.func_82247_a(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) && p_77648_3_.func_147439_a(p_77648_4_, p_77648_5_, p_77648_6_) == Blocks.field_150346_d) {
/*    */ 
/*    */       
/* 38 */       if (!p_77648_3_.field_72995_K) {
/* 39 */         p_77648_3_.func_147465_d(p_77648_4_, p_77648_5_, p_77648_6_, (Block)Blocks.field_150349_c, 0, 1);
/* 40 */         p_77648_3_.func_72926_e(2005, p_77648_4_, p_77648_5_ + 1, p_77648_6_, 0);
/* 41 */         p_77648_1_.field_77994_a--;
/* 42 */         return true;
/*    */       } 
/*    */     } else {
/* 45 */       return false;
/*    */     } 
/*    */ 
/*    */     
/* 49 */     return false;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 54 */     par3List.add(EnumChatFormatting.YELLOW + "Right Click: " + EnumChatFormatting.WHITE + "Turns dirt into grass");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\essence\NatureEssence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */