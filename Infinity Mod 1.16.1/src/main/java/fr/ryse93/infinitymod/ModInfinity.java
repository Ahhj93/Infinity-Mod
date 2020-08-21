package fr.ryse93.infinitymod;

import fr.ryse93.infinitymod.init.ModBlocks;
import fr.ryse93.infinitymod.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.logging.Logger;

@Mod(ModInfinity.MODID)
public class ModInfinity
{

    public static final String MODID =  "infinitymod";

    public static final Logger logger = Logger.getLogger(MODID);

    public ModInfinity()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
        MinecraftForge.EVENT_BUS.register(ModBlocks.INSTANCE);
    }

    private void setup(final FMLCommonSetupEvent e)
    {
        logger.info("Mod Setup Loading !");
    }

    private void clientSetup(final FMLClientSetupEvent e)
    {
        logger.info("Mod Client Setup Loading !");
    }
}
