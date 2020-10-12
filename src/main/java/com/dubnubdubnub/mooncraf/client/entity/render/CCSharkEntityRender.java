package com.dubnubdubnub.mooncraf.client.entity.render;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.client.entity.model.CCSharkEntityModel;
import com.dubnubdubnub.mooncraf.entities.CCSharkEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CCSharkEntityRender extends MobRenderer<CCSharkEntity, CCSharkEntityModel<CCSharkEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Mooncraf.MOD_ID, "textures/entity/ccsharktexture.png");
	
	public CCSharkEntityRender(EntityRendererManager renderManagerIn) {
		super (renderManagerIn, new CCSharkEntityModel<CCSharkEntity>(), 0.6f);
	}

	@Override
	public ResourceLocation getEntityTexture(CCSharkEntity entity) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}

}