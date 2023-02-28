package com.kruger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
