package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.EmpDto;
import com.service.EmpService;
@CrossOrigin("*")
@RestController
public class EmpController {
	
	@Autowired
	EmpService service;
	
	@GetMapping("/getemp")
	public List<EmpDto> getemployee() {
		return service.getemployee() ;	
	}
	
	@PostMapping("/addemp")
	public void addemployee(@RequestBody EmpDto empdto) {
		service.addemployee(empdto);
	}

	
}
