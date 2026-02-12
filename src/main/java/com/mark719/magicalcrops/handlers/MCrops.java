package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.blocks.crops.AirCrop;
import com.mark719.magicalcrops.blocks.crops.BlazeCrop;
import com.mark719.magicalcrops.blocks.crops.ChickenCrop;
import com.mark719.magicalcrops.blocks.crops.CoalCrop;
import com.mark719.magicalcrops.blocks.crops.CowCrop;
import com.mark719.magicalcrops.blocks.crops.CreeperCrop;
import com.mark719.magicalcrops.blocks.crops.DiamondCrop;
import com.mark719.magicalcrops.blocks.crops.DyeCrop;
import com.mark719.magicalcrops.blocks.crops.EarthCrop;
import com.mark719.magicalcrops.blocks.crops.EmeraldCrop;
import com.mark719.magicalcrops.blocks.crops.EndermanCrop;
import com.mark719.magicalcrops.blocks.crops.ExperienceCrop;
import com.mark719.magicalcrops.blocks.crops.FireCrop;
import com.mark719.magicalcrops.blocks.crops.GhastCrop;
import com.mark719.magicalcrops.blocks.crops.GlowstoneCrop;
import com.mark719.magicalcrops.blocks.crops.GoldCrop;
import com.mark719.magicalcrops.blocks.crops.IronCrop;
import com.mark719.magicalcrops.blocks.crops.LapisCrop;
import com.mark719.magicalcrops.blocks.crops.MinicioCrop;
import com.mark719.magicalcrops.blocks.crops.NatureCrop;
import com.mark719.magicalcrops.blocks.crops.NetherCrop;
import com.mark719.magicalcrops.blocks.crops.ObsidianCrop;
import com.mark719.magicalcrops.blocks.crops.PigCrop;
import com.mark719.magicalcrops.blocks.crops.QuartzCrop;
import com.mark719.magicalcrops.blocks.crops.RedstoneCrop;
import com.mark719.magicalcrops.blocks.crops.SheepCrop;
import com.mark719.magicalcrops.blocks.crops.SkeletonCrop;
import com.mark719.magicalcrops.blocks.crops.SlimeCrop;
import com.mark719.magicalcrops.blocks.crops.SpiderCrop;
import com.mark719.magicalcrops.blocks.crops.WaterCrop;
import com.mark719.magicalcrops.blocks.crops.WitherCrop;
import cpw.mods.fml.common.Loader;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MCrops {
  public static Block AirCrop = (new AirCrop()).setUnlocalizedName("AirCrop");
  
  public static Block CoalCrop = (new CoalCrop()).setUnlocalizedName("CoalCrop");
  
  public static Block DyeCrop = (new DyeCrop()).setUnlocalizedName("DyeCrop");
  
  public static Block EarthCrop = (new EarthCrop()).setUnlocalizedName("EarthCrop");
  
  public static Block FireCrop = (new FireCrop()).setUnlocalizedName("FireCrop");
  
  public static Block NatureCrop = (new NatureCrop()).setUnlocalizedName("NatureCrop");
  
  public static Block MinicioCrop = (new MinicioCrop()).setUnlocalizedName("MinicioCrop");
  
  public static Block WaterCrop = (new WaterCrop()).setUnlocalizedName("WaterCrop");
  
  public static Block RedstoneCrop = (new RedstoneCrop()).setUnlocalizedName("RedstoneCrop");
  
  public static Block GlowstoneCrop = (new GlowstoneCrop()).setUnlocalizedName("GlowstoneCrop");
  
  public static Block ObsidianCrop = (new ObsidianCrop()).setUnlocalizedName("ObsidianCrop");
  
  public static Block NetherCrop = (new NetherCrop()).setUnlocalizedName("NetherCrop");
  
  public static Block IronCrop = (new IronCrop()).setUnlocalizedName("IronCrop");
  
  public static Block GoldCrop = (new GoldCrop()).setUnlocalizedName("GoldCrop");
  
  public static Block LapisCrop = (new LapisCrop()).setUnlocalizedName("LapisCrop");
  
  public static Block ExperienceCrop = (new ExperienceCrop()).setUnlocalizedName("ExperienceCrop");
  
  public static Block QuartzCrop = (new QuartzCrop()).setUnlocalizedName("QuartzCrop");
  
  public static Block DiamondCrop = (new DiamondCrop()).setUnlocalizedName("DiamondCrop");
  
  public static Block EmeraldCrop = (new EmeraldCrop()).setUnlocalizedName("EmeraldCrop");
  
  public static Block BlazeCrop = (new BlazeCrop()).setUnlocalizedName("BlazeCrop");
  
  public static Block CreeperCrop = (new CreeperCrop()).setUnlocalizedName("CreeperCrop");
  
  public static Block EndermanCrop = (new EndermanCrop()).setUnlocalizedName("EndermanCrop");
  
  public static Block GhastCrop = (new GhastCrop()).setUnlocalizedName("GhastCrop");
  
  public static Block SkeletonCrop = (new SkeletonCrop()).setUnlocalizedName("SkeletonCrop");
  
  public static Block SlimeCrop = (new SlimeCrop()).setUnlocalizedName("SlimeCrop");
  
  public static Block SpiderCrop = (new SpiderCrop()).setUnlocalizedName("SpiderCrop");
  
  public static Block WitherCrop = (new WitherCrop()).setUnlocalizedName("WitherCrop");
  
  public static Block ChickenCrop = (new ChickenCrop()).setUnlocalizedName("ChickenCrop");
  
  public static Block CowCrop = (new CowCrop()).setUnlocalizedName("CowCrop");
  
  public static Block PigCrop = (new PigCrop()).setUnlocalizedName("PigCrop");
  
  public static Block SheepCrop = (new SheepCrop()).setUnlocalizedName("SheepCrop");


}
