package com.dubnubdubnub.mooncraf.client.entity.render;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.client.entity.model.GWSharkEntityModel;
import com.dubnubdubnub.mooncraf.entities.GWSharkEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GWSharkEntityRender extends MobRenderer<GWSharkEntity, GWSharkEntityModel<GWSharkEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Mooncraf.MOD_ID, "textures/entity/gwsharktexture.png");
	
	public GWSharkEntityRender(EntityRendererManager renderManagerIn) {
		super (renderManagerIn, new GWSharkEntityModel<GWSharkEntity>(), 1f);
	}

	@Override
	public ResourceLocation getEntityTexture(GWSharkEntity entity) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}

}