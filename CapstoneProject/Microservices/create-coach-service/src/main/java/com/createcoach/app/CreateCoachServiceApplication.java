package com.createcoach.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
public class CreateCoachServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateCoachServiceApplication.class, args);
	}

	/*@Bean
	public WebMvcConfigurer corsConfigurer() {

	    return new WebMvcConfigurer() {

	        @Override
	        public void addCorsMappings(CorsRegistry corsRegistry) {
	            corsRegistry.addMapping("/create-coach-service/api/coach/createCoach").allowedOrigins("http://localhost:3000");
	        }
	    };
	}*/
}
