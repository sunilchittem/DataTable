package com.cg.emp.service;

import java.util.List;

import com.cg.emp.entity.Employee;

public interface EmployeeService {

	public Iterable<Employee> findAll();
}
