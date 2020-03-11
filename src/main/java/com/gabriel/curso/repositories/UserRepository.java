package com.gabriel.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.curso.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
