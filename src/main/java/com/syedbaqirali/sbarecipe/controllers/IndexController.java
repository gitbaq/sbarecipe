/**
 * 
 */
package com.syedbaqirali.sbarecipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rever
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping({"","/","/index"})
	public String getIndexPage() {
		return "index";
	}

}
