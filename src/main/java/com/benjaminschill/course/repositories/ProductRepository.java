package com.benjaminschill.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benjaminschill.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
