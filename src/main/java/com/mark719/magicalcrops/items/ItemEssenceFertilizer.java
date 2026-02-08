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
/*  25 */   public static final String[] dyeColorNames = new String[] { "accio", "crucio", "imperio", "zivicio" };
/*     */   
/*  27 */   public static final String[] dyeIcons = new String[] { "fertilizer_accio", "fertilizer_crucio", "fertilizer_imperio", "fertilizer_zivicio" };
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon[] dyeIconArray;
/*     */   
/*     */   private static final String __OBFID = "CL_00000022";
/*     */   
/*     */   public ItemEssenceFertilizer() {
/*  35 */     setHasSubtypes(true);
/*  36 */     setMaxDurability(0);
/*  37 */     setCreativeTab(MagicalCrops.tabMagical);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getItemStackDisplayName(ItemStack stack) {
/*  42 */     switch (stack.getMetadata()) {
/*     */       case 0:
/*  44 */         return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
/*  45 */       case 1: return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
/*  46 */       case 2: return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
/*  47 */       case 3: return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
/*     */     } 
/*  49 */     return EnumChatFormatting.GRAY + super.getItemStackDisplayName(stack);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon getIconFromDamage(int damage) {
/*  55 */     int j = MathHelper.clamp_int(damage, 0, 3);
/*  56 */     return this.dyeIconArray[j];
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUnlocalizedName(ItemStack stack) {
/*  61 */     int i = MathHelper.clamp_int(stack.getMetadata(), 0, 3);
/*  62 */     return getUnlocalizedName() + "." + dyeColorNames[i];
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void getSubItems(Item item, CreativeTabs tab, List list) {
/*  68 */     for (int i = 0; i < 4; i++)
/*     */     {
/*  70 */       list.add(new ItemStack(item, 1, i));
/*     */     }
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public EnumRarity getRarity(ItemStack stack) {
/*  76 */     switch (stack.getMetadata()) {
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
/*     */   public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
/*  89 */     switch (stack.getMetadata()) {
/*     */       
/*     */       case 0:
/*  92 */         if (side != 1)
/*     */         {
/*  94 */           return false;
/*     */         }
/*  96 */         if (player.canPlayerEdit(x, y, z, side, stack) && world.getBlock(x, y, z) == Blocks.farmland) {
/*     */ 
/*     */           
/*  99 */           if (!world.isRemote) {
/* 100 */             world.setBlock(x, y, z, MBlocks.FarmlandAccio, 0, 1);
/* 101 */             stack.stackSize--;
/* 102 */             return true;
/*     */           } 
/*     */         } else {
/* 105 */           return false;
/*     */         } 
/*     */       
/*     */       case 1:
/* 109 */         if (side != 1)
/*     */         {
/* 111 */           return false;
/*     */         }
/* 113 */         if (player.canPlayerEdit(x, y, z, side, stack) && world.getBlock(x, y, z) == Blocks.farmland) {
/*     */ 
/*     */           
/* 116 */           if (!world.isRemote) {
/* 117 */             world.setBlock(x, y, z, MBlocks.FarmlandCrucio, 0, 1);
/* 118 */             stack.stackSize--;
/* 119 */             return true;
/*     */           } 
/*     */         } else {
/* 122 */           return false;
/*     */         } 
/*     */       
/*     */       case 2:
/* 126 */         if (side != 1)
/*     */         {
/* 128 */           return false;
/*     */         }
/* 130 */         if (player.canPlayerEdit(x, y, z, side, stack) && world.getBlock(x, y, z) == Blocks.farmland) {
/*     */ 
/*     */           
/* 133 */           if (!world.isRemote) {
/* 134 */             world.setBlock(x, y, z, MBlocks.FarmlandImperio, 0, 1);
/* 135 */             stack.stackSize--;
/* 136 */             return true;
/*     */           } 
/*     */         } else {
/* 139 */           return false;
/*     */         } 
/*     */       
/*     */       case 3:
/* 143 */         if (side != 1)
/*     */         {
/* 145 */           return false;
/*     */         }
/* 147 */         if (player.canPlayerEdit(x, y, z, side, stack) && world.getBlock(x, y, z) == Blocks.farmland) {
/*     */ 
/*     */           
/* 150 */           if (!world.isRemote) {
/* 151 */             world.setBlock(x, y, z, MBlocks.FarmlandZivicio, 0, 1);
/* 152 */             stack.stackSize--;
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
/*     */   public void registerIcons(IIconRegister iconRegister) {
/* 166 */     this.dyeIconArray = new IIcon[dyeIcons.length];
/*     */     
/* 168 */     for (int i = 0; i < dyeIcons.length; i++)
/*     */     {
/* 170 */       this.dyeIconArray[i] = iconRegister.registerIcon("magicalcrops:" + dyeIcons[i]);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemEssenceFertilizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */