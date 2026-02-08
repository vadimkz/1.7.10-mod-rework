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
/* 18 */     setUnlocalizedName("SeedBagImperio");
/* 19 */     setTextureName("MagicalCrops:seedbag_3");
/* 20 */     setCreativeTab(MagicalCrops.tabMagical);
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public EnumRarity getRarity(ItemStack stack) {
/* 25 */     return EnumRarity.rare;
/*    */   }
/*    */ 
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 31 */     tooltip.add("Plants seeds 6x6");
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\seedbags\ItemSeedBagImperio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */