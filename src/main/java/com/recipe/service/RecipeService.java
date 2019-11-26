package com.recipe.service;

import com.recipe.domain.Recipe;
import com.recipe.repositories.RecipeRepository;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
