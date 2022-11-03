package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springboot.dto.StudentInfoDTO;
import com.example.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

	@Query(value=" select s.student_name as studentName,s.student_pinno as studentPinno,a.city as city,a.street as street from student_table s, address_table a",nativeQuery = true)
	List<StudentInfoDTO> getDetails();

	
}
