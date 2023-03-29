package net.namozdizex.moretarantulas.entity.client.renderer;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.namozdizex.moretarantulas.entity.BigBlackTarantula;
import net.namozdizex.moretarantulas.entity.client.model.TarantulaNewModel;

public class BigBlackTarantulaRenderer <T extends BigBlackTarantula> extends MobRenderer<T, TarantulaNewModel<T>> {
    private static final ResourceLocation BIG_BLACK_LOCATION = new ResourceLocation("moretarantulas:textures/entity/big_black_tarantula.png");

    public BigBlackTarantulaRenderer(EntityRendererProvider.Context context) {
        this(context, ModelLayers.SPIDER);
    }

    public BigBlackTarantulaRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayerLocation) {
        super(context, new TarantulaNewModel<>(context.bakeLayer(modelLayerLocation)), 0.8F);
    }

    protected float getFlipDegrees(T spider) {
        return 180.0F;
    }

    public ResourceLocation getTextureLocation(T spider) {
        return BIG_BLACK_LOCATION;
    }
}
