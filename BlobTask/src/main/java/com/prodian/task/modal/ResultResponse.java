package com.prodian.task.modal;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ResultResponse {

	
	private Object data;
	
	private String status;
	
	private HttpStatus code;
	
	
}
