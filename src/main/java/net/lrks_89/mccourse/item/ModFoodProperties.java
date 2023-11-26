package net.lrks_89.mccourse.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(3).saturationMod(.25f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200),.1f).build();
}
