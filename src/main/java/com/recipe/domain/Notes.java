package com.recipe.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Recipe recipe;

    @Lob //this let the property to be large enough
    private String recipeNote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNote() {
        return recipeNote;
    }

    public void setRecipeNote(String recipeNote) {
        this.recipeNote = recipeNote;
    }
}
