/**
 * 
 */
package com.syedbaqirali.sbarecipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.syedbaqirali.sbarecipe.domain.Recipe;

/**
 * @author rever
 *
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
