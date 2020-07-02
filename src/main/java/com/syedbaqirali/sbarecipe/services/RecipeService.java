/**
 * 
 */
package com.syedbaqirali.sbarecipe.services;

import java.util.Set;

import com.syedbaqirali.sbarecipe.domain.Recipe;

/**
 * @author SBA on 07/02/2020
 *
 */
public interface RecipeService {
	
	Set<Recipe> getRecipes();

}
