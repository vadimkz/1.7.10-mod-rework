/*    */ package com.mark719.magicalcrops.blocks;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.handlers.MBlocks;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.IIcon;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockEssenceLamp
/*    */   extends Block
/*    */ {
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon[] texture;
/* 27 */   public static String textureName = "magicalcrops:";
/*    */   protected IIcon[] icon;
/*    */   
/* 30 */   public BlockEssenceLamp(Material par3Material) { super(par3Material);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     this.icon = new IIcon[8];
/*    */     setCreativeTab(MagicalCrops.tabMagical);
/*    */     setHardness(2.0F);
/*    */     setResistance(10.0F);
/* 41 */     setLightLevel(1.0F); } public void registerBlockIcons(IIconRegister par1IconRegister) { this.icon[0] = par1IconRegister.registerIcon(textureName + "EssLamp_coal");
/* 42 */     this.icon[1] = par1IconRegister.registerIcon(textureName + "EssLamp_brown");
/* 43 */     this.icon[2] = par1IconRegister.registerIcon(textureName + "EssLamp_emerald");
/* 44 */     this.icon[3] = par1IconRegister.registerIcon(textureName + "EssLamp_blaze");
/* 45 */     this.icon[4] = par1IconRegister.registerIcon(textureName + "EssLamp_glowstone");
/* 46 */     this.icon[5] = par1IconRegister.registerIcon(textureName + "EssLamp_lapis");
/* 47 */     this.icon[6] = par1IconRegister.registerIcon(textureName + "EssLamp_obsidian");
/* 48 */     this.icon[7] = par1IconRegister.registerIcon(textureName + "EssLamp_redstone"); }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List<ItemStack> par3List) {
/* 54 */     for (int var4 = 0; var4 < 8; var4++) {
/* 55 */       par3List.add(new ItemStack(MBlocks.EssenceLamp, 1, var4));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public IIcon getIcon(int side, int meta) {
/* 62 */     return this.icon[meta];
/*    */   }
/*    */ 
/*    */   
/*    */   public int damageDropped(int meta) {
/* 67 */     return meta;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockEssenceLamp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */