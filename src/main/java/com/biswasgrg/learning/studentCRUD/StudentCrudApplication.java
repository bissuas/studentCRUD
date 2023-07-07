package com.biswasgrg.learning.studentCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.biswasgrg.learning.studentCRUD.model.Student;
import com.biswasgrg.learning.studentCRUD.repository.StudentRepository;

@SpringBootApplication
public class StudentCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentCrudApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Biswas Gurung","biswas-gurung@hotmail.com","9841841741");
		studentRepo.save(student1);
		
		Student student2 = new Student("Shashikala Gurung","shashigrg@hotmail.com","9841848961");
		studentRepo.save(student2);
		
		Student student3 = new Student("Dhak Gurung","dhakgurung@hotmail.com","9841841369");
		studentRepo.save(student3);
		*/
		
	}
	
	
}
