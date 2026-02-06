package com.mark719.magicalcrops;

import com.mark719.magicalcrops.config.ConfigCrafting;
import com.mark719.magicalcrops.config.ConfigDisable;
import com.mark719.magicalcrops.config.ConfigMain;
import com.mark719.magicalcrops.events.CropPlantOnBreak;
import com.mark719.magicalcrops.events.FireProtectionEvent;
import com.mark719.magicalcrops.events.MinicioCropBreak;
import com.mark719.magicalcrops.events.MinicioOreBreak;
import com.mark719.magicalcrops.events.MobDropEvent;
import com.mark719.magicalcrops.handlers.Essence;
import com.mark719.magicalcrops.handlers.MBlocks;
import com.mark719.magicalcrops.handlers.MCrops;
import com.mark719.magicalcrops.handlers.MSeeds;
import com.mark719.magicalcrops.handlers.ModCompat;
import com.mark719.magicalcrops.recipes.BlockRecipes;
import com.mark719.magicalcrops.recipes.EnchantmentRecipes;
import com.mark719.magicalcrops.recipes.ItemRecipes;
import com.mark719.magicalcrops.recipes.ResourceRecipes;
import com.mark719.magicalcrops.recipes.SeedRecipes;
import com.mark719.magicalcrops.register.BlockRegister;
import com.mark719.magicalcrops.register.ItemRegister;
import com.mark719.magicalcrops.register.OreDictionaryRegister;
import com.mark719.magicalcrops.worldgen.WorldGenEssence;
import com.mark719.magicalcrops.worldgen.WorldGenEssenceEnd;
import com.mark719.magicalcrops.worldgen.WorldGenEssenceNether;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import java.io.File;

/**
 * Restored main mod class, максимально близко к оригиналу Magical Crops 4.0.0_PUBLIC_BETA_3,
 * но с учётом того, что в нашем проекте MCrops/MSeeds/MBlocks создаются через init().
 *
 * ВАЖНО:
 * - сначала создаём объекты (MBlocks/MCrops/MSeeds), потом регистрируем (ItemRegister/BlockRegister)
 * - остальная логика (compat, oredict, рецепты, worldgen, события, сеть) — как в оригинале.
 */
@Mod(modid = MagicalCrops.MODID, name = MagicalCrops.NAME, version = MagicalCrops.VERSION,
        dependencies = "after:appliedenergistics2;after:Mekanism")
public class MagicalCrops {

    public static final String MODID = "magicalcrops";
    public static final String NAME = "Magical Crops";
    public static final String VERSION = "4.0.0_PUBLIC_BETA_3";

    @Instance(MODID)
    public static MagicalCrops instance;

    public static File CONFIG_DIR;

    /**
     * Креативная вкладка как в оригинале по названию; иконка — Minicio Essence.
     * (Если Essence ещё не зарегистрирована в момент вызова — Forge всё равно подхватит предмет позже,
     * но для надёжности Essence в нашем проекте и так создаётся статически.)
     */
    public static final CreativeTabs tabMagical = new CreativeTabs("magicalcrops") {
        @Override
        public Item getTabIconItem() {
            return Essence.MinicioEssence;
        }
    };

    @SidedProxy(clientSide = "com.mark719.magicalcrops.ClientProxy",
            serverSide = "com.mark719.magicalcrops.CommonProxy")
    public static CommonProxy serverProxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        CONFIG_DIR = new File(event.getModConfigurationDirectory(), "MagicalCrops");
        if (!CONFIG_DIR.exists()) {
            //noinspection ResultOfMethodCallIgnored
            CONFIG_DIR.mkdirs();
        }

        // конфиги — как в оригинале
        ConfigMain.init(new File(CONFIG_DIR, "MagicalCropsMain.cfg"));
        ConfigCrafting.init(new File(CONFIG_DIR, "Crafting.cfg"));
        ConfigDisable.init(new File(CONFIG_DIR, "CropDisableConfig.cfg"));

        // tile entities — как в оригинале
        if (serverProxy != null) {
            serverProxy.registerTileEntities();
        }
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        // 1) Создаём содержимое (в нашем проекте это вынесено в init())
        MBlocks.init();
        MCrops.init();
        MSeeds.init();

        // 2) Регистрируем предметы/блоки (как в оригинале, но после создания объектов)
        ItemRegister.registerItem();
        BlockRegister.registerBlock();

        // 3) Совместимости (как в оригинале)
        ModCompat.loadCompat();

        // 4) OreDictionary (как в оригинале)
        OreDictionaryRegister.oreRegister();

        // 5) Рецепты (как в оригинале)
        ItemRecipes.loadRecipes();
        BlockRecipes.loadRecipes();
        SeedRecipes.loadRecipes();
        ResourceRecipes.loadRecipes();
        if (ConfigMain.ENCHANT_CRAFT) {
            EnchantmentRecipes.loadRecipes();
        }

        // 6) WorldGen (как в оригинале)
        GameRegistry.registerWorldGenerator((IWorldGenerator) new WorldGenEssence(), 0);
        GameRegistry.registerWorldGenerator((IWorldGenerator) new WorldGenEssenceNether(), 0);
        GameRegistry.registerWorldGenerator((IWorldGenerator) new WorldGenEssenceEnd(), 0);

        // 7) События (как в оригинале + наш ПКМ-сбор)
        // В оригинале регистрация CropPlantOnBreak была закомментирована по ConfigMain.PLANT_ON_BREAK,
        // у нас это нужно для ПКМ-сбора, поэтому включаем.
        MinecraftForge.EVENT_BUS.register(new CropPlantOnBreak());

        if (ConfigMain.EXTRA_PICKAXE) {
            MinecraftForge.EVENT_BUS.register(new MinicioOreBreak());
        }
        if (ConfigMain.EXTRA_HOE) {
            MinecraftForge.EVENT_BUS.register(new MinicioCropBreak());
        }
        if (ConfigMain.MOB_ESS_DROP) {
            MinecraftForge.EVENT_BUS.register(new MobDropEvent());
        }
        MinecraftForge.EVENT_BUS.register(new FireProtectionEvent());

        // 8) Сеть (как в оригинале)
        if (serverProxy != null) {
            serverProxy.registerNetworkStuff();
        }
    }
}
