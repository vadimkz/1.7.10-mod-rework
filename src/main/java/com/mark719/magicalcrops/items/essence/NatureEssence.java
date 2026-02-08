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
/* 23 */     setMaxStackSize(64);
/* 24 */     setCreativeTab(MagicalCrops.tabMagical);
/* 25 */     setTextureName("magicalcrops:cropessence_nature");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
/* 31 */     if (side != 1)
/*    */     {
/* 33 */       return false;
/*    */     }
/* 35 */     if (player.canPlayerEdit(x, y, z, side, stack) && world.getBlock(x, y, z) == Blocks.dirt) {
/*    */ 
/*    */       
/* 38 */       if (!world.isRemote) {
/* 39 */         world.setBlock(x, y, z, (Block)Blocks.grass, 0, 1);
/* 40 */         world.playAuxSFX(2005, x, y + 1, z, 0);
/* 41 */         stack.stackSize--;
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
/*    */   public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 54 */     tooltip.add(EnumChatFormatting.YELLOW + "Right Click: " + EnumChatFormatting.WHITE + "Turns dirt into grass");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\essence\NatureEssence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */