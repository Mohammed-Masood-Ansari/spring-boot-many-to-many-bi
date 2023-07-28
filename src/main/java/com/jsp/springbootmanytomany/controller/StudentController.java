package com.jsp.springbootmanytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootmanytomany.dto.Student;
import com.jsp.springbootmanytomany.dto.Teacher;
import com.jsp.springbootmanytomany.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping(value="/saveStudentTeachersDetails")
	public List<Student> saveStudentTeachers(@RequestBody List<Student> student) {
		return studentService.saveStudentTeachers(student);
	}
	
	/*
	 * getStudentDataByTeachersId
	 */
	@GetMapping("/getStudentByTeacherId/{teacherid}")
	public Teacher getStudentDataByTeachersId(@PathVariable int teacherid) {
		
		return studentService.getStudentDataByTeachersId(teacherid);
	}
	
	
	/*
	 * deleteStduentById
	 */
	@DeleteMapping(value="/deleteStudent/{studentid}")
	public void deleteStudentById(@PathVariable int studentid) {
		
		studentService.deleteStudentById(studentid);
	}
	
}
