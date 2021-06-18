package com.recipetracker.RecipeTracker.controllers;

import com.recipetracker.RecipeTracker.Service.RecipeService;
import com.recipetracker.RecipeTracker.model.Recipe;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin (origins = {"*"})
@RestController
@RequestMapping("Recipe")
public class RecipeController {
    RecipeService recipeService;


}
