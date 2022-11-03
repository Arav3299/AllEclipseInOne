package com.example.springboot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;




public interface StudentInfoDTO {
	
	@JsonProperty("student_name")
	public String getstudentName();
	
	@JsonProperty("student_pinno")
	public String getstudentPinno();
 
	@JsonProperty("city")
	public String getcity();

	@JsonProperty("street")
	public String getstreet();

}
