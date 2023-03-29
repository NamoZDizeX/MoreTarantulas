package net.namozdizex.moretarantulas.entity.client.renderer;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.namozdizex.moretarantulas.entity.RedAndWhiteTarantula;
import net.namozdizex.moretarantulas.entity.client.model.TarantulaNewModel;

public class RedAndWhiteTarantulaRenderer <T extends RedAndWhiteTarantula> extends MobRenderer<T, TarantulaNewModel<T>> {
    private static final ResourceLocation RED_AND_WHITE = new ResourceLocation("moretarantulas:textures/entity/red_and_white.png");

    public RedAndWhiteTarantulaRenderer(EntityRendererProvider.Context context) {
        this(context, ModelLayers.SPIDER);
    }

    public RedAndWhiteTarantulaRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayerLocation) {
        super(context, new TarantulaNewModel<>(context.bakeLayer(modelLayerLocation)), 0.8F);
    }

    protected float getFlipDegrees(T spider) {
        return 180.0F;
    }

    public ResourceLocation getTextureLocation(T spider) {
        return RED_AND_WHITE;
    }
}
