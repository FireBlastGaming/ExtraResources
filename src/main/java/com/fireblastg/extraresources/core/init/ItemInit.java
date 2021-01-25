package com.fireblastg.extraresources.core.init;

import com.fireblastg.extraresources.ExtraResources;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraResources.MOD_ID);
	
	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
			() -> new Item(new Properties().group(ExtraResources.EXTRA_RESOURCES_GROUP)));

	public static final RegistryObject<Item> GOD_CARROT = ITEMS.register("god_carrot", 
			() -> new Item(new Properties().group(ExtraResources.EXTRA_RESOURCES_GROUP)
					.food(new Food.Builder().effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 1200, 2), 0.5f)
							.effect(() -> new EffectInstance(Effects.HASTE, 1200, 2), 0.05f)
							.effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 1200, 2), 0.1f)
							.effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 1200, 2), 0.2f)
							.effect(() -> new EffectInstance(Effects.LUCK, 1200, 2), 0.01f)
							.effect(() -> new EffectInstance(Effects.REGENERATION, 1200, 2), 0.3f)
							.effect(() -> new EffectInstance(Effects.SPEED, 1200, 2), 0.4f)
							.effect(() -> new EffectInstance(Effects.STRENGTH, 1200, 2), 0.1f)
							.effect(() -> new EffectInstance(Effects.SLOW_FALLING, 1200, 2), 0.1f).fastToEat()
							.hunger(2).saturation(0.2f).setAlwaysEdible().build())));
	
	//Block Items
	
	public static final RegistryObject<BlockItem> COPPER_ORE = ITEMS.register("copper_ore", () -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().group(ExtraResources.EXTRA_RESOURCES_GROUP)));

}