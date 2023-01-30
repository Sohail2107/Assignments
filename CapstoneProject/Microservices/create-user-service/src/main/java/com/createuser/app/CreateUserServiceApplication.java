package com.createuser.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
public class CreateUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateUserServiceApplication.class, args);
	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//
//	    return new WebMvcConfigurer() {
//
//	        @Override
//	        public void addCorsMappings(CorsRegistry corsRegistry) {
//	            corsRegistry.addMapping("/user-login-service/api/user/createUser").allowedOrigins("http://localhost:3000");
//	        }
//	    };
//	}
}
