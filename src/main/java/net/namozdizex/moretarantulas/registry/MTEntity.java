package net.namozdizex.moretarantulas.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.namozdizex.moretarantulas.MoreTarantulasMod;
import net.namozdizex.moretarantulas.entity.*;

public class MTEntity {

    public static final EntityType<ElectricBlueTarantula> ELECTRIC_BLUE_TARANTULA = FabricEntityTypeBuilder.create(MobCategory.MONSTER, ElectricBlueTarantula::new).dimensions(EntityDimensions.fixed(0.85F, 0.85F)).trackRangeBlocks(4).build();
    public static final EntityType<BigBlackTarantula> BIG_BLACK_TARANTULA = FabricEntityTypeBuilder.create(MobCategory.MONSTER, BigBlackTarantula::new).dimensions(EntityDimensions.fixed(0.85F, 0.85F)).trackRangeBlocks(4).build();
    public static final EntityType<TaksinusBambusTarantula> TAKSINUS_BAMBUS_TARANTULA = FabricEntityTypeBuilder.create(MobCategory.MONSTER, TaksinusBambusTarantula::new).dimensions(EntityDimensions.fixed(0.85F,0.85F)).trackRangeBlocks(4).build();
    public static final EntityType<MetallicaTarantula> METALLICA_TARANTULA = FabricEntityTypeBuilder.create(MobCategory.MONSTER, MetallicaTarantula::new).dimensions(EntityDimensions.fixed(0.85F,0.85F)).trackRangeBlocks(4).build();
    public static final EntityType<PterinochilusMurinusTarantula> PTERINOCHILUS_MURINUS_TARANTULA = FabricEntityTypeBuilder.create(MobCategory.MONSTER, PterinochilusMurinusTarantula::new).dimensions(EntityDimensions.fixed(0.85F, 0.85F)).trackRangeBlocks(4).build();
    public static final EntityType<GoldenKneeTarantula> GOLDEN_KNEE_TARANTULA = FabricEntityTypeBuilder.create(MobCategory.MONSTER, GoldenKneeTarantula::new).dimensions(EntityDimensions.fixed(0.85F,0.85F)).trackRangeBlocks(4).build();
    public static final EntityType<RedKneeTarantula> RED_KNEE_TARANTULA = FabricEntityTypeBuilder.create(MobCategory.MONSTER, RedKneeTarantula::new).dimensions(EntityDimensions.fixed(0.85F,0.85F)).trackRangeBlocks(4).build();
    public static final EntityType<ParahybanaTarantula> PARAHYBANA_TARANTULA = FabricEntityTypeBuilder.create(MobCategory.MONSTER, ParahybanaTarantula::new).dimensions(EntityDimensions.fixed(0.85F,0.85F)).trackRangeBlocks(4).build();
    public static final EntityType<CurlyHairTarantula> CURLY_HAIR_TARANTULA = FabricEntityTypeBuilder.create(MobCategory.MONSTER, CurlyHairTarantula::new).dimensions(EntityDimensions.fixed(0.85F,0.85F)).trackRangeBlocks(4).build();
    public static final EntityType<RedAndWhiteTarantula> RED_AND_WHITE_TARANTULA = FabricEntityTypeBuilder.create(MobCategory.MONSTER, RedAndWhiteTarantula::new).dimensions(EntityDimensions.fixed(0.85F,0.85F)).trackRangeBlocks(4).build();

    public static void init() {

        register("electric_blue", ELECTRIC_BLUE_TARANTULA);
        register("big_black", BIG_BLACK_TARANTULA);
        register("taksinus_bambus", TAKSINUS_BAMBUS_TARANTULA);
        register("metallica", METALLICA_TARANTULA);
        register("pterinochilus_murinus", PTERINOCHILUS_MURINUS_TARANTULA);
        register("golden_knee", GOLDEN_KNEE_TARANTULA);
        register("red_knee", RED_KNEE_TARANTULA);
        register("parahybana", PARAHYBANA_TARANTULA);
        register("curly_hair", CURLY_HAIR_TARANTULA);
        register("red_and_white", RED_AND_WHITE_TARANTULA);

    }

    private static <T extends Entity> EntityType<T> register(String key, EntityType<T> type)
    {
        return Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(MoreTarantulasMod.MOD_ID, key), type);
    }
}
