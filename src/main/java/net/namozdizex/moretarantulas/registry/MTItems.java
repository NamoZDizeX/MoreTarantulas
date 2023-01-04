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

    public static void init() {

        register("electric_blue_spawn_egg", ELECTRIC_BLUE_SPAWN_EGG);
        register("big_black_spawn_egg", BIG_BLACK_SPAWN_EGG);
        register("taksinus_bambus_spawn_egg", TAKSINUS_BAMBUS_SPAWN_EGG);
        register("metallica_spawn_egg", METALLICA_SPAWN_EGG);
    }

    public static void register(String key, Item item) {
        Registry.register(Registry.ITEM, new ResourceLocation(MoreTarantulasMod.MOD_ID, key), item);
    }
}
