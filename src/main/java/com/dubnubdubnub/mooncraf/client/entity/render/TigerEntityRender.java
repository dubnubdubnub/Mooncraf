package com.dubnubdubnub.mooncraf.client.entity.render;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.client.entity.model.CheeseDogEntityModel;
import com.dubnubdubnub.mooncraf.client.entity.model.TigerEntityModel;
import com.dubnubdubnub.mooncraf.entities.CheeseDogEntity;
import com.dubnubdubnub.mooncraf.entities.TigerEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TigerEntityRender extends MobRenderer<TigerEntity, TigerEntityModel<TigerEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Mooncraf.MOD_ID, "textures/entity/tigertexture.png");
	
	public TigerEntityRender(EntityRendererManager renderManagerIn) {
		super (renderManagerIn, new TigerEntityModel<TigerEntity>(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(TigerEntity entity) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}

}