package com.example.courseRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.courseRegistration.model.CourseRegistry;

public interface RegistryRepo extends JpaRepository<CourseRegistry, Integer>{

}
