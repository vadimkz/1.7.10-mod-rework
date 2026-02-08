/*     */ package com.mark719.magicalcrops.items;
/*     */ 
/*     */ import com.mark719.magicalcrops.MagicalCrops;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.util.MathHelper;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ItemExperienceBook
/*     */   extends Item
/*     */ {
/*  37 */   public static final String[] dyeColorNames = new String[] { "level1", "level2", "level3", "level4", "level5" };
/*     */   
/*  39 */   public static final String[] dyeIcons = new String[] { "experience_book", "experience_book_accio", "experience_book_crucio", "experience_book_imperio", "experience_book_zivicio" };
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon[] dyeIconArray;
/*     */   
/*     */   private static final String __OBFID = "CL_00000022";
/*     */ 
/*     */   
/*     */   public ItemExperienceBook() {
/*  48 */     setHasSubtypes(true);
/*  49 */     setMaxDurability(0);
/*  50 */     setCreativeTab(MagicalCrops.tabMagical);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getItemStackDisplayName(ItemStack stack) {
/*  55 */     switch (stack.getMetadata()) {
/*     */       case 1:
/*  57 */         return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
/*  58 */       case 2: return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
/*  59 */       case 3: return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
/*  60 */       case 4: return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
/*     */     } 
/*  62 */     return EnumChatFormatting.WHITE + super.getItemStackDisplayName(stack);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon getIconFromDamage(int damage) {
/*  68 */     int j = MathHelper.clamp_int(damage, 0, 4);
/*  69 */     return this.dyeIconArray[j];
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUnlocalizedName(ItemStack stack) {
/*  74 */     int i = MathHelper.clamp_int(stack.getMetadata(), 0, 4);
/*  75 */     return getUnlocalizedName() + "." + dyeColorNames[i];
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> list) {
/*  81 */     for (int i = 0; i < 5; i++)
/*     */     {
/*  83 */       list.add(new ItemStack(item, 1, i));
/*     */     }
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/*  89 */     switch (stack.getMetadata()) {
/*     */       case 0:
/*  91 */         tooltip.add("Level 1"); break;
/*     */       case 1:
/*  93 */         tooltip.add("Level 2"); break;
/*     */       case 2:
/*  95 */         tooltip.add("Level 3"); break;
/*     */       case 3:
/*  97 */         tooltip.add("Level 4"); break;
/*     */       case 4:
/*  99 */         tooltip.add("Level 5");
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerIcons(IIconRegister iconRegister) {
/* 107 */     this.dyeIconArray = new IIcon[dyeIcons.length];
/*     */     
/* 109 */     for (int i = 0; i < dyeIcons.length; i++)
/*     */     {
/* 111 */       this.dyeIconArray[i] = iconRegister.registerIcon("magicalcrops:" + dyeIcons[i]);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemExperienceBook.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */