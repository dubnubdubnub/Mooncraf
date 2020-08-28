package com.dubnubdubnub.mooncraf.client.entity.render;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.client.entity.model.BasicTurretEntityModel;
import com.dubnubdubnub.mooncraf.entities.BasicTurretEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BasicTurretEntityRender extends MobRenderer<BasicTurretEntity, BasicTurretEntityModel<BasicTurretEntity>> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Mooncraf.MOD_ID, "textures/entity/basicturrettexture.png");
	
	public BasicTurretEntityRender(EntityRendererManager renderManagerIn) {
		super (renderManagerIn, new BasicTurretEntityModel<BasicTurretEntity>(), 0.5f);
	}
	
	@Override
	public ResourceLocation getEntityTexture(BasicTurretEntity entity) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}

}
