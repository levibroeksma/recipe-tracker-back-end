package com.recipetracker.RecipeTracker.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String prepTime;

    private String calories;

    private Boolean fish;

    private Boolean beef;

    private Boolean lamb;

    private Boolean pork;

    private Boolean vegan;

    private Boolean vegetarian;

    private Boolean spicy;

    @OneToMany(mappedBy = "ingredients")
    private List<Ingredients> ingredients;

    @OneToMany(mappedBy = "directions")
    private List<Directions> directions;

//    @Lob
//    @Column(name = "country_flag_path")
//    private Byte[] flag;

    @Lob
    private Byte[] recipeImage;

    // Getters

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public List<Directions> getDirections() {
        return directions;
    }

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

//    public Byte[] getFlag() {
//        return flag;
//    }

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

//    public void setFlag(Byte[] flag) {
//        this.flag = flag;
//    }

    public void setRecipeImage(byte[] recipeImage) {
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