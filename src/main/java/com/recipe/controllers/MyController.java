package com.recipe.controllers;

import com.recipe.domain.Category;
import com.recipe.domain.UnitOfMeasure;
import com.recipe.repositories.CategoryRepository;
import com.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class MyController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public MyController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    private String getIndex(Model model){

        Optional<Category> categoryOptional=categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional=unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("category "+categoryOptional.get().getId());
        System.out.println("unit "+unitOfMeasureOptional.get().getId());
        return "index";
    }

}
