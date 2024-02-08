package net.awakey.com.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RADIOACTIVE_CARROT = new FoodComponent.Builder().hunger(6).saturationModifier(2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600),0.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,200),0.05f).build();
    public static final FoodComponent RADIOACTIVE_BREAD = new FoodComponent.Builder().hunger(5).saturationModifier(2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE,6000),0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN,3600),0.08f).build();
    public static final FoodComponent RADIOACTIVE_CHICKEN = new FoodComponent.Builder().hunger(6).saturationModifier(3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,600),0.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,300),0.10f).build();
    public static final FoodComponent RADIOACTIVE_APPLE = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600),0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,200),0.05f).build();
    public static final FoodComponent OMNIPOTENT_APPLE = new FoodComponent.Builder().hunger(20).saturationModifier(7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3600,6),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3600),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3600,4),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3600,2),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3600,2),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 3600),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 3600),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 3600),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3600),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3600),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3600),1f)
            .alwaysEdible().build();
    public static final FoodComponent RADIOACTIVE_BAKED_POTATO = new FoodComponent.Builder().hunger(7).saturationModifier(0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,600),0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE,200),0.05f).build();
    public static final FoodComponent RADIOACTIVE_COOKED_BEEF = new FoodComponent.Builder().hunger(10).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,600,2),0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,200),0.05f)
            .build();
    public static final FoodComponent RADIOACTIVE_BEETROOT = new FoodComponent.Builder().hunger(2).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,600,2),0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,300),0.05f)
            .build();
    public static final FoodComponent RADIOACTIVE_COOKED_COD = new FoodComponent.Builder().hunger(7).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,600),0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS,300),0.05f)
            .build();
    public static final FoodComponent RADIOACTIVE_COOKED_MUTTON = new FoodComponent.Builder().hunger(9).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION,600),0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,300),0.05f)
            .build();
    public static final FoodComponent RADIOACTIVE_COOKED_PORKCHOP = new FoodComponent.Builder().hunger(10).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600),0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,300),0.05f)
            .build();
    public static final FoodComponent RADIOACTIVE_COOKED_RABBIT = new FoodComponent.Builder().hunger(7).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,600),0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,200,10),0.05f)
            .build();
    public static final FoodComponent RADIOACTIVE_COOKED_SALMON = new FoodComponent.Builder().hunger(8).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,600),0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,200),0.05f)
            .build();

















}
