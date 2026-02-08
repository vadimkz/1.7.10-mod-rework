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
/*    */ public class ItemSeedBagImperio
/*    */   extends Planter
/*    */ {
/*    */   public ItemSeedBagImperio() {
/* 17 */     super(27, 6);
/* 18 */     func_77655_b("SeedBagImperio");
/* 19 */     func_111206_d("MagicalCrops:seedbag_3");
/* 20 */     func_77637_a(MagicalCrops.tabMagical);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public EnumRarity func_77613_e(ItemStack par2) {
/* 25 */     return EnumRarity.rare;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 31 */     par3List.add("Plants seeds 6x6");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\ItemSeedBagImperio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */