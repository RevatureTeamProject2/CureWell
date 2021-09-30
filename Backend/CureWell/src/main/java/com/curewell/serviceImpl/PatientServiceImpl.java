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
	public boolean addPatient(Patient patient)  throws Exception{
		Patient patient2=null;
		patient2=patientRepository.save(patient);
		if(patient2==null)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean deletePatientByPatientId(int patientId)  throws Exception{
		//System.out.println("---delete Patient---");
		patientRepository.deleteById(patientId);
		return true;
	}

	@Override
	public boolean updatePatient(Patient patient) throws Exception {
		Patient patient2=null;
		patient2=patientRepository.save(patient);
		if(patient2==null)
		{
			return false;
		}
		return true;
	}

	@Override
	public Patient getPatientByPatientId(int patientId) throws Exception {
		Patient patient = null;
		patient=patientRepository.findPatientByPatientId(patientId);
		return patient;
	}
	
	@Override
	public List<Patient> getPatientByPatientName(String patientName) {
		List<Patient> patients= patientRepository.findPatientByPatientName(patientName);
		if(patients.size()==0)
		{
			return null;
		}
		return patients;
	}
	
	@Override
	public List<Patient> getAllPatient() {
		List<Patient> patients= patientRepository.findAll();
		if(patients.size()==0)
		{
			return null;
		}
		return patients;
	}

	@Override
	public boolean isPatientExists(int patientId)  throws Exception{
		Patient patientData = patientRepository.findPatientByPatientId(patientId);
		if(patientData!=null) {
			return true;
		}
		return false;
	}

	@Override
	public Patient findPatientByPatientEmailIdAndPatientPassword(String emailId,String patientPassword) throws Exception {
		Patient patient= null;
		patient=patientRepository.findPatientByPatientEmailIdAndPatientPassword(emailId, patientPassword);
		return patient;
	}

	@Override
	public Patient getPatientByPatientEmailId(String patientEmailId) throws Exception {
		Patient patient= null;
		patient=patientRepository.findPatientByPatientEmailId(patientEmailId);
		return patient;
	}

	@Override
	public Patient getPatientByPatientContact(long patientContact) throws Exception {
		Patient patient= null;
		patient= patientRepository.findPatientBypatientContact(patientContact);
		return patient;
	}

	

}
