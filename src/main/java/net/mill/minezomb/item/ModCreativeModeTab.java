package net.mill.minezomb.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("ae_creative_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MACHETE.get());
        }
    };
}
