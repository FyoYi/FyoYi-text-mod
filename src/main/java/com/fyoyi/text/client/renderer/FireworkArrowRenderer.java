package com.fyoyi.text.client.renderer;

import com.fyoyi.text.entity.FireworkArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class FireworkArrowRenderer extends ArrowRenderer<FireworkArrowEntity> {
    // 为了简单起见，我们直接复用原版箭的贴图。您可以替换成您自己的贴图路径。
    public static final ResourceLocation TEXTURE = new ResourceLocation("minecraft:textures/entity/projectiles/arrow.png");

    public FireworkArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(FireworkArrowEntity pEntity) {
        return TEXTURE;
    }
}