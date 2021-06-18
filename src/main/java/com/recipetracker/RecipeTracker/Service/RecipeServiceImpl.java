package com.recipetracker.RecipeTracker.Service;

import com.recipetracker.RecipeTracker.exceptions.NotFoundException;
import com.recipetracker.RecipeTracker.exceptions.RecordNotFoundException;
import com.recipetracker.RecipeTracker.model.Recipe;
import com.recipetracker.RecipeTracker.repositories.DirectionsRepository;
import com.recipetracker.RecipeTracker.repositories.IngredientsRepository;
import com.recipetracker.RecipeTracker.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {
    private RecipeRepository recipeRepository;
    private IngredientsRepository ingredientsRepository;
    private DirectionsRepository directionsRepository;

    @Autowired
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<Recipe> getRecipes() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe getRecipe(Long id) {
        Optional<Recipe> recipe = recipeRepository.findById(id);
        if (recipe.isPresent()) {
            return recipe.get();
        } else {
            throw new RecordNotFoundException("Recipe does not exist");
        }
    }


    @Override
    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public void deleteRecipe(Long id) {
        recipeRepository.deleteById(id);
    }


    @Override
    public void assignIngredients(Long recipeId, Long ingredientsId) {

        var optionalRecipe = recipeRepository.findById(recipeId);
        var optionalIngredients = ingredientsRepository.findById(ingredientsId);

        if (optionalRecipe.isPresent() && optionalIngredients.isPresent()) {
            var recipe = optionalRecipe.get();
            var ingredient = optionalIngredients.get();

            recipe.getIngredients().add(ingredient);
            recipeRepository.save(recipe);
        } else {
            throw new NotFoundException();
        }
    }

    @Override
    public void assignDirections(Long recipeId, Long directionsId) {
        var optionalRecipe = recipeRepository.findById(recipeId);
        var optionalDirections = directionsRepository.findById(directionsId);

        if (optionalDirections.isPresent() && optionalRecipe.isPresent()) {
            var recipe = optionalRecipe.get();
            var direction = optionalDirections.get();

            recipe.getDirections().add(direction);
            recipeRepository.save(recipe);
        } else {
            throw new NotFoundException();
        }
    }

    @Override
    public void uploadRecipeImage(Long id, MultipartFile file) throws IOException {
        var optionalRecipe = recipeRepository.findById(id);
        if (optionalRecipe.isPresent()) {
            var recipe = optionalRecipe.get();
            recipe.setRecipeImage(file.getBytes());
            recipeRepository.save(recipe);
        } else {
            throw new NotFoundException();
        }

    }

    @Override
    public Byte[] getRecipeImage(Long id) {
        var optionalRecipe = recipeRepository.findById(id);
        if (optionalRecipe.isPresent()) {
            return optionalRecipe.get().getRecipeImage();
        } else  {
            throw new NotFoundException();
        }
    }
}