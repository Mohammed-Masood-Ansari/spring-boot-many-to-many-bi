package com.jsp.springbootmanytomany.dao;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootmanytomany.dto.Student;
import com.jsp.springbootmanytomany.dto.Teacher;
import com.jsp.springbootmanytomany.repository.StudentRepository;
import com.jsp.springbootmanytomany.repository.TeacherRepository;

/**
 * 
 * @author ANSARI
 *
 */
@Repository
public class StudentDao {

	@Autowired
	private StudentRepository repository;
	
	@Autowired
	private TeacherRepository repository2;
	/*
	 * saveMethod
	 */
	public List<Student> saveStudentTeachers(List<Student> student) {
		return repository.saveAll(student);
	}
	
	/*
	 * getStudentDataByTeachersId
	 */
	public Teacher getStudentDataByTeachersId(int teacherid) {
		
		return repository2.findByTeacherId(teacherid);
	}
	
	/*
	 * deleteStduentById
	 */
	public void deleteStudentById(int studentid) {
		
		Optional<Student> optional = repository.findById(studentid);
		
		if(optional.isPresent()) {
			
			Student student = optional.get();
			
			repository.delete(student);
		}
	}
	
}
