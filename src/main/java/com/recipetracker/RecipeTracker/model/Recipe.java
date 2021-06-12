package com.recipetracker.RecipeTracker.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "Recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recipe_title")
    private String title;

    @Column(name = "recipe_description")
    private String description;

    @Column(name = "recipe_prepTime")
    private String prepTime;

    @Column(name = "recipe_calories")
    private String calories;

    @Column(name = "recipe_fish_boolean")
    private Boolean fish;

    @Column(name = "recipe_beef_boolean")
    private Boolean beef;

    @Column(name = "recipe_lamb_boolean")
    private Boolean lamb;

    @Column(name = "recipe_pork_boolean")
    private Boolean pork;

    @Column(name = "recipe_vegan_boolean")
    private Boolean vegan;

    @Column(name = "recipe_vegetarian_boolean")
    private Boolean vegetarian;

    @Column(name = "recipe_spicy_boolean")
    private Boolean spicy;

    @Lob
    @Column(name = "country_flag_path")
    private Byte[] flag;
    @Lob
    @Column(name = "country_recipeImg_path")
    private Byte[] recipeImage;

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

    public Byte[] getRecipeImage() {
        return recipeImage;
    }

    public Boolean getBeef() {
        return beef;
    }

    public Boolean getFish() {
        return fish;
    }

    public Boolean getLamb() {
        return lamb;
    }

    public Boolean getPork() {
        return pork;
    }

    public Boolean getSpicy() {
        return spicy;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public Boolean getVegetarian() {
        return vegetarian;
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

    public void setRecipeImage(Byte[] recipeImage) {
        this.recipeImage = recipeImage;
    }

    public void setBeef(Boolean beef) {
        this.beef = beef;
    }

    public void setFish(Boolean fish) {
        this.fish = fish;
    }

    public void setLamb(Boolean lamb) {
        this.lamb = lamb;
    }

    public void setPork(Boolean pork) {
        this.pork = pork;
    }

    public void setSpicy(Boolean spicy) {
        this.spicy = spicy;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}