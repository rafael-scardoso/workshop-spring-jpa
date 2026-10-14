package com.rafael.course_spring_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rafael.course_spring_jpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
