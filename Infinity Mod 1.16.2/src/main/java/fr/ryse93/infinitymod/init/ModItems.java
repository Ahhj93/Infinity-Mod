package fr.ryse93.infinitymod.init;

import com.google.common.collect.Lists;
import fr.ryse93.infinitymod.ModInfinity;
import fr.ryse93.infinitymod.items.ItemModInfinity;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = ModInfinity.MODID)
public class ModItems
{

    public static final ModItems INSTANCE = new ModItems();

    public static List<Item> items;

    public static Item infinity_stick;
    public static Item infinity_ingot;

    private static void init()
    {

        items = Lists.newArrayList();

        infinity_stick = new ItemModInfinity("infinity_stick");
        infinity_ingot = new ItemModInfinity("infinity_ingot");

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e)
    {

        init();

        for(Item item : items)
        {
            e.getRegistry().register(item);
        }

    }

}
