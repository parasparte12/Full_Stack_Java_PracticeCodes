// ha class DB madhun GET krnyasathi


package com.paras.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.paras.entity.User;
import com.paras.repo.UserRepositry;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepositry repositry;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> byUsername = repositry.findByUsername(username);
		if(byUsername.isPresent()) 
		{ 
			User user = byUsername.get();
			return org.springframework.security.core.userdetails.User
					.withUsername(user.getUsername())
					.password(user.getPassword())
					.roles(user.getRole())
					.build();
		}
		throw new UsernameNotFoundException("Username not found") ;
	}

}
