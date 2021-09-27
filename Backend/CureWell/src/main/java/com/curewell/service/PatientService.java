package com.curewell.service;

import java.util.List;
import com.curewell.model.Patient;

public interface PatientService {
	boolean addPatient(Patient patient);
	boolean deletePatientByPatientId(int patientId);
	boolean updatePatient(Patient patient);
	Patient getPatientByPatientId(int patientId);
	Patient getPatientByPatientEmailId(String patientEmailId);
	Patient getPatientByPatientContact(String patientContact);
	List<Patient> getPatientByPatientName(String patientName);
	List<Patient> getAllPatient();
	boolean isPatientExists(int patientId);
	Patient findPatientByPatientEmailIdAndPatientPassword(String emailId,String patientPassword);
}
