package com.recipetracker.RecipeTracker.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Ingredients {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<Ingredients> ingredients = new ArrayList<>();

    //Getters

    public Long getId() {
        return id;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}