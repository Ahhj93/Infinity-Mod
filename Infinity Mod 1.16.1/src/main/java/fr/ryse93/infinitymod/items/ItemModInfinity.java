package fr.ryse93.infinitymod.items;

import fr.ryse93.infinitymod.init.ModItems;
import net.minecraft.item.Item;

public class ItemModInfinity extends Item
{
    public ItemModInfinity(String name)
    {

        super(new Properties());

        setRegistryName(name);

        ModItems.INSTANCE.items.add(this);


    }
}
