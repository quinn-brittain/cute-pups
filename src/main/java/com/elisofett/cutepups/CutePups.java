package com.elisofett.cutepups;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CutePups.modId, name = CutePups.name, version = CutePups.version)
public class CutePups {

    public static final String modId = "cutepups";
    public static final String name = "Cute Pups";
    public static final String version = "0.5.0";

    @Mod.Instance(modId)
    public static CutePups instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
