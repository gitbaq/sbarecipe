/**
 * 
 */
package com.syedbaqirali.sbarecipe.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.syedbaqirali.sbarecipe.domain.Recipe;
import com.syedbaqirali.sbarecipe.repositories.RecipeRepository;

/**
 * @author rever
 *
 */
public class RecipeServiceImplTest {
	RecipeServiceImpl recipeService;
	
	@Mock
	RecipeRepository recipeRepository;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		recipeService = new RecipeServiceImpl(recipeRepository);
	}

	

	/**
	 * Test method for {@link com.syedbaqirali.sbarecipe.services.RecipeServiceImpl#getRecipes()}.
	 */
	@Test
	public void testGetRecipes() {
		Recipe recipe = new Recipe();
        HashSet<Recipe> recipesData = new HashSet<Recipe>();
        recipesData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesData);

        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();
	}

}
