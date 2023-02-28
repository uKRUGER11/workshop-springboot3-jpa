package com.kruger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
