package net.elisofett.cutepups.item;

import net.elisofett.cutepups.CutePups;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;
    setUnlocalizedName(CutePups.modId + "." + name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        CutePups.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}

