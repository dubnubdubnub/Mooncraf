package com.dubnubdubnub.mooncraf.init;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.entities.BasicTurretEntity;
import com.dubnubdubnub.mooncraf.entities.CCSharkEntity;
import com.dubnubdubnub.mooncraf.entities.CheeseDogEntity;
import com.dubnubdubnub.mooncraf.entities.GWSharkEntity;
import com.dubnubdubnub.mooncraf.entities.TigerEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes<Entity>{

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Mooncraf.MOD_ID);
	
	public static final RegistryObject<EntityType<CheeseDogEntity>> CHEESE_DOG_ENTITY = ENTITY_TYPES
			.register("cheese_dog_entity", 
					() -> EntityType.Builder.<CheeseDogEntity>create(CheeseDogEntity::new, EntityClassification.CREATURE)
					.size(0.4f, 0.6f)
					.build(new ResourceLocation(Mooncraf.MOD_ID, "cheese_dog_entity")
							.toString()));
	
	public static final RegistryObject<EntityType<BasicTurretEntity>> BASIC_TURRET_ENTITY = ENTITY_TYPES
			.register("basic_turret_entity", 
					() -> EntityType.Builder.<BasicTurretEntity>create(BasicTurretEntity::new, EntityClassification.CREATURE)
					.size(0.8f, 0.8f)
					.build(new ResourceLocation(Mooncraf.MOD_ID, "basic_turret_entity")
							.toString()));
	

	
	public static final RegistryObject<EntityType<GWSharkEntity>> GWSHARK_ENTITY = ENTITY_TYPES
			.register("gwshark_entity", 
					() -> EntityType.Builder.<GWSharkEntity>create(GWSharkEntity::new, EntityClassification.CREATURE)
					.size(1.4f, 1.2f)
					.build(new ResourceLocation(Mooncraf.MOD_ID, "gwshark_entity")
							.toString()));
	
	public static final RegistryObject<EntityType<CCSharkEntity>> CCSHARK_ENTITY = ENTITY_TYPES
			.register("ccshark_entity", 
					() -> EntityType.Builder.<CCSharkEntity>create(CCSharkEntity::new, EntityClassification.CREATURE)
					.size(0.6f, 0.4f)
					.build(new ResourceLocation(Mooncraf.MOD_ID, "ccshark_entity")
							.toString()));
	public static final RegistryObject<EntityType<TigerEntity>> TIGER_ENTITY = ENTITY_TYPES
			.register("tiger_entity", 
					() -> EntityType.Builder.<TigerEntity>create(TigerEntity::new, EntityClassification.CREATURE)
					.size(0.4f, 0.6f)
					.build(new ResourceLocation(Mooncraf.MOD_ID, "tiger_entity")
							.toString()));
	
}
