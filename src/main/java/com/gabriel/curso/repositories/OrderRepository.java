package com.gabriel.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
