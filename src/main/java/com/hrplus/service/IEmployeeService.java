package com.hrplus.service;

import java.util.List;

import com.hrplus.model.Employee;
/*
 * CRUD operations for employees
 * @author Administrator
 * 
 * */
public interface IEmployeeService {
	/*
	 * Get employees from persistence layer 
	 * @param Employee Type lookup
	 * @return List of Employee sorted by Employee Type
	 * 
	 * */
	List<Employee> fetchByEmpType(String empType); 
	
}
