package com.cg.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.emp.entity.Employee;
import com.cg.emp.service.EmployeeService;

@RestController
public class EmployeeControler {

	@Autowired
	private EmployeeService employeeService;
	@RequestMapping(value = "/employee" , method = RequestMethod.GET)
	public ResponseEntity<Iterable<Employee>> findAll() {

		try {
			Iterable<Employee> findAll = employeeService.findAll();
			return new ResponseEntity<Iterable<Employee>>(findAll, HttpStatus.OK);
			// return new ResponseEntity<Iterable<Employee>>(employeeService.findAll(),
			// HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<Iterable<Employee>>(HttpStatus.BAD_REQUEST);
		}
	}
}
