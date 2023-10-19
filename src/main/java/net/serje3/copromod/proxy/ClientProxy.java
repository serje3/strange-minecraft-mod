package net.serje3.copromod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Objects;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        try {
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), id));
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
