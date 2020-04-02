package com.gabriel.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
