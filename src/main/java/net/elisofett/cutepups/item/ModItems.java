package net.elisofett.cutepups.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
    public static ItemBase dogFood = new ItemBase("dog_food").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase dogBowl = new ItemBase("dog_bowl").setCreativeTab(CreativeTabs.MATERIALS);
    public static void register(IForgeRegistry<Item> registry) {

        registry.registerAll(
                dogFood, dogBowl
        );
    }

    public static void registerModels() {
        dogFood.registerItemModel();
        dogBowl.registerItemModel();
    }


}
