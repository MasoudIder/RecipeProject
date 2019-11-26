package com.recipe.controllers;

import com.recipe.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    private RecipeService recipeService;

    public MyController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    private String getIndex(Model model){

        model.addAttribute("recipes",recipeService.getRecipes());

        return "index";
    }

}
