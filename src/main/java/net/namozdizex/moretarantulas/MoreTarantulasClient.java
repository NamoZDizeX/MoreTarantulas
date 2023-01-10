package net.namozdizex.moretarantulas;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.namozdizex.moretarantulas.entity.client.renderer.*;
import net.namozdizex.moretarantulas.registry.MTEntity;

public class MoreTarantulasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(MTEntity.ELECTRIC_BLUE_TARANTULA, ElectricBlueTarantulaRenderer::new);
        EntityRendererRegistry.register(MTEntity.BIG_BLACK_TARANTULA, BigBlackTarantulaRenderer::new);
        EntityRendererRegistry.register(MTEntity.TAKSINUS_BAMBUS_TARANTULA, TaksinusBambusTarantulaRenderer::new);
        EntityRendererRegistry.register(MTEntity.METALLICA_TARANTULA, MetallicaTarantulaRenderer::new);
        EntityRendererRegistry.register(MTEntity.PTERINOCHILUS_MURINUS_TARANTULA, PterinochilusMurinusTarantulaRenderer::new);
        EntityRendererRegistry.register(MTEntity.GOLDEN_KNEE_TARANTULA, GoldenKneeTarantulaRenderer::new);
        EntityRendererRegistry.register(MTEntity.RED_KNEE_TARANTULA, RedKneeTarantulaRenderer::new);
        EntityRendererRegistry.register(MTEntity.PARAHYBANA_TARANTULA, ParahybanaTarantulaRenderer::new);
        EntityRendererRegistry.register(MTEntity.CURLY_HAIR_TARANTULA, CurlyHairTarantulaRenderer::new);
        EntityRendererRegistry.register(MTEntity.RED_AND_WHITE_TARANTULA, RedAndWhiteTarantulaRenderer::new);

    }
}
