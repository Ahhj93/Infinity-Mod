package fr.ryse93.infinitymod.init;

import com.google.common.collect.Lists;
import fr.ryse93.infinitymod.ModInfinity;
import fr.ryse93.infinitymod.blocks.BlockModInfinity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = ModInfinity.MODID)
public class ModBlocks
{

    public static final ModBlocks INSTANCE = new ModBlocks();

    public static List<Block> blocks;
    public static List<BlockItem> blockItems;

    public static Block infinity_block;
    public static Block infinity_ore;

    private static void init()
    {
        blocks = Lists.newArrayList();
        blockItems = Lists.newArrayList();

        infinity_block = new BlockModInfinity("infinity_block", AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(5f, 20f));
        infinity_ore = new BlockModInfinity("infinity_ore", AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 20.0f).harvestTool(ToolType.PICKAXE).harvestLevel(3));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e)
    {

        init();

        for (Block b : blocks)
        {
            e.getRegistry().register(b);
        }

    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> e)
    {
        for (BlockItem bi : blockItems)
        {
          e.getRegistry().register(bi);
        }

    }

}
