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
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemInfusionStone5Master
/*    */   extends Item
/*    */ {
/*    */   public ItemInfusionStone5Master() {
/* 21 */     this.setMaxStackSize(1);
/* 22 */     setMaxDurability(0);
/* 23 */     setCreativeTab(MagicalCrops.tabMagical);
/* 24 */     setTextureName("magicalcrops:InfusionStone_T5");
/* 25 */     setUnlocalizedName("InfusionStoneMaster");
/* 26 */     this.canRepair = false;
/* 27 */     this.hasSubtypes = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 32 */     return EnumChatFormatting.DARK_RED + super.getItemStackDisplayName(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
/* 37 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getContainerItem(ItemStack itemStack) {
/* 42 */     ItemStack cStack = itemStack.copy();
/* 43 */     return cStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasContainerItem(ItemStack stack) {
/* 48 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public EnumRarity getRarity(ItemStack par2) {
/* 53 */     return EnumRarity.epic;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List, boolean par4) {
/* 58 */     par3List.add("Infuses All");
/* 59 */     if (ConfigMain.INFUSION_DURABILITY)
/* 60 */       par3List.add("Durability: Infinate"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemInfusionStone5Master.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */