package com.paras.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.paras.Repo.UserRepositry;
import com.paras.entity.User;


@Service
public class CustomUserDetailService  implements UserDetailsService  {

	@Autowired
	UserRepositry repositry;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		

		 Optional<User> op=repositry.findByUsername(username);
		if(op.isPresent())
		{
			User user=op.get();
			return org.springframework.security.core.userdetails.User
					.withUsername(user.getUsername())
					.password(user.getPassword())
					.roles(user.getRole())
					.build();
		}
		
		 throw new UsernameNotFoundException("User not found"+username);
	}
	

}
                    