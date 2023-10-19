package net.serje3.copromod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.serje3.copromod.objects.blocks.BlockBase;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block SHIT_BLOCK = new BlockBase("shit_block", Material.IRON);
}
