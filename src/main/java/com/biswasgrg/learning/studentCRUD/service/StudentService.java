package com.biswasgrg.learning.studentCRUD.service;

import java.util.List;

import com.biswasgrg.learning.studentCRUD.model.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student addStudent(Student student);
	
	Student getStudentById(Long Id);
	
	Student updateStudent(Student student);
	
	void deleteStudentbyId(Long id);
}
