package com.prodian.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodian.task.exception.EmptyDatabaseException;
import com.prodian.task.model.Student;
import com.prodian.task.service.StudentService;

@RestController
@RequestMapping("/api/student/")
@CrossOrigin
public class StudentController { 

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saving")
	private ResponseEntity<Student> savingStudent(@RequestBody Student student){
	
		try {
		
			return new ResponseEntity<Student>(studentService.savingStudent(student), HttpStatus.CREATED);
			// return new ResponseEntity<String>("Something Fishy",HttpStatus.BAD_REQUEST);
		
		} catch (Exception e) {
		
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		}
	}
	
	@DeleteMapping("/delete/{id}")
	private ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
		try {

			studentService.deleteStudent(id);
			String flag = "Removed from Database";
			return new ResponseEntity<String>(flag, HttpStatus.OK);
		
		} catch (Exception e) {
		
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		}
	}
	
	@GetMapping("/show")
	private List<Student> getAllStudents() throws EmptyDatabaseException{
		 
		return studentService.getAllStudents();
		 
	}
	
}
