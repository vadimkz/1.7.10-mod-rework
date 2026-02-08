/*    */ package com.mark719.magicalcrops.items;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import cpw.mods.fml.common.eventhandler.Event;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.MathHelper;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraft.world.WorldServer;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.common.util.FakePlayerFactory;
/*    */ import net.minecraftforge.event.entity.player.BonemealEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemMagicalFertilizer
/*    */   extends Item
/*    */ {
/*    */   public ItemMagicalFertilizer() {
/* 24 */     func_77625_d(64);
/* 25 */     func_77637_a(MagicalCrops.tabMagical);
/* 26 */     func_111206_d("magicalcrops:MagicalFertilizer");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean func_77648_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
/* 31 */     int I1 = par3World.func_72805_g(par4, par5, par6);
/*    */     
/* 33 */     if (I1 < 7) {
/* 34 */       if (!par2EntityPlayer.func_82247_a(par4, par5, par6, par7, par1ItemStack))
/*    */       {
/* 36 */         return false;
/*    */       }
/*    */ 
/*    */       
/* 40 */       if (applyBonemeal(par1ItemStack, par3World, par4, par5, par6, par2EntityPlayer)) {
/*    */         
/* 42 */         if (!par3World.field_72995_K)
/*    */         {
/* 44 */           par3World.func_72926_e(2005, par4, par5, par6, 0);
/*    */         }
/*    */         
/* 47 */         return true;
/*    */       } 
/*    */     } 
/*    */     
/* 51 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean func_96604_a(ItemStack par0ItemStack, WorldServer par1World, int par2, int par3, int par4) {
/* 56 */     return applyBonemeal(par0ItemStack, (World)par1World, par2, par3, par4, (EntityPlayer)FakePlayerFactory.getMinecraft(par1World));
/*    */   }
/*    */   
/*    */   public static boolean applyBonemeal(ItemStack par0ItemStack, World par1World, int par2, int par3, int par4, EntityPlayer player) {
/* 60 */     Block block = par1World.func_147439_a(par2, par3, par4);
/*    */     
/* 62 */     BonemealEvent event = new BonemealEvent(player, par1World, block, par2, par3, par4);
/* 63 */     if (MinecraftForge.EVENT_BUS.post((Event)event))
/*    */     {
/* 65 */       return false;
/*    */     }
/*    */     
/* 68 */     if (event.getResult() == Event.Result.ALLOW) {
/*    */       
/* 70 */       if (!par1World.field_72995_K)
/*    */       {
/* 72 */         par0ItemStack.field_77994_a--;
/*    */       }
/* 74 */       return true;
/*    */     } 
/*    */     
/* 77 */     if (block instanceof com.mark719.magicalcrops.blocks.BlockMagicalCrops) {
/*    */       
/* 79 */       if (!par1World.field_72995_K) {
/*    */         
/* 81 */         int I = par1World.func_72805_g(par2, par3, par4) + MathHelper.func_76136_a(par1World.field_73012_v, 7, 7);
/*    */         
/* 83 */         if (I > 7)
/*    */         {
/* 85 */           I = 7;
/*    */         }
/*    */         
/* 88 */         par1World.func_72921_c(par2, par3, par4, I, 2);
/* 89 */         par0ItemStack.field_77994_a--;
/*    */       } 
/*    */ 
/*    */       
/* 93 */       return true;
/*    */     } 
/* 95 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemMagicalFertilizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */