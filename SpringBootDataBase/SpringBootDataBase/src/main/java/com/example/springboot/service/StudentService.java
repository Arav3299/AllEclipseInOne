package com.example.springboot.service;

import java.util.List;

import com.example.springboot.dto.StudentInfoDTO;
import com.example.springboot.model.Student;

public interface StudentService {

	Student addStudent(Student student);

	List<Student> getStudents();

	String addStudents(List<Student> students);

	void deleteStudentById(int studentId);

	String updateStudents(List<Student> students);

	List<StudentInfoDTO> get();

}
