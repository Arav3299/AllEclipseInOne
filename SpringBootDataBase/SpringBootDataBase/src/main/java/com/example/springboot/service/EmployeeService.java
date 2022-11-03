package com.example.springboot.service;

import java.util.List;

import com.example.springboot.dto.EmployeeAddressDto;
import com.example.springboot.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee, int addressId);

	String addEmployees(List<Employee> employees);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int employeeId);

	void deleteEmployeeById(int employeeId);

	Employee updateEmployee(Employee employee, int employeeId);

	Employee addEmployeeWithAddress(Employee employee);

	Employee findEmployeeByAddressId(int addressId);

	List<Employee> getAllSortedEmployees();

	String getFirstName(String lastName);

	List<Employee>getAll();

	List<EmployeeAddressDto> getAllEmployeeAddress();

}
