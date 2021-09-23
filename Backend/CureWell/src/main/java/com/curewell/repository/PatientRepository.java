package com.curewell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curewell.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	public Patient findPatientByPatientName(String patientName);
	public Patient findPatientByPatientId(String patientId);
	public Patient findPatientByPatientNameAndPatientId(String patientName,int patientId);
	public Patient findPatientByPatientAge(int patientAge);
}
