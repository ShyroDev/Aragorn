package net.shyrodev.aragorn;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.shyrodev.aragorn.item.ModCreativeModeTabs;
import net.shyrodev.aragorn.item.ModItems;
import org.slf4j.Logger;



@Mod(AragornMod.MOD_ID)
public class AragornMod
{
    public static final String MOD_ID = "aragorn";
    private static final Logger LOGGER = LogUtils.getLogger();





    public AragornMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();



        ModItems.register(modEventBus);




        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }





    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }




    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {

        if (event.getTab() == ModCreativeModeTabs.ARAGORN_TAB)
        {
            event.accept(ModItems.URANIUM);
            event.accept(ModItems.RAW_URANIUM);
            event.accept(ModItems.PENCHBLENDE);
            event.accept(ModItems.RAW_PENCHBLENDE);
            event.accept(ModItems.URANOPHASE);
            event.accept(ModItems.RAW_URANOPHASE);
            event.accept(ModItems.TOBERNITE);
            event.accept(ModItems.RAW_TOBERNITE);
            event.accept(ModItems.AUTUNITE);
            event.accept(ModItems.RAW_AUTUNITE);
        }

    }





    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {


        }

    }


}
