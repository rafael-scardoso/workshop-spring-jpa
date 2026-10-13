package com.rafael.course_spring_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rafael.course_spring_jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
