package com.benjaminschill.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benjaminschill.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
