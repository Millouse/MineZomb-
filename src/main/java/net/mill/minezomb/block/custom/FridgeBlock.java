package net.mill.minezomb.block.custom;

import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;

import java.util.function.Supplier;

public class FridgeBlock extends ChestBlock {

    private boolean isOpen = false;

    public FridgeBlock(Properties properties, Supplier<BlockEntityType<? extends ChestBlockEntity>> blockEntityTypeSupplier) {
        super(properties, blockEntityTypeSupplier);
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean getIsOpen() {
        return isOpen;
    }
}
