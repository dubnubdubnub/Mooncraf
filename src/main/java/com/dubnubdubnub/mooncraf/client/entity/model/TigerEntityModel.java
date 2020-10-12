package com.dubnubdubnub.mooncraf.client.entity.model;

import com.dubnubdubnub.mooncraf.entities.TigerEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class TigerEntityModel<T extends TigerEntity> extends EntityModel<T> {
	private final ModelRenderer Body;
	private final ModelRenderer BodyBlock;
	private final ModelRenderer head;
	private final ModelRenderer leggFL;
	private final ModelRenderer leggFR;
	private final ModelRenderer leggBL;
	private final ModelRenderer leggBR;
	private final ModelRenderer tail;

	public TigerEntityModel() {
		textureWidth = 32;
		textureHeight = 32;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		BodyBlock = new ModelRenderer(this);
		BodyBlock.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(BodyBlock);
		BodyBlock.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, -5.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
		BodyBlock.setTextureOffset(0, 12).addBox(-2.0F, -1.0F, -4.0F, 4.0F, 1.0F, 8.0F, 0.0F, false);
		BodyBlock.setTextureOffset(16, 12).addBox(-2.0F, -4.0F, 2.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(head);
		head.setTextureOffset(16, 0).addBox(-2.0F, -6.0F, -8.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(24, 17).addBox(-1.0F, -5.0F, -9.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(5, 21).addBox(1.0F, -7.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 17).addBox(-2.0F, -7.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leggFL = new ModelRenderer(this);
		leggFL.setRotationPoint(5.0F, -1.0F, -2.0F);
		Body.addChild(leggFL);
		leggFL.setTextureOffset(18, 25).addBox(-3.0F, -2.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		leggFL.setTextureOffset(24, 8).addBox(-3.0F, 0.0F, -5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		leggFL.setTextureOffset(0, 12).addBox(-3.0F, -4.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		leggFL.setTextureOffset(28, 21).addBox(-3.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		leggFR = new ModelRenderer(this);
		leggFR.setRotationPoint(0.0F, -1.0F, -2.0F);
		Body.addChild(leggFR);
		leggFR.setTextureOffset(0, 25).addBox(-3.0F, -2.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		leggFR.setTextureOffset(20, 21).addBox(-3.0F, 0.0F, -5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		leggFR.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		leggFR.setTextureOffset(28, 12).addBox(-3.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		leggBL = new ModelRenderer(this);
		leggBL.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(leggBL);
		leggBL.setTextureOffset(12, 27).addBox(2.0F, -5.0F, 2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		leggBL.setTextureOffset(16, 17).addBox(2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leggBL.setTextureOffset(14, 21).addBox(2.0F, -4.0F, 3.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		leggBR = new ModelRenderer(this);
		leggBR.setRotationPoint(-5.0F, 0.0F, 0.0F);
		Body.addChild(leggBR);
		leggBR.setTextureOffset(6, 27).addBox(2.0F, -5.0F, 2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		leggBR.setTextureOffset(0, 17).addBox(2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leggBR.setTextureOffset(8, 21).addBox(2.0F, -4.0F, 3.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(tail);
		tail.setTextureOffset(24, 25).addBox(-1.0F, -3.0F, 4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(0, 5).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(16, 6).addBox(-5.0F, -1.0F, 6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(4, 17).addBox(-5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		tail.setTextureOffset(0, 21).addBox(-6.0F, -1.0F, 3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}