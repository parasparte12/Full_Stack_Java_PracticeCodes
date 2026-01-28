package com.paras.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paras.Repo.ProductRepo;
import com.paras.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	ProductRepo productRepo;
	
	@PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product)
	{
		Product savedProduct=productRepo.save(product);
		return new ResponseEntity<Product>(savedProduct,HttpStatus.CREATED);
	}
}
