package com.paras.config.security;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean 	
	public UserDetailsService createUser() {
		
		 UserDetails admin=
		 User
		.withUsername("Paras")
		.password("{noop}FAMT@1234")
		.roles("ADMIN")
		.build();
		 
		 UserDetails user1=
				 User
				.withUsername("{noop}Prasun")
				.password("Prasun@1234")
				.roles("USER")
				.build();
		 
		 UserDetails user2=
				 User
				.withUsername("{noop}Meet")
				.password("Meet@1234")
				.roles("USER")
				.build();
		 
		 
		 return new InMemoryUserDetailsManager(admin,user1,user2);
		 
		 
	}
	
	@Bean
	public SecurityFilterChain Filterchnage(HttpSecurity http) throws Exception
	{
		 	// Lambda Expression
		http.authorizeHttpRequests(auth->
		auth.requestMatchers("/welcome")
		.hasRole("ADMIN")
		
		.requestMatchers("/welcom").hasRole("USER")
		.anyRequest()
		.authenticated()		
				
				
				
				
				).httpBasic(Customizer.withDefaults())		// for postman ,angular,react
		.formLogin(Customizer.withDefaults());				// for browser
		return http.build();
	}
	
	
	
	
//	@Bean
//	public SecurityFilterChain Filterchnage(HttpSecurity http) throws Exception
//	{
//		 	// Lambda Expression
//		http.authorizeHttpRequests(auth->
//		auth.requestMatchers("/welcome").permitAll()
//		
//		.anyRequest()
//		.authenticated()		
//				
//				
//				
//				
//				).httpBasic(Customizer.withDefaults())		// for postman ,angular,react
//		.formLogin(Customizer.withDefaults());				// for browser
//		return http.build();
//	}
	

}
