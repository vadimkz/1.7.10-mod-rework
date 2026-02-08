/*     */ package com.mark719.magicalcrops.items;
/*     */ 
/*     */ import com.mark719.magicalcrops.MagicalCrops;
/*     */ import com.mark719.magicalcrops.handlers.MBlocks;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.EnumRarity;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ItemEssenceFertilizer
/*     */   extends Item
/*     */ {
/*  25 */   public static final String[] field_150923_a = new String[] { "accio", "crucio", "imperio", "zivicio" };
/*     */   
/*  27 */   public static final String[] field_150921_b = new String[] { "fertilizer_accio", "fertilizer_crucio", "fertilizer_imperio", "fertilizer_zivicio" };
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon[] field_150920_d;
/*     */   
/*     */   private static final String __OBFID = "CL_00000022";
/*     */   
/*     */   public ItemEssenceFertilizer() {
/*  35 */     func_77627_a(true);
/*  36 */     func_77656_e(0);
/*  37 */     func_77637_a(MagicalCrops.tabMagical);
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_77653_i(ItemStack stack) {
/*  42 */     switch (stack.func_77960_j()) {
/*     */       case 0:
/*  44 */         return EnumChatFormatting.GOLD + super.func_77653_i(stack);
/*  45 */       case 1: return EnumChatFormatting.YELLOW + super.func_77653_i(stack);
/*  46 */       case 2: return EnumChatFormatting.AQUA + super.func_77653_i(stack);
/*  47 */       case 3: return EnumChatFormatting.LIGHT_PURPLE + super.func_77653_i(stack);
/*     */     } 
/*  49 */     return EnumChatFormatting.GRAY + super.func_77653_i(stack);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_77617_a(int par1) {
/*  55 */     int j = MathHelper.func_76125_a(par1, 0, 3);
/*  56 */     return this.field_150920_d[j];
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_77667_c(ItemStack par1ItemStack) {
/*  61 */     int i = MathHelper.func_76125_a(par1ItemStack.func_77960_j(), 0, 3);
/*  62 */     return func_77658_a() + "." + field_150923_a[i];
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_150895_a(Item p_150895_1_, CreativeTabs p_150895_2_, List<ItemStack> p_150895_3_) {
/*  68 */     for (int i = 0; i < 4; i++)
/*     */     {
/*  70 */       p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
/*     */     }
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public EnumRarity func_77613_e(ItemStack par2) {
/*  76 */     switch (par2.func_77960_j()) {
/*     */       case 0:
/*  78 */         return EnumRarity.common;
/*  79 */       case 1: return EnumRarity.uncommon;
/*  80 */       case 2: return EnumRarity.rare;
/*  81 */       case 3: return EnumRarity.epic;
/*     */     } 
/*  83 */     return EnumRarity.rare;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_77648_a(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
/*  89 */     switch (p_77648_1_.func_77960_j()) {
/*     */       
/*     */       case 0:
/*  92 */         if (p_77648_7_ != 1)
/*     */         {
/*  94 */           return false;
/*     */         }
/*  96 */         if (p_77648_2_.func_82247_a(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) && p_77648_3_.func_147439_a(p_77648_4_, p_77648_5_, p_77648_6_) == Blocks.field_150458_ak) {
/*     */ 
/*     */           
/*  99 */           if (!p_77648_3_.field_72995_K) {
/* 100 */             p_77648_3_.func_147465_d(p_77648_4_, p_77648_5_, p_77648_6_, MBlocks.FarmlandAccio, 0, 1);
/* 101 */             p_77648_1_.field_77994_a--;
/* 102 */             return true;
/*     */           } 
/*     */         } else {
/* 105 */           return false;
/*     */         } 
/*     */       
/*     */       case 1:
/* 109 */         if (p_77648_7_ != 1)
/*     */         {
/* 111 */           return false;
/*     */         }
/* 113 */         if (p_77648_2_.func_82247_a(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) && p_77648_3_.func_147439_a(p_77648_4_, p_77648_5_, p_77648_6_) == Blocks.field_150458_ak) {
/*     */ 
/*     */           
/* 116 */           if (!p_77648_3_.field_72995_K) {
/* 117 */             p_77648_3_.func_147465_d(p_77648_4_, p_77648_5_, p_77648_6_, MBlocks.FarmlandCrucio, 0, 1);
/* 118 */             p_77648_1_.field_77994_a--;
/* 119 */             return true;
/*     */           } 
/*     */         } else {
/* 122 */           return false;
/*     */         } 
/*     */       
/*     */       case 2:
/* 126 */         if (p_77648_7_ != 1)
/*     */         {
/* 128 */           return false;
/*     */         }
/* 130 */         if (p_77648_2_.func_82247_a(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) && p_77648_3_.func_147439_a(p_77648_4_, p_77648_5_, p_77648_6_) == Blocks.field_150458_ak) {
/*     */ 
/*     */           
/* 133 */           if (!p_77648_3_.field_72995_K) {
/* 134 */             p_77648_3_.func_147465_d(p_77648_4_, p_77648_5_, p_77648_6_, MBlocks.FarmlandImperio, 0, 1);
/* 135 */             p_77648_1_.field_77994_a--;
/* 136 */             return true;
/*     */           } 
/*     */         } else {
/* 139 */           return false;
/*     */         } 
/*     */       
/*     */       case 3:
/* 143 */         if (p_77648_7_ != 1)
/*     */         {
/* 145 */           return false;
/*     */         }
/* 147 */         if (p_77648_2_.func_82247_a(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) && p_77648_3_.func_147439_a(p_77648_4_, p_77648_5_, p_77648_6_) == Blocks.field_150458_ak) {
/*     */ 
/*     */           
/* 150 */           if (!p_77648_3_.field_72995_K) {
/* 151 */             p_77648_3_.func_147465_d(p_77648_4_, p_77648_5_, p_77648_6_, MBlocks.FarmlandZivicio, 0, 1);
/* 152 */             p_77648_1_.field_77994_a--;
/* 153 */             return true;
/*     */           }  break;
/*     */         } 
/* 156 */         return false;
/*     */     } 
/*     */ 
/*     */     
/* 160 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister par1IconRegister) {
/* 166 */     this.field_150920_d = new IIcon[field_150921_b.length];
/*     */     
/* 168 */     for (int i = 0; i < field_150921_b.length; i++)
/*     */     {
/* 170 */       this.field_150920_d[i] = par1IconRegister.func_94245_a("magicalcrops:" + field_150921_b[i]);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemEssenceFertilizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */