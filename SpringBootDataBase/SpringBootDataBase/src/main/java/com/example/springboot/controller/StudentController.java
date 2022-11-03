package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dto.StudentInfoDTO;
import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
 

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.addStudent(student),HttpStatus.CREATED);
				
	}
	@PostMapping("/save/multiple")
	public String addStudents(@RequestBody List<Student> students){
		return studentService.addStudents(students);
		
	}
	
	@GetMapping("/show")
	public List<Student> getStudent(){
		return (studentService.getStudents());
		
	}
	
	@DeleteMapping("/{studentId}")
	public ResponseEntity<String> deleteById(@PathVariable("studentId") int studentId){
		studentService.deleteStudentById(studentId);
		String a = "deleted";
		return new ResponseEntity<String>(a,HttpStatus.OK);
		
	}
	@PutMapping("/update/multiple")
	public String updateStudents(@RequestBody List<Student> students){
		return studentService.updateStudents(students);
		
	}
	
	@GetMapping("/showme")
	public List<StudentInfoDTO> get(){
		return (studentService.get());
		
	}
}
