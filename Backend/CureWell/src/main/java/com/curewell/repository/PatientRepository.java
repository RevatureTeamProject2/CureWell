package com.curewell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	public Patient findPatientByPatientName(String patientName);
	public Patient findPatientByPatientId(int patientId);
	public Patient findPatientByPatientEmailIdAndPatientPassword(String patientEmailId,String patientPassword);
	public Patient findPatientByPatientAge(int patientAge);
	public Patient findPatientByPatientEmailId(String patientEmailId);
	public Patient findPatientBypatientContact(String patientContact);
}
