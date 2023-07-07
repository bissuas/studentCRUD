package com.biswasgrg.learning.studentCRUD.service;

import com.biswasgrg.learning.studentCRUD.model.User;

public interface UserService {
	void signup(User user);
	User login(String un, String psw);
}
