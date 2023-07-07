package com.biswasgrg.learning.studentCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biswasgrg.learning.studentCRUD.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
