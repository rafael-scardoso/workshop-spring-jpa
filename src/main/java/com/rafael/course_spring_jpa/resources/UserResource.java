package com.rafael.course_spring_jpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.course_spring_jpa.entities.User;

@RestController 
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L,"Rafael","rafael@email.com0","9999","123456");
		
		return ResponseEntity.ok().body(u);
	}
	
}
