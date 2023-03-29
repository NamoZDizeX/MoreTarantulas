package net.namozdizex.moretarantulas.entity.client.renderer;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.namozdizex.moretarantulas.entity.ElectricBlueTarantula;
import net.namozdizex.moretarantulas.entity.client.model.TarantulaNewModel;

public class ElectricBlueTarantulaRenderer <T extends ElectricBlueTarantula> extends MobRenderer<T, TarantulaNewModel<T>> {
    private static final ResourceLocation TARANTULA_LOCATION = new ResourceLocation("moretarantulas:textures/entity/electric_blue_tarantula.png");

    public ElectricBlueTarantulaRenderer(EntityRendererProvider.Context context) {
        this(context, ModelLayers.SPIDER);
    }

    public ElectricBlueTarantulaRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayerLocation) {
        super(context, new TarantulaNewModel<>(context.bakeLayer(modelLayerLocation)), 0.8F);
    }

    protected float getFlipDegrees(T spider) {
        return 180.0F;
    }

    public ResourceLocation getTextureLocation(T spider) {
        return TARANTULA_LOCATION;
    }
}
