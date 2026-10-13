package com.rafael.course_spring_jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rafael.course_spring_jpa.entities.User;
import com.rafael.course_spring_jpa.repositories.UserRepository;

@Service
public class UserService {

	private final UserRepository repository;

	public UserService(UserRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
}
