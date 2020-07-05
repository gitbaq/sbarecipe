/**
 * 
 */
package com.syedbaqirali.sbarecipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syedbaqirali.sbarecipe.services.RecipeService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author SBA on 07/02/2020
 *
 */
@Slf4j
@Controller
public class IndexController {
	
	
	private final RecipeService recipeService;
	
	
	
	/**
	 * @param recipeService
	 */
	public IndexController(RecipeService recipeService) {
		
		super();
		log.debug("I'm in the Index Controller");
		this.recipeService = recipeService;
	}



	@RequestMapping({"","/","/index"})
	public String getIndexPage(Model model) {
		log.debug("I'm in the Index Controller getIndexPage");
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}

}
