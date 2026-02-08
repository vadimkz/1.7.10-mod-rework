/*     */ package com.mark719.magicalcrops.items.tools;
/*     */ 
/*     */ import com.mark719.magicalcrops.MagicalCrops;
/*     */ import com.mark719.magicalcrops.config.ConfigMain;
/*     */ import cpw.mods.fml.common.eventhandler.Event;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemHoe;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.entity.player.UseHoeEvent;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ZivicioHoe
/*     */   extends ItemHoe
/*     */ {
/*     */   public ZivicioHoe(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/*  29 */     super(par2EnumToolMaterial);
/*  30 */     this.field_77777_bU = 1;
/*  31 */     func_77637_a(MagicalCrops.tabMagical);
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_77653_i(ItemStack stack) {
/*  36 */     return EnumChatFormatting.LIGHT_PURPLE + super.func_77653_i(stack);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_77644_a(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
/*  41 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_150894_a(ItemStack p_150894_1_, World p_150894_2_, Block p_150894_3_, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase p_150894_7_) {
/*  46 */     return true;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/*  51 */     if (ConfigMain.EXTRA_HOE) {
/*  52 */       par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
/*  53 */       if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/*  54 */         par3List.add(EnumChatFormatting.ITALIC + "- 8 Extra essence from Minicio Crops");
/*     */       }
/*     */     } 
/*  57 */     par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "Unbreakable");
/*  58 */     par3List.add(EnumChatFormatting.GREEN + "Gem Socket:");
/*  59 */     par3List.add(EnumChatFormatting.ITALIC + "- Empty");
/*  60 */     par3List.add("");
/*  61 */     par3List.add(EnumChatFormatting.BLUE + "+1 Attack Damage");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_77648_a(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
/*  67 */     if (!p_77648_2_.func_82247_a(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_))
/*     */     {
/*  69 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  73 */     UseHoeEvent event = new UseHoeEvent(p_77648_2_, p_77648_1_, p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_);
/*  74 */     if (MinecraftForge.EVENT_BUS.post((Event)event))
/*     */     {
/*  76 */       return false;
/*     */     }
/*     */     
/*  79 */     if (event.getResult() == Event.Result.ALLOW) {
/*     */       
/*  81 */       p_77648_1_.func_77972_a(0, (EntityLivingBase)p_77648_2_);
/*  82 */       return true;
/*     */     } 
/*     */     
/*  85 */     Block block = p_77648_3_.func_147439_a(p_77648_4_, p_77648_5_, p_77648_6_);
/*     */     
/*  87 */     if (p_77648_7_ != 0 && p_77648_3_.func_147439_a(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir((IBlockAccess)p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == Blocks.field_150349_c || block == Blocks.field_150346_d)) {
/*     */       
/*  89 */       Block block1 = Blocks.field_150458_ak;
/*  90 */       p_77648_3_.func_72908_a((p_77648_4_ + 0.5F), (p_77648_5_ + 0.5F), (p_77648_6_ + 0.5F), block1.field_149762_H.func_150498_e(), (block1.field_149762_H.func_150497_c() + 1.0F) / 2.0F, block1.field_149762_H.func_150494_d() * 0.8F);
/*     */       
/*  92 */       if (p_77648_3_.field_72995_K)
/*     */       {
/*  94 */         return true;
/*     */       }
/*     */ 
/*     */       
/*  98 */       p_77648_3_.func_147449_b(p_77648_4_, p_77648_5_, p_77648_6_, block1);
/*  99 */       p_77648_1_.func_77972_a(0, (EntityLivingBase)p_77648_2_);
/* 100 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 105 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\tools\ZivicioHoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */