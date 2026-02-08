package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.config.ConfigMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockMagicalCrops extends BlockBush implements IGrowable {
  @SideOnly(Side.CLIENT)
  private IIcon[] field_149867_a;
  
  private static final String __OBFID = "CL_00000222";
  
  public BlockMagicalCrops() {
    func_149675_a(true);
    float f = 0.5F;
    func_149676_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    func_149647_a((CreativeTabs)null);
    func_149711_c(0.0F);
    func_149672_a(field_149779_h);
    func_149649_H();
  }
  
  public void func_149670_a(World world, int x, int y, int z, Entity entity) {
    if (ConfigMain.CROP_DAMAGE) {
      if (entity instanceof net.minecraft.entity.EntityLiving || entity instanceof net.minecraft.entity.player.EntityPlayer) {
        int meta = world.func_72805_g(x, y, z);
        if (meta == 7) {
          entity.func_70097_a(DamageSource.field_76376_m, 1.0F);
        } else if (meta < 7) {
          entity.func_70097_a(DamageSource.field_76376_m, 0.5F);
        } 
      } 
    } else {
      return;
    } 
  }
  
  public boolean func_149718_j(World world, int x, int y, int z) {
    return world.func_147439_a(x, y - 1, z).canSustainPlant((IBlockAccess)world, x, y - 1, z, ForgeDirection.UP, (IPlantable)this);
  }
  
  public boolean func_149854_a(Block p_149854_1_) {
    return (p_149854_1_ == Blocks.field_150458_ak);
  }
  
  public void func_149674_a(World world, int x, int y, int z, Random random) {
    super.func_149674_a(world, x, y, z, random);
    if (world.func_72957_l(x, y + 1, z) >= 9) {
      int meta = world.func_72805_g(x, y, z);
      if (meta < 7) {
        float f = func_149864_n(world, x, y, z);
        if (random.nextInt((int)(25.0F / f) + 1) == 0) {
          meta++;
          world.func_72921_c(x, y, z, meta, 2);
        } 
      } 
    } 
  }
  
  public void func_149863_m(World world, int x, int y, int z) {
    int l = world.func_72805_g(x, y, z) + MathHelper.func_76136_a(world.field_73012_v, 2, 5);
    if (l > 7)
      l = 7; 
    world.func_72921_c(x, y, z, 1, 2);
  }
  
  public float func_149864_n(World world, int x, int y, int z) {
    float f = 0.1F;
    Block block = world.func_147439_a(x, y, z - 1);
    Block block1 = world.func_147439_a(x, y, z + 1);
    Block block2 = world.func_147439_a(x - 1, y, z);
    Block block3 = world.func_147439_a(x + 1, y, z);
    Block block4 = world.func_147439_a(x - 1, y, z - 1);
    Block block5 = world.func_147439_a(x + 1, y, z - 1);
    Block block6 = world.func_147439_a(x + 1, y, z + 1);
    Block block7 = world.func_147439_a(x - 1, y, z + 1);
    boolean flag = (block2 == this || block3 == this);
    boolean flag1 = (block == this || block1 == this);
    boolean flag2 = (block4 == this || block5 == this || block6 == this || block7 == this);
    for (int l = x - 1; l <= x + 1; l++) {
      for (int i1 = z - 1; i1 <= z + 1; i1++) {
        float f1 = 0.0F;
        if (world.func_147439_a(l, y - 1, i1).canSustainPlant((IBlockAccess)world, l, y - 1, i1, ForgeDirection.UP, (IPlantable)this)) {
          f1 = 1.0F;
          if (world.func_147439_a(l, y - 1, i1).isFertile(world, l, y - 1, i1))
            f1 = 3.0F; 
        } 
        if (l != x || i1 != z)
          f1 /= 4.0F; 
        f += f1;
      } 
    } 
    if (flag2 || (flag && flag1))
      f /= 2.0F; 
    return f;
  }
  
  protected Item func_149866_i() {
    return Items.field_151014_N;
  }
  
  protected Item func_149865_P() {
    return Items.field_151015_O;
  }
  
  public Item func_149650_a(int meta, Random random, int p_149650_3_) {
    return (meta == 7) ? func_149865_P() : func_149866_i();
  }
  
  public int func_149745_a(Random random) {
    return 1;
  }
  
  @SideOnly(Side.CLIENT)
  public Item func_149694_d(World world, int x, int y, int z) {
    return func_149866_i();
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon func_149691_a(int p_149691_1_, int meta) {
    if (meta < 0 || meta > 7)
      meta = 7; 
    return this.field_149867_a[meta];
  }
  
  public int func_149645_b() {
    return 1;
  }
  
  public boolean func_149851_a(World world, int x, int y, int z, boolean p_149851_5_) {
    return (world.func_72805_g(x, y, z) != 7);
  }
  
  public boolean func_149852_a(World world, Random random, int x, int y, int z) {
    return true;
  }
  
  public void func_149853_b(World world, Random random, int x, int y, int z) {}
  
  @SideOnly(Side.CLIENT)
  public void func_149734_b(World world, int x, int y, int z, Random random) {
    super.func_149734_b(world, x, y, z, random);
    int meta = world.func_72805_g(x, y, z);
    if (ConfigMain.CROP_EFFECTS)
      if (random.nextInt(5) == 0 && meta >= 7) {
        world.func_72869_a("instantSpell", (x + random.nextFloat()), (y + 0.6F), (z + random.nextFloat()), 0.0D, 0.0D, 0.0D);
      } else if (random.nextInt(5) == 0 && meta <= 6) {
        world.func_72869_a("enchantmenttable", (x + random.nextFloat()), (y + 0.9F), (z + random.nextFloat()), 0.0D, 0.0D, 0.0D);
      }  
  }
  
  public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
    ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
    if (metadata >= 7 && !ConfigMain.PLANT_ON_BREAK)
      for (int i = 0; i < 1 + fortune; i++) {
        if (world.field_73012_v.nextInt(7) <= metadata)
          ret.add(new ItemStack(func_149866_i(), 1, 0)); 
      }  
    if (metadata >= 7 && ConfigMain.SECOND_SEED_CHANCE > 0)
      for (int i = 0; i < 1 + fortune; i++) {
        if (world.field_73012_v.nextInt(100) <= Math.max(1, ConfigMain.SECOND_SEED_CHANCE))
          ret.add(new ItemStack(func_149866_i(), 1, 0)); 
      }  
    return ret;
  }
}
