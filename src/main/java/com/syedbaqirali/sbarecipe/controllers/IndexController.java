/**
 * 
 */
package com.syedbaqirali.sbarecipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syedbaqirali.sbarecipe.services.RecipeService;

/**
 * @author SBA on 07/02/2020
 *
 */
@Controller
public class IndexController {
	
	
	private final RecipeService recipeService;
	
	
	
	/**
	 * @param recipeService
	 */
	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}



	@RequestMapping({"","/","/index"})
	public String getIndexPage(Model model) {
		
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}

}
