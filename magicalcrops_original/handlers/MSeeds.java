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
  public static Block farmland = Blocks.farmland;
  
  public static Item AirSeeds = (new AirSeeds(MCrops.AirCrop, farmland)).setTextureName("magicalcrops:seeds_air").setUnlocalizedName("AirSeeds");
  
  public static Item CoalSeeds = (new CoalSeeds(MCrops.CoalCrop, farmland)).setTextureName("magicalcrops:seeds_coal").setUnlocalizedName("CoalSeeds");
  
  public static Item DyeSeeds = (new DyeSeeds(MCrops.DyeCrop, farmland)).setTextureName("magicalcrops:seeds_dye").setUnlocalizedName("DyeSeeds");
  
  public static Item EarthSeeds = (new EarthSeeds(MCrops.EarthCrop, farmland)).setTextureName("magicalcrops:seeds_earth").setUnlocalizedName("EarthSeeds");
  
  public static Item FireSeeds = (new FireSeeds(MCrops.FireCrop, farmland)).setTextureName("magicalcrops:seeds_fire").setUnlocalizedName("FireSeeds");
  
  public static Item NatureSeeds = (new NatureSeeds(MCrops.NatureCrop, farmland)).setTextureName("magicalcrops:seeds_nature").setUnlocalizedName("NatureSeeds");
  
  public static Item MinicioSeeds = (new MinicioSeeds(MCrops.MinicioCrop, farmland)).setTextureName("magicalcrops:seeds_minicio").setUnlocalizedName("MinicioSeeds");
  
  public static Item WaterSeeds = (new WaterSeeds(MCrops.WaterCrop, farmland)).setTextureName("magicalcrops:seeds_water").setUnlocalizedName("WaterSeeds");
  
  public static Item RedstoneSeeds = (new RedstoneSeeds(MCrops.RedstoneCrop, farmland)).setTextureName("magicalcrops:seeds_redstone").setUnlocalizedName("RedstoneSeeds");
  
  public static Item GlowstoneSeeds = (new GlowstoneSeeds(MCrops.GlowstoneCrop, farmland)).setTextureName("magicalcrops:seeds_glowstone").setUnlocalizedName("GlowstoneSeeds");
  
  public static Item ObsidianSeeds = (new ObsidianSeeds(MCrops.ObsidianCrop, farmland)).setTextureName("magicalcrops:seeds_obsidian").setUnlocalizedName("ObsidianSeeds");
  
  public static Item NetherSeeds = (new NetherSeeds(MCrops.NetherCrop, farmland)).setTextureName("magicalcrops:seeds_nether").setUnlocalizedName("NetherSeeds");
  
  public static Item IronSeeds = (new IronSeeds(MCrops.IronCrop, farmland)).setTextureName("magicalcrops:seeds_iron").setUnlocalizedName("IronSeeds");
  
  public static Item GoldSeeds = (new GoldSeeds(MCrops.GoldCrop, farmland)).setTextureName("magicalcrops:seeds_gold").setUnlocalizedName("GoldSeeds");
  
  public static Item LapisSeeds = (new LapisSeeds(MCrops.LapisCrop, farmland)).setTextureName("magicalcrops:seeds_lapis").setUnlocalizedName("LapisSeeds");
  
  public static Item ExperienceSeeds = (new ExperienceSeeds(MCrops.ExperienceCrop, farmland)).setTextureName("magicalcrops:seeds_experience").setUnlocalizedName("ExperienceSeeds");
  
  public static Item QuartzSeeds = (new QuartzSeeds(MCrops.QuartzCrop, farmland)).setTextureName("magicalcrops:seeds_quartz").setUnlocalizedName("QuartzSeeds");
  
  public static Item DiamondSeeds = (new DiamondSeeds(MCrops.DiamondCrop, farmland)).setTextureName("magicalcrops:seeds_diamond").setUnlocalizedName("DiamondSeeds");
  
  public static Item EmeraldSeeds = (new EmeraldSeeds(MCrops.EmeraldCrop, farmland)).setTextureName("magicalcrops:seeds_emerald").setUnlocalizedName("EmeraldSeeds");
  
  public static Item BlazeSeeds = (new BlazeSeeds(MCrops.BlazeCrop, farmland)).setTextureName("magicalcrops:seeds_blaze").setUnlocalizedName("BlazeSeeds");
  
  public static Item CreeperSeeds = (new CreeperSeeds(MCrops.CreeperCrop, farmland)).setTextureName("magicalcrops:seeds_creeper").setUnlocalizedName("CreeperSeeds");
  
  public static Item EndermanSeeds = (new EndermanSeeds(MCrops.EndermanCrop, farmland)).setTextureName("magicalcrops:seeds_ender").setUnlocalizedName("EndermanSeeds");
  
  public static Item GhastSeeds = (new GhastSeeds(MCrops.GhastCrop, farmland)).setTextureName("magicalcrops:seeds_ghast").setUnlocalizedName("GhastSeeds");
  
  public static Item SkeletonSeeds = (new SkeletonSeeds(MCrops.SkeletonCrop, farmland)).setTextureName("magicalcrops:seeds_skeleton").setUnlocalizedName("SkeletonSeeds");
  
  public static Item SlimeSeeds = (new SlimeSeeds(MCrops.SlimeCrop, farmland)).setTextureName("magicalcrops:seeds_slime").setUnlocalizedName("SlimeSeeds");
  
  public static Item SpiderSeeds = (new SpiderSeeds(MCrops.SpiderCrop, farmland)).setTextureName("magicalcrops:seeds_spider").setUnlocalizedName("SpiderSeeds");
  
  public static Item WitherSeeds = (new WitherSeeds(MCrops.WitherCrop, farmland)).setTextureName("magicalcrops:seeds_wither").setUnlocalizedName("WitherSeeds");
  
  public static Item ChickenSeeds = (new ChickenSeeds(MCrops.ChickenCrop, farmland)).setTextureName("magicalcrops:seeds_chicken").setUnlocalizedName("ChickenSeeds");
  
  public static Item CowSeeds = (new CowSeeds(MCrops.CowCrop, farmland)).setTextureName("magicalcrops:seeds_cow").setUnlocalizedName("CowSeeds");
  
  public static Item PigSeeds = (new PigSeeds(MCrops.PigCrop, farmland)).setTextureName("magicalcrops:seeds_pig").setUnlocalizedName("PigSeeds");
  
  public static Item SheepSeeds = (new SheepSeeds(MCrops.SheepCrop, farmland)).setTextureName("magicalcrops:seeds_sheep").setUnlocalizedName("SheepSeeds");
}
