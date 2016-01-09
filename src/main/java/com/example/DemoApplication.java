package com.example;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.domain.User;
import com.example.mapper.UserMapper;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	DataSource dataSource;
	
	@Autowired 
	UserMapper userMapper;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userMapper.addUser(new User(1, "1@1.com", "one", "2016-1-6"));
		userMapper.addUser(new User(2, "2@2.com", "two", null));
		System.out.println(userMapper.getUser(1));
		System.out.println(userMapper.getUser(2));
	}
}
