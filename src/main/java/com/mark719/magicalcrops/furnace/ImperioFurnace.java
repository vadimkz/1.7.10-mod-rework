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
/*     */ public class ImperioFurnace
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
/*     */   public ImperioFurnace(boolean isActive) {
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
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerBlockIcons(IIconRegister p_149651_1_) {
/*  59 */     this.blockIcon = p_149651_1_.registerIcon("magicalcrops:furnaceimperio_side");
/*  60 */     this.iconFront = p_149651_1_.registerIcon(this.isBurning2 ? "magicalcrops:furnaceimperio_front_on" : "magicalcrops:furnaceimperio_front_off");
/*  61 */     this.iconTop = p_149651_1_.registerIcon("magicalcrops:furnaceimperio_top");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
/*  66 */     player.openGui(MagicalCrops.instance, 3, world, x, y, z);
/*  67 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Item getItemDropped(int par1, Random random, int par3) {
/*  72 */     return Item.getItemFromBlock(MBlocks.ImperioFurnace);
/*     */   }
/*     */ 
/*     */   
/*     */   public Item getItem(World world, int par2, int par3, int par4) {
/*  77 */     return Item.getItemFromBlock(MBlocks.ImperioFurnace);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TileEntity createNewTileEntity(World world, int par2) {
/*  83 */     return new TileEntityImperioFurnace();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_) {
/*  89 */     super.onBlockAdded(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
/*  90 */     func_149930_e(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
/*     */   }
/*     */ 
/*     */   
/*     */   private void func_149930_e(World p_149930_1_, int p_149930_2_, int p_149930_3_, int p_149930_4_) {
/*  95 */     if (!p_149930_1_.isRemote) {
/*     */       
/*  97 */       Block block = p_149930_1_.getBlock(p_149930_2_, p_149930_3_, p_149930_4_ - 1);
/*  98 */       Block block1 = p_149930_1_.getBlock(p_149930_2_, p_149930_3_, p_149930_4_ + 1);
/*  99 */       Block block2 = p_149930_1_.getBlock(p_149930_2_ - 1, p_149930_3_, p_149930_4_);
/* 100 */       Block block3 = p_149930_1_.getBlock(p_149930_2_ + 1, p_149930_3_, p_149930_4_);
/* 101 */       byte b0 = 3;
/*     */       
/* 103 */       if (block.isFullBlock() && !block1.isFullBlock())
/*     */       {
/* 105 */         b0 = 3;
/*     */       }
/*     */       
/* 108 */       if (block1.isFullBlock() && !block.isFullBlock())
/*     */       {
/* 110 */         b0 = 2;
/*     */       }
/*     */       
/* 113 */       if (block2.isFullBlock() && !block3.isFullBlock())
/*     */       {
/* 115 */         b0 = 5;
/*     */       }
/*     */       
/* 118 */       if (block3.isFullBlock() && !block2.isFullBlock())
/*     */       {
/* 120 */         b0 = 4;
/*     */       }
/*     */       
/* 123 */       p_149930_1_.setBlockMetadataWithNotify(p_149930_2_, p_149930_3_, p_149930_4_, b0, 2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
/* 130 */     int l = MathHelper.floor_double((p_149689_5_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 132 */     if (l == 0)
/*     */     {
/* 134 */       p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 2, 2);
/*     */     }
/*     */     
/* 137 */     if (l == 1)
/*     */     {
/* 139 */       p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 5, 2);
/*     */     }
/*     */     
/* 142 */     if (l == 2)
/*     */     {
/* 144 */       p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 3, 2);
/*     */     }
/*     */     
/* 147 */     if (l == 3)
/*     */     {
/* 149 */       p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 4, 2);
/*     */     }
/*     */     
/* 152 */     if (p_149689_6_.hasDisplayName())
/*     */     {
/* 154 */       ((TileEntityFurnace)p_149689_1_.getTileEntity(p_149689_2_, p_149689_3_, p_149689_4_)).setCustomInventoryName(p_149689_6_.getDisplayName());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void updateBlockState(boolean p_149931_0_, World p_149931_1_, int p_149931_2_, int p_149931_3_, int p_149931_4_) {
/* 160 */     int l = p_149931_1_.getBlockMetadata(p_149931_2_, p_149931_3_, p_149931_4_);
/* 161 */     TileEntity tileentity = p_149931_1_.getTileEntity(p_149931_2_, p_149931_3_, p_149931_4_);
/* 162 */     isBurning = true;
/*     */     
/* 164 */     if (p_149931_0_) {
/*     */       
/* 166 */       p_149931_1_.setBlock(p_149931_2_, p_149931_3_, p_149931_4_, MBlocks.ImperioFurnaceActive);
/*     */     }
/*     */     else {
/*     */       
/* 170 */       p_149931_1_.setBlock(p_149931_2_, p_149931_3_, p_149931_4_, MBlocks.ImperioFurnace);
/*     */     } 
/*     */     
/* 173 */     isBurning = false;
/* 174 */     p_149931_1_.setBlockMetadataWithNotify(p_149931_2_, p_149931_3_, p_149931_4_, l, 2);
/*     */     
/* 176 */     if (tileentity != null) {
/*     */       
/* 178 */       tileentity.validate();
/* 179 */       p_149931_1_.setTileEntity(p_149931_2_, p_149931_3_, p_149931_4_, tileentity);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
/* 184 */     if (!isBurning) {
/* 185 */       TileEntityImperioFurnace tileentityImperioFurnace = (TileEntityImperioFurnace)world.getTileEntity(x, y, z);
/*     */       
/* 187 */       if (tileentityImperioFurnace != null) {
/* 188 */         for (int i = 0; i < tileentityImperioFurnace.getSizeInventory(); i++) {
/* 189 */           ItemStack itemstack = tileentityImperioFurnace.getStackInSlot(i);
/*     */           
/* 191 */           if (itemstack != null) {
/* 192 */             float f = this.random.nextFloat() * 0.6F + 0.1F;
/* 193 */             float f1 = this.random.nextFloat() * 0.6F + 0.1F;
/* 194 */             float f2 = this.random.nextFloat() * 0.6F + 0.1F;
/*     */             
/* 196 */             while (itemstack.stackSize > 0) {
/* 197 */               int j = this.random.nextInt(21) + 10;
/*     */               
/* 199 */               if (j > itemstack.stackSize) {
/* 200 */                 j = itemstack.stackSize;
/*     */               }
/*     */               
/* 203 */               itemstack.stackSize -= j;
/* 204 */               EntityItem entityitem = new EntityItem(world, (x + f), (y + f1), (z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getMetadata()));
/*     */               
/* 206 */               if (itemstack.hasTagCompound()) {
/* 207 */                 entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
/*     */               }
/*     */               
/* 210 */               float f3 = 0.025F;
/* 211 */               entityitem.motionX = ((float)this.random.nextGaussian() * f3);
/* 212 */               entityitem.motionY = ((float)this.random.nextGaussian() * f3 + 0.1F);
/* 213 */               entityitem.motionZ = ((float)this.random.nextGaussian() * f3);
/* 214 */               world.spawnEntityInWorld((Entity)entityitem);
/*     */             } 
/*     */           } 
/*     */         } 
/* 218 */         world.updateNeighborsAboutBlockChange(x, y, z, block);
/*     */       } 
/*     */     } 
/* 221 */     super.breakBlock(world, x, y, z, block, meta);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
/* 227 */     if (this.isBurning2) {
/*     */       
/* 229 */       int l = p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
/* 230 */       float f = p_149734_2_ + 0.5F;
/* 231 */       float f1 = p_149734_3_ + 0.0F + p_149734_5_.nextFloat() * 6.0F / 16.0F;
/* 232 */       float f2 = p_149734_4_ + 0.5F;
/* 233 */       float f3 = 0.52F;
/* 234 */       float f4 = p_149734_5_.nextFloat() * 0.6F - 0.3F;
/*     */       
/* 236 */       if (l == 4) {
/*     */         
/* 238 */         p_149734_1_.spawnParticle("smoke", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 239 */         p_149734_1_.spawnParticle("flame", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 241 */       else if (l == 5) {
/*     */         
/* 243 */         p_149734_1_.spawnParticle("smoke", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 244 */         p_149734_1_.spawnParticle("flame", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 246 */       else if (l == 2) {
/*     */         
/* 248 */         p_149734_1_.spawnParticle("smoke", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/* 249 */         p_149734_1_.spawnParticle("flame", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 251 */       else if (l == 3) {
/*     */         
/* 253 */         p_149734_1_.spawnParticle("smoke", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/* 254 */         p_149734_1_.spawnParticle("flame", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\ImperioFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */