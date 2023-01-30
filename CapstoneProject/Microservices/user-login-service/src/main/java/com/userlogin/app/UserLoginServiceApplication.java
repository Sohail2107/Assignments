package com.userlogin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
public class UserLoginServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserLoginServiceApplication.class, args);
	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//
//	    return new WebMvcConfigurer() {
//
//	        @Override
//	        public void addCorsMappings(CorsRegistry corsRegistry) {
//	            corsRegistry.addMapping("/user-login-service/api/user/userlogin/**").allowedOrigins("http://localhost:3000");
//	        }
//	    };
//	}
}
