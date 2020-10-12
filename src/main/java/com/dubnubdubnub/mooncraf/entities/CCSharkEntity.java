 package com.dubnubdubnub.mooncraf.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.FindWaterGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class CCSharkEntity extends WaterMobEntity{

	public CCSharkEntity(EntityType<? extends WaterMobEntity> type, World worldIn) {
		super(type, worldIn);
		// TODO Auto-generated constructor stub
	}
	 protected SoundEvent getAmbientSound() {
	      return null;
	   }

	   protected SoundEvent getHurtSound() {
		   return null;
	   }

	   protected SoundEvent getDeathSound() {
	      return null;
	   }

	   protected SoundEvent getStepSound() {
	      return null;
	   }
	   
	   protected void registerAttributes() {
		      super.registerAttributes();
		      this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)0.2F);
		      this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		      this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
		   }
	   
	   
	protected void registerGoals() {
		super.registerGoals();
	    this.goalSelector.addGoal(4, new RandomSwimmingGoal(this, 1.0D, 10));
	    this.goalSelector.addGoal(0, new FindWaterGoal(this));
	    this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
	    this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, MobEntity.class, true));
		this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
		
		
	}
	
	public void LivingTick() {
		
		
		
	}

}
