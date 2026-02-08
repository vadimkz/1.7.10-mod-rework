/*    */ package com.mark719.magicalcrops.blocks;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.BlockGlass;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.world.Explosion;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BlockWitherProofGlass
/*    */   extends BlockGlass
/*    */ {
/*    */   public BlockWitherProofGlass() {
/* 22 */     super(Material.glass, false);
/* 23 */     setCreativeTab(MagicalCrops.tabMagical);
/* 24 */     setHardness(2.0F);
/* 25 */     setResistance(2000.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
/* 30 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void onBlockExploded(World world, int x, int y, int z, Explosion explosion) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean canDropFromExplosion(Explosion p_149659_1_) {
/* 40 */     return false;
/*    */   }
/*    */   
/*    */   public int quantityDropped(Random p_149745_1_) {
/* 44 */     return 1;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public int getRenderBlockPass() {
/* 49 */     return 1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOpaqueCube() {
/* 54 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean renderAsNormalBlock() {
/* 59 */     return false;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerBlockIcons(IIconRegister p_149651_1_) {
/* 64 */     this.blockIcon = p_149651_1_.registerIcon("magicalcrops:wither_glass");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockWitherProofGlass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */