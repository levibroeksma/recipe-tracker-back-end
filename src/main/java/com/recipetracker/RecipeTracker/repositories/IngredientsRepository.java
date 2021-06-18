package com.recipetracker.RecipeTracker.repositories;

import com.recipetracker.RecipeTracker.model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientsRepository extends JpaRepository<Ingredients, Long> {
    List<Ingredients> findByNameContainingIgnoreCase(String query);

    List<Ingredients> findByType(String type);
}
