package com.rafael.course_spring_jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rafael.course_spring_jpa.entities.Order;
import com.rafael.course_spring_jpa.repositories.OrderRepository;

@Service
public class OrderService {

	private final OrderRepository repository;

	public OrderService(OrderRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
