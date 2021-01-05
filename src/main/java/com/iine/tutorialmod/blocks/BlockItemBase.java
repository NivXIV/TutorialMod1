package com.iine.tutorialmod.blocks;

import com.iine.tutorialmod.tutorialmod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(tutorialmod.TAB));
    }
}
