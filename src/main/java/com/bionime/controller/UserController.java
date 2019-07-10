package com.bionime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bionime.pojo.User;
import com.bionime.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/getUser/{id}")
	public User getUserInfo(@PathVariable("id") int id) {
		System.out.println("id为"+id);
		return userService.selectUser(id);
	}
}
