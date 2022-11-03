package com.example.demo.serviceimpl;

 

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Doctor;
import com.example.demo.service.RestTemplateService;
import com.example.springboot.model.Employee;

 @Service
public class RestTemplateServiceImpl implements RestTemplateService {

	RestTemplate restTemplate = new RestTemplate();
	
	
	@Override
	public ResponseEntity<String> getAllEmployee() {
		
		
		String url= "http://localhost:8089/api/employee/getall";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters",headers);
		ResponseEntity<String> response = restTemplate.exchange(url,HttpMethod.GET,entity,String.class);
		
		return response;
				
	}


	@Override
	public ResponseEntity<Doctor> addDoctor(Doctor doctor) {
		
		String url ="http://localhost:8088/api/doctor/register";
		return restTemplate.postForEntity(url, doctor,Doctor.class);
	}


	@Override
	public Doctor getDoctorById(long doctorId) {
		
		String url = "http://localhost:8088/api/doctor/{doctorId}";
		Map<String,Long> param = new HashMap<String,Long>();
		param.put("doctorId", doctorId);
		return restTemplate.getForObject(url,Doctor.class,param);
		
	}


	@Override
	public void updateDoctor(Doctor doctor,long doctorId) {
		
		 String url ="http://localhost:8088/api/doctor/{doctorId}";
		 Map<String,Long> param = new HashMap<String,Long>();
		 param.put("doctorId", doctorId);
		 restTemplate.put(url, doctor, param);
		 
	}


	@Override
	public void deleteDoctorById(long doctorId) {
		String url ="http://localhost:8088/api/doctor/{doctorId}";
		Map<String,Long> param = new HashMap<String,Long>();
		param.put("doctorId", doctorId);
		restTemplate.delete(url, param);
		
	}


	@Override
	public ResponseEntity<Employee> addEmployee(Employee employee) {
		
		String url = "http://localhost:8089/api/employee/register";
		
		return restTemplate.postForEntity(url,employee,Employee.class);
		
	}


	@Override
	public Employee getEmployeeById(long employeeId) {

		String url = "http://localhost:8089/api/employee/{employeeId}";
		Map<String,Long> param = new HashMap<String,Long>();
		param.put("employeeId", employeeId);
		return restTemplate.getForObject(url,Employee.class,param);
	}


	@Override
	public void updateEmployee(Employee employee, long employeeId) {
		 String url ="http://localhost:8089/api/employee/{employeeId}";
		 
		 Map<String,Long> param = new HashMap<String,Long>();
		 
		 param.put("employeeId", employeeId);
		 
		 restTemplate.put(url, employee, param);
	}


	@Override
	public void deleteEmployeeById(long employeeId) {
		String url ="http://localhost:8089/api/employee/using_request_param/{employeeId}";
		Map<String,Long> param = new HashMap<String,Long>();
		param.put("employeeId", employeeId);
		restTemplate.delete(url, param);
	}


	 

}
