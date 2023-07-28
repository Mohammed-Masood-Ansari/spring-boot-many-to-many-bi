package com.jsp.springbootmanytomany.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private String studentEmail;
	
	@ManyToMany(cascade =  CascadeType.ALL)
	@JoinTable(
			name = "students-teachers",
			joinColumns = {
					@JoinColumn(name="studentid")
			},
			inverseJoinColumns = {
			@JoinColumn(name="teacherid")
			}
	)
	@JsonBackReference
	private List<Teacher>  teachers;
}
