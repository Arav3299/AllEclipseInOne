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

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

	@Autowired
	public PatientService patientService;
	
	@PostMapping("/register/{doctorId}")
	public ResponseEntity<Patient> savePatient(@PathVariable("doctorId") long doctorId,@RequestBody Patient patient){
		
		System.out.println("Patient Registration Succesfull "+patient);
		
		return new ResponseEntity<Patient>(patientService.savePatient(patient,doctorId),HttpStatus.CREATED);
	}
	
	@PutMapping("/{patientId}/{doctorId}")
	public ResponseEntity<Patient> updatePatient(@PathVariable("doctorId") long doctorId,@PathVariable("patientId") long patientId, @RequestBody Patient patient) {
	
		return new ResponseEntity<Patient>(patientService.updatePatient(patient,patientId,doctorId),HttpStatus.OK);
	}
	
	@GetMapping("{patientId}")
	public ResponseEntity<Patient> getPatientById(@PathVariable("patientId") long patientId){
		
		return new ResponseEntity<Patient>(patientService.getPatientById(patientId),HttpStatus.OK);
	}
	
	@GetMapping("/getallpatients")
	public List<Patient> getAllPatients(){
		return patientService.getAllPatients();
	}
	
	@DeleteMapping("/{patientId}")
	public ResponseEntity<Boolean> deletePatient(@PathVariable("patientId") long patientId){
		patientService.deletePatient(patientId);
		boolean flag = true;
		return new ResponseEntity<Boolean>(flag, HttpStatus.OK);
		
		
	}
}
