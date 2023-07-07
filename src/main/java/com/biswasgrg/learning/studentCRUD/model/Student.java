package com.biswasgrg.learning.studentCRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="student_tbl")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	private String phoneNo;
	
	public Student() {
		
	}
	
	public Student(String name, String email, String string) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = string;
	}
	
	
}
