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
/*    */ public class ExperienceCrop
/*    */   extends BlockMagicalCrops
/*    */ {
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon[] iconArray;
/*    */   
/*    */   public Item getSeed() {
/* 26 */     return MSeeds.ExperienceSeeds;
/*    */   }
/*    */   
/*    */   public Item getCrop() {
/* 30 */     return Essence.ExperienceEssence;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerBlockIcons(IIconRegister reg) {
/* 35 */     this.iconArray = new IIcon[4];
/* 36 */     for (int i = 0; i < this.iconArray.length; i++) {
/* 37 */       this.iconArray[i] = reg.registerIcon("magicalcrops:CropXP_" + i);
/*    */     }
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public IIcon getIcon(int par1, int par2) {
/* 43 */     if (par2 < 7) {
/* 44 */       if (par2 == 6) {
/* 45 */         par2 = 5;
/*    */       }
/* 47 */       return this.iconArray[par2 >> 1];
/*    */     } 
/*    */     
/* 50 */     return this.iconArray[3];
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\crops\ExperienceCrop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */