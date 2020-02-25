package net.shadowfacts.tutorial.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;
import net.shadowfacts.tutorial.item.ModItems;

public class ModBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper");
    public static BlockCrop cropCorn = new BlockCrop("crop_corn", "seed_corn", "corn");

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper,
                cropCorn
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock()
        );
    }

    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
    }

}