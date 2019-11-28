package com.recipe.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
//@Builder
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Recipe recipe;

    @Lob //this let the property to be large enough
    private String recipeNote;

    /* with @Builder
     * we can create object of the class like this
     *  Notes.builder().recipe("***").recipeNote("***").build;
     * */

}
