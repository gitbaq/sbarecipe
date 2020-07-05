/**
 * 
 */
package com.syedbaqirali.sbarecipe.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * @author SBA on 07/02/2020
 *
 */
@Slf4j
@Controller
public class RecipeErrorController implements ErrorController  {
 
	@RequestMapping("/error") 
	public String handleError(HttpServletRequest request) {
		log.debug("I'm in the RecipeErrorController handleError");
	    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	     
	    if (status != null) { 
	        Integer statusCode = Integer.valueOf(status.toString());
	     
	        if(statusCode == HttpStatus.NOT_FOUND.value()) {
	            return "error-404";
	        }
	        else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
	            return "error-500";
	        }
	    }
	    return "error";
	}
 
    @Override
    public String getErrorPath() {
    	log.debug("I'm in the RecipeErrorController getErrorPath");
        return "/error";
    }
}