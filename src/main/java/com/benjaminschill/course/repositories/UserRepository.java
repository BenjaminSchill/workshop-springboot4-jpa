package com.benjaminschill.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benjaminschill.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
