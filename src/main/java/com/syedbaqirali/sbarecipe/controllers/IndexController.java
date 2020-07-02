/**
 * 
 */
package com.syedbaqirali.sbarecipe.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.syedbaqirali.sbarecipe.domain.Category;
import com.syedbaqirali.sbarecipe.domain.UnitOfMeasure;
import com.syedbaqirali.sbarecipe.repositories.CategoryRepository;
import com.syedbaqirali.sbarecipe.repositories.UnitOfMeasureRepository;

/**
 * @author rever
 *
 */
@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	/**
	 * @param categoryRepository
	 * @param unitOfMeasureRepository
	 */
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}



	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	
	
	@RequestMapping({"","/","/index"})
	public String getIndexPage() {
		
		Optional<Category> categoryOptional = categoryRepository.findByDescription("Italian");
		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Pinch");
		
		System.out.println("Cat Id is: " + categoryOptional.get().getDescription());
		System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getDescription());
		return "index";
	}

}
