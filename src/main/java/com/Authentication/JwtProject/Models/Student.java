package com.Authentication.JwtProject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long student_id;
	private String student_name;
	private String email;
	
	@ManyToOne
	@JoinColumn(name="college_id")
	private College college;
	
	public Student() {}
	
	public Student(Long i,String n,String e) {
		this.student_id= i;
		this.student_name=n;
		this.email=e;
		
	}

	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
}

