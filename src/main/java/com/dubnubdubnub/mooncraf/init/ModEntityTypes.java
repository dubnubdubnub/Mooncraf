package com.dubnubdubnub.mooncraf.init;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.entities.BasicTurretEntity;
import com.dubnubdubnub.mooncraf.entities.CheeseDogEntity;

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
					.size(0.12f, 1.3f)
					.build(new ResourceLocation(Mooncraf.MOD_ID, "cheese_dog_entity")
							.toString()));
	
	public static final RegistryObject<EntityType<BasicTurretEntity>> BASIC_TURRET_ENTITY = ENTITY_TYPES
			.register("basic_turret_entity", 
					() -> EntityType.Builder.<BasicTurretEntity>create(BasicTurretEntity::new, EntityClassification.CREATURE)
					.size(0.12f, 1.3f)
					.build(new ResourceLocation(Mooncraf.MOD_ID, "basic_turret_entity")
							.toString()));
	
}
