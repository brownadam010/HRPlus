package com.hrplus.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hrplus.model.Employee;

@Component
public class EmployeeServiceStub implements IEmployeeService {

	private List<Employee> Employees = new ArrayList<>();
	private List<Employee> SortedEmp = new ArrayList<>(); 
	Employee emp1 = new Employee(1, "Finance", "Sam Smith", "$100,000","21", "6", "15", "$230,000");
	Employee emp2 = new Employee(2, "Marketing","Tiffany Litteral", "$120,000", "21", "6", "15", "$300,000");
	Employee emp3 = new Employee(3, "HR", "Jacob Difrank", "$130,000", "21", "6", "15", "$350,000");
	Employee emp4 = new Employee(4, "Finance", "Alen Anand", "$140,000", "21", "6", "15", "$210,000");
	Employee emp5 = new Employee(5, "HR", "Britney Spears", "$250,000", "21", "6", "15", "$400,000");
	Employee emp6 = new Employee(6, "Marketing","Miley Cyrus", "$300,000", "21", "6", "15", "$290,000");
	
	
	@Override
	public List<Employee> fetchByEmpType(String empType) {
		Employees.add(emp1);
		Employees.add(emp2);
		Employees.add(emp3);
		Employees.add(emp4);
		Employees.add(emp5);
		Employees.add(emp6);
		
		for ( Employee e : Employees ) {
			if(e.getEmpType() == empType) {
				SortedEmp.add(e); 
			}
		}
		return SortedEmp;
	}
	

}
