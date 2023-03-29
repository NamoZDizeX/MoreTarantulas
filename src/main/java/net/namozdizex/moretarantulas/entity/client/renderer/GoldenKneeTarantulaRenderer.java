package net.namozdizex.moretarantulas.entity.client.renderer;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.namozdizex.moretarantulas.entity.GoldenKneeTarantula;
import net.namozdizex.moretarantulas.entity.client.model.TarantulaNewModel;

public class GoldenKneeTarantulaRenderer <T extends GoldenKneeTarantula> extends MobRenderer<T, TarantulaNewModel<T>> {
    private static final ResourceLocation GOLDEN_KNEE_LOCATION = new ResourceLocation("moretarantulas:textures/entity/golden_knee.png");

    public GoldenKneeTarantulaRenderer(EntityRendererProvider.Context context) {
        this(context, ModelLayers.SPIDER);
    }

    public GoldenKneeTarantulaRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayerLocation) {
        super(context, new TarantulaNewModel<>(context.bakeLayer(modelLayerLocation)), 0.8F);
    }

    protected float getFlipDegrees(T spider) {
        return 180.0F;
    }

    public ResourceLocation getTextureLocation(T spider) {
        return GOLDEN_KNEE_LOCATION;
    }
}
