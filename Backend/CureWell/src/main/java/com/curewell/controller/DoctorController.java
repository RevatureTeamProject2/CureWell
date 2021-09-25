package com.curewell.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.curewell.model.Doctor;
import com.curewell.service.DoctorService;

@RestController

public class DoctorController {
	
	@Autowired
	DoctorService doctorService;

	@PostMapping("/doctor")
	public boolean addDoctor(@RequestBody Doctor doctor) {
		
		return doctorService.addDoctor(doctor);
	}
	
	@DeleteMapping("/doctor/{doctorId}")
	public boolean deleteDoctor(@PathVariable int doctorId) {
		return doctorService.deleteDoctor(doctorId);
	}

	@PutMapping("/doctor")
	public boolean updateDoctor(@RequestBody Doctor doctor) {
		return doctorService.updateDoctor(doctor);
	}
	
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors()
	{
		List<Doctor> doctorList=null;
		doctorList = doctorService.getAllDoctors();
	    return doctorList;
	}
	
	@GetMapping("/doctor/{doctorId}")
	public Doctor getDoctorById(@PathVariable int doctorId)
	{
		return doctorService.getDoctorById(doctorId);
	}

	@GetMapping("/getdoctorbyname/{doctorName}")
	public List<Doctor> getDoctorByDoctorName(@PathVariable String doctorName)
	{
		return doctorService.getDoctorByDoctorName(doctorName);
	
	}
	
	@GetMapping("/getdoctorbyspecialisation/{doctorSpecialisation}")
	public List<Doctor> getDoctorBySpecialisation(@PathVariable String doctorSpecialisation)
	{
		return doctorService.getDoctorSpecialisation(doctorSpecialisation);
		
	}
	
	@GetMapping("/ifdoctorexists")
	public boolean isDoctorExists() {
	return doctorService.isDoctorExists();
	}
	
	@GetMapping("/doctor/login")
	public Doctor loginValidation(@RequestBody Doctor doctor)  {
		Doctor d=new Doctor();
		boolean flag=false;
		d=doctorService.findDoctorByDoctorEmaiId(doctor. getDoctorEmailId());
		if(d.getDoctorPassword().equals(doctor.getDoctorPassword())) {
			flag=true;
		}
		if(flag) {
			return d;
		}else {
			return null;
		}
	}
}

