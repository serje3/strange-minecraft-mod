package net.serje3.copromod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.serje3.copromod.objects.items.ItemBase;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item SHIT_INGOT = new ItemBase("shit_ingot", CreativeTabs.MATERIALS);
}
