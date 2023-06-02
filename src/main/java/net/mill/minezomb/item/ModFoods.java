package net.mill.minezomb.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SALT = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties CHEESE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).build();

}
