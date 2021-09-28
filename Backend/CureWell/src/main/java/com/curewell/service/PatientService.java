package com.curewell.service;

import java.util.List;
import com.curewell.model.Patient;

public interface PatientService {
	boolean addPatient(Patient patient) throws Exception;
	boolean deletePatientByPatientId(int patientId) throws Exception;
	boolean updatePatient(Patient patient) throws Exception;
	Patient getPatientByPatientId(int patientId) throws Exception;
	Patient getPatientByPatientEmailId(String patientEmailId) throws Exception;
	Patient getPatientByPatientContact(long patientContact) throws Exception;
	List<Patient> getPatientByPatientName(String patientName) throws Exception;
	List<Patient> getAllPatient() throws Exception;
	boolean isPatientExists(int patientId) throws Exception;
	Patient findPatientByPatientEmailIdAndPatientPassword(String emailId,String patientPassword) throws Exception;
}
