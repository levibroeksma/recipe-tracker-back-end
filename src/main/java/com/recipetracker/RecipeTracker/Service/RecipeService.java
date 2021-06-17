package com.recipetracker.RecipeTracker.Service;

import com.recipetracker.RecipeTracker.model.Recipe;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface RecipeService {

    List<Recipe> getRecipes();

    Recipe getRecipe(Long id);

    Recipe saveRecipe(Recipe recipe);

    void deleteRecipe(Long id);

    void assignIngredients(Long recipeId, Long IngredientsId);

    void assignDirections(Long recipeId, Long DirectionsId);

    void uploadRecipeImage(Long id, MultipartFile file) throws IOException;

    byte[] getRecipeId(Long id);

}
