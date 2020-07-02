/**
 * 
 */
package com.syedbaqirali.sbarecipe.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.syedbaqirali.sbarecipe.domain.Recipe;
import com.syedbaqirali.sbarecipe.repositories.RecipeRepository;

/**
 * @author rever
 *
 */
@Service
public class RecipeServiceImpl implements RecipeService {
	
	private final RecipeRepository recipeRepository;

	/**
	 * @param recipeRepository
	 */
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}

	/* (non-Javadoc)
	 * @see com.syedbaqirali.sbarecipe.services.RecipeService#getRecipes()
	 */
	@Override
	public Set<Recipe> getRecipes() {
		Set<Recipe> recipeSet = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}

}
