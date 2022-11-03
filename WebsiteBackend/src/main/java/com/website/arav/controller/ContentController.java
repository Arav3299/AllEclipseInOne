package com.website.arav.controller;

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

import com.website.arav.modal.Content;
import com.website.arav.service.ContentService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/website")
public class ContentController {

	@Autowired
	private ContentService contentService;
	
	@PutMapping("updateOrSave")
	private ResponseEntity<Content> updateOrsave(@RequestBody Content content){
		
		try {
			
			return new ResponseEntity<Content>(contentService.updateOrSave(content),HttpStatus.OK);
			
			
		}catch (Exception e) {
			 
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	
	@GetMapping("getAllData")
	private ResponseEntity<List<Content>> getAllContents(){
		
		try {
			
			return new ResponseEntity<List<Content>>(contentService.getAllContents(),HttpStatus.OK);
			
		}catch (Exception e) {
			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			
		}
		
	}
	
	
}
