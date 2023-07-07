package com.biswasgrg.learning.studentCRUD.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biswasgrg.learning.studentCRUD.model.Student;
import com.biswasgrg.learning.studentCRUD.repository.StudentRepository;
import com.biswasgrg.learning.studentCRUD.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long Id) {
		return studentRepo.findById(Id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudentbyId(Long id) {
		studentRepo.deleteById(id);
		
	}
	
}
