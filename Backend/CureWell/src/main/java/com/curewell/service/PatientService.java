package com.curewell.service;

import java.util.List;
import com.curewell.model.Patient;

public interface PatientService {
	
	public boolean addPatient(Patient patient);
	public boolean deletePatientByPatientId(int patientId);
	public boolean updatePatient(Patient patient);
	public Patient getPatientByPatientId(int patientId);
	public List<Patient> getPatientByPatientName(String patientName);
	public List<Patient> getAllPatients();
	public boolean isPatientExists();

}
