package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;


// TODO: Auto-generated Javadoc
/**
 * The Class ServletInitializer.
 */
public class ServletInitializer extends org.springframework.boot.web.support.SpringBootServletInitializer {
	
	/* (non-Javadoc)
	 * @see org.springframework.boot.web.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AgendaApplication.class);
	}

}
