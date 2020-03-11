package com.gabriel.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.curso.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
