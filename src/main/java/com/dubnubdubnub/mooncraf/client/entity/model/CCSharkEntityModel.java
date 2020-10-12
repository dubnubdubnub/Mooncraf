package com.dubnubdubnub.mooncraf.client.entity.model;
// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.dubnubdubnub.mooncraf.entities.CCSharkEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class CCSharkEntityModel<T extends CCSharkEntity> extends EntityModel<T>{  
	private final ModelRenderer Body;
	private final ModelRenderer frontmeat;
	private final ModelRenderer rearmeat;
	private final ModelRenderer Lfin;
	private final ModelRenderer Rfin;
	private final ModelRenderer Bfin;
	private final ModelRenderer Dfin;

	public CCSharkEntityModel() {
		textureWidth = 16;
		textureHeight = 16;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		frontmeat = new ModelRenderer(this);
		frontmeat.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(frontmeat);
		frontmeat.setTextureOffset(0, 4).addBox(-6.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		frontmeat.setTextureOffset(8, 8).addBox(-7.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		rearmeat = new ModelRenderer(this);
		rearmeat.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(rearmeat);
		rearmeat.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		Lfin = new ModelRenderer(this);
		Lfin.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Lfin);
		Lfin.setTextureOffset(7, 11).addBox(-3.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Rfin = new ModelRenderer(this);
		Rfin.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Rfin);
		Rfin.setTextureOffset(11, 11).addBox(-3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Bfin = new ModelRenderer(this);
		Bfin.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Bfin);
		Bfin.setTextureOffset(0, 8).addBox(4.0F, -1.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Bfin.setTextureOffset(0, 10).addBox(7.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Dfin = new ModelRenderer(this);
		Dfin.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Dfin);
		Dfin.setTextureOffset(4, 10).addBox(1.0F, -3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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