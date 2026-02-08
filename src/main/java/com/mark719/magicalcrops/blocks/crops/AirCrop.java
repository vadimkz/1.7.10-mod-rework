package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MSeeds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class AirCrop extends BlockMagicalCrops {
  @SideOnly(Side.CLIENT)
  private IIcon[] iconArray;
  
  public Item getSeed() {
    return MSeeds.AirSeeds;
  }
  
  public Item getCrop() {
    return Essence.AirEssence;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister p_149651_1_) {
    this.iconArray = new IIcon[4];
    for (int i = 0; i < this.iconArray.length; i++)
      this.iconArray[i] = p_149651_1_.registerIcon("magicalcrops:CropAir_" + i); 
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int par1, int par2) {
    if (par2 < 7) {
      if (par2 == 6)
        par2 = 5; 
      return this.iconArray[par2 >> 1];
    } 
    return this.iconArray[3];
  }
}
