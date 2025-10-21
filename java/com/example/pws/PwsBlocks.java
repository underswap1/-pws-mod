package com.example.pws;

import com.example.pws.blocks.DrumBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class PwsBlocks {
    public static final Block DRUM_BLOCK = new DrumBlock();

    public static void registerBlocks() {
        Registry.register(Registries.BLOCK, new Identifier("pws", "drum_block"), DRUM_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("pws", "drum_block"),
                new BlockItem(DRUM_BLOCK, new FabricItemSettings()));
    }
}