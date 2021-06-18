package com.recipetracker.RecipeTracker.repositories;

import com.recipetracker.RecipeTracker.model.Directions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DirectionsRepository extends JpaRepository<Directions, Long> {
    List<Directions> findByNameContainingIgnoreCase(String query);

    List<Directions> findByType(String type);
}
