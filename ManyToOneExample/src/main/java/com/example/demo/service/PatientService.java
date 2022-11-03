package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Patient;

public interface PatientService {

	Patient savePatient(Patient patient, long doctorId);

	Patient updatePatient(Patient patient, long patientId, long doctorId);

	Patient getPatientById(long patientId);

	List<Patient> getAllPatients();

	void deletePatient(long patientId);

	 
}
