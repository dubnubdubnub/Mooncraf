package com.dubnubdubnub.mooncraf.client.entity.render;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.client.entity.model.CheeseDogEntityModel;
import com.dubnubdubnub.mooncraf.entities.CheeseDogEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CheeseDogEntityRender extends MobRenderer<CheeseDogEntity, CheeseDogEntityModel<CheeseDogEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Mooncraf.MOD_ID, "textures/entity/cheesedogtexture.png");
	
	public CheeseDogEntityRender(EntityRendererManager renderManagerIn) {
		super (renderManagerIn, new CheeseDogEntityModel<CheeseDogEntity>(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(CheeseDogEntity entity) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}

}