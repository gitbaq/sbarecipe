/**
 * 
 */
package com.syedbaqirali.sbarecipe.domain;

import java.util.Set;

import javax.persistence.*;

/**
 * @author SBA on 06/27/2020
 *
 */
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	
	@ManyToMany(mappedBy="categories")
	private Set<Recipe> recipes;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

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
