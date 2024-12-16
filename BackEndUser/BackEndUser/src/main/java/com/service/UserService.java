package com.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dto.UserDto;

@Component
public interface UserService {

	public List<UserDto> getuser();
	
	public void saveuser(UserDto userdto);
}
