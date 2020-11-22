package com.example.Springtransactionexample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.Springtransactionexample.model.User;
import com.example.Springtransactionexample.repository.UserRepository;
import com.example.Springtransactionexample.service.MessageService;
import com.example.Springtransactionexample.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private MessageService messageService;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String saveUser() {
		String response = "User and Message saved.";
		User user1 = new User("karan", 12000);
		userRepository.save(user1);
		messageService.saveMessage();
		System.out.println("User saved.");
		return response;
	}

}
