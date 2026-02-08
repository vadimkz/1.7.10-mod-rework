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
  private IIcon[] icons;
  
  private static final String __OBFID = "CL_00000222";
  
  public BlockMagicalCrops() {
    setTickRandomly(true);
    float f = 0.5F;
    setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    setCreativeTab((CreativeTabs)null);
    setHardness(0.0F);
    setStepSound(soundTypeGrass);
    disableStats();
  }
  
  public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
    if (ConfigMain.CROP_DAMAGE) {
      if (entity instanceof net.minecraft.entity.EntityLiving || entity instanceof net.minecraft.entity.player.EntityPlayer) {
        int meta = world.getBlockMetadata(x, y, z);
        if (meta == 7) {
          entity.attackEntityFrom(DamageSource.magic, 1.0F);
        } else if (meta < 7) {
          entity.attackEntityFrom(DamageSource.magic, 0.5F);
        } 
      } 
    } else {
      return;
    } 
  }
  
  public boolean canBlockStay(World world, int x, int y, int z) {
    return world.getBlock(x, y - 1, z).canSustainPlant((IBlockAccess)world, x, y - 1, z, ForgeDirection.UP, (IPlantable)this);
  }
  
  public boolean canPlaceBlockOn(Block p_149854_1_) {
    return (p_149854_1_ == Blocks.farmland);
  }
  
  public void updateTick(World world, int x, int y, int z, Random random) {
    super.updateTick(world, x, y, z, random);
    if (world.getBlockLightValue(x, y + 1, z) >= 9) {
      int meta = world.getBlockMetadata(x, y, z);
      if (meta < 7) {
        float f = func_149864_n(world, x, y, z);
        if (random.nextInt((int)(25.0F / f) + 1) == 0) {
          meta++;
          world.setBlockMetadataWithNotify(x, y, z, meta, 2);
        } 
      } 
    } 
  }
  
  public void fertilize(World world, int x, int y, int z) {
    int l = world.getBlockMetadata(x, y, z) + MathHelper.getRandomIntegerInRange(world.rand, 2, 5);
    if (l > 7)
      l = 7; 
    world.setBlockMetadataWithNotify(x, y, z, 1, 2);
  }
  
  public float func_149864_n(World world, int x, int y, int z) {
    float f = 0.1F;
    Block block = world.getBlock(x, y, z - 1);
    Block block1 = world.getBlock(x, y, z + 1);
    Block block2 = world.getBlock(x - 1, y, z);
    Block block3 = world.getBlock(x + 1, y, z);
    Block block4 = world.getBlock(x - 1, y, z - 1);
    Block block5 = world.getBlock(x + 1, y, z - 1);
    Block block6 = world.getBlock(x + 1, y, z + 1);
    Block block7 = world.getBlock(x - 1, y, z + 1);
    boolean flag = (block2 == this || block3 == this);
    boolean flag1 = (block == this || block1 == this);
    boolean flag2 = (block4 == this || block5 == this || block6 == this || block7 == this);
    for (int l = x - 1; l <= x + 1; l++) {
      for (int i1 = z - 1; i1 <= z + 1; i1++) {
        float f1 = 0.0F;
        if (world.getBlock(l, y - 1, i1).canSustainPlant((IBlockAccess)world, l, y - 1, i1, ForgeDirection.UP, (IPlantable)this)) {
          f1 = 1.0F;
          if (world.getBlock(l, y - 1, i1).isFertile(world, l, y - 1, i1))
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
  
  protected Item getSeed() {
    return Items.wheat_seeds;
  }
  
  protected Item getCrop() {
    return Items.wheat;
  }
  
  public Item getItemDropped(int meta, Random random, int fortune) {
    return (meta == 7) ? getCrop() : getSeed();
  }
  
  public int quantityDropped(Random random) {
    return 1;
  }
  
  @SideOnly(Side.CLIENT)
  public Item getItem(World world, int x, int y, int z) {
    return getSeed();
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int p_149691_1_, int meta) {
    if (meta < 0 || meta > 7)
      meta = 7; 
    return this.icons[meta];
  }
  
  public int getRenderType() {
    return 1;
  }
  
  public boolean canFertilize(World world, int x, int y, int z, boolean p_149851_5_) {
    return (world.getBlockMetadata(x, y, z) != 7);
  }
  
  public boolean shouldFertilize(World world, Random random, int x, int y, int z) {
    return true;
  }
  
  public void fertilize(World world, Random random, int x, int y, int z) {}
  
  @SideOnly(Side.CLIENT)
  public void randomDisplayTick(World world, int x, int y, int z, Random random) {
    super.randomDisplayTick(world, x, y, z, random);
    int meta = world.getBlockMetadata(x, y, z);
    if (ConfigMain.CROP_EFFECTS)
      if (random.nextInt(5) == 0 && meta >= 7) {
        world.spawnParticle("instantSpell", (x + random.nextFloat()), (y + 0.6F), (z + random.nextFloat()), 0.0D, 0.0D, 0.0D);
      } else if (random.nextInt(5) == 0 && meta <= 6) {
        world.spawnParticle("enchantmenttable", (x + random.nextFloat()), (y + 0.9F), (z + random.nextFloat()), 0.0D, 0.0D, 0.0D);
      }  
  }
  
  public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
    ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);
    if (metadata >= 7 && !ConfigMain.PLANT_ON_BREAK)
      for (int i = 0; i < 1 + fortune; i++) {
        if (world.rand.nextInt(7) <= metadata)
          ret.add(new ItemStack(getSeed(), 1, 0)); 
      }  
    if (metadata >= 7 && ConfigMain.SECOND_SEED_CHANCE > 0)
      for (int i = 0; i < 1 + fortune; i++) {
        if (world.rand.nextInt(100) <= Math.max(1, ConfigMain.SECOND_SEED_CHANCE))
          ret.add(new ItemStack(getSeed(), 1, 0)); 
      }  
    return ret;
  }
}
