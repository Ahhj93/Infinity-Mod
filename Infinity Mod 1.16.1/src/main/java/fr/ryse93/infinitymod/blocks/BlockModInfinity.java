package fr.ryse93.infinitymod.blocks;

import fr.ryse93.infinitymod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockModInfinity extends Block
{
    public BlockModInfinity(String name, Properties properties)
    {
        super(properties);
        setRegistryName(name);

        ModBlocks.blocks.add(this);
        ModBlocks.blockItems.add((BlockItem) new BlockItem(this, new Item.Properties()).setRegistryName(getRegistryName()));

    }
}
