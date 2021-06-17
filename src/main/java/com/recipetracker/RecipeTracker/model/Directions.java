package com.recipetracker.RecipeTracker.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Directions {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @Column(name = "recipe_directions")
    private List<Directions> directions = new ArrayList<>();

}