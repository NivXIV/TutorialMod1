package com.iine.tutorialmod.armor;

import com.iine.tutorialmod.tutorialmod;
import com.iine.tutorialmod.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    PLAIN_BREAD( tutorialmod.MOD_ID + ":plain_bread", 1, new int[] { 1, 1, 2, 1 },  5,SoundEvents.BLOCK_CROP_BREAK, 5.0F, () -> { return Ingredient.fromItems(RegistryHandler.PLAIN_BREAD.get()); });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 1, 4, 3, 2 };
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {

       this.name = name;
       this.maxDamageFactor = maxDamageFactor;
       this.damageReductionAmountArray = damageReductionAmountArray;
       this.enchantability = enchantability;
       this.soundEvent = soundEvent;
       this.toughness = toughness;
       this.repairMaterial = repairMaterial;
    }



    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
