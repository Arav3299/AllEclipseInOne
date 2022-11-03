package com.example.demo.controller;

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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("api/doctor")
public class DoctorController {
	
	@Autowired
	public DoctorService doctorService;
	
	@PostMapping("/register")
	public ResponseEntity<Doctor> saveAdmin(@RequestBody Doctor doctor){
		System.out.println("Doctor Registration Succesfull "+doctor);
		return new ResponseEntity<Doctor>(doctorService.saveDoctor(doctor),HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/getalldoctors")
	public List<Doctor> getAllDoctors(){
		return doctorService.getAllDoctors();
	}
	
	
	@GetMapping("/{doctorId}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable("doctorId") long doctorId){
		
		return new ResponseEntity<Doctor>(doctorService.getDoctorById(doctorId),HttpStatus.OK);
	}
	
	@PutMapping("{doctorId}")
	public ResponseEntity<Doctor> updateDoctor(@PathVariable("doctorId") long doctorId, @RequestBody Doctor doctor) {
	
		return new ResponseEntity<Doctor>(doctorService.updateDoctor(doctor,doctorId),HttpStatus.OK);
	}
	
	@DeleteMapping("/{doctorId}")
	public ResponseEntity<String> deleteDoctor(@PathVariable("doctorId") long doctorId){
		doctorService.deleteDoctor(doctorId);
		String flag = "removed from database";
		return new ResponseEntity<String>(flag, HttpStatus.OK);
		
	}

}
