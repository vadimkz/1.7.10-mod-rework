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
/*     */   private IIcon field_149935_N;
/*     */   @SideOnly(Side.CLIENT)
/*     */   private IIcon field_149936_O;
/*     */   private static boolean isBurning;
/*     */   private final boolean isBurning2;
/*  37 */   private final Random random = new Random();
/*     */   
/*     */   public UltimateFurnace(boolean isActive) {
/*  40 */     super(Material.field_151576_e);
/*  41 */     this.isBurning2 = isActive;
/*  42 */     func_149711_c(3.0F);
/*  43 */     func_149752_b(2000.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
/*  49 */     if (p_149691_2_ == 0 && p_149691_1_ == 3)
/*     */     {
/*  51 */       return this.field_149936_O;
/*     */     }
/*  53 */     return (p_149691_1_ == 1) ? this.field_149935_N : ((p_149691_1_ == 0) ? this.field_149935_N : ((p_149691_1_ != p_149691_2_) ? this.field_149761_L : this.field_149936_O));
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerBlockIcons(IIconRegister p_149651_1_) {
/*  59 */     this.field_149761_L = p_149651_1_.func_94245_a("magicalcrops:furnaceultimate_side");
/*  60 */     this.field_149936_O = p_149651_1_.func_94245_a(this.isBurning2 ? "magicalcrops:furnaceultimate_front_on" : "magicalcrops:furnaceultimate_front_off");
/*  61 */     this.field_149935_N = p_149651_1_.func_94245_a("magicalcrops:furnaceultimate_top");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_149727_a(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
/*  66 */     player.openGui(MagicalCrops.instance, 5, world, x, y, z);
/*  67 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Item func_149650_a(int par1, Random random, int par3) {
/*  72 */     return Item.func_150898_a(MBlocks.UltimateFurnace);
/*     */   }
/*     */ 
/*     */   
/*     */   public Item func_149694_d(World world, int par2, int par3, int par4) {
/*  77 */     return Item.func_150898_a(MBlocks.UltimateFurnace);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TileEntity func_149915_a(World world, int par2) {
/*  83 */     return new TileEntityUltimateFurnace();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149726_b(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_) {
/*  89 */     super.func_149726_b(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
/*  90 */     func_149930_e(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
/*     */   }
/*     */ 
/*     */   
/*     */   private void func_149930_e(World p_149930_1_, int p_149930_2_, int p_149930_3_, int p_149930_4_) {
/*  95 */     if (!p_149930_1_.field_72995_K) {
/*     */       
/*  97 */       Block block = p_149930_1_.func_147439_a(p_149930_2_, p_149930_3_, p_149930_4_ - 1);
/*  98 */       Block block1 = p_149930_1_.func_147439_a(p_149930_2_, p_149930_3_, p_149930_4_ + 1);
/*  99 */       Block block2 = p_149930_1_.func_147439_a(p_149930_2_ - 1, p_149930_3_, p_149930_4_);
/* 100 */       Block block3 = p_149930_1_.func_147439_a(p_149930_2_ + 1, p_149930_3_, p_149930_4_);
/* 101 */       byte b0 = 3;
/*     */       
/* 103 */       if (block.func_149730_j() && !block1.func_149730_j())
/*     */       {
/* 105 */         b0 = 3;
/*     */       }
/*     */       
/* 108 */       if (block1.func_149730_j() && !block.func_149730_j())
/*     */       {
/* 110 */         b0 = 2;
/*     */       }
/*     */       
/* 113 */       if (block2.func_149730_j() && !block3.func_149730_j())
/*     */       {
/* 115 */         b0 = 5;
/*     */       }
/*     */       
/* 118 */       if (block3.func_149730_j() && !block2.func_149730_j())
/*     */       {
/* 120 */         b0 = 4;
/*     */       }
/*     */       
/* 123 */       p_149930_1_.func_72921_c(p_149930_2_, p_149930_3_, p_149930_4_, b0, 2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_149689_a(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
/* 130 */     int l = MathHelper.func_76128_c((p_149689_5_.field_70177_z * 4.0F / 360.0F) + 0.5D) & 0x3;
/*     */     
/* 132 */     if (l == 0)
/*     */     {
/* 134 */       p_149689_1_.func_72921_c(p_149689_2_, p_149689_3_, p_149689_4_, 2, 2);
/*     */     }
/*     */     
/* 137 */     if (l == 1)
/*     */     {
/* 139 */       p_149689_1_.func_72921_c(p_149689_2_, p_149689_3_, p_149689_4_, 5, 2);
/*     */     }
/*     */     
/* 142 */     if (l == 2)
/*     */     {
/* 144 */       p_149689_1_.func_72921_c(p_149689_2_, p_149689_3_, p_149689_4_, 3, 2);
/*     */     }
/*     */     
/* 147 */     if (l == 3)
/*     */     {
/* 149 */       p_149689_1_.func_72921_c(p_149689_2_, p_149689_3_, p_149689_4_, 4, 2);
/*     */     }
/*     */     
/* 152 */     if (p_149689_6_.func_82837_s())
/*     */     {
/* 154 */       ((TileEntityFurnace)p_149689_1_.func_147438_o(p_149689_2_, p_149689_3_, p_149689_4_)).func_145951_a(p_149689_6_.func_82833_r());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void updateBlockState(boolean p_149931_0_, World p_149931_1_, int p_149931_2_, int p_149931_3_, int p_149931_4_) {
/* 160 */     int l = p_149931_1_.func_72805_g(p_149931_2_, p_149931_3_, p_149931_4_);
/* 161 */     TileEntity tileentity = p_149931_1_.func_147438_o(p_149931_2_, p_149931_3_, p_149931_4_);
/* 162 */     isBurning = true;
/*     */     
/* 164 */     if (p_149931_0_) {
/*     */       
/* 166 */       p_149931_1_.func_147449_b(p_149931_2_, p_149931_3_, p_149931_4_, MBlocks.UltimateFurnaceActive);
/*     */     }
/*     */     else {
/*     */       
/* 170 */       p_149931_1_.func_147449_b(p_149931_2_, p_149931_3_, p_149931_4_, MBlocks.UltimateFurnace);
/*     */     } 
/*     */     
/* 173 */     isBurning = false;
/* 174 */     p_149931_1_.func_72921_c(p_149931_2_, p_149931_3_, p_149931_4_, l, 2);
/*     */     
/* 176 */     if (tileentity != null) {
/*     */       
/* 178 */       tileentity.func_145829_t();
/* 179 */       p_149931_1_.func_147455_a(p_149931_2_, p_149931_3_, p_149931_4_, tileentity);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void func_149749_a(World world, int x, int y, int z, Block block, int meta) {
/* 184 */     if (!isBurning) {
/* 185 */       TileEntityUltimateFurnace tileentityUltimateFurnace = (TileEntityUltimateFurnace)world.func_147438_o(x, y, z);
/*     */       
/* 187 */       if (tileentityUltimateFurnace != null) {
/* 188 */         for (int i = 0; i < tileentityUltimateFurnace.func_70302_i_(); i++) {
/* 189 */           ItemStack itemstack = tileentityUltimateFurnace.func_70301_a(i);
/*     */           
/* 191 */           if (itemstack != null) {
/* 192 */             float f = this.random.nextFloat() * 0.6F + 0.1F;
/* 193 */             float f1 = this.random.nextFloat() * 0.6F + 0.1F;
/* 194 */             float f2 = this.random.nextFloat() * 0.6F + 0.1F;
/*     */             
/* 196 */             while (itemstack.field_77994_a > 0) {
/* 197 */               int j = this.random.nextInt(21) + 10;
/*     */               
/* 199 */               if (j > itemstack.field_77994_a) {
/* 200 */                 j = itemstack.field_77994_a;
/*     */               }
/*     */               
/* 203 */               itemstack.field_77994_a -= j;
/* 204 */               EntityItem entityitem = new EntityItem(world, (x + f), (y + f1), (z + f2), new ItemStack(itemstack.func_77973_b(), j, itemstack.func_77960_j()));
/*     */               
/* 206 */               if (itemstack.func_77942_o()) {
/* 207 */                 entityitem.func_92059_d().func_77982_d((NBTTagCompound)itemstack.func_77978_p().func_74737_b());
/*     */               }
/*     */               
/* 210 */               float f3 = 0.025F;
/* 211 */               entityitem.field_70159_w = ((float)this.random.nextGaussian() * f3);
/* 212 */               entityitem.field_70181_x = ((float)this.random.nextGaussian() * f3 + 0.1F);
/* 213 */               entityitem.field_70179_y = ((float)this.random.nextGaussian() * f3);
/* 214 */               world.func_72838_d((Entity)entityitem);
/*     */             } 
/*     */           } 
/*     */         } 
/* 218 */         world.func_147453_f(x, y, z, block);
/*     */       } 
/*     */     } 
/* 221 */     super.func_149749_a(world, x, y, z, block, meta);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_149734_b(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
/* 227 */     if (this.isBurning2) {
/*     */       
/* 229 */       int l = p_149734_1_.func_72805_g(p_149734_2_, p_149734_3_, p_149734_4_);
/* 230 */       float f = p_149734_2_ + 0.5F;
/* 231 */       float f1 = p_149734_3_ + 0.0F + p_149734_5_.nextFloat() * 6.0F / 16.0F;
/* 232 */       float f2 = p_149734_4_ + 0.5F;
/* 233 */       float f3 = 0.52F;
/* 234 */       float f4 = p_149734_5_.nextFloat() * 0.6F - 0.3F;
/*     */       
/* 236 */       if (l == 4) {
/*     */         
/* 238 */         p_149734_1_.func_72869_a("smoke", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 239 */         p_149734_1_.func_72869_a("flame", (f - f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 241 */       else if (l == 5) {
/*     */         
/* 243 */         p_149734_1_.func_72869_a("smoke", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/* 244 */         p_149734_1_.func_72869_a("flame", (f + f3), f1, (f2 + f4), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 246 */       else if (l == 2) {
/*     */         
/* 248 */         p_149734_1_.func_72869_a("smoke", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/* 249 */         p_149734_1_.func_72869_a("flame", (f + f4), f1, (f2 - f3), 0.0D, 0.0D, 0.0D);
/*     */       }
/* 251 */       else if (l == 3) {
/*     */         
/* 253 */         p_149734_1_.func_72869_a("smoke", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/* 254 */         p_149734_1_.func_72869_a("flame", (f + f4), f1, (f2 + f3), 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\furnace\UltimateFurnace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */