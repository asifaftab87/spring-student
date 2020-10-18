package org.la.student.rest.controller;

import java.util.List;

import org.la.student.model.User;
import org.la.student.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class StudentRestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/hello")
	public String msg() {
		System.out.println("get method");
		return "hello dilshad";
	}
	
	@GetMapping("/findAll")
	public List<User> findAll() {
		
		List<User> userList = userService.findAll();
		return userList;
	}
	
	@GetMapping("/findById/{id}")
	public User findById(@PathVariable long id) {
		return userService.findById(id);
	}
	
	@PostMapping("add")
	public User add(@RequestBody User user) {
		return userService.add(user);
	}
}
