package com.example.Springtransactionexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springtransactionexample.service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageService messageService;

	@GetMapping
	public String addMessage() {
		return messageService.saveMessage();
	}
}
