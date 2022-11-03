package com.example.springboot.dto;

import lombok.Data;

@Data
public class EmployeeAddressDto {

	private int employeeId;
	
	private String firstName;
	
	private String city;
	
	private String street;
	
}
