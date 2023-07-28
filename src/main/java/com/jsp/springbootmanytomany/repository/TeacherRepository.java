package com.jsp.springbootmanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootmanytomany.dto.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

	public Teacher findByTeacherId(int teacherId);
}
