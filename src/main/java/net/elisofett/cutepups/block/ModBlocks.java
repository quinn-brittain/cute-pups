package net.elisofett.cutepups.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockBowl foodBowl = new BlockBowl("food_bowl");

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                foodBowl
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                foodBowl.createItemBlock()
        );
    }

    public static void registerModels() {
        foodBowl.registerItemModel(Item.getItemFromBlock(foodBowl));
    }

}