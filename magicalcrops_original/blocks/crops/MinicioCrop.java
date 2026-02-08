/*    */ package com.mark719.magicalcrops.blocks.crops;
/*    */ 
/*    */ import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
/*    */ import com.mark719.magicalcrops.handlers.Essence;
/*    */ import com.mark719.magicalcrops.handlers.MSeeds;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.util.IIcon;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MinicioCrop
/*    */   extends BlockMagicalCrops
/*    */ {
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon[] iconArray;
/*    */   
/*    */   public Item getSeed() {
/* 34 */     return MSeeds.MinicioSeeds;
/*    */   }
/*    */   
/*    */   public Item getCrop() {
/* 38 */     return Essence.MinicioEssence;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerBlockIcons(IIconRegister reg) {
/* 43 */     this.iconArray = new IIcon[4];
/* 44 */     for (int i = 0; i < this.iconArray.length; i++) {
/* 45 */       this.iconArray[i] = reg.registerIcon("magicalcrops:CropMinicio_" + i);
/*    */     }
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public IIcon getIcon(int par1, int par2) {
/* 51 */     if (par2 < 7) {
/* 52 */       if (par2 == 6) {
/* 53 */         par2 = 5;
/*    */       }
/* 55 */       return this.iconArray[par2 >> 1];
/*    */     } 
/*    */     
/* 58 */     return this.iconArray[3];
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\crops\MinicioCrop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */