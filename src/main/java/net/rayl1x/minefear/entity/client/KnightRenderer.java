package net.rayl1x.minefear.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rayl1x.minefear.MineFear;
import net.rayl1x.minefear.entity.custom.KnightEntity;

public class KnightRenderer extends MobRenderer<KnightEntity, KnightModel<KnightEntity>> {
    public KnightRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new KnightModel<>(pContext.bakeLayer(ModModelLayers.KNIGHT_LAYER)), 0.8f);
    }

    @Override
    public ResourceLocation getTextureLocation(KnightEntity knightEntity) {
        return new ResourceLocation(MineFear.MODID, "textures/entity/knight.png");
    }

    @Override
    public void render(KnightEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
