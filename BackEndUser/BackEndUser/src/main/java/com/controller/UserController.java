package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.UserDto;
import com.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/getuser")
	public List<UserDto> getuser() {
		return service.getuser();
	}
	
	@PostMapping("/adduser")
	public void saveuser(@RequestBody UserDto userdto) {
		service.saveuser(userdto);
	}

}
