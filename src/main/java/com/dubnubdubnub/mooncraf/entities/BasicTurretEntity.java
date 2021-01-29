package com.dubnubdubnub.mooncraf.entities;

import com.dubnubdubnub.mooncraf.init.ModEntityTypes;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
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
	      return SoundEvents.BLOCK_TRIPWIRE_CLICK_ON;
	   }

	   protected SoundEvent getDeathSound() {
	      return null;
	   }

	   protected SoundEvent getStepSound() {
	      return null;
	   }
	   
	   
	protected void registerGoals() {
		super.registerGoals();
	    this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
	    this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, MobEntity.class, true));
		this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
		
	}
	@Override
	public AgeableEntity createChild(AgeableEntity ageable) {
		// TODO Auto-generated method stub
		BasicTurretEntity entity = new BasicTurretEntity(ModEntityTypes.BASIC_TURRET_ENTITY.get(), this.world);
		entity.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(entity)), SpawnReason.SPAWN_EGG, (ILivingEntityData)null, (CompoundNBT)null);
		return entity;
	}
	
	protected void registerAttributes() {
	      super.registerAttributes();
	      this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
	      this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0D);
	   }
	

	

}
