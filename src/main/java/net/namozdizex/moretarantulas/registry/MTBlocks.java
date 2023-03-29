package net.namozdizex.moretarantulas.registry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.namozdizex.moretarantulas.MoreTarantulasMod;
import net.namozdizex.moretarantulas.world.level.block.TarantulasEggBlock;

public class MTBlocks {
    public static final Block TARANTULA_EGG = new TarantulasEggBlock(BlockBehaviour.Properties.of(Material.EGG).sound(SoundType.MUD).requiresCorrectToolForDrops());
    public static final Block TARANTULA_EGG_RIPPING_1 = new TarantulasEggBlock(BlockBehaviour.Properties.of(Material.EGG).sound(SoundType.MUD).requiresCorrectToolForDrops());
    public static final Block TARANTULA_EGG_RIPPING_2 = new TarantulasEggBlock(BlockBehaviour.Properties.of(Material.EGG).sound(SoundType.MUD).requiresCorrectToolForDrops());

    public static void init() {
        register("tarantula_egg", TARANTULA_EGG, new Item.Properties().tab(MoreTarantulasMod.TAB));
        register("tarantula_egg_ripping_1", TARANTULA_EGG_RIPPING_1, new Item.Properties().tab(MoreTarantulasMod.TAB));
        register("tarantula_egg_ripping_2", TARANTULA_EGG_RIPPING_2, new Item.Properties().tab(MoreTarantulasMod.TAB));
    }

    public static void register(String key, Block block, Object o)
    {
        register(key, block, null);
    }

    public static void register(String key, Block block, Item.Properties properties)
    {
        Registry.register(Registry.BLOCK, new ResourceLocation(MoreTarantulasMod.MOD_ID, key), block);

        if (properties != null);
        {
            Registry.register(Registry.ITEM, new ResourceLocation(MoreTarantulasMod.MOD_ID, key), new BlockItem(block, properties));
        }
    }
    private static Boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType entityType)
    {
        return false;
    }

    private static Boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos)
    {
        return false;
    }
}
