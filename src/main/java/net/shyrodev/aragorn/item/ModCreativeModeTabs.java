package net.shyrodev.aragorn.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shyrodev.aragorn.AragornMod;

@Mod.EventBusSubscriber(modid = AragornMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs
{
    public static CreativeModeTab ARAGORN_TAB;


    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        ARAGORN_TAB = event.registerCreativeModeTab(new ResourceLocation(AragornMod.MOD_ID, "aragorn_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.URANIUM.get()))
                        .title(Component.translatable("creativemodetab.aragorn_tab")));
    }
}
