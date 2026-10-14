package com.rafael.course_spring_jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rafael.course_spring_jpa.entities.Category;
import com.rafael.course_spring_jpa.repositories.CategoryRepository;

@Service
public class CategoryService {

	private final CategoryRepository repository;

	public CategoryService(CategoryRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
