package com.example.springboot.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dto.EmployeeAddressDto;
import com.example.springboot.model.Address;
import com.example.springboot.model.Employee;
import com.example.springboot.repository.AddressRepository;
import com.example.springboot.repository.EmployeeRepository;
import com.example.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Employee addEmployee(Employee employee, int addressId) {
		
		Address address = addressRepository.findById(addressId).get();
		employee.setAddress(address);
		return employeeRepository.save(employee);
		
	}

	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(int employeeId) {
		
		return employeeRepository.findById(employeeId).get();
	}

	public void deleteEmployeeById(int employeeId) {
		//employeeRepository.findById(employeeId);
		employeeRepository.deleteById(employeeId);
		
	}

	public Employee updateEmployee(Employee employee, int employeeId) {
		
		Employee existingEmployee = employeeRepository.findById(employeeId).get();
		
		//existingEmployee.setAddress(employee.getAddress());
		existingEmployee.setDateOfBirth(employee.getDateOfBirth());
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}

	public String addEmployees(List<Employee> employees) {
		 
		employeeRepository.saveAll(employees);
		
		return "success";
	}

	@Override
	public Employee addEmployeeWithAddress(Employee employee) {
		 
			Address address = employee.getAddress();
			addressRepository.save(address);
			return 	employeeRepository.save(employee);
	}

	@Override
	public Employee findEmployeeByAddressId(int addressId) {
	Address address = addressRepository.findById(addressId).get(); 
		return employeeRepository.findEmployeeByAddress(address).get();
	}

	@Override
	public List<Employee> getAllSortedEmployees() {
		 
		return employeeRepository.findAllSortedEmployeeDetailsByFirstName();
	}

	@Override
	public String getFirstName(String lastName) {
		 
		return employeeRepository.getFirstNameByLastName(lastName);
	}

	@Override
	public List<Employee> getAll() {
		 
		return employeeRepository.findAllEmployees();
	}

	@Override
	public List<EmployeeAddressDto> getAllEmployeeAddress() {
		
		
		
		return employeeRepository.findAll()
				.stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}
	
	private EmployeeAddressDto convertEntityToDto(Employee employee) {
		
		EmployeeAddressDto employeeAddressDto =new EmployeeAddressDto();
		
		employeeAddressDto.setCity(employee.getAddress().getCity());
		employeeAddressDto.setEmployeeId(employee.getEmployeeId());
		employeeAddressDto.setFirstName(employee.getFirstName());
		employeeAddressDto.setStreet(employee.getAddress().getStreet());
		
		return employeeAddressDto;
	}

}
