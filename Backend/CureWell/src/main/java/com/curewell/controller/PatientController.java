package com.curewell.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.curewell.model.Patient;
import com.curewell.service.PatientService;

@RestController
public class PatientController {
	
	
	@Autowired
	PatientService patientService;
	
	@PostMapping("/patient")
	public boolean addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}
	
	@DeleteMapping("/patient/{patientId}")
	public boolean deletePatientBypatientId(@PathVariable int patientId) {
		
		return patientService.deletePatientByPatientId(patientId);
	}

	@PutMapping("/update")
	public boolean updatePatient(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}
	
	@GetMapping("/getallpatients")
	public List<Patient> getAllPatients()
	{
		List<Patient> patientList=null;
		patientList = patientService.getAllPatients();
	    return patientList;
	}
	
	@GetMapping("/getpatientbyid/{patientId}")
	public Patient getPatientByPatientId(@PathVariable int patientId)
	{
		return patientService.getPatientByPatientId(patientId);
	}


	@GetMapping("/getbyname/{patientName}")
	public List<Patient> getPatientByPatientName(@PathVariable String patientName) {
		return patientService.getPatientByPatientName(patientName);
	}

	@GetMapping("/ifpatientexists")
	public boolean isPatientExists() {
		return patientService.isPatientExists();
	}
	
	
}
