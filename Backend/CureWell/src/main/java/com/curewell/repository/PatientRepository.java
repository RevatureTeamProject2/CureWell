package com.curewell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	Patient findPatientByPatientName(String patientName);
	Patient findPatientByPatientId(int patientId);
	Patient findPatientByPatientEmailIdAndPatientPassword(String patientEmailId,String patientPassword);
	Patient findPatientByPatientAge(int patientAge);
	Patient findPatientByPatientEmailId(String patientEmailId);
	Patient findPatientBypatientContact(String patientContact);
}
