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
/*    */   public boolean canDropFromExplosion(Explosion explosionIn) {
/* 40 */     return false;
/*    */   }
/*    */   
/*    */   public int quantityDropped(Random random) {
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
/*    */   public void registerBlockIcons(IIconRegister reg) {
/* 64 */     this.blockIcon = reg.registerIcon("magicalcrops:wither_glass");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\BlockWitherProofGlass.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */