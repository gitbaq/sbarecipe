/**
 * 
 */
package com.syedbaqirali.sbarecipe.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rever
 *
 */
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by SBA 06/27/2020.
 */
@Data
@EqualsAndHashCode(exclude= {"ingredients","notes"})
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    @Lob
    private String directions;
    //todo add
    //private Difficulty difficulty;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy="recipe")
    private Set<Ingredient> ingredients = new HashSet<Ingredient>();

    @Lob
    private Byte[] image;
    
    @Enumerated(value=EnumType.STRING)
    private Difficulty difficulty;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
    
    @ManyToMany
    @JoinTable(name="recipe_category", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name="category_id"))
    private Set<Category> categories = new HashSet<Category>();



    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
        notes.setRecipe(this);
    }
    
    public Recipe addIngredient(Ingredient ingredient) {
    	ingredient.setRecipe(this);
    	this.ingredients.add(ingredient);
    	return this;
    }
    
    

}