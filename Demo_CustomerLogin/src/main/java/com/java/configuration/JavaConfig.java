package com.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.controller.CustomerLoginController;

@Configuration
public class JavaConfig {
	
	@Bean
	public CustomerLoginController getCustomerLoginController() {
		return new CustomerLoginController();
	}

}
