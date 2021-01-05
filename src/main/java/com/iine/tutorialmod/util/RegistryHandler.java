package com.iine.tutorialmod.util;

import com.iine.tutorialmod.armor.ModArmorMaterial;
import com.iine.tutorialmod.blocks.BlockItemBase;
import com.iine.tutorialmod.blocks.BreadMakerBlock;
import com.iine.tutorialmod.items.PlainBread;
import com.iine.tutorialmod.tools.ModItemTier;
import com.iine.tutorialmod.tutorialmod;
import com.iine.tutorialmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, tutorialmod.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, tutorialmod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }




    //Items
    //public static final RegistryObject<Item> PLAIN_BREAD = ITEMS.register( "plain_bread", ItemBase::new);
    public static final RegistryObject<PlainBread> PLAIN_BREAD = ITEMS.register("plain_bread", PlainBread::new);

    //Tools
    public static final RegistryObject<SwordItem> PLAIN_BREAD_SWORD = ITEMS.register("plain_bread_sword", () ->
            new SwordItem(ModItemTier.PLAIN_BREAD,0, 0.0F, new Item.Properties().group(tutorialmod.TAB)));

    //Blocks
    public static final RegistryObject<Block> BREAD_MAKER_BLOCK = BLOCKS.register("bread_maker", BreadMakerBlock::new);

    //Block Items
    public static final RegistryObject<Item> BREAD_MAKER_BLOCK_ITEM =  ITEMS.register("bread_maker", () -> new BlockItemBase(BREAD_MAKER_BLOCK.get()));

    //Armor
    public static final RegistryObject<ArmorItem> PLAIN_BREAD_HELMET = ITEMS.register("plain_bread_helmet", () ->
            new ArmorItem(ModArmorMaterial.PLAIN_BREAD, EquipmentSlotType.HEAD, new Item.Properties().group(tutorialmod.TAB)));

    public static final RegistryObject<ArmorItem> PLAIN_BREAD_CHESTPLATE = ITEMS.register("plain_bread_chestplate", () ->
            new ArmorItem(ModArmorMaterial.PLAIN_BREAD, EquipmentSlotType.CHEST, new Item.Properties().group(tutorialmod.TAB)));

    public static final RegistryObject<ArmorItem> PLAIN_BREAD_LEGGINGS = ITEMS.register("plain_bread_leggings", () ->
            new ArmorItem(ModArmorMaterial.PLAIN_BREAD, EquipmentSlotType.LEGS, new Item.Properties().group(tutorialmod.TAB)));

    public static final RegistryObject<ArmorItem> PLAIN_BREAD_BOOTS = ITEMS.register("plain_bread_boots", () ->
            new ArmorItem(ModArmorMaterial.PLAIN_BREAD, EquipmentSlotType.FEET, new Item.Properties().group(tutorialmod.TAB)));
}

