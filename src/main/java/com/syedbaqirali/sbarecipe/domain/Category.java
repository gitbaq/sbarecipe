/**
 * 
 */
package com.syedbaqirali.sbarecipe.domain;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author SBA on 06/27/2020
 *
 */
@Data
@EqualsAndHashCode(exclude="recipes")
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	
	@ManyToMany(mappedBy="categories")
	private Set<Recipe> recipes;

	

	/**
	 * @return the recipes
	 */
	public Set<Recipe> getRecipes() {
		return recipes;
	}

	/**
	 * @param recipes the recipes to set
	 */
	public void setRecipes(Set<Recipe> recipes) {
		this.recipes = recipes;
	}
	
	

}
