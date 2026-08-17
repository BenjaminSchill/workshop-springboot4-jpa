package com.benjaminschill.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benjaminschill.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
