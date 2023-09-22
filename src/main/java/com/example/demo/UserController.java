package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping
	void saveUser(@RequestBody Users user) {
		userService.saveUser(user);
		System.out.println("user created " + user.getName());
	}

	@GetMapping
	void getUser() {
		System.out.println("test");
		System.out.println("Get user");
	}

}