package com.curewell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.curewell.service.PatientService;
import com.curewell.model.Patient;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	PatientService patientService;
	
	@GetMapping("/getall")
	public List<Patient> getAllPatient(){
		return patientService.getAllPatient();
	}
	
	@PostMapping("/add")
	public boolean addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);		
	}
	
	@GetMapping("/getbyid/{id}")
	public Patient getPatientrById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return patientService.getPatientByPatientId(id);
	}
	
	@GetMapping("/getbymail/{emailId}")
	public Patient getPatientrByEmailId(@PathVariable String emailId) {
		// TODO Auto-generated method stub
		return patientService.getPatientByPatientEmailId(emailId);
	}
	
	@GetMapping("/getbycontact/{contactNumber}")
	public Patient getPatientrByContactNumber(@PathVariable String contactNumber) {
		// TODO Auto-generated method stub
		return patientService.getPatientByPatientContact(contactNumber);
	}
	
//	@PostMapping("/getbymail")
//	public Patient getPatientByMailId(@RequestBody String emailId) {
//		return patientService.getPatientByPatientEmailId(emailId);
//	}

//	@GetMapping("/login/{emailid}/{password}")
//	public Patient patientLogin(@PathVariable String emailId,@PathVariable String password) {
//		return patientService.findPatientByPatientEmailIdAndPatientPassword(emailId, password);
//	}
	
	
	@PostMapping("/login")
	public Patient patientLogin(@RequestBody Patient patient) {
		return patientService.findPatientByPatientEmailIdAndPatientPassword(patient.getPatientEmailId(), patient.getPatientPassword());
	}
}
