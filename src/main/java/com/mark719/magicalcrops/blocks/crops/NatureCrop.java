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
/*    */ public class NatureCrop
/*    */   extends BlockMagicalCrops
/*    */ {
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon[] iconArray;
/*    */   
/*    */   public Item getSeed() {
/* 25 */     return MSeeds.NatureSeeds;
/*    */   }
/*    */   
/*    */   public Item getCrop() {
/* 29 */     return Essence.NatureEssence;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerBlockIcons(IIconRegister reg) {
/* 34 */     this.iconArray = new IIcon[4];
/* 35 */     for (int i = 0; i < this.iconArray.length; i++) {
/* 36 */       this.iconArray[i] = reg.registerIcon("magicalcrops:CropNature_" + i);
/*    */     }
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public IIcon getIcon(int side, int metadata) {
/* 42 */     if (metadata < 7) {
/* 43 */       if (metadata == 6) {
/* 44 */         metadata = 5;
/*    */       }
/* 46 */       return this.iconArray[metadata >> 1];
/*    */     } 
/*    */     
/* 49 */     return this.iconArray[3];
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\crops\NatureCrop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */