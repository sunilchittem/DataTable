package com.cg.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController02 {

	@RequestMapping("/emp-list")
	public String fildAll() {

		return "emp-info";
	}
}
