package com.recipetracker.RecipeTracker.Service;

import com.recipetracker.RecipeTracker.model.Recipe;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {


    @Override
    public List<Recipe> getRecipes() {
        return null;
    }

    @Override
    public Recipe getRecipe(Long id) {
        return null;
    }

    @Override
    public Recipe saveRecipe(Recipe recipe) {
        return null;
    }

    @Override
    public void deleteRecipe(Long id) {

    }

    @Override
    public void assignIngredients(Long recipeId, Long IngredientsId) {

    }

    @Override
    public void assignDirections(Long recipeId, Long DirectionsId) {

    }

    @Override
    public void uploadRecipeImage(Long id, MultipartFile file) throws IOException {

    }

    @Override
    public byte[] getRecipeId(Long id) {
        return new byte[0];
    }
}
