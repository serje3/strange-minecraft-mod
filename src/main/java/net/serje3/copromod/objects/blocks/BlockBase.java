package net.serje3.copromod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.serje3.copromod.CoproMod;
import net.serje3.copromod.init.BlockInit;
import net.serje3.copromod.init.ItemInit;
import net.serje3.copromod.util.IHasModel;

import java.util.Objects;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BlockInit.BLOCKS.add(this);
        try{
            ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void registerModels() {
        CoproMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
