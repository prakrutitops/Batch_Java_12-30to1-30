package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
		
	
			public void addOrUpdateUser(User u);
			public List<User> viewAllUser();
			public void deleteUser(int id);
			public User userById(int id);
}
