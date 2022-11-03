package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.Doctor;
import com.example.springboot.model.Employee;

public interface RestTemplateService {

	ResponseEntity<String> getAllEmployee();

	 

	ResponseEntity<Doctor> addDoctor(Doctor doctor);



	Doctor getDoctorById(long doctorId);



	void updateDoctor(Doctor doctor, long doctorId);



	void deleteDoctorById(long doctorId);



	ResponseEntity<Employee> addEmployee(Employee employee);



	Employee getEmployeeById(long employeeId);



	void updateEmployee(Employee employee, long employeeId);



	void deleteEmployeeById(long employeeId);

}
