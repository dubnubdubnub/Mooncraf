package com.dubnubdubnub.mooncraf.entities;

import com.dubnubdubnub.mooncraf.init.ModEntityTypes;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.monster.AbstractRaiderEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
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
	
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
	      super.setEquipmentBasedOnDifficulty(difficulty);
	      this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.BOW));
	   }
	
	public void attackEntityWithRangedAttack(LivingEntity target, float distanceFactor) {
	      ItemStack itemstack = this.findAmmo(this.getHeldItem(ProjectileHelper.getHandWith(this, Items.BOW)));
	      AbstractArrowEntity abstractarrowentity = this.fireArrow(itemstack, distanceFactor);
	      if (this.getHeldItemMainhand().getItem() instanceof net.minecraft.item.BowItem)
	         abstractarrowentity = ((net.minecraft.item.BowItem)this.getHeldItemMainhand().getItem()).customeArrow(abstractarrowentity);
	      double d0 = target.getPosX() - this.getPosX();
	      double d1 = target.getPosYHeight(0.3333333333333333D) - abstractarrowentity.getPosY();
	      double d2 = target.getPosZ() - this.getPosZ();
	      double d3 = (double)MathHelper.sqrt(d0 * d0 + d2 * d2);
	      abstractarrowentity.shoot(d0, d1 + d3 * (double)0.2F, d2, 1.6F, (float)(14 - this.world.getDifficulty().getId() * 4));
	      this.playSound(SoundEvents.ENTITY_SKELETON_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
	      this.world.addEntity(abstractarrowentity);
	   }
	protected AbstractArrowEntity fireArrow(ItemStack arrowStack, float distanceFactor) {
	      return ProjectileHelper.fireArrow(this, arrowStack, distanceFactor);
	   }
	

}
