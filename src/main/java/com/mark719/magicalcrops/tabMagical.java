/*    */ package com.mark719.magicalcrops;
/*    */ 
/*    */ import com.mark719.magicalcrops.handlers.MItems;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.creativetab.CreativeTabs;
/*    */ import net.minecraft.item.Item;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tabMagical extends CreativeTabs {

    public tabMagical(int ID, String name) {
        super(ID, name);
    }

    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel() {
        return "Magical Crops";
    }

    public Item getTabIconItem() {
        return MItems.InfusionStoneMaster;
    }
}



/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\tabMagical.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */