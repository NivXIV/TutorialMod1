package com.iine.tutorialmod.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class PlainBread extends Item {
    public PlainBread() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                                .hunger(5)
                        .fastToEat()
                        .meat()
                .saturation(1.2f)
                .setAlwaysEdible()
                        .build()

                )





        );
    }
}
