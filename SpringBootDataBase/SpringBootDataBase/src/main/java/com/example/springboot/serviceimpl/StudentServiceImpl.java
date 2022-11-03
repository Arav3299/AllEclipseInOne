package com.example.springboot.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dto.StudentInfoDTO;
import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;
import com.example.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student addStudent(Student student) {

		return studentRepository.save(student);
	}

	public List<Student> getStudents() {

		return studentRepository.findAll();
	}

	public void deleteStudentById(int studentId) {

		studentRepository.deleteById(studentId);
	}

	public String addStudents(List<Student> students) {

		studentRepository.saveAll(students);

		return "success";

	}

	@Override
	public String updateStudents(List<Student> students) {
		
		List<Student> oldOne = studentRepository.findAll();
		
		for(Student old : oldOne) {
			for(Student newOne : students) {
				
				if(old.getStudentId()==newOne.getStudentId()) {
					old.setStudentName(newOne.getStudentName());
					old.setStudentPinno(newOne.getStudentPinno());
					break;
				}
			}
		}
		studentRepository.saveAll(oldOne);
		return "updated";
	}

	@Override
	public List<StudentInfoDTO> get() {
		List<StudentInfoDTO> result = studentRepository.getDetails();
		System.out.println("---result--"+result);
		return result;
	}

}
