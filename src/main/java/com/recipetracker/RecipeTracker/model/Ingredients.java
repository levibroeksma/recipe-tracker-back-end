package com.recipetracker.RecipeTracker.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ingredients {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @Column(name = "recipe_ingredients")

    private List<Ingredients> ingredients = new ArrayList<>();
}
