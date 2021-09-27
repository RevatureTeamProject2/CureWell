package com.curewell.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curewell.model.Patient;
import com.curewell.repository.PatientRepository;
import com.curewell.service.PatientService;

@Service
public class PatientServiceImpl implements  PatientService {

	
	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public boolean addPatient(Patient patient) {
		patientRepository.save(patient);
		return true;
	}

	@Override
	public boolean deletePatientByPatientId(int patientId) {
		//System.out.println("---delete Patient---");
		patientRepository.deleteById(patientId);
		return true;
	}

	@Override
	public boolean updatePatient(Patient patient) {
		//System.out.println("---Update Patient---");
		patientRepository.save(patient);
		return true;
	}

	@Override
	public Patient getPatientByPatientId(int patientId) {
		//System.out.println("----- patient by id called -Service");
		Patient patient = patientRepository.findPatientByPatientId(patientId);
		//Patient patient =patientData.get();
		return patient;
	}
	
	@Override
	public List<Patient> getPatientByPatientName(String patientName){
		return (List<Patient>) patientRepository.findPatientByPatientName(patientName);

	}
	
	@Override
	public List<Patient> getAllPatient() {
		return (List<Patient>) patientRepository.findAll();
	}

	@Override
	public boolean isPatientExists(int patientId) {
		Patient patientData = patientRepository.findPatientByPatientId(patientId);
		if(patientData!=null) {
			return true;
		}
		return false;
	}

	@Override
	public Patient findPatientByPatientEmailIdAndPatientPassword(String emailId,String patientPassword) {
		Patient patient= null;
		patient=patientRepository.findPatientByPatientEmailIdAndPatientPassword(emailId, patientPassword);
		return patient;
	}

	@Override
	public Patient getPatientByPatientEmailId(String patientEmailId) {
		return patientRepository.findPatientByPatientEmailId(patientEmailId);
	}

	@Override
	public Patient getPatientByPatientContact(String patientContact) {
		return patientRepository.findPatientBypatientContact(patientContact);
	}

	

}
