package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.BlockMagicalCrops;
import com.mark719.magicalcrops.handlers.ModCompat;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class AlumiteCrop extends BlockMagicalCrops {
  @SideOnly(Side.CLIENT)
  private IIcon[] iconArray;
  
  public Item func_149866_i() {
    return ModCompat.AlumiteSeeds;
  }
  
  public Item func_149865_P() {
    return ModCompat.AlumiteEssence;
  }
  
  @SideOnly(Side.CLIENT)
  public void func_149651_a(IIconRegister p_149651_1_) {
    this.iconArray = new IIcon[4];
    for (int i = 0; i < this.iconArray.length; i++)
      this.iconArray[i] = p_149651_1_.func_94245_a("magicalcrops:CropAlumite_" + i); 
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon func_149691_a(int par1, int par2) {
    if (par2 < 7) {
      if (par2 == 6)
        par2 = 5; 
      return this.iconArray[par2 >> 1];
    } 
    return this.iconArray[3];
  }
}
