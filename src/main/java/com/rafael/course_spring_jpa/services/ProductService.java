package com.rafael.course_spring_jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rafael.course_spring_jpa.entities.Product;
import com.rafael.course_spring_jpa.repositories.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository repository;

	public ProductService(ProductRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
