package com.recipetracker.RecipeTracker.repositories;

import com.recipetracker.RecipeTracker.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
