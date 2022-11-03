package com.example.demo.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Doctor;
import com.example.demo.service.RestTemplateService;
import com.example.springboot.model.Employee;

@RequestMapping("/api/rest")
@RestController
public class RestTemplateController {

 
	
	@Autowired
	private RestTemplateService restTemplateService;
	
	@PostMapping("/saveemployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		
		return restTemplateService.addEmployee(employee);
		
	}
	
	@GetMapping("/getemployee/{employeeId}")
	public Employee getEmployeeById(@PathVariable("employeeId") long employeeId){
		return restTemplateService.getEmployeeById(employeeId);
	}
	
	@PutMapping("/editemployee/{employeeId}")
	public String updateDoctor(@RequestBody Employee employee,@PathVariable("employeeId") long employeeId){
		try {
		restTemplateService.updateEmployee(employee,employeeId);
		return "updated";
		}catch(Exception e) {
			return "error";
		}
		}
	
	@DeleteMapping("/deleteemployee/{employeeId}")
	public String deleteEmployeeById(@PathVariable("employeeId") long employeeId){
		restTemplateService.deleteEmployeeById(employeeId);
		return "deleted";
	}
	
	
	@GetMapping("/get")
	public ResponseEntity<String > getAllEmployee(){
		
		return restTemplateService.getAllEmployee();
	}
	
	@PostMapping("/post")
	public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor){
		
		return restTemplateService.addDoctor(doctor);
		} 
	
	@GetMapping("/get/{doctorId}")
	public Doctor getDoctorById(@PathVariable("doctorId") long doctorId){
		return restTemplateService.getDoctorById(doctorId);
	}
	
	@PutMapping("/edit/{doctorId}")
	public String updateDoctor(@RequestBody Doctor doctor,@PathVariable("doctorId") long doctorId){
		
		restTemplateService.updateDoctor(doctor,doctorId);
		return "updated";
		}
	
	@DeleteMapping("/delete/{doctorId}")
	public String deleteDoctorById(@PathVariable("doctorId") long doctorId){
		restTemplateService.deleteDoctorById(doctorId);
		return "deleted";
	}
}
