/**
 * 
 */
package com.syedbaqirali.sbarecipe.authentication;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author rever
 *
 */
@Component
public class AuthenticationManager implements ApplicationListener<ContextRefreshedEvent>{

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Please Login First"); 
		
	}

}
