package com.example.Springtransactionexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springtransactionexample.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{

}
