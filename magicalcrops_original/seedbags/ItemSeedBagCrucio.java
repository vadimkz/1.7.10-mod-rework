/*    */ package com.mark719.magicalcrops.seedbags;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.EnumRarity;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemSeedBagCrucio
/*    */   extends Planter
/*    */ {
/*    */   public ItemSeedBagCrucio() {
/* 17 */     super(18, 4);
/* 18 */     func_77655_b("SeedBagCrucio");
/* 19 */     func_111206_d("MagicalCrops:seedbag_2");
/* 20 */     func_77637_a(MagicalCrops.tabMagical);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public EnumRarity func_77613_e(ItemStack par2) {
/* 25 */     return EnumRarity.uncommon;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 31 */     par3List.add("Plants seeds 4x4");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\ItemSeedBagCrucio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */