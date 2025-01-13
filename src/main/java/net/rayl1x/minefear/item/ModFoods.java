package net.rayl1x.minefear.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CANNED_BEEF_RAW = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(1.8f)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 70), 0.45f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 80), 0.17f)
            .build();

    public static final FoodProperties CANNED_BEEF_COOKED = new FoodProperties.Builder()
            .nutrition(10)
            .saturationMod(3.9f)
            .build();

    public static final FoodProperties CANNED_MUTTON_RAW = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 60), 0.35f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 70), 0.23f)
            .build();

    public static final FoodProperties CANNED_MUTTON_COOKED = new FoodProperties.Builder()
            .nutrition(8)
            .saturationMod(2.7f)
            .build();

    public static final FoodProperties CANNED_CHICKEN_RAW = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(1.7f)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 40), 0.38f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 50), 0.27f)
            .build();

    public static final FoodProperties CANNED_CHICKEN_COOKED = new FoodProperties.Builder()
            .nutrition(8)
            .saturationMod(3.3f)
            .build();

    public static final FoodProperties CANNED_PORKCHOP_RAW = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(1.8f)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 70), 0.45f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 80), 0.17f)
            .build();

    public static final FoodProperties CANNED_PORKCHOP_COOKED = new FoodProperties.Builder()
            .nutrition(10)
            .saturationMod(3.9f)
            .build();

    public static final FoodProperties CANNED_RABBIT_RAW = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(1.6f)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 50), 0.28f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 60), 0.17f)
            .build();

    public static final FoodProperties CANNED_RABBIT_COOKED = new FoodProperties.Builder()
            .nutrition(7)
            .saturationMod(2.3f)
            .build();


}
