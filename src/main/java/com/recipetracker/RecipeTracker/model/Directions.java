package com.recipetracker.RecipeTracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Directions {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "recipe_directions")
    private String[] directions;

}