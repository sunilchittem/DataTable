package com.cg.emp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.emp.entity.Employee;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
