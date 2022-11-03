package com.prodian.task.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prodian.task.model.Student;

@Service
public class StudentService {

	RestTemplate rs = new RestTemplate();
	
	public String generateRandomStudentId() {
		
		class Inside {
			
			static int one = 1000;

			int increment() {
			 	return one++;
			}
		}
		 
		String two = "S";
		Inside i = new Inside();
		String three = String.format("%05d",i.increment());
			 
		return two+three;
	}
	
	public ResponseEntity<Student> savingStudent(Student student) {
		
		String url = "http://localhost:8000/api/student/saving";
		
		if(student.getStudentId().equals("")) {
			System.out.println("11111111111111111111111111111");
			student.setStudentId(generateRandomStudentId());
		}
		
		 return rs.postForEntity(url,student,Student.class);	 	
		
		
		 
	}

	public void deleteStudent(long id) {
		 
		String url = "http://localhost:8000/api/student/delete/{id}";
		
		Map<String,Long> param = new HashMap<>();
		
		param.put("id",id);
		
		rs.delete(url, param);
		
	}

	public ResponseEntity<String> getAllStudents() {
		
		String url = "http://localhost:8000/api/student/show";
		
		
		return rs.getForEntity(url,String.class);
	}

}
