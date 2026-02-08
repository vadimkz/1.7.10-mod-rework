/*    */ package com.mark719.magicalcrops.items;
/*    */ 
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.config.ConfigMain;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.EnumChatFormatting;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemInfusionStone3Strong
/*    */   extends Item
/*    */ {
/* 19 */   int durability = ConfigMain.STRONG_DURABILITY;
/*    */ 
/*    */   
/*    */   public ItemInfusionStone3Strong() {
/* 23 */     this.maxStackSize = 1;
/* 24 */     setMaxDurability(this.durability);
/* 25 */     setCreativeTab(MagicalCrops.tabMagical);
/* 26 */     setTextureName("magicalcrops:InfusionStone_T3");
/* 27 */     setUnlocalizedName("InfusionStoneStrong");
/* 28 */     this.canRepair = false;
/* 29 */     this.hasSubtypes = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getItemStackDisplayName(ItemStack stack) {
/* 34 */     return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
/* 39 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack getContainerItem(ItemStack itemStack) {
/* 44 */     ItemStack cStack = itemStack.copy();
/* 45 */     if (ConfigMain.INFUSION_DURABILITY) {
/* 46 */       cStack.setMetadata(cStack.getMetadata() + 1);
/* 47 */       cStack.stackSize = 1;
/*    */     } 
/* 49 */     return cStack;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasContainerItem(ItemStack stack) {
/* 54 */     return true;
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 59 */     tooltip.add("Crucio -> Imperio");
/* 60 */     if (ConfigMain.INFUSION_DURABILITY)
/* 61 */       tooltip.add("Durability: " + (stack.getMaxDurability() - stack.getMetadata()) + "/" + stack.getMaxDurability()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\ItemInfusionStone3Strong.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */