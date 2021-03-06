package com.dubnubdubnub.mooncraf.init;

import java.util.function.Supplier;

import com.dubnubdubnub.mooncraf.Mooncraf;
import com.dubnubdubnub.mooncraf.Mooncraf.MooncrafItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Mooncraf.MOD_ID, bus = Bus.MOD)
@ObjectHolder(Mooncraf.MOD_ID)
public class iteminit 
{

	//Items
	public static final Item cheese = null;
	public static final Item blu_cheese = null;
	public static final Item moldy_cheese = null;
	public static final Item armour_plates = null;
	//public static final Item quarry = null;
	
	//Tools
	public static final Item bone_sword = null; 
	public static final Item bone_pickaxe = null; 
	public static final Item bone_axe = null; 
	public static final Item bone_shovel = null; 
	public static final Item bone_hoe = null; 
	
	public static final Item infused_bone_diamond_sword = null; 
	public static final Item bone_diamond_pickaxe = null; 
	public static final Item bone_diamond_axe = null; 
	public static final Item bone_diamond_shovel = null; 
	public static final Item bone_diamond_hoe = null; 
	
	//Armour
	public static final Item plated_iron_helmet = null;
	public static final Item plated_iron_chestplate = null;
	public static final Item plated_iron_leggings = null;
	public static final Item plated_iron_boots = null;
	
	public static final Item plated_diamond_helmet = null;
	public static final Item plated_diamond_chestplate = null;
	public static final Item plated_diamond_leggings = null;
	public static final Item plated_diamond_boots = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		
		//Items
		event.getRegistry().register(new Item(new Item.Properties()
				.group(MooncrafItemGroup.instance)
				
				)
				.setRegistryName("armour_plates"));		
		
		//Foods
		event.getRegistry().register(new Item(new Item.Properties()
				.group(MooncrafItemGroup.instance)
				.food(new Food.Builder().hunger(10).saturation(1.2f).setAlwaysEdible()
						.effect(new EffectInstance(Effects.ABSORPTION, 2400, 1), 0.5f)
						.effect(new EffectInstance(Effects.SPEED, 2400, 1), 1).build()))
				.setRegistryName("cheese"));
		event.getRegistry().register(new Item(new Item.Properties()
				.group(MooncrafItemGroup.instance)
				.food(new Food.Builder().hunger(20).saturation(4f).setAlwaysEdible()
						.effect(new EffectInstance(Effects.ABSORPTION, 2400, 4), 1)
						.effect(new EffectInstance(Effects.RESISTANCE, 6000, 1), 1)
						.effect(new EffectInstance(Effects.REGENERATION, 600, 5), 1)
						.effect(new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 1), 1).build()))
				.setRegistryName("blu_cheese"));
		event.getRegistry().register(new Item(new Item.Properties()
				.group(MooncrafItemGroup.instance)
				.food(new Food.Builder().hunger(10).saturation(1.2f).setAlwaysEdible()
						.effect(new EffectInstance(Effects.ABSORPTION, 2400, 1), 0.5f)
						.effect(new EffectInstance(Effects.BAD_OMEN, 2400, 1), 1)
						.effect(new EffectInstance(Effects.BLINDNESS, 2400, 1), 1)
						.effect(new EffectInstance(Effects.CONDUIT_POWER, 2400, 1), 1)
						.effect(new EffectInstance(Effects.DOLPHINS_GRACE, 2400, 1), 1)
						.effect(new EffectInstance(Effects.FIRE_RESISTANCE, 2400, 1), 1)
						.effect(new EffectInstance(Effects.GLOWING, 2400, 1), 1)
						.effect(new EffectInstance(Effects.HASTE, 2400, 1), 1)
						.effect(new EffectInstance(Effects.HEALTH_BOOST, 2400, 1), 1)
						.effect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 2400, 1), 1)
						.effect(new EffectInstance(Effects.HUNGER, 2400, 1), 1)
						.effect(new EffectInstance(Effects.INSTANT_DAMAGE, 2400, 1), 1)
						.effect(new EffectInstance(Effects.INSTANT_HEALTH, 2400, 1), 1)
						.effect(new EffectInstance(Effects.INVISIBILITY, 2400, 1), 1)
						.effect(new EffectInstance(Effects.JUMP_BOOST, 2400, 1), 1)
						.effect(new EffectInstance(Effects.LEVITATION, 2400, 1), 1)
						.effect(new EffectInstance(Effects.LUCK, 2400, 1), 1)
						.effect(new EffectInstance(Effects.MINING_FATIGUE, 2400, 1), 1)
						.effect(new EffectInstance(Effects.NAUSEA, 2400, 1), 1)
						.effect(new EffectInstance(Effects.NIGHT_VISION, 2400, 1), 1)
						.effect(new EffectInstance(Effects.POISON, 2400, 1), 1)
						.effect(new EffectInstance(Effects.REGENERATION, 2400, 1), 1)
						.effect(new EffectInstance(Effects.RESISTANCE, 2400, 1), 1)
						.effect(new EffectInstance(Effects.SATURATION, 2400, 1), 1)
						.effect(new EffectInstance(Effects.SLOW_FALLING, 2400, 1), 1)
						.effect(new EffectInstance(Effects.SLOWNESS, 2400, 1), 1)
						.effect(new EffectInstance(Effects.STRENGTH, 2400, 1), 1)
						.effect(new EffectInstance(Effects.UNLUCK, 2400, 1), 1)
						.effect(new EffectInstance(Effects.WATER_BREATHING, 2400, 1), 1)
						.effect(new EffectInstance(Effects.WEAKNESS, 2400, 1), 1)
						.effect(new EffectInstance(Effects.WITHER, 2400, 1), 1).build()))
				.setRegistryName("moldy_cheese"));
		
		//Tools
		event.getRegistry().register(new SwordItem(ModItemTier.BONE_TIER, 6, 5.0f, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("bone_sword"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.BONE_TIER, 3, 5.0f, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("bone_pickaxe"));
		event.getRegistry().register(new AxeItem(ModItemTier.BONE_TIER, 5, 5.0f, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("bone_axe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.BONE_TIER, 3, 5.0f, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("bone_shovel"));
		event.getRegistry().register(new HoeItem(ModItemTier.BONE_TIER, 5.0f, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("bone_hoe"));
			
		event.getRegistry().register(new SwordItem(Mod1ItemTier.BONE_DIAMOND_TIER, 5, 5.0f, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("infused_bone_diamond_sword"));
		event.getRegistry().register(new PickaxeItem(Mod1ItemTier.BONE_DIAMOND_TIER, 3, 5.0f, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("bone_diamond_pickaxe"));
		event.getRegistry().register(new AxeItem(Mod1ItemTier.BONE_DIAMOND_TIER, 5, 5.0f, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("bone_diamond_axe"));
		event.getRegistry().register(new ShovelItem(Mod1ItemTier.BONE_DIAMOND_TIER, 3, 5.0f, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("bone_diamond_shovel"));
		event.getRegistry().register(new HoeItem(Mod1ItemTier.BONE_DIAMOND_TIER, 5.0f, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("bone_diamond_hoe"));
		
		//Armour 
		//event.getRegistry().register(new ArmorItem(IPlateArmorMaterial.TEST, EquipmentSlotType.HEAD, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("plated_iron_helmet"));
		//event.getRegistry().register(new ArmorItem(IPlateArmorMaterial.TEST, EquipmentSlotType.CHEST, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("plated_iron_chestplate"));
		//event.getRegistry().register(new ArmorItem(IPlateArmorMaterial.TEST, EquipmentSlotType.LEGS, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("plated_iron_leggings"));
		//event.getRegistry().register(new ArmorItem(IPlateArmorMaterial.TEST, EquipmentSlotType.FEET, new Item.Properties().group(MooncrafItemGroup.instance)).setRegistryName("plated_iron_boots"));
		
	}
	
	public enum ModItemTier implements IItemTier{
		
		// harvestLevel,  maxUses,  efficiency,  attackDamage,  enchantability, Supplier<Ingredient> repairMaterial
		BONE_TIER(3, 150, 5, 4, 20, () -> {
			return Ingredient.fromItems(Items.BONE);
		});
		
		private final int harvestLevel; 
		private final int maxUses; 
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) 
		{
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() { 
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		
	}

public enum Mod1ItemTier implements IItemTier{
		
		// harvestLevel,  maxUses,  efficiency,  attackDamage,  enchantability, Supplier<Ingredient> repairMaterial
		BONE_DIAMOND_TIER(5, 1200, 5, 8, 20, () -> {
			return Ingredient.fromItems(Items.DIAMOND);
		});
		
		private final int harvestLevel; 
		private final int maxUses; 
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private Mod1ItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) 
		{
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		
	}

/*public enum IPlateArmorMaterial implements IArmorMaterial
{
	TEST(Mooncraf.MOD_ID + ":test", 5, new int[] {7, 9, 11, 7}, 20, SoundEvents.field_226124_Y_, 7F, () -> {
		return Ingredient.fromItems(Items.IRON_INGOT);
	});

	private static final int[] MAX_DAMAGE_ARRAY = new int[] { 16, 16, 16, 16 };	
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantablility;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final LazyValue<Ingredient> repairMaterial;
	
	private IPlateArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn) {
		
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountArrayIn;
		this.enchantablility = enchantabilityIn;
		this.soundEvent = soundEventIn;
		this.toughness = toughnessIn;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
		
		
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub	
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.enchantablility;
	}

	@Override
	public SoundEvent getSoundEvent() {
		// TODO Auto-generated method stub
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return this.repairMaterial.getValue();
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return this.toughness; 
	}
	
} */
		
	 
}
