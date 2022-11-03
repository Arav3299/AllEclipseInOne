package com.prodian.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.task.modal.Content;
import com.prodian.task.service.ContentService;

@CrossOrigin
@RestController
@RequestMapping("api/news")
public class ContentController {
	
	@Autowired
	private ContentService contentService;

	@GetMapping("/getAllPromotedData")
	private ResponseEntity<List<Content>> getAllPromotedData(){
		
		try {
			
			return new ResponseEntity<List<Content>>(contentService.getAllPromotedData(),HttpStatus.OK);
			
		}catch (Exception e) {
			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			
		}
		
	}
}
