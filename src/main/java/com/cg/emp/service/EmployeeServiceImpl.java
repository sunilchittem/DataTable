package com.cg.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.emp.dao.EmployeeRepo;
import com.cg.emp.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Iterable<Employee> findAll() {

		return employeeRepo.findAll();
	}

}
