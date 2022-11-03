package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Address;
 
import com.example.springboot.service.AddressService;
 

@RestController
@RequestMapping("/api/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@PostMapping("/saveaddress")
	private ResponseEntity<Address> addAddress(@RequestBody Address address){
		
		try {
		return new ResponseEntity<Address>(addressService.addAddress(address),HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
