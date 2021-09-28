package com.curewell.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	List<Patient> findPatientByPatientName(String patientName);
	Patient findPatientByPatientId(int patientId);
	Patient findPatientByPatientEmailIdAndPatientPassword(String patientEmailId,String patientPassword);
	Patient findPatientByPatientAge(int patientAge);
	Patient findPatientByPatientEmailId(String patientEmailId);
	Patient findPatientBypatientContact(String patientContact);
}
