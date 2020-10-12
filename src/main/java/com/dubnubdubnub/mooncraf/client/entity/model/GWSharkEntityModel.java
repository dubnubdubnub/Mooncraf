package com.dubnubdubnub.mooncraf.client.entity.model;
// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.dubnubdubnub.mooncraf.entities.GWSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class GWSharkEntityModel<T extends GWSharkEntity> extends EntityModel<T>{
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer wigglebits;
	private final ModelRenderer bone1;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer Fin;
	private final ModelRenderer Fin2;
	private final ModelRenderer Fin3;

	public GWSharkEntityModel() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 65).addBox(6.0F, -7.0F, -5.0F, 10.0F, 5.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(40, 14).addBox(6.0F, -12.0F, -6.0F, 12.0F, 6.0F, 12.0F, 0.0F, false);

		wigglebits = new ModelRenderer(this);
		wigglebits.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(wigglebits);
		

		bone1 = new ModelRenderer(this);
		bone1.setRotationPoint(0.0F, 0.0F, 0.0F);
		wigglebits.addChild(bone1);
		bone1.setTextureOffset(0, 0).addBox(-6.0F, -13.0F, -6.5F, 13.0F, 13.0F, 13.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		wigglebits.addChild(bone2);
		bone2.setTextureOffset(0, 44).addBox(-17.0F, -12.0F, -5.0F, 12.0F, 11.0F, 10.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		wigglebits.addChild(bone3);
		bone3.setTextureOffset(44, 54).addBox(-28.0F, -11.0F, -4.0F, 12.0F, 9.0F, 8.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		wigglebits.addChild(bone4);
		bone4.setTextureOffset(63, 0).addBox(-34.0F, -9.0F, -2.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);
		bone4.setTextureOffset(40, 71).addBox(-37.0F, -16.0F, -1.0F, 4.0F, 17.0F, 2.0F, 0.0F, false);

		Fin = new ModelRenderer(this);
		Fin.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(Fin);
		Fin.setTextureOffset(39, 0).addBox(-11.0F, -20.0F, -1.0F, 10.0F, 9.0F, 2.0F, 0.0F, false);

		Fin2 = new ModelRenderer(this);
		Fin2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(Fin2);
		Fin2.setTextureOffset(36, 36).addBox(-8.0F, -6.0F, 3.0F, 10.0F, 2.0F, 16.0F, 0.0F, false);

		Fin3 = new ModelRenderer(this);
		Fin3.setRotationPoint(0.0F, 0.0F, 0.0F);  
		body.addChild(Fin3);
		Fin3.setTextureOffset(0, 26).addBox(-8.0F, -6.0F, -19.0F, 10.0F, 2.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}