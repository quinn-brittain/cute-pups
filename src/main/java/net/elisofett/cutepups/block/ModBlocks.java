package net.elisofett.cutepups.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockBowl dogBowl = new BlockBowl("food_bowl");

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                dogBowl
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                dogBowl.createItemBlock()
        );
    }

    public static void registerModels() {
        dogBowl.registerItemModel(Item.getItemFromBlock(dogBowl));
    }

}