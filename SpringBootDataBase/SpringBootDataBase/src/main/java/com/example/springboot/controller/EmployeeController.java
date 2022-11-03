package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dto.EmployeeAddressDto;
import com.example.springboot.model.Employee;
import com.example.springboot.service.EmployeeService;
 

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/register/{addressId}")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee,@PathVariable("addressId") int addressId){
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee,addressId),HttpStatus.CREATED);
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<Employee> addEmployeeWithAddress(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.addEmployeeWithAddress(employee),HttpStatus.CREATED);
		
	}
	
	@PostMapping("/register/multiple")
	public String addEmployees(@RequestBody List<Employee> employees){
		return employeeService.addEmployees(employees);
		
	}
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();	
	}
	
	@GetMapping("get/{employeeId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") int employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK) ;
		
	}
	@DeleteMapping("/using_request_param")
	public ResponseEntity<String> deleteEmployeeById(@RequestParam("employeeId") int employeeId){
		employeeService.deleteEmployeeById(employeeId);
		String flag="Details Removed From Database";
		return new ResponseEntity<String>(flag,HttpStatus.OK);
		
	}
	@PutMapping("/{employeeId}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("employeeId") int employeeId,@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,employeeId),HttpStatus.OK);
	}
	
	@GetMapping("/{addressId}")
	public Employee findEmployeeByAddressId(@PathVariable("addressId") int addressId) {
		
		return employeeService.findEmployeeByAddressId(addressId);
	}
	
	@DeleteMapping("/getallsorted")
	public List<Employee> getAllSortedEmployees(){
		return employeeService.getAllSortedEmployees();	
	}
	
	@GetMapping("/getfirstname")
	public String getFirstName(@RequestParam("lastName") String lastName) {
		return employeeService.getFirstName(lastName);
	}
	
	@DeleteMapping("/getallemployeesusingquery")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}
	
	@GetMapping("/dto")
	public List<EmployeeAddressDto> getAllEmployeeAddress(){
		return employeeService.getAllEmployeeAddress();
		
	}
}
