package com.recipe.controllers;

import com.recipe.service.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class MyControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    MyController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        controller=new MyController(recipeService);
    }


    @Test
    void getIndex() {

        String viewName=controller.getIndex(model);

        assertEquals(viewName,"index");

        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute(eq("recipes") ,anySet());
    }
}