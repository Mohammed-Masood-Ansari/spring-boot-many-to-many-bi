package com.jsp.springbootmanytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootmanytomany.dao.StudentDao;
import com.jsp.springbootmanytomany.dto.Student;
import com.jsp.springbootmanytomany.dto.Teacher;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	/*
	 *  saveMethod
	 */
	public List<Student> saveStudentTeachers(List<Student> student) {
		return studentDao.saveStudentTeachers(student);
	}
	
	/*
	 * getStudentDataByTeachersId
	 */
	
	public Teacher getStudentDataByTeachersId(int teacherid) {
		
		Teacher teacher = studentDao.getStudentDataByTeachersId(teacherid);
		
		if(teacher!=null) {
			return teacher;
		}else {
			return null;
		}
	}
	
	/*
	 * deleteStduentById
	 */
	public void deleteStudentById(int studentid) {
		studentDao.deleteStudentById(studentid);
	}
}
