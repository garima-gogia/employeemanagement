package com.nagarro.Employee.Management.service;


import java.util.List;

import com.nagarro.Employee.Management.model.Employee;
public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}

