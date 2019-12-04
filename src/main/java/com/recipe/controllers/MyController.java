package com.recipe.controllers;

import com.recipe.service.RecipeService;
import javassist.compiler.MemberResolver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyController {

    private RecipeService recipeService;

    public MyController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndex(Model model){

        model.addAttribute("recipes",recipeService.getRecipes());

        return "index";
    }

}
