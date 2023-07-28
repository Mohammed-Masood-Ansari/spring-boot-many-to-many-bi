package com.jsp.springbootmanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootmanytomany.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
