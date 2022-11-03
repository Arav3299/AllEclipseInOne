package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService {

	
	@Autowired
	public DoctorRepository doctorRepository;
	
	Doctor d = new Doctor(0,"","",0,"");
	
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		 
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(long doctorId) {
		 
		return doctorRepository.findById(doctorId).get();
	}

	@Override
	public Doctor updateDoctor(Doctor doctor, long doctorId) {
		Doctor existingDoctor = doctorRepository.findById(doctorId).get();
		
		existingDoctor.setAge(doctor.getAge());
		 
		existingDoctor.setFirstName(doctor.getFirstName());
		 
		existingDoctor.setLastName(doctor.getLastName());
		existingDoctor.setSpecialization(doctor.getSpecialization());
		
		doctorRepository.save(existingDoctor);
		
		return existingDoctor;
	}

	@Override
	public void deleteDoctor(long doctorId) {
		doctorRepository.deleteById(doctorId);
	}

}
