/*    */ package com.mark719.magicalcrops.blocks.crops;
/*    */ 
/*    */ import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
/*    */ import com.mark719.magicalcrops.handlers.ModCompat;
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
/*    */ public class PlatinumCrop
/*    */   extends BlockMagicalCrops
/*    */ {
/*    */   @SideOnly(Side.CLIENT)
/*    */   private IIcon[] iconArray;
/*    */   
/*    */   public Item getSeed() {
/* 26 */     return ModCompat.PlatinumSeeds;
/*    */   }
/*    */   
/*    */   public Item getCrop() {
/* 30 */     return ModCompat.PlatinumEssence;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister reg) {
    this.iconArray = new IIcon[4];
    for (int i = 0; i < this.iconArray.length; i++)
        this.iconArray[i] = reg.registerIcon("magicalcrops:CropPlatinum_" + i);
}

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        if (metadata < 7) {
            if (metadata == 6)
                metadata = 5;
            return this.iconArray[metadata >> 1];
        }
        return this.iconArray[3];
    }
}


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\blocks\crops\PlatinumCrop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */