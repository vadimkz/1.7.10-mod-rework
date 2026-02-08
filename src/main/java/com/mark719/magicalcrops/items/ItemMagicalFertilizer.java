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
/* 24 */     setMaxStackSize(64);
/* 25 */     setCreativeTab(MagicalCrops.tabMagical);
/* 26 */     setTextureName("magicalcrops:MagicalFertilizer");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
/* 31 */     int I1 = world.getBlockMetadata(x, y, z);
/*    */     
/* 33 */     if (I1 < 7) {
/* 34 */       if (!player.canPlayerEdit(x, y, z, side, stack))
/*    */       {
/* 36 */         return false;
/*    */       }
/*    */ 
/*    */       
/* 40 */       if (applyBonemeal(stack, world, x, y, z, player)) {
/*    */         
/* 42 */         if (!world.isRemote)
/*    */         {
/* 44 */           world.playAuxSFX(2005, x, y, z, 0);
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
/*    */   public static boolean func_96604_a(ItemStack stack, WorldServer world, int x, int y, int z) {
/* 56 */     return applyBonemeal(stack, (World)world, x, y, z, (EntityPlayer)FakePlayerFactory.getMinecraft(world));
/*    */   }
/*    */   
/*    */   public static boolean applyBonemeal(ItemStack stack, World world, int x, int y, int z, EntityPlayer player) {
/* 60 */     Block block = world.getBlock(x, y, z);
/*    */     
/* 62 */     BonemealEvent event = new BonemealEvent(player, world, block, x, y, z);
/* 63 */     if (MinecraftForge.EVENT_BUS.post((Event)event))
/*    */     {
/* 65 */       return false;
/*    */     }
/*    */     
/* 68 */     if (event.getResult() == Event.Result.ALLOW) {
/*    */       
/* 70 */       if (!world.isRemote)
/*    */       {
/* 72 */         stack.stackSize--;
/*    */       }
/* 74 */       return true;
/*    */     } 
/*    */     
/* 77 */     if (block instanceof com.mark719.magicalcrops.blocks.BlockMagicalCrops) {
/*    */       
/* 79 */       if (!world.isRemote) {
/*    */         
/* 81 */         int I = world.getBlockMetadata(x, y, z) + MathHelper.getRandomIntegerInRange(world.rand, 7, 7);
/*    */         
/* 83 */         if (I > 7)
/*    */         {
/* 85 */           I = 7;
/*    */         }
/*    */         
/* 88 */         world.setBlockMetadataWithNotify(x, y, z, I, 2);
/* 89 */         stack.stackSize--;
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
