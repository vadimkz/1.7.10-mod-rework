/*     */ package com.mark719.magicalcrops.items.tools;
/*     */ 
/*     */ import com.mark719.magicalcrops.MagicalCrops;
/*     */ import com.mark719.magicalcrops.config.ConfigMain;
/*     */ import cpw.mods.fml.common.eventhandler.Event;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemHoe;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.EnumChatFormatting;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.entity.player.UseHoeEvent;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ZivicioHoe
/*     */   extends ItemHoe
/*     */ {
/*     */   public ZivicioHoe(int itemId, Item.ToolMaterial toolMaterial) {
/*  29 */     super(toolMaterial);
/*  30 */     this.maxStackSize = 1;
/*  31 */     setCreativeTab(MagicalCrops.tabMagical);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getItemStackDisplayName(ItemStack stack) {
/*  36 */     return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
/*  41 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase entity) {
/*  46 */     return true;
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/*  51 */     if (ConfigMain.EXTRA_HOE) {
/*  52 */       tooltip.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
/*  53 */       if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
/*  54 */         tooltip.add(EnumChatFormatting.ITALIC + "- 8 Extra essence from Minicio Crops");
/*     */       }
/*     */     } 
/*  57 */     tooltip.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "Unbreakable");
/*  58 */     tooltip.add(EnumChatFormatting.GREEN + "Gem Socket:");
/*  59 */     tooltip.add(EnumChatFormatting.ITALIC + "- Empty");
/*  60 */     tooltip.add("");
/*  61 */     tooltip.add(EnumChatFormatting.BLUE + "+1 Attack Damage");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
/*  67 */     if (!player.canPlayerEdit(x, y, z, side, stack))
/*     */     {
/*  69 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  73 */     UseHoeEvent event = new UseHoeEvent(player, stack, world, x, y, z);
/*  74 */     if (MinecraftForge.EVENT_BUS.post((Event)event))
/*     */     {
/*  76 */       return false;
/*     */     }
/*     */     
/*  79 */     if (event.getResult() == Event.Result.ALLOW) {
/*     */       
/*  81 */       stack.damageItem(0, (EntityLivingBase)player);
/*  82 */       return true;
/*     */     } 
/*     */     
/*  85 */     Block block = world.getBlock(x, y, z);
/*     */     
/*  87 */     if (side != 0 && world.getBlock(x, y + 1, z).isAir((IBlockAccess)world, x, y + 1, z) && (block == Blocks.grass || block == Blocks.dirt)) {
/*     */       
/*  89 */       Block block1 = Blocks.farmland;
/*  90 */       world.playSoundEffect((x + 0.5F), (y + 0.5F), (z + 0.5F), block1.stepSound.getStepSound(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getFrequency() * 0.8F);
/*     */       
/*  92 */       if (world.isRemote)
/*     */       {
/*  94 */         return true;
/*     */       }
/*     */ 
/*     */       
/*  98 */       world.setBlock(x, y, z, block1);
/*  99 */       stack.damageItem(0, (EntityLivingBase)player);
/* 100 */       return true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 105 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\items\tools\ZivicioHoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */