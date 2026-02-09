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
/*     */   public IIcon getIcon(int side, int meta) {
/*  49 */     if (meta == 0 && side == 3)
/*     */     {
/*  51 */       return this.iconFront;
/*     */     }
/*  53 */     return (side == 1) ? this.iconTop : ((side == 0) ? this.iconTop : ((side != meta) ? this.blockIcon : this.iconFront));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerIcons(IIconRegister reg) {
/*  60 */     this.blockIcon = reg.registerIcon("magicalcrops:furnaceaccio_side");
/*  61 */     this.iconFront = reg.registerIcon(this.isBurning2 ? "magicalcrops:furnaceaccio_front_on" : "magicalcrops:furnaceaccio_front_off");
/*  62 */     this.iconTop = reg.registerIcon("magicalcrops:furnaceaccio_top");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/*  67 */     player.openGui(MagicalCrops.instance, 1, world, x, y, z);
/*  68 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Item getItemDropped(int metadata, Random random, int fortune) {
/*  73 */     return Item.getItemFromBlock(MBlocks.AccioFurnace);
/*     */   }
/*     */ 
/*     */   
/*     */   public Item getItem(World world, int x, int y, int z) {
/*  78 */     return Item.getItemFromBlock(MBlocks.AccioFurnace);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TileEntity createNewTileEntity(World world, int meta) {
/*  84 */     return new TileEntityAccioFurnace();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onBlockAdded(World worldIn, int x, int y, int z) {
/*  90 */     super.onBlockAdded(worldIn, x, y, z);
/*  91 */     setDefaultDirection(worldIn, x, y, z);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setDefaultDirection(World world, int x, int y, int z) {
/*  96 */     if (!world.isRemote) {
/*     */       
/*  98 */       Block block = world.getBlock(x, y, z - 1);
/*  99 */       Block block1 = world.getBlock(x, y, z + 1);
/* 100 */       Block block2 = world.getBlock(x - 1, y, z);
/* 101 */       Block block3 = world.getBlock(x + 1, y, z);
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
/* 124 */       world.setBlockMetadataWithNotify(x, y, z, b0, 2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
/* 131 */     int l = MathHelper.floor_double((entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 133 */     if (l == 0)
/*     */     {
/* 135 */       world.setBlockMetadataWithNotify(x, y, z, 2, 2);
/*     */     }
/*     */     
/* 138 */     if (l == 1)
/*     */     {
/* 140 */       world.setBlockMetadataWithNotify(x, y, z, 5, 2);
/*     */     }
/*     */     
/* 143 */     if (l == 2)
/*     */     {
/* 145 */       world.setBlockMetadataWithNotify(x, y, z, 3, 2);
/*     */     }
/*     */     
/* 148 */     if (l == 3)
/*     */     {
/* 150 */       world.setBlockMetadataWithNotify(x, y, z, 4, 2);
/*     */     }
/*     */     
/* 153 */     if (itemStack.hasDisplayName())
/*     */     {
/* 155 */       ((TileEntityFurnace)world.getTileEntity(x, y, z)).setCustomInventoryName(itemStack.getDisplayName());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void updateBlockState(boolean isActive, World world, int x, int y, int z) {
/* 161 */     int l = world.getBlockMetadata(x, y, z);
/* 162 */     TileEntity tileentity = world.getTileEntity(x, y, z);
/* 163 */     isBurning = true;
/*     */     
/* 165 */     if (isActive) {
/*     */       
/* 167 */       world.setBlock(x, y, z, MBlocks.AccioFurnaceActive);
/*     */     }
/*     */     else {
/*     */       
/* 171 */       world.setBlock(x, y, z, MBlocks.AccioFurnace);
/*     */     } 
/*     */     
/* 174 */     isBurning = false;
/* 175 */     world.setBlockMetadataWithNotify(x, y, z, l, 2);
/*     */     
/* 177 */     if (tileentity != null) {
/*     */       
/* 179 */       tileentity.validate();
/* 180 */       world.setTileEntity(x, y, z, tileentity);
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
/*     */   public void randomDisplayTick(World world, int x, int y, int z, Random random) {
/* 228 */     if (this.isBurning2) {
/*     */       
/* 230 */       int l = world.getBlockMetadata(x, y, z);
/* 231 */       float f = x + 0.5F;
/* 232 */       float f1 = y + 0.0F + random.nextFloat() * 6.0F / 16.0F;
/* 233 */       float f2 = z + 0.5F;
/* 234 */       float f3 = 0.52F;
/* 235 */       float f4 = random.nextFloat() * 0.6F - 0.3F;
/*     */       
/* 237 */       if (l == 4) {
/*     */         
/* 239 */         world.spawnParticle("smoke", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 240 */         world.spawnParticle("flame", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 242 */       else if (l == 5) {
/*     */         
/* 244 */         world.spawnParticle("smoke", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 245 */         world.spawnParticle("flame", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 247 */       else if (l == 2) {
/*     */         
/* 249 */         world.spawnParticle("smoke", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/* 250 */         world.spawnParticle("flame", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 252 */       else if (l == 3) {
/*     */         
/* 254 */         world.spawnParticle("smoke", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/* 255 */         world.spawnParticle("flame", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\AccioFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */