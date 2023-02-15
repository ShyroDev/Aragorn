package net.shyrodev.aragorn.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shyrodev.aragorn.AragornMod;
import net.shyrodev.aragorn.ModCreativeModeTabs;

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


    public static final RegistryObject<Item> THORIUM = ITEMS.register("thorium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_THORIUM = ITEMS.register("raw_thorium",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> THORITE = ITEMS.register("thorite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_THORITE = ITEMS.register("raw_thorite",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> THORIANITE = ITEMS.register("thorianite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_THORIANITE = ITEMS.register("raw_thorianite",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> BRANNERITE = ITEMS.register("brannerite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BRANNERITE = ITEMS.register("raw_brannerite",
            () -> new Item(new Item.Properties()));






    public static void addItem(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModCreativeModeTabs.ARAGORN_TAB)
        {
            event.accept(ModItems.URANIUM);
            event.accept(ModItems.PENCHBLENDE);
            event.accept(ModItems.URANOPHASE);
            event.accept(ModItems.TOBERNITE);
            event.accept(ModItems.AUTUNITE);
            event.accept(ModItems.THORIUM);
            event.accept(ModItems.THORIANITE);
            event.accept(ModItems.THORITE);
            event.accept(ModItems.BRANNERITE);

            event.accept(ModItems.RAW_THORIUM);
            event.accept(ModItems.RAW_TOBERNITE);
            event.accept(ModItems.RAW_URANIUM);
            event.accept(ModItems.RAW_PENCHBLENDE);
            event.accept(ModItems.RAW_URANOPHASE);
            event.accept(ModItems.RAW_AUTUNITE);
            event.accept(ModItems.RAW_THORIANITE);
            event.accept(ModItems.RAW_THORITE);
            event.accept(ModItems.RAW_BRANNERITE);
        }

    }















    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
