package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Doctor;

public interface DoctorService {

	Doctor saveDoctor(Doctor doctor);

	List<Doctor> getAllDoctors();

	Doctor getDoctorById(long doctorId);

	Doctor updateDoctor(Doctor doctor, long doctorId);

	void deleteDoctor(long doctorId);
 

}
