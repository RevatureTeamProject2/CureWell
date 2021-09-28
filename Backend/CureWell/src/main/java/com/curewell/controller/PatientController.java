package com.curewell.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curewell.service.PatientService;
import com.curewell.model.Patient;

@RestController
@RequestMapping("/patient")
@Validated
public class PatientController {
	@Autowired
	PatientService patientService;
	
	@GetMapping("/getall")
	public List<Patient> getAllPatient() throws Exception{
		List<Patient> listPatient=null;
		listPatient=patientService.getAllPatient();
		if(listPatient==null) {
			throw new NoSuchElementException();
		}
		return listPatient;
	}
	
	@PostMapping("/add")
	public boolean addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);		
	}
	
	@GetMapping("/getbyid/{id}")
	public Patient getPatientrById(@PathVariable int id) throws Exception{
		// TODO Auto-generated method stub
		Patient patient=null;
		patient=patientService.getPatientByPatientId(id);
		if(patient==null) {
			throw new NoSuchElementException();
		}
		return patient;
	}
	
	@GetMapping("/getbymail/{emailId}")
	public Patient getPatientrByEmailId(@PathVariable String emailId) throws Exception{
		Patient patient=null;
		patient= patientService.getPatientByPatientEmailId(emailId);
		if(patient==null) {
			throw new NoSuchElementException();
		}
		return patient;
	}
	
	@GetMapping("/getbycontact/{contactNumber}")
	public Patient getPatientrByContactNumber(@PathVariable long contactNumber) {
		Patient patient=null;
		patient= patientService.getPatientByPatientContact(contactNumber);
		if(patient==null) {
			throw new NoSuchElementException();
		}
		return patient;
	}
	
	
	@PostMapping("/login")
	public Patient patientLogin(@RequestBody Patient patient) {
		Patient patientr=null;
		patientr= patientService.findPatientByPatientEmailIdAndPatientPassword(patient.getPatientEmailId(), patient.getPatientPassword());
		if(patientr==null) {
			throw new NoSuchElementException();
		}
		return patientr;
	}
}
