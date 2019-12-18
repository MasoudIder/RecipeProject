package com.recipe.repositories;

import com.recipe.domain.Category;
import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Integer> {

    Optional<Category> findByDescription(String description);

}
