package com.recipetracker.RecipeTracker.Service;

import com.recipetracker.RecipeTracker.model.Ingredients;

import java.util.List;

public interface IngredientsService {

    List<Ingredients> getIngredients(Long id);

}