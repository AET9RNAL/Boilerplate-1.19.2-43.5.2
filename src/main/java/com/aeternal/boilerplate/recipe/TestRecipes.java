package com.aeternal.boilerplate.recipe;

import com.aeternal.boilerplate.api.annotation.AutoRecipeProvider;
import com.aeternal.boilerplate.api.Recipes;
import net.minecraft.world.item.Items;

@AutoRecipeProvider
public class TestRecipes {
    public TestRecipes() {
        // Test Shapeless Recipe
        Recipes.recipe.addShapelessRecipe(Items.DIAMOND, Items.DIRT, Items.DIRT);
        
        // Test Shaped Recipe
        Recipes.recipe.addRecipe(Items.DIAMOND_SWORD, 
            " A ", 
            " A ", 
            " B ", 
            'A', Items.DIAMOND, 
            'B', Items.STICK
        );
    }
}
