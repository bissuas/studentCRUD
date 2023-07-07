package com.biswasgrg.learning.studentCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biswasgrg.learning.studentCRUD.model.Student;
import com.biswasgrg.learning.studentCRUD.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	//method to list students and return mode and view
	@GetMapping("")
	public String  listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "student";
	}
	
	@GetMapping("/add")
	public String getStudentForm(Model model) {
	    model.addAttribute("student", new Student());
	    return "add_student";
	}
	
	@PostMapping("/add")
	public String addStudent(@ModelAttribute Student student) {
		studentService.addStudent(student);
		return "redirect:/student";
	}
	@GetMapping("/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	@PostMapping("/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student, Model model) {
		//Get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setName(student.getName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setPhoneNo(student.getPhoneNo());
		
		//Save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/student";
	}
	//method to handle student delete request
	@GetMapping("/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentbyId(id);
		return "redirect:/student";
	}
}
