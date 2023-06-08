package com.supermartijn642.rechiseled.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.supermartijn642.core.ClientUtils;
import com.supermartijn642.core.render.RenderUtils;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.model.BakedQuad;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraftforge.client.model.data.EmptyModelData;
import net.minecraftforge.client.model.data.IModelData;

import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created 25/12/2021 by SuperMartijn642
 */
public class ScreenBlockRenderer {

    private static final MatrixStack POSE_STACK = new MatrixStack();
    private static BlockCaptureLevel fakeLevel;

    public static void drawBlock(BlockCapture capture, double x, double y, double scale, float yaw, float pitch, boolean doShading){
        AxisAlignedBB bounds = capture.getBounds();
        double span = Math.sqrt(bounds.getXsize() * bounds.getXsize() + bounds.getYsize() * bounds.getYsize() + bounds.getZsize() * bounds.getZsize());
        scale /= span;

        if(fakeLevel == null)
            fakeLevel = new BlockCaptureLevel();
        fakeLevel.setCapture(capture);

        RenderSystem.enableRescaleNormal();
        RenderSystem.enableAlphaTest();
        RenderSystem.defaultAlphaFunc();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

        RenderSystem.pushMatrix();
        RenderSystem.translated(x, y, 350);
        RenderSystem.scalef(1, -1, 1);
        RenderSystem.scaled(scale, scale, scale);

        POSE_STACK.pushPose();
        POSE_STACK.mulPose(new Quaternion(pitch, yaw, 0, true));

        if(doShading)
            RenderSystem.enableLighting();

        IRenderTypeBuffer.Impl renderTypeBuffer = RenderUtils.getMainBufferSource();
        for(Map.Entry<BlockPos,BlockState> entry : capture.getBlocks())
            renderBlock(entry.getKey(), entry.getValue(), POSE_STACK, renderTypeBuffer);
        renderTypeBuffer.endBatch();

        RenderSystem.enableDepthTest();
        if(doShading)
            RenderSystem.disableLighting();

        POSE_STACK.popPose();
        RenderSystem.popMatrix();

        RenderSystem.disableAlphaTest();
        RenderSystem.disableRescaleNormal();

        fakeLevel.setCapture(null);
    }

    private static void renderBlock(BlockPos pos, BlockState state, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer){
        matrixStack.pushPose();
        matrixStack.translate(pos.getX() - 0.5, pos.getY() - 0.5, pos.getZ() - 0.5);

        IBakedModel model = ClientUtils.getBlockRenderer().getBlockModel(state);
        IModelData modelData = model.getModelData(fakeLevel, pos, state, EmptyModelData.INSTANCE);
        RenderType renderType = RenderTypeLookup.getRenderType(state, true);
        renderModel(model, state, matrixStack, renderTypeBuffer.getBuffer(renderType), modelData);

        matrixStack.popPose();
    }

    private static void renderModel(IBakedModel modelIn, BlockState state, MatrixStack matrixStackIn, IVertexBuilder bufferIn, IModelData modelData){
        Random random = new Random();

        for(Direction direction : Direction.values()){
            random.setSeed(42L);
            renderQuads(matrixStackIn, bufferIn, modelIn.getQuads(state, direction, random, modelData));
        }

        random.setSeed(42L);
        renderQuads(matrixStackIn, bufferIn, modelIn.getQuads(state, null, random, modelData));
    }

    private static void renderQuads(MatrixStack matrixStackIn, IVertexBuilder bufferIn, List<BakedQuad> quadsIn){
        MatrixStack.Entry matrix = matrixStackIn.last();

        for(BakedQuad bakedquad : quadsIn)
            bufferIn.addVertexData(matrix, bakedquad, 1, 1, 1, 1, 15728880, OverlayTexture.NO_OVERLAY, false);
    }
}
