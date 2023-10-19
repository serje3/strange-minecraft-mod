package net.serje3.copromod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.serje3.copromod.CoproMod;
import net.serje3.copromod.init.ItemInit;
import net.serje3.copromod.util.IHasModel;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name, CreativeTabs tabs) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tabs);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        CoproMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
