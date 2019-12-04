package com.recipe.service;

import com.recipe.domain.Recipe;
import com.recipe.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RecipeServiceImpTest {

    RecipeServiceImp recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        recipeService =new RecipeServiceImp(recipeRepository);

    }

    @Test
    void getRecipes() {
        Recipe recipe=new Recipe();
        Set recipeSet=new HashSet();
        recipeSet.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipeSet);

        Set<Recipe> recipes=recipeService.getRecipes();

        assertEquals(recipes.size(),1);

        verify(recipeRepository,times(1)).findAll() ;
    }

}