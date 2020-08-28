package com.dubnubdubnub.mooncraf.entities;

import com.dubnubdubnub.mooncraf.init.ModEntityTypes;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BasicTurretEntity extends AnimalEntity{ 
	
	public BasicTurretEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super(type, worldIn);
		// TODO Auto-generated constructor stub
	}
	 protected SoundEvent getAmbientSound() {
	      return null;
	   }

	   protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
	      return null;
	   }

	   protected SoundEvent getDeathSound() {
	      return null;
	   }

	   protected SoundEvent getStepSound() {
	      return null;
	   }
	protected void registerGoals() {
		super.registerGoals();
		
	}
	@Override
	public AgeableEntity createChild(AgeableEntity ageable) {
		// TODO Auto-generated method stub
		BasicTurretEntity entity = new BasicTurretEntity(ModEntityTypes.BASIC_TURRET_ENTITY.get(), this.world);
		entity.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(entity)), SpawnReason.BREEDING, (ILivingEntityData)null, (CompoundNBT)null);
		return entity;
	}
	
	
	

}
