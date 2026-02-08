/*     */ package com.mark719.magicalcrops.furnace;
/*     */ 
/*     */ import com.mark719.magicalcrops.MagicalCrops;
/*     */ import com.mark719.magicalcrops.handlers.MBlocks;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockContainer;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.tileentity.TileEntityFurnace;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AccioFurnace
/*     */   extends BlockContainer
/*     */ {
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon iconTop;
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon iconFront;
/*     */   private static boolean isBurning;
/*     */   private final boolean isBurning2;
/*  37 */   private final Random random = new Random();
/*     */   
/*     */   public AccioFurnace(boolean isActive) {
/*  40 */     super(Material.rock);
/*  41 */     this.isBurning2 = isActive;
/*  42 */     setHardness(3.0F);
/*  43 */     setResistance(2000.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
/*  49 */     if (p_149691_2_ == 0 && p_149691_1_ == 3)
/*     */     {
/*  51 */       return this.iconFront;
/*     */     }
/*  53 */     return (p_149691_1_ == 1) ? this.iconTop : ((p_149691_1_ == 0) ? this.iconTop : ((p_149691_1_ != p_149691_2_) ? this.blockIcon : this.iconFront));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerBlockIcons(IIconRegister reg) {
/*  60 */     this.blockIcon = reg.registerIcon("magicalcrops:furnaceaccio_side");
/*  61 */     this.iconFront = reg.registerIcon(this.isBurning2 ? "magicalcrops:furnaceaccio_front_on" : "magicalcrops:furnaceaccio_front_off");
/*  62 */     this.iconTop = reg.registerIcon("magicalcrops:furnaceaccio_top");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
/*  67 */     player.openGui(MagicalCrops.instance, 1, world, x, y, z);
/*  68 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Item getItemDropped(int par1, Random random, int par3) {
/*  73 */     return Item.getItemFromBlock(MBlocks.AccioFurnace);
/*     */   }
/*     */ 
/*     */   
/*     */   public Item getItem(World world, int par2, int par3, int par4) {
/*  78 */     return Item.getItemFromBlock(MBlocks.AccioFurnace);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TileEntity createNewTileEntity(World world, int par2) {
/*  84 */     return new TileEntityAccioFurnace();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_) {
/*  90 */     super.onBlockAdded(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
/*  91 */     func_149930_e(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
/*     */   }
/*     */ 
/*     */   
/*     */   private void func_149930_e(World p_149930_1_, int p_149930_2_, int p_149930_3_, int p_149930_4_) {
/*  96 */     if (!p_149930_1_.isRemote) {
/*     */       
/*  98 */       Block block = p_149930_1_.getBlock(p_149930_2_, p_149930_3_, p_149930_4_ - 1);
/*  99 */       Block block1 = p_149930_1_.getBlock(p_149930_2_, p_149930_3_, p_149930_4_ + 1);
/* 100 */       Block block2 = p_149930_1_.getBlock(p_149930_2_ - 1, p_149930_3_, p_149930_4_);
/* 101 */       Block block3 = p_149930_1_.getBlock(p_149930_2_ + 1, p_149930_3_, p_149930_4_);
/* 102 */       byte b0 = 3;
/*     */       
/* 104 */       if (block.isFullBlock() && !block1.isFullBlock())
/*     */       {
/* 106 */         b0 = 3;
/*     */       }
/*     */       
/* 109 */       if (block1.isFullBlock() && !block.isFullBlock())
/*     */       {
/* 111 */         b0 = 2;
/*     */       }
/*     */       
/* 114 */       if (block2.isFullBlock() && !block3.isFullBlock())
/*     */       {
/* 116 */         b0 = 5;
/*     */       }
/*     */       
/* 119 */       if (block3.isFullBlock() && !block2.isFullBlock())
/*     */       {
/* 121 */         b0 = 4;
/*     */       }
/*     */       
/* 124 */       p_149930_1_.setBlockMetadataWithNotify(p_149930_2_, p_149930_3_, p_149930_4_, b0, 2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
/* 131 */     int l = MathHelper.floor_double((p_149689_5_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 133 */     if (l == 0)
/*     */     {
/* 135 */       p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 2, 2);
/*     */     }
/*     */     
/* 138 */     if (l == 1)
/*     */     {
/* 140 */       p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 5, 2);
/*     */     }
/*     */     
/* 143 */     if (l == 2)
/*     */     {
/* 145 */       p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 3, 2);
/*     */     }
/*     */     
/* 148 */     if (l == 3)
/*     */     {
/* 150 */       p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 4, 2);
/*     */     }
/*     */     
/* 153 */     if (p_149689_6_.hasDisplayName())
/*     */     {
/* 155 */       ((TileEntityFurnace)p_149689_1_.getTileEntity(p_149689_2_, p_149689_3_, p_149689_4_)).setCustomInventoryName(p_149689_6_.getDisplayName());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void updateBlockState(boolean p_149931_0_, World p_149931_1_, int p_149931_2_, int p_149931_3_, int p_149931_4_) {
/* 161 */     int l = p_149931_1_.getBlockMetadata(p_149931_2_, p_149931_3_, p_149931_4_);
/* 162 */     TileEntity tileentity = p_149931_1_.getTileEntity(p_149931_2_, p_149931_3_, p_149931_4_);
/* 163 */     isBurning = true;
/*     */     
/* 165 */     if (p_149931_0_) {
/*     */       
/* 167 */       p_149931_1_.setBlock(p_149931_2_, p_149931_3_, p_149931_4_, MBlocks.AccioFurnaceActive);
/*     */     }
/*     */     else {
/*     */       
/* 171 */       p_149931_1_.setBlock(p_149931_2_, p_149931_3_, p_149931_4_, MBlocks.AccioFurnace);
/*     */     } 
/*     */     
/* 174 */     isBurning = false;
/* 175 */     p_149931_1_.setBlockMetadataWithNotify(p_149931_2_, p_149931_3_, p_149931_4_, l, 2);
/*     */     
/* 177 */     if (tileentity != null) {
/*     */       
/* 179 */       tileentity.validate();
/* 180 */       p_149931_1_.setTileEntity(p_149931_2_, p_149931_3_, p_149931_4_, tileentity);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
/* 185 */     if (!isBurning) {
/* 186 */       TileEntityAccioFurnace tileentityAccioFurnace = (TileEntityAccioFurnace)world.getTileEntity(x, y, z);
/*     */       
/* 188 */       if (tileentityAccioFurnace != null) {
/* 189 */         for (int i = 0; i < tileentityAccioFurnace.getSizeInventory(); i++) {
/* 190 */           ItemStack itemstack = tileentityAccioFurnace.getStackInSlot(i);
/*     */           
/* 192 */           if (itemstack != null) {
/* 193 */             float f = this.random.nextFloat() * 0.6F + 0.1F;
/* 194 */             float f1 = this.random.nextFloat() * 0.6F + 0.1F;
/* 195 */             float f2 = this.random.nextFloat() * 0.6F + 0.1F;
/*     */             
/* 197 */             while (itemstack.stackSize > 0) {
/* 198 */               int j = this.random.nextInt(21) + 10;
/*     */               
/* 200 */               if (j > itemstack.stackSize) {
/* 201 */                 j = itemstack.stackSize;
/*     */               }
/*     */               
/* 204 */               itemstack.stackSize -= j;
/* 205 */               EntityItem entityitem = new EntityItem(world, (x + f), (y + f1), (z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getMetadata()));
/*     */               
/* 207 */               if (itemstack.hasTagCompound()) {
/* 208 */                 entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
/*     */               }
/*     */               
/* 211 */               float f3 = 0.025F;
/* 212 */               entityitem.motionX = ((float)this.random.nextGaussian() * f3);
/* 213 */               entityitem.motionY = ((float)this.random.nextGaussian() * f3 + 0.1F);
/* 214 */               entityitem.motionZ = ((float)this.random.nextGaussian() * f3);
/* 215 */               world.spawnEntityInWorld((Entity)entityitem);
/*     */             } 
/*     */           } 
/*     */         } 
/* 219 */         world.updateNeighborsAboutBlockChange(x, y, z, block);
/*     */       } 
/*     */     } 
/* 222 */     super.breakBlock(world, x, y, z, block, meta);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
/* 228 */     if (this.isBurning2) {
/*     */       
/* 230 */       int l = p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
/* 231 */       float f = p_149734_2_ + 0.5F;
/* 232 */       float f1 = p_149734_3_ + 0.0F + p_149734_5_.nextFloat() * 6.0F / 16.0F;
/* 233 */       float f2 = p_149734_4_ + 0.5F;
/* 234 */       float f3 = 0.52F;
/* 235 */       float f4 = p_149734_5_.nextFloat() * 0.6F - 0.3F;
/*     */       
/* 237 */       if (l == 4) {
/*     */         
/* 239 */         p_149734_1_.spawnParticle("smoke", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 240 */         p_149734_1_.spawnParticle("flame", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 242 */       else if (l == 5) {
/*     */         
/* 244 */         p_149734_1_.spawnParticle("smoke", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 245 */         p_149734_1_.spawnParticle("flame", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 247 */       else if (l == 2) {
/*     */         
/* 249 */         p_149734_1_.spawnParticle("smoke", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/* 250 */         p_149734_1_.spawnParticle("flame", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 252 */       else if (l == 3) {
/*     */         
/* 254 */         p_149734_1_.spawnParticle("smoke", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/* 255 */         p_149734_1_.spawnParticle("flame", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\AccioFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */