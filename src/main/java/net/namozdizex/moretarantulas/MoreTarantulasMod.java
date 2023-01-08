package net.namozdizex.moretarantulas;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.namozdizex.moretarantulas.entity.*;
import net.namozdizex.moretarantulas.registry.MTEntity;
import net.namozdizex.moretarantulas.registry.MTItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreTarantulasMod implements ModInitializer {
	public static final String MOD_ID = "moretarantulas";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final CreativeModeTab TAB = FabricItemGroupBuilder.build(new ResourceLocation(MoreTarantulasMod.MOD_ID, "main"), () -> new ItemStack(MTItems.ELECTRIC_BLUE_SPAWN_EGG));

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		MTEntity.init();
		MTItems.init();

		FabricDefaultAttributeRegistry.register(MTEntity.ELECTRIC_BLUE_TARANTULA, ElectricBlueTarantula.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MTEntity.BIG_BLACK_TARANTULA, BigBlackTarantula.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MTEntity.TAKSINUS_BAMBUS_TARANTULA, TaksinusBambusTarantula.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MTEntity.METALLICA_TARANTULA, MetallicaTarantula.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MTEntity.PTERINOCHILUS_MURINUS_TARANTULA, PterinochilusMurinusTarantula.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MTEntity.GOLDEN_KNEE_TARANTULA, GoldenKneeTarantula.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MTEntity.RED_KNEE_TARANTULA, RedKneeTarantula.createMobAttributes());
	}
}
