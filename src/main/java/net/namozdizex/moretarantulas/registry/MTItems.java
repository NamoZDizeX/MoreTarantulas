package net.namozdizex.moretarantulas.registry;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.namozdizex.moretarantulas.MoreTarantulasMod;

public class MTItems {

    public static final Item ELECTRIC_BLUE_SPAWN_EGG = new SpawnEggItem(MTEntity.ELECTRIC_BLUE_TARANTULA, 0x082bfa ,0x060606, new Item.Properties().tab(MoreTarantulasMod.TAB));
    public static final Item BIG_BLACK_SPAWN_EGG = new SpawnEggItem(MTEntity.BIG_BLACK_TARANTULA, 0x030303 ,0x030303, new Item.Properties().tab(MoreTarantulasMod.TAB));
    public static final Item TAKSINUS_BAMBUS_SPAWN_EGG = new SpawnEggItem(MTEntity.TAKSINUS_BAMBUS_TARANTULA, 0x1f1f20 ,0xf3e386, new Item.Properties().tab(MoreTarantulasMod.TAB));
    public static final Item METALLICA_SPAWN_EGG = new SpawnEggItem(MTEntity.METALLICA_TARANTULA, 0x0203a1 ,0xfcc705, new Item.Properties().tab(MoreTarantulasMod.TAB));
    public static final Item PTERINOCHILUS_MURINUS_SPAWN_EGG = new SpawnEggItem(MTEntity.PTERINOCHILUS_MURINUS_TARANTULA, 0xd77405,0x020202, new Item.Properties().tab(MoreTarantulasMod.TAB));
    public static final Item GOLDEN_KNEE_SPAWN_EGG = new SpawnEggItem(MTEntity.GOLDEN_KNEE_TARANTULA, 0x030303,0xfcbf05, new Item.Properties().tab(MoreTarantulasMod.TAB));
    public static final Item RED_KNEE_SPAWN_EGG = new SpawnEggItem(MTEntity.RED_KNEE_TARANTULA, 0x030303,0xfc6f05, new Item.Properties().tab(MoreTarantulasMod.TAB));
    public static final Item PARAHYBANA_SPAWN_EGG = new SpawnEggItem(MTEntity.PARAHYBANA_TARANTULA, 0x030303,0xbea761, new Item.Properties().tab(MoreTarantulasMod.TAB));
    public static final Item CURLY_HAIR_SPAWN_EGG = new SpawnEggItem(MTEntity.CURLY_HAIR_TARANTULA, 0x030303,0xbea761, new Item.Properties().tab(MoreTarantulasMod.TAB));
    public static final Item RED_AND_WHITE_SPAWN_EGG = new SpawnEggItem(MTEntity.RED_AND_WHITE_TARANTULA, 0xc1b675,0x9f0101, new Item.Properties().tab(MoreTarantulasMod.TAB));

    public static void init() {

        register("electric_blue_spawn_egg", ELECTRIC_BLUE_SPAWN_EGG);
        register("big_black_spawn_egg", BIG_BLACK_SPAWN_EGG);
        register("taksinus_bambus_spawn_egg", TAKSINUS_BAMBUS_SPAWN_EGG);
        register("metallica_spawn_egg", METALLICA_SPAWN_EGG);
        register("pterinochilus_murinus_spawn_egg",PTERINOCHILUS_MURINUS_SPAWN_EGG);
        register("golden_knee_spawn_egg", GOLDEN_KNEE_SPAWN_EGG);
        register("red_knee_spawn_egg", RED_KNEE_SPAWN_EGG);
        register("parahybana_spawn_egg", PARAHYBANA_SPAWN_EGG);
        register("curly_hair_spawn_egg", CURLY_HAIR_SPAWN_EGG);
        register("red_and_white_spawn_egg", RED_AND_WHITE_SPAWN_EGG);
    }

    public static void register(String key, Item item) {
        Registry.register(Registry.ITEM, new ResourceLocation(MoreTarantulasMod.MOD_ID, key), item);
    }
}
