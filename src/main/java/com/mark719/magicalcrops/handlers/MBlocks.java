/*    */ package com.mark719.magicalcrops.handlers;
/*    */
/*    */ import com.mark719.magicalcrops.MagicalCrops;
/*    */ import com.mark719.magicalcrops.blocks.BlockCropBooster;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceBlock;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceBrick;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceBrick2;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceLamp;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceSquare;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceStone;
/*    */ import com.mark719.magicalcrops.blocks.BlockEssenceStorage;
/*    */ import com.mark719.magicalcrops.blocks.BlockFarmlandAccio;
/*    */ import com.mark719.magicalcrops.blocks.BlockFarmlandCrucio;
/*    */ import com.mark719.magicalcrops.blocks.BlockFarmlandImperio;
/*    */ import com.mark719.magicalcrops.blocks.BlockFarmlandZivicio;
/*    */ import com.mark719.magicalcrops.blocks.BlockMinicioOre;
/*    */ import com.mark719.magicalcrops.blocks.BlockMinicioOreEnd;
/*    */ import com.mark719.magicalcrops.blocks.BlockMinicioOreNether;
/*    */ import com.mark719.magicalcrops.blocks.BlockWitherProof;
/*    */ import com.mark719.magicalcrops.blocks.BlockWitherProofGlass;
/*    */ import com.mark719.magicalcrops.furnace.AccioFurnace;
/*    */ import com.mark719.magicalcrops.furnace.CrucioFurnace;
/*    */ import com.mark719.magicalcrops.furnace.ImperioFurnace;
/*    */ import com.mark719.magicalcrops.furnace.UltimateFurnace;
/*    */ import com.mark719.magicalcrops.furnace.ZivicioFurnace;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */
/*    */
/*    */
/*    */ public class MBlocks
        /*    */ {
    /* 33 */   public static Block MinicioOre = (new BlockMinicioOre()).setUnlocalizedName("MinicioOre");
    /* 34 */   public static Block MinicioOreNether = (new BlockMinicioOreNether()).setUnlocalizedName("MinicioOreNether");
    /* 35 */   public static Block MinicioOreEnd = (new BlockMinicioOreEnd()).setUnlocalizedName("MinicioOreEnd");
    /*    */
    /*    */
    /* 38 */   public static Block CropBooster = (new BlockCropBooster()).setUnlocalizedName("CropBooster");
    /*    */
    /*    */
    /* 41 */   public static Block FarmlandAccio = (new BlockFarmlandAccio()).setUnlocalizedName("FarmlandAccio");
    /* 42 */   public static Block FarmlandCrucio = (new BlockFarmlandCrucio()).setUnlocalizedName("FarmlandCrucio");
    /* 43 */   public static Block FarmlandImperio = (new BlockFarmlandImperio()).setUnlocalizedName("FarmlandImperio");
    /* 44 */   public static Block FarmlandZivicio = (new BlockFarmlandZivicio()).setUnlocalizedName("FarmlandZivicio");
    /*    */
    /*    */
    /* 47 */   public static Block EssenceStone = (new BlockEssenceStone()).setUnlocalizedName("EssenceStone");
    /* 48 */   public static Block EssenceStorage = (new BlockEssenceStorage(Material.rock)).setUnlocalizedName("EssenceStorage");
    /* 49 */   public static Block EssenceBlock = (new BlockEssenceBlock(Material.rock)).setUnlocalizedName("EssenceBlock");
    /* 50 */   public static Block EssenceLamp = (new BlockEssenceLamp(Material.rock)).setUnlocalizedName("EssenceLamp");
    /* 51 */   public static Block EssenceBrick = (new BlockEssenceBrick(Material.rock)).setUnlocalizedName("EssenceBrick");
    /* 52 */   public static Block EssenceBrick2 = (new BlockEssenceBrick2(Material.rock)).setUnlocalizedName("EssenceBrick2");
    /* 53 */   public static Block EssenceSquare = (new BlockEssenceSquare(Material.rock)).setUnlocalizedName("EssenceSquare");
    /* 54 */   public static Block WitherProof = (new BlockWitherProof()).setUnlocalizedName("WitherProof");
    /* 55 */   public static Block WitherProofGlass = (new BlockWitherProofGlass()).setUnlocalizedName("WitherProofGlass");
    /*    */
    /*    */
    /* 58 */   public static Block AccioFurnace = (new AccioFurnace(false)).setUnlocalizedName("AccioFurnace").setCreativeTab(MagicalCrops.tabMagical);
    /* 59 */   public static Block AccioFurnaceActive = (new AccioFurnace(true)).setUnlocalizedName("AccioFurnaceActive");
    /*    */
    /* 61 */   public static Block CrucioFurnace = (new CrucioFurnace(false)).setUnlocalizedName("CrucioFurnace").setCreativeTab(MagicalCrops.tabMagical);
    /* 62 */   public static Block CrucioFurnaceActive = (new CrucioFurnace(true)).setUnlocalizedName("CrucioFurnaceActive");
    /*    */
    /* 64 */   public static Block ImperioFurnace = (new ImperioFurnace(false)).setUnlocalizedName("ImperioFurnace").setCreativeTab(MagicalCrops.tabMagical);
    /* 65 */   public static Block ImperioFurnaceActive = (new ImperioFurnace(true)).setUnlocalizedName("ImperioFurnaceActive");
    /*    */
    /* 67 */   public static Block ZivicioFurnace = (new ZivicioFurnace(false)).setUnlocalizedName("ZivicioFurnace").setCreativeTab(MagicalCrops.tabMagical);
    /* 68 */   public static Block ZivicioFurnaceActive = (new ZivicioFurnace(true)).setUnlocalizedName("ZivicioFurnaceActive");
    /*    */
    /* 70 */   public static Block UltimateFurnace = (new UltimateFurnace(false)).setUnlocalizedName("UltimateFurnace").setCreativeTab(MagicalCrops.tabMagical);
    /* 71 */   public static Block UltimateFurnaceActive = (new UltimateFurnace(true)).setUnlocalizedName("UltimateFurnaceActive");
    /*    */ }


/* Location:              C:\Users\Вадим\AppData\Roaming\.minecraft\versions\testcrop\mods\magicalcrops-4.0.0_PUBLIC_BETA_3.jar!\com\mark719\magicalcrops\handlers\MBlocks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */