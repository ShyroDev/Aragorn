package net.shyrodev.aragorn.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shyrodev.aragorn.AragornMod;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AragornMod.MOD_ID);


    public static final RegistryObject<Item> URANIUM = ITEMS.register("uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item((new Item.Properties())));


    public static final RegistryObject<Item> PENCHBLENDE = ITEMS.register("penchblende",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PENCHBLENDE = ITEMS.register("raw_penchblende",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> URANOPHASE = ITEMS.register("uranophase",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_URANOPHASE = ITEMS.register("raw_uranophase",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> TOBERNITE = ITEMS.register("tobernite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TOBERNITE = ITEMS.register("raw_tobernite",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> AUTUNITE = ITEMS.register("autunite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_AUTUNITE = ITEMS.register("raw_autunite",
            () -> new Item(new Item.Properties()));














    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
