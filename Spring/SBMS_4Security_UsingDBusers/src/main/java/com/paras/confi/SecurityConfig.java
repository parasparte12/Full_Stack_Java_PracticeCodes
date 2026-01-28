package com.paras.confi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.paras.service.CustomUserDetailService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	CustomUserDetailService customUserDetailService;
	@Bean
	public PasswordEncoder encoder()

	{
		return new BCryptPasswordEncoder();
	}
	
	//to authenticate DB users	
	@Bean
	public DaoAuthenticationProvider authenticate()
	{
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(customUserDetailService);
		provider.setPasswordEncoder(encoder());
		return provider;
		
	}
	
	
	// Spring Boot enable CSRF Security by default
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http.csrf(csrf->csrf.disable()).
		authorizeHttpRequests(auth->
				auth.requestMatchers("product/save").hasRole("Admin").	
				requestMatchers("/auth/**").permitAll()	
					.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults())
		
				.formLogin(Customizer.withDefaults());
		
		
		return http.build();
	}
	
	// auth/** ,here ** can have save,delete,etc
	
	
	
	
	
	
	
}
