/**
 * 
 */
package com.syedbaqirali.sbarecipe.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

/**
 * @author SBA on 06/27/2020
 *
 */
@Data
@Entity
public class Ingredient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	private BigDecimal amount;
	
	@OneToOne(fetch=FetchType.EAGER)//Eager is anyways the default fetch strategy
	private UnitOfMeasure uom;
	
	@ManyToOne
	private Recipe recipe;
	
	public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }



	/**
	 * @return the recipe
	 */
	public Recipe getRecipe() {
		return recipe;
	}

	/**
	 * @param recipe the recipe to set
	 */
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	
	

}
