/*    */ package com.mark719.magicalcrops.items;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.config.ConfigMain;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.EnumRarity;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemInfusionStone2Regular
/*    */   extends Item
/*    */ {
/* 18 */   int durability = ConfigMain.REGULAR_DURABILITY;
/*    */ 
/*    */   
/*    */   public ItemInfusionStone2Regular() {
/* 22 */     this.maxStackSize = 1;
/* 23 */     setMaxDurability(this.durability);
/* 24 */     setCreativeTab(MagicalCrops.tabMagical);
/* 25 */     setTextureName("magicalcrops:InfusionStone_T2");
/* 26 */     setUnlocalizedName("InfusionStoneRegular");
/* 27 */     this.canRepair = false;
/* 28 */     this.hasSubtypes = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
/* 33 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getContainerItem(ItemStack itemStack) {
/* 38 */     ItemStack cStack = itemStack.copy();
/* 39 */     if (ConfigMain.INFUSION_DURABILITY) {
/* 40 */       cStack.setMetadata(cStack.getMetadata() + 1);
/* 41 */       cStack.stackSize = 1;
/*    */     } 
/* 43 */     return cStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasContainerItem(ItemStack stack) {
/* 48 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public EnumRarity getRarity(ItemStack stack) {
/* 53 */     return EnumRarity.uncommon;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 58 */     tooltip.add("Accio -> Crucio");
/* 59 */     if (ConfigMain.INFUSION_DURABILITY)
/* 60 */       tooltip.add("Durability: " + (stack.getMaxDurability() - stack.getMetadata()) + "/" + stack.getMaxDurability()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemInfusionStone2Regular.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */