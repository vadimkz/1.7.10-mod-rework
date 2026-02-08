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
/*    */ public class BlockEssenceSquare
/*    */   extends Block
/*    */ {
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon[] texture;
/* 24 */   public static String textureName = "magicalcrops:";
/*    */   protected IIcon[] icon;
/*    */   
/* 27 */   public BlockEssenceSquare(Material par3Material) { super(par3Material);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     this.icon = new IIcon[8];
/*    */     func_149647_a(MagicalCrops.tabMagical);
/*    */     func_149711_c(2.0F);
/*    */     func_149752_b(10.0F);
/* 38 */     func_149715_a(1.0F); } public void registerBlockIcons(IIconRegister par1IconRegister) { this.icon[0] = par1IconRegister.func_94245_a(textureName + "block_essence_qbrick_coal");
/* 39 */     this.icon[1] = par1IconRegister.func_94245_a(textureName + "block_essence_qbrick_earth");
/* 40 */     this.icon[2] = par1IconRegister.func_94245_a(textureName + "block_essence_qbrick_emerald");
/* 41 */     this.icon[3] = par1IconRegister.func_94245_a(textureName + "block_essence_qbrick_fire");
/* 42 */     this.icon[4] = par1IconRegister.func_94245_a(textureName + "block_essence_qbrick_gold");
/* 43 */     this.icon[5] = par1IconRegister.func_94245_a(textureName + "block_essence_qbrick_lapis");
/* 44 */     this.icon[6] = par1IconRegister.func_94245_a(textureName + "block_essence_qbrick_obsidian");
/* 45 */     this.icon[7] = par1IconRegister.func_94245_a(textureName + "block_essence_qbrick_redstone"); }
/*    */ 
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149666_a(Item par1, CreativeTabs par2CreativeTabs, List<ItemStack> par3List) {
/* 51 */     for (int var4 = 0; var4 < 8; var4++) {
/* 52 */       par3List.add(new ItemStack(MBlocks.EssenceSquare, 1, var4));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public IIcon getIcon(int side, int meta) {
/* 59 */     return this.icon[meta];
/*    */   }
/*    */ 
/*    */   
/*    */   public int func_149692_a(int meta) {
/* 64 */     return meta;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockEssenceSquare.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */