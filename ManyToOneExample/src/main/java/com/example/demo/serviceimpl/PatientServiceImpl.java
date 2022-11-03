package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientRepository;
import com.example.demo.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	public PatientRepository patientRepository; 
	
	@Autowired
	public DoctorRepository doctorRepository; 
	
	@Override
	public Patient savePatient(Patient patient,long doctorId) {
		
		patient.setDoctor(doctorRepository.findById(doctorId).get());
		
		return patientRepository.save(patient);
	}

	@Override
	public Patient updatePatient(Patient patient, long patientId,long doctorId) {
		Patient oldPatient = patientRepository.findById(patientId).get();
		oldPatient.setAge(patient.getAge());
		oldPatient.setDoctor(doctorRepository.findById(doctorId).get());
		oldPatient.setFirstName(patient.getFirstName());
		oldPatient.setGender(patient.getGender());
		oldPatient.setLastName(patient.getLastName());
		 patientRepository.save(oldPatient);
		return oldPatient;
	}

	@Override
	public Patient getPatientById(long patientId) {
		
		return patientRepository.findById(patientId).get();
	}

	@Override
	public List<Patient> getAllPatients() {
		 
		return  patientRepository.findAll();
	}

	@Override
	public void deletePatient(long patientId) {
		 
		patientRepository.deleteById(patientId);
		
	}

}
