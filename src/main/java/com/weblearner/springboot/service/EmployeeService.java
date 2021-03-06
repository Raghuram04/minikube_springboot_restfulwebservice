package com.weblearner.springboot.service;

import com.weblearner.springboot.model.Employee;


public interface EmployeeService {

	public Employee getEmployee(String empId);
	public String addEmployee(Employee e);
	public String updateEmployeeDept(String empId,String deptName);
	public String deleteEmployee(String empId);
}
