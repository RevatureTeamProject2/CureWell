package com.curewell.repo;

import com.curewell.model.Patient;

public interface PatientRepository {
	public Patient findPatientByNameAndId(String patientName,int Id);
	public Patient findPatientByAge(int patientAge);
}
