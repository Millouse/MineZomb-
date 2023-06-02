package net.mill.minezomb.item;

import net.mill.minezomb.MineZomb;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineZomb.MOD_ID);

    public static final RegistryObject<Item> ZOMBIE_FLESH = ITEMS.register("zombie_flesh",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).stacksTo(16)));
    public static final RegistryObject<Item> MACHETE = ITEMS.register("machete",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).food(ModFoods.SALT)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB).food(ModFoods.CHEESE)));
    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
