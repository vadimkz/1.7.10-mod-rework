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
/*     */ public class UltimateFurnace
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
/*     */   public UltimateFurnace(boolean isActive) {
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
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerIcons(IIconRegister reg) {
/*  59 */     this.blockIcon = reg.registerIcon("magicalcrops:furnaceultimate_side");
/*  60 */     this.iconFront = reg.registerIcon(this.isBurning2 ? "magicalcrops:furnaceultimate_front_on" : "magicalcrops:furnaceultimate_front_off");
/*  61 */     this.iconTop = reg.registerIcon("magicalcrops:furnaceultimate_top");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/*  66 */     player.openGui(MagicalCrops.instance, 5, world, x, y, z);
/*  67 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Item getItemDropped(int metadata, Random random, int fortune) {
/*  72 */     return Item.getItemFromBlock(MBlocks.UltimateFurnace);
/*     */   }
/*     */ 
/*     */   
/*     */   public Item getItem(World world, int x, int y, int z) {
/*  77 */     return Item.getItemFromBlock(MBlocks.UltimateFurnace);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TileEntity createNewTileEntity(World world, int meta) {
/*  83 */     return new TileEntityUltimateFurnace();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onBlockAdded(World worldIn, int x, int y, int z) {
/*  89 */     super.onBlockAdded(worldIn, x, y, z);
/*  90 */     setDefaultDirection(worldIn, x, y, z);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setDefaultDirection(World world, int x, int y, int z) {
/*  95 */     if (!world.isRemote) {
/*     */       
/*  97 */       Block block = world.getBlock(x, y, z - 1);
/*  98 */       Block block1 = world.getBlock(x, y, z + 1);
/*  99 */       Block block2 = world.getBlock(x - 1, y, z);
/* 100 */       Block block3 = world.getBlock(x + 1, y, z);
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
/* 123 */       world.setBlockMetadataWithNotify(x, y, z, b0, 2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
/* 130 */     int l = MathHelper.floor_double((entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 132 */     if (l == 0)
/*     */     {
/* 134 */       world.setBlockMetadataWithNotify(x, y, z, 2, 2);
/*     */     }
/*     */     
/* 137 */     if (l == 1)
/*     */     {
/* 139 */       world.setBlockMetadataWithNotify(x, y, z, 5, 2);
/*     */     }
/*     */     
/* 142 */     if (l == 2)
/*     */     {
/* 144 */       world.setBlockMetadataWithNotify(x, y, z, 3, 2);
/*     */     }
/*     */     
/* 147 */     if (l == 3)
/*     */     {
/* 149 */       world.setBlockMetadataWithNotify(x, y, z, 4, 2);
/*     */     }
/*     */     
/* 152 */     if (itemStack.hasDisplayName())
/*     */     {
/* 154 */       ((TileEntityFurnace)world.getTileEntity(x, y, z)).setCustomInventoryName(itemStack.getDisplayName());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void updateBlockState(boolean isActive, World world, int x, int y, int z) {
/* 160 */     int l = world.getBlockMetadata(x, y, z);
/* 161 */     TileEntity tileentity = world.getTileEntity(x, y, z);
/* 162 */     isBurning = true;
/*     */     
/* 164 */     if (isActive) {
/*     */       
/* 166 */       world.setBlock(x, y, z, MBlocks.UltimateFurnaceActive);
/*     */     }
/*     */     else {
/*     */       
/* 170 */       world.setBlock(x, y, z, MBlocks.UltimateFurnace);
/*     */     } 
/*     */     
/* 173 */     isBurning = false;
/* 174 */     world.setBlockMetadataWithNotify(x, y, z, l, 2);
/*     */     
/* 176 */     if (tileentity != null) {
/*     */       
/* 178 */       tileentity.validate();
/* 179 */       world.setTileEntity(x, y, z, tileentity);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
/* 184 */     if (!isBurning) {
/* 185 */       TileEntityUltimateFurnace tileentityUltimateFurnace = (TileEntityUltimateFurnace)world.getTileEntity(x, y, z);
/*     */       
/* 187 */       if (tileentityUltimateFurnace != null) {
/* 188 */         for (int i = 0; i < tileentityUltimateFurnace.getSizeInventory(); i++) {
/* 189 */           ItemStack itemstack = tileentityUltimateFurnace.getStackInSlot(i);
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
/*     */   public void randomDisplayTick(World world, int x, int y, int z, Random random) {
/* 227 */     if (this.isBurning2) {
/*     */       
/* 229 */       int l = world.getBlockMetadata(x, y, z);
/* 230 */       float f = x + 0.5F;
/* 231 */       float f1 = y + 0.0F + random.nextFloat() * 6.0F / 16.0F;
/* 232 */       float f2 = z + 0.5F;
/* 233 */       float f3 = 0.52F;
/* 234 */       float f4 = random.nextFloat() * 0.6F - 0.3F;
/*     */       
/* 236 */       if (l == 4) {
/*     */         
/* 238 */         world.spawnParticle("smoke", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 239 */         world.spawnParticle("flame", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 241 */       else if (l == 5) {
/*     */         
/* 243 */         world.spawnParticle("smoke", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 244 */         world.spawnParticle("flame", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 246 */       else if (l == 2) {
/*     */         
/* 248 */         world.spawnParticle("smoke", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/* 249 */         world.spawnParticle("flame", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 251 */       else if (l == 3) {
/*     */         
/* 253 */         world.spawnParticle("smoke", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/* 254 */         world.spawnParticle("flame", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\UltimateFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */