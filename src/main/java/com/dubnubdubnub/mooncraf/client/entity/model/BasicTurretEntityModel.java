package com.dubnubdubnub.mooncraf.client.entity.model;

import com.dubnubdubnub.mooncraf.entities.BasicTurretEntity;
import com.dubnubdubnub.mooncraf.entities.CheeseDogEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class BasicTurretEntityModel<T extends BasicTurretEntity> extends EntityModel<T>{
	private final ModelRenderer Body;
	private final ModelRenderer Top;
	private final ModelRenderer Arm;
	private final ModelRenderer Bottom;

	public BasicTurretEntityModel() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(6.0F, 17.0F, 15.0F);
		

		Top = new ModelRenderer(this);
		Top.setRotationPoint(-6.0F, 1.0F, -15.0F);
		Body.addChild(Top);
		Top.setTextureOffset(0, 0).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);
		Top.setTextureOffset(60, 53).addBox(-8.0F, -4.0F, 6.0F, 14.0F, 2.0F, 2.0F, 0.0F, false);
		Top.setTextureOffset(26, 49).addBox(6.0F, -4.0F, -6.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
		Top.setTextureOffset(60, 49).addBox(-6.0F, -4.0F, -8.0F, 14.0F, 2.0F, 2.0F, 0.0F, false);
		Top.setTextureOffset(48, 0).addBox(-8.0F, -4.0F, -8.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
		Top.setTextureOffset(0, 56).addBox(-7.0F, -3.0F, -5.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
		Top.setTextureOffset(44, 49).addBox(5.0F, -3.0F, -7.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		Top.setTextureOffset(60, 57).addBox(-7.0F, -3.0F, -7.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		Top.setTextureOffset(36, 32).addBox(-7.0F, -3.0F, 5.0F, 14.0F, 2.0F, 2.0F, 0.0F, false);
		Top.setTextureOffset(0, 45).addBox(-5.0F, -2.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);

		Arm = new ModelRenderer(this);
		Arm.setRotationPoint(0.0F, -2.0F, 0.0F);
		Top.addChild(Arm);
		Arm.setTextureOffset(0, 27).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Arm.setTextureOffset(52, 63).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		Bottom = new ModelRenderer(this);
		Bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Bottom);
		Bottom.setTextureOffset(36, 36).addBox(-12.0F, 5.0F, -21.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		Bottom.setTextureOffset(0, 32).addBox(-12.0F, 1.0F, -21.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		Bottom.setTextureOffset(8, 0).addBox(-12.0F, 2.0F, -11.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Bottom.setTextureOffset(36, 36).addBox(-2.0F, 2.0F, -11.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Bottom.setTextureOffset(0, 32).addBox(-2.0F, 2.0F, -21.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Bottom.setTextureOffset(0, 11).addBox(-12.0F, 2.0F, -21.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Bottom.setTextureOffset(0, 17).addBox(-13.0F, 6.0F, -22.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		Bottom.setTextureOffset(6, 22).addBox(-13.0F, 1.0F, -22.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		Bottom.setTextureOffset(0, 17).addBox(-13.0F, 1.0F, -10.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		Bottom.setTextureOffset(6, 6).addBox(-1.0F, 1.0F, -10.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		Bottom.setTextureOffset(0, 0).addBox(-1.0F, 1.0F, -22.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		Bottom.setTextureOffset(42, 17).addBox(-11.0F, 2.0F, -20.0F, 10.0F, 4.0F, 10.0F, 0.0F, false);
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

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// TODO Auto-generated method stub
		
	}
}