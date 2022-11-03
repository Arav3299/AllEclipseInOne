package com.prodian.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
import com.prodian.task.model.Student;
import com.prodian.task.service.StudentService;

@RestController
@RequestMapping("/api/rest")
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	private ResponseEntity<Student> savingStudent(@RequestBody Student student){
	
		return studentService.savingStudent(student);
		
	}
	
	@DeleteMapping("/dlt/{id}")
	private ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
		
		studentService.deleteStudent(id);
		String flag = "Removed from Database";
		return new ResponseEntity<String>(flag,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	private ResponseEntity<String> getAllStudents(){
		
		return studentService.getAllStudents();
	
	}
	
}

