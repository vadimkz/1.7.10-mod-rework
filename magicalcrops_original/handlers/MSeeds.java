package com.mark719.magicalcrops.handlers;

import com.mark719.magicalcrops.items.seeds.AirSeeds;
import com.mark719.magicalcrops.items.seeds.BlazeSeeds;
import com.mark719.magicalcrops.items.seeds.ChickenSeeds;
import com.mark719.magicalcrops.items.seeds.CoalSeeds;
import com.mark719.magicalcrops.items.seeds.CowSeeds;
import com.mark719.magicalcrops.items.seeds.CreeperSeeds;
import com.mark719.magicalcrops.items.seeds.DiamondSeeds;
import com.mark719.magicalcrops.items.seeds.DyeSeeds;
import com.mark719.magicalcrops.items.seeds.EarthSeeds;
import com.mark719.magicalcrops.items.seeds.EmeraldSeeds;
import com.mark719.magicalcrops.items.seeds.EndermanSeeds;
import com.mark719.magicalcrops.items.seeds.ExperienceSeeds;
import com.mark719.magicalcrops.items.seeds.FireSeeds;
import com.mark719.magicalcrops.items.seeds.GhastSeeds;
import com.mark719.magicalcrops.items.seeds.GlowstoneSeeds;
import com.mark719.magicalcrops.items.seeds.GoldSeeds;
import com.mark719.magicalcrops.items.seeds.IronSeeds;
import com.mark719.magicalcrops.items.seeds.LapisSeeds;
import com.mark719.magicalcrops.items.seeds.MinicioSeeds;
import com.mark719.magicalcrops.items.seeds.NatureSeeds;
import com.mark719.magicalcrops.items.seeds.NetherSeeds;
import com.mark719.magicalcrops.items.seeds.ObsidianSeeds;
import com.mark719.magicalcrops.items.seeds.PigSeeds;
import com.mark719.magicalcrops.items.seeds.QuartzSeeds;
import com.mark719.magicalcrops.items.seeds.RedstoneSeeds;
import com.mark719.magicalcrops.items.seeds.SheepSeeds;
import com.mark719.magicalcrops.items.seeds.SkeletonSeeds;
import com.mark719.magicalcrops.items.seeds.SlimeSeeds;
import com.mark719.magicalcrops.items.seeds.SpiderSeeds;
import com.mark719.magicalcrops.items.seeds.WaterSeeds;
import com.mark719.magicalcrops.items.seeds.WitherSeeds;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class MSeeds {
  public static Block farmland = Blocks.field_150458_ak;
  
  public static Item AirSeeds = (new AirSeeds(MCrops.AirCrop, farmland)).func_111206_d("magicalcrops:seeds_air").func_77655_b("AirSeeds");
  
  public static Item CoalSeeds = (new CoalSeeds(MCrops.CoalCrop, farmland)).func_111206_d("magicalcrops:seeds_coal").func_77655_b("CoalSeeds");
  
  public static Item DyeSeeds = (new DyeSeeds(MCrops.DyeCrop, farmland)).func_111206_d("magicalcrops:seeds_dye").func_77655_b("DyeSeeds");
  
  public static Item EarthSeeds = (new EarthSeeds(MCrops.EarthCrop, farmland)).func_111206_d("magicalcrops:seeds_earth").func_77655_b("EarthSeeds");
  
  public static Item FireSeeds = (new FireSeeds(MCrops.FireCrop, farmland)).func_111206_d("magicalcrops:seeds_fire").func_77655_b("FireSeeds");
  
  public static Item NatureSeeds = (new NatureSeeds(MCrops.NatureCrop, farmland)).func_111206_d("magicalcrops:seeds_nature").func_77655_b("NatureSeeds");
  
  public static Item MinicioSeeds = (new MinicioSeeds(MCrops.MinicioCrop, farmland)).func_111206_d("magicalcrops:seeds_minicio").func_77655_b("MinicioSeeds");
  
  public static Item WaterSeeds = (new WaterSeeds(MCrops.WaterCrop, farmland)).func_111206_d("magicalcrops:seeds_water").func_77655_b("WaterSeeds");
  
  public static Item RedstoneSeeds = (new RedstoneSeeds(MCrops.RedstoneCrop, farmland)).func_111206_d("magicalcrops:seeds_redstone").func_77655_b("RedstoneSeeds");
  
  public static Item GlowstoneSeeds = (new GlowstoneSeeds(MCrops.GlowstoneCrop, farmland)).func_111206_d("magicalcrops:seeds_glowstone").func_77655_b("GlowstoneSeeds");
  
  public static Item ObsidianSeeds = (new ObsidianSeeds(MCrops.ObsidianCrop, farmland)).func_111206_d("magicalcrops:seeds_obsidian").func_77655_b("ObsidianSeeds");
  
  public static Item NetherSeeds = (new NetherSeeds(MCrops.NetherCrop, farmland)).func_111206_d("magicalcrops:seeds_nether").func_77655_b("NetherSeeds");
  
  public static Item IronSeeds = (new IronSeeds(MCrops.IronCrop, farmland)).func_111206_d("magicalcrops:seeds_iron").func_77655_b("IronSeeds");
  
  public static Item GoldSeeds = (new GoldSeeds(MCrops.GoldCrop, farmland)).func_111206_d("magicalcrops:seeds_gold").func_77655_b("GoldSeeds");
  
  public static Item LapisSeeds = (new LapisSeeds(MCrops.LapisCrop, farmland)).func_111206_d("magicalcrops:seeds_lapis").func_77655_b("LapisSeeds");
  
  public static Item ExperienceSeeds = (new ExperienceSeeds(MCrops.ExperienceCrop, farmland)).func_111206_d("magicalcrops:seeds_experience").func_77655_b("ExperienceSeeds");
  
  public static Item QuartzSeeds = (new QuartzSeeds(MCrops.QuartzCrop, farmland)).func_111206_d("magicalcrops:seeds_quartz").func_77655_b("QuartzSeeds");
  
  public static Item DiamondSeeds = (new DiamondSeeds(MCrops.DiamondCrop, farmland)).func_111206_d("magicalcrops:seeds_diamond").func_77655_b("DiamondSeeds");
  
  public static Item EmeraldSeeds = (new EmeraldSeeds(MCrops.EmeraldCrop, farmland)).func_111206_d("magicalcrops:seeds_emerald").func_77655_b("EmeraldSeeds");
  
  public static Item BlazeSeeds = (new BlazeSeeds(MCrops.BlazeCrop, farmland)).func_111206_d("magicalcrops:seeds_blaze").func_77655_b("BlazeSeeds");
  
  public static Item CreeperSeeds = (new CreeperSeeds(MCrops.CreeperCrop, farmland)).func_111206_d("magicalcrops:seeds_creeper").func_77655_b("CreeperSeeds");
  
  public static Item EndermanSeeds = (new EndermanSeeds(MCrops.EndermanCrop, farmland)).func_111206_d("magicalcrops:seeds_ender").func_77655_b("EndermanSeeds");
  
  public static Item GhastSeeds = (new GhastSeeds(MCrops.GhastCrop, farmland)).func_111206_d("magicalcrops:seeds_ghast").func_77655_b("GhastSeeds");
  
  public static Item SkeletonSeeds = (new SkeletonSeeds(MCrops.SkeletonCrop, farmland)).func_111206_d("magicalcrops:seeds_skeleton").func_77655_b("SkeletonSeeds");
  
  public static Item SlimeSeeds = (new SlimeSeeds(MCrops.SlimeCrop, farmland)).func_111206_d("magicalcrops:seeds_slime").func_77655_b("SlimeSeeds");
  
  public static Item SpiderSeeds = (new SpiderSeeds(MCrops.SpiderCrop, farmland)).func_111206_d("magicalcrops:seeds_spider").func_77655_b("SpiderSeeds");
  
  public static Item WitherSeeds = (new WitherSeeds(MCrops.WitherCrop, farmland)).func_111206_d("magicalcrops:seeds_wither").func_77655_b("WitherSeeds");
  
  public static Item ChickenSeeds = (new ChickenSeeds(MCrops.ChickenCrop, farmland)).func_111206_d("magicalcrops:seeds_chicken").func_77655_b("ChickenSeeds");
  
  public static Item CowSeeds = (new CowSeeds(MCrops.CowCrop, farmland)).func_111206_d("magicalcrops:seeds_cow").func_77655_b("CowSeeds");
  
  public static Item PigSeeds = (new PigSeeds(MCrops.PigCrop, farmland)).func_111206_d("magicalcrops:seeds_pig").func_77655_b("PigSeeds");
  
  public static Item SheepSeeds = (new SheepSeeds(MCrops.SheepCrop, farmland)).func_111206_d("magicalcrops:seeds_sheep").func_77655_b("SheepSeeds");
}
