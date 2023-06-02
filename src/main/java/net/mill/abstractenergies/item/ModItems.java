package net.mill.abstractenergies.item;

import net.mill.abstractenergies.AbstractEnergies;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AbstractEnergies.MOD_ID);

    public static final RegistryObject<Item> DRAGON_TEAR = ITEMS.register("dragon_tear",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(16)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
