package com.recipetracker.RecipeTracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ingredients {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "recipe_ingredients")

    // Dit werkt dus niet en ik zie niet hoe ik dit anders moet aanpakken, dit is de oplossing die ik kon vinden, maar hij blijft rood onderlijnd

    private List<Ingredients> ingredients = new ArrayList<>();

}
