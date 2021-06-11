package com.recipetracker.RecipeTracker.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    private String prepTime;

    private String calories;

    @Lob
    private Byte[] flag;

//    @OneToOne
//    @JsonBackReference("recipeIngredients")
//    Ingredients ingredients;

    // Getters

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public String getCalories() {
        return calories;
    }
    public Byte[] getFlag() {
        return flag;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public void setFlag(Byte[] flag) {
        this.flag = flag;
    }
}