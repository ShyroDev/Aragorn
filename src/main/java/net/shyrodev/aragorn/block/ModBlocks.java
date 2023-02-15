package net.shyrodev.aragorn.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shyrodev.aragorn.AragornMod;
import net.shyrodev.aragorn.ModCreativeModeTabs;
import net.shyrodev.aragorn.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AragornMod.MOD_ID);


    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(1.5f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<Block> URANIUM_BLOCK_ORE = registerBlock("uranium_block_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5f)
                    .sound(SoundType.DRIPSTONE_BLOCK), UniformInt.of(2,5)));


    public static final RegistryObject<Block> PENCHBLENDE_BLOCK = registerBlock("penchblende_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(1.5f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<Block>  PENCHBLENDE_BLOCK_ORE = registerBlock("penchblende_block_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5f)
                    .sound(SoundType.DRIPSTONE_BLOCK), UniformInt.of(2,5)));


    public static final RegistryObject<Block> URANOPHASE_BLOCK = registerBlock("uranophase_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(1.5f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<Block>  URANOPHASE_BLOCK_ORE = registerBlock("uranophase_block_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5f)
                    .sound(SoundType.DRIPSTONE_BLOCK), UniformInt.of(2,5)));


    public static final RegistryObject<Block> TOBERNITE_BLOCK = registerBlock("tobernite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops().strength(1.5f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<Block>  TOBERNITE_BLOCK_ORE = registerBlock("tobernite_block_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5f)
                    .sound(SoundType.DRIPSTONE_BLOCK), UniformInt.of(2,5)));












    public static void addBlock(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModCreativeModeTabs.ARAGORN_TAB)
        {
            event.accept(ModBlocks.URANIUM_BLOCK);
            event.accept(ModBlocks.PENCHBLENDE_BLOCK);
            event.accept(ModBlocks.URANOPHASE_BLOCK);
            event.accept(ModBlocks.TOBERNITE_BLOCK);

            event.accept(ModBlocks.URANIUM_BLOCK_ORE);
            event.accept(ModBlocks.PENCHBLENDE_BLOCK_ORE);
            event.accept(ModBlocks.URANOPHASE_BLOCK_ORE);
            event.accept(ModBlocks.TOBERNITE_BLOCK_ORE);
        }
    }



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
