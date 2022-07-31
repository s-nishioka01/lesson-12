package com.example.demo.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.form.UserForm;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") int id) throws Exception {
		return ResponseEntity.ok(userService.findOne(id));
	}

	@PostMapping("/users")
	public ResponseEntity<String> createUser(@RequestBody UserForm userForm) {
		User user = userService.saveUserList(userForm.getName());
		return ResponseEntity.created(URI.create("/users/" + user.getId())).build();
	}

	@PatchMapping("/users/{id}")
	public ResponseEntity<String> updateUser(@PathVariable("id") int id, @RequestBody UserForm userForm) {
		userService.updateUserList(id, userForm.getName());
		return ResponseEntity.ok("name successfully updated");
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") int id) {
		userService.deleteUserList(id);
		return ResponseEntity.ok("user successfully deleted");
	}

}