package com.biswasgrg.learning.studentCRUD.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biswasgrg.learning.studentCRUD.model.User;
import com.biswasgrg.learning.studentCRUD.repository.UserRepository;
import com.biswasgrg.learning.studentCRUD.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	@Override
	public void signup(User user) {
		userRepo.save(user);
	}

	@Override
	public User login(String un, String psw) {
		
		return userRepo.findByUsernameAndPassword(un, psw);
	}

}
