package com.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.dto.EmpDto;
@Component 
public interface EmpService {
	
	public List<EmpDto> getemployee();
	
	public void addemployee(EmpDto empdto);

}
