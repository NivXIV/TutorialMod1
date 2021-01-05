package com.iine.tutorialmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BreadMakerBlock extends Block{

    public BreadMakerBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f,6.0f)
                .sound(SoundType.SNOW)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
    }
}
