package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dto.EmpDto;

@Repository
public interface EmpRepo extends JpaRepository<EmpDto, Integer> {
	
}
