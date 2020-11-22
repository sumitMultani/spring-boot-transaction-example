package com.example.Springtransactionexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springtransactionexample.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
