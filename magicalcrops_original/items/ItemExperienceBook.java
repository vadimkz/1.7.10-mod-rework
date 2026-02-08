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
/*  37 */   public static final String[] field_150923_a = new String[] { "level1", "level2", "level3", "level4", "level5" };
/*     */   
/*  39 */   public static final String[] field_150921_b = new String[] { "experience_book", "experience_book_accio", "experience_book_crucio", "experience_book_imperio", "experience_book_zivicio" };
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon[] field_150920_d;
/*     */   
/*     */   private static final String __OBFID = "CL_00000022";
/*     */ 
/*     */   
/*     */   public ItemExperienceBook() {
/*  48 */     func_77627_a(true);
/*  49 */     func_77656_e(0);
/*  50 */     func_77637_a(MagicalCrops.tabMagical);
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_77653_i(ItemStack stack) {
/*  55 */     switch (stack.func_77960_j()) {
/*     */       case 1:
/*  57 */         return EnumChatFormatting.GOLD + super.func_77653_i(stack);
/*  58 */       case 2: return EnumChatFormatting.YELLOW + super.func_77653_i(stack);
/*  59 */       case 3: return EnumChatFormatting.AQUA + super.func_77653_i(stack);
/*  60 */       case 4: return EnumChatFormatting.LIGHT_PURPLE + super.func_77653_i(stack);
/*     */     } 
/*  62 */     return EnumChatFormatting.WHITE + super.func_77653_i(stack);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon func_77617_a(int par1) {
/*  68 */     int j = MathHelper.func_76125_a(par1, 0, 4);
/*  69 */     return this.field_150920_d[j];
/*     */   }
/*     */ 
/*     */   
/*     */   public String func_77667_c(ItemStack par1ItemStack) {
/*  74 */     int i = MathHelper.func_76125_a(par1ItemStack.func_77960_j(), 0, 4);
/*  75 */     return func_77658_a() + "." + field_150923_a[i];
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_150895_a(Item p_150895_1_, CreativeTabs p_150895_2_, List<ItemStack> p_150895_3_) {
/*  81 */     for (int i = 0; i < 5; i++)
/*     */     {
/*  83 */       p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
/*     */     }
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/*  89 */     switch (par1ItemStack.func_77960_j()) {
/*     */       case 0:
/*  91 */         par3List.add("Level 1"); break;
/*     */       case 1:
/*  93 */         par3List.add("Level 2"); break;
/*     */       case 2:
/*  95 */         par3List.add("Level 3"); break;
/*     */       case 3:
/*  97 */         par3List.add("Level 4"); break;
/*     */       case 4:
/*  99 */         par3List.add("Level 5");
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister par1IconRegister) {
/* 107 */     this.field_150920_d = new IIcon[field_150921_b.length];
/*     */     
/* 109 */     for (int i = 0; i < field_150921_b.length; i++)
/*     */     {
/* 111 */       this.field_150920_d[i] = par1IconRegister.func_94245_a("magicalcrops:" + field_150921_b[i]);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemExperienceBook.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */