package com.dubnubdubnub.mooncraf.client.entity.model;
// Made with Blockbench 3.5.0
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.dubnubdubnub.mooncraf.entities.CheeseDogEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class CheeseDogEntityModel<T extends CheeseDogEntity> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer legs;
	private final ModelRenderer back;
	private final ModelRenderer backright;
	private final ModelRenderer backleft;
	private final ModelRenderer front;
	private final ModelRenderer frontright;
	private final ModelRenderer frontleft;
	private final ModelRenderer bodyblocks;
	private final ModelRenderer mainbody;
	private final ModelRenderer neck;
	private final ModelRenderer head;
	private final ModelRenderer ears;
	private final ModelRenderer rightear;
	private final ModelRenderer leftear;
	private final ModelRenderer headshape;
	private final ModelRenderer eyes;
	private final ModelRenderer lefteye;
	private final ModelRenderer righteye;
	private final ModelRenderer tail;

	public CheeseDogEntityModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 0.0F, 5.0F);
		body.addChild(legs);
		

		back = new ModelRenderer(this);
		back.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(back);
		

		backright = new ModelRenderer(this);
		backright.setRotationPoint(0.0F, 0.0F, 0.0F);
		back.addChild(backright);
		backright.setTextureOffset(8, 33).addBox(-3.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		backleft = new ModelRenderer(this);
		backleft.setRotationPoint(0.0F, 0.0F, 0.0F);
		back.addChild(backleft);
		backleft.setTextureOffset(0, 33).addBox(1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		front = new ModelRenderer(this);
		front.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(front);
		

		frontright = new ModelRenderer(this);
		frontright.setRotationPoint(0.0F, 0.0F, 0.0F);
		front.addChild(frontright);
		frontright.setTextureOffset(28, 28).addBox(-3.0F, -8.0F, -11.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		frontleft = new ModelRenderer(this);
		frontleft.setRotationPoint(0.0F, 0.0F, 0.0F);
		front.addChild(frontleft);
		frontleft.setTextureOffset(0, 0).addBox(1.0F, -8.0F, -11.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		bodyblocks = new ModelRenderer(this);
		bodyblocks.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bodyblocks);
		

		mainbody = new ModelRenderer(this);
		mainbody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bodyblocks.addChild(mainbody);
		mainbody.setTextureOffset(0, 0).addBox(-3.0F, -12.0F, -6.0F, 6.0F, 6.0F, 14.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 0.0F, 0.0F);
		bodyblocks.addChild(neck);
		neck.setTextureOffset(0, 20).addBox(-4.0F, -13.0F, -6.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		

		ears = new ModelRenderer(this);
		ears.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(ears);
		

		rightear = new ModelRenderer(this);
		rightear.setRotationPoint(0.0F, 0.0F, 0.0F);
		ears.addChild(rightear);
		rightear.setTextureOffset(8, 0).addBox(-3.0F, -14.0F, -7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		leftear = new ModelRenderer(this);
		leftear.setRotationPoint(0.0F, 0.0F, 0.0F);
		ears.addChild(leftear);
		leftear.setTextureOffset(0, 22).addBox(2.0F, -14.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftear.setTextureOffset(8, 8).addBox(1.0F, -13.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		headshape = new ModelRenderer(this);
		headshape.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(headshape);
		headshape.setTextureOffset(8, 3).addBox(-1.0F, -9.0F, -12.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		headshape.setTextureOffset(26, 0).addBox(-3.0F, -12.0F, -9.0F, 6.0F, 6.0F, 3.0F, 0.0F, false);
		headshape.setTextureOffset(34, 20).addBox(-1.5F, -10.0F, -11.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		headshape.setTextureOffset(0, 10).addBox(-3.0F, -9.0F, -10.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);

		eyes = new ModelRenderer(this);
		eyes.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(eyes);
		

		lefteye = new ModelRenderer(this);
		lefteye.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyes.addChild(lefteye);
		lefteye.setTextureOffset(8, 6).addBox(1.0F, -10.0F, -9.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		righteye = new ModelRenderer(this);
		righteye.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyes.addChild(righteye);
		righteye.setTextureOffset(0, 20).addBox(-3.0F, -10.0F, -9.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -9.0F, 8.0F);
		body.addChild(tail);
		setRotationAngle(tail, -1.5708F, 0.0F, 0.0F);
		tail.setTextureOffset(16, 33).addBox(-1.0F, -5.1008F, -1.4284F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(22, 20).addBox(-1.0F, -5.1008F, -2.4284F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		tail.setTextureOffset(26, 9).addBox(-2.0F, -5.1008F, -1.4284F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(28, 25).addBox(-1.0F, -6.1008F, -1.4284F, 2.0F, 1.0F, 2.0F, 0.0F, false);
	}

	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay);
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

