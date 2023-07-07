package com.biswasgrg.learning.studentCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biswasgrg.learning.studentCRUD.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsernameAndPassword(String un, String psw);
}
