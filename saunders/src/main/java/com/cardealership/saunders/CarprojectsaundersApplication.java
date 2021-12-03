package com.cardealership.saunders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan("com.cardealership")
@SpringBootApplication
public class CarprojectsaundersApplication extends SpringBootServletInitializer implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		// Register resource handler for images
		registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/");

		// .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CarprojectsaundersApplication.class);
	}

	


}
