package net.rayl1x.minefear.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.rayl1x.minefear.MineFear;

import java.util.function.Supplier;

public class ModArmorMaterials implements ArmorMaterial {
    public static final ModArmorMaterials TITANIUM_INGOT = new ModArmorMaterials(
            "titanium", 26, new int[]{4, 9, 7, 4}, 25,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2f, 0f, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get())
    );

    public static final ModArmorMaterials TIN_INGOT = new ModArmorMaterials(
            "tin", 13, new int[]{2, 6, 5, 2}, 17,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(ModItems.TIN_INGOT.get())
    );

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private final int[] BASE_DURABILITY = {11, 16, 16, 13};

    public ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MineFear.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

