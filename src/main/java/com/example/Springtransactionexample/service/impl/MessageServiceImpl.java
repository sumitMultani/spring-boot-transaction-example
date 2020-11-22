package com.example.Springtransactionexample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.Springtransactionexample.model.Message;
import com.example.Springtransactionexample.repository.MessageRepository;
import com.example.Springtransactionexample.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageRepository messageRepository;

	@Override
	@Transactional(propagation = Propagation.NEVER)
	public String saveMessage() {
		String response = "Message Saved.";
		Message message = new Message("message for user.");
		messageRepository.save(message);
		System.out.println(response);
		return response;
	}
}
