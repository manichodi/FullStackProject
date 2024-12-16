package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.EmpDto;
import com.repo.EmpRepo;
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRepo repo;
	
	public List<EmpDto> getemployee() {
		return repo.findAll();
	}

	public void addemployee(EmpDto empdto) {
		repo.save(empdto);
		
	}



}
