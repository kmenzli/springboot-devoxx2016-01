package com.training.springboot.devoxx.devoxxapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
public class DevoxxAppApplication {

	@Configuration
	@EnableGlobalMethodSecurity(securedEnabled = true)
	static public class Securityconfiguration extends GlobalAuthenticationConfigurerAdapter {

		@Override
		public void init(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication().withUser("kmenzli").password("{noop}123").roles("USER")
					.and()
					.withUser("youssef").password("{noop}123").roles("USER","HERO");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DevoxxAppApplication.class, args);
	}
}
