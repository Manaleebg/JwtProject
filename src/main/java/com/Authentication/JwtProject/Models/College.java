package com.Authentication.JwtProject.Models;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String location;
	private String college_name;
	
	@OneToMany(mappedBy="college")
	@JsonIgnore
	private List<Student> students;
	
	
	public College() {}
	
	
	public College(Long i,String n,String l, List<Student> s) {
		this.id = i;
		this.college_name=n;
		this.location=l;
		this.students = s;
	
	}

	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getCollege_name() {
		return college_name;
	}


	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
	
