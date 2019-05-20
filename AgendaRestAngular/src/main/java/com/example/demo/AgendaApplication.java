package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// TODO: Auto-generated Javadoc
/**
 * The Class AgendaApplication.
 */
@SpringBootApplication
@ComponentScan({"com.delivery.request"})
@EntityScan("com.delivery.domain")
@EnableJpaRepositories("com.delivery.repository")
public class AgendaApplication extends SpringBootServletInitializer  {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}

}
