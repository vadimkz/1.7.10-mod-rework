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
/*    */ public class BlockEssenceStorage
/*    */   extends Block
/*    */ {
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon[] texture;
/* 26 */   public static String textureName = "magicalcrops:";
/*    */   protected IIcon[] icon;
/*    */   
/* 29 */   public BlockEssenceStorage(Material par3Material) { super(par3Material);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 35 */     this.icon = new IIcon[6];
/*    */     setCreativeTab(MagicalCrops.tabMagical);
/*    */     setHardness(2.0F);
/*    */     setResistance(10.0F); } public void registerBlockIcons(IIconRegister par1IconRegister) {
/* 39 */     this.icon[0] = par1IconRegister.registerIcon(textureName + "dust_block_minicio");
/* 40 */     this.icon[1] = par1IconRegister.registerIcon(textureName + "dust_block_accio");
/* 41 */     this.icon[2] = par1IconRegister.registerIcon(textureName + "dust_block_crucio");
/* 42 */     this.icon[3] = par1IconRegister.registerIcon(textureName + "dust_block_imperio");
/* 43 */     this.icon[4] = par1IconRegister.registerIcon(textureName + "dust_block_zivicio");
/* 44 */     this.icon[5] = par1IconRegister.registerIcon(textureName + "dust_block_zivicio_extra");
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List<ItemStack> par3List) {
/* 50 */     for (int var4 = 0; var4 < 6; var4++) {
/* 51 */       par3List.add(new ItemStack(MBlocks.EssenceStorage, 1, var4));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public IIcon getIcon(int side, int meta) {
/* 58 */     return this.icon[meta];
/*    */   }
/*    */ 
/*    */   
/*    */   public int damageDropped(int meta) {
/* 63 */     return meta;
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockEssenceStorage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */