package com.recipetracker.RecipeTracker.Service;

import com.recipetracker.RecipeTracker.model.Directions;

import java.util.List;

public interface DirectionsService {

    List<Directions> getDirections(Long id);

}