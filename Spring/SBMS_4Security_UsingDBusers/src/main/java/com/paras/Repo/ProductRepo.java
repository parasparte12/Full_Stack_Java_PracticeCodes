package com.paras.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paras.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
	
	

}
