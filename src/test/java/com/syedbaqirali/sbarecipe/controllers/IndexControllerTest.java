/**
 * 
 */
package com.syedbaqirali.sbarecipe.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import com.syedbaqirali.sbarecipe.domain.Recipe;
import com.syedbaqirali.sbarecipe.services.RecipeService;

/**
 * @author SBA on 07/12/2020
 *
 */
public class IndexControllerTest {
	@Mock
	RecipeService recipeService;

	@Mock
	Model model;

	IndexController indexController;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		indexController = new IndexController(recipeService);
	}
	
	@Test
	public void testMockMVC() throws Exception{
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"));
	}

	/**
	 * Test method for
	 * {@link com.syedbaqirali.sbarecipe.controllers.IndexController#IndexController(com.syedbaqirali.sbarecipe.services.RecipeService)}.
	 */
	@Test
	public void getIndexPage() throws Exception {
		//given
		Set<Recipe> recipes = new HashSet<>();
		recipes.add(new Recipe());
		//We Did the following because adding two new recipes resulted in both being treated as equal and so in the set only one was added to the HashSet
		Recipe recipe = new Recipe();
		recipe.setId(4L);
		recipes.add(recipe);
		
		when(recipeService.getRecipes()).thenReturn(recipes);
		ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

		String viewName = indexController.getIndexPage(model);

		assertEquals("index", viewName);
		verify(recipeService, times(1)).getRecipes();
//		verify(model,times(1)).addAttribute(eq("recipes"),anySet());
		verify(model,times(1)).addAttribute(eq("recipes"),argumentCaptor.capture());
		Set<Recipe> setInController = argumentCaptor.getValue();
		assertEquals(2,setInController.size());
	}

}
