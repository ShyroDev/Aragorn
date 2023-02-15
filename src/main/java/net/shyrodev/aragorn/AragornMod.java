package net.shyrodev.aragorn;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.shyrodev.aragorn.block.ModBlocks;
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
        ModBlocks.register(modEventBus);





        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }





    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }


    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        ModItems.addItem(event);
        ModBlocks.addBlock(event);
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
