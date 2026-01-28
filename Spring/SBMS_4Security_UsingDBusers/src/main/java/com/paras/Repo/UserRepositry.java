package com.paras.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paras.entity.User;


public interface UserRepositry extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String username);	
	

}
