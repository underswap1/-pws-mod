package com.example.pws;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;

public class ModToolMaterial {
    public static final ToolMaterial BONE = new ToolMaterial() {

        @Override
        public int getDurability() {
            return 150;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 3.0F;
        }

        @Override
        public float getAttackDamage() {
            return 1.0F;
        }

        @Override
        public int getMiningLevel() {
            return 1;
        }

        @Override
        public int getEnchantability() {
            return 17;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.BONE);
        }
    };
}