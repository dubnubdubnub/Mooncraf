package com.dubnubdubnub.mooncraf.entities;

import com.dubnubdubnub.mooncraf.init.ModEntityTypes;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CheeseDogEntity extends AnimalEntity{

	public CheeseDogEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super(type, worldIn);
		// TODO Auto-generated constructor stub
	}
	
	 

	@Override
	public AgeableEntity createChild(AgeableEntity ageable) {
		// TODO Auto-generated method stub
		CheeseDogEntity entity = new CheeseDogEntity(ModEntityTypes.CHEESE_DOG_ENTITY.get(), this.world);
		entity.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(entity)), SpawnReason.BREEDING, (ILivingEntityData)null, (CompoundNBT)null);
		return entity;
	}
	
	
	
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new SwimGoal(this));
	    this.goalSelector.addGoal(3, new BreedGoal(this, 1.0D));
	    this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
	    this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 8.0F));
	    this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
		
	}
	 
	protected void registerAttributes() {
	      super.registerAttributes();
	      this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)0.2F);
	      this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
	      this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
	   }
	
	public void isAttacked() {
		this.addPotionEffect(new EffectInstance(Effects.LEVITATION, 120, 1));
		this.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 300, 9));
	}
	
	public boolean isBreedingItem(ItemStack stack) {
	      Item item = stack.getItem();
	      return item.isFood() && item.getFood().isMeat();
	   }
	
	public void onStruckByLightning(LightningBoltEntity lightningBolt) {
		this.noClip = true;
		this.addPotionEffect(new EffectInstance(Effects.LEVITATION, 9999, 1));
	}
	
	protected void playStepSound(BlockPos pos, BlockState blockIn) {
	      this.playSound(SoundEvents.ENTITY_WOLF_STEP, 0.15F, 1.0F);
	       }
	
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		      return SoundEvents.ENTITY_WOLF_HURT;
		   }

	protected SoundEvent getDeathSound() {
		      return SoundEvents.ENTITY_WOLF_DEATH;
		   }

	protected float getSoundVolume() {
	      return 0.4F;
	   }
	
}
