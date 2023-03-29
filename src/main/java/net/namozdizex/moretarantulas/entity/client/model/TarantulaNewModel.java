package net.namozdizex.moretarantulas.entity.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class TarantulaNewModel <T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "tarantula_model"), "main");
    private final ModelPart TarantulaModel;

    public TarantulaNewModel(ModelPart root) {
        this.TarantulaModel = root.getChild("TarantulaModel");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition TarantulaModel = partdefinition.addOrReplaceChild("TarantulaModel", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Head = TarantulaModel.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, -8.0F, -10.0F, 9.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition neck = TarantulaModel.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(35, 37).addBox(-2.0F, -7.0F, -4.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition back = TarantulaModel.addOrReplaceChild("back", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -10.0F, -1.0F, 9.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = back.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, 10.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.1309F, 0.0F));

        PartDefinition cube_r2 = back.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -6.0F, 10.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, -0.1309F, 0.0F));

        PartDefinition leg1 = TarantulaModel.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.3491F, 0.0F));

        PartDefinition cube_r3 = leg1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 0).addBox(11.0F, 1.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r4 = leg1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 38).addBox(4.0F, -4.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition leg2 = TarantulaModel.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 3.0F));

        PartDefinition cube_r5 = leg2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 45).addBox(11.0F, 1.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, -0.5236F));

        PartDefinition cube_r6 = leg2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 36).addBox(4.0F, -4.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, -0.1309F));

        PartDefinition leg3 = TarantulaModel.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, -1.0F, 0.0F, -0.2618F, 0.0F));

        PartDefinition cube_r7 = leg3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(34, 45).addBox(11.0F, 1.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r8 = leg3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 28).addBox(4.0F, -4.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition leg4 = TarantulaModel.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, -0.3491F, 0.0F));

        PartDefinition cube_r9 = leg4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(44, 12).addBox(11.0F, 1.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r10 = leg4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 34).addBox(4.0F, -4.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition leg5 = TarantulaModel.addOrReplaceChild("leg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition cube_r11 = leg5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 50).addBox(11.0F, 3.0F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r12 = leg5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(32, 32).addBox(4.0F, -4.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition leg6 = TarantulaModel.addOrReplaceChild("leg6", CubeListBuilder.create(), PartPose.offsetAndRotation(8.0F, 0.0F, -9.0F, 0.0F, 2.3998F, 0.0F));

        PartDefinition cube_r13 = leg6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 20).addBox(11.0F, 3.0F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r14 = leg6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(30, 8).addBox(4.0F, -4.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition leg7 = TarantulaModel.addOrReplaceChild("leg7", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, -4.0F, 0.0F, 2.618F, 0.0F));

        PartDefinition cube_r15 = leg7.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 42).addBox(11.0F, 1.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r16 = leg7.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(30, 4).addBox(4.0F, -4.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition leg8 = TarantulaModel.addOrReplaceChild("leg8", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.0F, -6.0F, 0.0F, 3.0543F, 0.0F));

        PartDefinition cube_r17 = leg8.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 42).addBox(11.0F, 1.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r18 = leg8.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 0).addBox(4.0F, -4.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition leg9 = TarantulaModel.addOrReplaceChild("leg9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, -2.8798F, 0.0F));

        PartDefinition cube_r19 = leg9.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(26, 40).addBox(11.0F, 1.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r20 = leg9.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 24).addBox(4.0F, -4.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition leg10 = TarantulaModel.addOrReplaceChild("leg10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -2.7489F, 0.0F));

        PartDefinition cube_r21 = leg10.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(18, 40).addBox(11.0F, 1.0F, -4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r22 = leg10.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(26, 20).addBox(4.0F, -4.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition fang = TarantulaModel.addOrReplaceChild("fang", CubeListBuilder.create().texOffs(22, 50).addBox(1.0F, -4.0F, -11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition fang2 = TarantulaModel.addOrReplaceChild("fang2", CubeListBuilder.create().texOffs(46, 22).addBox(1.0F, -4.0F, -11.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int i, int j, float f, float g, float h, float k) {
        TarantulaModel.render(poseStack, vertexConsumer, i, j, f, g, h, k);
    }
}