package com.curewell.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curewell.model.Doctor;
import com.curewell.model.Patient;
import com.curewell.repository.PatientRepository;
import com.curewell.service.PatientService;

@Service
public class PatientServiceImpl implements  PatientService {

	
	@Autowired
	PatientRepository patientRepository;
	
	@Transactional
	@Override
	public boolean addPatient(Patient patient) {
		patientRepository.save(patient);
		return true;
	}

	@Transactional
	@Override
	public boolean deletePatientByPatientId(int patientId) {
		System.out.println("---delete Patient---");
		patientRepository.deleteById(patientId);
		return true;
	}

	@Transactional
	@Override
	public boolean updatePatient(Patient patient) {
		System.out.println("---Update Patient---");
		patientRepository.save(patient);
		return true;
	}

	@Transactional
	@Override
	public Patient getPatientByPatientId(int patientId) {
		System.out.println("----- patient by id called -Service");
		Optional<Patient> patientData = patientRepository.findById(patientId);
		Patient patient =patientData.get();
		return patient;
	}
	
	@Transactional
	@Override
	public List<Patient> getPatientByPatientName(String patientName){
		return (List<Patient>) patientRepository.findPatientByPatientName(patientName);

	}
	
	@Transactional
	@Override
	public List<Patient> getAllPatient() {
		return (List<Patient>) patientRepository.findAll();
	}

	@Transactional
	@Override
	public boolean isPatientExists(int patientId) {
		Optional<Patient> patientData = patientRepository.findById(patientId);
		return patientData.isPresent();
	}

	@Transactional
	@Override
	public Patient findPatientByPatientNameAndPatientId(String patientName,int patientId) {
		Patient patient= patientRepository.findPatientByPatientNameAndPatientId(patientName, patientId);
		return patient;
	}

	

}
