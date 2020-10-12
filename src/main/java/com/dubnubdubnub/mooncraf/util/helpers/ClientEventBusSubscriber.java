package com.dubnubdubnub.mooncraf.util.helpers;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.client.entity.render.BasicTurretEntityRender;
import com.dubnubdubnub.mooncraf.client.entity.render.CCSharkEntityRender;
import com.dubnubdubnub.mooncraf.client.entity.render.CheeseDogEntityRender;
import com.dubnubdubnub.mooncraf.client.entity.render.GWSharkEntityRender;
import com.dubnubdubnub.mooncraf.client.entity.render.TigerEntityRender;
import com.dubnubdubnub.mooncraf.init.ModEntityTypes;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Mooncraf.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CHEESE_DOG_ENTITY.get(), CheeseDogEntityRender::new);
	}
	@SubscribeEvent
	public static void clientSetup1(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BASIC_TURRET_ENTITY.get(), BasicTurretEntityRender::new);
	}
	@SubscribeEvent
	public static void clientSetup2(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GWSHARK_ENTITY.get(),GWSharkEntityRender::new);
	}
	@SubscribeEvent
	public static void clientSetup3(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CCSHARK_ENTITY.get(),CCSharkEntityRender::new);
	}
	@SubscribeEvent
	public static void clientSetup4(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TIGER_ENTITY.get(),TigerEntityRender::new);
	}
}

