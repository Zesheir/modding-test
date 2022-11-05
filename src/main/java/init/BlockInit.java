package init;
import java.io.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import objects.blocks.BlockBase;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
}
