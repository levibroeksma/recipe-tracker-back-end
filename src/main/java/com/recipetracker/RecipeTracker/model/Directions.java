package com.recipetracker.RecipeTracker.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Directions {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<Directions> directions = new ArrayList<>();

    // Getters

    public Long getId() {
        return id;
    }

    public List<Directions> getDirections() {
        return directions;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setDirections(List<Directions> directions) {
        this.directions = directions;
    }
}