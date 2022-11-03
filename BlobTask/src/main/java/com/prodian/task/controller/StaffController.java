package com.prodian.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.task.modal.ResultResponse;
import com.prodian.task.modal.Staff;
import com.prodian.task.service.StaffService;

@CrossOrigin
@RestController
@RequestMapping("api/blob")
public class StaffController {

	
	@Autowired
	private StaffService staffService;
	
	
	@PutMapping("/updateOrInsertStaff")
	private ResponseEntity<Staff> updateOrInsertStaff(@RequestBody Staff staff){
		
		try {
			
			return new ResponseEntity<Staff>(staffService.updateOrInsertStaff(staff),HttpStatus.OK);
			
		}catch(Exception ex) {
			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			
		}
		
		
	}
	
	@GetMapping("getAllStaffDetails")
	private ResultResponse getStaffDetails(){
	 
			
			return (staffService.getAllStaffDetails());
			
		
		
		
	}
	
	
}
