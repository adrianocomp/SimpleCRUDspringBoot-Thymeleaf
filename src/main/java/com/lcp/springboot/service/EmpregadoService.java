package com.lcp.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.lcp.springboot.model.Empregado;;

public interface EmpregadoService {
	List<Empregado> getAllEmployees();
	void saveEmployee(Empregado employee);
	Empregado getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Empregado> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
